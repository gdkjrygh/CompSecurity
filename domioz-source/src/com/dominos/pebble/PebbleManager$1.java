// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dominos.android.sdk.common.LogUtil;

// Referenced classes of package com.dominos.pebble:
//            PebbleManager

class init> extends BroadcastReceiver
{

    final PebbleManager this$0;

    public void onReceive(Context context, Intent intent)
    {
        LogUtil.d("PebbleController", "Pebble connected!", new Object[0]);
    }

    til()
    {
        this$0 = PebbleManager.this;
        super();
    }
}
