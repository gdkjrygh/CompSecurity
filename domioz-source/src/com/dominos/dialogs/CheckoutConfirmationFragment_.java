// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.dialogs:
//            CheckoutConfirmationFragment

public final class CheckoutConfirmationFragment_ extends CheckoutConfirmationFragment
    implements a, b
{

    public static final String UPSELL_PRODUCT_NAME_ARG = "upsellProductName";
    private View contentView_;
    private final c onViewChangedNotifier_ = new c();

    public CheckoutConfirmationFragment_()
    {
    }

    public static FragmentBuilder_ builder()
    {
        return new FragmentBuilder_();
    }

    private void init_(Bundle bundle)
    {
        c.a(this);
        injectFragmentArguments_();
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        mMobileSession = MobileSession_.getInstance_(getActivity());
        onAfterInject();
    }

    private void injectFragmentArguments_()
    {
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey("upsellProductName"))
        {
            upsellProductName = bundle.getString("upsellProductName");
        }
    }

    public final View findViewById(int i)
    {
        if (contentView_ == null)
        {
            return null;
        } else
        {
            return contentView_.findViewById(i);
        }
    }

    public final void onCreate(Bundle bundle)
    {
        c c1 = c.a(onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.a(c1);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        contentView_ = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (contentView_ == null)
        {
            contentView_ = layoutinflater.inflate(0x7f030061, viewgroup, false);
        }
        return contentView_;
    }

    public final void onDestroyView()
    {
        contentView_ = null;
        super.onDestroyView();
    }

    public final void onViewChanged(a a1)
    {
        checkoutTotal = (TextView)a1.findViewById(0x7f0f0283);
        addedToCart = (TextView)a1.findViewById(0x7f0f0282);
        addressHolder = (TextView)a1.findViewById(0x7f0f0284);
        View view = a1.findViewById(0x7f0f0285);
        if (view != null)
        {
            view.setOnClickListener(new _cls1());
        }
        a1 = a1.findViewById(0x7f0f0286);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls2());
        }
        onAfterViews();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    private class FragmentBuilder_ extends d
    {

        public CheckoutConfirmationFragment build()
        {
            CheckoutConfirmationFragment_ checkoutconfirmationfragment_ = new CheckoutConfirmationFragment_();
            checkoutconfirmationfragment_.setArguments(args);
            return checkoutconfirmationfragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_ upsellProductName(String s)
        {
            args.putString("upsellProductName", s);
            return this;
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CheckoutConfirmationFragment_ this$0;

        public void onClick(View view)
        {
            confirmationCheckoutClick();
        }

        _cls1()
        {
            this$0 = CheckoutConfirmationFragment_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final CheckoutConfirmationFragment_ this$0;

        public void onClick(View view)
        {
            confirmationCancelClick();
        }

        _cls2()
        {
            this$0 = CheckoutConfirmationFragment_.this;
            super();
        }
    }

}
