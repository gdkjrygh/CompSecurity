// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.os.AsyncTask;

// Referenced classes of package com.mopub.common:
//            CacheService

final class b extends AsyncTask
{

    private final String a;
    private final byte b[];

    b(String s, byte abyte0[])
    {
        a = s;
        b = abyte0;
    }

    protected final Object doInBackground(Object aobj[])
    {
        CacheService.putToDiskCache(a, b);
        return null;
    }
}
