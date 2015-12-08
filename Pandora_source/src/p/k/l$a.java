// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.k;


// Referenced classes of package p.k:
//            l

public static final class g.String extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static g.String valueOf(String s)
    {
        return (g.String)Enum.valueOf(p/k/l$a, s);
    }

    public static g.String[] values()
    {
        return ([])e.clone();
    }

    static 
    {
        a = new <init>("LOW", 0);
        b = new <init>("NORMAL", 1);
        c = new <init>("HIGH", 2);
        d = new <init>("IMMEDIATE", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private g.String(String s, int i)
    {
        super(s, i);
    }
}
