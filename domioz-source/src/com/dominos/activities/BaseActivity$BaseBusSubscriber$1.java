// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.activities:
//            BaseActivity

class this._cls1
    implements Runnable
{

    final lity this$1;

    public void run()
    {
        setNinaPaddingVisibility(0);
        mAnalyticsUtil.postTrackVoiceActive();
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
