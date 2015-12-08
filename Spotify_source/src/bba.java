// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public final class bba extends bay
{

    private final bax f;
    private final bas g;

    public bba(long l, long l1, bad bad, bbg bbg1)
    {
        super(l, l1, bad, bbg1);
        Uri.parse(bbg1.d);
        if (bbg1.f <= 0L)
        {
            bad = null;
        } else
        {
            bad = new bax(bbg1.d, null, bbg1.e, bbg1.f);
        }
        f = bad;
        if (f != null)
        {
            bad = null;
        } else
        {
            bad = new bas(l * 1000L, l1 * 1000L, new bax(bbg1.d, null, 0L, -1L));
        }
        g = bad;
    }

    public final bax e()
    {
        return f;
    }

    public final bao f()
    {
        return g;
    }
}
