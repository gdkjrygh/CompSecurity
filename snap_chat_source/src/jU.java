// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class jU extends kl
{

    private Long adIndexCount;
    public Long adIndexPos;
    public String adRequestClientId;
    public String adUnitId;
    public String adsnapId;
    public String adsnapLineItemId;
    public String adsnapPlacementId;
    private Long camera;
    private Long caption;
    private Boolean drawing;
    private final String eventName = "STORY_AD_VIEW";
    public hn exitEvent;
    private String filter;
    private String filterGeofence;
    private hs filterInfo;
    private String filterSponsor;
    private hv filterType;
    private hw filterVisual;
    private Boolean flash;
    public Boolean fullView;
    public String geoFence;
    public hJ mediaType;
    public String posterId;
    private Long snapIndexCount;
    private Long snapIndexPos;
    public Double snapTime;
    public jQ source;
    private String sponsor;
    public String storySnapId;
    public ki storyType;
    public Double timeViewed;
    public Long viewLocation;

    public jU()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "STORY_AD_VIEW");
        if (adIndexCount != null)
        {
            hashmap.put("ad_index_count", adIndexCount);
        }
        if (adIndexPos != null)
        {
            hashmap.put("ad_index_pos", adIndexPos);
        }
        if (adRequestClientId != null)
        {
            hashmap.put("ad_request_client_id", adRequestClientId);
        }
        if (adUnitId != null)
        {
            hashmap.put("ad_unit_id", adUnitId);
        }
        if (adsnapId != null)
        {
            hashmap.put("adsnap_id", adsnapId);
        }
        if (adsnapLineItemId != null)
        {
            hashmap.put("adsnap_line_item_id", adsnapLineItemId);
        }
        if (adsnapPlacementId != null)
        {
            hashmap.put("adsnap_placement_id", adsnapPlacementId);
        }
        if (camera != null)
        {
            hashmap.put("camera", camera);
        }
        if (caption != null)
        {
            hashmap.put("caption", caption);
        }
        if (drawing != null)
        {
            hashmap.put("drawing", drawing);
        }
        if (exitEvent != null)
        {
            hashmap.put("exit_event", exitEvent);
        }
        if (filter != null)
        {
            hashmap.put("filter", filter);
        }
        if (filterGeofence != null)
        {
            hashmap.put("filter_geofence", filterGeofence);
        }
        if (filterInfo != null)
        {
            hashmap.put("filter_info", filterInfo);
        }
        if (filterSponsor != null)
        {
            hashmap.put("filter_sponsor", filterSponsor);
        }
        if (filterType != null)
        {
            hashmap.put("filter_type", filterType);
        }
        if (filterVisual != null)
        {
            hashmap.put("filter_visual", filterVisual);
        }
        if (flash != null)
        {
            hashmap.put("flash", flash);
        }
        if (fullView != null)
        {
            hashmap.put("full_view", fullView);
        }
        if (geoFence != null)
        {
            hashmap.put("geo_fence", geoFence);
        }
        if (mediaType != null)
        {
            hashmap.put("media_type", mediaType);
        }
        if (posterId != null)
        {
            hashmap.put("poster_id", posterId);
        }
        if (snapIndexCount != null)
        {
            hashmap.put("snap_index_count", snapIndexCount);
        }
        if (snapIndexPos != null)
        {
            hashmap.put("snap_index_pos", snapIndexPos);
        }
        if (snapTime != null)
        {
            hashmap.put("snap_time", snapTime);
        }
        if (source != null)
        {
            hashmap.put("source", source);
        }
        if (sponsor != null)
        {
            hashmap.put("sponsor", sponsor);
        }
        if (storySnapId != null)
        {
            hashmap.put("story_snap_id", storySnapId);
        }
        if (storyType != null)
        {
            hashmap.put("story_type", storyType);
        }
        if (timeViewed != null)
        {
            hashmap.put("time_viewed", timeViewed);
        }
        if (viewLocation != null)
        {
            hashmap.put("view_location", viewLocation);
        }
        hashmap.putAll(super.a());
        return hashmap;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            if (!super.equals(obj))
            {
                return false;
            }
            obj = (jU)obj;
            if (adIndexCount == null ? ((jU) (obj)).adIndexCount != null : !adIndexCount.equals(((jU) (obj)).adIndexCount))
            {
                return false;
            }
            if (adIndexPos == null ? ((jU) (obj)).adIndexPos != null : !adIndexPos.equals(((jU) (obj)).adIndexPos))
            {
                return false;
            }
            if (adRequestClientId == null ? ((jU) (obj)).adRequestClientId != null : !adRequestClientId.equals(((jU) (obj)).adRequestClientId))
            {
                return false;
            }
            if (adUnitId == null ? ((jU) (obj)).adUnitId != null : !adUnitId.equals(((jU) (obj)).adUnitId))
            {
                return false;
            }
            if (adsnapId == null ? ((jU) (obj)).adsnapId != null : !adsnapId.equals(((jU) (obj)).adsnapId))
            {
                return false;
            }
            if (adsnapLineItemId == null ? ((jU) (obj)).adsnapLineItemId != null : !adsnapLineItemId.equals(((jU) (obj)).adsnapLineItemId))
            {
                return false;
            }
            if (adsnapPlacementId == null ? ((jU) (obj)).adsnapPlacementId != null : !adsnapPlacementId.equals(((jU) (obj)).adsnapPlacementId))
            {
                return false;
            }
            if (camera == null ? ((jU) (obj)).camera != null : !camera.equals(((jU) (obj)).camera))
            {
                return false;
            }
            if (caption == null ? ((jU) (obj)).caption != null : !caption.equals(((jU) (obj)).caption))
            {
                return false;
            }
            if (drawing == null ? ((jU) (obj)).drawing != null : !drawing.equals(((jU) (obj)).drawing))
            {
                return false;
            }
            if (exitEvent == null ? ((jU) (obj)).exitEvent != null : !exitEvent.equals(((jU) (obj)).exitEvent))
            {
                return false;
            }
            if (filter == null ? ((jU) (obj)).filter != null : !filter.equals(((jU) (obj)).filter))
            {
                return false;
            }
            if (filterGeofence == null ? ((jU) (obj)).filterGeofence != null : !filterGeofence.equals(((jU) (obj)).filterGeofence))
            {
                return false;
            }
            if (filterInfo == null ? ((jU) (obj)).filterInfo != null : !filterInfo.equals(((jU) (obj)).filterInfo))
            {
                return false;
            }
            if (filterSponsor == null ? ((jU) (obj)).filterSponsor != null : !filterSponsor.equals(((jU) (obj)).filterSponsor))
            {
                return false;
            }
            if (filterType == null ? ((jU) (obj)).filterType != null : !filterType.equals(((jU) (obj)).filterType))
            {
                return false;
            }
            if (filterVisual == null ? ((jU) (obj)).filterVisual != null : !filterVisual.equals(((jU) (obj)).filterVisual))
            {
                return false;
            }
            if (flash == null ? ((jU) (obj)).flash != null : !flash.equals(((jU) (obj)).flash))
            {
                return false;
            }
            if (fullView == null ? ((jU) (obj)).fullView != null : !fullView.equals(((jU) (obj)).fullView))
            {
                return false;
            }
            if (geoFence == null ? ((jU) (obj)).geoFence != null : !geoFence.equals(((jU) (obj)).geoFence))
            {
                return false;
            }
            if (mediaType == null ? ((jU) (obj)).mediaType != null : !mediaType.equals(((jU) (obj)).mediaType))
            {
                return false;
            }
            if (posterId == null ? ((jU) (obj)).posterId != null : !posterId.equals(((jU) (obj)).posterId))
            {
                return false;
            }
            if (snapIndexCount == null ? ((jU) (obj)).snapIndexCount != null : !snapIndexCount.equals(((jU) (obj)).snapIndexCount))
            {
                return false;
            }
            if (snapIndexPos == null ? ((jU) (obj)).snapIndexPos != null : !snapIndexPos.equals(((jU) (obj)).snapIndexPos))
            {
                return false;
            }
            if (snapTime == null ? ((jU) (obj)).snapTime != null : !snapTime.equals(((jU) (obj)).snapTime))
            {
                return false;
            }
            if (source == null ? ((jU) (obj)).source != null : !source.equals(((jU) (obj)).source))
            {
                return false;
            }
            if (sponsor == null ? ((jU) (obj)).sponsor != null : !sponsor.equals(((jU) (obj)).sponsor))
            {
                return false;
            }
            if (storySnapId == null ? ((jU) (obj)).storySnapId != null : !storySnapId.equals(((jU) (obj)).storySnapId))
            {
                return false;
            }
            if (storyType == null ? ((jU) (obj)).storyType != null : !storyType.equals(((jU) (obj)).storyType))
            {
                return false;
            }
            if (timeViewed == null ? ((jU) (obj)).timeViewed != null : !timeViewed.equals(((jU) (obj)).timeViewed))
            {
                return false;
            }
            if (viewLocation == null ? ((jU) (obj)).viewLocation != null : !viewLocation.equals(((jU) (obj)).viewLocation))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k7 = 0;
        int l7 = super.hashCode();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        int l5;
        int i6;
        int j6;
        int k6;
        int l6;
        int i7;
        int j7;
        if (adIndexCount != null)
        {
            i = adIndexCount.hashCode();
        } else
        {
            i = 0;
        }
        if (adIndexPos != null)
        {
            j = adIndexPos.hashCode();
        } else
        {
            j = 0;
        }
        if (adRequestClientId != null)
        {
            k = adRequestClientId.hashCode();
        } else
        {
            k = 0;
        }
        if (adUnitId != null)
        {
            l = adUnitId.hashCode();
        } else
        {
            l = 0;
        }
        if (adsnapId != null)
        {
            i1 = adsnapId.hashCode();
        } else
        {
            i1 = 0;
        }
        if (adsnapLineItemId != null)
        {
            j1 = adsnapLineItemId.hashCode();
        } else
        {
            j1 = 0;
        }
        if (adsnapPlacementId != null)
        {
            k1 = adsnapPlacementId.hashCode();
        } else
        {
            k1 = 0;
        }
        if (camera != null)
        {
            l1 = camera.hashCode();
        } else
        {
            l1 = 0;
        }
        if (caption != null)
        {
            i2 = caption.hashCode();
        } else
        {
            i2 = 0;
        }
        if (drawing != null)
        {
            j2 = drawing.hashCode();
        } else
        {
            j2 = 0;
        }
        if (exitEvent != null)
        {
            k2 = exitEvent.hashCode();
        } else
        {
            k2 = 0;
        }
        if (filter != null)
        {
            l2 = filter.hashCode();
        } else
        {
            l2 = 0;
        }
        if (filterGeofence != null)
        {
            i3 = filterGeofence.hashCode();
        } else
        {
            i3 = 0;
        }
        if (filterInfo != null)
        {
            j3 = filterInfo.hashCode();
        } else
        {
            j3 = 0;
        }
        if (filterSponsor != null)
        {
            k3 = filterSponsor.hashCode();
        } else
        {
            k3 = 0;
        }
        if (filterType != null)
        {
            l3 = filterType.hashCode();
        } else
        {
            l3 = 0;
        }
        if (filterVisual != null)
        {
            i4 = filterVisual.hashCode();
        } else
        {
            i4 = 0;
        }
        if (flash != null)
        {
            j4 = flash.hashCode();
        } else
        {
            j4 = 0;
        }
        if (fullView != null)
        {
            k4 = fullView.hashCode();
        } else
        {
            k4 = 0;
        }
        if (geoFence != null)
        {
            l4 = geoFence.hashCode();
        } else
        {
            l4 = 0;
        }
        if (mediaType != null)
        {
            i5 = mediaType.hashCode();
        } else
        {
            i5 = 0;
        }
        if (posterId != null)
        {
            j5 = posterId.hashCode();
        } else
        {
            j5 = 0;
        }
        if (snapIndexCount != null)
        {
            k5 = snapIndexCount.hashCode();
        } else
        {
            k5 = 0;
        }
        if (snapIndexPos != null)
        {
            l5 = snapIndexPos.hashCode();
        } else
        {
            l5 = 0;
        }
        if (snapTime != null)
        {
            i6 = snapTime.hashCode();
        } else
        {
            i6 = 0;
        }
        if (source != null)
        {
            j6 = source.hashCode();
        } else
        {
            j6 = 0;
        }
        if (sponsor != null)
        {
            k6 = sponsor.hashCode();
        } else
        {
            k6 = 0;
        }
        if (storySnapId != null)
        {
            l6 = storySnapId.hashCode();
        } else
        {
            l6 = 0;
        }
        if (storyType != null)
        {
            i7 = storyType.hashCode();
        } else
        {
            i7 = 0;
        }
        if (timeViewed != null)
        {
            j7 = timeViewed.hashCode();
        } else
        {
            j7 = 0;
        }
        if (viewLocation != null)
        {
            k7 = viewLocation.hashCode();
        }
        return (j7 + (i7 + (l6 + (k6 + (j6 + (i6 + (l5 + (k5 + (j5 + (i5 + (l4 + (k4 + (j4 + (i4 + (l3 + (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + (i + l7 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + k7;
    }
}
