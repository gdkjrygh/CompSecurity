// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            LabsProductView

public final class LabsProductView_ extends LabsProductView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_;

    public LabsProductView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public LabsProductView_(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public LabsProductView_(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public static LabsProductView build(Context context)
    {
        context = new LabsProductView_(context);
        context.onFinishInflate();
        return context;
    }

    public static LabsProductView build(Context context, AttributeSet attributeset)
    {
        context = new LabsProductView_(context, attributeset);
        context.onFinishInflate();
        return context;
    }

    public static LabsProductView build(Context context, AttributeSet attributeset, int i)
    {
        context = new LabsProductView_(context, attributeset, i);
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
            inflate(getContext(), 0x7f030038, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        choiceViewGlass = (LinearLayout)a1.findViewById(0x7f0f0175);
        sectionViewLabel = (TextView)a1.findViewById(0x7f0f0170);
        choiceViewImage = (ImageView)a1.findViewById(0x7f0f0172);
        choiceViewDescription = (TextView)a1.findViewById(0x7f0f0174);
        choiceContainer = (RelativeLayout)a1.findViewById(0x7f0f0171);
        choiceViewLabel = (TextView)a1.findViewById(0x7f0f0173);
        setupFonts();
    }
}
