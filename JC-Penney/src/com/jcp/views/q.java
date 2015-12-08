// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.ListAdapter;

// Referenced classes of package com.jcp.views:
//            HorizontalListView

class q extends android.view.GestureDetector.SimpleOnGestureListener
{

    final HorizontalListView a;

    q(HorizontalListView horizontallistview)
    {
        a = horizontallistview;
        super();
    }

    private boolean a(MotionEvent motionevent, View view)
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

    public boolean onDown(MotionEvent motionevent)
    {
        return a.a(motionevent);
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return a.a(motionevent, motionevent1, f, f1);
    }

    public void onLongPress(MotionEvent motionevent)
    {
        int j = a.getChildCount();
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    View view = a.getChildAt(i);
                    if (!a(motionevent, view))
                    {
                        break label0;
                    }
                    if (HorizontalListView.e(a) != null)
                    {
                        HorizontalListView.e(a).onItemLongClick(a, view, HorizontalListView.c(a) + 1 + i, a.a.getItemId(i + (HorizontalListView.c(a) + 1)));
                    }
                }
                return;
            }
            i++;
        } while (true);
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        motionevent = a.getParent();
        if (motionevent != null)
        {
            motionevent.requestDisallowInterceptTouchEvent(true);
        }
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

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        int i = 0;
        do
        {
label0:
            {
                if (i < a.getChildCount())
                {
                    View view = a.getChildAt(i);
                    if (!a(motionevent, view))
                    {
                        break label0;
                    }
                    if (HorizontalListView.b(a) != null)
                    {
                        HorizontalListView.b(a).onItemClick(a, view, HorizontalListView.c(a) + 1 + i, a.a.getItemId(HorizontalListView.c(a) + 1 + i));
                    }
                    if (HorizontalListView.d(a) != null)
                    {
                        HorizontalListView.d(a).onItemSelected(a, view, HorizontalListView.c(a) + 1 + i, a.a.getItemId(HorizontalListView.c(a) + 1 + i));
                    }
                }
                return true;
            }
            i++;
        } while (true);
    }
}
