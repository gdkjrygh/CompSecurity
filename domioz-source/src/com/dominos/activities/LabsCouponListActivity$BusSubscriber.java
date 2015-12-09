// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            LabsCouponListActivity

class <init>
{

    final LabsCouponListActivity this$0;

    public void couponSelected(com.dominos.bus.events.<init> <init>1)
    {
        int i = <init>1.etSelectedIndex();
        onVoiceClick(i);
    }

    public void onCouponSelectedFromGlobal(com.dominos.bus.events.omGlobal omglobal)
    {
        omglobal = omglobal.getCoupon();
        selectCoupon(omglobal);
    }

    private omGlobal()
    {
        this$0 = LabsCouponListActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
