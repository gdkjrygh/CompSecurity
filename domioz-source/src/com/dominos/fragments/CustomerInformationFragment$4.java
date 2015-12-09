// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;


// Referenced classes of package com.dominos.fragments:
//            CustomerInformationFragment

class llback extends com.dominos.utils.onCallback
{

    final CustomerInformationFragment this$0;
    final int val$addressIndex;

    public void onNegativeButtonClicked()
    {
    }

    public void onNeutralButtonClicked()
    {
    }

    public void onPositiveButtonClicked()
    {
        deleteAddress(val$addressIndex);
    }

    llback()
    {
        this$0 = final_customerinformationfragment;
        val$addressIndex = I.this;
        super();
    }
}
