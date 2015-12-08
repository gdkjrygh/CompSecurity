// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fcs
{

    public final String a;
    public final Integer b;
    public final Integer c;

    fcs(String s, Integer integer, Integer integer1)
    {
        a = s;
        b = integer;
        c = integer1;
    }

    public final String toString()
    {
        String s = String.valueOf("ExistenceDetails {sha1=");
        String s1 = a;
        String s2 = String.valueOf(b);
        String s3 = String.valueOf(c);
        return (new StringBuilder(String.valueOf(s).length() + 18 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append(s1).append(", width=").append(s2).append(", height=").append(s3).append("}").toString();
    }
}
