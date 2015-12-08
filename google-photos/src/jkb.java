// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jkb
    implements jko
{

    private long b[];
    private long c[];

    public jkb(int ai[], long al[], long al1[], long al2[])
    {
        b = al;
        c = al2;
    }

    public final long a(long l)
    {
        return b[jno.a(c, l, true, true)];
    }

    public final boolean a()
    {
        return true;
    }
}
