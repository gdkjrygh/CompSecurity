// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cz;

import p.al.f;
import p.an.k;
import p.l.a;

// Referenced classes of package p.cz:
//            b

private class c
    implements f
{

    final b a;
    private final int b;
    private final a c;

    public volatile boolean a(Exception exception, Object obj, k k, boolean flag)
    {
        return a(exception, (String)obj, k, flag);
    }

    public boolean a(Exception exception, String s, k k, boolean flag)
    {
        a.a((new StringBuilder()).append("Failed to get station art for stationId=").append(b).toString(), exception);
        return false;
    }

    public volatile boolean a(Object obj, Object obj1, k k, boolean flag, boolean flag1)
    {
        return a((byte[])obj, (String)obj1, k, flag, flag1);
    }

    public boolean a(byte abyte0[], String s, k k, boolean flag, boolean flag1)
    {
        a.a((new StringBuilder()).append("Got station art for statinId=").append(b).append(", placing in ready queue to send segments. ").append("(dataLength=").append(abyte0.length).append(")").toString());
        c.a(null);
        p.cz.b.a(a, new p.do.<init>(a, b, abyte0.length, c));
        return false;
    }

    public .String(b b1, int i, a a1)
    {
        a = b1;
        super();
        b = i;
        c = a1;
    }
}
