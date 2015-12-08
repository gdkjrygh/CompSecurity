// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.accessibility;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.content.browser.ContentViewCore;
import org.chromium.content_public.browser.WebContents;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.chromium.content.browser.accessibility:
//            AccessibilityInjector

class JellyBeanAccessibilityInjector extends AccessibilityInjector
{
    private static class CallbackHandler
    {

        private static final String JAVASCRIPT_ACTION_TEMPLATE = "(function() {  retVal = false;  try {    retVal = %s;  } catch (e) {    retVal = false;  }  %s.onResult(%d, retVal);})()";
        private static final long RESULT_TIMEOUT = 5000L;
        private final String mInterfaceName;
        private boolean mResult;
        private long mResultId;
        private final AtomicInteger mResultIdCounter;
        private final Object mResultLock;

        private void clearResultLocked()
        {
            mResultId = -1L;
            mResult = false;
        }

        private boolean getResultAndClear(int i)
        {
            Object obj = mResultLock;
            obj;
            JVM INSTR monitorenter ;
            boolean flag;
            if (!waitForResultTimedLocked(i))
            {
                break MISSING_BLOCK_LABEL_35;
            }
            flag = mResult;
_L1:
            clearResultLocked();
            return flag;
            Exception exception;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            flag = false;
              goto _L1
        }

        private boolean performAction(ContentViewCore contentviewcore, String s)
        {
            int i = mResultIdCounter.getAndIncrement();
            contentviewcore.evaluateJavaScript(String.format(Locale.US, "(function() {  retVal = false;  try {    retVal = %s;  } catch (e) {    retVal = false;  }  %s.onResult(%d, retVal);})()", new Object[] {
                s, mInterfaceName, Integer.valueOf(i)
            }), null);
            return getResultAndClear(i);
        }

        private boolean waitForResultTimedLocked(int i)
        {
            long l = SystemClock.uptimeMillis();
_L2:
            if (mResultId == (long)i)
            {
                return true;
            }
            long l1;
            if (mResultId > (long)i)
            {
                break; /* Loop/switch isn't completed */
            }
            l1 = 5000L - (SystemClock.uptimeMillis() - l);
            if (l1 <= 0L)
            {
                break; /* Loop/switch isn't completed */
            }
            try
            {
                mResultLock.wait(l1);
            }
            catch (InterruptedException interruptedexception) { }
            if (true) goto _L2; else goto _L1
_L1:
            return false;
        }

        public void onResult(String s, String s1)
        {
            long l;
            try
            {
                l = Long.parseLong(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
            synchronized (mResultLock)
            {
                if (l > mResultId)
                {
                    mResult = Boolean.parseBoolean(s1);
                    mResultId = l;
                }
                mResultLock.notifyAll();
            }
            return;
            s1;
            s;
            JVM INSTR monitorexit ;
            throw s1;
        }


        private CallbackHandler(String s)
        {
            mResultIdCounter = new AtomicInteger();
            mResultLock = new Object();
            mResult = false;
            mResultId = -1L;
            mInterfaceName = s;
        }

    }


    private static final String ACCESSIBILITY_ANDROIDVOX_TEMPLATE = "cvox.AndroidVox.performAction('%1s')";
    private static final String ALIAS_TRAVERSAL_JS_INTERFACE = "accessibilityTraversal";
    private JSONObject mAccessibilityJSONObject;
    private CallbackHandler mCallback;

    protected JellyBeanAccessibilityInjector(ContentViewCore contentviewcore)
    {
        super(contentviewcore);
    }

    private boolean sendActionToAndroidVox(int i, Bundle bundle)
    {
        if (mCallback == null)
        {
            return false;
        }
        if (mAccessibilityJSONObject == null)
        {
            mAccessibilityJSONObject = new JSONObject();
        } else
        {
            Iterator iterator = mAccessibilityJSONObject.keys();
            while (iterator.hasNext()) 
            {
                iterator.next();
                iterator.remove();
            }
        }
        try
        {
            mAccessibilityJSONObject.accumulate("action", Integer.valueOf(i));
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return false;
        }
        if (bundle == null) goto _L2; else goto _L1
_L1:
        if (i != 256 && i != 512) goto _L4; else goto _L3
_L3:
        i = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        mAccessibilityJSONObject.accumulate("granularity", Integer.valueOf(i));
_L2:
        bundle = mAccessibilityJSONObject.toString();
        bundle = String.format(Locale.US, "cvox.AndroidVox.performAction('%1s')", new Object[] {
            bundle
        });
        return mCallback.performAction(mContentViewCore, bundle);
_L4:
        if (i != 1024 && i != 2048) goto _L2; else goto _L5
_L5:
        bundle = bundle.getString("ACTION_ARGUMENT_HTML_ELEMENT_STRING");
        mAccessibilityJSONObject.accumulate("element", bundle);
          goto _L2
    }

    protected void addAccessibilityApis()
    {
        super.addAccessibilityApis();
        if (mContentViewCore.getContext() != null && mCallback == null)
        {
            mCallback = new CallbackHandler("accessibilityTraversal");
            mContentViewCore.addJavascriptInterface(mCallback, "accessibilityTraversal");
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        accessibilitynodeinfo.setMovementGranularities(31);
        accessibilitynodeinfo.addAction(256);
        accessibilitynodeinfo.addAction(512);
        accessibilitynodeinfo.addAction(1024);
        accessibilitynodeinfo.addAction(2048);
        accessibilitynodeinfo.addAction(16);
        accessibilitynodeinfo.setClickable(true);
    }

    public boolean performAccessibilityAction(int i, Bundle bundle)
    {
        boolean flag;
        if (!accessibilityIsAvailable() || !mContentViewCore.isAlive() || !mInjectedScriptEnabled || !mScriptInjected)
        {
            flag = false;
        } else
        {
            boolean flag1 = sendActionToAndroidVox(i, bundle);
            flag = flag1;
            if (flag1)
            {
                mContentViewCore.getWebContents().showImeIfNeeded();
                return flag1;
            }
        }
        return flag;
    }

    protected void removeAccessibilityApis()
    {
        super.removeAccessibilityApis();
        if (mCallback != null)
        {
            mContentViewCore.removeJavascriptInterface("accessibilityTraversal");
            mCallback = null;
        }
    }

    public boolean supportsAccessibilityAction(int i)
    {
        return i == 256 || i == 512 || i == 1024 || i == 2048 || i == 16;
    }
}
