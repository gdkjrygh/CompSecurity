// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            LabsMenuListActivity

public class this._cls0
{

    final LabsMenuListActivity this$0;

    public void onProductReplaced(com.dominos.bus.events.this._cls0 _pcls0)
    {
        showProductReplacedAlert(_pcls0.oductCode());
    }

    public void openCategory(com.dominos.bus.events.oductCode oductcode)
    {
        LabsMenuListActivity.access$200(LabsMenuListActivity.this);
    }

    public void openCouponList(com.dominos.bus.events.this._cls0 _pcls0)
    {
        goToCouponListActivity();
    }

    public ()
    {
        this$0 = LabsMenuListActivity.this;
        super();
    }
}
