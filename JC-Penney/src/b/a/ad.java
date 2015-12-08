// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package b.a:
//            fg, eu, aq, cu, 
//            cv, q

public final class ad extends BroadcastReceiver
{

    private q a;
    private String b;
    private aq c;

    public ad(Context context, q q1)
    {
        a = q1;
        context = new fg(context);
        b = context.b();
        c = context.a();
    }

    public final void onReceive(Context context, Intent intent)
    {
        (new StringBuilder("CrittercismReceiver: INTENT ACTION = ")).append(intent.getAction());
        eu.b();
        context = new fg(context);
        intent = context.a();
        if (c != intent && intent != aq.c)
        {
            if (intent == aq.d)
            {
                a.a(new cu(cv.b));
            } else
            if (c == aq.d || c == aq.c)
            {
                a.a(new cu(cv.a));
            }
            c = intent;
        }
        context = context.b();
        if (!context.equals(b))
        {
            if (b.equals("unknown") || b.equals("disconnected"))
            {
                if (!context.equals("unknown") && !context.equals("disconnected"))
                {
                    a.a(new cu(cv.c, context));
                }
            } else
            if (context.equals("disconnected"))
            {
                a.a(new cu(cv.d, b));
            } else
            if (!context.equals("unknown"))
            {
                a.a(new cu(cv.e, b, context));
            }
            b = context;
        }
    }
}
