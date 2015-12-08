// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.settings.model;


// Referenced classes of package com.jcp.settings.model:
//            TestingExperience

public class TestingExperiences
{

    private TestingExperience androidCheckout;
    private TestingExperience browse;
    private TestingExperience checkout;

    public TestingExperiences()
    {
    }

    public TestingExperience getAndroidCheckout()
    {
        return androidCheckout;
    }

    public TestingExperience getBrowse()
    {
        return browse;
    }

    public TestingExperience getCheckout()
    {
        return checkout;
    }

    public void setAndroidCheckout(TestingExperience testingexperience)
    {
        androidCheckout = testingexperience;
    }

    public void setBrowse(TestingExperience testingexperience)
    {
        browse = testingexperience;
    }

    public void setCheckout(TestingExperience testingexperience)
    {
        checkout = testingexperience;
    }
}
