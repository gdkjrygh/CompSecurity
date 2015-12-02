// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.fbpushdata;

import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.push.c2dm.d;
import com.facebook.push.mqtt.av;
import com.facebook.push.mqtt.ax;

// Referenced classes of package com.facebook.push.fbpushdata:
//            e, d, a

public class b extends c
{

    public b()
    {
    }

    protected void a()
    {
        e(com/facebook/push/mqtt/ax);
        e(com/facebook/push/c2dm/d);
        a(com/facebook/push/fbpushdata/e).a(new com.facebook.push.fbpushdata.d(this, null)).a();
        c(com/facebook/push/fbpushdata/a);
        c(com/facebook/push/mqtt/av).a(com/facebook/push/fbpushdata/e);
    }
}
