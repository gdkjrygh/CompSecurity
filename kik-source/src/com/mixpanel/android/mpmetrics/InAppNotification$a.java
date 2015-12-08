// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//            InAppNotification, q, r, s

public static class <init> extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static <init> valueOf(String s1)
    {
        return (<init>)Enum.valueOf(com/mixpanel/android/mpmetrics/InAppNotification$a, s1);
    }

    public static <init>[] values()
    {
        return (<init>[])d.clone();
    }

    static 
    {
        a = new q("UNKNOWN");
        b = new r("MINI");
        c = new s("TAKEOVER");
        d = (new d[] {
            a, b, c
        });
    }

    private (String s1, int i)
    {
        super(s1, i);
    }

    (String s1, int i, byte byte0)
    {
        this(s1, i);
    }
}
