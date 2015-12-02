// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.facebook.widget.listview.BetterListView;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.threadlist:
//            bo, bn, i

public class ThreadListView extends BetterListView
    implements bo
{

    private i a;
    private final android.widget.AbsListView.OnScrollListener b;

    public ThreadListView(Context context)
    {
        super(context);
        b = new bn(this);
        d();
    }

    public ThreadListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new bn(this);
        d();
    }

    public ThreadListView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        b = new bn(this);
        d();
    }

    static i a(ThreadListView threadlistview)
    {
        return threadlistview.a;
    }

    private void d()
    {
        a(b);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        Preconditions.checkNotNull(a);
        a.b(motionevent);
        return super.dispatchTouchEvent(motionevent);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Preconditions.checkNotNull(a);
        a.b();
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        Preconditions.checkNotNull(a);
        a.a();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Preconditions.checkNotNull(a);
        a.c();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        Preconditions.checkNotNull(a);
        a.a(motionevent);
        return super.onTouchEvent(motionevent);
    }

    public void setPublisherController(i j)
    {
        a = j;
    }
}
