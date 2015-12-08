// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import android.util.SparseArray;
import com.netflix.mediaclient.servicemgr.INetflixServiceCallback;
import com.netflix.mediaclient.util.ThreadUtils;

// Referenced classes of package com.netflix.mediaclient.service:
//            NetflixService

private static class <init> extends SparseArray
{

    public int put(INetflixServiceCallback inetflixservicecallback)
    {
        ThreadUtils.assertOnMain();
        int i = inetflixservicecallback.hashCode();
        super.put(i, inetflixservicecallback);
        return i;
    }

    public INetflixServiceCallback remove(INetflixServiceCallback inetflixservicecallback)
    {
        ThreadUtils.assertOnMain();
        int i = inetflixservicecallback.hashCode();
        inetflixservicecallback = (INetflixServiceCallback)get(i);
        super.remove(i);
        return inetflixservicecallback;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
