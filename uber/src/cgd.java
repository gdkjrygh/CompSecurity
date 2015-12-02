// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cgd extends Enum
{

    public static final cgd a;
    public static final cgd b;
    public static final cgd c;
    private static final cgd e[];
    final int d;

    private cgd(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }

    public static boolean a(int i)
    {
        return (a.d & i) == 0;
    }

    public static boolean b(int i)
    {
        return (b.d & i) == 0;
    }

    public static boolean c(int i)
    {
        return (c.d & i) != 0;
    }

    public static cgd valueOf(String s)
    {
        return (cgd)Enum.valueOf(cgd, s);
    }

    public static cgd[] values()
    {
        return (cgd[])e.clone();
    }

    static 
    {
        a = new cgd("NO_CACHE", 0, 1);
        b = new cgd("NO_STORE", 1, 2);
        c = new cgd("OFFLINE", 2, 4);
        e = (new cgd[] {
            a, b, c
        });
    }
}
