// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.e;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import com.appboy.h;

// Referenced classes of package com.appboy.e:
//            e, c, a, f

public class b
    implements h
{

    private static volatile b a = null;

    public b()
    {
    }

    public static b a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/appboy/e/b;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new b();
        }
        com/appboy/e/b;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/appboy/e/b;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Notification a(com.appboy.a.b b1, Context context, Bundle bundle, Bundle bundle1)
    {
        android.support.v4.app.NotificationCompat.Builder builder = (new android.support.v4.app.NotificationCompat.Builder(context)).setAutoCancel(true);
        e.a(builder, bundle);
        e.b(builder, bundle);
        e.c(builder, bundle);
        e.a(context, builder, bundle);
        int i = e.a(b1, builder);
        e.a(context, b1, builder);
        e.d(builder, bundle);
        if (android.os.Build.VERSION.SDK_INT >= 11 && android.os.Build.VERSION.SDK_INT < 16)
        {
            android.widget.RemoteViews remoteviews = c.a(context, bundle, i);
            if (remoteviews != null)
            {
                builder.setContent(remoteviews);
                return builder.build();
            }
        }
        e.e(builder, bundle);
        e.f(builder, bundle);
        e.a(context, builder, bundle, bundle1);
        com.appboy.e.a.a(context, builder, bundle);
        e.a(b1, builder, bundle);
        e.g(builder, bundle);
        com.appboy.e.e.h(builder, bundle);
        e.a(context, b1, builder, bundle);
        f.a(context, builder, bundle);
        return builder.build();
    }

}
