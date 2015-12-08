// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.ViewSwitcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bkx extends ViewSwitcher
{

    final cjt a;
    final ckf b;

    public bkx(Context context, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        super(context);
        a = new cjt(context);
        if (context instanceof Activity)
        {
            b = new ckf((Activity)context, ongloballayoutlistener, onscrollchangedlistener);
            b.a();
            return;
        } else
        {
            b = null;
            return;
        }
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (b != null)
        {
            b.c();
        }
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (b != null)
        {
            b.d();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        a.a(motionevent);
        return false;
    }

    public final void removeAllViews()
    {
        Object obj = new ArrayList();
        for (int i = 0; i < getChildCount(); i++)
        {
            android.view.View view = getChildAt(i);
            if (view != null && (view instanceof ckw))
            {
                ((List) (obj)).add((ckw)view);
            }
        }

        super.removeAllViews();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((ckw)((Iterator) (obj)).next()).destroy()) { }
    }
}
