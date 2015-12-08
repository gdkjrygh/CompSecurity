// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dfz
    implements Comparable
{

    final String a;
    final String b;
    final String c;
    final String d;

    dfz(dga dga1)
    {
        a = dga1.a;
        b = dga1.b;
        c = dga1.c;
        d = dga1.d;
    }

    public final int compareTo(Object obj)
    {
        obj = (dfz)obj;
        return c.compareTo(((dfz) (obj)).c);
    }
}
