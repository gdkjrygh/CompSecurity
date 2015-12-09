// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images.internal;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.images.internal:
//            PostProcessedResourceCache

public static final class postProcessingFlags
{

    public final int postProcessingFlags;
    public final int resId;

    public final boolean equals(Object obj)
    {
        if (obj instanceof postProcessingFlags)
        {
            if (this == obj)
            {
                return true;
            }
            obj = (postProcessingFlags)obj;
            if (((postProcessingFlags) (obj)).resId == resId && ((resId) (obj)).postProcessingFlags == postProcessingFlags)
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

    public (int i, int j)
    {
        resId = i;
        postProcessingFlags = j;
    }
}
