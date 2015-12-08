// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin;

import java.io.Serializable;

public class Customization
    implements Serializable
{

    private int mActionBarLogo;
    private String mActionBarTitle;
    private String mAmount;
    private String mPrimaryDescription;
    private String mSecondaryDescription;
    private String mSubmitButtonText;

    public Customization()
    {
    }

    protected int getActionBarLogo()
    {
        return mActionBarLogo;
    }

    protected String getActionBarTitle()
    {
        return mActionBarTitle;
    }

    protected String getAmount()
    {
        return mAmount;
    }

    protected String getPrimaryDescription()
    {
        return mPrimaryDescription;
    }

    protected String getSecondaryDescription()
    {
        return mSecondaryDescription;
    }

    protected String getSubmitButtonText()
    {
        return mSubmitButtonText;
    }

    protected void setActionBarLogo(int i)
    {
        mActionBarLogo = i;
    }

    protected void setActionBarTitle(String s)
    {
        mActionBarTitle = s;
    }

    protected void setAmount(String s)
    {
        mAmount = s;
    }

    protected void setPrimaryDescription(String s)
    {
        mPrimaryDescription = s;
    }

    protected void setSecondaryDescription(String s)
    {
        mSecondaryDescription = s;
    }

    protected void setSubmitButtonText(String s)
    {
        mSubmitButtonText = s;
    }
}
