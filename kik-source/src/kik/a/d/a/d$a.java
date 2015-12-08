// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d.a;


// Referenced classes of package kik.a.d.a:
//            d

public static final class ng extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static ng valueOf(String s)
    {
        return (ng)Enum.valueOf(kik/a/d/a/d$a, s);
    }

    public static ng[] values()
    {
        return (ng[])e.clone();
    }

    static 
    {
        a = new <init>("ADDRESS_BOOK_MATCHING", 0);
        b = new <init>("EXPLICIT_USERNAME_SEARCH", 1);
        c = new <init>("INLINE_USERNAME_SEARCH", 2);
        d = new <init>("UNKNOWN", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private ng(String s, int i)
    {
        super(s, i);
    }
}
