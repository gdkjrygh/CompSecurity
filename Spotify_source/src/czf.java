// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class czf
{

    public final String a;
    public final Class b;
    public final cyo c;
    public final String d;

    public czf(String s, Class class1, cyo cyo, String s1)
    {
        a = s;
        b = class1;
        c = cyo;
        d = s1;
    }

    public final String toString()
    {
        return (new StringBuilder("[PropertyDescription ")).append(a).append(",").append(b).append(", ").append(c).append("/").append(d).append("]").toString();
    }
}
