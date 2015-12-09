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
//            SavedAddressView

public final class SavedAddressView_ extends SavedAddressView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_;

    public SavedAddressView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public SavedAddressView_(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public SavedAddressView_(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public static SavedAddressView build(Context context)
    {
        context = new SavedAddressView_(context);
        context.onFinishInflate();
        return context;
    }

    public static SavedAddressView build(Context context, AttributeSet attributeset)
    {
        context = new SavedAddressView_(context, attributeset);
        context.onFinishInflate();
        return context;
    }

    public static SavedAddressView build(Context context, AttributeSet attributeset, int i)
    {
        context = new SavedAddressView_(context, attributeset, i);
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
            inflate(getContext(), 0x7f0300e0, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mLocationDescription = (TextView)a1.findViewById(0x7f0f04a2);
        mEnumerateView = (TextView)a1.findViewById(0x7f0f04a1);
        mLocationStreetAddress = (TextView)a1.findViewById(0x7f0f04a3);
        mDivider = a1.findViewById(0x7f0f04a4);
        mEnumerateSeparatorView = (ImageView)a1.findViewById(0x7f0f031a);
    }
}
