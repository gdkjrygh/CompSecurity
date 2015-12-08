// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;


// Referenced classes of package com.pandora.android.coachmark:
//            e

public static final class  extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pandora/android/coachmark/e$b, s);
    }

    public static [] values()
    {
        return ([])g.clone();
    }

    static 
    {
        a = new <init>("NO_LIMIT", 0);
        b = new <init>("ONCE", 1);
        c = new <init>("ONCE_PER_DAY", 2);
        d = new <init>("ONCE_PER_WEEK", 3);
        e = new <init>("ONCE_PER_TWO_WEEKS", 4);
        f = new <init>("ONCE_PER_MONTH", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
