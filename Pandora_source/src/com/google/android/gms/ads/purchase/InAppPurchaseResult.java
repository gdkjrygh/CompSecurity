// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.purchase;

import android.content.Intent;

public interface InAppPurchaseResult
{

    public abstract void finishPurchase();

    public abstract String getProductId();

    public abstract Intent getPurchaseData();

    public abstract int getResultCode();

    public abstract boolean isVerified();
}
