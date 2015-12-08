// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.virtual.impl;

import com.microsoft.dl.video.capture.api.Resolution;

// Referenced classes of package com.microsoft.dl.video.capture.impl.virtual.impl:
//            FrameProducer

public static class p.getVOffset
{

    private final int a;
    private final int b;
    private final int c;

    static int a(p.getVOffset getvoffset)
    {
        return getvoffset.a;
    }

    static int b(a a1)
    {
        return a1.b;
    }

    static int c(b b1)
    {
        return b1.c;
    }

    public final int getLeft()
    {
        return a;
    }

    public final int getSize()
    {
        return c;
    }

    public final int getTop()
    {
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [left=").append(a).append(", top=").append(b).append(", size=").append(c).append("]").toString();
    }

    public p(p p, Resolution resolution)
    {
        int i = Math.max(resolution.getWidth(), resolution.getHeight());
        int j = Math.min(resolution.getWidth(), resolution.getHeight());
        c = Math.min((int)((p.getSize() * (float)i) / 100F), j);
        a = Math.min(i - c, (int)(p.getHOffset() * (float)i) / 100);
        b = Math.min(j - c, (int)(p.getVOffset() * (float)i) / 100);
    }
}
