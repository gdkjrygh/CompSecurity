// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;

import java.util.List;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//            RangedUri, Representation

public class h extends Base
{

    final List h;

    public final RangedUri a(Representation representation, int i)
    {
        return (RangedUri)h.get(i - e);
    }

    public final int c()
    {
        return (e + h.size()) - 1;
    }

    public final boolean d()
    {
        return true;
    }

    public Base(RangedUri rangeduri, long l, long l1, long l2, 
            int i, long l3, List list, List list1)
    {
        super(rangeduri, l, l1, l2, i, l3, list);
        h = list1;
    }
}
