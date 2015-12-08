// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.kik.android.a;
import java.util.List;
import kik.a.d.aa;
import kik.a.d.k;
import kik.a.d.n;
import kik.android.util.cq;
import kik.android.util.e;
import kik.android.util.r;
import kik.android.widget.KikNetworkedImageView;
import kik.android.widget.cs;
import kik.android.widget.w;

// Referenced classes of package com.kik.cache:
//            z, ak, v, k, 
//            ad

public class ContactImageView extends KikNetworkedImageView
{
    private static final class a
    {

        private static Bitmap a[] = {
            e.a(0), e.a(1), e.a(2), e.a(3), e.a(4), e.a(5), e.a(6), e.a(7), e.a(8), e.a(9)
        };

        public static Bitmap a(int i)
        {
            if (i >= 0 && i < 10)
            {
                return a[i];
            }
            if (i >= 10)
            {
                return a[9];
            } else
            {
                return a[0];
            }
        }

    }


    private Boolean a;
    private k b;
    private Bitmap c;
    private Bitmap d;
    private Bitmap h;

    public ContactImageView(Context context)
    {
        super(context);
    }

    public ContactImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ContactImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void a(aa aa1, ad ad, boolean flag, com.android.volley.r.b b1, boolean flag1, boolean flag2)
    {
        b1 = com.kik.cache.ak.a(aa1, b1, flag, z.d, flag2, flag1);
        a = aa1.i;
        a(((z) (b1)), ad, 0, 0, true, false);
    }

    protected w a(Bitmap bitmap, String s)
    {
        h = bitmap;
        if (b != null && (b instanceof n) && cq.c(b.r()))
        {
            return new cs(bitmap, s);
        } else
        {
            return super.a(bitmap, s);
        }
    }

    public final void a(Bitmap bitmap)
    {
        if (bitmap == null || d != null && bitmap != d)
        {
            d = null;
            c = null;
            h = null;
        }
        super.a(bitmap);
    }

    public final void a(aa aa1, ad ad)
    {
        a(aa1, ad, false, com.kik.cache.z.e, false, false);
    }

    public final void a(k k1, ad ad, boolean flag, int i, boolean flag1, boolean flag2, boolean flag3, 
            kik.a.e.r r1, com.kik.android.a a1)
    {
        k k3;
        b = k1;
        k3 = k1;
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k k2;
        k2 = k1;
        if (k1.m())
        {
            e();
            k2 = null;
        }
        k3 = k2;
        if (!(k2 instanceof n)) goto _L2; else goto _L3
_L3:
        k3 = k2;
        if (!cq.c(b.r())) goto _L2; else goto _L4
_L4:
        flag = false;
        k1 = k2;
_L6:
        n n1;
        if (flag)
        {
            if (g != null && c == null)
            {
                d = g;
                c = r.a(g);
            }
            g = c;
        } else
        if (g != null && d != null)
        {
            g = d;
        }
        n1 = null;
        if (k1 != null)
        {
            if ((k1 instanceof n) && cq.c(k1.r()))
            {
                n1 = (n)k1;
                n1.w();
                a(com.kik.cache.a.a(n1.w().size()));
                k1 = com.kik.cache.v.a((n)k1, com.kik.cache.z.e, android.graphics.Bitmap.Config.ARGB_8888, z.d, r1, flag3, ad, a1);
                flag = false;
            } else
            {
                k1 = com.kik.cache.k.a(k1, com.kik.cache.z.e, z.d, flag, i, false, flag2);
                flag = true;
            }
        } else
        {
            flag = true;
            k1 = n1;
        }
        a(((z) (k1)), ad, 0, 0, flag1, flag);
        return;
_L2:
        k1 = k3;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(k k1, ad ad, boolean flag, kik.a.e.r r1, com.kik.android.a a1)
    {
        a(k1, ad, flag, false, false, r1, a1);
    }

    public final void a(k k1, ad ad, boolean flag, boolean flag1, boolean flag2, kik.a.e.r r1, com.kik.android.a a1)
    {
        a(k1, ad, flag, 4, flag1, false, flag2, r1, a1);
    }

    protected final boolean a()
    {
        if (b != null)
        {
            return b.i();
        }
        if (a != null)
        {
            return a.booleanValue();
        } else
        {
            return false;
        }
    }

    public final void b(aa aa1, ad ad)
    {
        a(aa1, ad, true, com.kik.cache.z.e, true, true);
    }

    protected final boolean b()
    {
        return b != null && (b instanceof n);
    }

    public final k c()
    {
        return b;
    }
}
