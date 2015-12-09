// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.MobileSession_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            CheckoutButtonSectionView

public final class CheckoutButtonSectionView_ extends CheckoutButtonSectionView
    implements a, b
{

    private boolean alreadyInflated_;
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public CheckoutButtonSectionView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        handler_ = new Handler(Looper.getMainLooper());
        init_();
    }

    public static CheckoutButtonSectionView build(Context context)
    {
        context = new CheckoutButtonSectionView_(context);
        context.onFinishInflate();
        return context;
    }

    private void init_()
    {
        c c1 = c.a(onViewChangedNotifier_);
        c.a(this);
        mMobileSession = MobileSession_.getInstance_(getContext());
        c.a(c1);
    }

    public final void onFinishInflate()
    {
        if (!alreadyInflated_)
        {
            alreadyInflated_ = true;
            inflate(getContext(), 0x7f0300c5, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        orDivider = (LinearLayout)a1.findViewById(0x7f0f0435);
        checkoutButton = (ImageButton)a1.findViewById(0x7f0f0434);
        googleWalletButton = (ImageButton)a1.findViewById(0x7f0f0127);
        or = (TextView)a1.findViewById(0x7f0f02e5);
        if (checkoutButton != null)
        {
            checkoutButton.setOnClickListener(new _cls1());
        }
        if (googleWalletButton != null)
        {
            googleWalletButton.setOnClickListener(new _cls2());
        }
        afterViews();
    }

    public final void setButtonsEnabled(final boolean enabled, final boolean priceNotZero)
    {
        handler_.post(new _cls3());
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CheckoutButtonSectionView_ this$0;

        public void onClick(View view)
        {
            checkoutClick();
        }

        _cls1()
        {
            this$0 = CheckoutButtonSectionView_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final CheckoutButtonSectionView_ this$0;

        public void onClick(View view)
        {
            walletClick();
        }

        _cls2()
        {
            this$0 = CheckoutButtonSectionView_.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final CheckoutButtonSectionView_ this$0;
        final boolean val$enabled;
        final boolean val$priceNotZero;

        public void run()
        {
            setButtonsEnabled(enabled, priceNotZero);
        }

        _cls3()
        {
            this$0 = CheckoutButtonSectionView_.this;
            enabled = flag;
            priceNotZero = flag1;
            super();
        }
    }

}
