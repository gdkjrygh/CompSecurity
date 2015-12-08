// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.d;


public final class d extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    private static final d e[];
    private final String d;

    private d(String s, int i, String s1)
    {
        super(s, i);
        d = s1;
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/nuance/b/d/d, s);
    }

    public static d[] values()
    {
        return (d[])e.clone();
    }

    public final String toString()
    {
        return d;
    }

    static 
    {
        a = new d("PRIORITY_SELECT", 0, "priorityselect");
        b = new d("KEEP_EXISTING", 1, "keepexisting");
        c = new d("PROCESSOR_CHOICE", 2, "processorchoice");
        e = (new d[] {
            a, b, c
        });
    }
}
