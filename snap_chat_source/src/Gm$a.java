// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


static final class c extends Enum
{

    public static final b a;
    public static final b b;
    private static final b d[];
    final int c;

    public static lang.String valueOf(String s)
    {
        return (Of)Enum.valueOf(Gm$a, s);
    }

    public static lang.String[] values()
    {
        return (s[])d.clone();
    }

    static 
    {
        a = new <init>("EMOJI", 0, 0);
        b = new <init>("SPACER", 1, 1);
        d = (new d[] {
            a, b
        });
    }

    private >(String s, int i, int j)
    {
        super(s, i);
        c = j;
    }
}
