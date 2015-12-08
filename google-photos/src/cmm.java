// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cmm extends Enum
{

    public static final cmm a;
    public static final cmm b;
    public static final cmm c;
    public static final cmm d;
    public static final cmm e;
    public static final cmm f;
    public static final cmm g;
    public static final cmm h;
    public static final cmm i;
    public static final cmm j;
    public static final cmm k;
    public static final cmm l;
    public static final cmm m;
    public static final cmm n;
    public static final cmm o;
    public static final cmm p;
    private static cmm r;
    private static cmm s;
    private static final cmm t[];
    final cmx q;

    private cmm(String s1, int i1, cmx cmx1)
    {
        super(s1, i1);
        q = (cmx)b.a(cmx1, "field", null);
    }

    static cob a(cwf cwf)
    {
        if (cwf == null)
        {
            return null;
        } else
        {
            return cob.a(cwf);
        }
    }

    static Float a(float f1)
    {
        if (Float.isNaN(f1))
        {
            return null;
        } else
        {
            return Float.valueOf(f1);
        }
    }

    public static cmm valueOf(String s1)
    {
        return (cmm)Enum.valueOf(cmm, s1);
    }

    public static cmm[] values()
    {
        return (cmm[])t.clone();
    }

    static 
    {
        a = new cmm("AVERAGE_SHARPNESS", 0, new cmw());
        b = new cmm("AVERAGE_FACE_SCORES", 1, new cmt());
        r = new cmm("AVERAGE_CHROMA_HISTOGRAM", 2, new cmp((byte)0));
        c = new cmm("HISTOGRAM_SHARPNESS", 3, new cna());
        d = new cmm("HISTOGRAM_SMILESCORE", 4, new cnb());
        e = new cmm("SALIENCY_FEATURE", 5, new cng());
        f = new cmm("MOTION_SALIENCY_FEATURE", 6, new cnc());
        s = new cmm("AVERAGE_COLORFULNESS", 7, new cmq());
        g = new cmm("AVERAGE_FACE_AREA", 8, new cms());
        h = new cmm("AUDIO_RMS_FEATURE", 9, new cmn());
        i = new cmm("NEW_AVERAGE_COLORFULNESS", 10, new cne());
        j = new cmm("NEW_AVERAGE_CHROMA_HISTOGRAM", 11, new cnd());
        k = new cmm("AVERAGE_AUDIO_MFCC", 12, new cmo());
        l = new cmm("STDDEV_AUDIO_MFCC", 13, new cni());
        m = new cmm("AVERAGE_DELTA_MFCC", 14, new cmr());
        n = new cmm("VARIANCE_DELTA_MFCC", 15, new cnj());
        o = new cmm("STABILIZER_CAMERA_COMPENSATION_FEATURE", 16, new cnh());
        p = new cmm("NEW_MOTION_SALIENCY_FEATURE", 17, new cnf());
        t = (new cmm[] {
            a, b, r, c, d, e, f, s, g, h, 
            i, j, k, l, m, n, o, p
        });
    }
}
