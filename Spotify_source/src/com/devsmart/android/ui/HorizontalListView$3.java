// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devsmart.android.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.Scroller;

// Referenced classes of package com.devsmart.android.ui:
//            HorizontalListView

final class istener extends android.view.eOnGestureListener
{

    private HorizontalListView a;

    private static boolean a(MotionEvent motionevent, View view)
    {
        Rect rect = new Rect();
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        int i = ai[0];
        int j = view.getWidth();
        int k = ai[1];
        rect.set(i, k, j + i, view.getHeight() + k);
        return rect.contains((int)motionevent.getRawX(), (int)motionevent.getRawY());
    }

    public final boolean onDown(MotionEvent motionevent)
    {
        motionevent = a;
        motionevent.e = ((HorizontalListView) (motionevent)).d.isFinished();
        ((HorizontalListView) (motionevent)).d.forceFinished(true);
        return true;
    }

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return a.a(f);
    }

    public final void onLongPress(MotionEvent motionevent)
    {
        int i;
        int j;
        j = a.getChildCount();
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L1
_L1:
        View view;
        int k;
        view = a.getChildAt(i);
        k = HorizontalListView.c(a) + 1 + i;
        if (!a(motionevent, view)) goto _L4; else goto _L3
_L3:
        if (!view.performLongClick()) goto _L5; else goto _L2
_L2:
        android.widget.gClickListener gclicklistener;
        return;
_L5:
        if ((gclicklistener = a.getOnItemLongClickListener()) != null && gclicklistener.onItemLongClick(a, view, k, a.a.getItemId(k))) goto _L2; else goto _L4
_L4:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        synchronized (a)
        {
            motionevent1 = a;
            motionevent1.c = ((HorizontalListView) (motionevent1)).c + (int)f;
        }
        a.requestLayout();
        return true;
        motionevent1;
        motionevent;
        JVM INSTR monitorexit ;
        throw motionevent1;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        if (a.e)
        {
            int i = 0;
            while (i < a.getChildCount()) 
            {
                View view = a.getChildAt(i);
                int j = HorizontalListView.c(a) + 1 + i;
                if (a(motionevent, view))
                {
                    if (view.performClick())
                    {
                        return true;
                    }
                    Object obj = a.getOnItemClickListener();
                    if (obj != null)
                    {
                        ((android.widget.ckListener) (obj)).onItemClick(a, view, j, a.a.getItemId(j));
                        return true;
                    }
                    obj = a.getOnItemSelectedListener();
                    if (obj != null)
                    {
                        ((android.widget.ectedListener) (obj)).onItemSelected(a, view, j, a.a.getItemId(j));
                        return true;
                    }
                }
                i++;
            }
        }
        return false;
    }

    ener(HorizontalListView horizontallistview)
    {
        a = horizontallistview;
        super();
    }
}
