// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.IInterface;

public interface lr
    extends IInterface
{

    public abstract void finishPurchase();

    public abstract String getProductId();

    public abstract Intent getPurchaseData();

    public abstract int getResultCode();

    public abstract boolean isVerified();
}
