// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cw;


// Referenced classes of package p.cw:
//            b

public static final class .String extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/cw/b$b, s);
    }

    public static .String[] values()
    {
        return (.String[])d.clone();
    }

    static 
    {
        a = new <init>("STARTING", 0);
        b = new <init>("REPLAYING", 1);
        c = new <init>("RESUMING", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private .String(String s, int i)
    {
        super(s, i);
    }
}
