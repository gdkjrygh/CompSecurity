// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;

public final class cog
{

    public static final cog a = new cog(new long[0]);
    public final long b[];

    public cog(long al[])
    {
        b = (long[])b.a(al, "keyFrameTimestampsUs", null);
    }

    public final Pair a(long l)
    {
        Long long2 = null;
        if (b.length == 0)
        {
            return Pair.create(null, null);
        }
        int i = b.b(l, b);
        int j = b.a(l, b);
        Long long1;
        if (i >= 0)
        {
            long1 = Long.valueOf(b[i]);
        } else
        {
            long1 = null;
        }
        if (j < b.length)
        {
            long2 = Long.valueOf(b[j]);
        }
        return Pair.create(long1, long2);
    }

}
