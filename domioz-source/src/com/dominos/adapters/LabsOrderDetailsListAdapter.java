// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyUtil;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.views.LabsCouponLineView_;
import com.dominos.views.LabsProductLineView_;
import java.util.Iterator;
import java.util.List;

public class LabsOrderDetailsListAdapter extends BaseAdapter
{

    Context context;
    boolean isEditMode;
    LabsOrder order;
    TextView txtAdditionalCharge;

    public LabsOrderDetailsListAdapter()
    {
        isEditMode = false;
    }

    public void displayCoupon(int i, View view, boolean flag)
    {
        if (flag)
        {
            view.findViewById(0x7f0f0170).setVisibility(0);
        } else
        {
            view.findViewById(0x7f0f0170).setVisibility(8);
        }
        if (isEditMode)
        {
            view.findViewById(0x7f0f01ca).setVisibility(0);
            view.findViewById(0x7f0f01ca).setTag(Integer.valueOf(i));
            return;
        } else
        {
            view.findViewById(0x7f0f01ca).setVisibility(8);
            return;
        }
    }

    public int getCount()
    {
        return order.getLineCount();
    }

    public Object getItem(int i)
    {
        return order.getLineById(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
label0:
        {
            boolean flag = true;
            boolean flag1 = false;
            Object obj = getItem(i);
            viewgroup = view;
            if (view == null)
            {
                if (obj instanceof LabsProductLine)
                {
                    viewgroup = LabsProductLineView_.build(context);
                } else
                {
                    viewgroup = view;
                    if (obj instanceof LabsCouponLine)
                    {
                        viewgroup = LabsCouponLineView_.build(context);
                    }
                }
            }
            if (obj instanceof LabsProductLine)
            {
                int j;
                if (!(viewgroup instanceof LabsProductLineView_))
                {
                    view = LabsProductLineView_.build(context);
                } else
                {
                    view = viewgroup;
                }
                ((LabsProductLineView_)view).bind((LabsProductLine)obj);
            } else
            if (obj instanceof LabsCouponLine)
            {
                if (!(viewgroup instanceof LabsCouponLineView_))
                {
                    view = LabsCouponLineView_.build(context);
                } else
                {
                    view = viewgroup;
                }
                ((LabsCouponLineView_)view).bind((LabsCouponLine)obj);
            } else
            {
                view = viewgroup;
            }
            txtAdditionalCharge = (TextView)view.findViewById(0x7f0f0377);
            if (obj instanceof LabsProductLine)
            {
                if (i == order.getCouponLineList().size())
                {
                    FontManager.applyDominosFont(txtAdditionalCharge);
                    viewgroup = txtAdditionalCharge;
                    if (i > 0)
                    {
                        j = 0;
                    } else
                    {
                        j = 8;
                    }
                    viewgroup.setVisibility(j);
                    view.findViewById(0x7f0f0170).setVisibility(0);
                } else
                {
                    txtAdditionalCharge.setVisibility(8);
                    view.findViewById(0x7f0f0170).setVisibility(8);
                }
                if (isEditMode)
                {
                    view.findViewById(0x7f0f01d6).setVisibility(0);
                    view.findViewById(0x7f0f01d6).setTag(Integer.valueOf(i));
                } else
                {
                    view.findViewById(0x7f0f01d6).setVisibility(8);
                }
            }
            if (obj instanceof LabsCouponLine)
            {
                if (!LoyaltyUtil.isLoyaltyCouponLine((LabsCouponLine)obj))
                {
                    break label0;
                }
                flag = flag1;
                if (i == 0)
                {
                    flag = true;
                }
                displayCoupon(i, view, flag);
            }
            return view;
        }
        if (i != LoyaltyUtil.loyaltyCouponListSize(order.getCouponLineList()))
        {
            flag = false;
        }
        displayCoupon(i, view, flag);
        return view;
    }

    public boolean isEditMode()
    {
        return isEditMode;
    }

    public void setOrder(LabsOrder labsorder)
    {
        if (labsorder.getProductLineList() != null)
        {
            Iterator iterator = labsorder.getProductLineList().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((LabsProductLine)iterator.next()).isNeedsCustomization())
                {
                    iterator.remove();
                }
            } while (true);
        }
        order = new LabsOrder(labsorder);
    }

    public void toggleEditMode()
    {
        boolean flag;
        if (!isEditMode)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isEditMode = flag;
        notifyDataSetChanged();
    }
}
