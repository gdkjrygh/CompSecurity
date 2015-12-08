// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Scroller;
import java.lang.reflect.Field;

// Referenced classes of package com.roidapp.baselib.view:
//            a, b, c, d

public class DraggableGridView extends GridView
{

    private android.view.WindowManager.LayoutParams A;
    private d B;
    private Vibrator C;
    private Scroller D;
    private Runnable E;
    private Runnable F;
    private Matrix G;
    private Runnable H;
    int a[];
    int b[];
    float c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private Rect u;
    private Handler v;
    private Bitmap w;
    private ImageView x;
    private View y;
    private WindowManager z;

    public DraggableGridView(Context context)
    {
        this(context, null);
    }

    public DraggableGridView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DraggableGridView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        n = 0x80000000;
        u = new Rect();
        v = new Handler();
        E = new a(this);
        F = new b(this);
        G = new Matrix();
        a = new int[2];
        b = new int[2];
        c = 1.0F;
        H = new c(this);
        C = (Vibrator)context.getSystemService("vibrator");
        z = (WindowManager)context.getSystemService("window");
        l = a(context);
        D = new Scroller(context);
        e = context.getResources().getDisplayMetrics().heightPixels / 4;
    }

    private static int a(Context context)
    {
        Rect rect = new Rect();
        ((Activity)context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int j1 = rect.top;
        int i1 = j1;
        if (j1 <= 0)
        {
            try
            {
                Class class1 = Class.forName("com.android.internal.R$dimen");
                Object obj = class1.newInstance();
                i1 = Integer.parseInt(class1.getField("status_bar_height").get(obj).toString());
                i1 = context.getResources().getDimensionPixelSize(i1);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return j1;
            }
        }
        return i1;
    }

    private void a(int i1, int j1)
    {
        boolean flag = false;
        int k1 = pointToPosition(i1, j1);
        int k2 = getFirstVisiblePosition();
        int i2 = getLastVisiblePosition();
        int l2 = getHeight();
        int i3 = u.bottom - u.top;
        int j2 = u.bottom + i3 / 2;
        int l1 = j2;
        if (j2 > l2)
        {
            l1 = l2 - i3 / 2;
        }
        if (k1 != m && k1 != -1)
        {
            View view = getChildAt(k1 - k2);
            if (view != null)
            {
                view.getHitRect(u);
                l1 = u.right;
                l1 = u.left;
                l1 = u.bottom;
                l1 = u.top;
                if (u.contains(i1, j1))
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                j1 = i1;
                i1 = k1;
            } else
            {
                i1 = k1;
                j1 = ((flag) ? 1 : 0);
            }
        } else
        if (k1 == -1 && m != i2 && i2 == getCount() - 1 && l1 > 0 && i > l1 && !u.contains(i1, j1))
        {
            j1 = 1;
            i1 = i2;
        } else
        {
            i1 = k1;
            j1 = ((flag) ? 1 : 0);
        }
        if (j1 != 0)
        {
            if (B != null)
            {
                B.a(m, i1);
            }
            m = i1;
            if (n >= 0)
            {
                n = 0x80000000;
            }
            view = getChildAt(m - k2);
            if (view != null)
            {
                view.getHitRect(u);
            }
        }
    }

    static void a(DraggableGridView draggablegridview, int i1, int j1)
    {
        draggablegridview.a(i1, j1);
    }

    static boolean a(DraggableGridView draggablegridview)
    {
        return draggablegridview.d;
    }

    private void b()
    {
        Bitmap bitmap;
label0:
        {
            if (y == null)
            {
                break MISSING_BLOCK_LABEL_370;
            }
            if (B != null)
            {
                B.a(y);
            }
            p = f - y.getLeft();
            o = g - y.getTop();
            r = j - f;
            q = k - g;
            t = getHeight() - getHeight() / 4;
            s = q;
            y.getHitRect(u);
            y.setDrawingCacheEnabled(true);
            Bitmap bitmap1 = y.getDrawingCache(true);
            if (bitmap1 != null)
            {
                bitmap = bitmap1;
                if (!bitmap1.isRecycled())
                {
                    break label0;
                }
            }
            y.buildDrawingCache(true);
            bitmap = y.getDrawingCache(true);
        }
        {
            if (bitmap == null)
            {
                break MISSING_BLOCK_LABEL_371;
            }
            int i1;
            int j1;
            try
            {
                w = Bitmap.createBitmap(bitmap);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                w = null;
            }
        }
        y.destroyDrawingCache();
        y.setVisibility(4);
        if (w == null)
        {
            break MISSING_BLOCK_LABEL_370;
        }
        bitmap = w;
        i1 = f;
        j1 = g;
        A = new android.view.WindowManager.LayoutParams();
        A.x = (i1 - p) + r + 10;
        A.y = (((j1 - o) + q) - l) + 10;
        A.gravity = 51;
        A.format = -3;
        A.alpha = 0.5F;
        A.width = -2;
        A.height = -2;
        A.flags = 24;
        x = new ImageView(getContext());
        x.setImageBitmap(bitmap);
        z.addView(x, A);
        return;
        w = null;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_178;
        }
        android.view.WindowManager.BadTokenException badtokenexception;
        badtokenexception;
        badtokenexception.printStackTrace();
        return;
    }

    static boolean b(DraggableGridView draggablegridview)
    {
        draggablegridview.d = true;
        return true;
    }

    static Vibrator c(DraggableGridView draggablegridview)
    {
        return draggablegridview.C;
    }

    private void c()
    {
        Object obj;
        if (n >= 0)
        {
            obj = getChildAt(n - getFirstVisiblePosition());
            n = 0x80000000;
        } else
        if (m >= 0)
        {
            obj = getChildAt(m - getFirstVisiblePosition());
        } else
        {
            obj = null;
        }
        if (obj != null && !((View) (obj)).isShown())
        {
            ((View) (obj)).setVisibility(0);
        }
        if (B != null)
        {
            int ai[] = new int[2];
            int ai1[] = new int[2];
            if (x != null)
            {
                x.getLocationOnScreen(ai);
                getLocationOnScreen(ai1);
                ai[0] = ai[0] - ai1[0];
                ai[1] = ai[1] - ai1[1];
            }
            obj = B.a(((View) (obj)), m, ai);
            if (obj != null)
            {
                a[0] = obj[0];
                a[1] = obj[1];
                v.postDelayed(H, 25L);
            } else
            if (x != null)
            {
                try
                {
                    z.removeView(x);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    ((IllegalArgumentException) (obj)).printStackTrace();
                }
                x = null;
                return;
            }
        }
    }

    static void d(DraggableGridView draggablegridview)
    {
        draggablegridview.b();
    }

    static int e(DraggableGridView draggablegridview)
    {
        return draggablegridview.g;
    }

    static int f(DraggableGridView draggablegridview)
    {
        return draggablegridview.i;
    }

    static int g(DraggableGridView draggablegridview)
    {
        return draggablegridview.t;
    }

    static int h(DraggableGridView draggablegridview)
    {
        return draggablegridview.e;
    }

    static Runnable i(DraggableGridView draggablegridview)
    {
        return draggablegridview.F;
    }

    static Handler j(DraggableGridView draggablegridview)
    {
        return draggablegridview.v;
    }

    static int k(DraggableGridView draggablegridview)
    {
        return draggablegridview.s;
    }

    static int l(DraggableGridView draggablegridview)
    {
        return draggablegridview.m;
    }

    static Scroller m(DraggableGridView draggablegridview)
    {
        return draggablegridview.D;
    }

    static Rect n(DraggableGridView draggablegridview)
    {
        return draggablegridview.u;
    }

    static int o(DraggableGridView draggablegridview)
    {
        return draggablegridview.h;
    }

    static ImageView p(DraggableGridView draggablegridview)
    {
        return draggablegridview.x;
    }

    static Matrix q(DraggableGridView draggablegridview)
    {
        return draggablegridview.G;
    }

    static android.view.WindowManager.LayoutParams r(DraggableGridView draggablegridview)
    {
        return draggablegridview.A;
    }

    static WindowManager s(DraggableGridView draggablegridview)
    {
        return draggablegridview.z;
    }

    static Runnable t(DraggableGridView draggablegridview)
    {
        return draggablegridview.H;
    }

    static ImageView u(DraggableGridView draggablegridview)
    {
        draggablegridview.x = null;
        return null;
    }

    static d v(DraggableGridView draggablegridview)
    {
        return draggablegridview.B;
    }

    public final void a()
    {
        v.removeCallbacks(E);
        v.removeCallbacks(F);
        if (d)
        {
            c();
            d = false;
        }
    }

    public final void a(int i1)
    {
        d = true;
        n = i1;
    }

    public final void a(d d1)
    {
        B = d1;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        i1 = 0;
        flag = true;
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 36
    //                   0 46
    //                   1 455
    //                   2 195;
           goto _L1 _L2 _L3 _L4
_L1:
        flag = super.onTouchEvent(motionevent);
_L6:
        return flag;
_L2:
        f = (int)motionevent.getX();
        g = (int)motionevent.getY();
        j = (int)motionevent.getRawX();
        k = (int)motionevent.getRawY();
        m = pointToPosition(f, g);
        if (m == -1 || n >= 0 && m != n)
        {
            if (d)
            {
                c();
                d = false;
            }
            return super.onTouchEvent(motionevent);
        }
        y = getChildAt(m - getFirstVisiblePosition());
        if (d)
        {
            b();
        } else
        {
            v.postDelayed(E, 500L);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int j1;
        int k1;
        h = (int)motionevent.getX();
        i = (int)motionevent.getY();
        if (y == null)
        {
            i1 = 1;
        }
        j1 = i1;
        if (y != null)
        {
            j1 = y.getLeft();
            k1 = y.getTop();
            if (h >= j1 && h <= j1 + y.getWidth())
            {
                break; /* Loop/switch isn't completed */
            }
            j1 = 1;
        }
_L9:
        if (j1 != 0)
        {
            v.removeCallbacks(E);
        }
        if (!d || x == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = h;
        j1 = i;
        A.x = (i1 - p) + r;
        A.y = ((j1 - o) + q) - l;
        z.updateViewLayout(x, A);
        a(i1, j1);
        v.post(F);
        if (B.a(x, h))
        {
            v.removeCallbacks(F);
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (i < k1) goto _L8; else goto _L7
_L7:
        j1 = i1;
        if (i <= k1 + y.getHeight()) goto _L9; else goto _L8
_L8:
        j1 = 1;
          goto _L9
_L3:
        v.removeCallbacks(E);
        v.removeCallbacks(F);
        if (d)
        {
            c();
            d = false;
            return true;
        }
        if (true) goto _L1; else goto _L10
_L10:
    }
}
