// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import android.bluetooth.BluetoothAdapter;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.fordsync.service:
//            AppLinkManager_

class val.mBtAdapter extends c
{

    final AppLinkManager_ this$0;
    final BluetoothAdapter val$mBtAdapter;

    public void execute()
    {
        try
        {
            AppLinkManager_.access$101(AppLinkManager_.this, val$mBtAdapter);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (int i, String s1, BluetoothAdapter bluetoothadapter)
    {
        this$0 = final_applinkmanager_;
        val$mBtAdapter = bluetoothadapter;
        super(String.this, i, s1);
    }
}
