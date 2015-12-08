// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture;

import com.microsoft.dl.video.capture.api.FpsRange;
import java.util.Comparator;

// Referenced classes of package com.microsoft.dl.video.capture:
//            Capturer

class a
    implements Comparator
{

    final int a;
    final Capturer b;

    public int compare(FpsRange fpsrange, FpsRange fpsrange1)
    {
        if (fpsrange.getMin() < a || fpsrange1.getMin() >= a) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        int j;
        if (fpsrange.getMin() < a && fpsrange1.getMin() >= a)
        {
            return 1;
        }
        j = 0;
        if (fpsrange.getMin() < a || fpsrange1.getMin() < a) goto _L4; else goto _L3
_L3:
        int i = fpsrange.getMax() - fpsrange1.getMax();
_L6:
        j = fpsrange1.getMax() - fpsrange1.getMin() - (fpsrange.getMax() - fpsrange.getMin());
        if (i > 0)
        {
            return 1;
        }
        break; /* Loop/switch isn't completed */
_L4:
        i = j;
        if (fpsrange.getMin() < a)
        {
            i = j;
            if (fpsrange1.getMin() < a)
            {
                i = fpsrange1.getMin() - fpsrange.getMin();
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (i >= 0)
        {
            if (j > 0)
            {
                return 1;
            }
            if (j >= 0)
            {
                return 0;
            }
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((FpsRange)obj, (FpsRange)obj1);
    }

    e(Capturer capturer, int i)
    {
        b = capturer;
        a = i;
        super();
    }
}
