// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import a.a;

// Referenced classes of package a.a:
//            b

private static final class g.String extends Enum
    implements a
{

    public static final a a;
    private static final a b[];

    public static g.String valueOf(String s)
    {
        return (g.String)Enum.valueOf(a/a/b$a, s);
    }

    public static g.String[] values()
    {
        return ([])b.clone();
    }

    public final void a(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        } else
        {
            return;
        }
    }

    static 
    {
        a = new <init>("INSTANCE");
        b = (new b[] {
            a
        });
    }

    private g.String(String s)
    {
        super(s, 0);
    }
}
