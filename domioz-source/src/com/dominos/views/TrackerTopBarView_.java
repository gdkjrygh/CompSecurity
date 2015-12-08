// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageButton;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            TrackerTopBarView

public final class TrackerTopBarView_ extends TrackerTopBarView
    implements a, b
{

    private boolean alreadyInflated_;
    private Handler handler_;
    private final c onViewChangedNotifier_;

    public TrackerTopBarView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        handler_ = new Handler(Looper.getMainLooper());
        init_();
    }

    public TrackerTopBarView_(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        handler_ = new Handler(Looper.getMainLooper());
        init_();
    }

    public static TrackerTopBarView build(Context context)
    {
        context = new TrackerTopBarView_(context);
        context.onFinishInflate();
        return context;
    }

    public static TrackerTopBarView build(Context context, AttributeSet attributeset)
    {
        context = new TrackerTopBarView_(context, attributeset);
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
            inflate(getContext(), 0x7f0300ea, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mMultiScreenButton = (ImageButton)a1.findViewById(0x7f0f04d5);
        mHomeButton = (ImageButton)a1.findViewById(0x7f0f04d3);
        setupFonts();
    }

    public final void setHomeButtonVisible(final boolean visible)
    {
        handler_.post(new _cls1());
    }

    public final void setmMultiScreenButtonVisible(final boolean visible)
    {
        handler_.post(new _cls2());
    }



    private class _cls1
        implements Runnable
    {

        final TrackerTopBarView_ this$0;
        final boolean val$visible;

        public void run()
        {
            setHomeButtonVisible(visible);
        }

        _cls1()
        {
            this$0 = TrackerTopBarView_.this;
            visible = flag;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final TrackerTopBarView_ this$0;
        final boolean val$visible;

        public void run()
        {
            setmMultiScreenButtonVisible(visible);
        }

        _cls2()
        {
            this$0 = TrackerTopBarView_.this;
            visible = flag;
            super();
        }
    }

}
