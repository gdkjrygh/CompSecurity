// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.analytics.d.a;
import com.fasterxml.jackson.databind.JsonNode;

// Referenced classes of package com.facebook.push.mqtt:
//            ar

public class at
    implements a
{

    private final javax.inject.a a;

    public at(javax.inject.a a1)
    {
        a = a1;
    }

    public String a()
    {
        return "persistent_mqtt";
    }

    public boolean b()
    {
        return a.b() == ar.ALWAYS;
    }

    public JsonNode c()
    {
        return null;
    }
}
