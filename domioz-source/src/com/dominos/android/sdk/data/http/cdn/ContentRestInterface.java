// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.cdn;

import com.dominos.android.sdk.core.models.ApplicationConfigVersion;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.models.ReplacedProducts;
import com.dominos.android.sdk.core.models.loyalty.LoyaltyFAQHolder;
import org.androidannotations.api.b.a;
import org.androidannotations.api.b.b;
import org.androidannotations.api.b.c;

public interface ContentRestInterface
    extends a, b, c
{

    public abstract ApplicationConfigVersion getApplicationConfigVersion(String s);

    public abstract ApplicationConfiguration getApplicationConfiguration(String s);

    public abstract LoyaltyFAQHolder getLoyaltyFaqs(String s);

    public abstract String getPrompts(String s);

    public abstract ReplacedProducts getReplacedProducts();

    public abstract com.dominos.android.sdk.core.upsell.UpsellBarProductData.UpsellData getUpsellBarData(String s);

    public abstract String getUpsellConfiguration(String s);
}
