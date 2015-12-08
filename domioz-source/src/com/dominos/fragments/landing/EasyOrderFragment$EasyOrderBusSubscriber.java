// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.landing;


// Referenced classes of package com.dominos.fragments.landing:
//            EasyOrderFragment

class <init>
{

    final EasyOrderFragment this$0;

    public void onReorderEasyOrder(com.dominos.bus.events.criber criber)
    {
        orderEasyOrder();
    }

    public void onShowEasyOrder(com.dominos.bus.events.criber criber)
    {
        showEasyOrderDetails();
    }

    private ()
    {
        this$0 = EasyOrderFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
