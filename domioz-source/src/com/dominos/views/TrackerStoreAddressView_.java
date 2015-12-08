// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            TrackerStoreAddressView

public final class TrackerStoreAddressView_ extends TrackerStoreAddressView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_;

    public TrackerStoreAddressView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public TrackerStoreAddressView_(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public static TrackerStoreAddressView build(Context context)
    {
        context = new TrackerStoreAddressView_(context);
        context.onFinishInflate();
        return context;
    }

    public static TrackerStoreAddressView build(Context context, AttributeSet attributeset)
    {
        context = new TrackerStoreAddressView_(context, attributeset);
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
            inflate(getContext(), 0x7f0300e9, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mFeedbackContainer = (FrameLayout)a1.findViewById(0x7f0f04d2);
        mStoreAddress = (TextView)a1.findViewById(0x7f0f04d0);
        setupFonts();
    }
}
