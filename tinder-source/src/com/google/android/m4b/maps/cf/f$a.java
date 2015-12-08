// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cf;


// Referenced classes of package com.google.android.m4b.maps.cf:
//            f

public static final class e extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    private static f f;
    private static final f g[];
    public final boolean d;
    public final boolean e;

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/google/android/m4b/maps/cf/f$a, s);
    }

    public static e[] values()
    {
        return (e[])g.clone();
    }

    static 
    {
        a = new <init>("NOT_LIVE", 0, false, false);
        b = new <init>("NOT_LIVE_WITH_NEW_CONTEXT", 1, false, true);
        c = new <init>("LIVE", 2, true, false);
        f = new <init>("LIVE_WITH_NEW_CONTEXT", 3, true, true);
        g = (new g[] {
            a, b, c, f
        });
    }

    private (String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        d = flag;
        e = flag1;
    }
}
