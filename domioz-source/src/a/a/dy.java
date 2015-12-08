// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


// Referenced classes of package a.a:
//            dv, ea, eb, ec, 
//            ed

abstract class dy extends Enum
    implements dv
{

    public static final dy a;
    public static final dy b;
    public static final dy c;
    public static final dy d;
    private static final dy e[];

    private dy(String s, int i)
    {
        super(s, i);
    }

    dy(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static dy valueOf(String s)
    {
        return (dy)Enum.valueOf(a/a/dy, s);
    }

    public static dy[] values()
    {
        return (dy[])e.clone();
    }

    static 
    {
        a = new ea("ALWAYS_TRUE");
        b = new eb("ALWAYS_FALSE");
        c = new ec("IS_NULL");
        d = new ed("NOT_NULL");
        e = (new dy[] {
            a, b, c, d
        });
    }
}
