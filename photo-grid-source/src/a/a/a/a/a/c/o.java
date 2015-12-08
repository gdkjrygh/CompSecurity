// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.c;


// Referenced classes of package a.a.a.a.a.c:
//            u

public final class o extends Enum
{

    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    private static final int e[];

    static int a(u u1, Object obj)
    {
        int i;
        if (obj instanceof u)
        {
            i = ((u)obj).a();
        } else
        {
            i = b;
        }
        return i - 1 - (u1.a() - 1);
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
