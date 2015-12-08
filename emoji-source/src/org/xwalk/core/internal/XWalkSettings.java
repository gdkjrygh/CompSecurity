// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import org.chromium.base.ThreadUtils;

public class XWalkSettings
{
    private class EventHandler
    {

        static final boolean $assertionsDisabled;
        private static final int UPDATE_WEBKIT_PREFERENCES = 0;
        private Handler mHandler;
        final XWalkSettings this$0;

        private void updateWebkitPreferencesLocked()
        {
            if (!$assertionsDisabled && !Thread.holdsLock(mXWalkSettingsLock))
            {
                throw new AssertionError();
            }
            break MISSING_BLOCK_LABEL_27;
            while (true) 
            {
                do
                {
                    return;
                } while (mNativeXWalkSettings == 0L || mHandler == null);
                if (ThreadUtils.runningOnUiThread())
                {
                    updateWebkitPreferencesOnUiThread();
                    return;
                }
                if (!mIsUpdateWebkitPrefsMessagePending)
                {
                    mIsUpdateWebkitPrefsMessagePending = true;
                    mHandler.sendMessage(Message.obtain(null, 0));
                    try
                    {
                        while (mIsUpdateWebkitPrefsMessagePending) 
                        {
                            mXWalkSettingsLock.wait();
                        }
                    }
                    catch (InterruptedException interruptedexception)
                    {
                        return;
                    }
                }
            }
        }

        void bindUiThread()
        {
            if (mHandler != null)
            {
                return;
            } else
            {
                mHandler = new Handler(ThreadUtils.getUiThreadLooper()) {

                    final EventHandler this$1;

                    public void handleMessage(Message message)
                    {
                        switch (message.what)
                        {
                        default:
                            return;

                        case 0: // '\0'
                            message = ((Message) (mXWalkSettingsLock));
                            break;
                        }
                        message;
                        JVM INSTR monitorenter ;
                        updateWebkitPreferencesOnUiThread();
                        mIsUpdateWebkitPrefsMessagePending = false;
                        mXWalkSettingsLock.notifyAll();
                        message;
                        JVM INSTR monitorexit ;
                        return;
                        Exception exception;
                        exception;
                        message;
                        JVM INSTR monitorexit ;
                        throw exception;
                    }

            
            {
                this$1 = EventHandler.this;
                super(looper);
            }
                };
                return;
            }
        }

        void maybeRunOnUiThreadBlocking(Runnable runnable)
        {
            if (mHandler != null)
            {
                ThreadUtils.runOnUiThreadBlocking(runnable);
            }
        }

        static 
        {
            boolean flag;
            if (!org/xwalk/core/internal/XWalkSettings.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }


        EventHandler()
        {
            this$0 = XWalkSettings.this;
            super();
        }
    }

    static class LazyDefaultUserAgent
    {

        private static final String sInstance = XWalkSettings.nativeGetDefaultUserAgent();



        LazyDefaultUserAgent()
        {
        }
    }


    static final boolean $assertionsDisabled;
    private static final int MAXIMUM_FONT_SIZE = 72;
    private static final int MINIMUM_FONT_SIZE = 1;
    private static final String TAG = "XWalkSettings";
    private static boolean sAppCachePathIsSet = false;
    private static final Object sGlobalContentSettingsLock = new Object();
    private boolean mAllowContentUrlAccess;
    private boolean mAllowFileAccessFromFileURLs;
    private boolean mAllowFileUrlAccess;
    private boolean mAllowScriptsToCloseWindows;
    private boolean mAllowUniversalAccessFromFileURLs;
    private boolean mAppCacheEnabled;
    private boolean mBlockNetworkLoads;
    private int mCacheMode;
    private final Context mContext;
    private boolean mDatabaseEnabled;
    private String mDefaultVideoPosterURL;
    private boolean mDomStorageEnabled;
    private final EventHandler mEventHandler = new EventHandler();
    private boolean mGeolocationEnabled;
    private boolean mImagesEnabled;
    private boolean mIsUpdateWebkitPrefsMessagePending;
    private boolean mJavaScriptCanOpenWindowsAutomatically;
    private boolean mJavaScriptEnabled;
    private boolean mLoadsImagesAutomatically;
    private boolean mMediaPlaybackRequiresUserGesture;
    private long mNativeXWalkSettings;
    private boolean mShouldFocusFirstNode;
    private boolean mSupportMultipleWindows;
    private boolean mUseWideViewport;
    private String mUserAgent;
    private final Object mXWalkSettingsLock = new Object();

