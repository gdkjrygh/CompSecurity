// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.app.ProgressDialog;
import android.os.Environment;
import android.view.View;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.download.FileDownloadAction;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            StoredValueStatementsListActivity

final class this._cls2
    implements com.google.android.apps.wallet.util.download.
{

    final ._cls0 this$2;

    public final void onProgress(float f)
    {
        StoredValueStatementsListActivity.access$200(_fld0).incrementProgressBy((int)(10000F * f));
    }

    l.item()
    {
        this$2 = this._cls2.this;
        super();
    }

    // Unreferenced inner class com/google/android/apps/wallet/purchaserecord/StoredValueStatementsListActivity$StatementLinkListItemBinder$2

/* anonymous class */
    final class StoredValueStatementsListActivity.StatementLinkListItemBinder._cls2
        implements android.view.View.OnClickListener
    {

        final StoredValueStatementsListActivity.StatementLinkListItemBinder this$1;
        final com.google.wallet.proto.api.NanoWalletStatement.StoredValueStatementsResponse.StatementLink val$item;

        public final void onClick(View view)
        {
            analyticsUtil.sendListItemTap("StoredValueStatement", new AnalyticsCustomDimension[0]);
            if (!"mounted".equals(Environment.getExternalStorageState()))
            {
                analyticsUtil.sendError("StorageNotAccessible", new AnalyticsCustomDimension[0]);
                String s = StoredValueStatementsListActivity.access$100();
                view = String.valueOf(Environment.getExternalStorageState());
                if (view.length() != 0)
                {
                    view = "Unable to access External Storage directory: State: ".concat(view);
                } else
                {
                    view = new String("Unable to access External Storage directory: State: ");
                }
                WLog.e(s, view);
                AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.device_storage_unavailable_title).setMessage(com.google.android.apps.walletnfcrel.R.string.device_storage_unavailable_content).setCancelable(false).build().show(getSupportFragmentManager());
                return;
            } else
            {
                StoredValueStatementsListActivity.access$200(this$0).setMessage(item.statementTitle);
                StoredValueStatementsListActivity.access$200(this$0).setProgress(0);
                StoredValueStatementsListActivity.access$200(this$0).show();
                view = actionExecutor;
                FileDownloadAction filedownloadaction = (FileDownloadAction)fileDownloadActionProvider.get();
                String s1 = String.valueOf(item.statementTitle);
                view.executeAction(filedownloadaction.setFileName((new StringBuilder(String.valueOf(s1).length() + 4)).append(s1).append(".pdf").toString()).setUri(item.statementLink).setAuthTokenType(cloudConfigurationManager.getCloudConfig().getWhiskyServiceName()).setProgressListener(new StoredValueStatementsListActivity.StatementLinkListItemBinder._cls2._cls1()), new StoredValueStatementsListActivity.DownloadStatementCallback(this$0, null));
                return;
            }
        }

            
            {
                this$1 = final_statementlinklistitembinder;
                item = com.google.wallet.proto.api.NanoWalletStatement.StoredValueStatementsResponse.StatementLink.this;
                super();
            }
    }

}
