// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast;

import android.os.AsyncTask;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast:
//            BaseCastManager

class val.timeoutInSeconds extends AsyncTask
{

    final BaseCastManager this$0;
    final int val$timeoutInSeconds;

    protected transient Boolean doInBackground(Void avoid[])
    {
        int i = 0;
        while (i < val$timeoutInSeconds) 
        {
            LogUtils.LOGD(BaseCastManager.access$100(), (new StringBuilder("Reconnection: Attempt ")).append(i + 1).toString());
            if (isCancelled())
            {
                return Boolean.valueOf(true);
            }
            try
            {
                if (isConnected())
                {
                    cancel(true);
                }
                Thread.sleep(1000L);
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[]) { }
            i++;
        }
        return Boolean.valueOf(false);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(Boolean boolean1)
    {
        if (boolean1 == null || !boolean1.booleanValue())
        {
            LogUtils.LOGD(BaseCastManager.access$100(), "Couldn't reconnect, dropping connection");
            setReconnectionStatus(4);
            onDeviceSelected(null);
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Boolean)obj);
    }

    ()
    {
        this$0 = final_basecastmanager;
        val$timeoutInSeconds = I.this;
        super();
    }
}
