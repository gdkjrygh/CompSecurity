// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.auth.broadcast.c;
import com.facebook.orca.nux.h;
import com.facebook.orca.prefs.n;
import com.facebook.orca.prefs.o;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;

// Referenced classes of package com.facebook.orca.sms:
//            af

public class x
    implements c
{

    private final h a;
    private final d b;
    private final af c;

    public x(h h1, d d1, af af1)
    {
        a = h1;
        b = d1;
        c = af1;
    }

    public void a()
    {
        if (a.g() && a.e())
        {
            e e1 = b.b();
            e1.a(o.j, true);
            e1.a(n.g, true);
            e1.a();
            c.c();
        }
    }
}
