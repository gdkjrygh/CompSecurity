// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Utils;

import android.webkit.WebView;
import com.EnterpriseMobileBanking.AppHelper;
import java.util.ArrayList;

// Referenced classes of package com.EnterpriseMobileBanking.Utils:
//            Log, CallbackTask

public class TransiteTaskWorker
    implements Runnable
{

    private static final String TAG = "TransiteTaskWorker";
    private static ArrayList callbackIds = new ArrayList();
    private WebView view;

    public TransiteTaskWorker()
    {
        view = null;
        view = AppHelper.getAppView();
        (new Thread(this)).start();
        Thread.yield();
    }

    public TransiteTaskWorker(WebView webview)
    {
        view = null;
        view = webview;
        (new Thread(this)).start();
        Thread.yield();
    }

    public void processCallback(CallbackTask callbacktask)
    {
        synchronized (callbackIds)
        {
            Log.d("TransiteTaskWorker", "Adding a callback");
            callbackIds.add(callbacktask);
            callbackIds.notify();
        }
        return;
        callbacktask;
        arraylist;
        JVM INSTR monitorexit ;
        throw callbacktask;
    }

    public void run()
    {
        ArrayList arraylist = callbackIds;
        arraylist;
        JVM INSTR monitorenter ;
        Log.d("TransiteTaskWorker", "Running innerWebViewTask");
_L1:
        int i;
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        Log.d("TransiteTaskWorker", "Looping");
        i = callbackIds.size();
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        Log.d("TransiteTaskWorker", "Waiting for callback");
        callbackIds.wait();
_L2:
        Thread.yield();
        CallbackTask callbacktask = (CallbackTask)callbackIds.remove(0);
        Log.d("TransiteTaskWorker", (new StringBuilder()).append("Processing callback: ").append(callbacktask.getCallbackId()).toString());
        callbacktask.execute(view);
          goto _L1
        Object obj;
        obj;
        arraylist;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        ((InterruptedException) (obj)).printStackTrace();
          goto _L2
        Log.d("TransiteTaskWorker", "Done innerWebViewTask");
        arraylist;
        JVM INSTR monitorexit ;
    }

}
