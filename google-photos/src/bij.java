// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bij extends Enum
{

    private static bij c;
    private static bij d;
    private static bij e;
    private static bij f;
    private static bij g;
    private static bij h;
    private static bij i;
    private static bij j;
    private static bij k;
    private static bij l;
    private static bij m;
    private static bij n;
    private static bij o;
    private static bij p;
    private static bij q;
    private static bij r;
    private static bij s;
    private static final bij t[];
    public final bik a;
    public final cos b;

    private bij(String s1, int i1, bik bik1, cos cos1)
    {
        super(s1, i1);
        a = bik1;
        b = cos1;
    }

    public static bij valueOf(String s1)
    {
        return (bij)Enum.valueOf(bij, s1);
    }

    public static bij[] values()
    {
        return (bij[])t.clone();
    }

    static 
    {
        c = new bij("SHARPNESS", 0, bik.a, cos.f);
        d = new bij("FACE_SCORE", 1, bik.a, cos.g);
        e = new bij("SALIENCY", 2, bik.a, cos.i);
        f = new bij("SALIENCY_MAP_CUMULATIVE_VERTICAL_PROJECTION", 3, bik.a, cos.v);
        g = new bij("SALIENCY_MAP_CUMULATIVE_HORIZONTAL_PROJECTION", 4, bik.a, cos.w);
        h = new bij("STABILIZATION", 5, bik.c, cos.a);
        i = new bij("AUTO_CORRECT", 6, bik.d, null);
        j = new bij("AUDIO_RMS", 7, bik.a, cos.k);
        k = new bij("NEW_CHROMA_HISTOGRAM", 8, bik.b, cos.m);
        l = new bij("NEW_COLORFULNESS", 9, bik.a, cos.l);
        m = new bij("AUDIO_MFCC", 10, bik.b, cos.n);
        n = new bij("KEY_FRAME_NUMBER", 11, bik.e, cos.o);
        o = new bij("STABILIZATION_DISPLACEMENT", 12, bik.a, cos.p);
        p = new bij("STABILIZATION_INTERFRAME_TRANSFORM", 13, bik.a, cos.q);
        q = new bij("AUDIO_DELTA_MFCC", 14, bik.b, cos.s);
        r = new bij("NEW_MOTION_SALIENCY", 15, bik.a, cos.t);
        s = new bij("AUDIO_PEAK_AMPLITUDE", 16, bik.a, cos.u);
        t = (new bij[] {
            c, d, e, f, g, h, i, j, k, l, 
            m, n, o, p, q, r, s
        });
    }
}
