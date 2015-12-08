// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.c;


// Referenced classes of package com.c.a.c:
//            g, h, n

private static final class ng extends Enum
    implements g
{

    public static final a a;
    private static final a b[];

    public static ng valueOf(String s)
    {
        return (ng)Enum.valueOf(com/c/a/c/h$a, s);
    }

    public static ng[] values()
    {
        return (ng[])b.clone();
    }

    public final void a(Object obj, n n1)
    {
        n1.b((CharSequence)obj);
    }

    public final String toString()
    {
        return "Funnels.unencodedCharsFunnel()";
    }

    static 
    {
        a = new <init>("INSTANCE");
        b = (new b[] {
            a
        });
    }

    private ng(String s)
    {
        super(s, 0);
    }
}
