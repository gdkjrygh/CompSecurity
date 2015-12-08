// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.millennialmedia.android:
//            MMWebView, MMActivity, AdViewOverlayActivity, MMSDK, 
//            MMJSResponse, MMLog

abstract class MMJSObject
{

    private static final String TAG = com/millennialmedia/android/MMJSObject.getName();
    protected WeakReference contextRef;
    protected WeakReference mmWebViewRef;

    MMJSObject()
    {
    }

    abstract MMJSResponse executeCommand(String s, Map map);

    long getAdImplId(String s)
    {
        if (s != null)
        {
            return (long)Float.parseFloat(s);
        } else
        {
            return -4L;
        }
    }

    AdViewOverlayActivity getBaseActivity()
    {
        Object obj = (MMWebView)mmWebViewRef.get();
        if (obj != null)
        {
            obj = ((MMWebView) (obj)).getActivity();
            if (obj instanceof MMActivity)
            {
                obj = ((MMActivity)obj).getWrappedActivity();
                if (obj instanceof AdViewOverlayActivity)
                {
                    return (AdViewOverlayActivity)obj;
                }
            }
        }
        return null;
    }

    MMJSResponse runOnUiThreadFuture(Callable callable)
    {
        callable = new FutureTask(callable);
        MMSDK.runOnUiThread(callable);
        callable = (MMJSResponse)callable.get();
        return callable;
        callable;
        MMLog.e(TAG, "Future interrupted", callable);
_L2:
        return null;
        callable;
        MMLog.e(TAG, "Future execution problem: ", callable);
        if (true) goto _L2; else goto _L1
_L1:
    }

    void setContext(Context context)
    {
        contextRef = new WeakReference(context);
    }

    void setMMWebView(MMWebView mmwebview)
    {
        mmWebViewRef = new WeakReference(mmwebview);
    }

}
