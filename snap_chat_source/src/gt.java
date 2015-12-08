// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class gt extends kl
{

    public Long camera;
    private Long caption;
    private Boolean drawing;
    private final String eventName = "DIRECT_SNAP_CREATE";
    private String filter;
    private String filterGeofence;
    private hs filterInfo;
    private String filterLensId;
    private String filterSponsor;
    private hv filterType;
    private hw filterVisual;
    public Boolean flash;
    public hJ mediaType;
    public Double snapTimeSec;
    public jP source;

    public gt()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "DIRECT_SNAP_CREATE");
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
        if (filterLensId != null)
        {
            hashmap.put("filter_lens_id", filterLensId);
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
        if (mediaType != null)
        {
            hashmap.put("media_type", mediaType);
        }
        if (snapTimeSec != null)
        {
            hashmap.put("snap_time_sec", snapTimeSec);
        }
        if (source != null)
        {
            hashmap.put("source", source);
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
            obj = (gt)obj;
            if (camera == null ? ((gt) (obj)).camera != null : !camera.equals(((gt) (obj)).camera))
            {
                return false;
            }
            if (caption == null ? ((gt) (obj)).caption != null : !caption.equals(((gt) (obj)).caption))
            {
                return false;
            }
            if (drawing == null ? ((gt) (obj)).drawing != null : !drawing.equals(((gt) (obj)).drawing))
            {
                return false;
            }
            if (filter == null ? ((gt) (obj)).filter != null : !filter.equals(((gt) (obj)).filter))
            {
                return false;
            }
            if (filterGeofence == null ? ((gt) (obj)).filterGeofence != null : !filterGeofence.equals(((gt) (obj)).filterGeofence))
            {
                return false;
            }
            if (filterInfo == null ? ((gt) (obj)).filterInfo != null : !filterInfo.equals(((gt) (obj)).filterInfo))
            {
                return false;
            }
            if (filterLensId == null ? ((gt) (obj)).filterLensId != null : !filterLensId.equals(((gt) (obj)).filterLensId))
            {
                return false;
            }
            if (filterSponsor == null ? ((gt) (obj)).filterSponsor != null : !filterSponsor.equals(((gt) (obj)).filterSponsor))
            {
                return false;
            }
            if (filterType == null ? ((gt) (obj)).filterType != null : !filterType.equals(((gt) (obj)).filterType))
            {
                return false;
            }
            if (filterVisual == null ? ((gt) (obj)).filterVisual != null : !filterVisual.equals(((gt) (obj)).filterVisual))
            {
                return false;
            }
            if (flash == null ? ((gt) (obj)).flash != null : !flash.equals(((gt) (obj)).flash))
            {
                return false;
            }
            if (mediaType == null ? ((gt) (obj)).mediaType != null : !mediaType.equals(((gt) (obj)).mediaType))
            {
                return false;
            }
            if (snapTimeSec == null ? ((gt) (obj)).snapTimeSec != null : !snapTimeSec.equals(((gt) (obj)).snapTimeSec))
            {
                return false;
            }
            if (source == null ? ((gt) (obj)).source != null : !source.equals(((gt) (obj)).source))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j3 = 0;
        int k3 = super.hashCode();
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
        if (camera != null)
        {
            i = camera.hashCode();
        } else
        {
            i = 0;
        }
        if (caption != null)
        {
            j = caption.hashCode();
        } else
        {
            j = 0;
        }
        if (drawing != null)
        {
            k = drawing.hashCode();
        } else
        {
            k = 0;
        }
        if (filter != null)
        {
            l = filter.hashCode();
        } else
        {
            l = 0;
        }
        if (filterGeofence != null)
        {
            i1 = filterGeofence.hashCode();
        } else
        {
            i1 = 0;
        }
        if (filterInfo != null)
        {
            j1 = filterInfo.hashCode();
        } else
        {
            j1 = 0;
        }
        if (filterLensId != null)
        {
            k1 = filterLensId.hashCode();
        } else
        {
            k1 = 0;
        }
        if (filterSponsor != null)
        {
            l1 = filterSponsor.hashCode();
        } else
        {
            l1 = 0;
        }
        if (filterType != null)
        {
            i2 = filterType.hashCode();
        } else
        {
            i2 = 0;
        }
        if (filterVisual != null)
        {
            j2 = filterVisual.hashCode();
        } else
        {
            j2 = 0;
        }
        if (flash != null)
        {
            k2 = flash.hashCode();
        } else
        {
            k2 = 0;
        }
        if (mediaType != null)
        {
            l2 = mediaType.hashCode();
        } else
        {
            l2 = 0;
        }
        if (snapTimeSec != null)
        {
            i3 = snapTimeSec.hashCode();
        } else
        {
            i3 = 0;
        }
        if (source != null)
        {
            j3 = source.hashCode();
        }
        return (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + (i + k3 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + j3;
    }
}
