// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio;


// Referenced classes of package com.nuance.dragon.toolkit.audio:
//            e, i, j

public abstract class h
{

    public final e a;
    public final byte b[];
    public final short c[];
    public final int d;
    public final long e;
    public final long f;
    public final i g;
    public final j h[];

    protected h(e e1, short aword0[], byte abyte0[], long l, int i, i j, 
            j aj[])
    {
        a = e1;
        c = aword0;
        b = abyte0;
        e = l;
        f = (long)i + l;
        d = i;
        g = j;
        h = aj;
    }

    public final String toString()
    {
        byte byte0 = -1;
        StringBuilder stringbuilder = (new StringBuilder("[")).append(a).append("], ");
        int i;
        if (b == null)
        {
            i = -1;
        } else
        {
            i = b.length;
        }
        stringbuilder = stringbuilder.append(i).append(", ");
        if (c == null)
        {
            i = byte0;
        } else
        {
            i = c.length;
        }
        return stringbuilder.append(i).append(", ").append(d).append(", ").append(e).append(", ").append(f).append(", ").append(g).toString();
    }
}
