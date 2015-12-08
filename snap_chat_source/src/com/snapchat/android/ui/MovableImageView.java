// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Gr;
import Jo;
import aP;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ImageView;

public class MovableImageView extends ImageView
    implements Gr.a
{

    public String a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    private Gr g;
    private float h;
    private float i;

    public MovableImageView(Context context, int j)
    {
        super(context, null);
        a = "MovableImageView";
        g = new Gr(this);
        e = false;
        f = false;
        b = ViewConfiguration.get(context).getScaledTouchSlop();
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(j, j));
    }

    public final volatile Object a()
    {
        MovableImageView movableimageview = this;
        if (!e)
        {
            movableimageview = null;
        }
        return movableimageview;
    }

    public final void a(float f1, float f2)
    {
        setX(f1);
        setY(f2);
        i = f1;
        h = f2;
    }

    public final boolean a(Object obj, Gr.c c1)
    {
        obj = (MovableImageView)obj;
        float f1 = c1.a();
        ((MovableImageView) (obj)).a(c1.a, c1.b);
        ((MovableImageView) (obj)).setRotation((float)Math.toDegrees(c1.b()) % 360F);
        ((MovableImageView) (obj)).setScaleX(f1);
        ((MovableImageView) (obj)).setScaleY(f1);
        return true;
    }

    public final void b(Object obj, Gr.c c1)
    {
        obj = (MovableImageView)obj;
        c1.a(((MovableImageView) (obj)).getX(), ((MovableImageView) (obj)).getY(), true, ((MovableImageView) (obj)).getScaleX(), true, ((MovableImageView) (obj)).getScaleX(), ((MovableImageView) (obj)).getScaleY(), true, (float)Math.toRadians(((MovableImageView) (obj)).getRotation()));
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        aP.a(motionevent);
        JVM INSTR tableswitch 0 6: default 48
    //                   0 59
    //                   1 236
    //                   2 132
    //                   3 48
    //                   4 48
    //                   5 83
    //                   6 48;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L5 _L1
_L1:
        g.a(motionevent);
        return true;
_L2:
        h = motionevent.getRawY();
        i = motionevent.getRawX();
        f = true;
        continue; /* Loop/switch isn't completed */
_L5:
        float af[] = Jo.a(motionevent.getX(0), motionevent.getY(0), motionevent.getX(1), motionevent.getY(1));
        h = af[0];
        i = af[1];
        f = true;
        continue; /* Loop/switch isn't completed */
_L4:
        float f2 = motionevent.getRawY();
        float f1 = motionevent.getRawX() - i;
        f2 -= h;
        c = c + Math.abs(f1);
        d = d + Math.abs(f2);
        if (Math.abs(f1) >= b || Math.abs(f2) >= b || c >= b || d >= b)
        {
            e = true;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        c = 0.0F;
        d = 0.0F;
        if (e)
        {
            e = false;
        }
        f = false;
        if (true) goto _L1; else goto _L6
_L6:
    }
}
