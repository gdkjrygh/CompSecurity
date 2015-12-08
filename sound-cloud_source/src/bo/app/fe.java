// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            fb, ff, fg, fh, 
//            fi

abstract class fe extends Enum
    implements fb
{

    public static final fe a;
    public static final fe b;
    public static final fe c;
    public static final fe d;
    private static final fe e[];

    private fe(String s, int i)
    {
        super(s, i);
    }

    fe(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static fe valueOf(String s)
    {
        return (fe)Enum.valueOf(bo/app/fe, s);
    }

    public static fe[] values()
    {
        return (fe[])e.clone();
    }

    static 
    {
        a = new ff("ALWAYS_TRUE");
        b = new fg("ALWAYS_FALSE");
        c = new fh("IS_NULL");
        d = new fi("NOT_NULL");
        e = (new fe[] {
            a, b, c, d
        });
    }
}
