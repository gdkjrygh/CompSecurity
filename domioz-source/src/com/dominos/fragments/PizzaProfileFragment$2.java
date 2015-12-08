// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;


// Referenced classes of package com.dominos.fragments:
//            PizzaProfileFragment

class this._cls0
    implements com.dominos.views.tionView.CustomerPersonalInformationClickListener
{

    final PizzaProfileFragment this$0;

    public void onPersonalInformationClicked()
    {
    }

    public void onPersonalInformationFooterClicked()
    {
        if (PizzaProfileFragment.access$000(PizzaProfileFragment.this) != null)
        {
            PizzaProfileFragment.access$000(PizzaProfileFragment.this).onCustomerInformationRequested();
        }
    }

    zzaProfileFragmentListener()
    {
        this$0 = PizzaProfileFragment.this;
        super();
    }
}
