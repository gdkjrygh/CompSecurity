// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;

import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//            RangedUri, Representation

public abstract class SegmentBase
{

    final RangedUri a;
    final long b;
    final long c;

    public SegmentBase(RangedUri rangeduri, long l, long l1)
    {
        a = rangeduri;
        b = l;
        c = l1;
    }

    public final long a()
    {
        return Util.a(c, 0xf4240L, b);
    }

    public RangedUri a(Representation representation)
    {
        return a;
    }
}
