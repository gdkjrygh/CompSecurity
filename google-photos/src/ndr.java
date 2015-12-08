// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ndr
{

    public final int a[];
    public final ndg b[];
    public final ndd c[];
    public final ndd d[];

    public ndr(int ai[], ndg andg[], ndd andd[])
    {
        a = ai;
        b = andg;
        c = andd;
        d = new ndd[andd.length];
        for (int i = 0; i < andd.length; i++)
        {
            d[i] = andd[andd.length - 1 - i];
        }

    }
}
