// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;

import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.dash.DashSegmentIndex;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//            Representation, RangedUri

public class g extends Representation
    implements DashSegmentIndex
{

    private final g g;

    public final int a()
    {
        return g.g();
    }

    public final int a(long l)
    {
        return g.g(l - d * 1000L);
    }

    public final long a(int i)
    {
        return g.g(i) + d * 1000L;
    }

    public final int b()
    {
        return g.g();
    }

    public final long b(int i)
    {
        return g.g(i);
    }

    public final RangedUri c(int i)
    {
        return g.g(this, i);
    }

    public final boolean c()
    {
        return g.g();
    }

    public final RangedUri e()
    {
        return null;
    }

    public final DashSegmentIndex f()
    {
        return this;
    }

    public (long l, long l1, String s, long l2, 
            Format format,  )
    {
        super(l, l1, s, l2, format, , (byte)0);
        g = ;
    }
}
