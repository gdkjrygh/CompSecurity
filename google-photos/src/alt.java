// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class alt
{

    private String a;
    private String b;
    private String c;
    private alu d;

    public alt(alq alq, String s, String s1, String s2, alu alu)
    {
        a = s;
        b = s1;
        c = s2;
        d = alu;
        super();
    }

    public final String toString()
    {
        String s = b;
        String s1 = c;
        String s2 = a;
        String s3 = String.valueOf(d);
        return (new StringBuilder(String.valueOf(s).length() + 14 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append(s1).append(" NS(").append(s2).append("), FORM (").append(s3).append(")").toString();
    }
}
