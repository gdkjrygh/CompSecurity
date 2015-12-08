// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.views.TrackerTopBarView;

// Referenced classes of package com.dominos.activities:
//            TrackerActivity

class this._cls0
    implements com.dominos.loader.SetupLoadCallback
{

    final TrackerActivity this$0;

    public void onSetupFailure(int i, String s)
    {
    }

    public void onSetupSuccess()
    {
        mTopBarView.setHomeButtonVisible(true);
    }

    pLoadCallback()
    {
        this$0 = TrackerActivity.this;
        super();
    }
}
