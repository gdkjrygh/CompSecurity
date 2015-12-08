// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class hG extends kl
{

    private final String eventName = "HERE_SESSION_END";
    public Double view_time_sec;

    public hG()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "HERE_SESSION_END");
        if (view_time_sec != null)
        {
            hashmap.put("view_time_sec", view_time_sec);
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
            obj = (hG)obj;
            if (view_time_sec == null ? ((hG) (obj)).view_time_sec != null : !view_time_sec.equals(((hG) (obj)).view_time_sec))
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
        if (view_time_sec != null)
        {
            i = view_time_sec.hashCode();
        } else
        {
            i = 0;
        }
        return i + j * 31;
    }
}
