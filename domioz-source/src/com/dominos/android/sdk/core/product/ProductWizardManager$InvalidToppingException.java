// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.product;


// Referenced classes of package com.dominos.android.sdk.core.product:
//            ProductWizardManager

public class quantityCode extends Exception
{

    private String quantityCode;
    final ProductWizardManager this$0;

    public String getQuantityCode()
    {
        return quantityCode;
    }

    public (String s)
    {
        this$0 = ProductWizardManager.this;
        super();
        quantityCode = s;
    }
}
