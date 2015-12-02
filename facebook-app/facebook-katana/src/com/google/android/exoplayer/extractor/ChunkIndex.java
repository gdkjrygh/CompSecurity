// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.exoplayer.extractor:
//            SeekMap

public final class ChunkIndex
    implements SeekMap
{

    public final int a;
    public final int b[];
    public final long c[];
    public final long d[];
    public final long e[];

    public ChunkIndex(int ai[], long al[], long al1[], long al2[])
    {
        a = ai.length;
        b = ai;
        c = al;
        d = al1;
        e = al2;
    }

    public final int a(long l)
    {
        return Util.a(e, l, true, true);
    }

    public final boolean a()
    {
        return true;
    }

    public final long b(long l)
    {
        return c[a(l)];
    }
}
