// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.WorkQueue;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.facebook.share.internal:
//            ShareInternalUtility

public class VideoUploader
{

    private static final String ERROR_BAD_SERVER_RESPONSE = "Unexpected error in server response";
    private static final String ERROR_UPLOAD = "Video upload failed";
    private static final int MAX_RETRIES_PER_PHASE = 2;
    private static final String PARAM_DESCRIPTION = "description";
    private static final String PARAM_END_OFFSET = "end_offset";
    private static final String PARAM_FILE_SIZE = "file_size";
    private static final String PARAM_REF = "ref";
    private static final String PARAM_SESSION_ID = "upload_session_id";
    private static final String PARAM_START_OFFSET = "start_offset";
    private static final String PARAM_TITLE = "title";
    private static final String PARAM_UPLOAD_PHASE = "upload_phase";
    private static final String PARAM_VALUE_UPLOAD_FINISH_PHASE = "finish";
    private static final String PARAM_VALUE_UPLOAD_START_PHASE = "start";
    private static final String PARAM_VALUE_UPLOAD_TRANSFER_PHASE = "transfer";
    private static final String PARAM_VIDEO_FILE_CHUNK = "video_file_chunk";
    private static final String PARAM_VIDEO_ID = "video_id";
    private static final int RETRY_DELAY_BACK_OFF_FACTOR = 3;
    private static final int RETRY_DELAY_UNIT_MS = 5000;
    private static final String TAG = "VideoUploader";
    private static final int UPLOAD_QUEUE_MAX_CONCURRENT = 8;
    private static AccessTokenTracker accessTokenTracker;
    private static Handler handler;
    private static boolean initialized;
    private static Set pendingUploads = new HashSet();
    private static WorkQueue uploadQueue = new WorkQueue(8);

    public VideoUploader()
    {
    }

    private static void cancelAllRequests()
    {
        com/facebook/share/internal/VideoUploader;
        JVM INSTR monitorenter ;
        for (Iterator iterator = pendingUploads.iterator(); iterator.hasNext();)
        {
            ((UploadContext)iterator.next()).isCanceled = true;
        }

        break MISSING_BLOCK_LABEL_43;
        Exception exception;
        exception;
        throw exception;
        com/facebook/share/internal/VideoUploader;
        JVM INSTR monitorexit ;
    }

    private static void enqueueRequest(UploadContext uploadcontext, Runnable runnable)
    {
        com/facebook/share/internal/VideoUploader;
        JVM INSTR monitorenter ;
        uploadcontext.workItem = uploadQueue.addActiveWorkItem(runnable);
        com/facebook/share/internal/VideoUploader;
        JVM INSTR monitorexit ;
        return;
        uploadcontext;
        throw uploadcontext;
    }

    private static void enqueueUploadChunk(UploadContext uploadcontext, String s, String s1, int i)
    {
        enqueueRequest(uploadcontext, new TransferChunkWorkItem(uploadcontext, s, s1, i));
    }

    private static void enqueueUploadFinish(UploadContext uploadcontext, int i)
    {
        enqueueRequest(uploadcontext, new FinishUploadWorkItem(uploadcontext, i));
    }

    private static void enqueueUploadStart(UploadContext uploadcontext, int i)
    {
        enqueueRequest(uploadcontext, new StartUploadWorkItem(uploadcontext, i));
    }

    private static byte[] getChunk(UploadContext uploadcontext, String s, String s1)
    {
        if (!Utility.areObjectsEqual(s, uploadcontext.chunkStart))
        {
            logError(null, "Error reading video chunk. Expected chunk '%s'. Requested chunk '%s'.", new Object[] {
                uploadcontext.chunkStart, s
            });
            return null;
        }
        long l = Long.parseLong(s);
        int i = (int)(Long.parseLong(s1) - l);
        s = new ByteArrayOutputStream();
        byte abyte0[] = new byte[Math.min(8192, i)];
        do
        {
            int j;
            int k;
label0:
            {
                k = uploadcontext.videoStream.read(abyte0);
                if (k != -1)
                {
                    s.write(abyte0, 0, k);
                    j = i - k;
                    if (j != 0)
                    {
                        break label0;
                    }
                }
                uploadcontext.chunkStart = s1;
                return s.toByteArray();
            }
            i = j;
            if (j < 0)
            {
                logError(null, "Error reading video chunk. Expected buffer length - '%d'. Actual - '%d'.", new Object[] {
                    Integer.valueOf(j + k), Integer.valueOf(k)
                });
                return null;
            }
        } while (true);
    }

