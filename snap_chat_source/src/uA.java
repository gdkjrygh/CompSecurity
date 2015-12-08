// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class uA extends RuntimeException
{

    public final IllegalArgumentException a;
    public final String b;

    public uA(String s, String s1)
    {
        a = new IllegalArgumentException(s);
        b = s1;
    }
}
