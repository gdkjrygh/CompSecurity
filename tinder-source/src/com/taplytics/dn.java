// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.widget.TextView;

// Referenced classes of package com.taplytics:
//            dm, dk, dj, cv, 
//            fz, gd

final class dn
    implements Runnable
{

    final dm a;

    dn(dm dm1)
    {
        a = dm1;
        super();
    }

    public final void run()
    {
        cv.a(a.a.f.a, false);
        cv.i(a.a.f.a).a();
        a.a.d.setText(gd.a(cv.h(a.a.f.a)));
        a.a.a.setText(gd.b(cv.h(a.a.f.a)));
    }
}
