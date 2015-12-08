// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;

// Referenced classes of package android.support.v4.view:
//            PagerTitleStrip, ViewPager

public class PagerTabStrip extends PagerTitleStrip
{

    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private final Paint m;
    private final Rect n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean s;
    private float t;
    private float u;
    private int v;

    public PagerTabStrip(Context context)
    {
        this(context, null);
    }

    public PagerTabStrip(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        m = new Paint();
        n = new Rect();
        o = 255;
        p = false;
        q = false;
        g = this.f;
        m.setColor(g);
        float f = context.getResources().getDisplayMetrics().density;
        h = (int)(3F * f + 0.5F);
        i = (int)(6F * f + 0.5F);
        j = (int)(64F * f);
        l = (int)(16F * f + 0.5F);
        r = (int)(f + 0.5F);
        k = (int)(f * 32F + 0.5F);
        v = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(super.e);
        setWillNotDraw(false);
        b.setFocusable(true);
        b.setOnClickListener(new android.view.View.OnClickListener() {

            private PagerTabStrip a;

            public final void onClick(View view)
            {
                a.a.setCurrentItem(a.a.mCurItem - 1);
            }

            
            {
                a = PagerTabStrip.this;
                super();
            }
        });
        d.setFocusable(true);
        d.setOnClickListener(new android.view.View.OnClickListener() {

            private PagerTabStrip a;

            public final void onClick(View view)
            {
                a.a.setCurrentItem(a.a.mCurItem + 1);
            }

            
            {
                a = PagerTabStrip.this;
                super();
            }
        });
        if (getBackground() == null)
        {
            p = true;
        }
    }

    final int a()
    {
        return Math.max(super.a(), k);
    }

    final void a(int i1, float f, boolean flag)
    {
        Rect rect = n;
        int j1 = getHeight();
        int k1 = c.getLeft();
        int l1 = l;
        int i2 = c.getRight();
        int j2 = l;
        int k2 = j1 - h;
        rect.set(k1 - l1, k2, i2 + j2, j1);
        super.a(i1, f, flag);
        o = (int)(Math.abs(f - 0.5F) * 2.0F * 255F);
        rect.union(c.getLeft() - l, k2, c.getRight() + l, j1);
        invalidate(rect);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int i1 = getHeight();
        int j1 = c.getLeft();
        int k1 = l;
        int l1 = c.getRight();
        int i2 = l;
        int j2 = h;
        m.setColor(o << 24 | g & 0xffffff);
        canvas.drawRect(j1 - k1, i1 - j2, l1 + i2, i1, m);
        if (p)
        {
            m.setColor(0xff000000 | g & 0xffffff);
            canvas.drawRect(getPaddingLeft(), i1 - r, getWidth() - getPaddingRight(), i1, m);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        float f;
        float f1;
        int i1;
        i1 = motionevent.getAction();
        if (i1 != 0 && s)
        {
            return false;
        }
        f = motionevent.getX();
        f1 = motionevent.getY();
        i1;
        JVM INSTR tableswitch 0 2: default 60
    //                   0 62
    //                   1 124
    //                   2 80;
           goto _L1 _L2 _L3 _L4
_L1:
        return true;
_L2:
        t = f;
        u = f1;
        s = false;
        continue; /* Loop/switch isn't completed */
_L4:
        if (Math.abs(f - t) > (float)v || Math.abs(f1 - u) > (float)v)
        {
            s = true;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (f < (float)(c.getLeft() - l))
        {
            a.setCurrentItem(a.mCurItem - 1);
        } else
        if (f > (float)(c.getRight() + l))
        {
            a.setCurrentItem(a.mCurItem + 1);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setBackgroundColor(int i1)
    {
        super.setBackgroundColor(i1);
        if (!q)
        {
            boolean flag;
            if ((0xff000000 & i1) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p = flag;
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (!q)
        {
            boolean flag;
            if (drawable == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p = flag;
        }
    }

    public void setBackgroundResource(int i1)
    {
        super.setBackgroundResource(i1);
        if (!q)
        {
            boolean flag;
            if (i1 == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p = flag;
        }
    }

    public void setDrawFullUnderline(boolean flag)
    {
        p = flag;
        q = true;
        invalidate();
    }

    public void setPadding(int i1, int j1, int k1, int l1)
    {
        int i2 = l1;
        if (l1 < i)
        {
            i2 = i;
        }
        super.setPadding(i1, j1, k1, i2);
    }

    public void setTabIndicatorColor(int i1)
    {
        g = i1;
        m.setColor(g);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i1)
    {
        setTabIndicatorColor(getContext().getResources().getColor(i1));
    }

    public void setTextSpacing(int i1)
    {
        int j1 = i1;
        if (i1 < j)
        {
            j1 = j;
        }
        super.setTextSpacing(j1);
    }
}