    public XWalkSettings(Context context, long l, boolean flag)
    {
        boolean flag1 = false;
        super();
        mAllowScriptsToCloseWindows = true;
        mLoadsImagesAutomatically = true;
        mImagesEnabled = true;
        mJavaScriptEnabled = true;
        mAllowUniversalAccessFromFileURLs = false;
        mAllowFileAccessFromFileURLs = false;
        mJavaScriptCanOpenWindowsAutomatically = true;
        mCacheMode = -1;
        mSupportMultipleWindows = true;
        mAppCacheEnabled = true;
        mDomStorageEnabled = true;
        mDatabaseEnabled = true;
        mUseWideViewport = false;
        mMediaPlaybackRequiresUserGesture = false;
        mAllowContentUrlAccess = true;
        mAllowFileUrlAccess = true;
        mShouldFocusFirstNode = true;
        mGeolocationEnabled = true;
        mNativeXWalkSettings = 0L;
        mIsUpdateWebkitPrefsMessagePending = false;
        ThreadUtils.assertOnUiThread();
        mContext = context;
        if (mContext.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) != 0)
        {
            flag1 = true;
        }
        mBlockNetworkLoads = flag1;
        if (flag)
        {
            mAllowUniversalAccessFromFileURLs = true;
            mAllowFileAccessFromFileURLs = true;
        }
        mUserAgent = LazyDefaultUserAgent.sInstance;
        setWebContents(l);
    }

    private boolean getAppCacheEnabled()
    {
        return mAppCacheEnabled;
    }

    public static String getDefaultUserAgent()
    {
        return LazyDefaultUserAgent.sInstance;
    }

    private String getUserAgentLocked()
    {
        return mUserAgent;
    }

    private native void nativeDestroy(long l);

    private static native String nativeGetDefaultUserAgent();

    private native long nativeInit(long l);

    private native void nativeUpdateEverythingLocked(long l);

    private native void nativeUpdateUserAgent(long l);

    private native void nativeUpdateWebkitPreferences(long l);

    private void nativeXWalkSettingsGone(long l)
    {
        if (!$assertionsDisabled && (mNativeXWalkSettings == 0L || mNativeXWalkSettings != l))
        {
            throw new AssertionError();
        } else
        {
            mNativeXWalkSettings = 0L;
            return;
        }
    }

