// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.shoprunner;

import com.dominos.android.sdk.data.http.power.PowerRestCallback;
import com.dominos.android.sdk.data.http.power.PowerRestCallbackHandler;
import org.c.c.a.r;
import org.c.e.a.l;
import org.json.JSONObject;

// Referenced classes of package com.dominos.android.sdk.data.http.shoprunner:
//            ShopRunnerRestInterface

public class ShopRunnerRestClient
{

    private static final String TAG = "ShopRunnerAPI";
    PowerRestCallbackHandler mCallbackHandler;
    ShopRunnerRestInterface mSrClient;

    public ShopRunnerRestClient()
    {
    }

    public void setRootUrl(String s)
    {
        mSrClient.setRootUrl(s);
    }

    void setupService()
    {
        l l1 = mSrClient.getRestTemplate();
        r r1 = new r();
        r1.setReadTimeout(30000);
        r1.setConnectTimeout(5000);
        l1.setRequestFactory(r1);
    }

    public String validateMemberToken(String s, String s1)
    {
        setRootUrl(s);
        s = new JSONObject(mSrClient.validateMemberToken(s1));
        if (!s.getBoolean("valid"))
        {
            break MISSING_BLOCK_LABEL_42;
        }
        s = s.getString("sr_token");
        return s;
        s;
        return null;
    }

    public void validateToken(String s, PowerRestCallback powerrestcallback)
    {
        mCallbackHandler.onBegin(powerrestcallback);
        s = mSrClient.validateToken(s);
        mCallbackHandler.onSuccess(powerrestcallback, s);
        mCallbackHandler.onFinish(powerrestcallback);
        return;
        s;
        mCallbackHandler.onError(powerrestcallback, s, "validateToken");
        mCallbackHandler.onFinish(powerrestcallback);
        return;
        s;
        mCallbackHandler.onFinish(powerrestcallback);
        throw s;
    }
}
