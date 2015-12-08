// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.detector;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.google.zxing.qrcode.detector:
//            FinderPatternFinder, FinderPattern

private static final class <init>
    implements Comparator, Serializable
{

    private final float average;

    public int compare(FinderPattern finderpattern, FinderPattern finderpattern1)
    {
        if (finderpattern1.getCount() == finderpattern.getCount())
        {
            float f = Math.abs(finderpattern1.getEstimatedModuleSize() - average);
            float f1 = Math.abs(finderpattern.getEstimatedModuleSize() - average);
            if (f < f1)
            {
                return 1;
            }
            return f != f1 ? -1 : 0;
        } else
        {
            return finderpattern1.getCount() - finderpattern.getCount();
        }
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((FinderPattern)obj, (FinderPattern)obj1);
    }

    private (float f)
    {
        average = f;
    }

    average(float f, average average1)
    {
        this(f);
    }
}
