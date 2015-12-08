// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ScrollView;
import com.pandora.android.util.s;
import java.util.ArrayList;
import java.util.Iterator;

public class StickyScrollView extends ScrollView
{

    private ArrayList a;
    private View b;
    private float c;
    private boolean d;
    private boolean e;
    private boolean f;
    private final Runnable g;
    private boolean h;

    public StickyScrollView(Context context)
    {
        this(context, null);
    }

    public StickyScrollView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010080);
    }

    public StickyScrollView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        g = new Runnable() {

            final StickyScrollView a;

            public void run()
            {
                if (StickyScrollView.a(a) != null)
                {
                    int k = StickyScrollView.a(a, StickyScrollView.a(a));
                    int l = StickyScrollView.b(a, StickyScrollView.a(a));
                    int i1 = StickyScrollView.c(a, StickyScrollView.a(a));
                    int j1 = (int)((float)a.getScrollY() + ((float)StickyScrollView.a(a).getHeight() + StickyScrollView.b(a)));
                    a.invalidate(k, l, i1, j1);
                }
                a.postDelayed(this, 16L);
            }

            
            {
                a = StickyScrollView.this;
                super();
            }
        };
        h = true;
        a();
    }

    private int a(View view)
    {
        int j;
        for (j = view.getLeft(); view.getParent() != getChildAt(0) && view.getParent() != null; j += view.getLeft())
        {
            view = (View)view.getParent();
        }

        return j;
    }

    static int a(StickyScrollView stickyscrollview, View view)
    {
        return stickyscrollview.a(view);
    }

    static View a(StickyScrollView stickyscrollview)
    {
        return stickyscrollview.b;
    }

    static float b(StickyScrollView stickyscrollview)
    {
        return stickyscrollview.c;
    }

    private int b(View view)
    {
        int j;
        for (j = view.getTop(); view.getParent() != getChildAt(0) && view.getParent() != null; j += view.getTop())
        {
            view = (View)view.getParent();
        }

        return j;
    }

    static int b(StickyScrollView stickyscrollview, View view)
    {
        return stickyscrollview.d(view);
    }

    private void b()
    {
        View view;
        View view1;
        Iterator iterator;
        view = null;
        iterator = a.iterator();
        view1 = null;
_L6:
        if (iterator.hasNext())
        {
            View view2 = (View)iterator.next();
            int i1 = b(view2);
            int k1 = getScrollY();
            int j;
            if (e)
            {
                j = 0;
            } else
            {
                j = getPaddingTop();
            }
            i1 = (i1 - k1) + j;
            if (i1 <= 0)
            {
                if (view1 != null)
                {
                    int l1 = b(view1);
                    int k2 = getScrollY();
                    if (e)
                    {
                        j = 0;
                    } else
                    {
                        j = getPaddingTop();
                    }
                    if (i1 <= j + (l1 - k2))
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                }
                view1 = view2;
                continue; /* Loop/switch isn't completed */
            }
            if (view != null)
            {
                int i2 = b(view);
                int l2 = getScrollY();
                int k;
                if (e)
                {
                    k = 0;
                } else
                {
                    k = getPaddingTop();
                }
                if (i1 >= k + (i2 - l2))
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            view = view2;
            continue; /* Loop/switch isn't completed */
        }
        if (view1 == null) goto _L2; else goto _L1
_L1:
        float f1;
        if (view == null)
        {
            f1 = 0.0F;
        } else
        {
            int j1 = b(view);
            int j2 = getScrollY();
            int l;
            if (e)
            {
                l = 0;
            } else
            {
                l = getPaddingTop();
            }
            f1 = Math.min(0, (l + (j1 - j2)) - view1.getHeight());
        }
        c = f1;
        if (view1 != b)
        {
            if (b != null)
            {
                c();
            }
            e(view1);
        }
_L4:
        return;
_L2:
        if (b == null) goto _L4; else goto _L3
_L3:
        c();
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private int c(View view)
    {
        int j;
        for (j = view.getRight(); view.getParent() != getChildAt(0) && view.getParent() != null; j += view.getRight())
        {
            view = (View)view.getParent();
        }

        return j;
    }

    static int c(StickyScrollView stickyscrollview, View view)
    {
        return stickyscrollview.c(view);
    }

    private void c()
    {
        if (g(b).contains("-hastransparancy"))
        {
            i(b);
        }
        b = null;
        removeCallbacks(g);
    }

    private int d(View view)
    {
        int j;
        for (j = view.getBottom(); view.getParent() != getChildAt(0) && view.getParent() != null; j += view.getBottom())
        {
            view = (View)view.getParent();
        }

        return j;
    }

    private void d()
    {
        if (b != null)
        {
            c();
        }
        a.clear();
        f(getChildAt(0));
        b();
        invalidate();
    }

    private void e(View view)
    {
        b = view;
        if (g(b).contains("-hastransparancy"))
        {
            h(b);
        }
        if (((String)b.getTag()).contains("-nonconstant"))
        {
            post(g);
        }
    }

    private void f(View view)
    {
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int j = 0;
            while (j < view.getChildCount()) 
            {
                String s1 = g(view.getChildAt(j));
                if (s1 != null && s1.contains("sticky"))
                {
                    a.add(view.getChildAt(j));
                } else
                if (view.getChildAt(j) instanceof ViewGroup)
                {
                    f(view.getChildAt(j));
                }
                j++;
            }
        } else
        {
            String s2 = (String)view.getTag();
            if (s2 != null && s2.contains("sticky"))
            {
                a.add(view);
            }
        }
    }

    private String g(View view)
    {
        return String.valueOf(view.getTag());
    }

    private void h(View view)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            view.setAlpha(0.0F);
            return;
        } else
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation.setDuration(0L);
            alphaanimation.setFillAfter(true);
            view.startAnimation(alphaanimation);
            return;
        }
    }

    private void i(View view)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            view.setAlpha(1.0F);
            return;
        } else
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
            alphaanimation.setDuration(0L);
            alphaanimation.setFillAfter(true);
            view.startAnimation(alphaanimation);
            return;
        }
    }

    public void a()
    {
        a = new ArrayList();
        s.a(this, false);
    }

    public void addView(View view)
    {
        super.addView(view);
        f(view);
    }

    public void addView(View view, int j)
    {
        super.addView(view, j);
        f(view);
    }

    public void addView(View view, int j, int k)
    {
        super.addView(view, j, k);
        f(view);
    }

    public void addView(View view, int j, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, j, layoutparams);
        f(view);
    }

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, layoutparams);
        f(view);
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (b != null)
        {
            canvas.save();
            float f1 = getPaddingLeft();
            float f2 = getScrollY();
            float f3 = c;
            int j;
            if (e)
            {
                j = getPaddingTop();
            } else
            {
                j = 0;
            }
            canvas.translate(f1, (float)j + (f3 + f2));
            if (e)
            {
                f1 = -c;
            } else
            {
                f1 = 0.0F;
            }
            canvas.clipRect(0.0F, f1, getWidth(), b.getHeight());
            if (g(b).contains("-hastransparancy"))
            {
                i(b);
                b.draw(canvas);
                h(b);
            } else
            {
                b.draw(canvas);
            }
            canvas.restore();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag1;
        flag1 = true;
        if (motionevent.getAction() == 0)
        {
            d = true;
        }
        if (!d) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if (d)
        {
            if (motionevent.getY() <= (float)b.getHeight() + c && motionevent.getX() >= (float)a(b) && motionevent.getX() <= (float)c(b))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            d = flag;
        }
_L4:
        if (d)
        {
            motionevent.offsetLocation(0.0F, -1F * (((float)getScrollY() + c) - (float)b(b)));
        }
        return super.dispatchTouchEvent(motionevent);
_L2:
        if (b == null)
        {
            d = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        super.onLayout(flag, j, k, l, i1);
        if (!f)
        {
            e = true;
        }
        d();
    }

    protected void onScrollChanged(int j, int k, int l, int i1)
    {
        super.onScrollChanged(j, k, l, i1);
        b();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (d)
        {
            motionevent.offsetLocation(0.0F, ((float)getScrollY() + c) - (float)b(b));
        }
        if (motionevent.getAction() == 0)
        {
            h = false;
        }
        if (h)
        {
            MotionEvent motionevent1 = MotionEvent.obtain(motionevent);
            motionevent1.setAction(0);
            super.onTouchEvent(motionevent1);
            h = false;
        }
        if (motionevent.getAction() == 1 || motionevent.getAction() == 3)
        {
            h = true;
        }
        return super.onTouchEvent(motionevent);
    }

    public void requestChildFocus(View view, View view1)
    {
        super.requestChildFocus(view, view);
    }

    public void setClipToPadding(boolean flag)
    {
        super.setClipToPadding(flag);
        e = flag;
        f = true;
    }
}
