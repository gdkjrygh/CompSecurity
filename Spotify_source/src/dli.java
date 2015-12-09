// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dli
{

    public String a;
    private String b;

    public dli()
    {
        a = "";
        b = "";
    }

    public dli(String s, String s1)
    {
        a = "";
        b = "";
        a = s;
        b = s1;
    }

    public final boolean equals(Object obj)
    {
        return obj != null && (obj instanceof dli) && ((dli)obj).a.equals(a) && ((dli)obj).b.equals(b);
    }

    public final int hashCode()
    {
        return (new StringBuilder()).append(a).append(b).toString().hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append(" (").append(b).append(")").toString();
    }
}
