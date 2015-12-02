// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;

import android.net.Uri;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.dash.DashSegmentIndex;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//            Representation, DashSingleSegmentIndex, RangedUri

public class j extends Representation
{

    public final Uri g;
    public final long h;
    private final RangedUri i;
    private final DashSingleSegmentIndex j;

    public final RangedUri e()
    {
        return i;
    }

    public final DashSegmentIndex f()
    {
        return j;
    }

    public (long l, long l1, String s, long l2, 
            Format format,  , long l3)
    {
        super(l, l1, s, l2, format, , (byte)0);
        g = Uri.parse(.g);
        i = .i();
        h = l3;
        if (i != null)
        {
            s = null;
        } else
        {
            s = new DashSingleSegmentIndex(l * 1000L, l1 * 1000L, new RangedUri(.i, null, 0L, -1L));
        }
        j = s;
    }
}
