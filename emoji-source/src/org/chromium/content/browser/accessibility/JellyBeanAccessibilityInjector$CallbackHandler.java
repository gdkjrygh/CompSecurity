// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.accessibility;

import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.content.browser.ContentViewCore;

// Referenced classes of package org.chromium.content.browser.accessibility:
//            JellyBeanAccessibilityInjector

private static class <init>
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


    private (String s)
    {
        mResultIdCounter = new AtomicInteger();
        mResultLock = new Object();
        mResult = false;
        mResultId = -1L;
        mInterfaceName = s;
    }

    mInterfaceName(String s, mInterfaceName minterfacename)
    {
        this(s);
    }
}
