// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.user;

import android.content.Context;
import com.dominos.android.sdk.common.OrderUtil_;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import org.androidannotations.api.a;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.android.sdk.core.user:
//            UserProfileManager, UserAPI_, UserService_

public final class UserProfileManager_ extends UserProfileManager
{

    private static UserProfileManager_ instance_;
    private Context context_;

    private UserProfileManager_(Context context)
    {
        context_ = context;
    }

    public static UserProfileManager_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new UserProfileManager_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        prefs = new DominosPrefs_(context_);
        mPowerService = PowerRestClient_.getInstance_(context_);
        mUserApi = UserAPI_.getInstance_(context_);
        mUserAuth = UserAuthorization_.getInstance_(context_);
        mUserService = UserService_.getInstance_(context_);
        mOrderUtil = OrderUtil_.getInstance_(context_);
    }

    public final void addAddress(LabsAddress labsaddress, boolean flag, UserProfileManager.SaveAddressCallback saveaddresscallback)
    {
        a.a(new _cls1(labsaddress, flag, saveaddresscallback));
    }

    public final void modifyAddress(int i, LabsAddress labsaddress, boolean flag, UserProfileManager.SaveAddressCallback saveaddresscallback)
    {
        a.a(new _cls2(labsaddress, flag, saveaddresscallback));
    }



    private class _cls1 extends org.androidannotations.api.c
    {

        final UserProfileManager_ this$0;
        final LabsAddress val$address;
        final UserProfileManager.SaveAddressCallback val$callback;
        final boolean val$setDefault;

        public void execute()
        {
            try
            {
                addAddress(address, setDefault, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(LabsAddress labsaddress, boolean flag, UserProfileManager.SaveAddressCallback saveaddresscallback)
        {
            this$0 = UserProfileManager_.this;
            address = labsaddress;
            setDefault = flag;
            callback = saveaddresscallback;
            super(final_s, final_i, final_s1);
        }
    }


    private class _cls2 extends org.androidannotations.api.c
    {

        final UserProfileManager_ this$0;
        final LabsAddress val$address;
        final int val$addressIndex;
        final UserProfileManager.SaveAddressCallback val$callback;
        final boolean val$setDefault;

        public void execute()
        {
            try
            {
                modifyAddress(addressIndex, address, setDefault, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls2(LabsAddress labsaddress, boolean flag, 
                UserProfileManager.SaveAddressCallback saveaddresscallback)
        {
            this$0 = UserProfileManager_.this;
            addressIndex = j;
            address = labsaddress;
            setDefault = flag;
            callback = saveaddresscallback;
            super(final_s, final_i, final_s1);
        }
    }

}
