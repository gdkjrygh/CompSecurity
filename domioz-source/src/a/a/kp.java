// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appboy.f.a;

// Referenced classes of package a.a:
//            ko, g, kl, aa

final class kp extends BroadcastReceiver
{

    final aa a;
    final ko b;

    kp(ko ko1, aa aa)
    {
        b = ko1;
        a = aa;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        boolean flag1 = false;
        String s;
        context = a.a.ko.a(b);
        s = intent.getAction();
        if (!s.equals("android.intent.action.BATTERY_CHANGED")) goto _L2; else goto _L1
_L1:
        int i = intent.getIntExtra("status", -1);
          goto _L3
_L6:
        context.c = flag1;
_L4:
        b.c();
        return;
_L2:
label0:
        {
            if (!s.equals("android.intent.action.BATTERY_LOW"))
            {
                break label0;
            }
            context.b = g.b;
        }
          goto _L4
label1:
        {
            if (!s.equals("android.intent.action.BATTERY_OKAY"))
            {
                break label1;
            }
            context.b = g.c;
            context = a.a.kl.a;
        }
          goto _L4
        com.appboy.f.a.c(a.a.kl.a, String.format("Unexpected system broadcast received [%s]", new Object[] {
            s
        }));
          goto _L4
_L3:
        boolean flag;
        if (i == 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            try
            {
                context.b = g.d;
                intent = a.a.kl.a;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                com.appboy.f.a.c(ko.d(), "Failed to process battery event.", context);
                a.a.ko.a(a, context);
                return;
            }
        }
        if (i == 2 || i == 5)
        {
            flag1 = true;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
