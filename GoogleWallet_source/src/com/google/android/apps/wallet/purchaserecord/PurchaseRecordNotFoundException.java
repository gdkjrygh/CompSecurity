// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;


public final class PurchaseRecordNotFoundException extends Exception
{

    public PurchaseRecordNotFoundException()
    {
        super("Could not find purchase record with given id");
    }
}
