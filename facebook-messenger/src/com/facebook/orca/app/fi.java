// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.auth.b.b;
import com.facebook.orca.prefs.n;
import com.facebook.orca.prefs.o;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.e;
import com.facebook.prefs.shared.j;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.app:
//            fg, dt, g

class fi
    implements Runnable
{

    final ae a;
    final fg b;

    fi(fg fg1, ae ae1)
    {
        b = fg1;
        a = ae1;
        super();
    }

    public void run()
    {
        if (com.facebook.orca.app.fg.b(b).a(a, false)) goto _L2; else goto _L1
_L1:
        if (fg.c(b).b())
        {
            dt dt1 = (dt)fg.d(b).b();
            dt1.b();
            dt1.c();
        }
_L4:
        com.facebook.orca.app.fg.e(b).a();
        return;
_L2:
        if (n.g.equals(a))
        {
            e e1 = com.facebook.orca.app.fg.b(b).b();
            e1.a(o.j, true);
            e1.a();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
