// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.TextView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            ToolBarView

public final class ToolBarView_ extends ToolBarView
    implements a, b
{

    private boolean alreadyInflated_;
    private Handler handler_;
    private final c onViewChangedNotifier_;

    public ToolBarView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        handler_ = new Handler(Looper.getMainLooper());
        init_();
    }

    public ToolBarView_(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        handler_ = new Handler(Looper.getMainLooper());
        init_();
    }

    public ToolBarView_(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        handler_ = new Handler(Looper.getMainLooper());
        init_();
    }

    public static ToolBarView build(Context context)
    {
        context = new ToolBarView_(context);
        context.onFinishInflate();
        return context;
    }

    public static ToolBarView build(Context context, AttributeSet attributeset)
    {
        context = new ToolBarView_(context, attributeset);
        context.onFinishInflate();
        return context;
    }

    public static ToolBarView build(Context context, AttributeSet attributeset, int i)
    {
        context = new ToolBarView_(context, attributeset, i);
        context.onFinishInflate();
        return context;
    }

    private void init_()
    {
        c c1 = c.a(onViewChangedNotifier_);
        c.a(this);
        c.a(c1);
    }

    public final void onFinishInflate()
    {
        if (!alreadyInflated_)
        {
            alreadyInflated_ = true;
            inflate(getContext(), 0x7f0300e2, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mToolBarTitleTextView = (TextView)a1.findViewById(0x7f0f04a6);
        mHomeButton = (ImageButton)a1.findViewById(0x7f0f007f);
    }

    public final void setHomeButtonVisibility(final int visibility)
    {
        handler_.post(new _cls1());
    }


    private class _cls1
        implements Runnable
    {

        final ToolBarView_ this$0;
        final int val$visibility;

        public void run()
        {
            setHomeButtonVisibility(visibility);
        }

        _cls1()
        {
            this$0 = ToolBarView_.this;
            visibility = i;
            super();
        }
    }

}
