// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising.auditude;

import android.content.Context;
import android.os.Handler;
import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.MediaResource;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.AuditudeSettings;
import com.adobe.mediacore.metadata.DefaultMetadataKeys;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.timeline.NopTimelineOperation;
import com.adobe.mediacore.timeline.PlacementOpportunity;
import com.adobe.mediacore.timeline.advertising.AdAsset;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdBreakPlacement;
import com.adobe.mediacore.timeline.advertising.AdClick;
import com.adobe.mediacore.timeline.advertising.ContentResolver;
import com.adobe.mediacore.timeline.advertising.ContentTracker;
import com.adobe.mediacore.timeline.advertising.PlacementInformation;
import com.adobe.mediacore.timeline.advertising.customadmarkers.CustomRangeHelper;
import com.adobe.mediacore.utils.ReplacementTimeRange;
import com.adobe.mediacore.utils.StringUtils;
import com.auditude.ads.AuditudeAdUnitDelegate;
import com.auditude.ads.event.AdClickThroughEvent;
import com.auditude.ads.event.AdPluginErrorEvent;
import com.auditude.ads.event.AdPluginEvent;
import com.auditude.ads.event.AdProgressEvent;
import com.auditude.ads.event.AuditudePluginEventListener;
import com.auditude.ads.event.LinearAdEvent;
import com.auditude.ads.event.NonLinearAdEvent;
import com.auditude.ads.event.OnPageEvent;
import com.auditude.ads.model.Ad;
import com.auditude.ads.model.Asset;
import com.auditude.ads.model.IClick;
import com.auditude.ads.model.media.MediaFile;
import com.auditude.ads.model.smil.Group;
import com.auditude.ads.model.smil.Ref;
import com.auditude.ads.response.AdResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.adobe.mediacore.timeline.advertising.auditude:
//            AuditudeRequest, AuditudeTracker

