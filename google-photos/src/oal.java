// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class oal
    implements Comparable
{

    private int a;
    private int b;
    private String c;

    oal()
    {
    }

    static int a(oal oal1, int i)
    {
        oal1.a = i;
        return i;
    }

    static String a(oal oal1, String s)
    {
        oal1.c = s;
        return s;
    }

    static int b(oal oal1, int i)
    {
        oal1.b = i;
        return i;
    }

    public final int compareTo(Object obj)
    {
label0:
        {
label1:
            {
                obj = (oal)obj;
                int j = c.compareTo(((oal) (obj)).c);
                int i = j;
                if (j == 0)
                {
                    if (a != ((oal) (obj)).a)
                    {
                        break label0;
                    }
                    if (b != ((oal) (obj)).b)
                    {
                        break label1;
                    }
                    i = 0;
                }
                return i;
            }
            return b - ((oal) (obj)).b;
        }
        return a - ((oal) (obj)).a;
    }
}
