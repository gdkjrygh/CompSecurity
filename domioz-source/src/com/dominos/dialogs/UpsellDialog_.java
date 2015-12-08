// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.nina.speech.SpeechManager_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.dialogs:
//            UpsellDialog

public final class UpsellDialog_ extends UpsellDialog
    implements a, b
{

    public static final String M_UPSELL_CODE_ARG = "mUpsellCode";
    private View contentView_;
    private final c onViewChangedNotifier_ = new c();

    public UpsellDialog_()
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
        mSpeechManager = SpeechManager_.getInstance_(getActivity());
        mMobileSession = MobileSession_.getInstance_(getActivity());
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        onAfterInject();
    }

    private void injectFragmentArguments_()
    {
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey("mUpsellCode"))
        {
            mUpsellCode = bundle.getString("mUpsellCode");
        }
    }

    public final void answerUpsell(com.dominos.bus.events.OriginatedFromSpeech.UpsellAnswered upsellanswered)
    {
        answerUpsell(upsellanswered);
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
            contentView_ = layoutinflater.inflate(0x7f030062, viewgroup, false);
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
        mProductDescription = (TextView)a1.findViewById(0x7f0f028a);
        mOrderButton = (Button)a1.findViewById(0x7f0f0295);
        mStjudeSavings = (TextView)a1.findViewById(0x7f0f028d);
        mStjudesLayout = (LinearLayout)a1.findViewById(0x7f0f028b);
        mProductDescriptionLayout = (LinearLayout)a1.findViewById(0x7f0f0288);
        mProductImage = (ImageView)a1.findViewById(0x7f0f0287);
        mTitleText = (TextView)a1.findViewById(0x7f0f0100);
        mGroupRadioButton = (RadioGroup)a1.findViewById(0x7f0f028e);
        a1 = a1.findViewById(0x7f0f0294);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls1());
        }
        if (mOrderButton != null)
        {
            mOrderButton.setOnClickListener(new _cls2());
        }
        afterViews();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }


    private class FragmentBuilder_ extends d
    {

        public UpsellDialog build()
        {
            UpsellDialog_ upselldialog_ = new UpsellDialog_();
            upselldialog_.setArguments(args);
            return upselldialog_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_ mUpsellCode(String s)
        {
            args.putString("mUpsellCode", s);
            return this;
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final UpsellDialog_ this$0;

        public void onClick(View view)
        {
            upsellGoToCheckoutClick();
        }

        _cls1()
        {
            this$0 = UpsellDialog_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final UpsellDialog_ this$0;

        public void onClick(View view)
        {
            upsellAddToOrderClick();
        }

        _cls2()
        {
            this$0 = UpsellDialog_.this;
            super();
        }
    }

}
