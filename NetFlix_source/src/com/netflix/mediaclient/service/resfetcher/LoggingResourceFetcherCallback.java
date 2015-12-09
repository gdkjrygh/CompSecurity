// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.resfetcher;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.resfetcher:
//            ResourceFetcherCallback

public class LoggingResourceFetcherCallback
    implements ResourceFetcherCallback
{

    private static final String TAG = "nf_service_resfetcher_callback";

    public LoggingResourceFetcherCallback()
    {
    }

    public void onResourceFetched(String s, String s1, int i)
    {
        Log.i("nf_service_resfetcher_callback", String.format("Resource %s fetched and saved at %s, status %d", new Object[] {
            s, s1, Integer.valueOf(i)
        }));
    }

    public void onResourcePrefetched(String s, int i, int j)
    {
        if (Log.isLoggable("nf_service_resfetcher_callback", 3))
        {
            Log.d("nf_service_resfetcher_callback", String.format("Resource %s prefetched, status %d", new Object[] {
                s, Integer.valueOf(j)
            }));
        }
        if (j != 0)
        {
            Log.w("nf_service_resfetcher_callback", String.format("Resource %s could not be prefetched, status %d", new Object[] {
                s, Integer.valueOf(j)
            }));
        }
    }
}
