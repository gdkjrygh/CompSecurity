// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class alC extends IllegalArgumentException
{

    public alC(long l, String s)
    {
        String s1 = anl.a("yyyy-MM-dd'T'HH:mm:ss.SSS").a(new alD(l));
        if (s != null)
        {
            s = (new StringBuilder(" (")).append(s).append(")").toString();
        } else
        {
            s = "";
        }
        super((new StringBuilder("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ")).append(s1).append(s).toString());
    }

    public alC(String s)
    {
        super(s);
    }
}
