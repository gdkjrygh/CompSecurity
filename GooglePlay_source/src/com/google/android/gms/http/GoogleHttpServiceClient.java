// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.http;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.http:
//            IGoogleHttpService

public final class GoogleHttpServiceClient
{

    private static final ComponentName GOOGLE_HTTP_SERVICE_COMPONENT_NAME = new ComponentName("com.google.android.gms", "com.google.android.gms.gcm.http.GoogleHttpService");
    private boolean mBindingResult;
    private Context mContext;
    volatile IGoogleHttpService mHttpService;
    private ServiceConnection mHttpServiceConnection;
    private CountDownLatch mLatch;
    private int mRefCounter;
    private final GmsClientSupervisor mSupervisor;

    public GoogleHttpServiceClient(Context context)
    {
        mContext = context;
        mLatch = new CountDownLatch(1);
        mSupervisor = GmsClientSupervisor.getInstance(mContext);
        mRefCounter = 0;
        mBindingResult = false;
        mHttpServiceConnection = new ServiceConnection() {

            final GoogleHttpServiceClient this$0;

            public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                mHttpService = IGoogleHttpService.Stub.asInterface(ibinder);
                mLatch.countDown();
            }

            public final void onServiceDisconnected(ComponentName componentname)
            {
            }

            
            {
                this$0 = GoogleHttpServiceClient.this;
                super();
            }
        };
    }

    final boolean bindHttpService()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        i = mRefCounter;
        mRefCounter = i + 1;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        mBindingResult = mSupervisor.bindService(GOOGLE_HTTP_SERVICE_COMPONENT_NAME, mHttpServiceConnection, "GoogleHttpServiceClient");
        boolean flag = mBindingResult;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final Bundle checkRules(String s)
    {
        Bundle bundle;
        if (!bindHttpService())
        {
            unbindHttpService();
            return null;
        }
        bundle = null;
        if (mHttpService == null && Looper.getMainLooper().getThread() != Thread.currentThread() && !mLatch.await(500L, TimeUnit.MILLISECONDS))
        {
            Log.w("GoogleHttpServiceClient", "Timeout on service connection", new Throwable());
            mLatch.countDown();
        }
        if (mHttpService != null)
        {
            bundle = mHttpService.getHttpRequestInfo(s);
        }
        unbindHttpService();
        return bundle;
        s;
        Log.w("GoogleHttpServiceClient", "Exception in Google Http Service: ", s);
        unbindHttpService();
        return null;
        s;
        Log.w("GoogleHttpServiceClient", (new StringBuilder("Interrupted waiting for binder: ")).append(s).toString());
        unbindHttpService();
        return null;
        s;
        unbindHttpService();
        throw s;
    }

    final void unbindHttpService()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        i = mRefCounter - 1;
        mRefCounter = i;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        mSupervisor.unbindService(GOOGLE_HTTP_SERVICE_COMPONENT_NAME, mHttpServiceConnection, "GoogleHttpServiceClient");
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }



/*
    static IGoogleHttpService access$002(GoogleHttpServiceClient googlehttpserviceclient, IGoogleHttpService igooglehttpservice)
    {
        googlehttpserviceclient.mHttpService = igooglehttpservice;
        return igooglehttpservice;
    }

*/

}
