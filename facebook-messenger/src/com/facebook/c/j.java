// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.c;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.common.base.Preconditions;
import java.util.Iterator;

// Referenced classes of package com.facebook.c:
//            q, k, b

public class j
{

    private final String a;
    private final String b;

    public j(Context context)
    {
        this(context.getPackageName());
    }

    j(String s)
    {
        a = (String)Preconditions.checkNotNull(s);
        b = (new StringBuilder()).append(s).append(".permission.CROSS_PROCESS_BROADCAST_MANAGER").toString();
    }

    public q a(q q1, Handler handler, Context context)
    {
        IntentFilter intentfilter = new IntentFilter();
        for (Iterator iterator = q1.b().iterator(); iterator.hasNext(); intentfilter.addAction((String)iterator.next())) { }
        context.registerReceiver(q1, intentfilter, b, handler);
        return q1;
    }

    public q a(String s, b b1, Handler handler, Context context)
    {
        return a(((q) (new k(s, b1))), handler, context);
    }

    public String a()
    {
        return a;
    }

    public void a(Intent intent, Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            intent.setPackage(a());
            context.sendBroadcast(intent);
            return;
        } else
        {
            context.sendBroadcast(intent, b);
            return;
        }
    }
}
