// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin;


// Referenced classes of package com.braintreepayments.api.dropin:
//            Customization

public class mCustomization
{

    private Customization mCustomization;

    public mCustomization actionBarLogo(int i)
    {
        mCustomization.setActionBarLogo(i);
        return this;
    }

    public mCustomization actionBarTitle(String s)
    {
        mCustomization.setActionBarTitle(s);
        return this;
    }

    public mCustomization amount(String s)
    {
        mCustomization.setAmount(s);
        return this;
    }

    public Customization build()
    {
        return mCustomization;
    }

    public mCustomization primaryDescription(String s)
    {
        mCustomization.setPrimaryDescription(s);
        return this;
    }

    public  secondaryDescription(String s)
    {
        mCustomization.setSecondaryDescription(s);
        return this;
    }

    public on submitButtonText(String s)
    {
        mCustomization.setSubmitButtonText(s);
        return this;
    }

    public I()
    {
        mCustomization = new Customization();
    }
}
