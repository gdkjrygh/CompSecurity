// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.fbpushdata;

import android.content.Context;
import com.facebook.analytics.cn;
import com.facebook.push.c2dm.y;
import com.facebook.push.mqtt.v;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.push.fbpushdata:
//            e, b, c

class d extends com.facebook.inject.d
{

    final b a;

    private d(b b1)
    {
        a = b1;
        super();
    }

    d(b b1, c c)
    {
        this(b1);
    }

    public e a()
    {
        return new e((ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper), (v)a(com/facebook/push/mqtt/v), (y)a(com/facebook/push/c2dm/y), (cn)a(com/facebook/analytics/cn), (Context)a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}
