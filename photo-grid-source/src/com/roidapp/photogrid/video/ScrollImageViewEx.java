// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.roidapp.baselib.hlistview.ad;
import com.roidapp.photogrid.release.hr;
import com.roidapp.photogrid.release.hs;

// Referenced classes of package com.roidapp.photogrid.video:
//            n

public class ScrollImageViewEx extends ImageView
{

    int a;
    int b;
    float c;
    ad d;
    private hs e;
    private hr f;
    private int g;

    public ScrollImageViewEx(Context context)
    {
        super(context);
        a = 0;
        b = 0;
        c = 0.0F;
        d = null;
        e = null;
        g = 0;
        a(context);
    }

    public ScrollImageViewEx(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        b = 0;
        c = 0.0F;
        d = null;
        e = null;
        g = 0;
        a(context);
    }

    public ScrollImageViewEx(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = 0;
        b = 0;
        c = 0.0F;
        d = null;
        e = null;
        g = 0;
        a(context);
    }

    static hr a(ScrollImageViewEx scrollimageviewex)
    {
        return scrollimageviewex.f;
    }

    private void a(Context context)
    {
        getViewTreeObserver().addOnGlobalLayoutListener(new n(this));
        d = new ad(context);
    }

    static int b(ScrollImageViewEx scrollimageviewex)
    {
        return scrollimageviewex.g;
    }

    public final int a()
    {
        return a;
    }

    public final int a(float f1)
    {
        if (a == 0)
        {
            return 0;
        } else
        {
            return (int)Math.ceil((((float)b + f1) * 1024F) / (float)a);
        }
    }

    public final void a(int i)
    {
        a = i;
    }

    public final void a(int i, boolean flag)
    {
        if (d == null)
        {
            return;
        }
        if (a == 0)
        {
            g = i;
            return;
        }
        int j = (a * i + 512 >> 10) - b;
        float f1 = (float)(a * i) / 1024F - (float)b;
        if (j < -b)
        {
            i = -b;
        } else
        {
            i = j;
            if (j > a - b)
            {
                i = a - b;
            }
        }
        d.b();
        if (flag && Math.abs(f1 - c) >= 2.0F)
        {
            setX(c);
            d.a((int)Math.ceil(c), (int)getY(), (int)(f1 - c), 150);
            c = i;
            return;
        } else
        {
            setX(f1);
            return;
        }
    }

    public final void a(hr hr)
    {
        f = hr;
    }

    public void computeScroll()
    {
        if (d != null && d.e() && !d.a())
        {
            setX(d.c());
        }
    }

    public float getY()
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            return (float)((android.widget.LinearLayout.LayoutParams)getLayoutParams()).topMargin;
        } else
        {
            return super.getY();
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (b == 0)
        {
            b = (k - i) / 2;
        }
    }

    public void setX(float f1)
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)getLayoutParams();
            layoutparams.leftMargin = (int)f1;
            setLayoutParams(layoutparams);
        } else
        {
            super.setX(f1);
        }
        c = f1;
    }
}
