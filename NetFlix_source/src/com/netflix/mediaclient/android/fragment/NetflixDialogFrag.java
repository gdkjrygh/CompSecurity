// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.fragment;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.app.LoadingStatus;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;

public abstract class NetflixDialogFrag extends DialogFragment
    implements LoadingStatus, ManagerStatusListener
{
    public static interface DialogCanceledListener
    {

        public abstract void onDialogCanceled(NetflixDialogFrag netflixdialogfrag);
    }

    public static interface DialogCanceledListenerProvider
    {

        public abstract DialogCanceledListener getDialogCanceledListener();
    }


    private static final String TAG = "NetflixDialogFrag";
    private boolean isDestroyed;
    protected com.netflix.mediaclient.android.app.LoadingStatus.LoadingStatusCallback mLoadingStatusCallback;

    public NetflixDialogFrag()
    {
    }

    protected boolean isDestroyed()
    {
        return isDestroyed;
    }

    public boolean isLoadingData()
    {
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (Log.isLoggable("NetflixDialogFrag", 2))
        {
            Log.v("NetflixDialogFrag", (new StringBuilder()).append("Creating frag: ").append(getClass().getSimpleName()).append(", hash: ").append(hashCode()).toString());
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (Log.isLoggable("NetflixDialogFrag", 2))
        {
            Log.v("NetflixDialogFrag", (new StringBuilder()).append("Destroying frag: ").append(getClass().getSimpleName()).append(", hash: ").append(hashCode()).toString());
        }
        isDestroyed = true;
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        Log.d("NetflixDialogFrag", "NetflixDialogFrag is dismissed");
    }

    protected void onLoaded(int i)
    {
        if (mLoadingStatusCallback != null)
        {
            mLoadingStatusCallback.onDataLoaded(i);
        }
    }

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
    }

    public void setLoadingStatusCallback(com.netflix.mediaclient.android.app.LoadingStatus.LoadingStatusCallback loadingstatuscallback)
    {
        if (!isLoadingData() && loadingstatuscallback != null)
        {
            loadingstatuscallback.onDataLoaded(0);
            return;
        } else
        {
            mLoadingStatusCallback = loadingstatuscallback;
            return;
        }
    }
}
