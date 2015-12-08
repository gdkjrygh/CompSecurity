// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Movie;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import com.skype.Conversation;
import com.skype.MediaDocument;
import com.skype.MediaDocumentImpl;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.concurrent.CompletedAsyncResult;
import com.skype.android.concurrent.ListenableCompletableFuture;
import com.skype.android.config.FileUtil;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.ImageCache;
import java.io.File;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.app.media:
//            MediaLinkSaveError, MediaLinkProfile, UrlPreviewMediaAgent, MediaDocumentUrlPreviewObserver

public class MediaDocumentDownloadUtil
{
    public static class GetMediaLinkResult
    {

        private boolean isFromNetwork;
        private Object media;
        private com.skype.MediaDocument.MEDIA_STATUS status;

        public Object getMedia()
        {
            return media;
        }

        public com.skype.MediaDocument.MEDIA_STATUS getStatus()
        {
            return status;
        }

        public boolean isFromNetwork()
        {
            return isFromNetwork;
        }

        public void setMedia(Object obj)
        {
            media = obj;
        }

        public void setNetworkStatus(boolean flag)
        {
            isFromNetwork = flag;
        }

        public void setStatus(com.skype.MediaDocument.MEDIA_STATUS media_status)
        {
            status = media_status;
        }

        public GetMediaLinkResult()
        {
            isFromNetwork = false;
        }

        public GetMediaLinkResult(Object obj, com.skype.MediaDocument.MEDIA_STATUS media_status)
        {
            isFromNetwork = false;
            media = obj;
            status = media_status;
        }
    }

    public static class TelemetryUrlPreviewFuture extends ListenableCompletableFuture
    {

        static int uiCacheDownloadCount = 0;
        long startTime;

        public static void reportUiCacheCount(Analytics analytics)
        {
            if (uiCacheDownloadCount != 0)
            {
                AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
                analyticsparametercontainer.a(AnalyticsParameter.M, Integer.valueOf(uiCacheDownloadCount));
                uiCacheDownloadCount = 0;
                analytics.a(AnalyticsEvent.cW, analyticsparametercontainer);
            }
        }

        public void incrementUiCacheDownload()
        {
            uiCacheDownloadCount++;
        }

        public void reportEvents(AnalyticsEvent analyticsevent, String s, String s1, String s2, String s3, String s4, Analytics analytics)
        {
            AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
            analyticsparametercontainer.a(AnalyticsParameter.m, s);
            analyticsparametercontainer.a(AnalyticsParameter.I, s1);
            s = AnalyticsParameter.J;
            boolean flag;
            if (!TextUtils.isEmpty(s2))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            analyticsparametercontainer.a(s, String.valueOf(flag));
            analyticsparametercontainer.a(AnalyticsParameter.K, s3);
            analyticsparametercontainer.a(AnalyticsParameter.L, s4);
            analyticsparametercontainer.a(AnalyticsParameter.s, Analytics.g(System.currentTimeMillis() - startTime));
            analytics.a(analyticsevent, analyticsparametercontainer);
        }

        protected void startTelemetry(long l)
        {
            startTime = l;
        }


        public TelemetryUrlPreviewFuture()
        {
        }
    }

    public static class UrlPreviewResult
    {

        private GetMediaLinkResult avatar;
        private String description;
        private GetMediaLinkResult favicon;
        private boolean isDownloadedFromNetwork;
        private MediaDocument mediaDocument;
        private String mimeType;
        private String title;
        private UrlPreviewType type;
        private GetMediaLinkResult urlMedia;
        private String userHandle;
        private String username;

        public GetMediaLinkResult getAvatar()
        {
            return avatar;
        }

        public String getDescription()
        {
            return description;
        }

        public GetMediaLinkResult getFavicon()
        {
            return favicon;
        }

        public MediaDocument getMediaDocument()
        {
            return mediaDocument;
        }

        public String getMimeType()
        {
            return mimeType;
        }

        public String getTitle()
        {
            return title;
        }

        public UrlPreviewType getType()
        {
            return type;
        }

        public GetMediaLinkResult getUrlMedia()
        {
            return urlMedia;
        }

        public String getUserHandle()
        {
            return userHandle;
        }

        public String getUsername()
        {
            return username;
        }

        public boolean isDownloadedFromNetwork()
        {
            return isDownloadedFromNetwork;
        }

        private UrlPreviewResult(MediaDocument mediadocument, GetMediaLinkResult getmedialinkresult, GetMediaLinkResult getmedialinkresult1, GetMediaLinkResult getmedialinkresult2, String s, String s1, UrlPreviewType urlpreviewtype, 
                String s2, String s3, String s4, boolean flag)
        {
            mediaDocument = mediadocument;
            favicon = getmedialinkresult;
            urlMedia = getmedialinkresult1;
            type = urlpreviewtype;
            mimeType = s2;
            title = s3;
            description = s4;
            avatar = getmedialinkresult2;
            username = s;
            userHandle = s1;
            isDownloadedFromNetwork = flag;
        }

    }

    public static class UrlPreviewResult.Builder
    {

        private GetMediaLinkResult avatar;
        private String description;
        private GetMediaLinkResult favicon;
        private boolean isDownloadedFromNetwork;
        private MediaDocument mediaDocument;
        private String mimeType;
        private GetMediaLinkResult thumbnail;
        private String title;
        private UrlPreviewType type;
        private String userHandle;
        private String username;

