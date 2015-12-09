// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.app.ProgressDialog;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            StoredValueStatementsListActivity

final class <init>
    implements AsyncCallback
{

    final StoredValueStatementsListActivity this$0;

    private void onSuccess(Uri uri)
    {
        StoredValueStatementsListActivity.access$200(StoredValueStatementsListActivity.this).dismiss();
        uri = UriIntents.create(StoredValueStatementsListActivity.this, uri, "application/pdf");
        if (getPackageManager().queryIntentActivities(uri, 0x10000).isEmpty())
        {
            analyticsUtil.sendError("NoPdfViewer", new AnalyticsCustomDimension[0]);
            AlertDialogFragment.newBuilder()._mth0(com.google.android.apps.walletnfcrel.)._mth0(com.google.android.apps.walletnfcrel.)._mth0().show(getSupportFragmentManager(), "download_statement");
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
        WLog.e(StoredValueStatementsListActivity.access$100(), "Could not download PDF", exception);
        analyticsUtil.sendError("StoredValueStatement", new AnalyticsCustomDimension[0]);
        StoredValueStatementsListActivity.access$200(StoredValueStatementsListActivity.this).dismiss();
        Toasts.show(StoredValueStatementsListActivity.this, com.google.android.apps.walletnfcrel.Callback.this._fld0);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((Uri)obj);
    }

    private ()
    {
        this$0 = StoredValueStatementsListActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
