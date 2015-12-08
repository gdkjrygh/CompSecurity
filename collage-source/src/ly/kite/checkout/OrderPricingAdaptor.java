// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.checkout;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ly.kite.catalogue.MultipleCurrencyAmount;
import ly.kite.catalogue.SingleCurrencyAmount;
import ly.kite.pricing.OrderPricing;

public class OrderPricingAdaptor extends BaseAdapter
{

    private static final String LOG_TAG = "OrderPricingAdaptor";
    private Context mContext;
    private ArrayList mItemList;
    private LayoutInflater mLayoutInflator;
    private OrderPricing mPricing;

    public OrderPricingAdaptor(Context context, OrderPricing orderpricing)
    {
        mContext = context;
        mPricing = orderpricing;
        mLayoutInflator = LayoutInflater.from(context);
        mItemList = new ArrayList();
        if (orderpricing != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
    /* block-local class not found */
    class Item {}

        Locale locale;
        locale = Locale.getDefault();
        String s;
        Object obj;
        for (context = orderpricing.getLineItems().iterator(); context.hasNext(); mItemList.add(new Item(s, ((String) (obj)), false)))
        {
            obj = (ly.kite.pricing.OrderPricing.LineItem)context.next();
            s = ((ly.kite.pricing.OrderPricing.LineItem) (obj)).getDescription();
            obj = ((ly.kite.pricing.OrderPricing.LineItem) (obj)).getProductCost().getDefaultDisplayAmountWithFallback();
        }

        context = orderpricing.getTotalShippingCost();
        if (context == null)
        {
            break; /* Loop/switch isn't completed */
        }
        context = context.getAmountWithFallback(locale);
        if (context == null || context.getAmount().compareTo(BigDecimal.ZERO) <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        context = context.getDisplayAmountForLocale(locale);
_L4:
        mItemList.add(new Item(mContext.getString(ly.kite.R.string.Shipping), context, false));
        context = orderpricing.getPromoCodeDiscount();
        if (context != null)
        {
            context = context.getAmountWithFallback(locale);
            if (context != null && context.getAmount().compareTo(BigDecimal.ZERO) > 0)
            {
                mItemList.add(new Item(mContext.getString(ly.kite.R.string.Promotional_Discount), context.getDisplayAmountForLocale(locale), false));
            }
        }
        context = orderpricing.getTotalCost();
        if (context != null)
        {
            context = context.getAmountWithFallback(locale);
            mItemList.add(new Item(mContext.getString(ly.kite.R.string.Total), context.getDisplayAmountForLocale(locale), true));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        context = mContext.getString(ly.kite.R.string.Free);
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public int getCount()
    {
        return mItemList.size();
    }

    public Object getItem(int i)
    {
        return mItemList.get(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
    /* block-local class not found */
    class ViewReferences {}

        if (view == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        viewgroup = ((ViewGroup) (view.getTag()));
        if (viewgroup == null || !(viewgroup instanceof ViewReferences))
        {
            break MISSING_BLOCK_LABEL_95;
        }
        ViewReferences viewreferences = (ViewReferences)viewgroup;
        viewgroup = view;
        view = viewreferences;
_L1:
        Item item = (Item)getItem(i);
        ((ViewReferences) (view)).descriptionTextView.setText(item.description);
        ((ViewReferences) (view)).amountTextView.setText(item.amount);
        if (item.isBold)
        {
            ((ViewReferences) (view)).descriptionTextView.setTypeface(Typeface.DEFAULT_BOLD);
            ((ViewReferences) (view)).amountTextView.setTypeface(Typeface.DEFAULT_BOLD);
            return viewgroup;
        } else
        {
            ((ViewReferences) (view)).descriptionTextView.setTypeface(Typeface.DEFAULT);
            ((ViewReferences) (view)).amountTextView.setTypeface(Typeface.DEFAULT);
            return viewgroup;
        }
        viewgroup = mLayoutInflator.inflate(ly.kite.R.layout.list_item_order_pricing, null);
        view = new ViewReferences(null);
        view.descriptionTextView = (TextView)viewgroup.findViewById(ly.kite.R.id.description_text_view);
        view.amountTextView = (TextView)viewgroup.findViewById(ly.kite.R.id.amount_text_view);
        viewgroup.setTag(view);
          goto _L1
    }
}
