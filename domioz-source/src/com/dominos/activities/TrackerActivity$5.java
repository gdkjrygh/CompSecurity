// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            TrackerActivity

class ertActionCallback extends com.dominos.utils.ionAlertActionCallback
{

    final TrackerActivity this$0;

    public void onNegativeButtonClicked()
    {
    }

    public void onNeutralButtonClicked()
    {
    }

    public void onPositiveButtonClicked()
    {
        TrackerActivity.access$400(TrackerActivity.this, mOrderStatus);
        showLongToast(getString(0x7f080327));
    }

    ertActionCallback()
    {
        this$0 = TrackerActivity.this;
        super();
    }
}
