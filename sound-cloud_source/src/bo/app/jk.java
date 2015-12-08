// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class jk extends Enum
{

    public static final jk a;
    public static final jk b;
    public static final jk c;
    private static final jk d[];

    private jk(String s, int i)
    {
        super(s, i);
    }

    public static jk valueOf(String s)
    {
        return (jk)Enum.valueOf(bo/app/jk, s);
    }

    public static jk[] values()
    {
        return (jk[])d.clone();
    }

    static 
    {
        a = new jk("NETWORK", 0);
        b = new jk("DISC_CACHE", 1);
        c = new jk("MEMORY_CACHE", 2);
        d = (new jk[] {
            a, b, c
        });
    }
}
