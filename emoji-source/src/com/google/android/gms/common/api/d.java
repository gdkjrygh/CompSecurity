// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public class d extends Fragment
    implements android.content.DialogInterface.OnCancelListener, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{

    private GoogleApiClient.OnConnectionFailedListener DN;
    private GoogleApiClient Et;
    private ConnectionResult Eu;
    private boolean Ev;

    public d()
    {
    }

    public void a(GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        Et = googleapiclient;
        Et.registerConnectionCallbacks(this);
        DN = onconnectionfailedlistener;
        Et.registerConnectionCallbacks(this);
        Et.registerConnectionFailedListener(this);
    }

    public boolean isInitialized()
    {
        return Et != null;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        boolean flag = true;
        i;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 65
    //                   2 49;
           goto _L1 _L2 _L3
_L1:
        i = 0;
_L5:
        if (i != 0)
        {
            Et.connect();
            Ev = false;
            return;
        } else
        {
            DN.onConnectionFailed(Eu);
            return;
        }
_L3:
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(getActivity()) != 0) goto _L1; else goto _L4
_L4:
        i = ((flag) ? 1 : 0);
          goto _L5
_L2:
        if (j != -1) goto _L1; else goto _L6
_L6:
        i = ((flag) ? 1 : 0);
          goto _L5
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        Ev = false;
        DN.onConnectionFailed(Eu);
    }

    public void onConnected(Bundle bundle)
    {
        Ev = false;
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        Eu = connectionresult;
        if (Ev)
        {
            return;
        }
        int i = getActivity().getSupportFragmentManager().getFragments().indexOf(this);
        if (connectionresult.hasResolution())
        {
            try
            {
                connectionresult.startResolutionForResult(getActivity(), (i + 1 << 16) + 1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ConnectionResult connectionresult)
            {
                Et.connect();
            }
            return;
        }
        if (GooglePlayServicesUtil.isUserRecoverableError(connectionresult.getErrorCode()))
        {
            GooglePlayServicesUtil.b(connectionresult.getErrorCode(), getActivity(), this, 2, this);
            return;
        } else
        {
            DN.onConnectionFailed(Eu);
            return;
        }
    }

    public void onConnectionSuspended(int i)
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            Ev = bundle.getBoolean("resolving_error", false);
            int i = bundle.getInt("connection_result_status");
            if (i != 0)
            {
                Eu = new ConnectionResult(i, (PendingIntent)bundle.getParcelable("resolution_pending_intent"));
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", Ev);
        if (Eu != null)
        {
            bundle.putInt("connection_result_status", Eu.getErrorCode());
            bundle.putParcelable("resolution_pending_intent", Eu.getResolution());
        }
    }

    public void onStart()
    {
        super.onStart();
        if (!Ev && Et != null)
        {
            Et.connect();
        }
    }

    public void onStop()
    {
        super.onStop();
        if (Et != null)
        {
            Et.disconnect();
        }
    }
}
