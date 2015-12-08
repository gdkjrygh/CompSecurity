// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class jp extends kl
{

    private String emailSuggestion;
    private final String eventName = "REGISTRATION_USER_FOCUS_ON_EMAIL";

    public jp()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "REGISTRATION_USER_FOCUS_ON_EMAIL");
        if (emailSuggestion != null)
        {
            hashmap.put("email_suggestion", emailSuggestion);
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
            obj = (jp)obj;
            if (emailSuggestion == null ? ((jp) (obj)).emailSuggestion != null : !emailSuggestion.equals(((jp) (obj)).emailSuggestion))
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
        if (emailSuggestion != null)
        {
            i = emailSuggestion.hashCode();
        } else
        {
            i = 0;
        }
        return i + j * 31;
    }
}
