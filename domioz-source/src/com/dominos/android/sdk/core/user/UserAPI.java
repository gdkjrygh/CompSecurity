// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.user;

import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.data.http.power.PowerRestClient;

public class UserAPI
{

    PowerRestClient mPowerClient;

    public UserAPI()
    {
    }

    public UserObject saveCustomer(UserObject userobject)
    {
        return mPowerClient.saveCustomer(userobject);
    }
}
