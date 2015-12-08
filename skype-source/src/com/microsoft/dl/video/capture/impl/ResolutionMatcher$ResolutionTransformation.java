// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl;

import com.microsoft.dl.video.capture.api.Resolution;

// Referenced classes of package com.microsoft.dl.video.capture.impl:
//            ResolutionMatcher

public static class c
{

    private final Resolution a;
    private final Resolution b;
    private final c c;

    public Resolution getFrom()
    {
        return a;
    }

    public Resolution getTo()
    {
        return b;
    }

    public b getTransformation()
    {
        return c;
    }

    public String toString()
    {
        return (new StringBuilder()).append(a).append("->").append(b).append(" ").append(c).toString();
    }

    public (Resolution resolution, Resolution resolution1,  )
    {
        a = resolution;
        b = resolution1;
        c = ;
    }
}
