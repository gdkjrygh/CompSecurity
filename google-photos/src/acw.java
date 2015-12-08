// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;

final class acw extends adb
{

    private afn a;
    private int b;
    private int c;
    private ob d;
    private acq e;

    acw(acq acq1, afn afn, int i, int j, ob ob1)
    {
        e = acq1;
        a = afn;
        b = i;
        c = j;
        d = ob1;
        super();
    }

    public final void a(View view)
    {
    }

    public final void b(View view)
    {
        d.a(null);
        e.e(a);
        e.e.remove(a);
        e.c();
    }

    public final void c(View view)
    {
        if (b != 0)
        {
            mk.a(view, 0.0F);
        }
        if (c != 0)
        {
            mk.b(view, 0.0F);
        }
    }
}
