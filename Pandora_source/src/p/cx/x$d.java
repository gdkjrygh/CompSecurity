// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;


// Referenced classes of package p.cx:
//            x

public static final class e extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d f[];
    private final int e;

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/cx/x$d, s);
    }

    public static .String[] values()
    {
        return (.String[])f.clone();
    }

    public int a()
    {
        return e;
    }

    static 
    {
        a = new <init>("Unknown", 0, 0);
        b = new <init>("Unseen", 1, 1);
        c = new <init>("Seen", 2, 2);
        d = new <init>("Deleted", 3, 3);
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
