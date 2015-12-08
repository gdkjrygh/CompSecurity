// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.fragment;

import android.app.Fragment;
import android.os.Bundle;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.LoadingStatus;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;

public abstract class NetflixFrag extends Fragment
    implements LoadingStatus, ManagerStatusListener
{

    private static final String TAG = "NetflixFrag";
    private boolean isDestroyed;
    protected com.netflix.mediaclient.android.app.LoadingStatus.LoadingStatusCallback mLoadingStatusCallback;

    public NetflixFrag()
    {
    }

    public NetflixActivity getNetflixActivity()
    {
        return (NetflixActivity)getActivity();
    }

    protected boolean isDestroyed()
    {
        return isDestroyed;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (Log.isLoggable("NetflixFrag", 2))
        {
            Log.v("NetflixFrag", (new StringBuilder()).append("Creating frag: ").append(getClass().getSimpleName()).append(", hash: ").append(hashCode()).toString());
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (Log.isLoggable("NetflixFrag", 2))
        {
            Log.v("NetflixFrag", (new StringBuilder()).append("Destroying frag: ").append(getClass().getSimpleName()).append(", hash: ").append(hashCode()).toString());
        }
        isDestroyed = true;
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
