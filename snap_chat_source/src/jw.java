// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class jw extends kl
{

    private String additionalInfo;
    private final String eventName = "REGISTRATION_USER_LOGIN_PAGEVIEW";

    public jw()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "REGISTRATION_USER_LOGIN_PAGEVIEW");
        if (additionalInfo != null)
        {
            hashmap.put("additional_info", additionalInfo);
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
            obj = (jw)obj;
            if (additionalInfo == null ? ((jw) (obj)).additionalInfo != null : !additionalInfo.equals(((jw) (obj)).additionalInfo))
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
        if (additionalInfo != null)
        {
            i = additionalInfo.hashCode();
        } else
        {
            i = 0;
        }
        return i + j * 31;
    }
}
