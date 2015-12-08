// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            ak

public static final class d extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c e[];
    private final String d;

    static String a(d d1)
    {
        return d1.d;
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/c/b/ak$g$b, s);
    }

    public static g[] values()
    {
        return (g[])e.clone();
    }

    static 
    {
        a = new <init>("UNKNOWN", 0, "unknown");
        b = new <init>("PROTO2", 1, "proto2");
        c = new <init>("PROTO3", 2, "proto3");
        e = (new e[] {
            a, b, c
        });
    }

    private g(String s, int i, String s1)
    {
        super(s, i);
        d = s1;
    }
}
