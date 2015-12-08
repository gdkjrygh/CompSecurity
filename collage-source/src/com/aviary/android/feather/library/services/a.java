// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.aviary.android.feather.library.services.drag.DragLayer;
import com.aviary.android.feather.library.services.drag.DragView;
import java.util.ArrayList;

public class a
{

    public static int a = 0;
    public static int b = 1;
    Context c;
    DragLayer d;
    private Vibrator e;
    private Rect f;
    private final int g[] = new int[2];
    private float h;
    private float i;
    private DisplayMetrics j;
    private View k;
    private float l;
    private float m;
    private DragControllerService.b n;
    private Object o;
    private DragView p;
    private ArrayList q;
    private DragControllerService.a r;
    private IBinder s;
    private View t;
    private com.aviary.android.feather.library.services.drag.a u;
    private InputMethodManager v;

    public a(Context context, DragLayer draglayer)
    {
        f = new Rect();
        j = new DisplayMetrics();
        q = new ArrayList();
        c = context;
        d = draglayer;
    }

    private static int a(int i1, int j1, int k1)
    {
        if (i1 < j1)
        {
            return j1;
        }
        if (i1 >= k1)
        {
            return k1 - 1;
        } else
        {
            return i1;
        }
    }

    private com.aviary.android.feather.library.services.drag.a a(int i1, int j1, int ai[])
    {
        Rect rect = f;
        ArrayList arraylist = q;
        for (int k1 = arraylist.size() - 1; k1 >= 0; k1--)
        {
            com.aviary.android.feather.library.services.drag.a a1 = (com.aviary.android.feather.library.services.drag.a)arraylist.get(k1);
            a1.getHitRect(rect);
            a1.getLocationOnScreen(ai);
            rect.offset(ai[0] - a1.getLeft(), ai[1] - a1.getTop());
            if (rect.contains(i1, j1))
            {
                ai[0] = i1 - ai[0];
                ai[1] = j1 - ai[1];
                return a1;
            }
        }

        return null;
    }

    private boolean a(float f1, float f2)
    {
        int ai[] = g;
        com.aviary.android.feather.library.services.drag.a a1 = a((int)f1, (int)f2, ai);
        if (a1 != null)
        {
            a1.d(n, ai[0], ai[1], (int)l, (int)m, p, o);
            if (a1.e(n, ai[0], ai[1], (int)l, (int)m, p, o))
            {
                a1.a(n, ai[0], ai[1], (int)l, (int)m, p, o);
                n.a(a1, true);
                return true;
            } else
            {
                n.a(a1, false);
                return true;
            }
        } else
        {
            return false;
        }
    }

    private Bitmap b(View view)
    {
        view.clearFocus();
        view.setPressed(false);
        boolean flag = view.willNotCacheDrawing();
        view.setWillNotCacheDrawing(false);
        int i1 = view.getDrawingCacheBackgroundColor();
        view.setDrawingCacheBackgroundColor(0);
        if (i1 != 0)
        {
            view.destroyDrawingCache();
        }
        view.buildDrawingCache();
        Bitmap bitmap = view.getDrawingCache();
        if (bitmap == null)
        {
            return null;
        } else
        {
            bitmap = Bitmap.createBitmap(bitmap);
            view.destroyDrawingCache();
            view.setWillNotCacheDrawing(flag);
            view.setDrawingCacheBackgroundColor(i1);
            return bitmap;
        }
    }

    private void g()
    {
        if (d())
        {
            if (k != null)
            {
                k.setVisibility(0);
            }
            boolean flag = true;
            if (r != null)
            {
                flag = r.a();
            }
            if (p != null)
            {
                p.a(flag);
                p = null;
            }
        }
    }

    private void h()
    {
        ((WindowManager)c.getSystemService("window")).getDefaultDisplay().getMetrics(j);
    }

    public void a()
    {
        d.setDragController(this);
        s = d.getWindowToken();
    }

    public void a(View view)
    {
        t = view;
    }

    public void a(DragControllerService.a a1)
    {
        r = a1;
    }

    public void a(com.aviary.android.feather.library.services.drag.a a1)
    {
        q.add(a1);
    }

    public boolean a(Bitmap bitmap, int i1, int j1, int k1, int l1, int i2, int j2, 
            DragControllerService.b b1, Object obj, int k2, boolean flag)
    {
        if (s == null)
        {
            return false;
        }
        if (!s.pingBinder())
        {
            return false;
        }
        if (v == null)
        {
            v = (InputMethodManager)c.getSystemService("input_method");
        }
        v.hideSoftInputFromWindow(s, 0);
        if (r != null)
        {
            r.a(b1, obj, k2);
        }
        k2 = (int)h;
        int l2 = (int)i;
        l = h - (float)i1;
        m = i - (float)j1;
        n = b1;
        o = obj;
        if (e != null)
        {
            e.vibrate(35L);
        }
        p = new DragView(c, bitmap, k2 - i1, l2 - j1, k1, l1, i2, j2);
        p.a(s, (int)h, (int)i, flag);
        return true;
    }

