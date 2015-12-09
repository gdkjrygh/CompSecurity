// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bo;


// Referenced classes of package p.bo:
//            b

static final class e extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d f[];
    public final int e;

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/bo/b$c, s);
    }

    public static .String[] values()
    {
        return (.String[])f.clone();
    }

    static 
    {
        a = new <init>("NONE", 0, 0);
        b = new <init>("BYTE", 1, 1);
        c = new <init>("SHORT", 2, 2);
        d = new <init>("WORD", 3, 4);
        f = (new f[] {
            a, b, c, d
        });
    }

    private .String(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }
}
