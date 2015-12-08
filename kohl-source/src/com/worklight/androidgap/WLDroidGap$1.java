// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap;

import com.worklight.androidgap.api.WLInitWebFrameworkListener;
import com.worklight.androidgap.api.WLInitWebFrameworkResult;

// Referenced classes of package com.worklight.androidgap:
//            WLDroidGap

class this._cls0
    implements WLInitWebFrameworkListener
{

    final WLDroidGap this$0;

    public void onInitWebFrameworkComplete(WLInitWebFrameworkResult wlinitwebframeworkresult)
    {
        WLDroidGap.access$000(WLDroidGap.this, wlinitwebframeworkresult);
    }

    FrameworkResult()
    {
        this$0 = WLDroidGap.this;
        super();
    }
}
