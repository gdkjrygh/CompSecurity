// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


public final class l extends Enum
{

    public static final l a;
    public static final l b;
    public static final l c;
    private static final l d[];

    private l(String s, int i)
    {
        super(s, i);
    }

    public static l valueOf(String s)
    {
        return (l)Enum.valueOf(p/bh/l, s);
    }

    public static l[] values()
    {
        return (l[])d.clone();
    }

    static 
    {
        a = new l("MANUAL_ONLY", 0);
        b = new l("VR_ONLY", 1);
        c = new l("BOTH", 2);
        d = (new l[] {
            a, b, c
        });
    }
}