        public UrlPreviewResult create()
        {
            return new UrlPreviewResult(mediaDocument, favicon, thumbnail, avatar, username, userHandle, type, mimeType, title, description, isDownloadedFromNetwork);
        }

        public UrlPreviewResult.Builder setAvatar(GetMediaLinkResult getmedialinkresult)
        {
            avatar = getmedialinkresult;
            return this;
        }

        public UrlPreviewResult.Builder setDescription(String s)
        {
            description = s;
            return this;
        }

        public UrlPreviewResult.Builder setFavicon(GetMediaLinkResult getmedialinkresult)
        {
            favicon = getmedialinkresult;
            return this;
        }

        public UrlPreviewResult.Builder setIsDownloadedFromNetwork(boolean flag)
        {
            isDownloadedFromNetwork = flag;
            return this;
        }

        public UrlPreviewResult.Builder setMediaDocument(MediaDocument mediadocument)
        {
            mediaDocument = mediadocument;
            return this;
        }

        public UrlPreviewResult.Builder setMimeType(String s)
        {
            mimeType = s;
            return this;
        }

        public UrlPreviewResult.Builder setThumbnail(GetMediaLinkResult getmedialinkresult)
        {
            thumbnail = getmedialinkresult;
            return this;
        }

        public UrlPreviewResult.Builder setTitle(String s)
        {
            title = s;
            return this;
        }

        public UrlPreviewResult.Builder setType(UrlPreviewType urlpreviewtype)
        {
            type = urlpreviewtype;
            return this;
        }

        public UrlPreviewResult.Builder setUserHandle(String s)
        {
            userHandle = s;
            return this;
        }

        public UrlPreviewResult.Builder setUsername(String s)
        {
            username = s;
            return this;
        }

        public UrlPreviewResult.Builder()
        {
        }
    }

    public static final class UrlPreviewType extends Enum
    {

        private static final UrlPreviewType $VALUES[];
        public static final UrlPreviewType GENERIC;
        public static final UrlPreviewType GIF;
        public static final UrlPreviewType IMAGE;
        public static final UrlPreviewType SHARING;
        public static final UrlPreviewType TWEET;
        public static final UrlPreviewType UNKNOWN;
        public static final UrlPreviewType VIDEO;
        private final String mimeType;
        private final String typeId;

        public static UrlPreviewType fromString(String s)
        {
            if (s != null)
            {
                UrlPreviewType aurlpreviewtype[] = values();
                int j = aurlpreviewtype.length;
                for (int i = 0; i < j; i++)
                {
                    UrlPreviewType urlpreviewtype = aurlpreviewtype[i];
                    if (s.matches(urlpreviewtype.typeId))
                    {
                        return urlpreviewtype;
                    }
                }

            }
            return UNKNOWN;
        }

        public static UrlPreviewType fromString(String s, String s1)
        {
            UrlPreviewType urlpreviewtype;
            urlpreviewtype = fromString(s);
            s = urlpreviewtype;
            if (urlpreviewtype != GENERIC) goto _L2; else goto _L1
_L1:
            if (s1 == null)
            {
                return urlpreviewtype;
            }
            if (!s1.matches("(?i)image/gif")) goto _L4; else goto _L3
_L3:
            s = GIF;
_L2:
            return s;
_L4:
            s = urlpreviewtype;
            if (s1.matches("(?i)image/.*$"))
            {
                s = IMAGE;
            }
            if (true) goto _L2; else goto _L5
_L5:
        }

        public static UrlPreviewType valueOf(String s)
        {
            return (UrlPreviewType)Enum.valueOf(com/skype/android/app/media/MediaDocumentDownloadUtil$UrlPreviewType, s);
        }

        public static UrlPreviewType[] values()
        {
            return (UrlPreviewType[])$VALUES.clone();
        }

        public final String getMimeType()
        {
            return mimeType;
        }

        static 
        {
            GENERIC = new UrlPreviewType("GENERIC", 0, "UrlPreview\\.\\d+/generic", ".*");
            GIF = new UrlPreviewType("GIF", 1, "UrlPreview\\.\\d+/generic", "(?i)image/gif");
            IMAGE = new UrlPreviewType("IMAGE", 2, "UrlPreview\\.\\d+/generic", "(?i)image/.*$");
            VIDEO = new UrlPreviewType("VIDEO", 3, "UrlPreview\\.\\d+/video", ".*");
            TWEET = new UrlPreviewType("TWEET", 4, "UrlPreview\\.\\d+/tweet", ".*");
            SHARING = new UrlPreviewType("SHARING", 5, "UrlPreview\\.\\d+/sharing", ".*");
            UNKNOWN = new UrlPreviewType("UNKNOWN", 6, ".*", ".*");
            $VALUES = (new UrlPreviewType[] {
                GENERIC, GIF, IMAGE, VIDEO, TWEET, SHARING, UNKNOWN
            });
        }

        private UrlPreviewType(String s, int i, String s1, String s2)
        {
            super(s, i);
            typeId = s1;
            mimeType = s2;
        }
    }

