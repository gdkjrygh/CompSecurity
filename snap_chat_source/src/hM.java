// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class hM extends kl
{

    private final String eventName = "MINIPROFILE_PAGE_VIEW";
    public hR source;
    public iP sourcePage;

    public hM()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "MINIPROFILE_PAGE_VIEW");
        if (source != null)
        {
            hashmap.put("source", source);
        }
        if (sourcePage != null)
        {
            hashmap.put("source_page", sourcePage);
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
            obj = (hM)obj;
            if (source == null ? ((hM) (obj)).source != null : !source.equals(((hM) (obj)).source))
            {
                return false;
            }
            if (sourcePage == null ? ((hM) (obj)).sourcePage != null : !sourcePage.equals(((hM) (obj)).sourcePage))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        int k = super.hashCode();
        int i;
        if (source != null)
        {
            i = source.hashCode();
        } else
        {
            i = 0;
        }
        if (sourcePage != null)
        {
            j = sourcePage.hashCode();
        }
        return (i + k * 31) * 31 + j;
    }
}
