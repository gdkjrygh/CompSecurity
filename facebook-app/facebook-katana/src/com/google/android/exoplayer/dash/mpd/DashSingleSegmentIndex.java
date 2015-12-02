// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;

import com.google.android.exoplayer.dash.DashSegmentIndex;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//            RangedUri

final class DashSingleSegmentIndex
    implements DashSegmentIndex
{

    private final long a;
    private final long b;
    private final RangedUri c;

    public DashSingleSegmentIndex(long l, long l1, RangedUri rangeduri)
    {
        a = l;
        b = l1;
        c = rangeduri;
    }

    public final int a()
    {
        return 0;
    }

    public final int a(long l)
    {
        return 0;
    }

    public final long a(int i)
    {
        return a;
    }

    public final int b()
    {
        return 0;
    }

    public final long b(int i)
    {
        return b;
    }

    public final RangedUri c(int i)
    {
        return c;
    }

    public final boolean c()
    {
        return true;
    }
}
