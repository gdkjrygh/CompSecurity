// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.assist;

import com.nostra13.universalimageloader.cache.disc.DiscCacheAware;
import java.io.File;

public final class DiscCacheUtil
{

    private DiscCacheUtil()
    {
    }

    public static File findInCache(String s, DiscCacheAware disccacheaware)
    {
        s = disccacheaware.get(s);
        if (s.exists())
        {
            return s;
        } else
        {
            return null;
        }
    }

    public static boolean removeFromCache(String s, DiscCacheAware disccacheaware)
    {
        return disccacheaware.get(s).delete();
    }
}
