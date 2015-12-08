// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;

final class acv extends adb
{

    private afn a;
    private ob b;
    private acq c;

    acv(acq acq1, afn afn, ob ob1)
    {
        c = acq1;
        a = afn;
        b = ob1;
        super();
    }

    public final void a(View view)
    {
    }

    public final void b(View view)
    {
        b.a(null);
        c.f(a);
        c.d.remove(a);
        c.c();
    }

    public final void c(View view)
    {
        mk.c(view, 1.0F);
    }
}