    public boolean a(KeyEvent keyevent)
    {
        return d();
    }

    public boolean a(MotionEvent motionevent)
    {
        int i1;
        int j1;
        int k1;
        if (!c())
        {
            return false;
        }
        i1 = motionevent.getAction();
        if (i1 == 0)
        {
            h();
        }
        j1 = a((int)motionevent.getRawX(), 0, j.widthPixels);
        k1 = a((int)motionevent.getRawY(), 0, j.heightPixels);
        i1;
        JVM INSTR tableswitch 0 3: default 88
    //                   0 93
    //                   1 114
    //                   2 88
    //                   3 138;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return d();
_L2:
        h = j1;
        i = k1;
        u = null;
        continue; /* Loop/switch isn't completed */
_L3:
        if (d())
        {
            a(j1, k1);
        }
        g();
        continue; /* Loop/switch isn't completed */
_L4:
        e();
        if (true) goto _L1; else goto _L5
_L5:
    }

    public boolean a(View view, int i1)
    {
        return t != null && t.dispatchUnhandledMove(view, i1);
    }

    public boolean a(View view, Bitmap bitmap, int i1, int j1, DragControllerService.b b1, Object obj, int k1, 
            boolean flag)
    {
        k = view;
        if (bitmap == null)
        {
            flag = false;
        } else
        {
            int ai[] = g;
            view.getLocationOnScreen(ai);
            boolean flag1 = a(bitmap, ai[0] + i1, ai[1] + j1, 0, 0, bitmap.getWidth(), bitmap.getHeight(), b1, obj, k1, flag);
            flag = flag1;
            if (k1 == a)
            {
                flag = flag1;
                if (flag1)
                {
                    view.setVisibility(8);
                    return flag1;
                }
            }
        }
        return flag;
    }

    public boolean a(View view, DragControllerService.b b1, Object obj, int i1, boolean flag)
    {
        return a(view, b(view), 0, 0, b1, obj, i1, flag);
    }

    public void b()
    {
        d.setDragController(null);
        s = null;
    }

    public void b(com.aviary.android.feather.library.services.drag.a a1)
    {
        q.remove(a1);
    }

    public boolean b(MotionEvent motionevent)
    {
        int i1;
        int j1;
        int k1;
        if (!d())
        {
            return false;
        }
        i1 = motionevent.getAction();
        j1 = a((int)motionevent.getRawX(), 0, j.widthPixels);
        k1 = a((int)motionevent.getRawY(), 0, j.heightPixels);
        i1;
        JVM INSTR tableswitch 0 3: default 84
    //                   0 86
    //                   1 390
    //                   2 103
    //                   3 415;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return true;
_L2:
        h = j1;
        i = k1;
        continue; /* Loop/switch isn't completed */
_L4:
        com.aviary.android.feather.library.services.drag.a a1;
        int ai[];
        p.a((int)motionevent.getRawX(), (int)motionevent.getRawY());
        ai = g;
        a1 = a(j1, k1, ai);
        if (a1 == null) goto _L7; else goto _L6
_L6:
        motionevent = a1;
        if (!a1.e(n, ai[0], ai[1], (int)l, (int)m, p, o))
        {
            motionevent = null;
        }
        if (u != motionevent) goto _L9; else goto _L8
_L8:
        Object obj;
        obj = motionevent;
        if (motionevent != null)
        {
            motionevent.c(n, ai[0], ai[1], (int)l, (int)m, p, o);
            obj = motionevent;
        }
_L10:
        u = ((com.aviary.android.feather.library.services.drag.a) (obj));
        continue; /* Loop/switch isn't completed */
_L9:
        if (u != null)
        {
            u.d(n, ai[0], ai[1], (int)l, (int)m, p, o);
        }
        obj = motionevent;
        if (motionevent != null)
        {
            motionevent.b(n, ai[0], ai[1], (int)l, (int)m, p, o);
            obj = motionevent;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        obj = a1;
        if (u != null)
        {
            u.d(n, ai[0], ai[1], (int)l, (int)m, p, o);
            obj = a1;
        }
        if (true) goto _L10; else goto _L3
_L3:
        if (d())
        {
            a(j1, k1);
        }
        g();
        continue; /* Loop/switch isn't completed */
_L5:
        e();
        if (true) goto _L1; else goto _L11
_L11:
    }

    public boolean c()
    {
        return s != null;
    }

    public boolean d()
    {
        return p != null;
    }

    public void e()
    {
        g();
    }

    public void f()
    {
        b();
        q.clear();
        r = null;
        s = null;
    }

}
