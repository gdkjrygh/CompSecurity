// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gka
{

    public final String a;
    public final String b;
    public final String c;
    public final String d;

    private gka()
    {
        this("", "", "", "");
    }

    private gka(String s, String s1, String s2, String s3)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
    }

    gka(String s, String s1, String s2, String s3, byte byte0)
    {
        this(s, s1, s2, s3);
    }

    // Unreferenced inner class gka$1

/* anonymous class */
    final class _cls1
        implements hfz
    {

        public final Object a(Object obj, Object obj1, Object obj2, Object obj3)
        {
            return new gka((String)obj, (String)obj1, (String)obj2, (String)obj3, (byte)0);
        }

    }

}
