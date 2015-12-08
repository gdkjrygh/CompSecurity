// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dominos.android.sdk.common.StringHelper;

// Referenced classes of package com.dominos.fordsync:
//            FordSyncActivity

class <init> extends BroadcastReceiver
{

    final FordSyncActivity this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null && StringHelper.equals(intent.getAction(), "intent.action.FORDSYNC_DISCONNECT"))
        {
            FordSyncActivity.access$100(FordSyncActivity.this);
        }
    }

    private A()
    {
        this$0 = FordSyncActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
