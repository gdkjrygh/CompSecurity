// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.http.power.PowerRestCallback;
import org.c.c.l;
import org.c.e.a.f;
import org.json.JSONObject;

// Referenced classes of package com.dominos.activities:
//            UserChangePassword

class rRestCallback extends PowerRestCallback
{

    final UserChangePassword this$0;
    final String val$newPW;

    public void onBegin()
    {
        showLoading();
    }

    public void onError(Exception exception, String s)
    {
        hideLoading();
        int i = 0;
        if (exception instanceof f)
        {
            i = ((f)exception).getStatusCode().value();
        }
        if (i == 404)
        {
            showInvalidEmail();
            return;
        } else
        {
            showInvalid();
            return;
        }
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        Object obj;
        hideLoading();
        obj = new JSONObject(s);
        s = ((JSONObject) (obj)).optString("PasswordSalt", null);
        obj = ((JSONObject) (obj)).optString("PasswordHash", null);
        if (obj == null || s == null)
        {
            try
            {
                throw new Exception();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
            showInvalid();
            return;
        }
        UserChangePassword.access$000(UserChangePassword.this).setPasswordHash(((String) (obj)));
        UserChangePassword.access$000(UserChangePassword.this).setPasswordSalt(s);
        mProfileManager.saveNewCurrentUser(UserChangePassword.access$000(UserChangePassword.this));
        UserChangePassword.access$100(UserChangePassword.this, val$newPW);
        return;
    }

    eManager()
    {
        this$0 = final_userchangepassword;
        val$newPW = String.this;
        super();
    }
}
