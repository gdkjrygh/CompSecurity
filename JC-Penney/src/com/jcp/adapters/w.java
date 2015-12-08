// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.jcp.g.a;
import com.jcp.model.Adjustments;
import com.jcp.model.CartItemsDetails;
import com.jcp.model.PromotionDetails;
import com.jcp.util.bv;
import com.jcp.util.y;
import com.squareup.a.ak;
import com.squareup.a.ba;

// Referenced classes of package com.jcp.adapters:
//            x

public class w
{

    private Context a;
    private boolean b;
    private AddToCartAdapter.ShoppingBagViewHolder c;
    private String d;

    public w(Context context, boolean flag)
    {
        d = "";
        a = context;
        b = flag;
        d = a.getResources().getString(0x7f070176);
    }

    static Context a(w w1)
    {
        return w1.a;
    }

    public View a(View view)
    {
        if (view == null)
        {
            view = ((LayoutInflater)a.getSystemService("layout_inflater")).inflate(0x7f03001d, null);
            c = new AddToCartAdapter.ShoppingBagViewHolder(view);
            view.setTag(c);
            return view;
        } else
        {
            c = (AddToCartAdapter.ShoppingBagViewHolder)view.getTag();
            return view;
        }
    }

    public AddToCartAdapter.ShoppingBagViewHolder a()
    {
        return c;
    }

    public void a(AddToCartAdapter.ShoppingBagViewHolder shoppingbagviewholder, int i, int j)
    {
label0:
        {
            if (shoppingbagviewholder != null)
            {
                if (i != j - 1)
                {
                    break label0;
                }
                shoppingbagviewholder.mItemSeparator.setVisibility(8);
            }
            return;
        }
        shoppingbagviewholder.mItemSeparator.setVisibility(0);
    }

    public void a(AddToCartAdapter.ShoppingBagViewHolder shoppingbagviewholder, CartItemsDetails cartitemsdetails)
    {
        if (shoppingbagviewholder != null && cartitemsdetails != null)
        {
            shoppingbagviewholder.mCutOffMessageView.setVisibility(8);
            shoppingbagviewholder.mChangeStore.setVisibility(8);
            shoppingbagviewholder.mItemTitle.setText(cartitemsdetails.getName());
            shoppingbagviewholder.mItemCode.setText((new StringBuilder()).append(a.getResources().getString(0x7f07024b)).append(cartitemsdetails.getProductNumber()).toString());
            if (b)
            {
                cartitemsdetails = cartitemsdetails.getImageURL();
                if (!TextUtils.isEmpty(cartitemsdetails))
                {
                    if (cartitemsdetails.indexOf(".tif") != -1)
                    {
                        cartitemsdetails = (new StringBuilder()).append("https:").append(cartitemsdetails.substring(0, cartitemsdetails.indexOf(".tif"))).toString();
                    } else
                    {
                        cartitemsdetails = (new StringBuilder()).append("https:").append(cartitemsdetails).toString();
                    }
                    com.jcp.g.a.a().a(cartitemsdetails).b(0x7f02017f).a(shoppingbagviewholder.mItemImageView);
                }
            }
        }
    }

