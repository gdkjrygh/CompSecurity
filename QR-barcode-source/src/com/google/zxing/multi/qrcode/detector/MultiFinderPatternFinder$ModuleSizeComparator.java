// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.qrcode.detector.FinderPattern;
import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.google.zxing.multi.qrcode.detector:
//            MultiFinderPatternFinder

private static final class <init>
    implements Comparator, Serializable
{

    public int compare(FinderPattern finderpattern, FinderPattern finderpattern1)
    {
        float f = finderpattern1.getEstimatedModuleSize() - finderpattern.getEstimatedModuleSize();
        if ((double)f < 0.0D)
        {
            return -1;
        }
        return (double)f <= 0.0D ? 0 : 1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((FinderPattern)obj, (FinderPattern)obj1);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
