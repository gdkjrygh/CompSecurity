// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package me.lyft.android.ui:
//            WarningView

class  extends BroadcastReceiver
{

    final WarningView this$0;

    public void onReceive(Context context, Intent intent)
    {
        updateWarningBanner();
    }

    ()
    {
        this$0 = WarningView.this;
        super();
    }
}
