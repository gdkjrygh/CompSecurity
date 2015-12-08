// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso;

import android.util.SparseArray;

public final class f extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    public static final f g;
    public static final f h;
    public static final f i;
    public static final f j;
    public static final f k;
    private static final SparseArray l;
    private static final f n[];
    private int m;

    private f(String s, int i1, int j1)
    {
        super(s, i1);
        m = j1;
    }

    public static f a(int i1)
    {
        return (f)l.get(i1);
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/microsoft/onlineid/internal/sso/f, s);
    }

    public static f[] values()
    {
        return (f[])n.clone();
    }

    public final int a()
    {
        return m;
    }

    static 
    {
        a = new f("Unknown", 0, 1);
        b = new f("ClientNotAuthorized", 1, 2);
        c = new f("UnsupportedClientVersion", 2, 3);
        d = new f("StorageException", 3, 4);
        e = new f("IllegalArgumentException", 4, 5);
        f = new f("AccountNotFound", 5, 6);
        g = new f("NetworkException", 6, 7);
        h = new f("StsException", 7, 8);
        i = new f("InvalidResponseException", 8, 9);
        j = new f("MasterRedirectException", 9, 10);
        k = new f("ClientConfigUpdateNeededException", 10, 11);
        n = (new f[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
        l = new SparseArray();
        f af[] = values();
        int j1 = af.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            f f1 = af[i1];
            l.put(f1.m, f1);
        }

    }
}
