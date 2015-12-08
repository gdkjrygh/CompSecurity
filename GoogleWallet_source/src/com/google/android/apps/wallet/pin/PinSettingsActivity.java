// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.LinearLayout;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.settings.ui.TextAndButtonListRowDisplay;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.util.view.Views;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            PinTimeoutFragment, ChangeOrSetPinActivity

public class PinSettingsActivity extends WalletActivity
{

    UriRegistry uriRegistry;

    public PinSettingsActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private void addChangePinSection()
    {
        TextAndButtonListRowDisplay textandbuttonlistrowdisplay = new TextAndButtonListRowDisplay(getLayoutInflater());
        textandbuttonlistrowdisplay.setTitle(getString(com.google.android.apps.walletnfcrel.R.string.settings_view_wallet_pin));
        textandbuttonlistrowdisplay.setSubtitle(getString(com.google.android.apps.walletnfcrel.R.string.settings_view_wallet_pin_detail));
        textandbuttonlistrowdisplay.setDividerVisible(true);
        textandbuttonlistrowdisplay.setRowActionListener(new OnActionListener() {

            final PinSettingsActivity this$0;

            private void onAction(Void void1)
            {
                void1 = InternalIntents.forClass(PinSettingsActivity.this, com/google/android/apps/wallet/pin/ChangeOrSetPinActivity);
                startActivity(void1);
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Void)obj);
            }

            
            {
                this$0 = PinSettingsActivity.this;
                super();
            }
        });
        LinearLayout linearlayout = (LinearLayout)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.SettingsSectionContainer);
        textandbuttonlistrowdisplay.setDividerVisible(true);
        linearlayout.addView(textandbuttonlistrowdisplay.getView(), 0);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setContentView(com.google.android.apps.walletnfcrel.R.layout.pin_settings_activity);
        addChangePinSection();
        if (bundle == null)
        {
            getSupportFragmentManager().beginTransaction().replace(com.google.android.apps.walletnfcrel.R.id.PinTimeoutFragmentContainer, new PinTimeoutFragment()).commit();
        }
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(10000, new Object[0]));
    }
}
