// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.TextView;
import com.google.android.apps.photos.remotemedia.enrichment.ui.MapImageView;

public final class hjf
    implements hgo
{

    private final his a;
    private final hgp b;
    private hjg c;

    public hjf(his his1, hgp hgp1)
    {
        a = his1;
        b = hgp1;
    }

    public final int a()
    {
        return b.wn;
    }

    public final int a(int i)
    {
        throw new UnsupportedOperationException();
    }

    public final void a(afn afn)
    {
        c = (hjg)afn;
        new hiy(afn, ((hjg)afn).p);
        c.o.a = a;
        c.p.setText(a.b);
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
