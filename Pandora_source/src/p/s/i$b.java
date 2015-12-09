// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.s;


// Referenced classes of package p.s:
//            i

private static final class g.String extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];

    public static g.String valueOf(String s)
    {
        return (g.String)Enum.valueOf(p/s/i$b, s);
    }

    public static g.String[] values()
    {
        return ([])c.clone();
    }

    static 
    {
        a = new <init>("CACHE", 0);
        b = new <init>("SOURCE", 1);
        c = (new c[] {
            a, b
        });
    }

    private g.String(String s, int j)
    {
        super(s, j);
    }
}
