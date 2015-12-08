// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cos extends Enum
{

    private static cos A;
    private static cos B;
    private static cos C;
    private static cos D;
    private static cos E;
    private static final cos F[];
    public static final cos a;
    public static final cos b;
    public static final cos c;
    public static final cos d;
    public static final cos e;
    public static final cos f;
    public static final cos g;
    public static final cos h;
    public static final cos i;
    public static final cos j;
    public static final cos k;
    public static final cos l;
    public static final cos m;
    public static final cos n;
    public static final cos o;
    public static final cos p;
    public static final cos q;
    public static final cos r;
    public static final cos s;
    public static final cos t;
    public static final cos u;
    public static final cos v;
    public static final cos w;
    private static cos y;
    private static cos z;
    public final cpd x;

    private cos(String s1, int i1, cpd cpd)
    {
        super(s1, i1);
        x = cpd;
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

    static Integer a(int i1)
    {
        if (i1 == -1)
        {
            return null;
        } else
        {
            return Integer.valueOf(i1);
        }
    }

    public static cos valueOf(String s1)
    {
        return (cos)Enum.valueOf(cos, s1);
    }

    public static cos[] values()
    {
        return (cos[])F.clone();
    }

    static 
    {
        a = new cos("STABILIZATION", 0, new cpu());
        b = new cos("STABILIZATION_COMPENSATION_TRANSFORM", 1, new cps());
        c = new cos("CAMERA_MOTION", 2, new cox());
        y = new cos("HUE_DIFFERENCE", 3, new cpf());
        z = new cos("HUE_RANGE", 4, new cpg());
        d = new cos("COLOR_CORRELATION", 5, new coz());
        e = new cos("COLORFULNESS", 6, new cpa());
        f = new cos("SHARPNESS", 7, new cpr());
        A = new cos("HORIZONTAL_PAN_DIRECTION", 8, new cpe());
        B = new cos("VERTICAL_PAN_DIRECTION", 9, new cpx());
        C = new cos("PHASE_CORRELATE_HORIZONTAL_PAN_DIRECTION", 10, new cpm());
        D = new cos("PHASE_CORRELATE_VERTICAL_PAN_DIRECTION", 11, new cpn());
        g = new cos("FACE_SCORE", 12, new cpc());
        h = new cos("CHROMA_HISTOGRAM", 13, new coy());
        i = new cos("SALIENCY", 14, new cpo());
        E = new cos("BADNESS", 15, new cow());
        j = new cos("MOTION_SALIENCY", 16, new cpi());
        k = new cos("AUDIO_RMS", 17, new cov());
        l = new cos("NEW_COLORFULNESS", 18, new cpk());
        m = new cos("NEW_CHROMA_HISTOGRAM", 19, new cpj());
        n = new cos("AUDIO_MFCC", 20, new cot());
        o = new cos("KEY_FRAME_NUMBER", 21, new cph());
        p = new cos("STABILIZATION_DISPLACEMENT", 22, new cpt());
        q = new cos("STABILIZATION_INTERFRAME_TRANSFORM", 23, new cpv());
        r = new cos("STABILIZATION_JITTER_TRANSFORM", 24, new cpw());
        s = new cos("DELTA_MFCC", 25, new cpb());
        t = new cos("NEW_MOTION_SALIENCY", 26, new cpl());
        u = new cos("AUDIO_PEAK_AMPLITUDE", 27, new cou());
        v = new cos("SALIENCY_MAP_CUMULATIVE_VERTICAL_PROJECTION", 28, new cpq());
        w = new cos("SALIENCY_MAP_CUMULATIVE_HORIZONTAL_PROJECTION", 29, new cpp());
        F = (new cos[] {
            a, b, c, y, z, d, e, f, A, B, 
            C, D, g, h, i, E, j, k, l, m, 
            n, o, p, q, r, s, t, u, v, w
        });
    }
}
