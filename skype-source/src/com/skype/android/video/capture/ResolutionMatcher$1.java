// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;

import com.skype.android.video.hw.format.Resolution;
import java.util.Comparator;

// Referenced classes of package com.skype.android.video.capture:
//            ResolutionMatcher

static final class timatedResolution
    implements Comparator
{

    private int signum(float f)
    {
        if ((double)Math.abs(f) < 0.01D)
        {
            return 0;
        } else
        {
            return (int)Math.signum(f);
        }
    }

    public final int compare(timatedResolution timatedresolution, timatedResolution timatedresolution1)
    {
        int i = signum(timatedresolution.estimates.zoom - timatedresolution1.estimates.zoom);
        if (i != 0)
        {
            return i;
        }
        i = signum(timatedresolution.estimates.crop - timatedresolution1.estimates.crop);
        if (i != 0)
        {
            return i;
        } else
        {
            return Integer.signum(timatedresolution.resolution.getWidth() * timatedresolution.resolution.getHeight() - timatedresolution1.resolution.getWidth() * timatedresolution1.resolution.getHeight());
        }
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((timatedResolution)obj, (timatedResolution)obj1);
    }

    timatedResolution()
    {
    }
}
