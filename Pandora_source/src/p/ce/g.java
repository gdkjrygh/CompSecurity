// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ce;


public class g
{

    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;

    public g(String s, String s1, String s2, boolean flag, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, boolean flag1)
    {
        a = s;
        b = s1;
        c = s2;
        d = flag;
        e = s3;
        f = s4;
        g = s5;
        i = s6;
        h = s7;
        j = s8;
        k = s9;
        l = flag1;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<").append(a);
        stringbuilder.append(",").append(b);
        stringbuilder.append(",").append(c);
        stringbuilder.append(",").append(d);
        stringbuilder.append(">");
        return stringbuilder.toString();
    }
}
