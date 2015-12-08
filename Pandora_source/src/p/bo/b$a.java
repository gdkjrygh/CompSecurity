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
    public final byte e;

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/bo/b$a, s);
    }

    public static .String[] values()
    {
        return (.String[])f.clone();
    }

    public String a()
    {
        return name().toLowerCase();
    }

    static 
    {
        a = new <init>("BYTES", 0, 0);
        b = new <init>("STRING", 1, 1);
        c = new <init>("UINT", 2, 2);
        d = new <init>("INT", 3, 3);
        f = (new f[] {
            a, b, c, d
        });
    }

    private .String(String s, int i, int j)
    {
        super(s, i);
        e = (byte)j;
    }
}