    private static Handler getHandler()
    {
        com/facebook/share/internal/VideoUploader;
        JVM INSTR monitorenter ;
        Handler handler1;
        if (handler == null)
        {
            handler = new Handler(Looper.getMainLooper());
        }
        handler1 = handler;
        com/facebook/share/internal/VideoUploader;
        JVM INSTR monitorexit ;
        return handler1;
        Exception exception;
        exception;
        throw exception;
    }

    private static void issueResponse(UploadContext uploadcontext, FacebookException facebookexception, String s)
    {
label0:
        {
            removePendingUpload(uploadcontext);
            Utility.closeQuietly(uploadcontext.videoStream);
            if (uploadcontext.callback != null)
            {
                if (facebookexception == null)
                {
                    break label0;
                }
                ShareInternalUtility.invokeOnErrorCallback(uploadcontext.callback, facebookexception);
            }
            return;
        }
        if (uploadcontext.isCanceled)
        {
            ShareInternalUtility.invokeOnCancelCallback(uploadcontext.callback);
            return;
        } else
        {
            ShareInternalUtility.invokeOnSuccessCallback(uploadcontext.callback, s);
            return;
        }
    }

    private static transient void logError(Exception exception, String s, Object aobj[])
    {
        Log.e("VideoUploader", String.format(Locale.ROOT, s, aobj), exception);
    }

