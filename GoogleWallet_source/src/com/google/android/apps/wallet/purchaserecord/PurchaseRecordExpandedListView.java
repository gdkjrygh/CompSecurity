// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.view.ViewHolder;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordListItemBinder, PurchaseRecord

public class PurchaseRecordExpandedListView extends LinearLayout
{

    private PurchaseRecordListItemBinder binder;
    private final Context context;
    private boolean useWobl;

    public PurchaseRecordExpandedListView(Context context1, AttributeSet attributeset)
    {
        super(context1, attributeset);
        context = context1;
        setOrientation(1);
    }

    private void addTilePaddingToView(View view)
    {
        int i = context.getResources().getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.default_spacing);
        view.setPadding(i, view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public void setPurchaseRecordListItemBinder(PurchaseRecordListItemBinder purchaserecordlistitembinder, boolean flag)
    {
        binder = purchaserecordlistitembinder;
        useWobl = flag;
        purchaserecordlistitembinder.setTransactionsUseWobl(flag);
    }

    public final void showPurchaseRecordsTransactions(List list)
    {
        removeAllViews();
        if (list != null && !list.isEmpty())
        {
            int i = 0;
            while (i < list.size()) 
            {
                final PurchaseRecord purchaseRecord = (PurchaseRecord)list.get(i);
                Object obj = binder.createDisplay();
                binder.bind(i, ((ViewHolder) (obj)), purchaseRecord);
                obj = ((ViewHolder) (obj)).getView();
                if (!useWobl)
                {
                    addTilePaddingToView(((View) (obj)));
                    ((View) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                        final PurchaseRecordExpandedListView this$0;
                        final PurchaseRecord val$purchaseRecord;

                        public final void onClick(View view)
                        {
                            view = UriIntents.create(context, UriRegistry.getUri(8001, new Object[] {
                                purchaseRecord.getId()
                            }));
                            context.startActivity(view);
                        }

            
            {
                this$0 = PurchaseRecordExpandedListView.this;
                purchaseRecord = purchaserecord;
                super();
            }
                    });
                }
                addView(((View) (obj)));
                i++;
            }
        }
    }

}