    private void updateEverything()
    {
        synchronized (mXWalkSettingsLock)
        {
            nativeUpdateEverythingLocked(mNativeXWalkSettings);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void updateWebkitPreferencesOnUiThread()
    {
        if (mNativeXWalkSettings != 0L)
        {
            ThreadUtils.assertOnUiThread();
            nativeUpdateWebkitPreferences(mNativeXWalkSettings);
        }
    }

    public boolean getAllowContentAccess()
    {
        boolean flag;
        synchronized (mXWalkSettingsLock)
        {
            flag = mAllowContentUrlAccess;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean getAllowFileAccess()
    {
        boolean flag;
        synchronized (mXWalkSettingsLock)
        {
            flag = mAllowFileUrlAccess;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean getAllowFileAccessFromFileURLs()
    {
        boolean flag;
        synchronized (mXWalkSettingsLock)
        {
            flag = mAllowFileAccessFromFileURLs;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean getAllowScriptsToCloseWindows()
    {
        boolean flag;
        synchronized (mXWalkSettingsLock)
        {
            flag = mAllowScriptsToCloseWindows;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean getAllowUniversalAccessFromFileURLs()
    {
        boolean flag;
        synchronized (mXWalkSettingsLock)
        {
            flag = mAllowUniversalAccessFromFileURLs;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean getBlockNetworkLoads()
    {
        boolean flag;
        synchronized (mXWalkSettingsLock)
        {
            flag = mBlockNetworkLoads;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int getCacheMode()
    {
        int i;
        synchronized (mXWalkSettingsLock)
        {
            i = mCacheMode;
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean getDatabaseEnabled()
    {
        boolean flag;
        synchronized (mXWalkSettingsLock)
        {
            flag = mDatabaseEnabled;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getDefaultVideoPosterURL()
    {
        String s;
        synchronized (mXWalkSettingsLock)
        {
            s = mDefaultVideoPosterURL;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean getDomStorageEnabled()
    {
        boolean flag;
        synchronized (mXWalkSettingsLock)
        {
            flag = mDomStorageEnabled;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    boolean getGeolocationEnabled()
    {
        boolean flag;
        synchronized (mXWalkSettingsLock)
        {
            flag = mGeolocationEnabled;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean getImagesEnabled()
    {
        boolean flag;
        synchronized (mXWalkSettingsLock)
        {
            flag = mImagesEnabled;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean getJavaScriptCanOpenWindowsAutomatically()
    {
        boolean flag;
        synchronized (mXWalkSettingsLock)
        {
            flag = mJavaScriptCanOpenWindowsAutomatically;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean getJavaScriptEnabled()
    {
        boolean flag;
        synchronized (mXWalkSettingsLock)
        {
            flag = mJavaScriptEnabled;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean getLoadsImagesAutomatically()
    {
        boolean flag;
        synchronized (mXWalkSettingsLock)
        {
            flag = mLoadsImagesAutomatically;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean getMediaPlaybackRequiresUserGesture()
    {
        boolean flag;
        synchronized (mXWalkSettingsLock)
        {
            flag = mMediaPlaybackRequiresUserGesture;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean getUseWideViewPort()
    {
        boolean flag;
        synchronized (mXWalkSettingsLock)
        {
            flag = mUseWideViewport;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getUserAgentString()
    {
        String s;
        synchronized (mXWalkSettingsLock)
        {
            s = mUserAgent;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setAllowContentAccess(boolean flag)
    {
        synchronized (mXWalkSettingsLock)
        {
            if (mAllowContentUrlAccess != flag)
            {
                mAllowContentUrlAccess = flag;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setAllowFileAccess(boolean flag)
    {
        synchronized (mXWalkSettingsLock)
        {
            if (mAllowFileUrlAccess != flag)
            {
                mAllowFileUrlAccess = flag;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setAllowFileAccessFromFileURLs(boolean flag)
    {
        synchronized (mXWalkSettingsLock)
        {
            if (mAllowFileAccessFromFileURLs != flag)
            {
                mAllowFileAccessFromFileURLs = flag;
                mEventHandler.updateWebkitPreferencesLocked();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setAllowScriptsToCloseWindows(boolean flag)
    {
        synchronized (mXWalkSettingsLock)
        {
            if (mAllowScriptsToCloseWindows != flag)
            {
                mAllowScriptsToCloseWindows = flag;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setAllowUniversalAccessFromFileURLs(boolean flag)
    {
        synchronized (mXWalkSettingsLock)
        {
            if (mAllowUniversalAccessFromFileURLs != flag)
            {
                mAllowUniversalAccessFromFileURLs = flag;
                mEventHandler.updateWebkitPreferencesLocked();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setAppCacheEnabled(boolean flag)
    {
        synchronized (mXWalkSettingsLock)
        {
            if (mAppCacheEnabled != flag)
            {
                mAppCacheEnabled = flag;
                mEventHandler.updateWebkitPreferencesLocked();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setAppCachePath(String s)
    {
        boolean flag1 = false;
        Object obj = sGlobalContentSettingsLock;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = flag1;
        if (sAppCachePathIsSet)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        flag = flag1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        flag = flag1;
        if (s.isEmpty())
        {
            break MISSING_BLOCK_LABEL_41;
        }
        sAppCachePathIsSet = true;
        flag = true;
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            synchronized (mXWalkSettingsLock)
            {
                mEventHandler.updateWebkitPreferencesLocked();
            }
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setBlockNetworkLoads(boolean flag)
    {
        Object obj = mXWalkSettingsLock;
        obj;
        JVM INSTR monitorenter ;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        if (mContext.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) != 0)
        {
            throw new SecurityException("Permission denied - application missing INTERNET permission");
        }
        break MISSING_BLOCK_LABEL_44;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        mBlockNetworkLoads = flag;
        obj;
        JVM INSTR monitorexit ;
    }

    public void setCacheMode(int i)
    {
        synchronized (mXWalkSettingsLock)
        {
            if (mCacheMode != i)
            {
                mCacheMode = i;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setDatabaseEnabled(boolean flag)
    {
        synchronized (mXWalkSettingsLock)
        {
            if (mDatabaseEnabled != flag)
            {
                mDatabaseEnabled = flag;
                mEventHandler.updateWebkitPreferencesLocked();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setDefaultVideoPosterURL(String s)
    {
        Object obj = mXWalkSettingsLock;
        obj;
        JVM INSTR monitorenter ;
        if ((mDefaultVideoPosterURL == null || mDefaultVideoPosterURL.equals(s)) && (mDefaultVideoPosterURL != null || s == null))
        {
            break MISSING_BLOCK_LABEL_48;
        }
        mDefaultVideoPosterURL = s;
        mEventHandler.updateWebkitPreferencesLocked();
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void setDomStorageEnabled(boolean flag)
    {
        synchronized (mXWalkSettingsLock)
        {
            if (mDomStorageEnabled != flag)
            {
                mDomStorageEnabled = flag;
                mEventHandler.updateWebkitPreferencesLocked();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setGeolocationEnabled(boolean flag)
    {
        synchronized (mXWalkSettingsLock)
        {
            if (mGeolocationEnabled != flag)
            {
                mGeolocationEnabled = flag;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setImagesEnabled(boolean flag)
    {
        synchronized (mXWalkSettingsLock)
        {
            if (mImagesEnabled != flag)
            {
                mImagesEnabled = flag;
                mEventHandler.updateWebkitPreferencesLocked();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean flag)
    {
        synchronized (mXWalkSettingsLock)
        {
            if (mJavaScriptCanOpenWindowsAutomatically != flag)
            {
                mJavaScriptCanOpenWindowsAutomatically = flag;
                mEventHandler.updateWebkitPreferencesLocked();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setJavaScriptEnabled(boolean flag)
    {
        synchronized (mXWalkSettingsLock)
        {
            if (mJavaScriptEnabled != flag)
            {
                mJavaScriptEnabled = flag;
                mEventHandler.updateWebkitPreferencesLocked();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setLoadsImagesAutomatically(boolean flag)
    {
        synchronized (mXWalkSettingsLock)
        {
            if (mLoadsImagesAutomatically != flag)
            {
                mLoadsImagesAutomatically = flag;
                mEventHandler.updateWebkitPreferencesLocked();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setMediaPlaybackRequiresUserGesture(boolean flag)
    {
        synchronized (mXWalkSettingsLock)
        {
            if (mMediaPlaybackRequiresUserGesture != flag)
            {
                mMediaPlaybackRequiresUserGesture = flag;
                mEventHandler.updateWebkitPreferencesLocked();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setSupportMultipleWindows(boolean flag)
    {
        synchronized (mXWalkSettingsLock)
        {
            if (mSupportMultipleWindows != flag)
            {
                mSupportMultipleWindows = flag;
                mEventHandler.updateWebkitPreferencesLocked();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setUseWideViewPort(boolean flag)
    {
        synchronized (mXWalkSettingsLock)
        {
            if (mUseWideViewport != flag)
            {
                mUseWideViewport = flag;
                mEventHandler.updateWebkitPreferencesLocked();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setUserAgentString(String s)
    {
        Object obj = mXWalkSettingsLock;
        obj;
        JVM INSTR monitorenter ;
        String s1 = mUserAgent;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        if (s.length() != 0)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        mUserAgent = LazyDefaultUserAgent.sInstance;
_L2:
        if (!s1.equals(mUserAgent))
        {
            mEventHandler.maybeRunOnUiThreadBlocking(new Runnable() {

                final XWalkSettings this$0;

                public void run()
                {
                    if (mNativeXWalkSettings != 0L)
                    {
                        nativeUpdateUserAgent(mNativeXWalkSettings);
                    }
                }

            
            {
                this$0 = XWalkSettings.this;
                super();
            }
            });
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        mUserAgent = s;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    void setWebContents(long l)
    {
        Object obj = mXWalkSettingsLock;
        obj;
        JVM INSTR monitorenter ;
        if (mNativeXWalkSettings != 0L)
        {
            nativeDestroy(mNativeXWalkSettings);
            if (!$assertionsDisabled && mNativeXWalkSettings != 0L)
            {
                throw new AssertionError();
            }
        }
        break MISSING_BLOCK_LABEL_54;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (l == 0L)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        mEventHandler.bindUiThread();
        mNativeXWalkSettings = nativeInit(l);
        nativeUpdateEverythingLocked(mNativeXWalkSettings);
        obj;
        JVM INSTR monitorexit ;
    }

    public boolean supportMultipleWindows()
    {
        boolean flag;
        synchronized (mXWalkSettingsLock)
        {
            flag = mSupportMultipleWindows;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        boolean flag;
        if (!org/xwalk/core/internal/XWalkSettings.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }






/*
    static boolean access$302(XWalkSettings xwalksettings, boolean flag)
    {
        xwalksettings.mIsUpdateWebkitPrefsMessagePending = flag;
        return flag;
    }

*/


}
