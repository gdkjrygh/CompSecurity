// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;


// Referenced classes of package p.dg:
//            l

static final class .String extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/dg/l$e, s);
    }

    public static .String[] values()
    {
        return (.String[])d.clone();
    }

    static 
    {
        a = new <init>("NEXT", 0);
        b = new <init>("NEXT_AFTER_AUDIOAD_POD", 1);
        c = new <init>("ALL", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private .String(String s, int i)
    {
        super(s, i);
    }
}
