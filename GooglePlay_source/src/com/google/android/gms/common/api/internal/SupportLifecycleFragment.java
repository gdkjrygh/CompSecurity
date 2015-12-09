// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GooglePlayServicesUpdatedReceiver

public final class SupportLifecycleFragment extends Fragment
    implements android.content.DialogInterface.OnCancelListener
{
    private final class ClientInfo
        implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        public final GoogleApiClient apiClient;
        public final int clientId;
        public final com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener connectionFailedWithoutFixListener = null;
        final SupportLifecycleFragment this$0;

        public final void onConnectionFailed(ConnectionResult connectionresult)
        {
            mConnectionFailedHandler.post(new ConnectionFailedResolver(clientId, connectionresult));
        }

        public ClientInfo(int i, GoogleApiClient googleapiclient, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            this$0 = SupportLifecycleFragment.this;
            super();
            clientId = i;
            apiClient = googleapiclient;
            googleapiclient.registerConnectionFailedListener(this);
        }
    }

    private final class ConnectionFailedResolver
        implements Runnable
    {

        private final int mClientId;
        private final ConnectionResult mResult;
        final SupportLifecycleFragment this$0;

        public final void run()
        {
            if (!mStarted || mResolvingError)
            {
                return;
            }
            mResolvingError;
            mFailingClientId = mClientId;
            mFailingResult = mResult;
            if (mResult.hasResolution())
            {
                try
                {
                    int i = mActivity.mFragments.getFragments().indexOf(SupportLifecycleFragment.this);
                    mResult.startResolutionForResult(mActivity, (i + 1 << 16) + 1);
                    return;
                }
                catch (android.content.IntentSender.SendIntentException sendintentexception)
                {
                    markErrorsResolved();
                }
                return;
            }
            GoogleApiAvailability _tmp = SupportLifecycleFragment.sApiAvailability;
            if (GoogleApiAvailability.isUserResolvableError(mResult.mStatusCode))
            {
                GooglePlayServicesUtil.showErrorDialogFragment(mResult.mStatusCode, mActivity, SupportLifecycleFragment.this, 2, SupportLifecycleFragment.this);
                return;
            }
            if (mResult.mStatusCode == 18)
            {
                GoogleApiAvailability _tmp1 = SupportLifecycleFragment.sApiAvailability;
                Dialog dialog = GoogleApiAvailability.showUpdatingDialog(mActivity, SupportLifecycleFragment.this);
                mGmsUpdatedReceiver = GooglePlayServicesUpdatedReceiver.register(mActivity.getApplicationContext(), dialog. new GooglePlayServicesUpdatedReceiver() {

                    final ConnectionFailedResolver this$1;
                    final Dialog val$updatingDialog;

                    protected final void onUpdated()
                    {
                        markErrorsResolved();
                        updatingDialog.dismiss();
                    }

            
            {
                this$1 = final_connectionfailedresolver;
                updatingDialog = Dialog.this;
                super();
            }
                });
                return;
            } else
            {
                dispatchConnectionFailed(mClientId, mResult);
                return;
            }
        }

        public ConnectionFailedResolver(int i, ConnectionResult connectionresult)
        {
            this$0 = SupportLifecycleFragment.this;
            super();
            mClientId = i;
            mResult = connectionresult;
        }
    }


    private static final GoogleApiAvailability sApiAvailability = GoogleApiAvailability.getInstance();
    public final SparseArray mClientInfoMap = new SparseArray();
    private final Handler mConnectionFailedHandler = new Handler(Looper.getMainLooper());
    private int mFailingClientId;
    private ConnectionResult mFailingResult;
    private GooglePlayServicesUpdatedReceiver mGmsUpdatedReceiver;
    public boolean mResolvingError;
    public boolean mStarted;

    public SupportLifecycleFragment()
    {
        mFailingClientId = -1;
    }

    private void dispatchConnectionFailed(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLifecycleFrag", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (ClientInfo)mClientInfoMap.get(i);
        if (obj != null)
        {
            ClientInfo clientinfo = (ClientInfo)mClientInfoMap.get(i);
            mClientInfoMap.remove(i);
            if (clientinfo != null)
            {
                clientinfo.apiClient.unregisterConnectionFailedListener(clientinfo);
                clientinfo.apiClient.disconnect();
            }
            obj = ((ClientInfo) (obj)).connectionFailedWithoutFixListener;
            if (obj != null)
            {
                ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
            }
        }
        markErrorsResolved();
    }

    public static SupportLifecycleFragment getInstance(FragmentActivity fragmentactivity)
    {
        getInstanceOrNull(null);
        throw new NullPointerException();
    }

    public static SupportLifecycleFragment getInstanceOrNull(FragmentActivity fragmentactivity)
    {
label0:
        {
            if (Looper.myLooper() != Looper.getMainLooper())
            {
                throw new IllegalStateException("Must be called from main thread of process");
            }
            fragmentactivity = fragmentactivity.mFragments;
            SupportLifecycleFragment supportlifecyclefragment;
            try
            {
                supportlifecyclefragment = (SupportLifecycleFragment)fragmentactivity.findFragmentByTag("GmsSupportLifecycleFrag");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFrag is not a SupportLifecycleFragment", fragmentactivity);
            }
            if (supportlifecyclefragment != null)
            {
                fragmentactivity = supportlifecyclefragment;
                if (!((Fragment) (supportlifecyclefragment)).mRemoving)
                {
                    break label0;
                }
            }
            fragmentactivity = null;
        }
        return fragmentactivity;
    }

    private void markErrorsResolved()
    {
        mResolvingError = false;
        mFailingClientId = -1;
        mFailingResult = null;
        if (mGmsUpdatedReceiver != null)
        {
            mGmsUpdatedReceiver.unregister();
            mGmsUpdatedReceiver = null;
        }
        for (int i = 0; i < mClientInfoMap.size(); i++)
        {
            ((ClientInfo)mClientInfoMap.valueAt(i)).apiClient.connect();
        }

    }

    public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.dump(s, filedescriptor, printwriter, as);
        for (int i = 0; i < mClientInfoMap.size(); i++)
        {
            ClientInfo clientinfo = (ClientInfo)mClientInfoMap.valueAt(i);
            printwriter.append(s).append("GoogleApiClient #").print(clientinfo.clientId);
            printwriter.println(":");
            clientinfo.apiClient.dump((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
        }

    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        boolean flag = false;
        i;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 58
    //                   2 40;
           goto _L1 _L2 _L3
_L2:
        break MISSING_BLOCK_LABEL_58;
_L1:
        i = ((flag) ? 1 : 0);
_L4:
        if (i != 0)
        {
            markErrorsResolved();
            return;
        } else
        {
            dispatchConnectionFailed(mFailingClientId, mFailingResult);
            return;
        }
_L3:
        i = ((flag) ? 1 : 0);
        if (GoogleApiAvailability.isGooglePlayServicesAvailable(super.mActivity) == 0)
        {
            i = 1;
        }
          goto _L4
        if (j == -1)
        {
            i = 1;
        } else
        {
            i = ((flag) ? 1 : 0);
            if (j == 0)
            {
                mFailingResult = new ConnectionResult(13, null);
                i = ((flag) ? 1 : 0);
            }
        }
          goto _L4
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        dispatchConnectionFailed(mFailingClientId, new ConnectionResult(13, null));
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            mResolvingError = bundle.getBoolean("resolving_error", false);
            mFailingClientId = bundle.getInt("failed_client_id", -1);
            if (mFailingClientId >= 0)
            {
                mFailingResult = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", mResolvingError);
        if (mFailingClientId >= 0)
        {
            bundle.putInt("failed_client_id", mFailingClientId);
            bundle.putInt("failed_status", mFailingResult.mStatusCode);
            bundle.putParcelable("failed_resolution", mFailingResult.mPendingIntent);
        }
    }

    public final void onStart()
    {
        super.onStart();
        mStarted = true;
        if (!mResolvingError)
        {
            for (int i = 0; i < mClientInfoMap.size(); i++)
            {
                ((ClientInfo)mClientInfoMap.valueAt(i)).apiClient.connect();
            }

        }
    }

    public final void onStop()
    {
        super.onStop();
        mStarted = false;
        for (int i = 0; i < mClientInfoMap.size(); i++)
        {
            ((ClientInfo)mClientInfoMap.valueAt(i)).apiClient.disconnect();
        }

    }





/*
    static boolean access$102$1b695bc6(SupportLifecycleFragment supportlifecyclefragment)
    {
        supportlifecyclefragment.mResolvingError = true;
        return true;
    }

*/


/*
    static int access$202(SupportLifecycleFragment supportlifecyclefragment, int i)
    {
        supportlifecyclefragment.mFailingClientId = i;
        return i;
    }

*/


/*
    static ConnectionResult access$302(SupportLifecycleFragment supportlifecyclefragment, ConnectionResult connectionresult)
    {
        supportlifecyclefragment.mFailingResult = connectionresult;
        return connectionresult;
    }

*/




/*
    static GooglePlayServicesUpdatedReceiver access$602(SupportLifecycleFragment supportlifecyclefragment, GooglePlayServicesUpdatedReceiver googleplayservicesupdatedreceiver)
    {
        supportlifecyclefragment.mGmsUpdatedReceiver = googleplayservicesupdatedreceiver;
        return googleplayservicesupdatedreceiver;
    }

*/


}
