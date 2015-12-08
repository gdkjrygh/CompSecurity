// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class iT extends kl
{

    private final String eventName = "PROFILE_USERNAME_FRIEND_REQUEST_SENT";
    public iR source;

    public iT()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "PROFILE_USERNAME_FRIEND_REQUEST_SENT");
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
            obj = (iT)obj;
            if (source == null ? ((iT) (obj)).source != null : !source.equals(((iT) (obj)).source))
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
        if (source != null)
        {
            i = source.hashCode();
        } else
        {
            i = 0;
        }
        return i + j * 31;
    }
}
