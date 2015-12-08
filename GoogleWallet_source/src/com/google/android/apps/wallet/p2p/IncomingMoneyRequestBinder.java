// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.wallet.base.view.ViewHolder;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecord;
import com.google.android.apps.wallet.widgets.list.ListItemBinder;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            IncomingMoneyRequestView

public class IncomingMoneyRequestBinder
    implements ListItemBinder
{

    private final Activity activity;

    public IncomingMoneyRequestBinder(Activity activity1)
    {
        activity = activity1;
    }

    private static void bind(int i, ViewHolder viewholder, PurchaseRecord purchaserecord)
    {
        viewholder = (IncomingMoneyRequestView)viewholder.getView().findViewById(com.google.android.apps.walletnfcrel.R.id.SingleRequestLayout);
        viewholder.setPurchaseRecord(purchaserecord);
        viewholder.setVisibility(0);
    }

    private static boolean isEnabled(PurchaseRecord purchaserecord)
    {
        return true;
    }

    public final volatile void bind(int i, ViewHolder viewholder, Object obj)
    {
        bind(i, viewholder, (PurchaseRecord)obj);
    }

    public final ViewHolder createDisplay()
    {
        return new ViewHolder() {

            final IncomingMoneyRequestBinder this$0;
            final View val$view;

            public final View getView()
            {
                return view;
            }

            
            {
                this$0 = IncomingMoneyRequestBinder.this;
                view = view1;
                super();
            }
        };
    }

    public final volatile boolean isEnabled(Object obj)
    {
        return isEnabled((PurchaseRecord)obj);
    }
}
