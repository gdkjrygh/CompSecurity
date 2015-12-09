// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//            InAppNotification

public static class <init> extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/mixpanel/android/mpmetrics/InAppNotification$Type, s);
    }

    public static <init>[] values()
    {
        return (<init>[])d.clone();
    }

    static 
    {
    /* block-local class not found */
    class _cls1 {}

        a = new _cls1("UNKNOWN", 0);
    /* block-local class not found */
    class _cls2 {}

        b = new _cls2("MINI", 1);
    /* block-local class not found */
    class _cls3 {}

        c = new _cls3("TAKEOVER", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private _cls3(String s, int i)
    {
        super(s, i);
    }

    _cls3(String s, int i, _cls3 _pcls3)
    {
        this(s, i);
    }
}
