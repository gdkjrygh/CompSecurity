// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Bundle;
import com.facebook.FacebookException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//            GetTokenLoginMethodHandler, LoginClient

class val.request
    implements com.facebook.internal.heCallback
{

    final GetTokenLoginMethodHandler this$0;
    final  val$request;
    final Bundle val$result;

    public void onFailure(FacebookException facebookexception)
    {
        loginClient.complete(rResult(loginClient.getPendingRequest(), "Caught exception", facebookexception.getMessage()));
    }

    public void onSuccess(JSONObject jsonobject)
    {
        try
        {
            jsonobject = jsonobject.getString("id");
            val$result.putString("com.facebook.platform.extra.USER_ID", jsonobject);
            onComplete(val$request, val$result);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            loginClient.complete(rResult(loginClient.getPendingRequest(), "Caught exception", jsonobject.getMessage()));
        }
    }

    CacheCallback()
    {
        this$0 = final_gettokenloginmethodhandler;
        val$result = bundle;
        val$request = val.request.this;
        super();
    }
}
