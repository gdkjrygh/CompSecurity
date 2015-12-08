// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class ge extends kl
{

    private final String eventName = "CAMERA_PAGE_VIEW";
    public hn exitEvent;
    private Long filterGeofilterCount;
    public Long filterGeolensCount;
    public Long filterLensCount;
    public Long filterLensStoreCount;
    public gd pageName;
    public Double viewTimeSec;
    private Boolean withFilterLensSwipe;
    public Boolean withGeolocation;

    public ge()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "CAMERA_PAGE_VIEW");
        if (exitEvent != null)
        {
            hashmap.put("exit_event", exitEvent);
        }
        if (filterGeofilterCount != null)
        {
            hashmap.put("filter_geofilter_count", filterGeofilterCount);
        }
        if (filterGeolensCount != null)
        {
            hashmap.put("filter_geolens_count", filterGeolensCount);
        }
        if (filterLensCount != null)
        {
            hashmap.put("filter_lens_count", filterLensCount);
        }
        if (filterLensStoreCount != null)
        {
            hashmap.put("filter_lens_store_count", filterLensStoreCount);
        }
        if (pageName != null)
        {
            hashmap.put("page_name", pageName);
        }
        if (viewTimeSec != null)
        {
            hashmap.put("view_time_sec", viewTimeSec);
        }
        if (withFilterLensSwipe != null)
        {
            hashmap.put("with_filter_lens_swipe", withFilterLensSwipe);
        }
        if (withGeolocation != null)
        {
            hashmap.put("with_geolocation", withGeolocation);
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
            obj = (ge)obj;
            if (exitEvent == null ? ((ge) (obj)).exitEvent != null : !exitEvent.equals(((ge) (obj)).exitEvent))
            {
                return false;
            }
            if (filterGeofilterCount == null ? ((ge) (obj)).filterGeofilterCount != null : !filterGeofilterCount.equals(((ge) (obj)).filterGeofilterCount))
            {
                return false;
            }
            if (filterGeolensCount == null ? ((ge) (obj)).filterGeolensCount != null : !filterGeolensCount.equals(((ge) (obj)).filterGeolensCount))
            {
                return false;
            }
            if (filterLensCount == null ? ((ge) (obj)).filterLensCount != null : !filterLensCount.equals(((ge) (obj)).filterLensCount))
            {
                return false;
            }
            if (filterLensStoreCount == null ? ((ge) (obj)).filterLensStoreCount != null : !filterLensStoreCount.equals(((ge) (obj)).filterLensStoreCount))
            {
                return false;
            }
            if (pageName == null ? ((ge) (obj)).pageName != null : !pageName.equals(((ge) (obj)).pageName))
            {
                return false;
            }
            if (viewTimeSec == null ? ((ge) (obj)).viewTimeSec != null : !viewTimeSec.equals(((ge) (obj)).viewTimeSec))
            {
                return false;
            }
            if (withFilterLensSwipe == null ? ((ge) (obj)).withFilterLensSwipe != null : !withFilterLensSwipe.equals(((ge) (obj)).withFilterLensSwipe))
            {
                return false;
            }
            if (withGeolocation == null ? ((ge) (obj)).withGeolocation != null : !withGeolocation.equals(((ge) (obj)).withGeolocation))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i2 = 0;
        int j2 = super.hashCode();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        if (exitEvent != null)
        {
            i = exitEvent.hashCode();
        } else
        {
            i = 0;
        }
        if (filterGeofilterCount != null)
        {
            j = filterGeofilterCount.hashCode();
        } else
        {
            j = 0;
        }
        if (filterGeolensCount != null)
        {
            k = filterGeolensCount.hashCode();
        } else
        {
            k = 0;
        }
        if (filterLensCount != null)
        {
            l = filterLensCount.hashCode();
        } else
        {
            l = 0;
        }
        if (filterLensStoreCount != null)
        {
            i1 = filterLensStoreCount.hashCode();
        } else
        {
            i1 = 0;
        }
        if (pageName != null)
        {
            j1 = pageName.hashCode();
        } else
        {
            j1 = 0;
        }
        if (viewTimeSec != null)
        {
            k1 = viewTimeSec.hashCode();
        } else
        {
            k1 = 0;
        }
        if (withFilterLensSwipe != null)
        {
            l1 = withFilterLensSwipe.hashCode();
        } else
        {
            l1 = 0;
        }
        if (withGeolocation != null)
        {
            i2 = withGeolocation.hashCode();
        }
        return (l1 + (k1 + (j1 + (i1 + (l + (k + (j + (i + j2 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i2;
    }
}
