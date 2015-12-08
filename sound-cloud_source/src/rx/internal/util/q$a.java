// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.b.f;

// Referenced classes of package rx.internal.util:
//            q

private static final class  extends Enum
    implements f
{

    public static final a a;
    private static final a b[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(rx/internal/util/q$a, s);
    }

    public static f[] values()
    {
        return (f[])b.clone();
    }

    public final Object call(Object obj)
    {
        return Boolean.valueOf(true);
    }

    static 
    {
        a = new <init>("INSTANCE");
        b = (new b[] {
            a
        });
    }

    private (String s)
    {
        super(s, 0);
    }
}
