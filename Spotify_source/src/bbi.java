// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bbi
{

    private String a;
    private String b;

    public bbi(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append(", ").append(b).toString();
    }
}
