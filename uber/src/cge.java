// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.NetworkInfo;
import android.net.Uri;

final class cge extends cgu
{

    private final cfs a;
    private final cgx b;

    public cge(cfs cfs1, cgx cgx1)
    {
        a = cfs1;
        b = cgx1;
    }

    final int a()
    {
        return 2;
    }

    final boolean a(NetworkInfo networkinfo)
    {
        return networkinfo == null || networkinfo.isConnected();
    }

    public final boolean a(cgr cgr1)
    {
        cgr1 = cgr1.d.getScheme();
        return "http".equals(cgr1) || "https".equals(cgr1);
    }

    public final cgv b(cgr cgr1)
    {
        cft cft1 = a.a(cgr1.d, cgr1.c);
        Object obj;
        if (cft1.c)
        {
            cgr1 = cgl.b;
        } else
        {
            cgr1 = cgl.c;
        }
        obj = cft1.b();
        if (obj != null)
        {
            return new cgv(((android.graphics.Bitmap) (obj)), cgr1);
        }
        obj = cft1.a();
        if (obj == null)
        {
            return null;
        }
        if (cgr1 == cgl.b && cft1.c() == 0L)
        {
            chf.a(((java.io.InputStream) (obj)));
            throw new cgf("Received response with 0 content-length header.");
        }
        if (cgr1 == cgl.c && cft1.c() > 0L)
        {
            b.a(cft1.c());
        }
        return new cgv(((java.io.InputStream) (obj)), cgr1);
    }

    final boolean b()
    {
        return true;
    }
}
