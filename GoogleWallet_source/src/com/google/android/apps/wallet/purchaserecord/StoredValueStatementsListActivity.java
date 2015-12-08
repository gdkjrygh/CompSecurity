// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.base.view.ViewHolder;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.download.FileDownloadAction;
import com.google.android.apps.wallet.widgets.list.ListItemBinder;
import com.google.android.apps.wallet.widgets.list.SimpleListAdapter;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordManager

public class StoredValueStatementsListActivity extends WalletActivity
{
    final class DownloadStatementCallback
        implements AsyncCallback
    {

        final StoredValueStatementsListActivity this$0;

        private void onSuccess(Uri uri)
        {
            downloadProgressDialog.dismiss();
            uri = UriIntents.create(StoredValueStatementsListActivity.this, uri, "application/pdf");
            if (getPackageManager().queryIntentActivities(uri, 0x10000).isEmpty())
            {
                analyticsUtil.sendError("NoPdfViewer", new AnalyticsCustomDimension[0]);
                AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.pdf_viewer_not_found_title).setMessage(com.google.android.apps.walletnfcrel.R.string.pdf_viewer_not_found_text).build().show(getSupportFragmentManager(), "download_statement");
                return;
            } else
            {
                analyticsUtil.sendSuccess("StoredValueStatement", new AnalyticsCustomDimension[0]);
                startActivity(uri);
                return;
            }
        }

        public final void onFailure(Exception exception)
        {
            WLog.e(StoredValueStatementsListActivity.TAG, "Could not download PDF", exception);
            analyticsUtil.sendError("StoredValueStatement", new AnalyticsCustomDimension[0]);
            downloadProgressDialog.dismiss();
            Toasts.show(StoredValueStatementsListActivity.this, com.google.android.apps.walletnfcrel.R.string.pdf_statement_download_error);
        }

        public final volatile void onSuccess(Object obj)
        {
            onSuccess((Uri)obj);
        }

