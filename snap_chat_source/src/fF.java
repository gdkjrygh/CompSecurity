// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fF
{

    public static int a(long l)
    {
        if (l > 0x7fffffffL || l < 0xffffffff80000000L)
        {
            throw new RuntimeException((new StringBuilder("A cast to int has gone wrong. Please contact the mp4parser discussion group (")).append(l).append(")").toString());
        } else
        {
            return (int)l;
        }
    }
}
