// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.landing;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.dominos.MobileSession_;
import com.dominos.controllers.utils.ControllerLocator_;
import com.dominos.news.analytics.PushAnalyticsProcessor_;
import com.dominos.nina.speech.SpeechManager_;
import com.dominos.utils.AnalyticsUtil_;
import com.dominos.views.HomeFragmentFooterView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments.landing:
//            NoCachedAddressFragment

public final class NoCachedAddressFragment_ extends NoCachedAddressFragment
    implements a, b
{

    private View contentView_;
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public NoCachedAddressFragment_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    public static FragmentBuilder_ builder()
    {
        return new FragmentBuilder_();
    }

    private void init_(Bundle bundle)
    {
        c.a(this);
        mSpeechManager = SpeechManager_.getInstance_(getActivity());
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        mExternalTrakingUtil = PushAnalyticsProcessor_.getInstance_(getActivity());
        mMobileSession = MobileSession_.getInstance_(getActivity());
        controllerLocator = ControllerLocator_.getInstance_(getActivity());
        onAfterInject();
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
            contentView_ = layoutinflater.inflate(0x7f030078, viewgroup, false);
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
        signInInfoLayout = (LinearLayout)a1.findViewById(0x7f0f0315);
        mFooter = (HomeFragmentFooterView)a1.findViewById(0x7f0f030e);
        View view = a1.findViewById(0x7f0f030d);
        if (view != null)
        {
            view.setOnClickListener(new _cls1());
        }
        a1 = a1.findViewById(0x7f0f030c);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls2());
        }
        afterViews();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    public final void showUserAccountActivity()
    {
        handler_.post(new _cls3());
    }

    public final void showUserLoginActivity()
    {
        handler_.post(new _cls4());
    }



    private class FragmentBuilder_ extends d
    {

        public NoCachedAddressFragment build()
        {
            NoCachedAddressFragment_ nocachedaddressfragment_ = new NoCachedAddressFragment_();
            nocachedaddressfragment_.setArguments(args);
            return nocachedaddressfragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final NoCachedAddressFragment_ this$0;

        public void onClick(View view)
        {
            onCarryoutButtonClick();
        }

        _cls1()
        {
            this$0 = NoCachedAddressFragment_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final NoCachedAddressFragment_ this$0;

        public void onClick(View view)
        {
            onDeliveryButtonClick();
        }

        _cls2()
        {
            this$0 = NoCachedAddressFragment_.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final NoCachedAddressFragment_ this$0;

        public void run()
        {
            showUserAccountActivity();
        }

        _cls3()
        {
            this$0 = NoCachedAddressFragment_.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final NoCachedAddressFragment_ this$0;

        public void run()
        {
            showUserLoginActivity();
        }

        _cls4()
        {
            this$0 = NoCachedAddressFragment_.this;
            super();
        }
    }

}
