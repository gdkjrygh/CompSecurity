// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.e;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.bi;
import com.appboy.a.b;
import com.appboy.f;
import com.appboy.i;

// Referenced classes of package com.appboy.e:
//            d, b

public class a
    implements i
{

    private static final String a;
    private static volatile a b = null;

    public a()
    {
    }

    public static a a()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/appboy/e/a;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new a();
        }
        com/appboy/e/a;
        JVM INSTR monitorexit ;
_L2:
        return b;
        Exception exception;
        exception;
        com/appboy/e/a;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Notification a(b b1, Context context, Bundle bundle, Bundle bundle1)
    {
        bi bi1 = new bi(context);
        Notification notification = bi1.B;
        notification.flags = notification.flags | 0x10;
        d.a(bi1, bundle);
        com.appboy.e.d.b(bi1, bundle);
        d.c(bi1, bundle);
        d.a(context, bi1, bundle);
        int j = d.a(b1, bi1);
        d.a(context, b1, bi1);
        d.d(bi1, bundle);
        if (android.os.Build.VERSION.SDK_INT >= 11 && android.os.Build.VERSION.SDK_INT < 16)
        {
            android.widget.RemoteViews remoteviews = com.appboy.e.b.a(context, bundle, j);
            if (remoteviews != null)
            {
                bi1.a(remoteviews);
                return bi1.b();
            }
        }
        d.e(bi1, bundle);
        com.appboy.e.d.f(bi1, bundle);
        d.a(context, bi1, bundle, bundle1);
        d.a(b1, bi1, bundle);
        d.g(bi1, bundle);
        d.h(bi1, bundle);
        d.a(context, b1, bi1, bundle);
        return bi1.b();
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, com/appboy/e/a.getName()
        });
    }
}
