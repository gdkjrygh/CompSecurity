// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.Button;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            CouponWizardFooterView

public final class CouponWizardFooterView_ extends CouponWizardFooterView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public CouponWizardFooterView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static CouponWizardFooterView build(Context context)
    {
        context = new CouponWizardFooterView_(context);
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
            inflate(getContext(), 0x7f0300c7, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        doneButton = (Button)a1.findViewById(0x7f0f0437);
        addAnotherItem = (Button)a1.findViewById(0x7f0f0438);
        if (doneButton != null)
        {
            doneButton.setOnClickListener(new _cls1());
        }
        if (addAnotherItem != null)
        {
            addAnotherItem.setOnClickListener(new _cls2());
        }
        afterViews();
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CouponWizardFooterView_ this$0;

        public void onClick(View view)
        {
            doneButtonClick();
        }

        _cls1()
        {
            this$0 = CouponWizardFooterView_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final CouponWizardFooterView_ this$0;

        public void onClick(View view)
        {
            AddAnotherButtonClick();
        }

        _cls2()
        {
            this$0 = CouponWizardFooterView_.this;
            super();
        }
    }

}
