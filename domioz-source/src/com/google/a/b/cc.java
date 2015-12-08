// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.t;

// Referenced classes of package com.google.a.b:
//            cd, ce

abstract class cc extends Enum
    implements t
{

    public static final cc a;
    public static final cc b;
    private static final cc c[];

    private cc(String s, int i)
    {
        super(s, i);
    }

    cc(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static cc valueOf(String s)
    {
        return (cc)Enum.valueOf(com/google/a/b/cc, s);
    }

    public static cc[] values()
    {
        return (cc[])c.clone();
    }

    static 
    {
        a = new cd("KEY");
        b = new ce("VALUE");
        c = (new cc[] {
            a, b
        });
    }
}
