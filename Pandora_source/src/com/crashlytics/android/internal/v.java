// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


final class v extends Enum
{

    public static final v a;
    public static final v b;
    public static final v c;
    public static final v d;
    public static final v e;
    public static final v f;
    public static final v g;
    public static final v h;
    public static final v i;
    public static final v j;
    private static final v k[];

    private v(String s, int l)
    {
        super(s, l);
    }

    public static v valueOf(String s)
    {
        return (v)Enum.valueOf(com/crashlytics/android/internal/v, s);
    }

    public static v[] values()
    {
        return (v[])k.clone();
    }

    static 
    {
        a = new v("CREATE", 0);
        b = new v("START", 1);
        c = new v("RESUME", 2);
        d = new v("SAVE_INSTANCE_STATE", 3);
        e = new v("PAUSE", 4);
        f = new v("STOP", 5);
        g = new v("DESTROY", 6);
        h = new v("ERROR", 7);
        i = new v("CRASH", 8);
        j = new v("INSTALL", 9);
        k = (new v[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
