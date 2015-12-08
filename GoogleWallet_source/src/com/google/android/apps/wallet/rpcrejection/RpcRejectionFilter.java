// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpcrejection;

import android.app.Activity;
import com.google.android.apps.wallet.filter.ActivityFilter;
import com.google.android.apps.wallet.rpc.ResponseMetadataProcessor;

// Referenced classes of package com.google.android.apps.wallet.rpcrejection:
//            RpcRejectionActivity

public class RpcRejectionFilter extends ActivityFilter
{

    private Activity activity;
    private final ResponseMetadataProcessor responseMetadataProcessor;

    RpcRejectionFilter(Activity activity1, ResponseMetadataProcessor responsemetadataprocessor)
    {
        activity = activity1;
        responseMetadataProcessor = responsemetadataprocessor;
    }

    private static com.google.android.apps.wallet.rpc.ResponseMetadataProcessor.RpcRejectionObserver createRpcRejectionObserver(final Activity activity)
    {
        return new com.google.android.apps.wallet.rpc.ResponseMetadataProcessor.RpcRejectionObserver() {

            final Activity val$activity;

            public final void onUpdate(com.google.wallet.proto.NanoWalletTransport.ResponseMetadata responsemetadata)
            {
                activity.startActivity(RpcRejectionActivity.createIntent(activity, responsemetadata));
            }

            
            {
                activity = activity1;
                super();
            }
        };
    }

    protected final void onPause()
    {
        responseMetadataProcessor.clearRpcRejectionObserver();
    }

    public final void onResume()
    {
        responseMetadataProcessor.registerRpcRejectionObserver(createRpcRejectionObserver(activity));
    }
}
