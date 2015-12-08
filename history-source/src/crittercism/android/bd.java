// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package crittercism.android:
//            d, dx, b, cd, 
//            az

public final class bd extends BroadcastReceiver
{

    private az a;
    private String b;
    private b c;

    public bd(Context context, az az1)
    {
        a = az1;
        context = new d(context);
        b = context.b();
        c = context.a();
    }

    public final void onReceive(Context context, Intent intent)
    {
        (new StringBuilder("CrittercismReceiver: INTENT ACTION = ")).append(intent.getAction());
        dx.b();
        context = new d(context);
        intent = context.a();
        if (c != intent && intent != b.c)
        {
            if (intent == b.d)
            {
                a.a(new cd(cd.a.b));
            } else
            if (c == b.d || c == b.c)
            {
                a.a(new cd(cd.a.a));
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
                    a.a(new cd(cd.a.c, context));
                }
            } else
            if (context.equals("disconnected"))
            {
                a.a(new cd(cd.a.d, b));
            } else
            if (!context.equals("unknown"))
            {
                a.a(new cd(cd.a.e, b, context));
            }
            b = context;
        }
    }
}
