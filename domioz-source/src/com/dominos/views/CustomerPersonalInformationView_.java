// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            CustomerPersonalInformationView

public final class CustomerPersonalInformationView_ extends CustomerPersonalInformationView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_;

    public CustomerPersonalInformationView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public CustomerPersonalInformationView_(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public static CustomerPersonalInformationView build(Context context)
    {
        context = new CustomerPersonalInformationView_(context);
        context.onFinishInflate();
        return context;
    }

    public static CustomerPersonalInformationView build(Context context, AttributeSet attributeset)
    {
        context = new CustomerPersonalInformationView_(context, attributeset);
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
            inflate(getContext(), 0x7f0300c9, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mPersonalInfoNameView = (TextView)a1.findViewById(0x7f0f043c);
        mPersonalInfoPhoneView = (TextView)a1.findViewById(0x7f0f043e);
        mCustomerPersonalInfoContainerLayout = (RelativeLayout)a1.findViewById(0x7f0f043f);
        mPersonalInfoEmailView = (TextView)a1.findViewById(0x7f0f043d);
        a1 = a1.findViewById(0x7f0f043b);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls1());
        }
        if (mCustomerPersonalInfoContainerLayout != null)
        {
            mCustomerPersonalInfoContainerLayout.setOnClickListener(new _cls2());
        }
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CustomerPersonalInformationView_ this$0;

        public void onClick(View view)
        {
            onPersonalInformationLayoutClick();
        }

        _cls1()
        {
            this$0 = CustomerPersonalInformationView_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final CustomerPersonalInformationView_ this$0;

        public void onClick(View view)
        {
            onPersonalInfoFooterClick();
        }

        _cls2()
        {
            this$0 = CustomerPersonalInformationView_.this;
            super();
        }
    }

}
