// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class gn extends kl
{

    private Long charCount;
    private final String eventName = "CHAT_CHAT_SEND";
    private hJ mediaType;
    public jQ source;

    public gn()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "CHAT_CHAT_SEND");
        if (charCount != null)
        {
            hashmap.put("char_count", charCount);
        }
        if (mediaType != null)
        {
            hashmap.put("media_type", mediaType);
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
            obj = (gn)obj;
            if (charCount == null ? ((gn) (obj)).charCount != null : !charCount.equals(((gn) (obj)).charCount))
            {
                return false;
            }
            if (mediaType == null ? ((gn) (obj)).mediaType != null : !mediaType.equals(((gn) (obj)).mediaType))
            {
                return false;
            }
            if (source == null ? ((gn) (obj)).source != null : !source.equals(((gn) (obj)).source))
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
        if (charCount != null)
        {
            i = charCount.hashCode();
        } else
        {
            i = 0;
        }
        if (mediaType != null)
        {
            j = mediaType.hashCode();
        } else
        {
            j = 0;
        }
        if (source != null)
        {
            k = source.hashCode();
        }
        return (j + (i + l * 31) * 31) * 31 + k;
    }
}
