// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpcrejection;

import android.content.DialogInterface;
import com.google.android.apps.wallet.rpc.ResponseMetadataProcessor;

// Referenced classes of package com.google.android.apps.wallet.rpcrejection:
//            RpcRejectionActivity

final class this._cls0
    implements android.content.Listener
{

    final RpcRejectionActivity this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        mResponseMetadataProcessor.onMetadataProcessed();
        finish();
    }

    ()
    {
        this$0 = RpcRejectionActivity.this;
        super();
    }
}
