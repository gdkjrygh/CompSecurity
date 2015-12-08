// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.MobileSession_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            LabsVariantView

public final class LabsVariantView_ extends LabsVariantView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_;

    public LabsVariantView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public LabsVariantView_(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public LabsVariantView_(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public static LabsVariantView build(Context context)
    {
        context = new LabsVariantView_(context);
        context.onFinishInflate();
        return context;
    }

    public static LabsVariantView build(Context context, AttributeSet attributeset)
    {
        context = new LabsVariantView_(context, attributeset);
        context.onFinishInflate();
        return context;
    }

    public static LabsVariantView build(Context context, AttributeSet attributeset, int i)
    {
        context = new LabsVariantView_(context, attributeset, i);
        context.onFinishInflate();
        return context;
    }

    private void init_()
    {
        c c1 = c.a(onViewChangedNotifier_);
        c.a(this);
        mMobileSession = MobileSession_.getInstance_(getContext());
        onAfterInject();
        c.a(c1);
    }

    public final void onFinishInflate()
    {
        if (!alreadyInflated_)
        {
            alreadyInflated_ = true;
            inflate(getContext(), 0x7f0300a3, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        sectionViewLabel = (TextView)a1.findViewById(0x7f0f0170);
        productTypeContainer = (RelativeLayout)a1.findViewById(0x7f0f0383);
        productTypeLabel = (TextView)a1.findViewById(0x7f0f0384);
        setupFonts();
    }
}
