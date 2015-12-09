// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;


// Referenced classes of package com.pandora.radio.data:
//            ai

public static final class e extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d f[];
    public String e;

    public static e a(String s)
    {
        if (s.equals("true"))
        {
            return c;
        }
        if (s.equals("false"))
        {
            return d;
        }
        if (s.equals("disabled"))
        {
            return a;
        } else
        {
            return b;
        }
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/pandora/radio/data/ai$a, s);
    }

    public static b[] values()
    {
        return (b[])f.clone();
    }

    static 
    {
        a = new <init>("DISABLED", 0, "disabled");
        b = new <init>("ENABLED", 1, "");
        c = new <init>("TRUE", 2, "true");
        d = new <init>("FALSE", 3, "false");
        f = (new f[] {
            a, b, c, d
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }
}
