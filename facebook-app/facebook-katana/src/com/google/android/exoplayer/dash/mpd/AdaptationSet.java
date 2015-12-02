// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;

import java.util.Collections;
import java.util.List;

public class AdaptationSet
{

    public final int a;
    public final int b;
    public final List c;
    public final List d;

    public AdaptationSet(int i, int j, List list)
    {
        this(i, j, list, null);
    }

    public AdaptationSet(int i, int j, List list, List list1)
    {
        a = i;
        b = j;
        c = Collections.unmodifiableList(list);
        if (list1 == null)
        {
            d = Collections.emptyList();
            return;
        } else
        {
            d = Collections.unmodifiableList(list1);
            return;
        }
    }
}
