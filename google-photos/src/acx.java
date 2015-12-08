// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;

final class acx extends adb
{

    private acz a;
    private ob b;
    private acq c;

    acx(acq acq1, acz acz1, ob ob1)
    {
        c = acq1;
        a = acz1;
        b = ob1;
        super();
    }

    public final void a(View view)
    {
    }

    public final void b(View view)
    {
        b.a(null);
        mk.c(view, 1.0F);
        mk.a(view, 0.0F);
        mk.b(view, 0.0F);
        c.a(a.a, true);
        c.g.remove(a.a);
        c.c();
    }
}
