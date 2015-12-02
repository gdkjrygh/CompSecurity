// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.orca.prefs.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.f;

// Referenced classes of package com.facebook.orca.sms:
//            af

class ag
    implements f
{

    final af a;

    ag(af af1)
    {
        a = af1;
        super();
    }

    public void a(d d1, ae ae1)
    {
        if (n.i.equals(ae1) || n.g.equals(ae1))
        {
            boolean flag = d1.a(n.g, false);
            boolean flag1 = d1.a(n.g);
            boolean flag2 = d1.a(n.i, true);
            boolean flag3 = d1.a(n.i);
            a.a(flag, flag1, flag2, flag3);
        }
    }
}
