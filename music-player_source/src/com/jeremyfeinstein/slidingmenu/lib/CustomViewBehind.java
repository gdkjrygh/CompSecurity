// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jeremyfeinstein.slidingmenu.lib;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.jeremyfeinstein.slidingmenu.lib:
//            f, CustomViewAbove, k

public class CustomViewBehind extends ViewGroup
{

    private int a;
    private CustomViewAbove b;
    private View c;
    private View d;
    private int e;
    private int f;
    private k g;
    private boolean h;
    private int i;
    private boolean j;
    private final Paint k;
    private float l;
    private Drawable m;
    private Drawable n;
    private int o;
    private float p;
    private boolean q;
    private Bitmap r;
    private View s;

    public CustomViewBehind(Context context)
    {
        this(context, null);
    }

    public CustomViewBehind(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        k = new Paint();
        q = true;
        e = (int)TypedValue.applyDimension(1, 48F, getResources().getDisplayMetrics());
    }

    private int e()
    {
        return s.getTop() + (s.getHeight() - r.getHeight()) / 2;
    }

    public final int a()
    {
        return c.getWidth();
    }

    public final int a(View view, int i1)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR tableswitch 0 2: default 36
    //                   0 41
    //                   1 36
    //                   2 54;
           goto _L3 _L4 _L3 _L5
_L3:
        return view.getLeft();
_L4:
        return view.getLeft() - c.getWidth();
_L5:
        return view.getLeft();
_L2:
        if (i != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        switch (i1)
        {
        case 0: // '\0'
            return view.getLeft();

        case 2: // '\002'
            return view.getLeft() + c.getWidth();
        }
        if (true) goto _L3; else goto _L6
_L6:
        if (i != 2) goto _L3; else goto _L7
_L7:
        switch (i1)
        {
        case 0: // '\0'
            return view.getLeft() - c.getWidth();

        case 2: // '\002'
            return view.getLeft() + c.getWidth();
        }
        if (true) goto _L3; else goto _L8
_L8:
    }

    public final void a(float f1)
    {
        l = f1;
    }

    public final void a(int i1)
    {
        f = i1;
        requestLayout();
    }

    public final void a(Bitmap bitmap)
    {
        r = bitmap;
        refreshDrawableState();
    }

    public final void a(Drawable drawable)
    {
        m = drawable;
        invalidate();
    }

    public final void a(View view)
    {
        if (c != null)
        {
            removeView(c);
        }
        c = view;
        addView(c);
    }

