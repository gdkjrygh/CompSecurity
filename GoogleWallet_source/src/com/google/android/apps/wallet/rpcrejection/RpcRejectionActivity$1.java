// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpcrejection;

import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.ResponseMetadataProcessor;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Optional;

// Referenced classes of package com.google.android.apps.wallet.rpcrejection:
//            RpcRejectionActivity

final class this._cls0
    implements AsyncCallback
{

    final RpcRejectionActivity this$0;

    private void onSuccess(Void void1)
    {
        fullScreenProgressSpinnerManager.hide();
        startActivity(uriRegistry.createIntent(2, new Object[0]));
        WLog.i(RpcRejectionActivity.access$000(), "Downloaded new UserInfo for latest TOS");
        mResponseMetadataProcessor.onMetadataProcessed();
        RpcRejectionActivity.access$102(RpcRejectionActivity.this, Optional.absent());
        finish();
    }

    public final void onFailure(Exception exception)
    {
        WLog.i(RpcRejectionActivity.access$000(), "Downloaded of UserInfo for latest TOS failed.", exception);
        fullScreenProgressSpinnerManager.hide();
        CallErrorDialogs.createBuilder(exception, com.google.android.apps.walletnfcrel.tos_download_failed_title, com.google.android.apps.walletnfcrel.tos_download_failed_content).build().show(getSupportFragmentManager());
        mResponseMetadataProcessor.onMetadataProcessed();
        RpcRejectionActivity.access$102(RpcRejectionActivity.this, Optional.absent());
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((Void)obj);
    }

    Builder()
    {
        this$0 = RpcRejectionActivity.this;
        super();
    }
}
