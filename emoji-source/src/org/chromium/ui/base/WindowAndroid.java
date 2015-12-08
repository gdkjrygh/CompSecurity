// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.base;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.chromium.ui.VSyncMonitor;

public class WindowAndroid
{
    public static interface IntentCallback
    {

        public abstract void onIntentCompleted(WindowAndroid windowandroid, int i, ContentResolver contentresolver, Intent intent);
    }


    static final boolean $assertionsDisabled;
    public static final int START_INTENT_FAILURE = -1;
    private static final String TAG = "WindowAndroid";
    static final String WINDOW_CALLBACK_ERRORS = "window_callback_errors";
    protected Context mApplicationContext;
    protected HashMap mIntentErrors;
    private long mNativeWindowAndroid;
    protected SparseArray mOutstandingIntents;
    private final org.chromium.ui.VSyncMonitor.Listener mVSyncListener = new org.chromium.ui.VSyncMonitor.Listener() {

        final WindowAndroid this$0;

        public void onVSync(VSyncMonitor vsyncmonitor, long l)
        {
            if (mNativeWindowAndroid != 0L)
            {
                nativeOnVSync(mNativeWindowAndroid, l);
            }
        }

            
            {
                this$0 = WindowAndroid.this;
                super();
            }
    };
    private final VSyncMonitor mVSyncMonitor;

    public WindowAndroid(Context context)
    {
        mNativeWindowAndroid = 0L;
        if (!$assertionsDisabled && context != context.getApplicationContext())
        {
            throw new AssertionError();
        } else
        {
            mApplicationContext = context;
            mOutstandingIntents = new SparseArray();
            mIntentErrors = new HashMap();
            mVSyncMonitor = new VSyncMonitor(context, mVSyncListener);
            return;
        }
    }

    private native void nativeDestroy(long l);

    private native long nativeInit(long l);

    private native void nativeOnVSync(long l, long l1);

    private void requestVSyncUpdate()
    {
        mVSyncMonitor.requestUpdate();
    }

    public boolean canResolveActivity(Intent intent)
    {
        boolean flag = false;
        if (mApplicationContext.getPackageManager().resolveActivity(intent, 0) != null)
        {
            flag = true;
        }
        return flag;
    }

    public void cancelIntent(int i)
    {
        Log.d("WindowAndroid", (new StringBuilder()).append("Can't cancel intent as context is not an Activity: ").append(i).toString());
    }

    public void destroy()
    {
        if (mNativeWindowAndroid != 0L)
        {
            nativeDestroy(mNativeWindowAndroid);
            mNativeWindowAndroid = 0L;
        }
    }

    public WeakReference getActivity()
    {
        return new WeakReference(null);
    }

    public Context getApplicationContext()
    {
        return mApplicationContext;
    }

    public long getNativePointer()
    {
        if (mNativeWindowAndroid == 0L)
        {
            mNativeWindowAndroid = nativeInit(mVSyncMonitor.getVSyncPeriodInMicroseconds());
        }
        return mNativeWindowAndroid;
    }

    public boolean isInsideVSync()
    {
        return mVSyncMonitor.isInsideVSync();
    }

    public boolean onActivityResult(int i, int j, Intent intent)
    {
        return false;
    }

    public boolean removeIntentCallback(IntentCallback intentcallback)
    {
        int i = mOutstandingIntents.indexOfValue(intentcallback);
        if (i < 0)
        {
            return false;
        } else
        {
            mOutstandingIntents.remove(i);
            mIntentErrors.remove(Integer.valueOf(i));
            return true;
        }
    }

    public void restoreInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            if ((bundle = bundle.getSerializable("window_callback_errors")) instanceof HashMap)
            {
                mIntentErrors = (HashMap)bundle;
                return;
            }
        }
    }

    public void saveInstanceState(Bundle bundle)
    {
        bundle.putSerializable("window_callback_errors", mIntentErrors);
    }

    public void sendBroadcast(Intent intent)
    {
        mApplicationContext.sendBroadcast(intent);
    }

    protected void showCallbackNonExistentError(String s)
    {
        showError(s);
    }

    public int showCancelableIntent(PendingIntent pendingintent, IntentCallback intentcallback, int i)
    {
        Log.d("WindowAndroid", (new StringBuilder()).append("Can't show intent as context is not an Activity: ").append(pendingintent).toString());
        return -1;
    }

    public int showCancelableIntent(Intent intent, IntentCallback intentcallback, int i)
    {
        Log.d("WindowAndroid", (new StringBuilder()).append("Can't show intent as context is not an Activity: ").append(intent).toString());
        return -1;
    }

    public void showError(int i)
    {
        showError(mApplicationContext.getString(i));
    }

    public void showError(String s)
    {
        if (s != null)
        {
            Toast.makeText(mApplicationContext, s, 0).show();
        }
    }

    public boolean showIntent(PendingIntent pendingintent, IntentCallback intentcallback, int i)
    {
        return showCancelableIntent(pendingintent, intentcallback, i) >= 0;
    }

    public boolean showIntent(Intent intent, IntentCallback intentcallback, int i)
    {
        return showCancelableIntent(intent, intentcallback, i) >= 0;
    }

    static 
    {
        boolean flag;
        if (!org/chromium/ui/base/WindowAndroid.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }


}
