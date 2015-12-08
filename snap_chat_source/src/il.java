// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class il extends kl
{

    public Long charCount;
    private final String eventName = "PROFILE_ADDRESS_BOOK_SEARCH_CLEAR";

    public il()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "PROFILE_ADDRESS_BOOK_SEARCH_CLEAR");
        if (charCount != null)
        {
            hashmap.put("char_count", charCount);
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
            obj = (il)obj;
            if (charCount == null ? ((il) (obj)).charCount != null : !charCount.equals(((il) (obj)).charCount))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = super.hashCode();
        int i;
        if (charCount != null)
        {
            i = charCount.hashCode();
        } else
        {
            i = 0;
        }
        return i + j * 31;
    }
}
