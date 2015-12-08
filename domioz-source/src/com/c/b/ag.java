// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;

// Referenced classes of package com.c.b:
//            az, aw, v, w, 
//            ap, ba, bj, ah, 
//            bc

final class ag extends az
{

    private final v a;
    private final bc b;

    public ag(v v1, bc bc1)
    {
        a = v1;
        b = bc1;
    }

    final int a()
    {
        return 2;
    }

    final boolean a(NetworkInfo networkinfo)
    {
        return networkinfo == null || networkinfo.isConnected();
    }

    public final boolean a(aw aw1)
    {
        aw1 = aw1.d.getScheme();
        return "http".equals(aw1) || "https".equals(aw1);
    }

    public final ba b(aw aw1)
    {
        w w1 = a.a(aw1.d, aw1.c);
        Object obj;
        if (w1.c)
        {
            aw1 = ap.b;
        } else
        {
            aw1 = ap.c;
        }
        obj = w1.b;
        if (obj != null)
        {
            return new ba(((android.graphics.Bitmap) (obj)), aw1);
        }
        obj = w1.a;
        if (obj == null)
        {
            return null;
        }
        if (aw1 == ap.b && w1.d == 0L)
        {
            bj.a(((java.io.InputStream) (obj)));
            throw new ah("Received response with 0 content-length header.");
        }
        if (aw1 == ap.c && w1.d > 0L)
        {
            bc bc1 = b;
            long l = w1.d;
            bc1.c.sendMessage(bc1.c.obtainMessage(4, Long.valueOf(l)));
        }
        return new ba(((java.io.InputStream) (obj)), aw1);
    }

    final boolean b()
    {
        return true;
    }
}
