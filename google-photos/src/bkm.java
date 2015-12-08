// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.net.Uri;

final class bkm
    implements bki
{

    private final bim a;
    private final bii b;
    private final bjn c[];
    private final bjx d[];
    private bkl e;

    private bkm(bkl bkl1, bim bim1, bii bii1, bjn abjn[], bjx abjx[])
    {
        e = bkl1;
        super();
        a = (bim)b.a(bim1, "spec", null);
        b = (bii)b.a(bii1, "callback", null);
        c = (bjn[])b.a(abjn, "postProcessors", null);
        d = (bjx[])b.a(abjx, "segmenters", null);
    }

    bkm(bkl bkl1, bim bim1, bii bii1, bjn abjn[], bjx abjx[], byte byte0)
    {
        this(bkl1, bim1, bii1, abjn, abjx);
    }

    public final void a(Bitmap bitmap)
    {
        b.a(bitmap);
    }

    public final void a(Uri uri, long l)
    {
        b.a(uri, l);
    }

    public final void a(Uri uri, cma cma1)
    {
        cma1.b.e = true;
        cma1 = cma1.a(c, d);
        bkl.a(e).a(cma1.c());
        b.a(uri, a, cma1);
    }

    public final void a(Uri uri, cmf cmf1)
    {
        b.a(uri, cmf1);
    }

    public final void a(Uri uri, Exception exception)
    {
        bkl.a(e).a(null);
        b.a(uri, a, exception);
    }

    public final void b(Uri uri, cma cma1)
    {
        cma1.b.e = false;
        cma1 = cma1.a();
        bkl.a(e).a(cma1.c());
        b.b(uri, a, cma1);
    }
}
