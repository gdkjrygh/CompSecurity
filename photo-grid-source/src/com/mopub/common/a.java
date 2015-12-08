// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.os.AsyncTask;

// Referenced classes of package com.mopub.common:
//            CacheService

final class a extends AsyncTask
{

    private final CacheService.DiskLruCacheGetListener a;
    private final String b;

    a(String s, CacheService.DiskLruCacheGetListener disklrucachegetlistener)
    {
        a = disklrucachegetlistener;
        b = s;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return CacheService.getFromDiskCache(b);
    }

    protected final void onCancelled()
    {
        if (a != null)
        {
            a.onComplete(b, null);
        }
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (byte[])obj;
        if (isCancelled())
        {
            onCancelled();
        } else
        if (a != null)
        {
            a.onComplete(b, ((byte []) (obj)));
            return;
        }
    }
}
