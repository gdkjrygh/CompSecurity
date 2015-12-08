// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;

import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.MediaResource;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.DefaultMetadataKeys;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.timeline.PlacementOpportunity;
import com.adobe.mediacore.utils.NumberUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.adobe.mediacore.timeline.advertising:
//            ContentResolver, PlacementInformation, Ad, AdBreak, 
//            AdBreakPlacement, ContentTracker, AdClick, AdAsset

public class MetadataResolver extends ContentResolver
{
    private class AdvertisingJSONFactory
    {

        final MetadataResolver this$0;

        private AdClick createAdClick(JSONObject jsonobject)
            throws JSONException
        {
            if (jsonobject.toString().contains("click-info"))
            {
                jsonobject = jsonobject.getJSONArray("click-info").getJSONObject(0);
                String s = jsonobject.getString("title");
                String s1 = jsonobject.getString("url");
                return new AdClick(jsonobject.getString("id"), s, s1);
            } else
            {
                return new AdClick("", "", "");
            }
        }

        private AdAsset createPrimaryAdAsset(JSONObject jsonobject, long l, int i)
            throws JSONException
        {
            return new AdAsset(i, l, MediaResource.createFromUrl(jsonobject.getString("url"), null), createAdClick(jsonobject), null);
        }

        private int getNextTimelineId()
        {
            this;
            JVM INSTR monitorenter ;
            int i = int i = ((HLS) (this)).HLS;
            this;
            JVM INSTR monitorexit ;
            return i;
            Exception exception;
            exception;
            throw exception;
        }

        public Ad createAd(JSONObject jsonobject)
            throws JSONException
        {
            long l = NumberUtils.parseLong(jsonobject.getString("duration"), -1L);
            int i = getNextTimelineId();
            jsonobject = createPrimaryAdAsset(jsonobject, l, i);
            return Ad.createAd(com.adobe.mediacore.MediaResource.Type.HLS, l, i, jsonobject, new ArrayList(), null);
        }

        public AdBreakPlacement createAdBreakPlacement(JSONObject jsonobject)
            throws JSONException
        {
            String s = jsonobject.getString("tag");
            long l = NumberUtils.parseNumber(jsonobject.getString("time"), -1L);
            long l1 = NumberUtils.parseNumber(jsonobject.getString("replace"), 0L);
            List list = createAds(jsonobject.getJSONArray("ad-list"));
            jsonobject = PlacementInformation.Type.MID_ROLL;
            if (l == 0L)
            {
                jsonobject = PlacementInformation.Type.PRE_ROLL;
            }
            jsonobject = new PlacementInformation(jsonobject, l, l1);
            return new AdBreakPlacement(AdBreak.createAdBreak(list, l, l1, s), jsonobject);
        }

        public List createAdBreakPlacements(JSONArray jsonarray)
            throws JSONException
        {
            ArrayList arraylist = new ArrayList();
            int j = jsonarray.length();
            if (j > 0)
            {
                for (int i = 0; i < j; i++)
                {
                    arraylist.add(createAdBreakPlacement(jsonarray.getJSONObject(i)));
                }

            }
            return arraylist;
        }

        public List createAds(JSONArray jsonarray)
            throws JSONException
        {
            ArrayList arraylist = new ArrayList();
            int j = jsonarray.length();
            if (j > 0)
            {
                for (int i = 0; i < j; i++)
                {
                    arraylist.add(createAd(jsonarray.getJSONObject(i)));
                }

            }
            return arraylist;
        }

        private AdvertisingJSONFactory()
        {
            this$0 = MetadataResolver.this;
            super();
        }

    }


    private static final int DEFAULT_POSTROLL_TIME = -2;
    private static final int DEFAULT_PREROLL_TIME = 0;
    private static final String JSON_METADATA_KEY = "json_metadata";
    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::[MetadataAd]::").append(com/adobe/mediacore/timeline/advertising/MetadataResolver.getSimpleName()).toString();
    private static final String NODE_NAME_ADBREAK_ADLIST = "ad-list";
    private static final String NODE_NAME_ADBREAK_REPLACE = "replace";
    private static final String NODE_NAME_ADBREAK_TAG = "tag";
    private static final String NODE_NAME_ADBREAK_TIME = "time";
    private static final String NODE_NAME_AD_DURATION = "duration";
    private static final String NODE_NAME_AD_TAG = "tag";
    private static final String NODE_NAME_AD_URL = "url";
    private static final String NODE_NAME_CLICK_INFO = "click-info";
    private static final String NODE_NAME_ID = "id";
    private static final String NODE_NAME_TITLE = "title";
    private static final String NODE_NAME_URL = "url";
    private AdBreak _availableAdBreak;
    private Iterator _availableAdIterator;
    private long _linearTagIndex;
    private final Logger _logger;
    private int _nextAvailableAdId;
    private final List _positionedAdBreakPlacements = new ArrayList();

    public MetadataResolver()
    {
        _logger = Log.getLogger(LOG_TAG);
        _availableAdBreak = null;
        _availableAdIterator = null;
        _linearTagIndex = 0L;
        _nextAvailableAdId = 3000;
    }

