// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class ic extends kl
{

    private final String eventName = "PROFILE_ADDRESS_BOOK_CONTACT_PERMISSION_DENY";
    public hR source;
    public iP sourcePage;
    public jM verificationType;

    public ic()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "PROFILE_ADDRESS_BOOK_CONTACT_PERMISSION_DENY");
        if (source != null)
        {
            hashmap.put("source", source);
        }
        if (sourcePage != null)
        {
            hashmap.put("source_page", sourcePage);
        }
        if (verificationType != null)
        {
            hashmap.put("verification_type", verificationType);
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
            obj = (ic)obj;
            if (source == null ? ((ic) (obj)).source != null : !source.equals(((ic) (obj)).source))
            {
                return false;
            }
            if (sourcePage == null ? ((ic) (obj)).sourcePage != null : !sourcePage.equals(((ic) (obj)).sourcePage))
            {
                return false;
            }
            if (verificationType == null ? ((ic) (obj)).verificationType != null : !verificationType.equals(((ic) (obj)).verificationType))
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
        } else
        {
            j = 0;
        }
        if (verificationType != null)
        {
            k = verificationType.hashCode();
        }
        return (j + (i + l * 31) * 31) * 31 + k;
    }
}
