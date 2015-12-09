// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.landing;

import android.support.v4.app.Fragment;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.view.View;
import com.dominos.MobileSession;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.fragments.landing:
//            ProfileUserFragment_, EasyOrderFragment, FastPathFragment, NoCachedAddressFragment

public class ProfileUserFragment extends Fragment
    implements FastPathFragment.OnNewOrderSelectedListener, NoCachedAddressFragment.OnServiceMethodListener
{

    AnalyticsUtil mAnalyticsUtil;
    MobileSession mMobileSession;
    private ProfileActionListener mProfileActionListener;
    private UserProfileManager mProfileManager;

    public ProfileUserFragment()
    {
    }

    public static ProfileUserFragment newInstance()
    {
        return new ProfileUserFragment_();
    }

    private void onShowFragments()
    {
        if (mProfileManager.getEasyOrder() != null)
        {
            getChildFragmentManager().a().b(0x7f0f0389, EasyOrderFragment.newInstance()).b();
        }
        if (mProfileManager.isUserWithOrderHistory())
        {
            getChildFragmentManager().a().b(0x7f0f038a, FastPathFragment.newInstance(this)).b();
            return;
        } else
        {
            getView().findViewById(0x7f0f038a).setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
            NoCachedAddressFragment nocachedaddressfragment = NoCachedAddressFragment.newInstance(this);
            getChildFragmentManager().a().b(0x7f0f038a, nocachedaddressfragment).b();
            return;
        }
    }

    protected void onAfterInject()
    {
        mProfileManager = (UserProfileManager)mMobileSession.getManager("user_manager");
    }

    public void onDeliverySelected()
    {
        mProfileActionListener.onDeliveryButtonSelected();
    }

    public void onNewOrder()
    {
        mProfileActionListener.onNewOrder();
    }

    public void onResume()
    {
        super.onResume();
        onShowFragments();
    }

    public void setProfileActionListener(ProfileActionListener profileactionlistener)
    {
        mProfileActionListener = profileactionlistener;
    }

    private class ProfileActionListener
    {

        public abstract void onDeliveryButtonSelected();

        public abstract void onNewOrder();
    }

}
