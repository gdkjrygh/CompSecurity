// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;


// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//            SegmentBase, RangedUri

public class <init> extends SegmentBase
{

    public final String d;
    final long e;
    final long f;

    public final RangedUri b()
    {
        if (f <= 0L)
        {
            return null;
        } else
        {
            return new RangedUri(d, null, e, f);
        }
    }

    public I(RangedUri rangeduri, long l, long l1, String s, long l2, long l3)
    {
        super(rangeduri, l, l1);
        d = s;
        e = l2;
        f = l3;
    }

    public f(String s)
    {
        this(null, 1L, 0L, s, 0L, -1L);
    }
}
