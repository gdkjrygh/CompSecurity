// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.containers;

import java.io.Serializable;

public class KohlsCash
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String balance;
    private int barcodeStatus;
    private String effectiveEndDate;
    private String effectiveStartDate;
    private String kohlsCashNumber;

    public KohlsCash()
    {
    }

    public String getBalance()
    {
        return balance;
    }

    public int getBarcodeStatus()
    {
        return barcodeStatus;
    }

    public String getEffectiveEndDate()
    {
        return effectiveEndDate;
    }

    public String getEffectiveStartDate()
    {
        return effectiveStartDate;
    }

    public String getKohlsCashNumber()
    {
        return kohlsCashNumber;
    }

    public void setBalance(String s)
    {
        balance = s;
    }

    public void setBarcodeStatus(int i)
    {
        barcodeStatus = i;
    }

    public void setEffectiveEndDate(String s)
    {
        effectiveEndDate = s;
    }

    public void setEffectiveStartDate(String s)
    {
        effectiveStartDate = s;
    }

    public void setKohlsCashNumber(String s)
    {
        kohlsCashNumber = s;
    }
}
