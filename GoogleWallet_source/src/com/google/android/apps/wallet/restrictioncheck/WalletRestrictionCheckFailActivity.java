// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.restrictioncheck;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.QuitIntent;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.filter.ActivityFilters;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.view.Views;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.restrictioncheck:
//            MarketIntentFactory

public class WalletRestrictionCheckFailActivity extends WalletActivity
{

    MarketIntentFactory marketIntentFactory;

    public WalletRestrictionCheckFailActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public static Intent createIntentForMustUpgradeWallet(Context context)
    {
        context = InternalIntents.forClass(context, com/google/android/apps/wallet/restrictioncheck/WalletRestrictionCheckFailActivity);
        context.putExtra("mode", 3);
        context.addFlags(0x10000);
        context.addFlags(0x10000000);
        return context;
    }

    private void intentToMarket()
    {
        Intent intent = marketIntentFactory.create();
        if (getPackageManager().queryIntentActivities(intent, 0x10000).isEmpty())
        {
            AlertDialogFragment.newBuilder().setTitle(getString(com.google.android.apps.walletnfcrel.R.string.play_store_not_found_title)).setMessage(getString(com.google.android.apps.walletnfcrel.R.string.play_store_not_found_text)).setCancelable(false).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_exit).build().show(getSupportFragmentManager(), "play_store_not_found");
            return;
        } else
        {
            startActivity(intent);
            finish();
            return;
        }
    }

    private void showCountryNotSupportedDialog()
    {
        AlertDialogFragment.newBuilder().setTitle(getString(com.google.android.apps.walletnfcrel.R.string.error_dialog_country_unsupported_title)).setMessage(getString(com.google.android.apps.walletnfcrel.R.string.error_dialog_country_unsupported_detail, new Object[] {
            getString(com.google.android.apps.walletnfcrel.R.string.url_country_not_supported)
        })).setCancelable(false).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_ok).build().show(getSupportFragmentManager(), "country_not_supported_tag");
    }

    private void showNavDrawer()
    {
        ((DrawerLayout)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.RootDrawerLayout)).openDrawer(3);
    }

    private void showWalletTooOldDialog()
    {
        AlertDialogFragment.newBuilder().setTitle(getString(com.google.android.apps.walletnfcrel.R.string.upgrade_title)).setMessage(getString(com.google.android.apps.walletnfcrel.R.string.upgrade_fail_text)).setCancelable(false).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_update_wallet).build().show(getSupportFragmentManager(), "old_dialog");
    }

    private void showWarnDialog()
    {
        AlertDialogFragment.newBuilder().setTitle(getString(com.google.android.apps.walletnfcrel.R.string.upgrade_title)).setMessage(getString(com.google.android.apps.walletnfcrel.R.string.upgrade_warn_text)).setCancelable(false).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_update_wallet).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_not_now).build().show(getSupportFragmentManager(), "warn_dialog");
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setContentView(com.google.android.apps.walletnfcrel.R.layout.wallet_restriction_check_fail_activity);
        switch (getIntent().getIntExtra("mode", -1))
        {
        case 1: // '\001'
        case 4: // '\004'
        default:
            showWalletTooOldDialog();
            // fall through

        case 5: // '\005'
            return;

        case 0: // '\0'
            showCountryNotSupportedDialog();
            return;

        case 2: // '\002'
            showWarnDialog();
            return;

        case 3: // '\003'
            showWalletTooOldDialog();
            break;
        }
    }

    protected final void doOnResume()
    {
        if (getIntent().getIntExtra("mode", 0) == 5)
        {
            showNavDrawer();
        }
    }

    protected final boolean isWidthLimited()
    {
        return true;
    }

    public final void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if ("warn_dialog".equals(fragment.getTag()))
        {
            ((AlertDialogFragment)fragment).setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                final WalletRestrictionCheckFailActivity this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    switch (i)
                    {
                    default:
                        return;

                    case -1: 
                        startActivity(ActivityFilters.getRedirectIntent(getIntent()));
                        finish();
                        return;

                    case -2: 
                        intentToMarket();
                        return;
                    }
                }

            
            {
                this$0 = WalletRestrictionCheckFailActivity.this;
                super();
            }
            });
        } else
        {
            if ("old_dialog".equals(fragment.getTag()))
            {
                ((AlertDialogFragment)fragment).setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                    final WalletRestrictionCheckFailActivity this$0;

                    public final void onClick(DialogInterface dialoginterface, int i)
                    {
                        intentToMarket();
                    }

            
            {
                this$0 = WalletRestrictionCheckFailActivity.this;
                super();
            }
                });
                return;
            }
            if ("play_store_not_found".equals(fragment.getTag()))
            {
                ((AlertDialogFragment)fragment).setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                    final WalletRestrictionCheckFailActivity this$0;

                    public final void onClick(DialogInterface dialoginterface, int i)
                    {
                        startActivity(QuitIntent.create());
                        finish();
                    }

            
            {
                this$0 = WalletRestrictionCheckFailActivity.this;
                super();
            }
                });
                return;
            }
            if ("country_not_supported_tag".equals(fragment.getTag()))
            {
                ((AlertDialogFragment)fragment).setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                    final WalletRestrictionCheckFailActivity this$0;

                    public final void onClick(DialogInterface dialoginterface, int i)
                    {
                        showNavDrawer();
                    }

            
            {
                this$0 = WalletRestrictionCheckFailActivity.this;
                super();
            }
                });
                return;
            }
        }
    }

    protected final void onUpPressed()
    {
        onBackPressed();
    }


}
