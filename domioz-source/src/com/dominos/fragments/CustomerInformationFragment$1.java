// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;


// Referenced classes of package com.dominos.fragments:
//            CustomerInformationFragment

class this._cls0
    implements com.dominos.views.w.CustomerPersonalInformationClickListener
{

    final CustomerInformationFragment this$0;

    public void onPersonalInformationClicked()
    {
        if (CustomerInformationFragment.access$000(CustomerInformationFragment.this) != null)
        {
            CustomerInformationFragment.access$000(CustomerInformationFragment.this).onCustomerInfoModificationRequested();
        }
    }

    public void onPersonalInformationFooterClicked()
    {
    }

    stomerInformationFragmentListener()
    {
        this$0 = CustomerInformationFragment.this;
        super();
    }
}
