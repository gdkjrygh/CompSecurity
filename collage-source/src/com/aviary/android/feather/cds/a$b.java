// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import java.util.Locale;

// Referenced classes of package com.aviary.android.feather.cds:
//            a

public static final class  extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static  a(String s)
    {
        if ("effect".equals(s))
        {
            return b;
        }
        if ("frame".equals(s))
        {
            return a;
        }
        if ("sticker".equals(s))
        {
            return c;
        } else
        {
            return null;
        }
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/aviary/android/feather/cds/a$b, s);
    }

    public static c[] values()
    {
        return (c[])d.clone();
    }

    public String a()
    {
        return name().toLowerCase(Locale.US);
    }

    static 
    {
        a = new <init>("FRAME", 0);
        b = new <init>("EFFECT", 1);
        c = new <init>("STICKER", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
