// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            CartActivity

class ActionCallback extends com.dominos.utils.AlertActionCallback
{

    final CartActivity this$0;

    public void onAlertDismissed()
    {
        CartActivity.access$300(CartActivity.this);
    }

    ActionCallback()
    {
        this$0 = CartActivity.this;
        super();
    }
}
