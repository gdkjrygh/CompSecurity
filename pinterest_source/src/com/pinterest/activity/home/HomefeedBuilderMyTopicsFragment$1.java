// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;


// Referenced classes of package com.pinterest.activity.home:
//            HomefeedBuilderMyTopicsFragment

class this._cls0
    implements com.pinterest.base.agment._cls1
{

    final HomefeedBuilderMyTopicsFragment this$0;

    public void onEventMainThread(com.pinterest.activity.home.view.n.InterestFollowEvent interestfollowevent)
    {
        onHomefeedInterestButtonFollow(interestfollowevent.getInterest());
    }

    Button.InterestFollowEvent()
    {
        this$0 = HomefeedBuilderMyTopicsFragment.this;
        super();
    }
}
