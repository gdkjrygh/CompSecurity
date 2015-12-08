// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import com.leanplum.callbacks.StartCallback;
import java.util.HashMap;

// Referenced classes of package com.leanplum:
//            g, T, Leanplum

final class w extends StartCallback
{

    private final String a;

    w(String s)
    {
        a = s;
        super();
    }

    public final void onResponse(boolean flag)
    {
        if (g.a())
        {
            return;
        } else
        {
            HashMap hashmap = new HashMap();
            hashmap.put("gcmRegistrationId", a);
            T.b("setDeviceAttributes", hashmap).e();
            Leanplum.removeStartResponseHandler(Leanplum.o());
            return;
        }
    }
}
