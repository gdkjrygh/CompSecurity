// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.MobileSession_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            LoyaltyProfileView

public final class LoyaltyProfileView_ extends LoyaltyProfileView
    implements a, b
{

    private boolean alreadyInflated_;
    private Handler handler_;
    private final c onViewChangedNotifier_;

    public LoyaltyProfileView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        handler_ = new Handler(Looper.getMainLooper());
        init_();
    }

    public LoyaltyProfileView_(Context context, LoyaltyProfileView.LoyaltyProfileViewListener loyaltyprofileviewlistener)
    {
        super(context, loyaltyprofileviewlistener);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        handler_ = new Handler(Looper.getMainLooper());
        init_();
    }

    public static LoyaltyProfileView build(Context context)
    {
        context = new LoyaltyProfileView_(context);
        context.onFinishInflate();
        return context;
    }

    public static LoyaltyProfileView build(Context context, LoyaltyProfileView.LoyaltyProfileViewListener loyaltyprofileviewlistener)
    {
        context = new LoyaltyProfileView_(context, loyaltyprofileviewlistener);
        context.onFinishInflate();
        return context;
    }

    private void init_()
    {
        c c1 = c.a(onViewChangedNotifier_);
        c.a(this);
        mMobileSession = MobileSession_.getInstance_(getContext());
        afterInject();
        c.a(c1);
    }

    public final void onFinishInflate()
    {
        if (!alreadyInflated_)
        {
            alreadyInflated_ = true;
            inflate(getContext(), 0x7f0300d8, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mLoyaltyEnrollLayout = (LinearLayout)a1.findViewById(0x7f0f048a);
        mLoyaltyInstructionLabel = (TextView)a1.findViewById(0x7f0f048b);
        mLoyaltyUnavailableLayout = (LinearLayout)a1.findViewById(0x7f0f0489);
        mNowAMemberLayout = (LinearLayout)a1.findViewById(0x7f0f0488);
        mLoyaltyEnrollActivateLayout = (LinearLayout)a1.findViewById(0x7f0f048d);
        mLoyaltyLayout = (RelativeLayout)a1.findViewById(0x7f0f0486);
        View view = a1.findViewById(0x7f0f048e);
        if (view != null)
        {
            view.setOnClickListener(new _cls1());
        }
        a1 = a1.findViewById(0x7f0f048c);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls2());
        }
        onAfterViews();
    }

    public final void updateView()
    {
        handler_.post(new _cls3());
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LoyaltyProfileView_ this$0;

        public void onClick(View view)
        {
            onLoyaltyActivateClicked();
        }

        _cls1()
        {
            this$0 = LoyaltyProfileView_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final LoyaltyProfileView_ this$0;

        public void onClick(View view)
        {
            onLoyaltyLearnMoreClicked();
        }

        _cls2()
        {
            this$0 = LoyaltyProfileView_.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final LoyaltyProfileView_ this$0;

        public void run()
        {
            updateView();
        }

        _cls3()
        {
            this$0 = LoyaltyProfileView_.this;
            super();
        }
    }

}
