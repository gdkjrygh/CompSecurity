// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.net.NetworkInfo;
import android.net.Uri;

// Referenced classes of package com.squareup.a:
//            bb, ax, w, x, 
//            aq, bc, bm, ai, 
//            be

class ah extends bb
{

    private final w a;
    private final be b;

    public ah(w w1, be be1)
    {
        a = w1;
        b = be1;
    }

    int a()
    {
        return 2;
    }

    public bc a(ax ax1, int i)
    {
        x x1 = a.a(ax1.d, ax1.c);
        if (x1 == null)
        {
            return null;
        }
        Object obj;
        if (x1.c)
        {
            ax1 = aq.b;
        } else
        {
            ax1 = aq.c;
        }
        obj = x1.b();
        if (obj != null)
        {
            return new bc(((android.graphics.Bitmap) (obj)), ax1);
        }
        obj = x1.a();
        if (obj == null)
        {
            return null;
        }
        if (ax1 == aq.b && x1.c() == 0L)
        {
            bm.a(((java.io.InputStream) (obj)));
            throw new ai("Received response with 0 content-length header.");
        }
        if (ax1 == aq.c && x1.c() > 0L)
        {
            b.a(x1.c());
        }
        return new bc(((java.io.InputStream) (obj)), ax1);
    }

    public boolean a(ax ax1)
    {
        ax1 = ax1.d.getScheme();
        return "http".equals(ax1) || "https".equals(ax1);
    }

    boolean a(boolean flag, NetworkInfo networkinfo)
    {
        return networkinfo == null || networkinfo.isConnected();
    }

    boolean b()
    {
        return true;
    }
}
