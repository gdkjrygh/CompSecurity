// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            AddCreditCardActivity

class lback extends com.dominos.utils.onCallback
{

    final AddCreditCardActivity this$0;

    public void onAlertDismissed()
    {
        finish();
    }

    lback()
    {
        this$0 = AddCreditCardActivity.this;
        super();
    }
}
