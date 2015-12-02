// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;

import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.util.Util;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//            Representation, UrlTemplate, RangedUri

public class j extends 
{

    final UrlTemplate h;
    final UrlTemplate i;
    private final String j;

    public final RangedUri a(Representation representation)
    {
        if (h != null)
        {
            representation = h.a(representation.c.a, 0, representation.c.c, 0L);
            return new RangedUri(j, representation, 0L, -1L);
        } else
        {
            return super.a(representation);
        }
    }

    public final RangedUri a(Representation representation, int k)
    {
        long l;
        if (g != null)
        {
            l = ((lement)g.get(k - e)).a;
        } else
        {
            l = (long)(k - e) * f;
        }
        representation = i.a(representation.c.a, k, representation.c.c, l);
        return new RangedUri(j, representation, 0L, -1L);
    }

    public final int c()
    {
        if (g != null)
        {
            return (g.size() + e) - 1;
        }
        if (d == -1L)
        {
            return -1;
        } else
        {
            long l = (f * 1000L) / b;
            int k = e;
            return ((int)Util.a(d, l) + k) - 1;
        }
    }

    public lement(RangedUri rangeduri, long l, long l1, long l2, 
            int k, long l3, List list, UrlTemplate urltemplate, UrlTemplate urltemplate1, String s)
    {
        super(rangeduri, l, l1, l2, k, l3, list);
        h = urltemplate;
        i = urltemplate1;
        j = s;
    }
}