    private final class a
        implements MediaDocumentUrlPreviewObserver
    {

        private final MediaDocument mediaDocument;
        final MediaDocumentDownloadUtil this$0;
        private b urlPreviewFuture;

        public final void documentProfileUpdated(MediaDocument mediadocument, MediaLinkProfile medialinkprofile, com.skype.MediaDocument.MEDIA_STATUS media_status)
        {
            static final class _cls8
            {

                static final int $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[];
                static final int $SwitchMap$com$skype$android$app$media$MediaLinkProfile[];

                static 
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS = new int[com.skype.MediaDocument.MEDIA_STATUS.values().length];
                    try
                    {
                        $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_BAD_CONTENT.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_NOT_AVAILABLE.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    $SwitchMap$com$skype$android$app$media$MediaLinkProfile = new int[MediaLinkProfile.values().length];
                    try
                    {
                        $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.IMG_PROFILE.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.THUMBNAIL_PROFILE.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.GROUP_AVATAR_PROFILE.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.FAVICON_PROFILE.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls8..SwitchMap.com.skype.MediaDocument.MEDIA_STATUS[media_status.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                mediadocument = getMediaIdentity(mediaDocument, medialinkprofile);
                UrlPreviewType urlpreviewtype = UrlPreviewType.fromString(mediaDocument.getTypeProp(), mediaDocument.getMimeTypeProp());
                Bitmap bitmap1 = imageCache.a(mediadocument);
                String s = mediaDocument.getMediaLink(medialinkprofile.toString()).m_path;
                GetMediaLinkResult getmedialinkresult;
                if (bitmap1 == null)
                {
                    Bitmap bitmap = decodeReasonablySizedBitmap(s, medialinkprofile, mediaDocument.getDocTypeProp());
                    Bitmap bitmap2 = bitmap;
                    bitmap1 = bitmap;
                    mediadocument = bitmap2;
                    if (urlpreviewtype == UrlPreviewType.GIF)
                    {
                        Movie movie = Movie.decodeFile(s);
                        bitmap1 = bitmap;
                        mediadocument = bitmap2;
                        if (movie != null)
                        {
                            bitmap1 = bitmap;
                            mediadocument = bitmap2;
                            if (movie.duration() > 0)
                            {
                                bitmap1 = bitmap;
                                mediadocument = bitmap2;
                                if (movie.width() > 0)
                                {
                                    bitmap1 = bitmap;
                                    mediadocument = bitmap2;
                                    if (movie.height() > 0)
                                    {
                                        mediadocument = movie;
                                        bitmap1 = bitmap;
                                    }
                                }
                            }
                        }
                    }
                } else
                {
                    mediadocument = bitmap1;
                }
                if (bitmap1 != null)
                {
                    imageCache.a(getMediaIdentity(mediaDocument, medialinkprofile), bitmap1);
                }
                if (mediadocument == null)
                {
                    media_status = com.skype.MediaDocument.MEDIA_STATUS.MEDIA_NOT_AVAILABLE;
                    putUnavailableMedia(mediaDocument.getObjectID(), medialinkprofile, media_status);
                }
                getmedialinkresult = new GetMediaLinkResult();
                getmedialinkresult.setMedia(mediadocument);
                getmedialinkresult.setStatus(media_status);
                getmedialinkresult.setNetworkStatus(true);
                urlPreviewFuture.setProfileResult(medialinkprofile, getmedialinkresult);
                return;

            case 2: // '\002'
            case 3: // '\003'
                GetMediaLinkResult getmedialinkresult1 = new GetMediaLinkResult();
                getmedialinkresult1.setStatus(media_status);
                getmedialinkresult1.setNetworkStatus(true);
                putUnavailableMedia(mediadocument.getObjectID(), medialinkprofile, media_status);
                urlPreviewFuture.setProfileResult(medialinkprofile, getmedialinkresult1);
                return;
            }
        }

        public a(MediaDocument mediadocument, b b1)
        {
            this$0 = MediaDocumentDownloadUtil.this;
            super();
            mediaDocument = mediadocument;
            urlPreviewFuture = b1;
        }
    }

    private final class b extends TelemetryUrlPreviewFuture
    {

        public static final int EXPECTED_RESULTS = 3;
        private final MediaDocument mediaDocument;
        private Map profileObservers;
        private Map profileResults;
        final MediaDocumentDownloadUtil this$0;

        private void removeObservers()
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = profileObservers.entrySet().iterator(); iterator.hasNext(); urlPreviewMediaAgent.removeUrlPreviewDocumentObserver(mediaDocument.getObjectID(), (MediaLinkProfile)entry.getKey(), (MediaDocumentUrlPreviewObserver)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            profileObservers.clear();
        }

        public final boolean cancel(boolean flag)
        {
            removeObservers();
            return super.cancel(flag);
        }

        public final void fetchMediaProfile(MediaLinkProfile medialinkprofile)
        {
            fetchMediaProfile(medialinkprofile, UrlPreviewType.GENERIC);
        }

        public final void fetchMediaProfile(MediaLinkProfile medialinkprofile, UrlPreviewType urlpreviewtype)
        {
            com.skype.MediaDocument.MEDIA_STATUS media_status;
label0:
            {
                com.skype.MediaDocument.GetMediaLink_Result getmedialink_result = mediaDocument.getMediaLink(medialinkprofile.toString());
                if (getmedialink_result.m_return != com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADING)
                {
                    media_status = getmedialink_result.m_return;
                    if (media_status != com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
                    {
                        break label0;
                    }
                    if (Thread.interrupted())
                    {
                        throw new RuntimeException(new InterruptedException("Thread has been interrupted"));
                    }
                    Object obj = getMediaIdentity(mediaDocument, medialinkprofile);
                    Bitmap bitmap1 = imageCache.a(((String) (obj)));
                    GetMediaLinkResult getmedialinkresult;
                    if (bitmap1 == null)
                    {
                        Bitmap bitmap = decodeReasonablySizedBitmap(getmedialink_result.m_path, medialinkprofile, mediaDocument.getDocTypeProp());
                        Bitmap bitmap2 = bitmap;
                        bitmap1 = bitmap;
                        obj = bitmap2;
                        if (urlpreviewtype == UrlPreviewType.GIF)
                        {
                            urlpreviewtype = Movie.decodeFile(getmedialink_result.m_path);
                            bitmap1 = bitmap;
                            obj = bitmap2;
                            if (urlpreviewtype != null)
                            {
                                bitmap1 = bitmap;
                                obj = bitmap2;
                                if (urlpreviewtype.duration() > 0)
                                {
                                    bitmap1 = bitmap;
                                    obj = bitmap2;
                                    if (urlpreviewtype.width() > 0)
                                    {
                                        bitmap1 = bitmap;
                                        obj = bitmap2;
                                        if (urlpreviewtype.height() > 0)
                                        {
                                            obj = urlpreviewtype;
                                            bitmap1 = bitmap;
                                        }
                                    }
                                }
                            }
                        }
                    } else
                    {
                        obj = bitmap1;
                    }
                    if (bitmap1 != null)
                    {
                        imageCache.a(getMediaIdentity(mediaDocument, medialinkprofile), bitmap1);
                    }
                    urlpreviewtype = media_status;
                    if (obj == null)
                    {
                        urlpreviewtype = com.skype.MediaDocument.MEDIA_STATUS.MEDIA_NOT_AVAILABLE;
                        putUnavailableMedia(mediaDocument.getObjectID(), medialinkprofile, urlpreviewtype);
                    }
                    getmedialinkresult = new GetMediaLinkResult();
                    getmedialinkresult.setMedia(obj);
                    getmedialinkresult.setStatus(urlpreviewtype);
                    setProfileResult(medialinkprofile, getmedialinkresult);
                }
                return;
            }
            putUnavailableMedia(mediaDocument.getObjectID(), medialinkprofile, media_status);
            urlpreviewtype = new GetMediaLinkResult();
            urlpreviewtype.setMedia(null);
            urlpreviewtype.setStatus(media_status);
            setProfileResult(medialinkprofile, urlpreviewtype);
        }

        public final void registerObserver(MediaLinkProfile medialinkprofile, a a1)
        {
            urlPreviewMediaAgent.addUrlPreviewDocumentObserver(mediaDocument.getObjectID(), medialinkprofile, a1);
            profileObservers.put(medialinkprofile, a1);
        }

        public final void setProfileResult(MediaLinkProfile medialinkprofile, GetMediaLinkResult getmedialinkresult)
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = false;
            Object obj = profileResults.get(medialinkprofile);
            if (obj == null) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            urlPreviewMediaAgent.removeUrlPreviewDocumentObserver(mediaDocument.getObjectID(), medialinkprofile, (MediaDocumentUrlPreviewObserver)profileObservers.get(medialinkprofile));
            profileObservers.remove(medialinkprofile);
            profileResults.put(medialinkprofile, getmedialinkresult);
            if (getmedialinkresult.isFromNetwork())
            {
                flag = true;
            }
            if (profileResults.size() == 3 && !isCancelled())
            {
                medialinkprofile = (new UrlPreviewResult.Builder()).setMediaDocument(mediaDocument).setFavicon((GetMediaLinkResult)profileResults.get(MediaLinkProfile.FAVICON_PROFILE)).setThumbnail((GetMediaLinkResult)profileResults.get(MediaLinkProfile.THUMBNAIL_PROFILE)).setAvatar((GetMediaLinkResult)profileResults.get(MediaLinkProfile.IMG_PROFILE)).setUsername(null).setUserHandle(null).setType(UrlPreviewType.fromString(mediaDocument.getTypeProp(), mediaDocument.getMimeTypeProp())).setMimeType(mediaDocument.getMimeTypeProp()).setTitle(mediaDocument.getTitleProp()).setDescription(mediaDocument.getDescriptionProp()).setIsDownloadedFromNetwork(flag).create();
                urlPreviewMediaAgent.postUrlPreviewResultEvent(this, medialinkprofile);
            }
            if (true) goto _L1; else goto _L3
_L3:
            medialinkprofile;
            throw medialinkprofile;
        }

        public b(MediaDocument mediadocument)
        {
            this$0 = MediaDocumentDownloadUtil.this;
            super();
            profileObservers = new ConcurrentHashMap();
            profileResults = new HashMap();
            mediaDocument = mediadocument;
        }
    }


    public static final String DEFAULT_GROUP_AVATAR = "0";
    private static final int MAX_IMAGE_DIMENSION = 1024;
    private static final String MIME_TYPE_ANY = ".*";
    private static final String MIME_TYPE_GIF = "(?i)image/gif";
    private static final String MIME_TYPE_IMAGE = "(?i)image/.*$";
    private AsyncService async;
    private Context context;
    private HttpUtil httpUtil;
    private ImageCache imageCache;
    private SkyLib lib;
    private ObjectIdMap map;
    private Map unavailableMedia;
    private UrlPreviewMediaAgent urlPreviewMediaAgent;

    public MediaDocumentDownloadUtil(Application application, AsyncService asyncservice, HttpUtil httputil, ImageCache imagecache, ObjectIdMap objectidmap, SkyLib skylib, UrlPreviewMediaAgent urlpreviewmediaagent)
    {
        context = application;
        async = asyncservice;
        httpUtil = httputil;
        lib = skylib;
        unavailableMedia = new ConcurrentSkipListMap(new Comparator() {

            final MediaDocumentDownloadUtil this$0;

            public final int compare(Pair pair, Pair pair1)
            {
                int i = ((Integer)pair.first).intValue();
                int j = ((Integer)pair1.first).intValue();
                if (i != j)
                {
                    return i - j;
                } else
                {
                    return ((MediaLinkProfile)pair.second).ordinal() - ((MediaLinkProfile)pair1.second).ordinal();
                }
            }

            public final volatile int compare(Object obj, Object obj1)
            {
                return compare((Pair)obj, (Pair)obj1);
            }

            
            {
                this$0 = MediaDocumentDownloadUtil.this;
                super();
            }
        });
        imageCache = imagecache;
        map = objectidmap;
        urlPreviewMediaAgent = urlpreviewmediaagent;
    }

    private boolean checkForMountedExternalStorage()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    private MediaLinkSaveError copyMediaToGallery(MediaDocument mediadocument, String s)
    {
        File file;
        MediaLinkSaveError medialinksaveerror;
        if (mediadocument.getDocTypeProp() == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_VIDEO)
        {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
        } else
        {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        }
        medialinksaveerror = FileUtil.canSaveMediaUnderGallery(file);
        if (medialinksaveerror != MediaLinkSaveError.NONE)
        {
            return medialinksaveerror;
        }
        s = new File(s);
        if (!s.exists())
        {
            return MediaLinkSaveError.UNKNOWN_ERROR;
        }
        if (!FileUtil.checkForStorageAvailability(Environment.getExternalStorageDirectory().getPath(), s.length()))
        {
            return MediaLinkSaveError.OUT_OF_MEMORY;
        }
        if (mediadocument.getDocTypeProp() == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_VIDEO)
        {
            mediadocument = FileUtil.createFileForVideoSave(file.getPath(), mediadocument.getOriginalNameProp());
        } else
        {
            mediadocument = FileUtil.createFileForPhotoSave(file.getPath(), mediadocument.getOriginalNameProp());
        }
        return FileUtil.copyFileToGallery(s, mediadocument, context);
    }

    private Bitmap decodeReasonablySizedBitmap(String s, MediaLinkProfile medialinkprofile, com.skype.MediaDocument.DOCUMENT_TYPE document_type)
    {
        android.graphics.BitmapFactory.Options options;
        int l;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, options);
        l = options.outWidth;
        _cls8..SwitchMap.com.skype.android.app.media.MediaLinkProfile[medialinkprofile.ordinal()];
        JVM INSTR tableswitch 1 4: default 68
    //                   1 109
    //                   2 68
    //                   3 184
    //                   4 202;
           goto _L1 _L2 _L1 _L3 _L4
_L1:
        int i = 1024;
_L6:
        int k;
        k = 1;
        int j = 1;
        if (l > i)
        {
            do
            {
                k = j;
                if (l / j <= i)
                {
                    break;
                }
                j *= 2;
            } while (true);
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (document_type.equals(com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_URL_PREVIEW))
        {
            if (l > options.outHeight)
            {
                i = 0x7f0c00fb;
            } else
            {
                i = 0x7f0c00fa;
            }
        } else
        if (l > options.outHeight)
        {
            i = 0x7f0c00b4;
        } else
        {
            i = 0x7f0c00b2;
        }
        i = context.getResources().getDimensionPixelSize(i);
        continue; /* Loop/switch isn't completed */
_L3:
        i = context.getResources().getDimensionPixelSize(0x7f0c00ae);
        continue; /* Loop/switch isn't completed */
_L4:
        i = options.outHeight;
        i = context.getResources().getDimensionPixelSize(0x7f0c0239);
        if (true) goto _L6; else goto _L5
_L5:
        options.inJustDecodeBounds = false;
        options.inSampleSize = k;
        return BitmapFactory.decodeFile(s, options);
    }

    private GetMediaLinkResult getCachedResult(MediaDocument mediadocument, MediaLinkProfile medialinkprofile)
    {
        Object obj = getMediaIdentity(mediadocument, medialinkprofile);
        obj = imageCache.a(((String) (obj)));
        if (obj != null)
        {
            mediadocument = com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED;
        } else
        {
            mediadocument = getUnavailableMediaStatus(mediadocument.getObjectID(), medialinkprofile);
        }
        if (obj != null || mediadocument != null)
        {
            return new GetMediaLinkResult(obj, mediadocument);
        } else
        {
            return null;
        }
    }

    private Future getCloudGroupAvatar(final MediaDocument mediaAvatar, Object obj, AsyncCallback asynccallback, final String cacheIdentity, final long cacheTimestamp)
    {
        Future future = imageCache.a(cacheIdentity, cacheTimestamp, obj, asynccallback);
        if (future != null)
        {
            return future;
        }
        imageCache.b(cacheIdentity);
        if (isUnavailableMedia(mediaAvatar, MediaLinkProfile.GROUP_AVATAR_PROFILE) && !isMediaLoadedInCache(mediaAvatar, MediaLinkProfile.GROUP_AVATAR_PROFILE))
        {
            if (asynccallback != null)
            {
                asynccallback.done(new CompletedAsyncResult(null, obj));
            }
            return null;
        } else
        {
            mediaAvatar = new Callable() {

                final MediaDocumentDownloadUtil this$0;
                final String val$cacheIdentity;
                final long val$cacheTimestamp;
                final MediaDocument val$mediaAvatar;

                public final Bitmap call()
                    throws Exception
                {
                    Object obj1 = mediaAvatar.getMediaLink(MediaLinkProfile.GROUP_AVATAR_PROFILE.toString());
                    if (((com.skype.MediaDocument.GetMediaLink_Result) (obj1)).m_return != com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
                    {
                        putUnavailableMedia(mediaAvatar.getObjectID(), MediaLinkProfile.GROUP_AVATAR_PROFILE, ((com.skype.MediaDocument.GetMediaLink_Result) (obj1)).m_return);
                        return null;
                    }
                    removeUnavailableMedia(mediaAvatar.getObjectID(), MediaLinkProfile.GROUP_AVATAR_PROFILE);
                    Bitmap bitmap = null;
                    try
                    {
                        obj1 = decodeReasonablySizedBitmap(((com.skype.MediaDocument.GetMediaLink_Result) (obj1)).m_path, MediaLinkProfile.GROUP_AVATAR_PROFILE, mediaAvatar.getDocTypeProp());
                    }
                    catch (Exception exception)
                    {
                        exception.printStackTrace();
                        return bitmap;
                    }
                    bitmap = ((Bitmap) (obj1));
                    imageCache.a(cacheIdentity, ((Bitmap) (obj1)), cacheTimestamp);
                    return ((Bitmap) (obj1));
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = MediaDocumentDownloadUtil.this;
                mediaAvatar = mediadocument;
                cacheIdentity = s;
                cacheTimestamp = l;
                super();
            }
            };
            return async.a(mediaAvatar, obj, asynccallback);
        }
    }

    private boolean isUnavailableMedia(MediaDocument mediadocument, MediaLinkProfile medialinkprofile)
    {
        return unavailableMedia.containsKey(new Pair(Integer.valueOf(mediadocument.getObjectID()), medialinkprofile));
    }

    private boolean isUnavailableMediaThumbnail(MediaLinkProfile medialinkprofile, MediaDocument mediadocument)
    {
        return (medialinkprofile == MediaLinkProfile.IMG_PROFILE || medialinkprofile == MediaLinkProfile.THUMBNAIL_PROFILE) && unavailableMedia.containsKey(new Pair(Integer.valueOf(mediadocument.getObjectID()), medialinkprofile));
    }

    public ListenableCompletableFuture decodeMovieMedia(final MediaDocument mediaDocument)
    {
        final Future task[] = new Future[1];
        final CountDownLatch freeToProceed = new CountDownLatch(1);
        final ListenableCompletableFuture future = new ListenableCompletableFuture() {

            final MediaDocumentDownloadUtil this$0;
            final CountDownLatch val$freeToProceed;
            final Future val$task[];

            public final boolean cancel(boolean flag)
            {
                Exception exception;
                try
                {
                    freeToProceed.await();
                    task[0].cancel(flag);
                }
                catch (InterruptedException interruptedexception)
                {
                    return super.cancel(flag);
                }
                finally
                {
                    super.cancel(flag);
                }
                return super.cancel(flag);
                throw exception;
            }

            
            {
                this$0 = MediaDocumentDownloadUtil.this;
                freeToProceed = countdownlatch;
                task = afuture;
                super();
            }
        };
        task[0] = async.a(new Runnable() {

            final MediaDocumentDownloadUtil this$0;
            final ListenableCompletableFuture val$future;
            final MediaDocument val$mediaDocument;

            public final void run()
            {
                String s = mediaDocument.getMediaLink(MediaLinkProfile.THUMBNAIL_PROFILE.toString()).m_path;
                Movie movie = null;
                if (s != null)
                {
                    movie = Movie.decodeFile(s);
                }
                urlPreviewMediaAgent.postMovieDecodingResultEvent(future, movie, s);
            }

            
            {
                this$0 = MediaDocumentDownloadUtil.this;
                mediaDocument = mediadocument;
                future = listenablecompletablefuture;
                super();
            }
        });
        freeToProceed.countDown();
        return future;
    }

    public Future fetchCloudGroupAvatar(Conversation conversation, Object obj, AsyncCallback asynccallback)
    {
        if (conversation != null)
        {
            if (TextUtils.equals(conversation.getPictureProp(), "0"))
            {
                imageCache.b(conversation.getIdentityProp());
                asynccallback.done(new CompletedAsyncResult(null, obj));
                return null;
            }
            MediaDocumentImpl mediadocumentimpl = new MediaDocumentImpl();
            if (conversation.getPictureMediaDocument(mediadocumentimpl))
            {
                int i = mediadocumentimpl.getObjectID();
                if (map.a(i) == null)
                {
                    map.b(mediadocumentimpl);
                    map.a(mediadocumentimpl);
                }
                return getCloudGroupAvatar(mediadocumentimpl, obj, asynccallback, conversation.getIdentityProp(), i);
            }
        }
        return null;
    }

    public Future getMediaByProfileAsync(final MediaLinkProfile profile, final MediaDocument mediaDocument, Object obj, AsyncCallback asynccallback)
    {
        final String cacheIdentity = getMediaIdentity(mediaDocument, profile);
        Bitmap bitmap = imageCache.a(cacheIdentity);
        if (bitmap != null && asynccallback != null)
        {
            asynccallback.done(new CompletedAsyncResult(new GetMediaLinkResult(bitmap, com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED), obj));
            return null;
        } else
        {
            profile = new Callable() {

                final MediaDocumentDownloadUtil this$0;
                final String val$cacheIdentity;
                final MediaDocument val$mediaDocument;
                final MediaLinkProfile val$profile;

                public final GetMediaLinkResult call()
                    throws Exception
                {
                    Bitmap bitmap1;
                    com.skype.MediaDocument.GetMediaLink_Result getmedialink_result;
                    if (isUnavailableMediaThumbnail(profile, mediaDocument) && !isMediaLoadedInCache(mediaDocument, profile))
                    {
                        return new GetMediaLinkResult(null, getUnavailableMediaStatus(mediaDocument.getObjectID(), profile));
                    }
                    getmedialink_result = mediaDocument.getMediaLink(profile.toString());
                    if (getmedialink_result.m_return != com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
                    {
                        return new GetMediaLinkResult(null, getmedialink_result.m_return);
                    }
                    bitmap1 = null;
                    Bitmap bitmap2 = decodeReasonablySizedBitmap(getmedialink_result.m_path, profile, mediaDocument.getDocTypeProp());
                    bitmap1 = bitmap2;
_L3:
                    _cls8..SwitchMap.com.skype.android.app.media.MediaLinkProfile[profile.ordinal()];
                    JVM INSTR tableswitch 1 2: default 168
                //                               1 189
                //                               2 189;
                       goto _L1 _L2 _L2
_L1:
                    return new GetMediaLinkResult(bitmap1, getmedialink_result.m_return);
                    Exception exception;
                    exception;
                    exception.printStackTrace();
                      goto _L3
_L2:
                    imageCache.a(cacheIdentity, bitmap1);
                      goto _L1
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = MediaDocumentDownloadUtil.this;
                profile = medialinkprofile;
                mediaDocument = mediadocument;
                cacheIdentity = s;
                super();
            }
            };
            return async.a(profile, obj, asynccallback);
        }
    }

    public String getMediaIdentity(MediaDocument mediadocument, MediaLinkProfile medialinkprofile)
    {
        return String.valueOf(mediadocument.getObjectID()).concat(medialinkprofile.toString());
    }

    public Future getMediaPreviewAsync(MediaDocument mediadocument, Object obj, AsyncCallback asynccallback)
    {
        return getMediaByProfileAsync(MediaLinkProfile.PREVIEW_PROFILE, mediadocument, obj, asynccallback);
    }

    public TelemetryUrlPreviewFuture getMediaUrlPreviewAsync(final String urlPreviewFuture)
    {
        long l = System.currentTimeMillis();
        final Object mediaDocument = new MediaDocumentImpl();
        if (lib.createMediaDocumentWithWebUrl(urlPreviewFuture, ((MediaDocument) (mediaDocument))) && map.a(((MediaDocument) (mediaDocument)).getObjectID()) == null)
        {
            map.b(((com.skype.ObjectInterface) (mediaDocument)));
            map.a(((com.skype.ObjectInterface) (mediaDocument)));
        }
        final GetMediaLinkResult cachedFavIconResult = getCachedResult(((MediaDocument) (mediaDocument)), MediaLinkProfile.FAVICON_PROFILE);
        final GetMediaLinkResult cachedThumbnailResult = getCachedResult(((MediaDocument) (mediaDocument)), MediaLinkProfile.THUMBNAIL_PROFILE);
        final GetMediaLinkResult cachedImageResult = getCachedResult(((MediaDocument) (mediaDocument)), MediaLinkProfile.IMG_PROFILE);
        if (cachedFavIconResult != null && cachedThumbnailResult != null && cachedImageResult != null)
        {
            urlPreviewFuture = (new UrlPreviewResult.Builder()).setMediaDocument(((MediaDocument) (mediaDocument))).setFavicon(cachedFavIconResult).setThumbnail(cachedThumbnailResult).setAvatar(cachedImageResult).setUsername(null).setUserHandle(null).setType(UrlPreviewType.fromString(((MediaDocument) (mediaDocument)).getTypeProp(), ((MediaDocument) (mediaDocument)).getMimeTypeProp())).setMimeType(((MediaDocument) (mediaDocument)).getMimeTypeProp()).setTitle(((MediaDocument) (mediaDocument)).getTitleProp()).setDescription(((MediaDocument) (mediaDocument)).getDescriptionProp()).create();
            mediaDocument = new TelemetryUrlPreviewFuture();
            ((TelemetryUrlPreviewFuture) (mediaDocument)).complete(urlPreviewFuture);
            return ((TelemetryUrlPreviewFuture) (mediaDocument));
        } else
        {
            urlPreviewFuture = new b(((MediaDocument) (mediaDocument)));
            urlPreviewFuture.startTelemetry(l);
            mediaDocument = new Runnable() {

                final MediaDocumentDownloadUtil this$0;
                final GetMediaLinkResult val$cachedFavIconResult;
                final GetMediaLinkResult val$cachedImageResult;
                final GetMediaLinkResult val$cachedThumbnailResult;
                final MediaDocument val$mediaDocument;
                final b val$urlPreviewFuture;

                public final void run()
                {
                    if (cachedFavIconResult == null)
                    {
                        a a1 = new a(mediaDocument, urlPreviewFuture);
                        urlPreviewFuture.registerObserver(MediaLinkProfile.FAVICON_PROFILE, a1);
                        urlPreviewFuture.fetchMediaProfile(MediaLinkProfile.FAVICON_PROFILE);
                    } else
                    {
                        urlPreviewFuture.setProfileResult(MediaLinkProfile.FAVICON_PROFILE, cachedFavIconResult);
                    }
                    if (cachedThumbnailResult == null)
                    {
                        Object obj = new a(mediaDocument, urlPreviewFuture);
                        urlPreviewFuture.registerObserver(MediaLinkProfile.THUMBNAIL_PROFILE, ((a) (obj)));
                        obj = UrlPreviewType.fromString(mediaDocument.getTypeProp(), mediaDocument.getMimeTypeProp());
                        urlPreviewFuture.fetchMediaProfile(MediaLinkProfile.THUMBNAIL_PROFILE, ((UrlPreviewType) (obj)));
                    } else
                    {
                        urlPreviewFuture.setProfileResult(MediaLinkProfile.THUMBNAIL_PROFILE, cachedThumbnailResult);
                    }
                    if (cachedImageResult == null)
                    {
                        a a2 = new a(mediaDocument, urlPreviewFuture);
                        urlPreviewFuture.registerObserver(MediaLinkProfile.IMG_PROFILE, a2);
                        urlPreviewFuture.fetchMediaProfile(MediaLinkProfile.IMG_PROFILE);
                        return;
                    } else
                    {
                        urlPreviewFuture.setProfileResult(MediaLinkProfile.IMG_PROFILE, cachedImageResult);
                        return;
                    }
                }

            
            {
                this$0 = MediaDocumentDownloadUtil.this;
                cachedFavIconResult = getmedialinkresult;
                mediaDocument = mediadocument;
                urlPreviewFuture = b1;
                cachedThumbnailResult = getmedialinkresult1;
                cachedImageResult = getmedialinkresult2;
                super();
            }
            };
            async.a(((Runnable) (mediaDocument)));
            return urlPreviewFuture;
        }
    }

    public com.skype.MediaDocument.MEDIA_STATUS getUnavailableMediaStatus(int i, MediaLinkProfile medialinkprofile)
    {
        return (com.skype.MediaDocument.MEDIA_STATUS)unavailableMedia.get(new Pair(Integer.valueOf(i), medialinkprofile));
    }

    public boolean isMediaLoadedInCache(MediaDocument mediadocument, MediaLinkProfile medialinkprofile)
    {
        return mediadocument.getMediaLink(medialinkprofile.toString(), com.skype.MediaDocument.MEDIA_GET_POLICY.CACHE_ONLY).m_return == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED;
    }

    public boolean isVideoMediaLoadedInCache(MediaDocument mediadocument, MediaLinkProfile medialinkprofile)
    {
        return mediadocument.getMediaLink(medialinkprofile.toString(), com.skype.MediaDocument.MEDIA_GET_POLICY.CACHE_THEN_DOWNLOAD).m_return == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED;
    }

    public void putUnavailableMedia(int i, MediaLinkProfile medialinkprofile, com.skype.MediaDocument.MEDIA_STATUS media_status)
    {
        unavailableMedia.put(new Pair(Integer.valueOf(i), medialinkprofile), media_status);
    }

    public void removeUnavailableMedia(int i, MediaLinkProfile medialinkprofile)
    {
        unavailableMedia.remove(new Pair(Integer.valueOf(i), medialinkprofile));
    }

    public Future saveMediaAsync(final MediaDocument mediaDocument, final MediaLinkProfile profile, AsyncCallback asynccallback)
    {
        mediaDocument = new Callable() {

            final MediaDocumentDownloadUtil this$0;
            final MediaDocument val$mediaDocument;
            final MediaLinkProfile val$profile;

            public final MediaLinkSaveError call()
                throws Exception
            {
                com.skype.MediaDocument.GetMediaLink_Result getmedialink_result = mediaDocument.getMediaLink(profile.toString());
                if (getmedialink_result.m_return != com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
                {
                    return null;
                } else
                {
                    return copyMediaToGallery(mediaDocument, getmedialink_result.m_path);
                }
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = MediaDocumentDownloadUtil.this;
                mediaDocument = mediadocument;
                profile = medialinkprofile;
                super();
            }
        };
        return async.a(mediaDocument, asynccallback);
    }





}
