// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class jx extends kl
{

    private String additionalInfo;
    public Long attemptCount;
    private final String eventName = "REGISTRATION_USER_PHONE_ATTEMPT";

    public jx()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "REGISTRATION_USER_PHONE_ATTEMPT");
        if (additionalInfo != null)
        {
            hashmap.put("additional_info", additionalInfo);
        }
        if (attemptCount != null)
        {
            hashmap.put("attempt_count", attemptCount);
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
            obj = (jx)obj;
            if (additionalInfo == null ? ((jx) (obj)).additionalInfo != null : !additionalInfo.equals(((jx) (obj)).additionalInfo))
            {
                return false;
            }
            if (attemptCount == null ? ((jx) (obj)).attemptCount != null : !attemptCount.equals(((jx) (obj)).attemptCount))
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
        if (additionalInfo != null)
        {
            i = additionalInfo.hashCode();
        } else
        {
            i = 0;
        }
        if (attemptCount != null)
        {
            j = attemptCount.hashCode();
        }
        return (i + k * 31) * 31 + j;
    }
}
