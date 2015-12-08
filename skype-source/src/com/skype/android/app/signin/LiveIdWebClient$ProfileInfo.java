// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.app.signin:
//            LiveIdWebClient

public static class lastName
{

    private String cid;
    private String email;
    private String firstName;
    private String lastName;
    private String signinName;

    public String getCid()
    {
        return cid;
    }

    public String getEmail()
    {
        return email;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getSigninName()
    {
        return signinName;
    }

    public String getVisibleContactInfo()
    {
        if (!TextUtils.isEmpty(getSigninName()))
        {
            return getSigninName();
        } else
        {
            return getEmail();
        }
    }

    (JSONObject jsonobject)
    {
        try
        {
            cid = jsonobject.getString("cid");
            email = jsonobject.optString("email");
            signinName = jsonobject.optString("signinName");
            firstName = jsonobject.optString("firstName");
            lastName = jsonobject.optString("lastName");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new RuntimeException(jsonobject);
        }
    }
}
