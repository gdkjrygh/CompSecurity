// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.c;


// Referenced classes of package b.a.a.a.a.c:
//            n

public final class i extends Enum
{

    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    private static final int e[];

    static int a(n n1, Object obj)
    {
        int j;
        if (obj instanceof n)
        {
            j = ((n)obj).a();
        } else
        {
            j = b;
        }
        return j - 1 - (n1.a() - 1);
    }

    static 
    {
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        e = (new int[] {
            a, b, c, d
        });
    }
}