public class AuditudeResolver extends ContentResolver
    implements com.auditude.ads.model.smil.Group.PrefetchCompleteListener
{

    private static final int AUDITUDE_TIME_SCALE = 1000;
    private static final int MINIMUM_AD_DURATION = 5;
    private static final int MINIMUM_AD_LOTS = 1;
    private static final int MIN_INIT_REQUEST_INTERVAL = 1200;
    private static final int POST_ROLL_DEFAULT_TIME = 0x989680;
    private static final int PRE_ROLL_DEFAULT_TIME = 0;
    private final int EMPTY_AD_ID;
    private final String LOG_TAG;
    private final String REPACKAGING_MIME_TYPE;
    private AuditudeRequest _auditudeRequest;
    private AuditudeTracker _auditudeTracker;
    private final Logger _logger;
    private PlacementOpportunity _placementOpportunity;
    private LinkedList _requestQueue;
    private Context _resolverContext;
    private AuditudeAdUnitDelegate auditudeAdResolver;
    private boolean creativeRepackagingEnabled;
    private Handler handler;
    private long lastRequestTime;
    private int loadingGroupCount;
    private final AuditudePluginEventListener pluginEventListener;
    private String userAgent;

    public AuditudeResolver()
    {
        LOG_TAG = (new StringBuilder()).append("[PSDK]::[AuditudeAd]::").append(com/adobe/mediacore/timeline/advertising/auditude/AuditudeResolver.getSimpleName()).toString();
        _logger = Log.getLogger(LOG_TAG);
        EMPTY_AD_ID = 0;
        REPACKAGING_MIME_TYPE = "application/x-mpegURL";
        _placementOpportunity = null;
        _auditudeRequest = null;
        creativeRepackagingEnabled = false;
        userAgent = "";
        handler = new Handler();
        loadingGroupCount = 0;
        _requestQueue = new LinkedList();
        pluginEventListener = new AuditudePluginEventListener() {

            final AuditudeResolver this$0;

            public void onAdClickEvent(AdClickThroughEvent adclickthroughevent)
            {
                _logger.w((new StringBuilder()).append(LOG_TAG).append("#AdClickThroughEvent").toString(), (new StringBuilder()).append("Event: ").append(adclickthroughevent).toString());
            }

            public void onAdPluginErrorEvent(AdPluginErrorEvent adpluginerrorevent)
            {
                _logger.w((new StringBuilder()).append(LOG_TAG).append("#onAdPluginErrorEvent").toString(), "An error ocurred while resolving ads");
                com.adobe.mediacore.MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(com.adobe.mediacore.MediaPlayerNotification.ErrorCode.AD_RESOLVER_RESOLVE_FAIL, "Auditude plugin failed to resolve ad.");
                MetadataNode metadatanode = new MetadataNode();
                metadatanode.setValue("NATIVE_ERROR_CODE", adpluginerrorevent.getType());
                error.setMetadata(metadatanode);
                notifyResolveError(error);
                startConsumer();
            }

            public void onAdPluginEvent(AdPluginEvent adpluginevent)
            {
                if ("initComplete".equals(adpluginevent.getType()))
                {
                    loadAdBreaks(adpluginevent);
                    startConsumer();
                }
            }

            public void onAdProgressEvent(AdProgressEvent adprogressevent)
            {
                _logger.w((new StringBuilder()).append(LOG_TAG).append("#AdProgressEvent").toString(), (new StringBuilder()).append("Event: ").append(adprogressevent).toString());
            }

            public void onLinearAdEvent(LinearAdEvent linearadevent)
            {
                _logger.w((new StringBuilder()).append(LOG_TAG).append("#LinearAdEvent").toString(), (new StringBuilder()).append("Event: ").append(linearadevent).toString());
            }

            public void onNonLinearAdEvent(NonLinearAdEvent nonlinearadevent)
            {
                _logger.w((new StringBuilder()).append(LOG_TAG).append("#NonLinearAdEvent").toString(), (new StringBuilder()).append("Event: ").append(nonlinearadevent).toString());
            }

            public void onOnPageAdEvent(OnPageEvent onpageevent)
            {
                _logger.w((new StringBuilder()).append(LOG_TAG).append("#OnPageEvent").toString(), (new StringBuilder()).append("Event: ").append(onpageevent).toString());
            }

            
            {
                this$0 = AuditudeResolver.this;
                super();
            }
        };
        initializeAdUnit();
    }

    public AuditudeResolver(Context context)
    {
        LOG_TAG = (new StringBuilder()).append("[PSDK]::[AuditudeAd]::").append(com/adobe/mediacore/timeline/advertising/auditude/AuditudeResolver.getSimpleName()).toString();
        _logger = Log.getLogger(LOG_TAG);
        EMPTY_AD_ID = 0;
        REPACKAGING_MIME_TYPE = "application/x-mpegURL";
        _placementOpportunity = null;
        _auditudeRequest = null;
        creativeRepackagingEnabled = false;
        userAgent = "";
        handler = new Handler();
        loadingGroupCount = 0;
        _requestQueue = new LinkedList();
        pluginEventListener = new _cls1();
        _resolverContext = context;
        initializeAdUnit();
    }

    private AdAsset createAdAsset(String s, String s1, long l, Metadata metadata, AdClick adclick)
    {
        s = MediaResource.createFromUrl(s, metadata);
        return new AdAsset(extractId(s1), l, s, adclick, metadata);
    }

    private PlacementInformation createPlacementInformation(AdBreak adbreak)
    {
        if (_placementOpportunity.getPlacementInformation() != null && _placementOpportunity.getPlacementInformation().getType() != com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.SERVER_MAP && !_placementOpportunity.getPlacementInformation().getType().equals(com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.CUSTOM_TIME_RANGES)) goto _L2; else goto _L1
_L1:
        com.adobe.mediacore.timeline.advertising.PlacementInformation.Type type = com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.MID_ROLL;
        if (adbreak.getTime() != 0L) goto _L4; else goto _L3
_L3:
        type = com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.PRE_ROLL;
_L5:
        return new PlacementInformation(type, adbreak.getTime(), 0L);
_L4:
        if (adbreak.getTime() == 0x989680L)
        {
            type = com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.POST_ROLL;
        }
        if (true) goto _L5; else goto _L2
_L2:
        return new PlacementInformation(_placementOpportunity.getPlacementInformation().getType(), _placementOpportunity.getPlacementInformation().getTime(), _placementOpportunity.getPlacementInformation().getDuration());
    }

    private void execResolveAds(Metadata metadata, PlacementOpportunity placementopportunity)
    {
        _placementOpportunity = placementopportunity;
        if (!(metadata instanceof MetadataNode))
        {
            throw new IllegalArgumentException("The provided metadata is not valid for Auditude resolver");
        } else
        {
            AuditudeSettings auditudesettings = extractAuditudeSettings((MetadataNode)metadata);
            metadata = ((MetadataNode)metadata).getNode(DefaultMetadataKeys.CUSTOM_PARAMETERS.getValue());
            _requestQueue.add(new AuditudeRequest(auditudesettings, placementopportunity, metadata));
            return;
        }
    }

    private AdAsset extractAdAsset(Asset asset, Metadata metadata, AdClick adclick)
    {
        Object obj = asset.getMediaFiles();
        if (obj == null)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#extractAdAsset").toString(), "Received invalid response from Auditude. Asset has no media files associated with it");
            return null;
        }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            MediaFile mediafile = (MediaFile)((Iterator) (obj)).next();
            if (isMediaFileSupported(mediafile))
            {
                return createAdAsset(mediafile.source, mediafile.id, asset.getDurationInMillis(), metadata, adclick);
            }
        }

        return null;
    }

    private List extractAdBreakPlacements()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = auditudeAdResolver.getAdResponse().getBreaks().iterator(); iterator.hasNext();)
        {
            Object obj = (Group)iterator.next();
            ArrayList arraylist1 = new ArrayList();
            Iterator iterator1 = ((Group) (obj)).getRefs().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                Ref ref = (Ref)iterator1.next();
                if (ref != null && ref.getAd() != null && ref.getPrimaryAsset() != null)
                {
                    Object obj1 = new AuditudeSettings();
                    ((AuditudeSettings) (obj1)).setData(ref);
                    Asset asset = ref.getPrimaryAsset();
                    obj1 = extractPrimaryAdAsset(asset, ((Metadata) (obj1)));
                    if (obj1 != null)
                    {
                        ArrayList arraylist2 = new ArrayList();
                        arraylist1.add(com.adobe.mediacore.timeline.advertising.Ad.createAd(com.adobe.mediacore.MediaResource.Type.HLS, asset.getDurationInMillis(), extractId(ref.getAd().getID()), ((AdAsset) (obj1)), arraylist2, getAdTracker()));
                    } else
                    {
                        _logger.w((new StringBuilder()).append(LOG_TAG).append("#extractAdBreaks").toString(), "Ad will be skipped. Auditude response contains a primary asset that is not supported");
                    }
                }
            } while (true);
            if (arraylist1.size() > 0)
            {
                obj = AdBreak.createAdBreak(arraylist1, ((Group) (obj)).getStartTime(), 0L, String.valueOf(((Group) (obj)).getIndex()));
                arraylist.add(new AdBreakPlacement(((AdBreak) (obj)), createPlacementInformation(((AdBreak) (obj)))));
            } else
            {
                arraylist.add(new NopTimelineOperation());
            }
        }

        return arraylist;
    }

    private AdClick extractAdClick(Asset asset)
    {
        asset = asset.getClick();
        if (asset == null)
        {
            return new AdClick("", "", "");
        } else
        {
            return new AdClick(asset.getID(), asset.getTitle(), asset.getUrl());
        }
    }

    private AuditudeSettings extractAuditudeSettings(MetadataNode metadatanode)
    {
        MetadataNode metadatanode1 = null;
        if (metadatanode.containsNode(DefaultMetadataKeys.AUDITUDE_METADATA_KEY.getValue()))
        {
            metadatanode1 = metadatanode.getNode(DefaultMetadataKeys.AUDITUDE_METADATA_KEY.getValue());
        }
        if (metadatanode.containsKey(DefaultMetadataKeys.ADVERTISING_METADATA.getValue()))
        {
            metadatanode1 = metadatanode.getNode(DefaultMetadataKeys.ADVERTISING_METADATA.getValue());
        }
        if (metadatanode1 == null || !(metadatanode1 instanceof AuditudeSettings))
        {
            throw new IllegalArgumentException("No AuditudeSettings metdata or compatible metadata have been found.");
        } else
        {
            return (AuditudeSettings)metadatanode1;
        }
    }

    private int extractId(String s)
    {
        int i = 0;
        if (s != null)
        {
            try
            {
                i = Integer.parseInt(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                _logger.w((new StringBuilder()).append(LOG_TAG).append("#extractId").toString(), "Number format exception when parsing id from auditude. Will use default values");
                return 0;
            }
        }
        return i;
    }

    private AdAsset extractPrimaryAdAsset(Asset asset, Metadata metadata)
    {
        return extractAdAsset(asset, metadata, extractAdClick(asset));
    }

    private HashMap getCustomParams(AuditudeSettings auditudesettings, PlacementInformation placementinformation, Metadata metadata, List list)
    {
        HashMap hashmap = new HashMap();
        Object obj = auditudesettings.getTargetingParameters();
        if (obj != null)
        {
            Iterator iterator1 = ((Metadata) (obj)).keySet().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                String s3 = (String)iterator1.next();
                String s5 = ((Metadata) (obj)).getValue(s3);
                if (!StringUtils.isEmpty(s3) && !StringUtils.isEmpty(s5))
                {
                    hashmap.put(s3, s5);
                }
            } while (true);
        }
        obj = new HashMap();
        ((HashMap) (obj)).put("userData", hashmap);
        list = getTimeLineString(list);
        if (list != null)
        {
            ((HashMap) (obj)).put("auditudeTimeline", list);
        }
        list = new HashMap();
        auditudesettings = auditudesettings.getCustomParameters();
        if (auditudesettings != null)
        {
            Iterator iterator = auditudesettings.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator.next();
                String s4 = auditudesettings.getValue(s1);
                if (!StringUtils.isEmpty(s1) && s4 != null)
                {
                    list.put(s1, s4);
                }
            } while (true);
        }
        if (metadata != null)
        {
            auditudesettings = metadata.keySet().iterator();
            do
            {
                if (!auditudesettings.hasNext())
                {
                    break;
                }
                String s = (String)auditudesettings.next();
                String s2 = metadata.getValue(s);
                if (!StringUtils.isEmpty(s) && !StringUtils.isEmpty(s2))
                {
                    list.put(s, s2);
                }
            } while (true);
        }
        if (!list.containsKey("PSDK_AVAIL_DURATION") && placementinformation != null && placementinformation.getDuration() != -1L)
        {
            list.put("PSDK_AVAIL_DURATION", String.valueOf(placementinformation.getDuration() / 1000L));
        }
        ((HashMap) (obj)).put("auditudePassThroughParams", list);
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#getCustomParams").toString(), (new StringBuilder()).append("Auditude custom params: ").append(obj).toString());
        return ((HashMap) (obj));
    }

    private List getMediaIds(AuditudeSettings auditudesettings)
    {
        ArrayList arraylist = new ArrayList();
        String s = auditudesettings.getMediaId();
        auditudesettings = auditudesettings.getDefaultMediaId();
        if (StringUtils.isEmpty(s))
        {
            _logger.e((new StringBuilder()).append(LOG_TAG).append("#getMediaIds()").toString(), "Auditude asset ID parameter cannot be null or empty.");
            throw new IllegalArgumentException("Auditude asset ID parameter cannot be null or empty.");
        }
        arraylist.add(s);
        if (!StringUtils.isEmpty(auditudesettings))
        {
            arraylist.add(auditudesettings);
        }
        return arraylist;
    }

    private String getTimeLineString(List list)
    {
        if (list == null || list.size() <= 0) goto _L2; else goto _L1
_L1:
        while (((PlacementInformation)list.get(0)).getType() == com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.SERVER_MAP || ((PlacementInformation)list.get(0)).getType() == com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.PRE_ROLL && list.size() == 1 && ((PlacementInformation)list.get(0)).getDuration() == -1L) 
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        while (i < list.size()) 
        {
            if (i > 0)
            {
                stringbuilder.append("&tl=");
            }
            stringbuilder.append(serializePlacement((PlacementInformation)list.get(i), false));
            if (list.size() > 1)
            {
                if (i < list.size() - 1)
                {
                    PlacementInformation placementinformation = new PlacementInformation(com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.MID_ROLL, com.adobe.mediacore.timeline.advertising.PlacementInformation.Mode.INSERT, ((PlacementInformation)list.get(i)).getTime(), ((PlacementInformation)list.get(i + 1)).getTime() - ((PlacementInformation)list.get(i)).getTime());
                    stringbuilder.append("&tl=").append(serializePlacement(placementinformation, true));
                } else
                if (((PlacementInformation)list.get(i)).getType() != com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.POST_ROLL)
                {
                    PlacementInformation placementinformation1 = new PlacementInformation(com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.MID_ROLL, com.adobe.mediacore.timeline.advertising.PlacementInformation.Mode.INSERT, ((PlacementInformation)list.get(i)).getTime(), 0x989680L);
                    stringbuilder.append("&tl=").append(serializePlacement(placementinformation1, true));
                }
            }
            i++;
        }
        list = stringbuilder.toString();
_L4:
        return list;
_L2:
        list = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void handleInvalidMetadata(Exception exception)
    {
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#handleInvalidMetadata").toString(), String.valueOf(exception.getMessage()));
        com.adobe.mediacore.MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(com.adobe.mediacore.MediaPlayerNotification.ErrorCode.AD_RESOLVER_METADATA_INVALID, "Invalid ad metadata.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("DESCRIPTION", exception.getMessage());
        error.setMetadata(metadatanode);
        notifyResolveError(error);
    }

    private void initializeAdUnit()
    {
        auditudeAdResolver = new AuditudeAdUnitDelegate();
        auditudeAdResolver.setProperty("repackageCreativeFormat", "application/x-mpegURL");
        auditudeAdResolver.setProperty("applicationContext", _resolverContext);
        auditudeAdResolver.setPluginEventListener(pluginEventListener);
    }

    private boolean isMediaFileSupported(MediaFile mediafile)
    {
        boolean flag1 = true;
        if (mediafile != null && mediafile.mimeType != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (mediafile.mimeType.equalsIgnoreCase(com.adobe.mediacore.MediaResource.MimeType.HLS_MIME_TYPE.getValue())) goto _L4; else goto _L3
_L3:
        mediafile = StringUtils.getFileExtension(mediafile.source);
        if (mediafile == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (mediafile.equalsIgnoreCase(com.adobe.mediacore.MediaResource.Type.HLS.getValue())) goto _L4; else goto _L5
_L5:
        return false;
    }

    private void issueAdResolvingRequest(AuditudeSettings auditudesettings, PlacementOpportunity placementopportunity, Metadata metadata, List list)
    {
        List list1 = getMediaIds(auditudesettings);
        String s = auditudesettings.getDomain();
        if (StringUtils.isEmpty(s))
        {
            _logger.e((new StringBuilder()).append(LOG_TAG).append("#initAuditudeAdResolver()").toString(), "Auditude domain parameter cannot be null or empty.");
            throw new IllegalArgumentException("Auditude domain parameter cannot be null or empty.");
        }
        int i;
        try
        {
            i = Integer.parseInt(auditudesettings.getZoneId());
        }
        // Misplaced declaration of an exception variable
        catch (AuditudeSettings auditudesettings)
        {
            throw new IllegalArgumentException("Auditude zoneId parameter must be a valid number.", auditudesettings);
        }
        creativeRepackagingEnabled = auditudesettings.isCreativeRepackagingEnabled();
        placementopportunity = getCustomParams(auditudesettings, placementopportunity.getPlacementInformation(), metadata, list);
        auditudeAdResolver.setProperty("repackageCreativeFormat", "application/x-mpegURL");
        auditudeAdResolver.setProperty("repackageCreativeEnabled", Boolean.valueOf(creativeRepackagingEnabled));
        metadata = new ArrayList();
        metadata.add("application/x-mpegURL");
        auditudeAdResolver.setProperty("validMimeTypes", metadata);
        auditudeAdResolver.setProperty("fallbackOnInvalidCreative", Boolean.valueOf(auditudesettings.isFallbackOnInvalidCreativeEnabled()));
        userAgent = auditudesettings.getUserAgent();
        if (!StringUtils.isEmpty(userAgent))
        {
            auditudeAdResolver.setProperty("userAgent", userAgent);
        }
        auditudeAdResolver.init(s, list1, i, placementopportunity, 10);
    }

    private void loadAdBreaks(AdPluginEvent adpluginevent)
    {
        ArrayList arraylist = auditudeAdResolver.getAdResponse().getBreaks();
        loadingGroupCount = arraylist.size();
        if (loadingGroupCount > 0)
        {
            Logger logger = _logger;
            String s = (new StringBuilder()).append(LOG_TAG).append("#loadAdBreaks").toString();
            StringBuilder stringbuilder = (new StringBuilder()).append("Loading ad breaks. Creative repackaging is: ");
            if (creativeRepackagingEnabled)
            {
                adpluginevent = "enabled";
            } else
            {
                adpluginevent = "disabled";
            }
            logger.i(s, stringbuilder.append(adpluginevent).append(".").toString());
            for (adpluginevent = arraylist.iterator(); adpluginevent.hasNext(); ((Group)adpluginevent.next()).load(this, Boolean.valueOf(creativeRepackagingEnabled), null)) { }
        } else
        {
            onPrefetchComplete(null);
        }
    }

    private void processReplacementRanges(PlacementOpportunity placementopportunity, CustomRangeHelper customrangehelper)
    {
        _placementOpportunity = placementopportunity;
        Object obj;
        obj = placementopportunity.getMetadata();
        customrangehelper = customrangehelper.mergeRanges(customrangehelper.extractCustomTimeRanges(customrangehelper.extractCustomTimeRangeMetadata()));
        obj = new AuditudeRequest(extractAuditudeSettings((MetadataNode)obj), placementopportunity, ((MetadataNode)obj).getNode(DefaultMetadataKeys.CUSTOM_PARAMETERS.getValue()));
        if (((ReplacementTimeRange)customrangehelper.get(0)).getBegin() != 0L)
        {
            ((AuditudeRequest) (obj)).addPlacement(new PlacementInformation(com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.PRE_ROLL, com.adobe.mediacore.timeline.advertising.PlacementInformation.Mode.REPLACE, 0L, -1L));
        }
          goto _L1
_L9:
        ReplacementTimeRange replacementtimerange;
        int i;
        if (i >= customrangehelper.size())
        {
            break MISSING_BLOCK_LABEL_202;
        }
        replacementtimerange = (ReplacementTimeRange)customrangehelper.get(i);
        if (replacementtimerange.getBegin() != 0L) goto _L3; else goto _L2
_L2:
        placementopportunity = com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.PRE_ROLL;
_L6:
        if (replacementtimerange.getReplacementDuration() >= 0L) goto _L5; else goto _L4
_L4:
        long l = -1L;
_L7:
        ((AuditudeRequest) (obj)).addPlacement(new PlacementInformation(placementopportunity, com.adobe.mediacore.timeline.advertising.PlacementInformation.Mode.REPLACE, replacementtimerange.getBegin(), Long.valueOf(l).longValue()));
        i++;
        continue; /* Loop/switch isn't completed */
_L3:
        placementopportunity = com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.MID_ROLL;
          goto _L6
_L5:
        l = replacementtimerange.getReplacementDuration();
          goto _L7
        try
        {
            _requestQueue.add(obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PlacementOpportunity placementopportunity)
        {
            handleInvalidMetadata(placementopportunity);
        }
        return;
          goto _L6
_L1:
        i = 0;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static String serializePlacement(PlacementInformation placementinformation, boolean flag)
    {
        long l1 = 1L;
        String s;
        StringBuilder stringbuilder;
        long l;
        long l2;
        if (placementinformation.getDuration() != -1L)
        {
            l2 = placementinformation.getDuration() / 1000L;
            l = l2 / 5L;
        } else
        {
            l = 1L;
            l2 = -1L;
        }
        if (placementinformation.getDuration() == 0L)
        {
            l1 = 0L;
        } else
        if (l >= 1L)
        {
            l1 = l;
        }
        stringbuilder = new StringBuilder();
        if (flag)
        {
            s = "n";
        } else
        {
            s = "l";
        }
        stringbuilder.append(s).append(",");
        if (l2 == -1L)
        {
            stringbuilder.append("*").append(",");
        } else
        {
            stringbuilder.append(String.valueOf(l2)).append(",");
        }
        if (l2 == -1L)
        {
            stringbuilder.append("*").append(",");
        } else
        if (flag)
        {
            stringbuilder.append("0");
        } else
        {
            stringbuilder.append(String.valueOf(l1)).append(",");
        }
        if (!flag)
        {
            if (placementinformation.getType() == com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.PRE_ROLL)
            {
                stringbuilder.append("p");
            } else
            if (placementinformation.getType() == com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.POST_ROLL)
            {
                stringbuilder.append("t");
            } else
            {
                stringbuilder.append("m");
            }
        }
        return stringbuilder.toString();
    }

    private void startConsumer()
    {
        if (_requestQueue.isEmpty())
        {
            return;
        }
        long l1 = System.currentTimeMillis();
        long l;
        if (1200L > l1 - lastRequestTime)
        {
            l = 1200L - (l1 - lastRequestTime);
        } else
        {
            l = 0L;
        }
        lastRequestTime = l1 + l;
        handler.postDelayed(new Runnable() {

            final AuditudeResolver this$0;

            public void run()
            {
                if (_requestQueue.isEmpty())
                {
                    return;
                }
                _auditudeRequest = (AuditudeRequest)_requestQueue.poll();
                try
                {
                    issueAdResolvingRequest(_auditudeRequest.getAuditudeSettings(), (PlacementOpportunity)_auditudeRequest.getPlacementOpportunities().get(0), _auditudeRequest.getAvailCustomParams(), _auditudeRequest.getPlacementInformations());
                    return;
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    _logger.w((new StringBuilder()).append(LOG_TAG).append("#startConsumer").toString(), String.valueOf(illegalargumentexception.getMessage()));
                    com.adobe.mediacore.MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(com.adobe.mediacore.MediaPlayerNotification.ErrorCode.AD_RESOLVER_METADATA_INVALID, "Invalid ad metadata.");
                    MetadataNode metadatanode = new MetadataNode();
                    metadatanode.setValue("DESCRIPTION", illegalargumentexception.getMessage());
                    error.setMetadata(metadatanode);
                    notifyResolveError(error);
                    return;
                }
            }

            
            {
                this$0 = AuditudeResolver.this;
                super();
            }
        }, l);
    }

    protected boolean doCanResolve(PlacementOpportunity placementopportunity)
    {
        AuditudeSettings auditudesettings = extractAuditudeSettings((MetadataNode)placementopportunity.getMetadata());
        return placementopportunity.getPlacementInformation().getMode() == com.adobe.mediacore.timeline.advertising.PlacementInformation.Mode.INSERT || placementopportunity.getPlacementInformation().getMode() == com.adobe.mediacore.timeline.advertising.PlacementInformation.Mode.REPLACE && auditudesettings != null;
    }

    protected ContentTracker doProvideAdTracker()
    {
        if (_auditudeTracker == null)
        {
            _auditudeTracker = new AuditudeTracker(auditudeAdResolver.getReportingEngine());
        }
        return _auditudeTracker;
    }

    protected void doResolveAds(Metadata metadata, PlacementOpportunity placementopportunity)
    {
        this;
        JVM INSTR monitorenter ;
        if (!placementopportunity.getPlacementInformation().getType().equals(com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.CUSTOM_TIME_RANGES))
        {
            break MISSING_BLOCK_LABEL_38;
        }
        processReplacementRanges(placementopportunity, new CustomRangeHelper(metadata));
_L1:
        startConsumer();
        this;
        JVM INSTR monitorexit ;
        return;
        execResolveAds(metadata, placementopportunity);
          goto _L1
        metadata;
        throw metadata;
    }

    public void onPrefetchComplete(ArrayList arraylist)
    {
        if (arraylist != null && arraylist.size() > 0)
        {
            arraylist = arraylist.iterator();
            do
            {
                if (!arraylist.hasNext())
                {
                    break;
                }
                Object obj1 = (AdPluginEvent)arraylist.next();
                com.adobe.mediacore.MediaPlayerNotification.Warning warning = MediaPlayerNotification.createWarningNotification(com.adobe.mediacore.MediaPlayerNotification.WarningCode.AD_RESOLVER_RETURNED_NO_ADS, "Ad Resolver Returned no ads");
                obj1 = ((AdPluginEvent) (obj1)).getData();
                if (obj1 != null)
                {
                    MetadataNode metadatanode = new MetadataNode();
                    metadatanode.setValue("AdId", ((HashMap) (obj1)).get("AdId").toString());
                    metadatanode.setValue("InternalError", ((HashMap) (obj1)).get("InternalErrorId").toString());
                    metadatanode.setValue("Description", ((HashMap) (obj1)).get("Description").toString());
                    warning.setMetadata(metadatanode);
                    notifyResolveWarning(warning);
                }
            } while (true);
        }
        loadingGroupCount = loadingGroupCount - 1;
        if (loadingGroupCount > 0) goto _L2; else goto _L1
_L1:
        Object obj;
        ArrayList arraylist1;
        obj = extractAdBreakPlacements();
        arraylist1 = new ArrayList();
        arraylist = arraylist1;
        if (_placementOpportunity == null) goto _L4; else goto _L3
_L3:
        arraylist = arraylist1;
        if (_placementOpportunity.getPlacementInformation() == null) goto _L4; else goto _L5
_L5:
        arraylist = arraylist1;
        if (_auditudeRequest == null) goto _L4; else goto _L6
_L6:
        arraylist = _auditudeRequest.getPlacementInformations();
        if (obj == null || ((List) (obj)).size() <= 0 || !(((List) (obj)).get(0) instanceof NopTimelineOperation)) goto _L8; else goto _L7
_L7:
        arraylist = ((ArrayList) (obj));
_L4:
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#createAdBreakFor").toString(), (new StringBuilder()).append("Number of ad breaks returned : ").append(String.valueOf(arraylist.size())).toString());
        notifyResolveComplete(arraylist);
_L2:
        return;
_L8:
        if (_placementOpportunity.getPlacementInformation().getType() == com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.PRE_ROLL || ((PlacementInformation)arraylist.get(0)).getType() == com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.PRE_ROLL && arraylist.size() == 1 && ((PlacementInformation)arraylist.get(0)).getDuration() == -1L)
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#createAdBreakFor").toString(), (new StringBuilder()).append("Input : ").append(_placementOpportunity.toString()).toString());
            arraylist = new ArrayList();
            if (((List) (obj)).size() > 0)
            {
                obj = ((AdBreakPlacement)((List) (obj)).get(0)).getAdBreak().cloneFor(_placementOpportunity.getPlacementInformation());
                _logger.i((new StringBuilder()).append(LOG_TAG).append("#createAdBreakFor").toString(), (new StringBuilder()).append("Output : ").append(((AdBreak) (obj)).toString()).toString());
                arraylist.add(new AdBreakPlacement(((AdBreak) (obj)), createPlacementInformation(((AdBreak) (obj)))));
            }
        } else
        {
            arraylist = ((ArrayList) (obj));
        }
        if (true) goto _L4; else goto _L9
_L9:
    }









/*
    static AuditudeRequest access$602(AuditudeResolver audituderesolver, AuditudeRequest audituderequest)
    {
        audituderesolver._auditudeRequest = audituderequest;
        return audituderequest;
    }

*/


}
