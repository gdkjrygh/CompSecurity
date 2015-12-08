// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.list.fastscroll;

import afc;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import fst;
import fsu;
import fsv;
import ftf;
import ftk;
import java.util.ArrayList;
import java.util.List;

public class FastScrollRecyclerView extends RecyclerView
{

    private final List A;
    private final afc B;
    public fsv y;
    public fsu z;

    public FastScrollRecyclerView(Context context)
    {
        this(context, null);
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        A = new ArrayList();
        B = new fst(this);
        a(B);
    }

    public static List a(FastScrollRecyclerView fastscrollrecyclerview)
    {
        return fastscrollrecyclerview.A;
    }

    public final void a(afc afc)
    {
        if (afc != B)
        {
            throw new RuntimeException("Use addOnScrollListener");
        } else
        {
            super.a(afc);
            return;
        }
    }

    public final void b(afc afc)
    {
        A.add(afc);
    }

    public void draw(Canvas canvas)
    {
        Object obj;
label0:
        {
            super.draw(canvas);
            if (y != null)
            {
                obj = y;
                if (((fsv) (obj)).f != ftk.a)
                {
                    int i = ((fsv) (obj)).d();
                    ((fsv) (obj)).a.setBounds((int)((fsv) (obj)).c(), i, (int)((fsv) (obj)).b(), ((fsv) (obj)).c + i);
                    canvas.save();
                    if (((fsv) (obj)).e())
                    {
                        canvas.scale(-1F, 1.0F, ((fsv) (obj)).c() + (float)(((fsv) (obj)).d / 2), ((fsv) (obj)).c / 2 + i);
                    }
                    ((fsv) (obj)).a.draw(canvas);
                    canvas.restore();
                    ftf ftf1 = ((fsv) (obj)).e;
                    float f;
                    if (((fsv) (obj)).e())
                    {
                        f = ((fsv) (obj)).b();
                    } else
                    {
                        f = ((fsv) (obj)).c();
                    }
                    ftf1.o = f;
                    ((fsv) (obj)).e.n = i + ((fsv) (obj)).c / 2;
                    obj = ((fsv) (obj)).e;
                    if (((ftf) (obj)).l && ((ftf) (obj)).q != null)
                    {
                        break label0;
                    }
                }
            }
            return;
        }
        float f2 = ((ftf) (obj)).e.width() + ((ftf) (obj)).g * 2;
        float f3 = f2 * ((Float)((ftf) (obj)).k.getAnimatedValue()).floatValue();
        float f4 = ((ftf) (obj)).e.height() + ((ftf) (obj)).g * 2;
        float f1;
        float f5;
        if (fsv.j(((ftf) (obj)).r))
        {
            f1 = ((ftf) (obj)).o + ((ftf) (obj)).p;
        } else
        {
            f1 = ((ftf) (obj)).o - ((ftf) (obj)).p - f3;
        }
        f5 = (float)((ftf) (obj)).n - f4 / 2.0F;
        ((ftf) (obj)).a.set(f1, f5, f1 + f3, f4 + f5);
        canvas.drawRoundRect(((ftf) (obj)).a, ((ftf) (obj)).d, ((ftf) (obj)).d, ((ftf) (obj)).b);
        canvas.save();
        canvas.clipRect(f1, f5, f1 + f3, f5 + f2);
        canvas.drawText(((ftf) (obj)).q, (f1 + (float)((ftf) (obj)).g) - (f2 - f3), (float)((ftf) (obj)).g + f5 + (float)((ftf) (obj)).e.height(), ((ftf) (obj)).f);
        canvas.restore();
    }

    public boolean isVerticalScrollBarEnabled()
    {
        boolean flag1 = false;
        if (y == null) goto _L2; else goto _L1
_L1:
        if (y == null) goto _L4; else goto _L3
_L3:
        boolean flag;
        if (y.f != ftk.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L5
_L5:
        flag = true;
_L8:
        if (flag) goto _L6; else goto _L2
_L2:
        flag1 = true;
_L6:
        return flag1;
_L4:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (z != null)
        {
            z.a(canvas);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
label0:
        {
label1:
            {
                boolean flag1 = false;
                if (y != null)
                {
                    fsv fsv1 = y;
                    boolean flag;
                    if (fsv1.f != ftk.a && motionevent.getAction() == 0 && fsv1.a(motionevent.getX(), motionevent.getY()))
                    {
                        fsv1.a(ftk.c);
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        break label1;
                    }
                }
                if (!super.onInterceptTouchEvent(motionevent))
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        return flag1;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return isEnabled() && y != null && y.a(motionevent) || super.onTouchEvent(motionevent);
    }
}
