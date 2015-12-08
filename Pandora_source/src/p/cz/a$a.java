// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cz;

import p.l.a;

// Referenced classes of package p.cz:
//            a

private static class e
{

    public final int a;
    public final int b;
    public int c;
    public String d;
    public a e;

    public String toString()
    {
        return (new StringBuilder()).append("GenreStationArt: categoryIndex=").append(a).append(", stationIndex=").append(b).append(", dataLength=").append(c).append(", artUrl=").append(d).toString();
    }

    public .String(int i, int j, int k, String s, a a1)
    {
        a = i;
        b = j;
        c = k;
        d = s;
        e = a1;
    }
}
