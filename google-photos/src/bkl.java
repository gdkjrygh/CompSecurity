// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;

public final class bkl
    implements bjw
{

    private final bjn c[];
    private final bjx d[];
    private final bke e;
    private final bkp f;

    public bkl(Context context, bld bld, bmm bmm, buf buf, ajr ajr, bjn abjn[], bjx abjx[], 
            bjn abjn1[], bjx abjx1[], bkq bkq, cko cko)
    {
        c = (bjn[])b.a(abjn, "videoPostProcessors", null);
        d = (bjx[])b.a(abjx, "videoSegmenters", null);
        b.a(abjn1, "photoPostProcessors", null);
        b.a(abjx1, "photoSegmenters", null);
        e = new bke(ajr, cko);
        f = new bkp(context, bld, bmm, buf, bkq);
    }

    static bkp a(bkl bkl1)
    {
        return bkl1.f;
    }

    public final void a()
    {
        bke bke1 = e;
        synchronized (bke1.a)
        {
            bke1.c = true;
            if (bke1.b.d())
            {
                bke1.b.c();
                bke1.b.b();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(Uri uri, bim bim1, bii bii)
    {
        f.a(uri, bim1, null);
        e.d = bim1.b;
        e.a(uri, bim1, null, new bkm(this, bim1, bii, c, d, (byte)0));
    }

    public final void a(Uri uri, bim bim1, cmf cmf1, bii bii)
    {
        f.a(uri, bim1, cmf1.c());
        e.d = bim1.b;
        e.a(uri, bim1, cmf1, new bkm(this, bim1, bii, c, d, (byte)0));
    }
}
