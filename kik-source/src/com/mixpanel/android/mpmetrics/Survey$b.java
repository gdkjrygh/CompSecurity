// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//            Survey, ah, ai, aj

public static class <init> extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/mixpanel/android/mpmetrics/Survey$b, s);
    }

    public static <init>[] values()
    {
        return (<init>[])d.clone();
    }

    static 
    {
        a = new ah("UNKNOWN");
        b = new ai("MULTIPLE_CHOICE");
        c = new aj("TEXT");
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }

    (String s, int i, byte byte0)
    {
        this(s, i);
    }
}
