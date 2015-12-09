// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.DateFormatUtil;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsProductLine;
import java.util.List;
import org.a.a.a.l;

// Referenced classes of package com.dominos.views:
//            HistoricalProductView_, HistoricalProductView, HistoricalItemUnavailableView_, HistoricalItemUnavailableView, 
//            HistoricalAddressView, HistoricalPaymentView

public class HistoricalItemView extends LinearLayout
{

    private Context mContext;
    HistoricalAddressView mHistoricalAddressView;
    HistoricalPaymentView mHistoricalPaymentView;
    LinearLayout mHistoricalProductListView;
    TextView mItemDateTextView;
    TextView mItemNumberTextView;
    Button mItemReorderButton;
    OrderUtil mOrderUtil;

    public HistoricalItemView(Context context)
    {
        super(context);
        mContext = context;
    }

    public void bind(String s, final LabsOrder historicalOrder, final HistoricalItemCallback callback)
    {
        if (!historicalOrder.isEasyOrder()) goto _L2; else goto _L1
_L1:
        mItemDateTextView.setText(historicalOrder.getEasyOrderNickName());
_L4:
        mItemReorderButton.setOnClickListener(new _cls1());
        s = historicalOrder.getProductLineList();
        mHistoricalProductListView.removeAllViews();
        if (s != null && !s.isEmpty())
        {
            for (int i = 0; i < s.size(); i++)
            {
                callback = (LabsProductLine)s.get(i);
                if (callback.getStatus() >= 0)
                {
                    HistoricalProductView historicalproductview = HistoricalProductView_.build(mContext);
                    historicalproductview.bind(callback);
                    if (i > 0)
                    {
                        historicalproductview.setPadding(0, getResources().getDimensionPixelOffset(0x7f0a009f), 0, 0);
                    }
                    mHistoricalProductListView.addView(historicalproductview);
                }
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        mItemNumberTextView.setText(s);
        if (l.b(historicalOrder.getBusinessDate()))
        {
            mItemDateTextView.setText(DateFormatUtil.formatFromApiToLabelDate(historicalOrder.getBusinessDate()));
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (mOrderUtil.isHistoricalProductsRemoved(historicalOrder))
        {
            callback = HistoricalItemUnavailableView_.build(mContext);
            if (mOrderUtil.isHistoricalProductsListEmpty(historicalOrder))
            {
                s = getResources().getString(0x7f08017f);
            } else
            {
                s = getResources().getString(0x7f080180);
            }
            callback.setDescription(s);
            if (mHistoricalProductListView.getChildCount() > 0)
            {
                callback.setPadding(0, getResources().getDimensionPixelOffset(0x7f0a009f), 0, 0);
            }
            mHistoricalProductListView.addView(callback);
        }
        mHistoricalAddressView.bind(historicalOrder);
        mHistoricalPaymentView.bind(historicalOrder);
        return;
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final HistoricalItemView this$0;
        final HistoricalItemCallback val$callback;
        final LabsOrder val$historicalOrder;

        public void onClick(View view)
        {
            callback.onReorderButtonClicked(historicalOrder);
        }

        _cls1()
        {
            this$0 = HistoricalItemView.this;
            callback = historicalitemcallback;
            historicalOrder = labsorder;
            super();
        }

        private class HistoricalItemCallback
        {

            public abstract void onReorderButtonClicked(LabsOrder labsorder);

            public HistoricalItemCallback()
            {
            }
        }

    }

}
