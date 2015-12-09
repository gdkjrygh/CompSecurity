// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.util.date.DateAndTimeHelper;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.base.Preconditions;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

public class RecurringTopupDetailsFragment extends WalletFragment
{

    private TextView accessibilityText;
    private View collapseView;
    DateAndTimeHelper dateAndTimeHelper;
    private TextView detailsText;
    private com.google.wallet.proto.api.NanoWalletScheduleTopups.DisplayableSchedule displayableSchedule;
    private View expandView;
    private boolean isNew;
    private ScrollView scrollView;

    public RecurringTopupDetailsFragment()
    {
    }

    public static RecurringTopupDetailsFragment createFragment(com.google.wallet.proto.api.NanoWalletScheduleTopups.DisplayableSchedule displayableschedule, boolean flag)
    {
        Preconditions.checkNotNull(displayableschedule);
        RecurringTopupDetailsFragment recurringtopupdetailsfragment = new RecurringTopupDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putByteArray("DISPLAYABLE_SCHEDULE", MessageNano.toByteArray(displayableschedule));
        bundle.putBoolean("IS_NEW", flag);
        recurringtopupdetailsfragment.setArguments(bundle);
        return recurringtopupdetailsfragment;
    }

    private void revealFullDetails()
    {
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final RecurringTopupDetailsFragment this$0;

            public final void onGlobalLayout()
            {
                scrollView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                scrollView.smoothScrollTo(0, scrollView.getMeasuredHeight());
            }

            
            {
                this$0 = RecurringTopupDetailsFragment.this;
                super();
            }
        });
    }

    private void setNextTopupExpanded(boolean flag)
    {
        boolean flag1 = false;
        Object obj = detailsText;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((TextView) (obj)).setVisibility(i);
        obj = expandView;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
        obj = collapseView;
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        if (flag)
        {
            revealFullDetails();
        }
        if (flag)
        {
            i = com.google.android.apps.walletnfcrel.R.string.tap_to_hide;
        } else
        {
            i = com.google.android.apps.walletnfcrel.R.string.tap_to_expand;
        }
        accessibilityText.setContentDescription(getResources().getString(i));
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        activity = getArguments();
        displayableSchedule = new com.google.wallet.proto.api.NanoWalletScheduleTopups.DisplayableSchedule();
        isNew = activity.getBoolean("IS_NEW");
        try
        {
            MessageNano.mergeFrom(displayableSchedule, activity.getByteArray("DISPLAYABLE_SCHEDULE"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new RuntimeException("Failed parsing ReviewRecurringTopupActivity extras", activity);
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        boolean flag = true;
        int i = 0;
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.recurring_topup_details, viewgroup, false);
        viewgroup = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.AmountFrequency);
        bundle = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.OnDay);
        viewgroup.setText(displayableSchedule.recurrenceMessageAmount);
        bundle.setText(displayableSchedule.recurrenceMessageDay);
        bundle = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.Source);
        TextView textview = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.TransferDate);
        viewgroup = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.TransferAvailability);
        bundle.setText(getString(com.google.android.apps.walletnfcrel.R.string.recurring_transfer_account, new Object[] {
            displayableSchedule.fundingSource.nickname
        }));
        textview.setText(displayableSchedule.nextTopup.startMessage);
        bundle = displayableSchedule.nextTopup.availabilityMessage;
        if (bundle == null || bundle.length() <= 0)
        {
            flag = false;
        }
        if (!flag)
        {
            i = 8;
        }
        viewgroup.setVisibility(i);
        if (flag)
        {
            viewgroup.setText(bundle);
        }
        scrollView = (ScrollView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.Scroll);
        detailsText = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.Details);
        detailsText.setText(displayableSchedule.nextTopup.detailsMessage);
        expandView = Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.Expand);
        collapseView = Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.Collapse);
        accessibilityText = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.AccessibilityText);
        setNextTopupExpanded(isNew);
        Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.NextTopup).setOnClickListener(new android.view.View.OnClickListener() {

            final RecurringTopupDetailsFragment this$0;

            public final void onClick(View view)
            {
                view = RecurringTopupDetailsFragment.this;
                boolean flag1;
                if (detailsText.getVisibility() != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                view.setNextTopupExpanded(flag1);
            }

            
            {
                this$0 = RecurringTopupDetailsFragment.this;
                super();
            }
        });
        return layoutinflater;
    }



}
