// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.Context;
import android.util.Log;
import com.appsflyer.cache.CacheManager;
import com.appsflyer.cache.RequestCacheData;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.appsflyer:
//            AppsFlyerLib

private static class ctxReference
    implements Runnable
{

    private WeakReference ctxReference;

    public void run()
    {
        AppsFlyerLib.access$1002(true);
        if (ctxReference == null)
        {
            return;
        }
        String s = AppsFlyerLib.getProperty("AppsFlyerKey");
        Object obj = ctxReference;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = CacheManager.getInstance().getCachedRequests((Context)ctxReference.get()).iterator();
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        RequestCacheData requestcachedata;
        requestcachedata = (RequestCacheData)iterator.next();
        if (AppsFlyerLib.access$700())
        {
            Log.i("AppsFlyer_1.5.3", (new StringBuilder()).append("resending request: ").append(requestcachedata.getRequestURL()).toString());
        }
        AppsFlyerLib.access$400((new StringBuilder()).append(requestcachedata.getRequestURL()).append("&isCachedRequest=true").toString(), requestcachedata.getPostData(), s, ctxReference, requestcachedata.getCacheKey());
          goto _L3
        Exception exception1;
        exception1;
        Log.i("AppsFlyer_1.5.3", "Failed to resend cached request");
          goto _L3
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("AppsFlyer_1.5.3", "failed to check cache.");
        }
_L4:
        AppsFlyerLib.access$1002(false);
        return;
_L2:
        obj;
        JVM INSTR monitorexit ;
          goto _L4
    }

    public (Context context)
    {
        ctxReference = null;
        ctxReference = new WeakReference(context);
    }
}
