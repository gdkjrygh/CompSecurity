// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;


// Referenced classes of package ar.com.hjg.pngj:
//            f

private static final class > extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static > valueOf(String s)
    {
        return (>)Enum.valueOf(ar/com/hjg/pngj/f$a, s);
    }

    public static Of[] values()
    {
        return (Of[])e.clone();
    }

    public final boolean a()
    {
        return this == c || this == d;
    }

    public final boolean b()
    {
        return this == d;
    }

    static 
    {
        a = new <init>("WAITING_FOR_INPUT", 0);
        b = new <init>("ROW_READY", 1);
        c = new <init>("WORK_DONE", 2);
        d = new <init>("TERMINATED", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
