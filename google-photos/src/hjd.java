// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.TextView;

public final class hjd
    implements hgo
{

    private final hiq a;
    private final hgp b;

    public hjd(hiq hiq1, hgp hgp1)
    {
        a = hiq1;
        b = hgp1;
    }

    public final int a()
    {
        return b.wm;
    }

    public final int a(int i)
    {
        throw new UnsupportedOperationException();
    }

    public final void a(afn afn)
    {
        hje hje1 = (hje)afn;
        new hiy(afn, ((hje)afn).o);
        hje1.o.setText(a.b);
    }

    public final int b(int i)
    {
        throw new UnsupportedOperationException();
    }

    public final long b()
    {
        return b.a(this, a.a.c);
    }
}