    private static void registerAccessTokenTracker()
    {
        accessTokenTracker = new AccessTokenTracker() {

            protected void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1)
            {
                while (accesstoken == null || accesstoken1 != null && Utility.areObjectsEqual(accesstoken1.getUserId(), accesstoken.getUserId())) 
                {
                    return;
                }
                VideoUploader.cancelAllRequests();
            }

        };
    }

    private static void removePendingUpload(UploadContext uploadcontext)
    {
        com/facebook/share/internal/VideoUploader;
        JVM INSTR monitorenter ;
        pendingUploads.remove(uploadcontext);
        com/facebook/share/internal/VideoUploader;
        JVM INSTR monitorexit ;
        return;
        uploadcontext;
        throw uploadcontext;
    }

    public static void uploadAsync(ShareVideoContent sharevideocontent, FacebookCallback facebookcallback)
    {
        com/facebook/share/internal/VideoUploader;
        JVM INSTR monitorenter ;
        uploadAsync(sharevideocontent, "me", facebookcallback);
        com/facebook/share/internal/VideoUploader;
        JVM INSTR monitorexit ;
        return;
        sharevideocontent;
        throw sharevideocontent;
    }

    public static void uploadAsync(ShareVideoContent sharevideocontent, String s, FacebookCallback facebookcallback)
    {
        com/facebook/share/internal/VideoUploader;
        JVM INSTR monitorenter ;
        if (!initialized)
        {
            registerAccessTokenTracker();
            initialized = true;
        }
        Validate.notNull(sharevideocontent, "videoContent");
        Validate.notNull(s, "graphNode");
        ShareVideo sharevideo = sharevideocontent.getVideo();
        Validate.notNull(sharevideo, "videoContent.video");
        Validate.notNull(sharevideo.getLocalUrl(), "videoContent.video.localUrl");
        sharevideocontent = new UploadContext(sharevideocontent, s, facebookcallback);
        sharevideocontent.initialize();
        pendingUploads.add(sharevideocontent);
        enqueueUploadStart(sharevideocontent, 0);
        com/facebook/share/internal/VideoUploader;
        JVM INSTR monitorexit ;
        return;
        sharevideocontent;
        throw sharevideocontent;
    }










    private class UploadContext
    {

        public final AccessToken accessToken;
        public final FacebookCallback callback;
        public String chunkStart;
        public final String description;
        public final String graphNode;
        public boolean isCanceled;
        public Bundle params;
        public final String ref;
        public String sessionId;
        public final String title;
        public String videoId;
        public long videoSize;
        public InputStream videoStream;
        public final Uri videoUri;
        public com.facebook.internal.WorkQueue.WorkItem workItem;

        private void initialize()
        {
            try
            {
                if (Utility.isFileUri(videoUri))
                {
                    ParcelFileDescriptor parcelfiledescriptor = ParcelFileDescriptor.open(new File(videoUri.getPath()), 0x10000000);
                    videoSize = parcelfiledescriptor.getStatSize();
                    videoStream = new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelfiledescriptor);
                    return;
                }
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                Utility.closeQuietly(videoStream);
                throw filenotfoundexception;
            }
            if (Utility.isContentUri(videoUri))
            {
                videoSize = Utility.getContentSize(videoUri);
                videoStream = FacebookSdk.getApplicationContext().getContentResolver().openInputStream(videoUri);
                return;
            }
            throw new FacebookException("Uri must be a content:// or file:// uri");
        }


        private UploadContext(ShareVideoContent sharevideocontent, String s, FacebookCallback facebookcallback)
        {
            chunkStart = "0";
            accessToken = AccessToken.getCurrentAccessToken();
            videoUri = sharevideocontent.getVideo().getLocalUrl();
            title = sharevideocontent.getContentTitle();
            description = sharevideocontent.getContentDescription();
            ref = sharevideocontent.getRef();
            graphNode = s;
            callback = facebookcallback;
            params = sharevideocontent.getVideo().getParameters();
        }

    }


    private class TransferChunkWorkItem extends UploadWorkItemBase
    {
        private class UploadWorkItemBase
            implements Runnable
        {

            protected int completedRetries;
            protected UploadContext uploadContext;

            private boolean attemptRetry(int i)
            {
                if (completedRetries < 2 && getTransientErrorCodes().contains(Integer.valueOf(i)))
                {
                    i = (int)Math.pow(3D, completedRetries);
                    VideoUploader.getHandler().postDelayed(new Runnable() {

                        final UploadWorkItemBase this$0;

                        public void run()
                        {
                            enqueueRetry(completedRetries + 1);
                        }

                    
                    {
                        this$0 = UploadWorkItemBase.this;
                        super();
                    }
                    }, i * 5000);
                    return true;
                } else
                {
                    return false;
                }
            }

            protected void endUploadWithFailure(FacebookException facebookexception)
            {
                issueResponseOnMainThread(facebookexception, null);
            }

            protected abstract void enqueueRetry(int i);

            protected void executeGraphRequestSynchronously(Bundle bundle)
            {
                bundle = (new GraphRequest(uploadContext.accessToken, String.format(Locale.ROOT, "%s/videos", new Object[] {
                    uploadContext.graphNode
                }), bundle, HttpMethod.POST, null)).executeAndWait();
                if (bundle != null)
                {
                    FacebookRequestError facebookrequesterror = bundle.getError();
                    JSONObject jsonobject = bundle.getJSONObject();
                    if (facebookrequesterror != null)
                    {
                        if (!attemptRetry(facebookrequesterror.getSubErrorCode()))
                        {
                            handleError(new FacebookGraphResponseException(bundle, "Video upload failed"));
                        }
                        return;
                    }
                    if (jsonobject != null)
                    {
                        try
                        {
                            handleSuccess(jsonobject);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Bundle bundle)
                        {
                            endUploadWithFailure(new FacebookException("Unexpected error in server response", bundle));
                        }
                        return;
                    } else
                    {
                        handleError(new FacebookException("Unexpected error in server response"));
                        return;
                    }
                } else
                {
                    handleError(new FacebookException("Unexpected error in server response"));
                    return;
                }
            }

            protected abstract Bundle getParameters();

            protected abstract Set getTransientErrorCodes();

            protected abstract void handleError(FacebookException facebookexception);

            protected abstract void handleSuccess(JSONObject jsonobject);

            protected void issueResponseOnMainThread(final FacebookException error, final String videoId)
            {
                VideoUploader.getHandler().post(new Runnable() {

                    final UploadWorkItemBase this$0;
                    final FacebookException val$error;
                    final String val$videoId;

                    public void run()
                    {
                        VideoUploader.issueResponse(uploadContext, error, videoId);
                    }

                    
                    {
                        this$0 = UploadWorkItemBase.this;
                        error = facebookexception;
                        videoId = s;
                        super();
                    }
                });
            }

            public void run()
            {
                if (!uploadContext.isCanceled)
                {
                    try
                    {
                        executeGraphRequestSynchronously(getParameters());
                        return;
                    }
                    catch (FacebookException facebookexception)
                    {
                        endUploadWithFailure(facebookexception);
                        return;
                    }
                    catch (Exception exception)
                    {
                        endUploadWithFailure(new FacebookException("Video upload failed", exception));
                    }
                    return;
                } else
                {
                    endUploadWithFailure(null);
                    return;
                }
            }

            protected UploadWorkItemBase(UploadContext uploadcontext, int i)
            {
                uploadContext = uploadcontext;
                completedRetries = i;
            }
        }


        static final Set transientErrorCodes = new HashSet() {

                
                {
                    add(Integer.valueOf(0x14cc4b));
                    add(Integer.valueOf(0x14cc4d));
                    add(Integer.valueOf(0x14cc56));
                    add(Integer.valueOf(0x14cc59));
                    add(Integer.valueOf(0x14cc61));
                }
        };
        private String chunkEnd;
        private String chunkStart;

        protected void enqueueRetry(int i)
        {
            VideoUploader.enqueueUploadChunk(uploadContext, chunkStart, chunkEnd, i);
        }

        public Bundle getParameters()
        {
            Bundle bundle = new Bundle();
            bundle.putString("upload_phase", "transfer");
            bundle.putString("upload_session_id", uploadContext.sessionId);
            bundle.putString("start_offset", chunkStart);
            byte abyte0[] = VideoUploader.getChunk(uploadContext, chunkStart, chunkEnd);
            if (abyte0 != null)
            {
                bundle.putByteArray("video_file_chunk", abyte0);
                return bundle;
            } else
            {
                throw new FacebookException("Error reading video");
            }
        }

        protected Set getTransientErrorCodes()
        {
            return transientErrorCodes;
        }

        protected void handleError(FacebookException facebookexception)
        {
            VideoUploader.logError(facebookexception, "Error uploading video '%s'", new Object[] {
                uploadContext.videoId
            });
            endUploadWithFailure(facebookexception);
        }

        protected void handleSuccess(JSONObject jsonobject)
        {
            String s = jsonobject.getString("start_offset");
            jsonobject = jsonobject.getString("end_offset");
            if (Utility.areObjectsEqual(s, jsonobject))
            {
                VideoUploader.enqueueUploadFinish(uploadContext, 0);
                return;
            } else
            {
                VideoUploader.enqueueUploadChunk(uploadContext, s, jsonobject, 0);
                return;
            }
        }


        public TransferChunkWorkItem(UploadContext uploadcontext, String s, String s1, int i)
        {
            super(uploadcontext, i);
            chunkStart = s;
            chunkEnd = s1;
        }
    }


    private class FinishUploadWorkItem extends UploadWorkItemBase
    {

        static final Set transientErrorCodes = new HashSet() {

                
                {
                    add(Integer.valueOf(0x14cc43));
                }
        };

        protected void enqueueRetry(int i)
        {
            VideoUploader.enqueueUploadFinish(uploadContext, i);
        }

        public Bundle getParameters()
        {
            Bundle bundle = new Bundle();
            if (uploadContext.params != null)
            {
                bundle.putAll(uploadContext.params);
            }
            bundle.putString("upload_phase", "finish");
            bundle.putString("upload_session_id", uploadContext.sessionId);
            Utility.putNonEmptyString(bundle, "title", uploadContext.title);
            Utility.putNonEmptyString(bundle, "description", uploadContext.description);
            Utility.putNonEmptyString(bundle, "ref", uploadContext.ref);
            return bundle;
        }

        protected Set getTransientErrorCodes()
        {
            return transientErrorCodes;
        }

        protected void handleError(FacebookException facebookexception)
        {
            VideoUploader.logError(facebookexception, "Video '%s' failed to finish uploading", new Object[] {
                uploadContext.videoId
            });
            endUploadWithFailure(facebookexception);
        }

        protected void handleSuccess(JSONObject jsonobject)
        {
            if (jsonobject.getBoolean("success"))
            {
                issueResponseOnMainThread(null, uploadContext.videoId);
                return;
            } else
            {
                handleError(new FacebookException("Unexpected error in server response"));
                return;
            }
        }


        public FinishUploadWorkItem(UploadContext uploadcontext, int i)
        {
            super(uploadcontext, i);
        }
    }


    private class StartUploadWorkItem extends UploadWorkItemBase
    {

        static final Set transientErrorCodes = new HashSet() {

                
                {
                    add(Integer.valueOf(6000));
                }
        };

        protected void enqueueRetry(int i)
        {
            VideoUploader.enqueueUploadStart(uploadContext, i);
        }

        public Bundle getParameters()
        {
            Bundle bundle = new Bundle();
            bundle.putString("upload_phase", "start");
            bundle.putLong("file_size", uploadContext.videoSize);
            return bundle;
        }

        protected Set getTransientErrorCodes()
        {
            return transientErrorCodes;
        }

        protected void handleError(FacebookException facebookexception)
        {
            VideoUploader.logError(facebookexception, "Error starting video upload", new Object[0]);
            endUploadWithFailure(facebookexception);
        }

        protected void handleSuccess(JSONObject jsonobject)
        {
            uploadContext.sessionId = jsonobject.getString("upload_session_id");
            uploadContext.videoId = jsonobject.getString("video_id");
            String s = jsonobject.getString("start_offset");
            jsonobject = jsonobject.getString("end_offset");
            VideoUploader.enqueueUploadChunk(uploadContext, s, jsonobject, 0);
        }


        public StartUploadWorkItem(UploadContext uploadcontext, int i)
        {
            super(uploadcontext, i);
        }
    }

}
