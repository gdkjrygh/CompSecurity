// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;

// Referenced classes of package org.chromium.net:
//            CronetLibraryLoader

public class ChromiumUrlRequestContext
{

    private long a;

    protected ChromiumUrlRequestContext(Context context, String s, CronetEngine.Builder builder)
    {
        byte byte0 = 3;
        super();
        CronetLibraryLoader.a(context, builder);
        if (Log.isLoggable("ChromiumNetwork", 2))
        {
            byte0 = -2;
        } else
        if (Log.isLoggable("ChromiumNetwork", 3))
        {
            byte0 = -1;
        }
        a = nativeCreateRequestContextAdapter(s, byte0, builder.toString());
        if (a == 0L)
        {
            throw new NullPointerException("Context Adapter creation failed");
        } else
        {
            context = new Runnable() {

                private ChromiumUrlRequestContext a;

                public final void run()
                {
                    ChromiumUrlRequestContext.a(a, ChromiumUrlRequestContext.a(a));
                }

            
            {
                a = ChromiumUrlRequestContext.this;
                super();
            }
            };
            (new Handler(Looper.getMainLooper())).post(context);
            return;
        }
    }

    static long a(ChromiumUrlRequestContext chromiumurlrequestcontext)
    {
        return chromiumurlrequestcontext.a;
    }

    static void a(ChromiumUrlRequestContext chromiumurlrequestcontext, long l)
    {
        chromiumurlrequestcontext.nativeInitRequestContextOnMainThread(l);
    }

    private void initNetworkThread()
    {
        Thread.currentThread().setName("ChromiumNet");
        Process.setThreadPriority(10);
    }

    private native long nativeCreateRequestContextAdapter(String s, int i, String s1);

    private native String nativeGetStatisticsJSON(String s);

    private native void nativeInitRequestContextOnMainThread(long l);

    private native void nativeInitializeStatistics();

    private native void nativeReleaseRequestContextAdapter(long l);

    private native void nativeStartNetLogToFile(long l, String s, boolean flag);

    private native void nativeStopNetLog(long l);

    protected void finalize()
    {
        if (a != 0L)
        {
            nativeReleaseRequestContextAdapter(a);
        }
        super.finalize();
    }
}
