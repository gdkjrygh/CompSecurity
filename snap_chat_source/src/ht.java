// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class ht extends kl
{

    public Boolean automaticDownload;
    public Double downloadTimeSec;
    private final String eventName = "FILTER_LENS_DOWNLOAD";
    public String filterLensId;

    public ht()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "FILTER_LENS_DOWNLOAD");
        if (automaticDownload != null)
        {
            hashmap.put("automatic_download", automaticDownload);
        }
        if (downloadTimeSec != null)
        {
            hashmap.put("download_time_sec", downloadTimeSec);
        }
        if (filterLensId != null)
        {
            hashmap.put("filter_lens_id", filterLensId);
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
            obj = (ht)obj;
            if (automaticDownload == null ? ((ht) (obj)).automaticDownload != null : !automaticDownload.equals(((ht) (obj)).automaticDownload))
            {
                return false;
            }
            if (downloadTimeSec == null ? ((ht) (obj)).downloadTimeSec != null : !downloadTimeSec.equals(((ht) (obj)).downloadTimeSec))
            {
                return false;
            }
            if (filterLensId == null ? ((ht) (obj)).filterLensId != null : !filterLensId.equals(((ht) (obj)).filterLensId))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k = 0;
        int l = super.hashCode();
        int i;
        int j;
        if (automaticDownload != null)
        {
            i = automaticDownload.hashCode();
        } else
        {
            i = 0;
        }
        if (downloadTimeSec != null)
        {
            j = downloadTimeSec.hashCode();
        } else
        {
            j = 0;
        }
        if (filterLensId != null)
        {
            k = filterLensId.hashCode();
        }
        return (j + (i + l * 31) * 31) * 31 + k;
    }
}
