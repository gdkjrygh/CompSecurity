// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            HistoricalAddressView

public final class HistoricalAddressView_ extends HistoricalAddressView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_;

    public HistoricalAddressView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public HistoricalAddressView_(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public static HistoricalAddressView build(Context context)
    {
        context = new HistoricalAddressView_(context);
        context.onFinishInflate();
        return context;
    }

    public static HistoricalAddressView build(Context context, AttributeSet attributeset)
    {
        context = new HistoricalAddressView_(context, attributeset);
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
            inflate(getContext(), 0x7f0300cc, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mAddressTextView = (TextView)a1.findViewById(0x7f0f044c);
        mServiceMethodIcon = (ImageView)a1.findViewById(0x7f0f044a);
        mServiceMethodLabelView = (TextView)a1.findViewById(0x7f0f044b);
    }
}