    private List createAdBreakPlacementsFor(PlacementInformation placementinformation)
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#createAdBreakPlacementFor").toString(), (new StringBuilder()).append("Input : ").append(placementinformation.toString()).toString());
        ArrayList arraylist = new ArrayList();
        long l = placementinformation.getDuration();
        if (_availableAdBreak != null)
        {
            Object obj = getNextLinearTag();
            ArrayList arraylist1 = new ArrayList();
            while (l > 0L) 
            {
                Ad ad = getAdForDuration(l);
                if (ad != null)
                {
                    arraylist1.add(ad);
                    l -= ad.getDuration();
                } else
                {
                    l = 0L;
                }
            }
            obj = AdBreak.createAdBreak(arraylist1, placementinformation.getTime(), placementinformation.getDuration(), ((String) (obj)));
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#createAdBreakPlacementFor").toString(), (new StringBuilder()).append("Output : ").append(((AdBreak) (obj)).toString()).toString());
            arraylist.add(new AdBreakPlacement(((AdBreak) (obj)), placementinformation));
        }
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#createAdBreakPlacementFor").toString(), (new StringBuilder()).append("Number of ad breaks returned : ").append(String.valueOf(arraylist.size())).toString());
        return arraylist;
    }

    private List extractAdBreakPlacements(String s)
        throws JSONException
    {
        s = new JSONArray(s);
        return (new AdvertisingJSONFactory()).createAdBreakPlacements(s);
    }

    private Metadata extractMetadata(Metadata metadata)
    {
        while (metadata == null || !(metadata instanceof MetadataNode)) 
        {
            return null;
        }
        return ((MetadataNode)metadata).getNode(DefaultMetadataKeys.ADVERTISING_METADATA.getValue());
    }

    private Ad getAdForDuration(long l)
    {
        boolean flag = false;
_L3:
        Ad ad;
        if (_availableAdIterator == null)
        {
            _availableAdIterator = _availableAdBreak.adsIterator();
        }
        if (!_availableAdIterator.hasNext())
        {
            if (!flag)
            {
                _availableAdIterator = _availableAdBreak.adsIterator();
                flag = true;
            } else
            {
                _availableAdIterator = null;
            }
        }
        if (_availableAdIterator != null) goto _L2; else goto _L1
_L1:
        ad = null;
_L4:
        return ad;
_L2:
        Ad ad1;
        ad1 = (Ad)_availableAdIterator.next();
        ad = ad1;
        if (ad1.getDuration() <= l) goto _L4; else goto _L3
    }

    private String getNextLinearTag()
    {
        _linearTagIndex = _linearTagIndex + 1L;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("linear_").append(_linearTagIndex);
        return stringbuilder.toString();
    }

    private void handleInvalidMetadata(Exception exception)
    {
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#handleInvalidMetadata").toString(), exception.getMessage());
        com.adobe.mediacore.MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(com.adobe.mediacore.MediaPlayerNotification.ErrorCode.AD_RESOLVER_METADATA_INVALID, "Invalid JSON metadata.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("DESCRIPTION", exception.getMessage());
        error.setMetadata(metadatanode);
        notifyResolveError(error);
    }

    private boolean isAlreadyPositioned(AdBreakPlacement adbreakplacement)
    {
        return adbreakplacement.getTime() >= 0L;
    }

    private void processMetadata(Metadata metadata)
    {
        metadata = metadata.getValue("json_metadata");
        if (metadata == null) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = extractAdBreakPlacements(metadata);
        metadata = new ArrayList();
        obj = ((List) (obj)).iterator();
_L7:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        Object obj1 = (AdBreakPlacement)((Iterator) (obj)).next();
        if (!isAlreadyPositioned(((AdBreakPlacement) (obj1)))) goto _L6; else goto _L5
_L5:
        _positionedAdBreakPlacements.add(obj1);
          goto _L7
        metadata;
        handleInvalidMetadata(metadata);
_L2:
        return;
_L6:
        obj1 = ((AdBreakPlacement) (obj1)).getAdBreak().adsIterator();
        while (((Iterator) (obj1)).hasNext()) 
        {
            metadata.add(((Iterator) (obj1)).next());
        }
          goto _L7
        metadata;
        handleInvalidMetadata(metadata);
        return;
_L4:
        if (metadata.size() <= 0) goto _L2; else goto _L8
_L8:
        _availableAdBreak = AdBreak.createAdBreak(metadata, -1L, 0L, "availableAdBreak");
        return;
          goto _L7
    }

    protected boolean doCanResolve(PlacementOpportunity placementopportunity)
    {
        return placementopportunity.getPlacementInformation().getMode() == PlacementInformation.Mode.INSERT;
    }

    protected ContentTracker doProvideAdTracker()
    {
        return null;
    }

    protected void doResolveAds(Metadata metadata, PlacementOpportunity placementopportunity)
    {
        if (_positionedAdBreakPlacements.size() == 0 || _availableAdBreak == null)
        {
            processMetadata(extractMetadata(metadata));
        }
        if (placementopportunity.getPlacementInformation() == null || placementopportunity.getPlacementInformation().getType() == PlacementInformation.Type.SERVER_MAP)
        {
            metadata = _positionedAdBreakPlacements;
        } else
        if (placementopportunity.getPlacementInformation().getType() == PlacementInformation.Type.PRE_ROLL)
        {
            if (_positionedAdBreakPlacements.size() > 0)
            {
                AdBreak adbreak = ((AdBreakPlacement)_positionedAdBreakPlacements.get(0)).getAdBreak();
                metadata = new ArrayList();
                metadata.add(new AdBreakPlacement(adbreak.cloneFor(placementopportunity.getPlacementInformation()), placementopportunity.getPlacementInformation()));
            } else
            {
                metadata = Collections.emptyList();
            }
        } else
        {
            metadata = createAdBreakPlacementsFor(placementopportunity.getPlacementInformation());
        }
        notifyResolveComplete(metadata);
    }



/*
    static int access$108(MetadataResolver metadataresolver)
    {
        int i = metadataresolver._nextAvailableAdId;
        metadataresolver._nextAvailableAdId = i + 1;
        return i;
    }

*/
}
