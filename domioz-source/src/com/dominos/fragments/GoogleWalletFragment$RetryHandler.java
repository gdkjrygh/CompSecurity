// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.api.l;

// Referenced classes of package com.dominos.fragments:
//            GoogleWalletFragment

class <init> extends Handler
{

    final GoogleWalletFragment this$0;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 18 18: default 24
    //                   18 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (mGoogleApiClient != null && !mGoogleApiClient.g())
        {
            mLoadingWallet = true;
            mGoogleApiClient.c();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private ()
    {
        this$0 = GoogleWalletFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
