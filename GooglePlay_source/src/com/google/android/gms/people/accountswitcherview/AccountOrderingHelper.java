// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;

public final class AccountOrderingHelper
{

    AccountManager mAccountManager;
    Account mAccountOrder[];
    Context mContext;
    ArrayList mOwners;
    HashMap mOwnersMap;

    public AccountOrderingHelper(Context context)
    {
        mContext = context;
        mOwnersMap = new HashMap();
        mOwners = new ArrayList();
    }

    public final void detach()
    {
        mOwnersMap.clear();
        mOwners.clear();
    }
}
