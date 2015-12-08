// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class fV extends kl
{

    private final String eventName = "APP_APPLICATION_INSTALL";
    public jQ source;

    public fV()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "APP_APPLICATION_INSTALL");
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
            obj = (fV)obj;
            if (source == null ? ((fV) (obj)).source != null : !source.equals(((fV) (obj)).source))
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
