// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.common.base.Throwables;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            TryAgainDialogFragment

abstract class CloudPinCallback
    implements AsyncCallback
{

    private final FragmentActivity activity;
    private final String dialogFragmentTag;

    CloudPinCallback(FragmentActivity fragmentactivity, String s)
    {
        activity = fragmentactivity;
        dialogFragmentTag = s;
    }

    public void onFailure(Exception exception)
    {
        WLog.e(activity.getClass().getSimpleName(), "Error during Cloud PIN RPC", exception);
        if (exception instanceof RpcException)
        {
            (new TryAgainDialogFragment()).show(activity.getSupportFragmentManager(), dialogFragmentTag);
            return;
        } else
        {
            Throwables.propagate(exception);
            return;
        }
    }
}
