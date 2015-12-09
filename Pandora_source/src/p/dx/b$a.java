// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dx;


// Referenced classes of package p.dx:
//            b

public static final class .String extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/dx/b$a, s);
    }

    public static .String[] values()
    {
        return (.String[])f.clone();
    }

    static 
    {
        a = new <init>("NOT_YET_CONNECTED", 0);
        b = new <init>("CONNECTING", 1);
        c = new <init>("OPEN", 2);
        d = new <init>("CLOSING", 3);
        e = new <init>("CLOSED", 4);
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private .String(String s, int i)
    {
        super(s, i);
    }
}
