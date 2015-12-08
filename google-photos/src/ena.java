// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

final class ena
    implements ann
{

    private final ene a;
    private final noz b;
    private lzw c;
    private FileInputStream d;
    private volatile lzv e;
    private emz f;

    public ena(emz emz1, ene ene1, noz noz1)
    {
        f = emz1;
        super();
        a = ene1;
        b = noz1;
    }

    public final void a()
    {
        p.a(d);
        if (e != null)
        {
            e.b();
        }
        if (c != null)
        {
            c.a();
        }
    }

    public final void a(amb amb, ano ano1)
    {
        mfu mfu1 = a.d;
        if (!mfu1.d()) goto _L2; else goto _L1
_L1:
        amb = mfu1;
_L4:
        if (amb == null)
        {
            ano1.a(null);
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        mfu1.a(emz.a, TimeUnit.MILLISECONDS);
        amb = mfu1;
        if (!mfu1.d())
        {
            amb = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
        e = emz.a(f).a(amb, a.b, a.c);
        c = (lzw)e.a();
        amb = c.r();
        if (!amb.a())
        {
            if (b.a())
            {
                noy.a("request", a);
                noy.a("status", amb);
            }
            ano1.a(null);
            return;
        }
        amb = c.b();
        if (amb == null)
        {
            ano1.a(null);
            return;
        } else
        {
            d = new FileInputStream(amb.getFileDescriptor());
            ano1.a(d);
            return;
        }
    }

    public final void b()
    {
        lzv lzv1 = e;
        if (lzv1 != null)
        {
            lzv1.b();
        }
    }

    public final amz c()
    {
        return amz.c;
    }

    public final Class d()
    {
        return java/io/InputStream;
    }
}
