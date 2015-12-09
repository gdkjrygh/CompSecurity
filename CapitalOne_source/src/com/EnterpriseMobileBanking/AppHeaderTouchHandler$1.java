// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;


// Referenced classes of package com.EnterpriseMobileBanking:
//            AppHeaderTouchHandler, AppHelper

class val.lastState
    implements Runnable
{

    final AppHeaderTouchHandler this$0;
    final boolean val$lastState;

    public void run()
    {
        AppHelper.setNavigationEnabled(val$lastState);
    }

    _cls9()
    {
        this$0 = final_appheadertouchhandler;
        val$lastState = Z.this;
        super();
    }
}
