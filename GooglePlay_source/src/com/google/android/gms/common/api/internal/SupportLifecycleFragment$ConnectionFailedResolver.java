// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            SupportLifecycleFragment, GooglePlayServicesUpdatedReceiver

private final class mResult
    implements Runnable
{

    private final int mClientId;
    private final ConnectionResult mResult;
    final SupportLifecycleFragment this$0;

    public final void run()
    {
        if (!SupportLifecycleFragment.access$000(SupportLifecycleFragment.this) || SupportLifecycleFragment.access$100(SupportLifecycleFragment.this))
        {
            return;
        }
        boolean _tmp = SupportLifecycleFragment.access$102$1b695bc6(SupportLifecycleFragment.this);
        SupportLifecycleFragment.access$202(SupportLifecycleFragment.this, mClientId);
        SupportLifecycleFragment.access$302(SupportLifecycleFragment.this, mResult);
        if (mResult.hasResolution())
        {
            try
            {
                int i = mActivity.mFragments.getFragments().indexOf(SupportLifecycleFragment.this);
                mResult.startResolutionForResult(mActivity, (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.t t)
            {
                SupportLifecycleFragment.access$400(SupportLifecycleFragment.this);
            }
            return;
        }
        SupportLifecycleFragment.access$500();
        if (GoogleApiAvailability.isUserResolvableError(mResult.mStatusCode))
        {
            GooglePlayServicesUtil.showErrorDialogFragment(mResult.mStatusCode, mActivity, SupportLifecycleFragment.this, 2, SupportLifecycleFragment.this);
            return;
        }
        if (mResult.mStatusCode == 18)
        {
            SupportLifecycleFragment.access$500();
            final Dialog updatingDialog = GoogleApiAvailability.showUpdatingDialog(mActivity, SupportLifecycleFragment.this);
            SupportLifecycleFragment.access$602(SupportLifecycleFragment.this, GooglePlayServicesUpdatedReceiver.register(mActivity.getApplicationContext(), new GooglePlayServicesUpdatedReceiver() {

                final SupportLifecycleFragment.ConnectionFailedResolver this$1;
                final Dialog val$updatingDialog;

                protected final void onUpdated()
                {
                    SupportLifecycleFragment.access$400(this$0);
                    updatingDialog.dismiss();
                }

            
            {
                this$1 = SupportLifecycleFragment.ConnectionFailedResolver.this;
                updatingDialog = dialog;
                super();
            }
            }));
            return;
        } else
        {
            SupportLifecycleFragment.access$700(SupportLifecycleFragment.this, mClientId, mResult);
            return;
        }
    }

    public _cls1.val.updatingDialog(int i, ConnectionResult connectionresult)
    {
        this$0 = SupportLifecycleFragment.this;
        super();
        mClientId = i;
        mResult = connectionresult;
    }
}
