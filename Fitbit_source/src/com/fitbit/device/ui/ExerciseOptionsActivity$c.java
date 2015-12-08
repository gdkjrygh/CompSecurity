// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.res.Resources;
import android.graphics.Point;
import android.os.Handler;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fitbit.data.domain.device.ExerciseOption;
import com.fitbit.e.a;
import com.mobeta.android.dslv.DragSortListView;
import com.mobeta.android.dslv.b;

// Referenced classes of package com.fitbit.device.ui:
//            ExerciseOptionsActivity

private class a extends b
{

    DragSortListView a;
    final ExerciseOptionsActivity b;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private float n;
    private int o;

    private float a(float f1)
    {
        return TypedValue.applyDimension(1, f1, b.getResources().getDisplayMetrics());
    }

    private void e()
    {
        Display display = b.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        m = point.y - (int)(2.5F * (float)b.i.getHeight());
    }

    private void f()
    {
        b.i.setVisibility(0);
        android.widget.s s = (android.widget.s)b.i.getLayoutParams();
        s.topMargin = o;
        b.i.setLayoutParams(s);
    }

    public View a(int i1)
    {
        f();
        View view = LayoutInflater.from(b).inflate(0x7f040152, null);
        b b1 = new <init>(b.i);
        b1.a(((ExerciseOption)com.fitbit.device.ui.ExerciseOptionsActivity.a(b).getItem(i1)).b());
        b1.a(true);
        return view;
    }

    public void a(View view)
    {
        b.i.setVisibility(8);
    }

    public void a(View view, Point point, Point point1)
    {
        if (point.y > 0 && point.y < m)
        {
            android.widget.s s = (android.widget.s)b.i.getLayoutParams();
            s.topMargin = point.y;
            b.i.setLayoutParams(s);
        }
        point = new <init>(b.i);
        if (n - view.getY() == 0.0F)
        {
            ExerciseOptionsActivity.g(b).setVisibility(8);
        } else
        {
            ExerciseOptionsActivity.g(b).setVisibility(0);
        }
        if ((float)(point1.y - l) < a(48F))
        {
            point.b(true);
            i = true;
        } else
        {
            point.b(false);
            i = false;
        }
        point = new View[b.h.getChildCount()];
        for (int i1 = 0; i1 < point.length; i1++)
        {
            point[i1] = b.h.getChildAt(i1);
        }

        n = view.getY();
    }

    public boolean a(int i1, int j1, int k1)
    {
        l = k1;
        e();
        if (!j)
        {
            return false;
        }
        if (k)
        {
            ExerciseOptionsActivity.f(b).post(ExerciseOptionsActivity.h(b));
            k = false;
        } else
        {
            ExerciseOptionsActivity.f(b).postDelayed(ExerciseOptionsActivity.h(b), 500L);
        }
        return super.a(i1, j1, k1);
    }

    public void onLongPress(MotionEvent motionevent)
    {
        com.fitbit.e.a.a("ExerciseOptionsActivity", "OnLongPress", new Object[0]);
        o = (int)(motionevent.getY() - (float)l);
        b(2);
        j = true;
        super.onLongPress(motionevent);
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        super.onTouch(view, motionevent);
        switch (motionevent.getAction() & 0xff)
        {
        case 0: // '\0'
        default:
            return false;

        case 1: // '\001'
            break;
        }
        if (i)
        {
            a.a(true);
            i = false;
        }
        b.i.setVisibility(8);
        j = false;
        k = true;
        return false;
    }

    public (ExerciseOptionsActivity exerciseoptionsactivity, DragSortListView dragsortlistview)
    {
        b = exerciseoptionsactivity;
        super(dragsortlistview);
        i = false;
        j = false;
        k = true;
        a = dragsortlistview;
    }
}
