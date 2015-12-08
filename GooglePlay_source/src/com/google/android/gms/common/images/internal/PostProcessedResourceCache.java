// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images.internal;

import android.support.v4.util.LruCache;
import java.util.Arrays;

public final class PostProcessedResourceCache extends LruCache
{
    public static final class PostProcessedResource
    {

        public final int postProcessingFlags;
        public final int resId;

        public final boolean equals(Object obj)
        {
            if (obj instanceof PostProcessedResource)
            {
                if (this == obj)
                {
                    return true;
                }
                obj = (PostProcessedResource)obj;
                if (((PostProcessedResource) (obj)).resId == resId && ((PostProcessedResource) (obj)).postProcessingFlags == postProcessingFlags)
                {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                Integer.valueOf(resId), Integer.valueOf(postProcessingFlags)
            });
        }

        public PostProcessedResource(int i, int j)
        {
            resId = i;
            postProcessingFlags = j;
        }
    }


    public PostProcessedResourceCache()
    {
        super(10);
    }
}
