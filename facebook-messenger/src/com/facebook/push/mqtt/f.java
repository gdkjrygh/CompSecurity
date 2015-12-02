// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import javax.inject.a;

// Referenced classes of package com.facebook.push.mqtt:
//            as, ar

public class f
    implements as
{

    private final a a;

    public f(a a1)
    {
        a = a1;
    }

    public ar a()
    {
        if (((Boolean)a.b()).booleanValue())
        {
            return ar.DEVICE_USE;
        } else
        {
            return ar.APP_USE;
        }
    }
}
