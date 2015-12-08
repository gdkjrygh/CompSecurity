// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.recurringtopup.RecurringTopupErrorActivity;
import com.google.android.apps.wallet.recurringtopup.RecurringTopupEvent;
import com.google.android.apps.wallet.recurringtopup.ViewRecurringTopupActivity;
import com.google.android.apps.wallet.util.view.Views;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            TileFragment

public class WalletBalanceRecurringTopupFragment extends TileFragment
{

    EventBus eventBus;
    private ImageView icon;
    private TextView line1Text;
    private TextView line2Text;
    private com.google.wallet.proto.api.NanoWalletScheduleTopups.DisplayableSchedule schedule;

    public WalletBalanceRecurringTopupFragment()
    {
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.wallet_balance_recurring_topup_fragment, viewgroup, false);
        icon = (ImageView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.Icon);
        line1Text = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.Line1);
        line2Text = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.Line2);
        Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.Tile).setOnClickListener(new android.view.View.OnClickListener() {

            final WalletBalanceRecurringTopupFragment this$0;

            public final void onClick(View view)
            {
                WalletBalanceRecurringTopupFragment walletbalancerecurringtopupfragment = WalletBalanceRecurringTopupFragment.this;
                android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
                if (schedule.errorState != null)
                {
                    view = com/google/android/apps/wallet/recurringtopup/RecurringTopupErrorActivity;
                } else
                {
                    view = com/google/android/apps/wallet/recurringtopup/ViewRecurringTopupActivity;
                }
                walletbalancerecurringtopupfragment.startActivity(InternalIntents.forClass(fragmentactivity, view));
            }

            
            {
                this$0 = WalletBalanceRecurringTopupFragment.this;
                super();
            }
        });
        return layoutinflater;
    }

    public void onNewRecurringTopupEvent(RecurringTopupEvent recurringtopupevent)
    {
        if (recurringtopupevent.isFeatureEnabled())
        {
            recurringtopupevent = recurringtopupevent.getTopupSchedule();
        } else
        {
            recurringtopupevent = null;
        }
        schedule = recurringtopupevent;
        if (schedule != null)
        {
            recurringtopupevent = schedule.nextTopup.availabilityMessage;
            if (schedule.errorState != null)
            {
                getView().setBackgroundColor(getResources().getColor(com.google.android.apps.walletnfcrel.R.color.butter));
                icon.setImageDrawable(getResources().getDrawable(com.google.android.apps.walletnfcrel.R.drawable.ic_rt_error));
                line1Text.setText(getString(com.google.android.apps.walletnfcrel.R.string.recurring_topup_failed, new Object[] {
                    schedule.errorState.timestamp.date
                }));
                line2Text.setVisibility(8);
            } else
            if (schedule.nextTopup.availabilityMessage != null)
            {
                getView().setBackgroundColor(getResources().getColor(com.google.android.apps.walletnfcrel.R.color.butter));
                icon.setImageDrawable(getResources().getDrawable(com.google.android.apps.walletnfcrel.R.drawable.ic_rt));
                line1Text.setText(schedule.nextTopup.startMessage);
                line2Text.setVisibility(0);
                line2Text.setText(recurringtopupevent);
            } else
            {
                getView().setBackgroundColor(0);
                icon.setImageDrawable(getResources().getDrawable(com.google.android.apps.walletnfcrel.R.drawable.ic_rt));
                line1Text.setText(schedule.nextTopup.startMessage);
                line2Text.setVisibility(8);
            }
        }
        notifyTileChanged();
    }

    public final void onPause()
    {
        super.onPause();
        eventBus.unregisterAll(this);
    }

    public final void onResume()
    {
        super.onResume();
        schedule = null;
        notifyTileChanged();
        eventBus.register(this);
    }

    public final boolean shouldShow()
    {
        return schedule != null;
    }

}
