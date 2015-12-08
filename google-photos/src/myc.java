// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class myc
{

    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final oqe e;

    public myc(String s, String s1, String s2, int i)
    {
        if (s.length() > 31)
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 25)).append("\"").append(s).append("\".length() > 31").toString());
        } else
        {
            a = s;
            b = s1;
            d = s2;
            c = i;
            e = new oqe(s, null);
            return;
        }
    }
}
