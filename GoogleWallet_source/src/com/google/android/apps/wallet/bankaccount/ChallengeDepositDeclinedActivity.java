// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.apps.wallet.base.activity.WalletActivity;

public class ChallengeDepositDeclinedActivity extends WalletActivity
{

    public ChallengeDepositDeclinedActivity()
    {
        this(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public ChallengeDepositDeclinedActivity(int i)
    {
        super(i);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setTitle(com.google.android.apps.walletnfcrel.R.string.challenge_deposit_title);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.challenge_deposit_declined);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(com.google.android.apps.walletnfcrel.R.menu.action_bar_button, menu);
        menu.findItem(com.google.android.apps.walletnfcrel.R.id.ActionBarButton).setTitle(com.google.android.apps.walletnfcrel.R.string.button_okay);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.google.android.apps.walletnfcrel.R.id.ActionBarButton)
        {
            finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected final void onUpPressed()
    {
        finish();
    }
}
