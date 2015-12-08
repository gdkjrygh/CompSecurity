// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            RegisteredMediaRouteProvider, MediaRouteProvider

final class RegisteredMediaRouteProviderWatcher
{
    public static interface Callback
    {

        public abstract void addProvider(MediaRouteProvider mediarouteprovider);

        public abstract void removeProvider(MediaRouteProvider mediarouteprovider);
    }


    private final Callback mCallback;
    private final Context mContext;
    private final Handler mHandler = new Handler();
    private final PackageManager mPackageManager;
    private final ArrayList mProviders = new ArrayList();
    private boolean mRunning;
    private final BroadcastReceiver mScanPackagesReceiver = new BroadcastReceiver() {

        final RegisteredMediaRouteProviderWatcher this$0;

        public void onReceive(Context context1, Intent intent)
        {
            scanPackages();
        }

            
            {
                this$0 = RegisteredMediaRouteProviderWatcher.this;
                super();
            }
    };
    private final Runnable mScanPackagesRunnable = new Runnable() {

        final RegisteredMediaRouteProviderWatcher this$0;

        public void run()
        {
            scanPackages();
        }

            
            {
                this$0 = RegisteredMediaRouteProviderWatcher.this;
                super();
            }
    };

    public RegisteredMediaRouteProviderWatcher(Context context, Callback callback)
    {
        mContext = context;
        mCallback = callback;
        mPackageManager = context.getPackageManager();
    }

    private int findProvider(String s, String s1)
    {
        int j = mProviders.size();
        for (int i = 0; i < j; i++)
        {
            if (((RegisteredMediaRouteProvider)mProviders.get(i)).hasComponentName(s, s1))
            {
                return i;
            }
        }

        return -1;
    }

    private void scanPackages()
    {
        if (mRunning) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = 0;
        Object obj = new Intent("android.media.MediaRouteProviderService");
        obj = mPackageManager.queryIntentServices(((Intent) (obj)), 0).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = ((ResolveInfo)((Iterator) (obj)).next()).serviceInfo;
            if (obj1 != null)
            {
                int j = findProvider(((ServiceInfo) (obj1)).packageName, ((ServiceInfo) (obj1)).name);
                if (j < 0)
                {
                    obj1 = new RegisteredMediaRouteProvider(mContext, new ComponentName(((ServiceInfo) (obj1)).packageName, ((ServiceInfo) (obj1)).name));
                    ((RegisteredMediaRouteProvider) (obj1)).start();
                    mProviders.add(i, obj1);
                    mCallback.addProvider(((MediaRouteProvider) (obj1)));
                    i++;
                } else
                if (j >= i)
                {
                    RegisteredMediaRouteProvider registeredmediarouteprovider1 = (RegisteredMediaRouteProvider)mProviders.get(j);
                    registeredmediarouteprovider1.start();
                    registeredmediarouteprovider1.rebindIfDisconnected();
                    Collections.swap(mProviders, j, i);
                    i++;
                }
            }
        } while (true);
        if (i < mProviders.size())
        {
            int k = mProviders.size() - 1;
            while (k >= i) 
            {
                RegisteredMediaRouteProvider registeredmediarouteprovider = (RegisteredMediaRouteProvider)mProviders.get(k);
                mCallback.removeProvider(registeredmediarouteprovider);
                mProviders.remove(registeredmediarouteprovider);
                registeredmediarouteprovider.stop();
                k--;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void start()
    {
        if (!mRunning)
        {
            mRunning = true;
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentfilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentfilter.addAction("android.intent.action.PACKAGE_CHANGED");
            intentfilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentfilter.addAction("android.intent.action.PACKAGE_RESTARTED");
            intentfilter.addDataScheme("package");
            mContext.registerReceiver(mScanPackagesReceiver, intentfilter, null, mHandler);
            mHandler.post(mScanPackagesRunnable);
        }
    }

    public void stop()
    {
        if (mRunning)
        {
            mRunning = false;
            mContext.unregisterReceiver(mScanPackagesReceiver);
            mHandler.removeCallbacks(mScanPackagesRunnable);
            for (int i = mProviders.size() - 1; i >= 0; i--)
            {
                ((RegisteredMediaRouteProvider)mProviders.get(i)).stop();
            }

        }
    }

}
