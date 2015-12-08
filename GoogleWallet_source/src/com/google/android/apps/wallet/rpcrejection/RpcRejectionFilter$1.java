// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpcrejection;

import android.app.Activity;

// Referenced classes of package com.google.android.apps.wallet.rpcrejection:
//            RpcRejectionFilter, RpcRejectionActivity

final class val.activity
    implements com.google.android.apps.wallet.rpc.ssor.RpcRejectionObserver
{

    final Activity val$activity;

    public final void onUpdate(com.google.wallet.proto.esponseMetadata esponsemetadata)
    {
        val$activity.startActivity(RpcRejectionActivity.createIntent(val$activity, esponsemetadata));
    }

    ejectionObserver()
    {
        val$activity = activity1;
        super();
    }
}
