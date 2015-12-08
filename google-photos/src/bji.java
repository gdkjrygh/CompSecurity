// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.net.Uri;

final class bji
    implements bii
{

    private final bii a;
    private final byte b[];
    private bjh c;

    bji(bjh bjh1, bii bii1, byte abyte0[])
    {
        c = bjh1;
        super();
        a = (bii)b.a(bii1, "callback", null);
        if (abyte0 == null)
        {
            bjh1 = null;
        } else
        {
            bjh1 = (byte[])abyte0.clone();
        }
        b = bjh1;
    }

    private cmf a(cmf cmf)
    {
        cmf cmf1 = cmf;
        if (b != null)
        {
            cmf = clz.a(cmf);
            cmf.a = b;
            cmf1 = cmf.a();
        }
        return cmf1;
    }

    public final void a(Bitmap bitmap)
    {
        a.a(bitmap);
    }

    public final void a(Uri uri, long l)
    {
        a.a(uri, l);
    }

    public final void a(Uri uri, bim bim, cmf cmf)
    {
        cmf = a(cmf);
        bjh.a(c, cmf);
        cmf = cmg.a(uri, cmf, bjh.a(c));
        a.a(uri, bim, cmf);
    }

    public final void a(Uri uri, bim bim, Exception exception)
    {
        a.a(uri, bim, exception);
    }

    public final void a(Uri uri, cmf cmf)
    {
        cmf = a(cmf);
        a.a(uri, cmf);
    }

    public final void b(Uri uri, bim bim, cmf cmf)
    {
        cmf = cmg.a(uri, a(cmf), bjh.a(c));
        a.b(uri, bim, cmf);
    }
}
