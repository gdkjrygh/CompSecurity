// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import com.tinder.enums.PaywallPerk;

public interface Paywall
{

    public abstract void launchPlusSubscriptionPaywall(int i, PaywallPerk paywallperk);

    public abstract void launchSwipeLimitRoadblock(String s);
}
