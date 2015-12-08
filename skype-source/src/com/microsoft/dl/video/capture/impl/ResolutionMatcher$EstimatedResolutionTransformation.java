// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl;

import com.microsoft.dl.video.capture.api.Resolution;

// Referenced classes of package com.microsoft.dl.video.capture.impl:
//            ResolutionMatcher

private static class a extends a
    implements Comparable
{

    private final a a;

    private static int a(float f)
    {
        if ((double)Math.abs(f) < 0.01D)
        {
            return 0;
        } else
        {
            return (int)Math.signum(f);
        }
    }

    public int compareTo(a a1)
    {
        int i = a(getEstimates().getEstimates() - a1.getEstimates().getEstimates());
        if (i != 0)
        {
            return i;
        }
        i = a(getEstimates().getEstimates() - a1.getEstimates().getEstimates());
        if (i != 0)
        {
            return i;
        } else
        {
            return Integer.signum(getFrom().getWidth() * getFrom().getHeight() - a1.getFrom().getWidth() * a1.getFrom().getHeight());
        }
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((compareTo)obj);
    }

    public compareTo getEstimates()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.a()).append(" (").append(a).append(")").toString();
    }

    public (Resolution resolution, Resolution resolution1,  ,  1)
    {
        super(resolution, resolution1, );
        a = 1;
    }
}
