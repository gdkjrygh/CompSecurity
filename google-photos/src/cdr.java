// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cdr extends Enum
{

    private static cdr d;
    private static cdr e;
    private static cdr f;
    private static cdr g;
    private static cdr h;
    private static cdr i;
    private static cdr j;
    private static cdr k;
    private static cdr l;
    private static cdr m;
    private static cdr n;
    private static cdr o;
    private static cdr p;
    private static cdr q;
    private static cdr r;
    private static cdr s;
    private static final cdr t[];
    public final String a;
    public final cmm b;
    public final int c;

    private cdr(String s1, int i1, String s2, cmm cmm1, int j1)
    {
        super(s1, i1);
        a = s2;
        b = cmm1;
        c = j1;
    }

    public static cdr valueOf(String s1)
    {
        return (cdr)Enum.valueOf(cdr, s1);
    }

    public static cdr[] values()
    {
        return (cdr[])t.clone();
    }

    static 
    {
        d = new cdr("METRIC_FACE_SCORE", 0, "face_score", cmm.b, cdq.d);
        e = new cdr("METRIC_AVERAGE_SHARPNESS", 1, "sharpness", cmm.a, cdq.a);
        f = new cdr("METRIC_SALIENCY_SCORE", 2, "saliency", cmm.e, cdq.b);
        g = new cdr("METRIC_HISTOGRAM_SHARPNESS", 3, "sharpness_hist", cmm.c, cdq.b);
        h = new cdr("METRIC_NEW_HISTOGRAM_AVERAGE_CHROMA", 4, "new_chroma_hist", cmm.j, cdq.c);
        i = new cdr("METRIC_HISTOGRAM_SMILESCORE", 5, "smiliness_hist", cmm.d, cdq.b);
        j = new cdr("METRIC_MOTION_SALIENCY_SCORE", 6, "motion_saliency", cmm.f, cdq.b);
        k = new cdr("METRIC_NEW_MOTION_SALIENCY_SCORE", 7, "new_motion_saliency", cmm.p, cdq.b);
        l = new cdr("METRIC_JITTER_CAMERA_MOTION", 8, "jitter_camera_motion_stabilizer", cmm.o, cdq.b);
        m = new cdr("METRIC_AVERAGE_FACE_AREA", 9, "face_area", cmm.g, cdq.a);
        n = new cdr("METRIC_AVERAGE_NEW_COLORFULNESS", 10, "new_colorfulness", cmm.i, cdq.a);
        o = new cdr("METRIC_AUDIO_RMS", 11, "audio_rms", cmm.h, cdq.b);
        p = new cdr("METRIC_AUDIO_MFCC_MEAN", 12, "audio_mfcc_mean", cmm.k, cdq.c);
        q = new cdr("METRIC_AUDIO_MFCC_STDDEV", 13, "audio_mfcc_stddev", cmm.l, cdq.c);
        r = new cdr("METRIC_DELTA_MFCC_MEAN", 14, "delta_mfcc_mean", cmm.m, cdq.c);
        s = new cdr("METRIC_DELTA_MFCC_STDDEV", 15, "delta_mfcc_stddev", cmm.n, cdq.c);
        t = (new cdr[] {
            d, e, f, g, h, i, j, k, l, m, 
            n, o, p, q, r, s
        });
    }
}