        private DownloadStatementCallback()
        {
            this$0 = StoredValueStatementsListActivity.this;
            super();
        }

    }

    final class FetchStoredValueStatementsAction
        implements Callable
    {

        final StoredValueStatementsListActivity this$0;

        private List call()
            throws Exception
        {
            return purchaseRecordManager.getStoredValueTransactions();
        }

        public final volatile Object call()
            throws Exception
        {
            return call();
        }

        private FetchStoredValueStatementsAction()
        {
            this$0 = StoredValueStatementsListActivity.this;
            super();
        }

    }

    final class StatementLinkListItemBinder
        implements ListItemBinder
    {

        private final LayoutInflater inflater;
        final StoredValueStatementsListActivity this$0;

        private void bind(int i, ViewHolder viewholder, com.google.wallet.proto.api.NanoWalletStatement.StoredValueStatementsResponse.StatementLink statementlink)
        {
            viewholder = viewholder.getView();
            viewholder.setOnClickListener(statementlink. new android.view.View.OnClickListener() {

                final StatementLinkListItemBinder this$1;
                final com.google.wallet.proto.api.NanoWalletStatement.StoredValueStatementsResponse.StatementLink val$item;

                public final void onClick(View view)
                {
                    analyticsUtil.sendListItemTap("StoredValueStatement", new AnalyticsCustomDimension[0]);
                    if (!"mounted".equals(Environment.getExternalStorageState()))
                    {
                        analyticsUtil.sendError("StorageNotAccessible", new AnalyticsCustomDimension[0]);
                        String s = StoredValueStatementsListActivity.TAG;
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
                        downloadProgressDialog.setMessage(item.statementTitle);
                        downloadProgressDialog.setProgress(0);
                        downloadProgressDialog.show();
                        view = actionExecutor;
                        FileDownloadAction filedownloadaction = (FileDownloadAction)fileDownloadActionProvider.get();
                        String s1 = String.valueOf(item.statementTitle);
                        view.executeAction(filedownloadaction.setFileName((new StringBuilder(String.valueOf(s1).length() + 4)).append(s1).append(".pdf").toString()).setUri(item.statementLink).setAuthTokenType(cloudConfigurationManager.getCloudConfig().getWhiskyServiceName()).setProgressListener(new com.google.android.apps.wallet.util.download.FileDownloadAction.ProgressListener() {

                            final StatementLinkListItemBinder._cls2 this$2;

                            public final void onProgress(float f)
                            {
                                downloadProgressDialog.incrementProgressBy((int)(10000F * f));
                            }

            
            {
                this$2 = StatementLinkListItemBinder._cls2.this;
                super();
            }
                        }), new DownloadStatementCallback());
                        return;
                    }
                }

            
            {
                this$1 = final_statementlinklistitembinder;
                item = com.google.wallet.proto.api.NanoWalletStatement.StoredValueStatementsResponse.StatementLink.this;
                super();
            }
            });
            ((TextView)viewholder.findViewById(com.google.android.apps.walletnfcrel.R.id.StoreValueListItemTitle)).setText(statementlink.statementTitle);
        }

        private static boolean isEnabled(com.google.wallet.proto.api.NanoWalletStatement.StoredValueStatementsResponse.StatementLink statementlink)
        {
            return true;
        }

        public final volatile void bind(int i, ViewHolder viewholder, Object obj)
        {
            bind(i, viewholder, (com.google.wallet.proto.api.NanoWalletStatement.StoredValueStatementsResponse.StatementLink)obj);
        }

        public final ViewHolder createDisplay()
        {
            return inflater.inflate(com.google.android.apps.walletnfcrel.R.layout.stored_value_statement_list_item, null, false). new ViewHolder() {

                final StatementLinkListItemBinder this$1;
                final View val$rootView;

                public final View getView()
                {
                    return rootView;
                }

            
            {
                this$1 = final_statementlinklistitembinder;
                rootView = View.this;
                super();
            }
            };
        }

        public final volatile boolean isEnabled(Object obj)
        {
            return isEnabled((com.google.wallet.proto.api.NanoWalletStatement.StoredValueStatementsResponse.StatementLink)obj);
        }

        StatementLinkListItemBinder(LayoutInflater layoutinflater)
        {
            this$0 = StoredValueStatementsListActivity.this;
            super();
            inflater = layoutinflater;
        }
    }

    final class UpdateStoredValueStatementsCallback
        implements AsyncCallback
    {

        private final SimpleListAdapter listAdapter;
        final StoredValueStatementsListActivity this$0;

        private void onSuccess(List list)
        {
            listAdapter.setItems(list);
            fullScreenProgressSpinnerManager.hide();
        }

        public final void onFailure(Exception exception)
        {
            WLog.e(StoredValueStatementsListActivity.TAG, "Error fetching monthly statements", exception);
            fullScreenProgressSpinnerManager.hide();
            noStatementsView.setVisibility(8);
        }

        public final volatile void onSuccess(Object obj)
        {
            onSuccess((List)obj);
        }

        public UpdateStoredValueStatementsCallback(SimpleListAdapter simplelistadapter)
        {
            this$0 = StoredValueStatementsListActivity.this;
            super();
            listAdapter = simplelistadapter;
        }
    }


    private static final String TAG = com/google/android/apps/wallet/purchaserecord/StoredValueStatementsListActivity.getSimpleName();
    ActionExecutor actionExecutor;
    AnalyticsUtil analyticsUtil;
    AppControl appControl;
    CloudConfigurationManager cloudConfigurationManager;
    private ProgressDialog downloadProgressDialog;
    Provider fileDownloadActionProvider;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    private View noStatementsView;
    PurchaseRecordManager purchaseRecordManager;
    UriRegistry uriRegistry;

    public StoredValueStatementsListActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        downloadProgressDialog = new ProgressDialog(this);
        downloadProgressDialog.setTitle(com.google.android.apps.walletnfcrel.R.string.statement_download_dialog_title);
        downloadProgressDialog.setProgressStyle(1);
        downloadProgressDialog.setMax(10000);
        setTitle(com.google.android.apps.walletnfcrel.R.string.monthly_statements_list_title);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.stored_value_statement_list);
        bundle = new SimpleListAdapter(new StatementLinkListItemBinder(getLayoutInflater()));
        ListView listview = (ListView)findViewById(com.google.android.apps.walletnfcrel.R.id.StatementList);
        listview.setAdapter(bundle);
        noStatementsView = findViewById(com.google.android.apps.walletnfcrel.R.id.EmptyStatementList);
        listview.setEmptyView(noStatementsView);
        fullScreenProgressSpinnerManager.showImmediately();
        actionExecutor.executeAction(new FetchStoredValueStatementsAction(), new UpdateStoredValueStatementsCallback(bundle));
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if ("download_statement".equals(fragment.getTag()))
        {
            ((AlertDialogFragment)fragment).setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                final StoredValueStatementsListActivity this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    if (i == -1)
                    {
                        dialoginterface = UriIntents.create(StoredValueStatementsListActivity.this, appControl.getString(AppControlKey.PDF_VIEWER_URL));
                        startActivity(dialoginterface);
                    }
                }

            
            {
                this$0 = StoredValueStatementsListActivity.this;
                super();
            }
            });
        }
    }

    protected void onDestroy()
    {
        downloadProgressDialog.cancel();
        actionExecutor.cancelAll();
        super.onDestroy();
    }

    protected final void onUpPressed()
    {
        finish();
    }




}
