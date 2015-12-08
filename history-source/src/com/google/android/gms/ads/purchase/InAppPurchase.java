// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.purchase;


public interface InAppPurchase
{

    public static final int RESOLUTION_CANCELED = 2;
    public static final int RESOLUTION_FAILURE = 0;
    public static final int RESOLUTION_INVALID_PRODUCT = 3;
    public static final int RESOLUTION_SUCCESS = 1;

    public abstract String getProductId();

    public abstract void recordPlayBillingResolution(int i);

    public abstract void recordResolution(int i);
}
