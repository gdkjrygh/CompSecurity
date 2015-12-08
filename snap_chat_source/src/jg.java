// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class jg extends kl
{

    private final String eventName = "REGISTRATION_USER_CONTACT_PAGEVIEW";
    private jM verificationType;

    public jg()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "REGISTRATION_USER_CONTACT_PAGEVIEW");
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
            obj = (jg)obj;
            if (verificationType == null ? ((jg) (obj)).verificationType != null : !verificationType.equals(((jg) (obj)).verificationType))
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
        if (verificationType != null)
        {
            i = verificationType.hashCode();
        } else
        {
            i = 0;
        }
        return i + j * 31;
    }
}
