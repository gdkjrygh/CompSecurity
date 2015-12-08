// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.timehop.stickyheadersrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.timehop.stickyheadersrecyclerview:
//            StickyRecyclerHeadersTouchListener, StickyRecyclerHeadersDecoration, StickyRecyclerHeadersAdapter

private class <init> extends android.view.stener.SingleTapDetector
{

    final StickyRecyclerHeadersTouchListener this$0;

    public boolean onDoubleTap(MotionEvent motionevent)
    {
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        boolean flag = false;
        int i = StickyRecyclerHeadersTouchListener.access$100(StickyRecyclerHeadersTouchListener.this).findHeaderPositionUnder((int)motionevent.getX(), (int)motionevent.getY());
        if (i != -1)
        {
            View view = StickyRecyclerHeadersTouchListener.access$100(StickyRecyclerHeadersTouchListener.this).getHeaderView(StickyRecyclerHeadersTouchListener.access$200(StickyRecyclerHeadersTouchListener.this), i);
            long l = getAdapter().getHeaderId(i);
            StickyRecyclerHeadersTouchListener.access$300(StickyRecyclerHeadersTouchListener.this).onHeaderClick(view, i, l);
            StickyRecyclerHeadersTouchListener.access$200(StickyRecyclerHeadersTouchListener.this).playSoundEffect(0);
            view.onTouchEvent(motionevent);
            flag = true;
        }
        return flag;
    }

    private ner()
    {
        this$0 = StickyRecyclerHeadersTouchListener.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
