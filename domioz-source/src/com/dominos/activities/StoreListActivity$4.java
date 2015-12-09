// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            StoreListActivity

class tActionCallback extends com.dominos.utils.nAlertActionCallback
{

    final StoreListActivity this$0;

    public void onNegativeButtonClicked()
    {
    }

    public void onNeutralButtonClicked()
    {
    }

    public void onPositiveButtonClicked()
    {
        StoreListActivity.access$200(StoreListActivity.this);
    }

    tActionCallback()
    {
        this$0 = StoreListActivity.this;
        super();
    }
}
