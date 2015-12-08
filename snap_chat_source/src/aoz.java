// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SectionIndexer;
import xyz.danoz.recyclerviewfastscroller.AbsRecyclerViewFastScroller;

public final class aoz
    implements android.view.View.OnTouchListener
{

    private final AbsRecyclerViewFastScroller a;

    public aoz(AbsRecyclerViewFastScroller absrecyclerviewfastscroller)
    {
        a = absrecyclerviewfastscroller;
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (a.d != null)
        {
            motionevent.getActionMasked();
        }
        view = a;
        float f;
        int i;
        if (view.d() != null)
        {
            f = view.d().a(motionevent);
        } else
        {
            f = 0.0F;
        }
        view = a;
        i = (int)((float)((AbsRecyclerViewFastScroller) (view)).c.d.b() * f);
        ((AbsRecyclerViewFastScroller) (view)).c.a(i);
        if (((AbsRecyclerViewFastScroller) (view)).d != null)
        {
            ((AbsRecyclerViewFastScroller) (view)).d.setProgress(f);
            if (((AbsRecyclerViewFastScroller) (view)).c.d instanceof SectionIndexer)
            {
                motionevent = (SectionIndexer)((AbsRecyclerViewFastScroller) (view)).c.d;
                i = motionevent.getSectionForPosition(i);
                motionevent = ((MotionEvent) (motionevent.getSections()));
                ((AbsRecyclerViewFastScroller) (view)).d.setSection(motionevent[i]);
            }
        }
        a.a(f);
        return true;
    }
}
