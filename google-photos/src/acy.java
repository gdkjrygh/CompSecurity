// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;

final class acy extends adb
{

    private acz a;
    private ob b;
    private View c;
    private acq d;

    acy(acq acq1, acz acz1, ob ob1, View view)
    {
        d = acq1;
        a = acz1;
        b = ob1;
        c = view;
        super();
    }

    public final void a(View view)
    {
    }

    public final void b(View view)
    {
        b.a(null);
        mk.c(c, 1.0F);
        mk.a(c, 0.0F);
        mk.b(c, 0.0F);
        d.a(a.b, false);
        d.g.remove(a.b);
        d.c();
    }
}
