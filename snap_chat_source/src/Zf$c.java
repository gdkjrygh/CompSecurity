// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class d extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c e[];
    final int d;

    public static lang.String valueOf(String s)
    {
        return (Of)Enum.valueOf(Zf$c, s);
    }

    public static lang.String[] values()
    {
        return (s[])e.clone();
    }

    static 
    {
        a = new <init>("MEMORY", 0, 0xff00ff00);
        b = new <init>("DISK", 1, 0xff0000ff);
        c = new <init>("NETWORK", 2, 0xffff0000);
        e = (new e[] {
            a, b, c
        });
    }

    private >(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }
}
