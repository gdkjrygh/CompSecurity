// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android.a;


public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;
    public static final e h;
    private static final e j[];
    private final int i;

    private e(String s, int k, int l)
    {
        super(s, k);
        i = l;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/microsoft/advertising/android/a/e, s);
    }

    public static e[] values()
    {
        e ae[] = j;
        int k = ae.length;
        e ae1[] = new e[k];
        System.arraycopy(ae, 0, ae1, 0, k);
        return ae1;
    }

    static 
    {
        a = new e("Unknown", 0, 0);
        b = new e("NoAdAvailable", 1, 1);
        c = new e("NetworkConnectionFailure", 2, 2);
        d = new e("ClientConfiguration", 3, 3);
        e = new e("ServerSideError", 4, 4);
        f = new e("InvalidServerResponse", 5, 5);
        g = new e("Other", 6, 6);
        h = new e("RefreshNotAllowed", 7, 7);
        j = (new e[] {
            a, b, c, d, e, f, g, h
        });
    }
}
