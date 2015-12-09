// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;

import com.dominos.android.sdk.core.models.loyalty.CustomerLoyalty;
import com.dominos.android.sdk.core.models.loyalty.HistoryLoyalty;
import org.androidannotations.api.b.a;
import org.androidannotations.api.b.b;
import org.androidannotations.api.b.c;
import org.c.d.j;

public interface PowerRestInterface
    extends a, b, c
{

    public abstract String addCard(String s, String s1);

    public abstract String buildings(int i);

    public abstract String changePassword(j j);

    public abstract String deleteCard(String s, String s1);

    public abstract String emailOptIn(String s);

    public abstract String getAllCards(String s);

    public abstract String getCard(String s, String s1);

    public abstract String getFeedbackQuestions(String s, String s1, String s2);

    public abstract HistoryLoyalty getLoyaltyHistory(String s);

    public abstract CustomerLoyalty getLoyaltyInformation(String s);

    public abstract String giftCardBalanceInquiry(String s);

    public abstract String login();

    public abstract String login(j j, String s);

    public abstract String menu(String s, String s1);

    public abstract String oauth(j j);

    public abstract String orderHistory(String s, int i, String s1);

    public abstract String placeOrder(String s, String s1);

    public abstract String priceOrder(String s);

    public abstract String regions();

    public abstract String resetPassword(j j);

    public abstract String saveCustomer(String s);

    public abstract String sites(String s);

    public abstract String storeCoupon(String s, String s1, String s2);

    public abstract String storeLocator(String s, String s1);

    public abstract String storeProfile(String s);

    public abstract String stores(int i, String s);

    public abstract String submitFeedback(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9);

    public abstract String trackOrder(String s);

    public abstract String trackOrder(String s, String s1);

    public abstract String updateCard(String s, String s1, String s2);
}