    public void a(CartItemsDetails cartitemsdetails, AddToCartAdapter.ShoppingBagViewHolder shoppingbagviewholder)
    {
label0:
        {
            if (cartitemsdetails != null && shoppingbagviewholder != null)
            {
                PromotionDetails apromotiondetails[] = cartitemsdetails.getPromotions();
                if (!TextUtils.isEmpty(cartitemsdetails.getMarketingLabel()))
                {
                    shoppingbagviewholder.marketingLabel.setVisibility(0);
                    shoppingbagviewholder.marketingLabel.setText(bv.a(cartitemsdetails.getMarketingLabel()));
                } else
                {
                    shoppingbagviewholder.marketingLabel.setVisibility(8);
                }
                if ("GIFTCARD".equalsIgnoreCase(cartitemsdetails.getType()))
                {
                    shoppingbagviewholder.mItemItemPrice.setVisibility(8);
                    shoppingbagviewholder.mSalePriceHeader.setVisibility(8);
                }
                if (cartitemsdetails.getActivePrice() == cartitemsdetails.getOriginalPrice())
                {
                    shoppingbagviewholder.mItemItemPrice.setVisibility(8);
                    shoppingbagviewholder.mSalePriceHeader.setVisibility(8);
                } else
                {
                    shoppingbagviewholder.mSalePriceHeader.setText(a.getResources().getString(0x7f07009b));
                    shoppingbagviewholder.mItemItemPrice.setText((new StringBuilder()).append(d).append(y.a(cartitemsdetails.getActivePrice(), true)).toString());
                    shoppingbagviewholder.mSalePriceHeader.setVisibility(0);
                    shoppingbagviewholder.mItemItemPrice.setVisibility(0);
                }
                if (cartitemsdetails.isClearance())
                {
                    shoppingbagviewholder.mSalePriceHeader.setVisibility(0);
                    shoppingbagviewholder.mSalePriceHeader.setText(a.getResources().getString(0x7f0700f6));
                }
                shoppingbagviewholder.mItemOriginalPrice.setText((new StringBuilder()).append(d).append(y.a(cartitemsdetails.getOriginalPrice(), true)).toString());
                if (cartitemsdetails.getTotalSavings() > 0.0D)
                {
                    int i = shoppingbagviewholder.mItemOriginalPrice.getPaintFlags();
                    shoppingbagviewholder.mItemOriginalPrice.setPaintFlags(i | 0x10);
                } else
                {
                    shoppingbagviewholder.mItemOriginalPrice.setPaintFlags(0);
                }
                if (apromotiondetails != null && apromotiondetails.length > 0)
                {
                    PromotionDetails promotiondetails = apromotiondetails[0];
                    if (promotiondetails != null && !TextUtils.isEmpty(promotiondetails.getCaption()))
                    {
                        shoppingbagviewholder.mItemTypeDescription.setVisibility(0);
                        shoppingbagviewholder.mItemTypePrice.setVisibility(0);
                        shoppingbagviewholder.mItemTypePrice.setText((new StringBuilder()).append(d).append(y.a(promotiondetails.getAmount(), true)).toString());
                        shoppingbagviewholder.mItemTypeDescription.setText(promotiondetails.getCaption());
                    } else
                    {
                        shoppingbagviewholder.mItemTypeDescription.setVisibility(8);
                        shoppingbagviewholder.mItemTypePrice.setVisibility(8);
                    }
                } else
                {
                    shoppingbagviewholder.mItemTypeDescription.setVisibility(8);
                    shoppingbagviewholder.mItemTypePrice.setVisibility(8);
                }
                if (cartitemsdetails.getQuantity() >= 1)
                {
                    shoppingbagviewholder.mItemTotalText.setText((new StringBuilder()).append(" (").append(cartitemsdetails.getQuantity()).append(") ").append(a.getResources().getString(0x7f070095)).toString());
                }
                shoppingbagviewholder.mItemTotalPrice.setText((new StringBuilder()).append(d).append(y.a(cartitemsdetails.getTotal(), true)).toString());
                if (b)
                {
                    break label0;
                }
                shoppingbagviewholder.mItemSavePrice.setText((new StringBuilder()).append(d).append(y.a(cartitemsdetails.getTotalSavings(), true)).toString());
            }
            return;
        }
        shoppingbagviewholder.mItemSavePrice.setVisibility(8);
        shoppingbagviewholder.mSeparatorViewBelowEstimateLayout.setVisibility(8);
        shoppingbagviewholder.mItemValueSeparatorView.setVisibility(8);
        shoppingbagviewholder.mItemSavedPriceLabelView.setVisibility(8);
    }

    public android.view.View.OnClickListener b()
    {
        return new x(this);
    }

    public void b(CartItemsDetails cartitemsdetails, AddToCartAdapter.ShoppingBagViewHolder shoppingbagviewholder)
    {
label0:
        {
            if (cartitemsdetails.getAdjustments() == null)
            {
                break label0;
            }
            cartitemsdetails = cartitemsdetails.getAdjustments();
            int j = cartitemsdetails.length;
            double d2 = 0.0D;
            double d1 = 0.0D;
            int i = 0;
            while (i < j) 
            {
label1:
                {
                    Adjustments adjustments = cartitemsdetails[i];
                    double d3;
                    double d4;
                    if (TextUtils.isEmpty(adjustments.getCode()))
                    {
                        d3 = d2;
                        d4 = d1;
                        if (TextUtils.isEmpty(adjustments.getType()))
                        {
                            break label1;
                        }
                    }
                    if ("COUPON".equalsIgnoreCase(adjustments.getCode()))
                    {
                        d4 = d1 + adjustments.getAmount();
                        d3 = d2;
                    } else
                    {
                        d3 = d2;
                        d4 = d1;
                        if ("REWARDS".equalsIgnoreCase(adjustments.getCode()))
                        {
                            d3 = d2 + adjustments.getAmount();
                            d4 = d1;
                        }
                    }
                }
                i++;
                d2 = d3;
                d1 = d4;
            }
            if (d1 > 0.0D)
            {
                shoppingbagviewholder.mCouponCalculation.setVisibility(0);
                shoppingbagviewholder.mCouponCalculationAmount.setVisibility(0);
                shoppingbagviewholder.mCouponCalculationAmount.setText((new StringBuilder()).append(a.getResources().getString(0x7f070149)).append(y.a(d1, true)).toString());
            } else
            {
                shoppingbagviewholder.mCouponCalculation.setVisibility(8);
                shoppingbagviewholder.mCouponCalculationAmount.setVisibility(8);
            }
            if (d2 > 0.0D)
            {
                shoppingbagviewholder.mRewardCalculation.setVisibility(0);
                shoppingbagviewholder.mRewardCalculationAmount.setVisibility(0);
                shoppingbagviewholder.mRewardCalculationAmount.setText((new StringBuilder()).append(a.getResources().getString(0x7f070149)).append(y.a(d2, true)).toString());
                return;
            } else
            {
                shoppingbagviewholder.mRewardCalculation.setVisibility(8);
                shoppingbagviewholder.mRewardCalculationAmount.setVisibility(8);
                return;
            }
        }
        shoppingbagviewholder.mRewardCalculation.setVisibility(8);
        shoppingbagviewholder.mRewardCalculationAmount.setVisibility(8);
        shoppingbagviewholder.mCouponCalculation.setVisibility(8);
        shoppingbagviewholder.mCouponCalculationAmount.setVisibility(8);
    }
}