    public final void a(View view, int i1, int j1)
    {
        byte byte0;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = false;
        flag = false;
        byte0 = 0;
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (i1 >= view.getLeft())
        {
            byte0 = 4;
        }
        scrollTo((int)((float)(c.getWidth() + i1) * l), j1);
_L4:
        if (byte0 == 4)
        {
            Log.v("CustomViewBehind", "behind INVISIBLE");
        }
        setVisibility(byte0);
        return;
_L2:
        if (i == 1)
        {
            byte0 = flag2;
            if (i1 <= view.getLeft())
            {
                byte0 = 4;
            }
            scrollTo((int)((float)(c.getWidth() - getWidth()) + (float)(i1 - c.getWidth()) * l), j1);
        } else
        {
            byte0 = flag1;
            if (i == 2)
            {
                View view1 = c;
                if (i1 >= view.getLeft())
                {
                    byte0 = 4;
                } else
                {
                    byte0 = 0;
                }
                view1.setVisibility(byte0);
                view1 = d;
                if (i1 <= view.getLeft())
                {
                    byte0 = 4;
                } else
                {
                    byte0 = 0;
                }
                view1.setVisibility(byte0);
                byte0 = flag;
                if (i1 == 0)
                {
                    byte0 = 4;
                }
                if (i1 <= view.getLeft())
                {
                    scrollTo((int)((float)(c.getWidth() + i1) * l), j1);
                } else
                {
                    scrollTo((int)((float)(c.getWidth() - getWidth()) + (float)(i1 - c.getWidth()) * l), j1);
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(View view, Canvas canvas)
    {
        if (m == null || o <= 0)
        {
            return;
        }
        if (i == 0) goto _L2; else goto _L1
_L1:
        if (i != 1) goto _L4; else goto _L3
_L3:
        int i1 = view.getRight();
_L8:
        m.setBounds(i1, 0, o + i1, getHeight());
        m.draw(canvas);
        return;
_L4:
        if (i != 2) goto _L6; else goto _L5
_L5:
        if (n != null)
        {
            i1 = view.getRight();
            n.setBounds(i1, 0, o + i1, getHeight());
            n.draw(canvas);
        }
_L2:
        i1 = view.getLeft() - o;
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = 0;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(View view, Canvas canvas, float f1)
    {
        int i1 = 0;
        if (!j)
        {
            return;
        }
        int j1 = (int)(p * 255F * Math.abs(1.0F - f1));
        k.setColor(Color.argb(j1, 0, 0, 0));
        if (i == 0)
        {
            j1 = view.getLeft() - c.getWidth();
            i1 = view.getLeft();
        } else
        if (i == 1)
        {
            j1 = view.getRight();
            i1 = view.getRight() + c.getWidth();
        } else
        if (i == 2)
        {
            i1 = view.getLeft();
            j1 = c.getWidth();
            int k1 = view.getLeft();
            canvas.drawRect(i1 - j1, 0.0F, k1, getHeight(), k);
            j1 = view.getRight();
            i1 = view.getRight() + c.getWidth();
        } else
        {
            j1 = 0;
        }
        canvas.drawRect(j1, 0.0F, i1, getHeight(), k);
    }

    public final void a(CustomViewAbove customviewabove)
    {
        b = customviewabove;
    }

    public final void a(boolean flag)
    {
        h = flag;
    }

    public final boolean a(View view, int i1, float f1)
    {
        switch (a)
        {
        default:
            return false;

        case 1: // '\001'
            return true;

        case 0: // '\0'
            return b(view, i1, f1);
        }
    }

    public final int b(View view)
    {
        if (i == 0 || i == 2)
        {
            return view.getLeft() - c.getWidth();
        }
        if (i == 1)
        {
            return view.getLeft();
        } else
        {
            return 0;
        }
    }

    public final View b()
    {
        return c;
    }

    public final void b(float f1)
    {
        if (f1 > 1.0F || f1 < 0.0F)
        {
            throw new IllegalStateException("The BehindFadeDegree must be between 0.0f and 1.0f");
        } else
        {
            p = f1;
            return;
        }
    }

    public final void b(int i1)
    {
        if (i1 == 0 || i1 == 1)
        {
            if (c != null)
            {
                c.setVisibility(0);
            }
            if (d != null)
            {
                d.setVisibility(4);
            }
        }
        i = i1;
    }

    public final void b(View view, Canvas canvas, float f1)
    {
        int i1;
        while (!q || r == null || s == null || !((String)s.getTag(f.a)).equals("CustomViewBehindSelectedView")) 
        {
            return;
        }
        canvas.save();
        i1 = (int)((float)r.getWidth() * f1);
        if (i != 0) goto _L2; else goto _L1
_L1:
        int j1 = view.getLeft();
        i1 = j1 - i1;
        canvas.clipRect(i1, 0, j1, getHeight());
        canvas.drawBitmap(r, i1, e(), null);
_L4:
        canvas.restore();
        return;
_L2:
        if (i == 1)
        {
            int k1 = view.getRight();
            i1 += k1;
            canvas.clipRect(k1, 0, i1, getHeight());
            canvas.drawBitmap(r, i1 - r.getWidth(), e(), null);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b(boolean flag)
    {
        j = flag;
    }

    public final boolean b(View view, int i1)
    {
        int j1;
        int k1;
        j1 = view.getLeft();
        k1 = view.getRight();
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (i1 < j1 || i1 > j1 + e) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (i != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i1 > k1 || i1 < k1 - e)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
        if (i == 2)
        {
            if ((i1 < j1 || i1 > j1 + e) && (i1 > k1 || i1 < k1 - e))
            {
                return false;
            }
        } else
        {
            return false;
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    public final boolean b(View view, int i1, float f1)
    {
        boolean flag1 = false;
        if (i != 0 && (i != 2 || i1 != 0)) goto _L2; else goto _L1
_L1:
        boolean flag;
        flag = flag1;
        if (f1 >= (float)view.getLeft())
        {
            flag = true;
        }
_L4:
        return flag;
_L2:
        if (i == 1)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (i != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (i1 != 2) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (f1 <= (float)view.getRight())
        {
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final int c(View view)
    {
        if (i == 0)
        {
            return view.getLeft();
        }
        if (i == 1 || i == 2)
        {
            return view.getLeft() + c.getWidth();
        } else
        {
            return 0;
        }
    }

    public final View c()
    {
        return d;
    }

    public final void c(int i1)
    {
        o = i1;
        invalidate();
    }

    public final boolean c(float f1)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (f1 <= 0.0F) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (i != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f1 < 0.0F) goto _L3; else goto _L5
_L5:
        return false;
        if (i == 2) goto _L3; else goto _L6
_L6:
        return false;
    }

    public final int d(int i1)
    {
        if (i1 <= 1) goto _L2; else goto _L1
_L1:
        int j1 = 2;
_L4:
        if (i == 0 && j1 > 1)
        {
            return 0;
        }
        break; /* Loop/switch isn't completed */
_L2:
        j1 = i1;
        if (i1 <= 0)
        {
            j1 = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i == 1 && j1 <= 0)
        {
            return 2;
        } else
        {
            return j1;
        }
    }

    public final void d()
    {
        q = true;
    }

    public final boolean d(float f1)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (f1 >= 0.0F) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (i != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f1 > 0.0F) goto _L3; else goto _L5
_L5:
        return false;
        if (i == 2) goto _L3; else goto _L6
_L6:
        return false;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (g != null)
        {
            canvas.save();
            k k1 = g;
            b.c();
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        } else
        {
            super.dispatchDraw(canvas);
            return;
        }
    }

    public final void e(int i1)
    {
        a = i1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return !h;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        i1 = k1 - i1;
        j1 = l1 - j1;
        c.layout(0, 0, i1 - f, j1);
        if (d != null)
        {
            d.layout(0, 0, i1 - f, j1);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int l1 = getDefaultSize(0, i1);
        int k1 = getDefaultSize(0, j1);
        setMeasuredDimension(l1, k1);
        i1 = getChildMeasureSpec(i1, 0, l1 - f);
        j1 = getChildMeasureSpec(j1, 0, k1);
        c.measure(i1, j1);
        if (d != null)
        {
            d.measure(i1, j1);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return !h;
    }

    public void scrollTo(int i1, int j1)
    {
        super.scrollTo(i1, j1);
        if (g != null)
        {
            invalidate();
        }
    }
}
