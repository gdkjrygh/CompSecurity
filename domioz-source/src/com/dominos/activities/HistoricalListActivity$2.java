// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            HistoricalListActivity

class back extends com.dominos.utils.nCallback
{

    final HistoricalListActivity this$0;

    public void onAlertDismissed()
    {
        finish();
    }

    back()
    {
        this$0 = HistoricalListActivity.this;
        super();
    }
}
