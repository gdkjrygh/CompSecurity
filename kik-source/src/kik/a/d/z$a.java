// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;


// Referenced classes of package kik.a.d:
//            z

public static final class d extends Enum
{

    public static final b a;
    public static final b b;
    private static final b e[];
    String c;
    int d;

    public static um a(int i)
    {
        um aum[] = values();
        int k = aum.length;
        for (int j = 0; j < k; j++)
        {
            um um = aum[j];
            if (um.d == i)
            {
                return um;
            }
        }

        return b;
    }

    public static ring valueOf(String s)
    {
        return (ring)Enum.valueOf(kik/a/d/z$a, s);
    }

    public static ring[] values()
    {
        return (ring[])e.clone();
    }

    public final int a()
    {
        return d;
    }

    static 
    {
        a = new <init>("TEXT", 0, "text", 0);
        b = new <init>("UNSUPPORTED", 1, "unsupported", -1);
        e = (new e[] {
            a, b
        });
    }

    private ring(String s, int i, String s1, int j)
    {
        super(s, i);
        c = s1;
        d = j;
    }
}
