// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jsx
{

    public static final String a;
    public static final String b;

    static 
    {
        a = String.valueOf(jxz.a / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        b = (new StringBuilder("ma")).append(a).toString();
    }
}
