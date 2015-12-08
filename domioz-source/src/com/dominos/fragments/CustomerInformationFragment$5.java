// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;


// Referenced classes of package com.dominos.fragments:
//            CustomerInformationFragment

class .DeleteAddressCallback extends com.dominos.android.sdk.core.user.ssCallback
{

    final CustomerInformationFragment this$0;

    public void onAddressDeleteFailure()
    {
        showShortToast(getString(0x7f080118));
    }

    public void onAddressDeleted()
    {
        updateAddressViews();
        showShortToast(getString(0x7f080192));
    }

    public void onBegin()
    {
        super.onBegin();
        showLoading();
    }

    public void onFinish()
    {
        super.onFinish();
        hideLoading();
    }

    .DeleteAddressCallback()
    {
        this$0 = CustomerInformationFragment.this;
        super();
    }
}
