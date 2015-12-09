// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.user;

import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.data.http.power.PowerRestCallback;
import org.c.c.l;
import org.c.e.a.f;

// Referenced classes of package com.dominos.android.sdk.core.user:
//            UserProfileManager

class k extends PowerRestCallback
{

    final UserProfileManager this$0;
    final String val$email;
    final boolean val$fistTime;
    final inCallback val$loginCallback;
    final String val$password;

    public void onError(Exception exception, String s)
    {
        if (exception instanceof f)
        {
            int i = ((f)exception).getStatusCode().value();
            if ((i == 404 || i == 403 || i == 500) && val$loginCallback != null)
            {
                val$loginCallback.onLoginFailed();
            }
        } else
        if (val$loginCallback != null)
        {
            val$loginCallback.onLoginError();
            return;
        }
    }

    public void onFinish()
    {
        super.onFinish();
        if (val$loginCallback != null)
        {
            val$loginCallback.onFinish();
        }
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(final String user)
    {
        user = UserObject.from(user);
        setAuthorizationCode(val$email, val$password);
        saveNewCurrentUser(user);
        if (UserProfileManager.access$200(UserProfileManager.this).isLoyaltyAvailable())
        {
            class _cls1 extends com.dominos.android.sdk.core.loyalty.LoyaltyManager.LoyaltyCallback
            {

                final UserProfileManager._cls14 this$1;
                final UserObject val$user;

                public void onLoyaltyFail()
                {
                    UserProfileManager.access$400(this$0, user, loginCallback);
                }

                public void onLoyaltySuccess()
                {
                    if (fistTime)
                    {
                        UserProfileManager.access$200(this$0).setNewLoyaltyMemberFlags();
                    }
                    UserProfileManager.access$400(this$0, user, loginCallback);
                }

            _cls1()
            {
                this$1 = UserProfileManager._cls14.this;
                user = userobject;
                super();
            }
            }

            UserProfileManager.access$200(UserProfileManager.this).getUserLoyaltyInformation(UserProfileManager.access$300(UserProfileManager.this), new _cls1());
            return;
        } else
        {
            UserProfileManager.access$400(UserProfileManager.this, user, val$loginCallback);
            return;
        }
    }

    inCallback()
    {
        this$0 = final_userprofilemanager;
        val$loginCallback = incallback;
        val$email = s;
        val$password = s1;
        val$fistTime = Z.this;
        super();
    }
}
