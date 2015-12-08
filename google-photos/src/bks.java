// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public final class bks
    implements nfp
{

    bkt a;
    bkt b;
    bkv c;
    boolean d;
    long e;
    private final Uri f;
    private final bim g;
    private final bld h;
    private final bmm i;

    public bks(Uri uri, bim bim1, bld bld1, bmm bmm1)
    {
        f = (Uri)b.a(uri, "uri", null);
        g = (bim)b.a(bim1, "spec", null);
        h = (bld)b.a(bld1, "appInfo", null);
        i = (bmm)b.a(bmm1, "deviceInfo", null);
    }

    public final void a(nfn nfn1)
    {
        if (b == null)
        {
            nfn1.a(String.format("Ongoing analysis of URI:%s with spec:%s started %d ms ago", new Object[] {
                f, g, Long.valueOf(System.currentTimeMillis() - a.a)
            }));
            return;
        }
        if (d)
        {
            nfn1.a(String.format("Completed analysis of URI:%s with spec:%s ended %d ms ago", new Object[] {
                f, g, Long.valueOf(System.currentTimeMillis() - b.a)
            }));
            return;
        } else
        {
            nfn1.a(String.format("Canceled analysis of URI:%s with spec:%s ended %d ms ago; analyzed up to %d", new Object[] {
                f, g, Long.valueOf(System.currentTimeMillis() - b.a), Long.valueOf(e)
            }));
            return;
        }
    }

    public final String toString()
    {
        return b.a(getClass(), new Object[] {
            f, g, h, i, a, b, c, Boolean.valueOf(d), Long.valueOf(e)
        });
    }
}
