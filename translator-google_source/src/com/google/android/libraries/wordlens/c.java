// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TouchDelegate;
import android.view.View;
import com.google.android.libraries.wordlens.messaging.MessageManager;

// Referenced classes of package com.google.android.libraries.wordlens:
//            d

public final class c extends TouchDelegate
{

    public final PointF a = new PointF();
    public final Matrix b = new Matrix();
    public float c;
    private final PointF d = new PointF();
    private final float e;
    private boolean f;
    private boolean g;
    private boolean h;
    private final ScaleGestureDetector i;
    private final float j[] = new float[9];
    private int k;

    public c(Context context, View view, Rect rect)
    {
        super(rect, view);
        f = false;
        g = false;
        h = false;
        c = 1.0F;
        k = -1;
        e = context.getResources().getDisplayMetrics().density;
        i = new ScaleGestureDetector(context, new d(this));
    }

    static float a(c c1, float f1)
    {
        c1.c = f1;
        return f1;
    }

    private void a()
    {
        if (h)
        {
            h = false;
            MessageManager.a(com.google.android.libraries.wordlens.messaging.MessageManager.GUITouchPhase.CANCELLED, d.x, d.y, e);
        }
    }

    static void a(c c1)
    {
        c1.a();
    }

    static boolean a(c c1, boolean flag)
    {
        c1.f = flag;
        return flag;
    }

    private void b()
    {
        float af[] = new float[9];
        b.getValues(af);
        float f1 = af[0];
        float f2 = -af[2];
        float f3 = -af[5];
        MessageManager.a(com.google.android.libraries.wordlens.messaging.MessageManager.GUITouchPhase.MOVED, f1, f2, f3, e);
    }

    static void b(c c1)
    {
        c1.b();
    }

    static float c(c c1)
    {
        return c1.c;
    }

    static Matrix d(c c1)
    {
        return c1.b;
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        float f2;
        float f3;
        com.google.android.libraries.wordlens.messaging.MessageManager.GUITouchPhase guitouchphase;
        int l;
        l = 0;
        f3 = 0.0F;
        f2 = 0.0F;
        guitouchphase = null;
        i.onTouchEvent(motionevent);
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 6: default 68
    //                   0 110
    //                   1 216
    //                   2 285
    //                   3 271
    //                   4 68
    //                   5 169
    //                   6 366;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        float f1;
        motionevent = null;
        f1 = 0.0F;
_L12:
        if (f || motionevent == null) goto _L9; else goto _L8
_L8:
        if (!g) goto _L11; else goto _L10
_L10:
        a();
        b.postTranslate(f1, f2);
        b();
_L9:
        return true;
_L2:
        l = motionevent.getActionIndex();
        f1 = motionevent.getX(l);
        f3 = motionevent.getY(l);
        guitouchphase = com.google.android.libraries.wordlens.messaging.MessageManager.GUITouchPhase.BEGAN;
        d.set(f1, f3);
        h = true;
        k = motionevent.getPointerId(l);
        motionevent = guitouchphase;
        f1 = 0.0F;
          goto _L12
_L6:
        l = motionevent.findPointerIndex(k);
        f1 = motionevent.getX(l);
        f3 = motionevent.getY(l);
        d.set(f1, f3);
        a();
        g = true;
          goto _L1
_L3:
        l = motionevent.getActionIndex();
        f1 = motionevent.getX(l);
        f3 = motionevent.getY(l);
        motionevent = guitouchphase;
        if (h)
        {
            motionevent = com.google.android.libraries.wordlens.messaging.MessageManager.GUITouchPhase.ENDED;
            a.set(f1, f3);
        }
        k = -1;
        f1 = 0.0F;
          goto _L12
_L5:
        k = -1;
        motionevent = com.google.android.libraries.wordlens.messaging.MessageManager.GUITouchPhase.CANCELLED;
        f1 = 0.0F;
          goto _L12
_L4:
        l = motionevent.findPointerIndex(k);
        float f4 = motionevent.getX(l);
        float f5 = motionevent.getY(l);
        motionevent = com.google.android.libraries.wordlens.messaging.MessageManager.GUITouchPhase.MOVED;
        int i1;
        if (g)
        {
            f2 = f4 - d.x;
            f1 = f5 - d.y;
        } else
        {
            f1 = 0.0F;
            f2 = f3;
        }
        d.set(f4, f5);
        f3 = f1;
        f1 = f2;
        f2 = f3;
          goto _L12
_L7:
        g = false;
        i1 = motionevent.getActionIndex();
        if (motionevent.getPointerId(i1) == k)
        {
            if (i1 == 0)
            {
                l = 1;
            }
            d.set(motionevent.getX(l), motionevent.getY(l));
            k = motionevent.getPointerId(l);
            motionevent = null;
            f1 = 0.0F;
        } else
        {
            motionevent = null;
            f1 = 0.0F;
        }
          goto _L12
_L11:
        if (!h) goto _L9; else goto _L13
_L13:
        MessageManager.a(motionevent, d.x, d.y, e);
        return true;
          goto _L12
    }
}
