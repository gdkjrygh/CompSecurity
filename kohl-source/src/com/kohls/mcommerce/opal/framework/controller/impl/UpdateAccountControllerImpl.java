// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.controller.impl;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.Toast;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.po.TokenRegisrationPO;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.ServerLogger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.view.activity.BaseActivityWithoutSlider;
import com.kohls.mcommerce.opal.framework.view.fragment.BaseFragment;
import com.kohls.mcommerce.opal.framework.vo.IValueObject;
import com.kohls.mcommerce.opal.helper.adapter.AdapterHelper;
import com.kohls.mcommerce.opal.helper.adapter.AdapterProcedure;
import com.kohls.mcommerce.opal.helper.adapter.listener.IAdapterListener;
import com.kohls.mcommerce.opal.helper.error.Error;
import java.lang.ref.WeakReference;

// Referenced classes of package com.kohls.mcommerce.opal.framework.controller.impl:
//            BaseControllerImpl

public class UpdateAccountControllerImpl extends BaseControllerImpl
    implements IAdapterListener
{

    private int counter401;
    private BaseFragment fragmnetOnTop;
    private Activity mActivity;
    private Bundle mBundle;
    private String mEmailId;
    private boolean mEmailIdChanged;
    private String mFirstName;
    private WeakReference mFragment;
    private String mLastName;
    private String mPassword;
    private Button mSaveButton;
    private boolean updateProfile;

    public UpdateAccountControllerImpl(BaseActivityWithoutSlider baseactivitywithoutslider)
    {
        mActivity = baseactivitywithoutslider;
    }

    public UpdateAccountControllerImpl(WeakReference weakreference)
    {
        mFragment = weakreference;
    }

    private void dismissDialog()
    {
        ((BaseFragment)mFragment.get()).getActivity().runOnUiThread(new _cls4());
    }

    private void sendRefreshTokenRequest()
    {
        String s = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getRefreshTokenFromPref();
        TokenRegisrationPO tokenregisrationpo = new TokenRegisrationPO();
        tokenregisrationpo.setGrant_type("refresh_token");
        tokenregisrationpo.setRefresh_token(s);
        tokenregisrationpo.setEmail(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        tokenregisrationpo.setFname(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref());
        tokenregisrationpo.setLname(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserLastnameFromPref());
        if (TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletId()))
        {
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().generateWalletId();
        }
        tokenregisrationpo.setWalletId(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletId());
        tokenregisrationpo.setUid(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserID());
        (new AdapterHelper(AdapterProcedure.TOKEN_REGISRATION, tokenregisrationpo, this)).performTask();
    }

    private void showToast(String s)
    {
        if (s != null && UtilityMethods.isFragmentVisible(mFragment))
        {
            ((BaseFragment)mFragment.get()).getActivity().runOnUiThread(new _cls2(s));
        }
    }

    public Error getPayloadError(IValueObject ivalueobject)
    {
        return null;
    }

    public void onFailure(Error error)
    {
        if (UtilityMethods.isFragmentVisible(mFragment))
        {
            ((BaseFragment)mFragment.get()).getActivity().runOnUiThread(new _cls3(error));
        }
        ServerLogger.error(AdapterProcedure.UPDATE_ACCOUNT.getProcedureName(), UtilityMethods.getCustomerOrUpdateProfileLoggerReuest(), error.getMessage());
        Logger.debug(TAG, "Authentication error");
    }

    public void onSuccess(IValueObject ivalueobject)
    {
        if (UtilityMethods.isFragmentVisible(mFragment))
        {
            ((BaseFragment)mFragment.get()).getActivity().runOnUiThread(new _cls1(ivalueobject));
        }
    }

    public void setSaveButton(Button button)
    {
        mSaveButton = button;
    }

    public void setUserInfo(String s, String s1, Bundle bundle)
    {
        mEmailId = s;
        mPassword = s1;
        mBundle = bundle;
    }

    public void showError(String s)
    {
        Toast.makeText(((BaseFragment)mFragment.get()).getActivity(), s, 1).show();
    }





/*
    static String access$1002(UpdateAccountControllerImpl updateaccountcontrollerimpl, String s)
    {
        updateaccountcontrollerimpl.mFirstName = s;
        return s;
    }

*/



/*
    static String access$1102(UpdateAccountControllerImpl updateaccountcontrollerimpl, String s)
    {
        updateaccountcontrollerimpl.mLastName = s;
        return s;
    }

*/



/*
    static int access$1202(UpdateAccountControllerImpl updateaccountcontrollerimpl, int i)
    {
        updateaccountcontrollerimpl.counter401 = i;
        return i;
    }

*/


/*
    static int access$1208(UpdateAccountControllerImpl updateaccountcontrollerimpl)
    {
        int i = updateaccountcontrollerimpl.counter401;
        updateaccountcontrollerimpl.counter401 = i + 1;
        return i;
    }

*/






/*
    static BaseFragment access$302(UpdateAccountControllerImpl updateaccountcontrollerimpl, BaseFragment basefragment)
    {
        updateaccountcontrollerimpl.fragmnetOnTop = basefragment;
        return basefragment;
    }

*/



/*
    static boolean access$402(UpdateAccountControllerImpl updateaccountcontrollerimpl, boolean flag)
    {
        updateaccountcontrollerimpl.mEmailIdChanged = flag;
        return flag;
    }

*/



/*
    static String access$502(UpdateAccountControllerImpl updateaccountcontrollerimpl, String s)
    {
        updateaccountcontrollerimpl.mEmailId = s;
        return s;
    }

*/





/*
    static boolean access$802(UpdateAccountControllerImpl updateaccountcontrollerimpl, boolean flag)
    {
        updateaccountcontrollerimpl.updateProfile = flag;
        return flag;
    }

*/


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}

}
