// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            fg, fk, fl, fm, 
//            fn

abstract class fj extends Enum
    implements fg
{

    public static final fj a;
    public static final fj b;
    public static final fj c;
    public static final fj d;
    private static final fj e[];

    private fj(String s, int i)
    {
        super(s, i);
    }

    fj(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static fj valueOf(String s)
    {
        return (fj)Enum.valueOf(bo/app/fj, s);
    }

    public static fj[] values()
    {
        return (fj[])e.clone();
    }

    static 
    {
        a = new fk("ALWAYS_TRUE");
        b = new fl("ALWAYS_FALSE");
        c = new fm("IS_NULL");
        d = new fn("NOT_NULL");
        e = (new fj[] {
            a, b, c, d
        });
    }
}
