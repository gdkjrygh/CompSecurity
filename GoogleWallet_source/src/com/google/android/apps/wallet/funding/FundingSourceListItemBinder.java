// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.wallet.base.view.ViewHolder;
import com.google.android.apps.wallet.funding.api.FundingSource;
import com.google.android.apps.wallet.paymentcard.widgets.FundingSourceView;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.list.ListItemBinder;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.funding:
//            FundingSourceListItem

public class FundingSourceListItemBinder
    implements ListItemBinder
{
    public static interface FundingSourceListItemListener
    {

        public abstract void onFundingSourceClicked(FundingSourceListItem fundingsourcelistitem);
    }


    private final Context context;
    private FundingSourceListItemListener listener;

    FundingSourceListItemBinder(FragmentActivity fragmentactivity)
    {
        context = fragmentactivity;
    }

    private void bind(int i, ViewHolder viewholder, final FundingSourceListItem item)
    {
        viewholder = viewholder.getView();
        ((TextView)Views.findViewById(viewholder, com.google.android.apps.walletnfcrel.R.id.PaymentCardName)).setText(item.fundingSource.getDescriptiveName(context));
        ((FundingSourceView)Views.findViewById(viewholder, com.google.android.apps.walletnfcrel.R.id.Card)).setFundingSource(item.fundingSource);
        View view = Views.findViewById(viewholder, com.google.android.apps.walletnfcrel.R.id.PaymentCardDetailView);
        if (item.fundingSource.isStoredValue())
        {
            i = 8;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
        view.setContentDescription(context.getString(com.google.android.apps.walletnfcrel.R.string.select_funding_source_list_card_details_button, new Object[] {
            item.fundingSource.getDescriptiveName(context)
        }));
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final FundingSourceListItemBinder this$0;
            final FundingSourceListItem val$item;

            public final void onClick(View view1)
            {
                view1 = item.fundingSource.getDetailsIntent(context, item.instrumentUse);
                context.startActivity(view1);
            }

            
            {
                this$0 = FundingSourceListItemBinder.this;
                item = fundingsourcelistitem;
                super();
            }
        });
        viewholder.setOnClickListener(new android.view.View.OnClickListener() {

            final FundingSourceListItemBinder this$0;
            final FundingSourceListItem val$item;

            public final void onClick(View view1)
            {
                Preconditions.checkNotNull(listener);
                listener.onFundingSourceClicked(item);
            }

            
            {
                this$0 = FundingSourceListItemBinder.this;
                item = fundingsourcelistitem;
                super();
            }
        });
        setMessageAndColor((TextView)Views.findViewById(viewholder, com.google.android.apps.walletnfcrel.R.id.MessageText), item);
    }

    private static boolean isEnabled(FundingSourceListItem fundingsourcelistitem)
    {
        return true;
    }

    private void setMessageAndColor(TextView textview, FundingSourceListItem fundingsourcelistitem)
    {
        int i = fundingsourcelistitem.instrumentUse;
        FundingSource fundingsource = fundingsourcelistitem.fundingSource;
        fundingsourcelistitem = fundingsourcelistitem.feeDescription;
        textview.setVisibility(0);
        if (fundingsource.isInapplicableForUse(i))
        {
            textview.setText(fundingsource.getRestrictedUse(i).shortMessage);
            Views.showAlertIndicator(textview);
        } else
        {
            Views.hideDrawableIndicators(textview);
            if (fundingsourcelistitem != null)
            {
                textview.setText(fundingsourcelistitem);
                textview.setTextColor(context.getResources().getColor(com.google.android.apps.walletnfcrel.R.color.secondary));
                return;
            }
            if (i == 1)
            {
                textview.setText(com.google.android.apps.walletnfcrel.R.string.tap_and_pay_settings_card_list_tap_to_select);
                return;
            }
        }
    }

    public final volatile void bind(int i, ViewHolder viewholder, Object obj)
    {
        bind(i, viewholder, (FundingSourceListItem)obj);
    }

    public final ViewHolder createDisplay()
    {
        return new ViewHolder() {

            final FundingSourceListItemBinder this$0;
            final View val$view;

            public final View getView()
            {
                return view;
            }

            
            {
                this$0 = FundingSourceListItemBinder.this;
                view = view1;
                super();
            }
        };
    }

    public final volatile boolean isEnabled(Object obj)
    {
        return isEnabled((FundingSourceListItem)obj);
    }

    public final void setFundingSourceListItemListener(FundingSourceListItemListener fundingsourcelistitemlistener)
    {
        listener = fundingsourcelistitemlistener;
    }


}
