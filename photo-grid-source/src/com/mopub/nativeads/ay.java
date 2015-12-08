// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.os.AsyncTask;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import com.mopub.common.util.Intents;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.mopub.nativeads:
//            az

final class ay extends AsyncTask
{

    private final az a;

    private ay(az az1)
    {
        a = az1;
    }

    private static String a(String s)
    {
        Object obj;
        obj = null;
        s = new URL(s);
        s = (HttpURLConnection)s.openConnection();
        int i;
        s.setInstanceFollowRedirects(false);
        i = s.getResponseCode();
        if (i < 300 || i >= 400)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        obj = s.getHeaderField("Location");
        if (s != null)
        {
            s.disconnect();
        }
        return ((String) (obj));
        if (s != null)
        {
            s.disconnect();
        }
        return null;
        Exception exception;
        exception;
        s = ((String) (obj));
        obj = exception;
_L2:
        if (s != null)
        {
            s.disconnect();
        }
        throw obj;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static transient String a(String as[])
    {
        if (as != null && as.length != 0) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((String) (obj));
_L2:
        int i;
        as = as[0];
        i = 0;
        obj = null;
_L5:
        if (as == null || i >= 10)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj = as;
        if (!Intents.isHttpUrl(as)) goto _L4; else goto _L3
_L3:
        String s = a(((String) (as)));
        i++;
        obj = as;
        as = s;
          goto _L5
        as;
        return null;
        return ((String) (obj));
    }

    public static void getResolvedUrl(String s, az az1)
    {
        ay ay1 = new ay(az1);
        try
        {
            AsyncTasks.safeExecuteOnExecutor(ay1, new String[] {
                s
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            MoPubLog.d("Failed to resolve url", s);
        }
        az1.onFailure();
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected final void onCancelled()
    {
        super.onCancelled();
        a.onFailure();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (String)obj;
        super.onPostExecute(obj);
        if (isCancelled() || obj == null)
        {
            onCancelled();
            return;
        } else
        {
            a.onSuccess(((String) (obj)));
            return;
        }
    }
}
