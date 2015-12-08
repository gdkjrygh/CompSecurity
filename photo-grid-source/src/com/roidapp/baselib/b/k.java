// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.roidapp.baselib.c.c;

// Referenced classes of package com.roidapp.baselib.b:
//            m, l, p

public final class k
{

    protected boolean a;
    protected Resources b;
    protected String c;
    private boolean d;
    private boolean e;
    private final Handler f = new Handler(Looper.getMainLooper());
    private final Object g = new Object();

    public k(Context context, String s)
    {
        d = false;
        e = false;
        a = false;
        b = context.getResources();
        c = s;
    }

    public static void a(ImageView imageview)
    {
        imageview = c(imageview);
        if (imageview != null)
        {
            imageview.cancel(true);
        }
    }

    static boolean a(k k1)
    {
        return k1.d;
    }

    static m b(ImageView imageview)
    {
        return c(imageview);
    }

    static Object b(k k1)
    {
        return k1.g;
    }

    private static m c(ImageView imageview)
    {
        if (imageview != null)
        {
            imageview = imageview.getDrawable();
            if (imageview instanceof l)
            {
                return ((l)imageview).a();
            }
        }
        return null;
    }

    static boolean c(k k1)
    {
        return k1.e;
    }

    static Handler d(k k1)
    {
        return k1.f;
    }

    public final void a(Object obj, ImageView imageview, ProgressBar progressbar, p p)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        m m1 = c(imageview);
        if (m1 != null)
        {
            Object obj1 = m.a(m1);
            if (obj1 != null && obj1.equals(obj))
            {
                break; /* Loop/switch isn't completed */
            }
            m1.cancel(true);
        }
        flag = true;
_L4:
        if (flag)
        {
            progressbar = new m(this, imageview, progressbar, p);
            imageview.setImageDrawable(new l(b, progressbar));
            progressbar.executeOnExecutor(c.SERIAL_EXECUTOR, new Object[] {
                obj
            });
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = false;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void a(boolean flag)
    {
        d = flag;
    }
}
