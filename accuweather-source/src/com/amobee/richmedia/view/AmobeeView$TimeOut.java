// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import com.amobee.adsdk.Log;
import java.util.TimerTask;

// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeView

class mCount extends TimerTask
{

    int mCount;
    int mProgress;
    final AmobeeView this$0;

    public void run()
    {
        int i = getProgress();
        if (i != 100) goto _L2; else goto _L1
_L1:
        cancel();
_L4:
        mProgress = i;
        return;
_L2:
        if (mProgress == i)
        {
            mCount = mCount + 1;
            if (mCount == 3)
            {
                try
                {
                    stopLoading();
                }
                catch (Exception exception)
                {
                    Log.w("OrmmaView", "error in stopLoading");
                }
                cancel();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = AmobeeView.this;
        super();
        mProgress = 0;
        mCount = 0;
    }
}
