// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.bl;
import java.math.BigDecimal;

// Referenced classes of package com.roidapp.photogrid.release:
//            ig, if, lc

public class aq extends View
{

    protected Context a;
    protected lc b;
    protected ig c;
    protected Bitmap d;
    protected Bitmap e;
    protected int f;
    protected int g;
    protected boolean h;
    protected float i;
    protected float j;
    protected float k;
    protected float l;
    protected boolean m;
    protected long n;
    protected float o;
    protected int p;
    protected int q;
    protected float r;
    protected boolean s;
    protected boolean t;
    protected float u;
    protected float v;

    public aq(Context context)
    {
        super(context);
        r = 1.0F;
        s = false;
        if (android.os.Build.VERSION.SDK_INT > 10)
        {
            bl.a(this);
        }
    }

    public final void a()
    {
        c.t = u;
        c.u = v;
    }

    public final void a(float f1)
    {
        ig ig1 = c;
        ig1.p = (int)((float)ig1.p + f1);
        invalidate();
    }

    public final void a(float f1, float f2, float f3, float f4)
    {
        ig ig1 = c;
        ig1.t = ig1.t + (float)(int)(f3 - f1);
        ig1 = c;
        ig1.u = ig1.u + (float)(int)(f4 - f2);
    }

    public final void a(Bitmap bitmap)
    {
        h = true;
        d = bitmap;
        invalidate();
    }

    public final boolean a(boolean flag)
    {
        float f1;
        boolean flag1;
        boolean flag2;
        flag1 = true;
        flag2 = true;
        if (!(this instanceof if))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        f1 = b();
        if (c.v < f1) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        flag = flag2;
_L6:
        return flag;
_L2:
        if (flag)
        {
            return false;
        }
        c.v = (new BigDecimal(c.v)).add(new BigDecimal(0.10000000149011612D)).setScale(1, 4).floatValue();
        flag1 = false;
_L4:
        flag = flag1;
        if (flag1) goto _L6; else goto _L5
_L5:
        invalidate();
        return flag1;
        if (c.v >= 2.0F)
        {
            if (flag)
            {
                return true;
            }
        } else
        {
            if (flag)
            {
                return false;
            }
            c.v = (new BigDecimal(c.v)).add(new BigDecimal(0.10000000149011612D)).setScale(1, 4).floatValue();
            flag1 = false;
        }
          goto _L4
    }

    public final float b()
    {
        if (d == null)
        {
            return 2.0F;
        }
        float f1;
        if ((float)d.getWidth() / (float)d.getHeight() > (float)f / (float)g)
        {
            f1 = (float)g / ((float)d.getHeight() * r);
        } else
        {
            f1 = (float)f / ((float)d.getWidth() * r);
        }
        return f1 + 1.0F;
    }

    public final boolean b(boolean flag)
    {
        boolean flag1;
        boolean flag2;
        flag1 = true;
        flag2 = true;
        if (c.v > 0.1F) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        flag = flag2;
_L6:
        return flag;
_L2:
        if (flag)
        {
            return false;
        }
        c.v = (new BigDecimal(c.v)).add(new BigDecimal(-0.10000000149011612D)).setScale(1, 4).floatValue();
        flag1 = false;
_L4:
        flag = flag1;
        if (!flag1)
        {
            invalidate();
            return flag1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void c()
    {
        c.v = 1.0F;
        invalidate();
    }

    public final void c(boolean flag)
    {
        if (flag)
        {
            ig ig1 = c;
            ig1.t = ig1.t + (float)az.e;
        } else
        {
            ig ig2 = c;
            ig2.t = ig2.t - (float)az.e;
        }
        invalidate();
    }

    public final void d()
    {
        c.r = -c.r;
        invalidate();
    }

    public final void d(boolean flag)
    {
        if (flag)
        {
            ig ig1 = c;
            ig1.u = ig1.u + (float)az.f;
        } else
        {
            ig ig2 = c;
            ig2.u = ig2.u - (float)az.f;
        }
        invalidate();
    }

    public final void e()
    {
        c.s = -c.s;
        invalidate();
    }

    public boolean isSelected()
    {
        return s;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (e != null && !e.isRecycled())
        {
            e.recycle();
        }
        e = null;
    }

    public void onMeasure(int i1, int j1)
    {
        super.setMeasuredDimension(f, g);
    }

    public void setSelected(boolean flag)
    {
        s = flag;
        invalidate();
    }
}
