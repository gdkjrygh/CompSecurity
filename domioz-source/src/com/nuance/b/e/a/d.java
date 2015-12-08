// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e.a;


public final class d extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    public static final d i;
    public static final d j;
    public static final d k;
    private static final d l[];

    private d(String s, int i1)
    {
        super(s, i1);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/nuance/b/e/a/d, s);
    }

    public static d[] values()
    {
        return (d[])l.clone();
    }

    static 
    {
        a = new d("NINA_EVENT_PREPARING_TO_LISTEN", 0);
        b = new d("NINA_EVENT_LISTENING_STARTED", 1);
        c = new d("NINA_EVENT_START_OF_SPEECH", 2);
        d = new d("NINA_EVENT_END_OF_SPEECH", 3);
        e = new d("NINA_EVENT_LISTENING_STOPPED", 4);
        f = new d("NINA_EVENT_RECORDING_STARTED", 5);
        g = new d("NINA_EVENT_RECORDING_STOPPED", 6);
        h = new d("NINA_EVENT_DICTATION_STARTED", 7);
        i = new d("NINA_EVENT_DICTATION_STOPPED", 8);
        j = new d("NINA_EVENT_PROCESSING_STARTED", 9);
        k = new d("NINA_EVENT_PROCESSING_COMPLETED", 10);
        l = (new d[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
