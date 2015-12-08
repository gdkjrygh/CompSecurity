// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyChangeListener
{
    public static interface Delegate
    {

        public abstract void proxySettingsChanged();
    }

    private static class ProxyConfig
    {

        public final String mHost;
        public final String mPacUrl;
        public final int mPort;

        public ProxyConfig(String s, int i, String s1)
        {
            mHost = s;
            mPort = i;
            mPacUrl = s1;
        }
    }

    private class ProxyReceiver extends BroadcastReceiver
    {

        final ProxyChangeListener this$0;

        private ProxyConfig extractNewProxy(Intent intent)
        {
            Object obj;
            Object obj1;
            Method method;
            int i;
            if (android.os.Build.VERSION.SDK_INT <= 19)
            {
                obj = "android.net.ProxyProperties";
                obj1 = "proxy";
            } else
            {
                obj = "android.net.ProxyInfo";
                obj1 = "android.intent.extra.PROXY_INFO";
            }
            try
            {
                intent = ((Intent) (intent.getExtras().get(((String) (obj1)))));
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                Log.e("ProxyChangeListener", (new StringBuilder()).append("Using no proxy configuration due to exception:").append(intent).toString());
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                Log.e("ProxyChangeListener", (new StringBuilder()).append("Using no proxy configuration due to exception:").append(intent).toString());
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                Log.e("ProxyChangeListener", (new StringBuilder()).append("Using no proxy configuration due to exception:").append(intent).toString());
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                Log.e("ProxyChangeListener", (new StringBuilder()).append("Using no proxy configuration due to exception:").append(intent).toString());
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                Log.e("ProxyChangeListener", (new StringBuilder()).append("Using no proxy configuration due to exception:").append(intent).toString());
                return null;
            }
            if (intent == null)
            {
                return null;
            }
            obj1 = Class.forName(((String) (obj)));
            obj = ((Class) (obj1)).getDeclaredMethod("getHost", new Class[0]);
            method = ((Class) (obj1)).getDeclaredMethod("getPort", new Class[0]);
            obj = (String)((Method) (obj)).invoke(intent, new Object[0]);
            i = ((Integer)method.invoke(intent, new Object[0])).intValue();
            if (android.os.Build.VERSION.SDK_INT != 19)
            {
                break MISSING_BLOCK_LABEL_167;
            }
            intent = (String)((Class) (obj1)).getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(intent, new Object[0]);
            if (TextUtils.isEmpty(intent))
            {
                break MISSING_BLOCK_LABEL_252;
            }
            intent = new ProxyConfig(((String) (obj)), i, intent);
            return intent;
            if (android.os.Build.VERSION.SDK_INT <= 19)
            {
                break MISSING_BLOCK_LABEL_252;
            }
            intent = (Uri)((Class) (obj1)).getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(intent, new Object[0]);
            if (Uri.EMPTY.equals(intent))
            {
                break MISSING_BLOCK_LABEL_252;
            }
            intent = new ProxyConfig(((String) (obj)), i, intent.toString());
            return intent;
            intent = new ProxyConfig(((String) (obj)), i, null);
            return intent;
        }

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE"))
            {
                proxySettingsChanged(extractNewProxy(intent));
            }
        }

        private ProxyReceiver()
        {
            this$0 = ProxyChangeListener.this;
            super();
        }

    }


    static final boolean $assertionsDisabled;
    private static final String TAG = "ProxyChangeListener";
    private static boolean sEnabled = true;
    private Context mContext;
    private Delegate mDelegate;
    private long mNativePtr;
    private ProxyReceiver mProxyReceiver;

    private ProxyChangeListener(Context context)
    {
        mContext = context;
    }

    public static ProxyChangeListener create(Context context)
    {
        return new ProxyChangeListener(context);
    }

    public static String getProperty(String s)
    {
        return System.getProperty(s);
    }

    private native void nativeProxySettingsChanged(long l);

    private native void nativeProxySettingsChangedTo(long l, String s, int i, String s1);

    private void proxySettingsChanged(ProxyConfig proxyconfig)
    {
        if (sEnabled)
        {
            if (mDelegate != null)
            {
                mDelegate.proxySettingsChanged();
            }
            if (mNativePtr != 0L)
            {
                if (proxyconfig != null)
                {
                    nativeProxySettingsChangedTo(mNativePtr, proxyconfig.mHost, proxyconfig.mPort, proxyconfig.mPacUrl);
                    return;
                } else
                {
                    nativeProxySettingsChanged(mNativePtr);
                    return;
                }
            }
        }
    }

    private void registerReceiver()
    {
        if (mProxyReceiver != null)
        {
            return;
        } else
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.PROXY_CHANGE");
            mProxyReceiver = new ProxyReceiver();
            mContext.getApplicationContext().registerReceiver(mProxyReceiver, intentfilter);
            return;
        }
    }

    public static void setEnabled(boolean flag)
    {
        sEnabled = flag;
    }

    private void unregisterReceiver()
    {
        if (mProxyReceiver == null)
        {
            return;
        } else
        {
            mContext.unregisterReceiver(mProxyReceiver);
            mProxyReceiver = null;
            return;
        }
    }

    public void setDelegateForTesting(Delegate delegate1)
    {
        mDelegate = delegate1;
    }

    public void start(long l)
    {
        if (!$assertionsDisabled && mNativePtr != 0L)
        {
            throw new AssertionError();
        } else
        {
            mNativePtr = l;
            registerReceiver();
            return;
        }
    }

    public void stop()
    {
        mNativePtr = 0L;
        unregisterReceiver();
    }

    static 
    {
        boolean flag;
        if (!org/chromium/net/ProxyChangeListener.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

}
