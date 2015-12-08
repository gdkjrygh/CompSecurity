// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class hO extends kl
{

    private final String eventName = "MINIPROFILE_SNAPBUTTON_CLICK";
    public Boolean hasProfilePic;
    public hR source;
    public iP sourcePage;

    public hO()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "MINIPROFILE_SNAPBUTTON_CLICK");
        if (hasProfilePic != null)
        {
            hashmap.put("has_profile_pic", hasProfilePic);
        }
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
            obj = (hO)obj;
            if (hasProfilePic == null ? ((hO) (obj)).hasProfilePic != null : !hasProfilePic.equals(((hO) (obj)).hasProfilePic))
            {
                return false;
            }
            if (source == null ? ((hO) (obj)).source != null : !source.equals(((hO) (obj)).source))
            {
                return false;
            }
            if (sourcePage == null ? ((hO) (obj)).sourcePage != null : !sourcePage.equals(((hO) (obj)).sourcePage))
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
        if (hasProfilePic != null)
        {
            i = hasProfilePic.hashCode();
        } else
        {
            i = 0;
        }
        if (source != null)
        {
            j = source.hashCode();
        } else
        {
            j = 0;
        }
        if (sourcePage != null)
        {
            k = sourcePage.hashCode();
        }
        return (j + (i + l * 31) * 31) * 31 + k;
    }
}
