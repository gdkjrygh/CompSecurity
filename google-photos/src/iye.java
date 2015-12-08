// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iye extends Enum
{

    public static final iye a;
    public static final iye b;
    private static final iye c[];

    private iye(String s, int i)
    {
        super(s, i);
    }

    public static iye valueOf(String s)
    {
        return (iye)Enum.valueOf(iye, s);
    }

    public static iye[] values()
    {
        return (iye[])c.clone();
    }

    static 
    {
        a = new iye("LIVE", 0);
        b = new iye("TRASH", 1);
        c = (new iye[] {
            a, b
        });
    }
}
