// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.TextView;

public final class hjh
    implements hgo
{

    private final hiu a;
    private final hgp b;
    private hji c;

    public hjh(hiu hiu1, hgp hgp1)
    {
        a = hiu1;
        b = hgp1;
    }

    public final int a()
    {
        return b.wo;
    }

    public final int a(int i)
    {
        throw new UnsupportedOperationException();
    }

    public final void a(afn afn)
    {
        c = (hji)afn;
        new hiy(afn, ((hji)afn).o);
        c.o.setText(a.b);
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
