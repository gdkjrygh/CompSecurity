// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.google.android.gms.people.model.Owner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class AccountOrderingHelper
{

    private AccountManager mAccountManager;
    private Account mAccountOrder[];
    private Context mContext;
    private ArrayList mOwners;
    private HashMap mOwnersMap;

    public AccountOrderingHelper(Context context)
    {
        mContext = context;
        mOwnersMap = new HashMap();
        mOwners = new ArrayList();
    }

    private void attach()
    {
        if (mAccountManager == null)
        {
            mAccountManager = AccountManager.get(mContext);
        }
        mAccountOrder = mAccountManager.getAccountsByType("com.google");
    }

    private void populateAccountsMap(Iterable iterable)
    {
        mOwnersMap.clear();
        if (iterable != null)
        {
            Owner owner;
            for (iterable = iterable.iterator(); iterable.hasNext(); mOwnersMap.put(owner.getAccountName(), owner))
            {
                owner = (Owner)iterable.next();
            }

        }
    }

    final void detach()
    {
        mOwnersMap.clear();
        mOwners.clear();
    }

    public final ArrayList orderAccounts(List list)
    {
        if (list != null && !list.isEmpty()) goto _L2; else goto _L1
_L1:
        detach();
_L4:
        return mOwners;
_L2:
        attach();
        populateAccountsMap(list);
        if (!mOwnersMap.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        detach();
        if (true) goto _L4; else goto _L3
_L3:
        mOwners.clear();
        list = mAccountOrder;
        int j = list.length;
        int i = 0;
        while (i < j) 
        {
            Owner owner = list[i];
            owner = (Owner)mOwnersMap.get(((Account) (owner)).name);
            if (owner != null)
            {
                mOwners.add(owner);
            }
            i++;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }
}
