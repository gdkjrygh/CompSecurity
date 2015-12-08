// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//            u, ag, r, be

final class v extends BroadcastReceiver
{

    final be a;
    final u b;

    v(u u1, be be)
    {
        b = u1;
        a = be;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        boolean flag1 = false;
        String s;
        context = u.a(b);
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
            context.b = ag.b;
        }
          goto _L4
label1:
        {
            if (!s.equals("android.intent.action.BATTERY_OKAY"))
            {
                break label1;
            }
            context.b = ag.c;
            context = r.a;
        }
          goto _L4
        AppboyLogger.w(r.a, String.format("Unexpected system broadcast received [%s]", new Object[] {
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
                context.b = ag.d;
                intent = r.a;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                AppboyLogger.e(u.d(), "Failed to process battery event.", context);
                intent = b;
                u.a(a, context);
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
