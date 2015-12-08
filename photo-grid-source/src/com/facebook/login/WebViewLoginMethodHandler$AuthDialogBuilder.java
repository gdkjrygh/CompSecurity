// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.WebDialog;

class  extends com.facebook.internal.
{

    private static final String OAUTH_DIALOG = "oauth";
    static final String REDIRECT_URI = "fbconnect://success";
    private String e2e;
    private boolean isRerequest;

    public WebDialog build()
    {
        Bundle bundle = getParameters();
        bundle.putString("redirect_uri", "fbconnect://success");
        bundle.putString("client_id", getApplicationId());
        bundle.putString("e2e", e2e);
        bundle.putString("response_type", "token,signed_request");
        bundle.putString("return_scopes", "true");
        if (isRerequest)
        {
            bundle.putString("auth_type", "rerequest");
        }
        return new WebDialog(getContext(), "oauth", bundle, getTheme(), getListener());
    }

    public getListener setE2E(String s)
    {
        e2e = s;
        return this;
    }

    public e2e setIsRerequest(boolean flag)
    {
        isRerequest = flag;
        return this;
    }

    public (Context context, String s, Bundle bundle)
    {
        super(context, s, "oauth", bundle);
    }
}
