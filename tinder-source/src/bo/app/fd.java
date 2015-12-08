// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            fa, fe, ff, fg, 
//            fh

abstract class fd extends Enum
    implements fa
{

    public static final fd a;
    public static final fd b;
    public static final fd c;
    public static final fd d;
    private static final fd e[];

    private fd(String s, int i)
    {
        super(s, i);
    }

    fd(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static fd valueOf(String s)
    {
        return (fd)Enum.valueOf(bo/app/fd, s);
    }

    public static fd[] values()
    {
        return (fd[])e.clone();
    }

    static 
    {
        a = new fe("ALWAYS_TRUE");
        b = new ff("ALWAYS_FALSE");
        c = new fg("IS_NULL");
        d = new fh("NOT_NULL");
        e = (new fd[] {
            a, b, c, d
        });
    }
}
