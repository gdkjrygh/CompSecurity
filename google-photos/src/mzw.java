// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.opengl.GLUtils;
import java.util.HashMap;
import junit.framework.Assert;

public abstract class mzw extends mzm
{

    private static HashMap g = new HashMap();
    private static mzx h = new mzx();
    private boolean i;
    private boolean j;
    private boolean k;
    private Bitmap l;
    private int m;

    public mzw()
    {
        this(false);
    }

    protected mzw(boolean flag)
    {
        super(null, 0, 0);
        i = true;
        j = true;
        k = false;
        if (flag)
        {
            super.e = true;
            m = 1;
        }
    }

    private static Bitmap a(boolean flag, android.graphics.Bitmap.Config config, int i1)
    {
        mzx mzx1 = h;
        mzx1.a = flag;
        mzx1.b = config;
        mzx1.c = i1;
        Bitmap bitmap = (Bitmap)g.get(mzx1);
        Object obj = bitmap;
        if (bitmap == null)
        {
            if (flag)
            {
                config = Bitmap.createBitmap(1, i1, config);
            } else
            {
                config = Bitmap.createBitmap(i1, 1, config);
            }
            g.put(mzx1.a(), config);
            obj = config;
        }
        return ((Bitmap) (obj));
    }

    private Bitmap m()
    {
        if (l == null)
        {
            l = aC_();
            int i1 = l.getWidth();
            int j1 = m;
            int k1 = l.getHeight();
            int l1 = m;
            if (c == -1)
            {
                a(i1 + (j1 << 1), k1 + (l1 << 1));
            }
        }
        return l;
    }

    private void n()
    {
        if (l == null)
        {
            throw new NullPointerException();
        } else
        {
            a(l);
            l = null;
            return;
        }
    }

    public abstract void a(Bitmap bitmap);

    protected final boolean a(mzo mzo1)
    {
        b(mzo1);
        return l();
    }

    public abstract Bitmap aC_();

    public final int b()
    {
        if (c == -1)
        {
            m();
        }
        return c;
    }

    public final void b(mzo mzo1)
    {
        boolean flag1 = false;
        if (g()) goto _L2; else goto _L1
_L1:
        Bitmap bitmap1 = m();
        if (bitmap1 == null) goto _L4; else goto _L3
_L3:
        int i1;
        int k1;
        int i2;
        int j2;
        i1 = bitmap1.getWidth();
        k1 = bitmap1.getHeight();
        i2 = d();
        j2 = e();
        boolean flag;
        flag = flag1;
        if (i1 <= i2)
        {
            flag = flag1;
            if (k1 <= j2)
            {
                flag = true;
            }
        }
        Assert.assertTrue(flag);
        a = mzo1.a().a();
        mzo1.b(this);
        if (i1 != i2 || k1 != j2) goto _L6; else goto _L5
_L5:
        mzo1.a(this, bitmap1);
_L10:
        n();
        super.f = mzo1;
        b = 1;
        i = true;
_L8:
        return;
_L6:
        int k2 = GLUtils.getInternalFormat(bitmap1);
        int l2 = GLUtils.getType(bitmap1);
        Object obj = bitmap1.getConfig();
        mzo1.a(this, k2, l2);
        mzo1.a(this, m, m, bitmap1, k2, l2);
        if (m > 0)
        {
            mzo1.a(this, 0, 0, a(true, ((android.graphics.Bitmap.Config) (obj)), j2), k2, l2);
            mzo1.a(this, 0, 0, a(false, ((android.graphics.Bitmap.Config) (obj)), i2), k2, l2);
        }
        if (m + i1 < i2)
        {
            Bitmap bitmap2 = a(true, ((android.graphics.Bitmap.Config) (obj)), j2);
            mzo1.a(this, m + i1, 0, bitmap2, k2, l2);
        }
        if (m + k1 < j2)
        {
            obj = a(false, ((android.graphics.Bitmap.Config) (obj)), i2);
            mzo1.a(this, 0, m + k1, ((Bitmap) (obj)), k2, l2);
        }
        continue; /* Loop/switch isn't completed */
        mzo1;
        n();
        throw mzo1;
_L4:
        b = -1;
        throw new RuntimeException("Texture load fail, no bitmap");
_L2:
        if (i) goto _L8; else goto _L7
_L7:
        Bitmap bitmap = m();
        int j1 = GLUtils.getInternalFormat(bitmap);
        int l1 = GLUtils.getType(bitmap);
        mzo1.a(this, m, m, bitmap, j1, l1);
        n();
        i = true;
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final int c()
    {
        if (c == -1)
        {
            m();
        }
        return d;
    }

    protected final int f()
    {
        return 3553;
    }

    public final void h()
    {
        super.h();
        if (l != null)
        {
            n();
        }
    }

    public final boolean j()
    {
        return j;
    }

    public final void k()
    {
        if (l != null)
        {
            n();
        }
        i = false;
        c = -1;
        d = -1;
    }

    public final boolean l()
    {
        return g() && i;
    }

}
