// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.network.api;

import retrofit.Callback;

public interface CommerceApiService
{

    public static final String COMMERCE_API_ADD_FIELDS = "cart.external_shipping(),cart.user_card(),cart.detailed_shipping()";
    public static final String COMMERCE_API_MERCHANT_FIELDS = "merchant.customer_service_email,merchant.return_policy_url,merchant.type,merchant.id,merchant.is_active,merchant.user,merchant.user_id,merchant.display_name,merchant.merchant_url,merchant.logo_url,merchant.customer_service_phone";
    public static final String COMMERCE_API_ORDER_HISTORY_ADD_FIELDS = "cart.order_id,cart.country,cart.display_total_price,cart.shipping_detail_id,cart.items,cart.merchant,cart.total_price,cart.product_pins(),cart.billing_detail,cart.is_visible,cart.detailed_shipping(),cart.paid_at,cart.display_status,cart.shipping_rates,cart.is_active,cart.submitted_at,cart.user_card(),cart.created_at,cart.display_base_price,cart.updated_at,cart.id,cart.base_price,cart.status,cart.display_taxes,cart.total_taxes,cart.preferred_card_id,cart.policy_link,cart.display_shipping_cost,cart.user_id,cart.preferred_vault_type,cart.currency,cart.wallet_type,cart.selected_shipping_rate,cart.external_shipping(),cart.merchant(),cart.require_shipping,cart.product_pins,usercard.last4,usercard.brand_name,usercard.address,usercard.id,usercard.exp_year,usercard.first_name,usercard.exp_month,usercard.brand,usercard.last_name,pin.price_value,pin.title,pin.attribution,pin.description,pin.type,pin.is_video,pin.like_count,pin.comment_count,pin.cacheable_id,pin.images[345x, 750x],pin.liked_by_me,pin.is_downstream_promotion,pin.id,pin.link,pin.is_promoted,pin.price_currency,pin.tracked_link,pin.buyable_product(),pin.is_repin,pin.created_at,pin.dominant_color,pin.promoter(),pin.image_square_url,pin.repin_count,pin.domain,user.image_medium_url,user.image_large_url,user.id,user.type,user.username,user.blocked_by_me,user.image_small_url,user.full_name,user.follower_count,user.first_name,user.implicitly_followed_by_me,user.explicitly_followed_by_me,user.last_name,user.gender,shippingdetail.id,shippingdetail.first_name,shippingdetail.last_name,shippingdetail.phone,shippingdetail.email,shippingdetail.address,merchant.customer_service_email,merchant.return_policy_url,merchant.type,merchant.id,merchant.is_active,merchant.user,merchant.user_id,merchant.display_name,merchant.merchant_url,merchant.logo_url,merchant.customer_service_phone";
    public static final String COMMERCE_API_ORDER_HISTORY_FILTER = "4,3,5";

    public abstract void calculateTotals(String s, String s1, String s2, Callback callback);

    public abstract void checkout(String s, Long long1, String s1, String s2, String s3, Callback callback);

    public abstract void createCart(String s, Integer integer, String s1, String s2, String s3, Callback callback);

    public abstract void createPaymentMethod(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            Callback callback);

    public abstract void createShippingAddress(String s, String s1, String s2, String s3, String s4, String s5, Callback callback);

    public abstract void deactivateCart(String s, Callback callback);

    public abstract void deletePaymentMethod(String s, Callback callback);

    public abstract void deleteShippingAddress(String s, Callback callback);

    public abstract void doCardIncentiveEnrollment(String s, String s1, Callback callback);

    public abstract void getAllPaymentMethods(String s, Callback callback);

    public abstract void getAllShippingAddresses(String s, Callback callback);

    public abstract void getCart(String s, String s1, Callback callback);

    public abstract void getIncentiveProgramEligibility(String s, Callback callback);

    public abstract void getMerchant(String s, String s1, Callback callback);

    public abstract void getOrderHistory(String s, Integer integer, Boolean boolean1, String s1, String s2, Callback callback);

    public abstract void updateCartItemQuantity(String s, String s1, String s2, String s3, String s4, Callback callback);

    public abstract void updateCartPaymentMethod(String s, String s1, String s2, Callback callback);

    public abstract void updateCartShippingAddress(String s, String s1, String s2, Callback callback);

    public abstract void updateCartShippingMethod(String s, String s1, String s2, Callback callback);

    public abstract void updatePaymentMethod(String s, String s1, String s2, String s3, Integer integer, Integer integer1, String s4, 
            String s5, String s6, Callback callback);

    public abstract void updateShippingAddress(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            Callback callback);
}
