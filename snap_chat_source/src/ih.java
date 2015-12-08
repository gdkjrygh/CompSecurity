// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class ih extends kl
{

    private final String eventName = "PROFILE_ADDRESS_BOOK_PAGE_VIEW";
    public Boolean hasContactAccess;
    public hR source;
    public iP sourcePage;
    public jM verificationType;

    public ih()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "PROFILE_ADDRESS_BOOK_PAGE_VIEW");
        if (hasContactAccess != null)
        {
            hashmap.put("has_contact_access", hasContactAccess);
        }
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
            obj = (ih)obj;
            if (hasContactAccess == null ? ((ih) (obj)).hasContactAccess != null : !hasContactAccess.equals(((ih) (obj)).hasContactAccess))
            {
                return false;
            }
            if (source == null ? ((ih) (obj)).source != null : !source.equals(((ih) (obj)).source))
            {
                return false;
            }
            if (sourcePage == null ? ((ih) (obj)).sourcePage != null : !sourcePage.equals(((ih) (obj)).sourcePage))
            {
                return false;
            }
            if (verificationType == null ? ((ih) (obj)).verificationType != null : !verificationType.equals(((ih) (obj)).verificationType))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l = 0;
        int i1 = super.hashCode();
        int i;
        int j;
        int k;
        if (hasContactAccess != null)
        {
            i = hasContactAccess.hashCode();
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
        } else
        {
            k = 0;
        }
        if (verificationType != null)
        {
            l = verificationType.hashCode();
        }
        return (k + (j + (i + i1 * 31) * 31) * 31) * 31 + l;
    }
}
