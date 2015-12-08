// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.kohls.mcommerce.opal.wallet.rest.containers.OrderItems;
import com.kohls.mcommerce.opal.wallet.util.CustomTypeFace;
import com.kohls.mcommerce.opal.wallet.util.DateUtils;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            TransactionDetailActivity

public class mOrderItems extends BaseAdapter
{

    private Context mContext;
    private List mOrderItems;
    final TransactionDetailActivity this$0;

    public int getCount()
    {
        return mOrderItems.size();
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
    /* block-local class not found */
    class OrderViewHolder {}

        Object obj;
        SpannableString spannablestring;
        if (view == null)
        {
            view = ((LayoutInflater)mContext.getSystemService("layout_inflater")).inflate(0x7f0300bf, null);
            viewgroup = new OrderViewHolder(null);
            viewgroup.productTitleTxtView = (TextView)view.findViewById(0x7f0d04bf);
            viewgroup.skuTxtView = (TextView)view.findViewById(0x7f0d04c0);
            viewgroup.qtyTxtView = (TextView)view.findViewById(0x7f0d04c1);
            viewgroup.orderPriceTxtView = (TextView)view.findViewById(0x7f0d04c2);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (OrderViewHolder)view.getTag();
        }
        obj = getResources();
        ((OrderViewHolder) (viewgroup)).productTitleTxtView.setText(((OrderItems)mOrderItems.get(i)).getProductTitle());
        ((OrderViewHolder) (viewgroup)).skuTxtView.setText((new StringBuilder()).append(((Resources) (obj)).getString(0x7f0804e1)).append(" ").append(((OrderItems)mOrderItems.get(i)).getSkuCode()).toString());
        ((OrderViewHolder) (viewgroup)).qtyTxtView.setText((new StringBuilder()).append(((Resources) (obj)).getString(0x7f08045b)).append(" ").append(((OrderItems)mOrderItems.get(i)).getQty()).toString());
        obj = (new StringBuilder()).append(getResources().getString(0x7f080447)).append(" ").append("$").append(DateUtils.formatPriceTxt(((OrderItems)mOrderItems.get(i)).getLineCost())).toString();
        i = getResources().getString(0x7f080447).length();
        spannablestring = new SpannableString(((CharSequence) (obj)));
        spannablestring.setSpan(new TextAppearanceSpan(mContext, 0x7f0f001d), 0, i, 0);
        spannablestring.setSpan(new CustomTypeFace(WalletFontCache.getGothamBold(getApplicationContext())), 0, i, 0);
        spannablestring.setSpan(new TextAppearanceSpan(mContext, 0x7f0f001e), i, ((String) (obj)).length(), 0);
        spannablestring.setSpan(new CustomTypeFace(WalletFontCache.getGothamBook(getApplicationContext())), i, ((String) (obj)).length(), 0);
        ((OrderViewHolder) (viewgroup)).orderPriceTxtView.setText(spannablestring);
        return view;
    }

    public OrderViewHolder(Context context, List list)
    {
        this$0 = TransactionDetailActivity.this;
        super();
        mContext = context;
        mOrderItems = list;
    }
}
