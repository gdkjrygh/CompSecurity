// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.view.DefaultViewHolder;
import com.google.android.apps.wallet.base.view.ViewHolder;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.date.DateAndTimeHelper;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.list.ListItemBinder;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import com.google.android.apps.wallet.wobs.wobl.WoblHolder;
import com.google.common.base.Optional;
import com.google.wallet.wobl.exception.WoblException;
import java.net.URI;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecord

public class PurchaseRecordListItemBinder
    implements ListItemBinder
{
    public static final class PurchaseRecordListItemDisplay extends DefaultViewHolder
    {

        private final TextView amount;
        private final Context context;
        private final View divider;
        private final TextView label;
        private final TextView time;
        private final TextView title;

        public final void setCreditDebit(Integer integer)
        {
            TextView textview = amount;
            int i;
            if (Protos.valuesEqual(integer, 1))
            {
                i = context.getResources().getColor(com.google.android.apps.walletnfcrel.R.color.good);
            } else
            {
                i = context.getResources().getColor(com.google.android.apps.walletnfcrel.R.color.dark);
            }
            textview.setTextColor(i);
        }

        public final void setPurchaseRecordAmount(String s)
        {
            amount.setText(s);
        }

        public final void setPurchaseRecordLabel(String s)
        {
            label.setText(s);
        }

        public final void setPurchaseRecordTime(String s)
        {
            time.setText(s);
        }

        public final void setPurchaseRecordTitle(String s)
        {
            title.setText(s);
        }

        public final void setSuccess(boolean flag)
        {
            if (flag)
            {
                title.setTextAppearance(context, com.google.android.apps.walletnfcrel.R.style.Font_CardListNormal);
                return;
            } else
            {
                title.setTextColor(context.getResources().getColor(com.google.android.apps.walletnfcrel.R.color.medium));
                amount.setTextColor(context.getResources().getColor(com.google.android.apps.walletnfcrel.R.color.medium));
                return;
            }
        }

        public final void showDivider(boolean flag)
        {
            View view = divider;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }





        public PurchaseRecordListItemDisplay(Context context1, LayoutInflater layoutinflater)
        {
            super(com.google.android.apps.walletnfcrel.R.layout.purchase_record_list_item);
            context = context1;
            createView(layoutinflater);
            title = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.PurchaseRecordTitle);
            label = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.PurchaseRecordLabel);
            time = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.PurchaseRecordTime);
            amount = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.PurchaseRecordAmount);
            divider = findViewById(com.google.android.apps.walletnfcrel.R.id.Divider);
            getView().setAccessibilityDelegate(new _cls1());
        }
    }


    private static final String TAG = com/google/android/apps/wallet/purchaserecord/PurchaseRecordListItemBinder.getSimpleName();
    private final Activity activity;
    private int count;
    private final DateAndTimeHelper dateAndTimeHelper;
    private final LayoutMatcher layoutMatcher;
    private boolean transactionsUseWobl;
    private final Provider woblHolderProvider;

    public PurchaseRecordListItemBinder(Activity activity1, Provider provider, LayoutMatcher layoutmatcher, DateAndTimeHelper dateandtimehelper)
    {
        activity = activity1;
        woblHolderProvider = provider;
        layoutMatcher = layoutmatcher;
        dateAndTimeHelper = dateandtimehelper;
    }

    private void bindMrfView(int i, ViewHolder viewholder, PurchaseRecord purchaserecord)
    {
        viewholder = (PurchaseRecordListItemDisplay)viewholder;
        viewholder.setPurchaseRecordTitle((String)purchaserecord.getTitle().or(""));
        viewholder.setPurchaseRecordLabel((String)purchaserecord.getLabel().or(""));
        viewholder.setPurchaseRecordTime(formatPurchaseRecordTime(purchaserecord.getTransactionTimeInMillis()));
        viewholder.setPurchaseRecordAmount((String)purchaserecord.getDisplayableAmount().or(""));
        viewholder.setCreditDebit(purchaserecord.getCreditDebit());
        viewholder.setSuccess(isSuccessfulTransaction(purchaserecord));
        boolean flag;
        if (i < count - 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        viewholder.showDivider(flag);
    }

    private void bindWoblView(ViewHolder viewholder, PurchaseRecord purchaserecord)
    {
        viewholder = viewholder.getView();
        Object obj;
        WoblHolder woblholder;
        try
        {
            viewholder = (LinearLayout)Views.findViewById(viewholder, com.google.android.apps.walletnfcrel.R.id.TransactionListItemContainer);
            viewholder.removeAllViews();
            obj = purchaserecord.getRenderOutput();
            obj = layoutMatcher.getLayoutForListView(((com.google.wallet.proto.NanoWalletWobl.RenderOutput) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (ViewHolder viewholder)
        {
            WLog.e(TAG, "Failed to render wobl for transaction details", viewholder);
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        woblholder = (WoblHolder)woblHolderProvider.get();
        woblholder.setSource(((com.google.wallet.proto.NanoWalletWobl.Layout) (obj)), URI.create(UriRegistry.getUri(8001, new Object[] {
            purchaserecord.getId()
        }).toString()));
        viewholder.addView(woblholder.getView());
    }

    private String formatPurchaseRecordTime(Optional optional)
    {
        if (!optional.isPresent())
        {
            return "";
        } else
        {
            return dateAndTimeHelper.formatSmartDate(((Long)optional.get()).longValue());
        }
    }

    private static boolean isEnabled(PurchaseRecord purchaserecord)
    {
        return true;
    }

    private static boolean isSuccessfulTransaction(PurchaseRecord purchaserecord)
    {
        purchaserecord = purchaserecord.getStatus();
        return !Protos.valuesEqual(purchaserecord, 11) && !Protos.valuesEqual(purchaserecord, 5);
    }

    public final void bind(int i, ViewHolder viewholder, PurchaseRecord purchaserecord)
    {
        if (transactionsUseWobl)
        {
            bindWoblView(viewholder, purchaserecord);
            return;
        } else
        {
            bindMrfView(i, viewholder, purchaserecord);
            return;
        }
    }

    public final volatile void bind(int i, ViewHolder viewholder, Object obj)
    {
        bind(i, viewholder, (PurchaseRecord)obj);
    }

    public final ViewHolder createDisplay()
    {
        if (transactionsUseWobl)
        {
            return new ViewHolder() {

                final PurchaseRecordListItemBinder this$0;
                final View val$view;

                public final View getView()
                {
                    return view;
                }

            
            {
                this$0 = PurchaseRecordListItemBinder.this;
                view = view1;
                super();
            }
            };
        } else
        {
            return new PurchaseRecordListItemDisplay(activity, activity.getLayoutInflater());
        }
    }

    public final volatile boolean isEnabled(Object obj)
    {
        return isEnabled((PurchaseRecord)obj);
    }

    public final void setCount(int i)
    {
        count = i;
    }

    public final void setTransactionsUseWobl(boolean flag)
    {
        transactionsUseWobl = flag;
    }


    // Unreferenced inner class com/google/android/apps/wallet/purchaserecord/PurchaseRecordListItemBinder$PurchaseRecordListItemDisplay$1

/* anonymous class */
    final class PurchaseRecordListItemDisplay._cls1 extends android.view.View.AccessibilityDelegate
    {

        final PurchaseRecordListItemDisplay this$0;

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
        {
            super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfo);
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(title.getText());
            stringbuilder.append(", ");
            stringbuilder.append(amount.getText());
            stringbuilder.append(", ");
            stringbuilder.append(label.getText());
            stringbuilder.append(", ");
            stringbuilder.append(time.getText());
            stringbuilder.append(view.getContext().getString(com.google.android.apps.walletnfcrel.R.string.button_announce_suffix));
            accessibilitynodeinfo.setContentDescription(stringbuilder.toString());
        }

            
            {
                this$0 = PurchaseRecordListItemDisplay.this;
                super();
            }
    }

}
