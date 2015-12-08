// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.addlive.impl:
//            ADLServiceImpl, ADLNativeWrapper

class <init> extends BroadcastReceiver
{

    final ADLServiceImpl this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.HEADSET_PLUG"))
        {
            ADLServiceImpl.access$200(ADLServiceImpl.this).updateAudioSettings();
        }
    }

    private _cls9()
    {
        this$0 = ADLServiceImpl.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
