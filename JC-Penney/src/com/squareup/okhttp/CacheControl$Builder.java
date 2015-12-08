// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.okhttp:
//            CacheControl

public final class minFreshSeconds
{

    int maxAgeSeconds;
    int maxStaleSeconds;
    int minFreshSeconds;
    boolean noCache;
    boolean noStore;
    boolean noTransform;
    boolean onlyIfCached;

    public CacheControl build()
    {
        return new CacheControl(this, null);
    }

    public minFreshSeconds maxAge(int i, TimeUnit timeunit)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("maxAge < 0: ").append(i).toString());
        }
        long l = timeunit.toSeconds(i);
        if (l > 0x7fffffffL)
        {
            i = 0x7fffffff;
        } else
        {
            i = (int)l;
        }
        maxAgeSeconds = i;
        return this;
    }

    public maxAgeSeconds maxStale(int i, TimeUnit timeunit)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("maxStale < 0: ").append(i).toString());
        }
        long l = timeunit.toSeconds(i);
        if (l > 0x7fffffffL)
        {
            i = 0x7fffffff;
        } else
        {
            i = (int)l;
        }
        maxStaleSeconds = i;
        return this;
    }

    public maxStaleSeconds minFresh(int i, TimeUnit timeunit)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("minFresh < 0: ").append(i).toString());
        }
        long l = timeunit.toSeconds(i);
        if (l > 0x7fffffffL)
        {
            i = 0x7fffffff;
        } else
        {
            i = (int)l;
        }
        minFreshSeconds = i;
        return this;
    }

    public minFreshSeconds noCache()
    {
        noCache = true;
        return this;
    }

    public noCache noStore()
    {
        noStore = true;
        return this;
    }

    public noStore noTransform()
    {
        noTransform = true;
        return this;
    }

    public noTransform onlyIfCached()
    {
        onlyIfCached = true;
        return this;
    }

    public ()
    {
        maxAgeSeconds = -1;
        maxStaleSeconds = -1;
        minFreshSeconds = -1;
    }
}
