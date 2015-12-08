// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

final class bkf
    implements bko
{

    private bki a;
    private Uri b;
    private bkb c;
    private cma d;
    private bke e;

    bkf(bke bke1, bki bki1, Uri uri, bkb bkb1, cma cma1)
    {
        e = bke1;
        a = bki1;
        b = uri;
        c = bkb1;
        d = cma1;
        super();
    }

    public final void a(long l)
    {
        a.a(b, l);
        if (bke.a(e) >= 0L)
        {
            if (bke.b(e) < 0L)
            {
                bke.a(e, l);
            }
            if (l - bke.b(e) >= bke.a(e))
            {
                long l1 = c.a;
                Object obj = d.b;
                obj.c = l1;
                obj.e = false;
                obj = d.a();
                a.a(b, ((cmf) (obj)));
                bke.a(e, l);
            }
        }
    }
}
