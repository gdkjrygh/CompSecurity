// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//            AdaptationSet

public class Period
{

    public final String a;
    public final long b;
    public final long c;
    public final List d;

    public Period(String s, long l, long l1, List list)
    {
        a = s;
        b = l;
        c = l1;
        d = Collections.unmodifiableList(list);
    }

    public final int a(int i)
    {
        int k = d.size();
        for (int j = 0; j < k; j++)
        {
            if (((AdaptationSet)d.get(j)).b == i)
            {
                return j;
            }
        }

        return -1;
    }
}
