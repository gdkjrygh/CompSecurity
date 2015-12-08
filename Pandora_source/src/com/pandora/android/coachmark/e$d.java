// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;

import java.util.Locale;

// Referenced classes of package com.pandora.android.coachmark:
//            e

public static final class name extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f h[];
    public final String g;

    public static name valueOf(String s)
    {
        return (name)Enum.valueOf(com/pandora/android/coachmark/e$d, s);
    }

    public static name[] values()
    {
        return (name[])h.clone();
    }

    static 
    {
        a = new <init>("TIMEOUT", 0);
        b = new <init>("BACKGROUND", 1);
        c = new <init>("PRESS_BACK", 2);
        d = new <init>("TOUCH", 3);
        e = new <init>("CLICK_THROUGH_ACTION_CLICKED", 4);
        f = new <init>("DISABLED", 5);
        h = (new h[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
        g = name().toLowerCase(Locale.US);
    }
}
