// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import java.util.Locale;

final class oqw
    implements omb, opp, opr, opu, opv
{

    private Activity a;
    private volatile boolean b;
    private orc c;

    public oqw(Activity activity, opd opd1)
    {
        a = activity;
        opd1.a(this);
    }

    public final void V_()
    {
        if (b)
        {
            c.a(a);
            b = false;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (orc)olm1.a(orc);
    }

    public final void al_()
    {
        if (!b)
        {
            orc orc1 = c;
            Activity activity = a;
            orc1.a("visible");
            if (!orc1.c)
            {
                orc1.a = orc1.a + 1;
                orc1.b(String.format(Locale.US, "count=%d", new Object[] {
                    Integer.valueOf(orc1.a)
                }));
                orc1.b(activity);
            }
            orc1.c = orc1.a();
            orc1.b();
            b = true;
        }
    }

    public final void am_()
    {
        if (b)
        {
            PowerManager powermanager = (PowerManager)a.getSystemService("power");
            boolean flag;
            if (android.os.Build.VERSION.SDK_INT >= 20 && !powermanager.isInteractive() || android.os.Build.VERSION.SDK_INT < 20 && !powermanager.isScreenOn())
            {
                flag = true;
            } else
            {
                flag = ((KeyguardManager)a.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            }
            if (flag)
            {
                c.a(a);
                b = false;
            }
        }
    }
}
