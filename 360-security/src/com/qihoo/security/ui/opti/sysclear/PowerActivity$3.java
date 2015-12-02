// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.view.View;
import com.qihoo.security.locale.d;
import com.qihoo.security.support.b;
import com.qihoo360.mobilesafe.b.q;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            PowerActivity

class a
    implements android.view.ener
{

    final PowerActivity a;

    public void onClick(View view)
    {
        if (PowerActivity.a(a) == null)
        {
            return;
        }
        if (com.qihoo.security.ui.opti.sysclear.PowerActivity.b(a))
        {
            a.dismissDialog(1);
            return;
        }
        PowerActivity.a(a, true);
        view = PowerActivity.a(a).b(PowerActivity.c(a), com.qihoo.security.ui.opti.sysclear.PowerActivity.d(a));
        if (view != null)
        {
            b.c(11312);
            String s = ((a) (view)).a;
            a.c(s);
            PowerActivity.a(a).b(PowerActivity.e(a), com.qihoo.security.ui.opti.sysclear.PowerActivity.d(a), view);
            int i = PowerActivity.f(a);
            if (((a) (view)).c)
            {
                PowerActivity.c(a, PowerActivity.f(a) - ((a) (view)).d);
            }
            PowerActivity.a(a, false, PowerActivity.f(a), i);
            q.a().a(a.o.a(0x7f0c00ba, new Object[] {
                Integer.valueOf(1)
            }));
        }
        a.dismissDialog(1);
    }

    _cls9(PowerActivity poweractivity)
    {
        a = poweractivity;
        super();
    }
}
