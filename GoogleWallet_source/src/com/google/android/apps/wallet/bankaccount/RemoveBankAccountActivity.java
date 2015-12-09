// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import android.support.v4.app.Fragment;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            RemoveBankAccountHelper

public abstract class RemoveBankAccountActivity extends WalletActivity
{

    RemoveBankAccountHelper removeBankAccountHelper;

    public RemoveBankAccountActivity()
    {
        this(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    protected RemoveBankAccountActivity(int i)
    {
        super(i);
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if (super.onActionFailure(s, callable, exception))
        {
            return true;
        }
        if ("remove_bank_account".equals(s))
        {
            return removeBankAccountHelper.onRemoveAccountFailure(this, exception);
        } else
        {
            return false;
        }
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        super.onActionSuccess(s, callable, obj);
        if ("remove_bank_account".equals(s))
        {
            removeBankAccountHelper.onRemoveAccountSuccess(this, obj);
        }
    }

    public final void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if ("CONFIRM_REMOVE_DIALOG".equals(fragment.getTag()))
        {
            fragment = (AlertDialogFragment)fragment;
            removeBankAccountHelper.setConfirmRemoveDialogOnClickListener(fragment, this);
        }
    }

    protected void onUpPressed()
    {
    }
}
