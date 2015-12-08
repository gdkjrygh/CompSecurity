// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            LabsRootMenuListActivity

class <init>
{

    final LabsRootMenuListActivity this$0;

    public void onProductReplaced(com.dominos.bus.events.<init> <init>1)
    {
        showProductReplacedAlert(<init>1.tCode());
    }

    public void openCoupons(com.dominos.bus.events.tCode tcode)
    {
        goToCouponActivity();
    }

    private ()
    {
        this$0 = LabsRootMenuListActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
