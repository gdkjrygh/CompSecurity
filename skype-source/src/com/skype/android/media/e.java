// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.util.SparseArray;

final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;
    public static final e h;
    public static final e i;
    public static final e j;
    public static final e k;
    public static final e l;
    public static final e m;
    public static final e n;
    public static final e o;
    public static final e p;
    public static final e q;
    public static final e r;
    private static SparseArray s;
    private static final e t[];

    private e(String s1, int i1)
    {
        super(s1, i1);
    }

    public static e a(int i1)
    {
        return (e)s.get(i1);
    }

    public static e valueOf(String s1)
    {
        return (e)Enum.valueOf(com/skype/android/media/e, s1);
    }

    public static e[] values()
    {
        return (e[])t.clone();
    }

    static 
    {
        a = new e("CONFIGURE", 0);
        b = new e("START", 1);
        c = new e("STOP", 2);
        d = new e("RELEASE", 3);
        e = new e("ENCODE_CREATE_SURFACE", 4);
        f = new e("ENCODE_UNMIRROR", 5);
        g = new e("ENCODE_SURFACE_FRAME", 6);
        h = new e("ENCODE_PREVIEW_FRAME", 7);
        i = new e("ENCODE_REQUEST_KEY_FRAME", 8);
        j = new e("DEQUEUE_BUFFER", 9);
        k = new e("QUEUE_BUFFER", 10);
        l = new e("RETURN_BUFFER", 11);
        m = new e("WRITE_SAMPLE", 12);
        n = new e("CHANGE_MEDIA_FORMAT", 13);
        o = new e("DECODE_FRAME", 14);
        p = new e("ENCODE_DECODER_FRAME", 15);
        q = new e("EXTRACT_SAMPLE", 16);
        r = new e("END_OF_STREAM", 17);
        t = (new e[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r
        });
        s = new SparseArray();
        e ae[] = values();
        int j1 = ae.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            e e1 = ae[i1];
            s.put(e1.ordinal(), e1);
        }

    }
}
