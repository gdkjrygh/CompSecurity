// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class b extends Enum
    implements cic
{

    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public static final b F;
    public static final b G;
    public static final b H;
    public static final b I;
    public static final b J;
    private static final b K[];
    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;
    public static final b m;
    public static final b n;
    public static final b o;
    public static final b p;
    public static final b q;
    public static final b r;
    public static final b s;
    public static final b t;
    public static final b u;
    public static final b v;
    public static final b w;
    public static final b x;
    public static final b y;
    public static final b z;

    private b(String s1, int i1)
    {
        super(s1, i1);
    }

    public static b valueOf(String s1)
    {
        return (b)Enum.valueOf(b, s1);
    }

    public static b[] values()
    {
        return (b[])K.clone();
    }

    static 
    {
        a = new b("DO_DOCUMENT_CAMERA_PERMISION_EDUCATION", 0);
        b = new b("DO_DOCUMENT_CAMERA_REVIEW_VIEW", 1);
        c = new b("DO_DOCUMENT_CAMERA_SHOOT_VIEW", 2);
        d = new b("DO_DOCUMENT_CAMERA_UNAVAILABLE", 3);
        e = new b("DO_DOCUMENT_METADATA_CAPTURE", 4);
        f = new b("DO_DOCUMENT_METADATA_DIALOG", 5);
        g = new b("DO_DOCUMENT_METADATA_INFO", 6);
        h = new b("DO_DOCUMENT_METADATA_LOCAL_ERROR", 7);
        i = new b("DO_DOCUMENT_MGMT_METADATA", 8);
        j = new b("DO_DOCUMENT_UPLOAD", 9);
        k = new b("DO_DOCUMENT_UPLOAD_ERROR", 10);
        l = new b("DO_DOCUMENT_UPLOAD_SUCCESS", 11);
        m = new b("DO_ENABLE_CAMERA_ACCESS", 12);
        n = new b("DO_NETWORK_FAILURE_ALERT_MESSAGE", 13);
        o = new b("DO_OH_BANNER", 14);
        p = new b("DO_OH_BANNER_TUTORIAL", 15);
        q = new b("DO_OH_POI_DETAILS", 16);
        r = new b("DO_OH_POI_LIST", 17);
        s = new b("DO_ONBOARDING", 18);
        t = new b("DO_ONBOARDING_ERROR", 19);
        u = new b("DO_ONBOARDING_LOCAL_ERROR", 20);
        v = new b("DO_ONBOARDING_SUCCESS", 21);
        w = new b("DO_SIGN_OUT_CONFIRMATION", 22);
        x = new b("DO_SIGN_UP", 23);
        y = new b("DO_SIGN_UP_ERROR", 24);
        z = new b("DO_SIGN_UP_LOCAL_ERROR", 25);
        A = new b("DO_SIGN_UP_SUCCESS", 26);
        B = new b("DO_VI_POI_DETAILS", 27);
        C = new b("DO_VI_POI_DETAILS_EMAIL_FAILURE", 28);
        D = new b("DO_VI_POI_DETAILS_EMAIL_SUCCESS", 29);
        E = new b("DO_VI_POI_LIST", 30);
        F = new b("DO_VI_PROMPT", 31);
        G = new b("DO_VI_SELF_INSPECTION", 32);
        H = new b("DO_VI_SELF_INSPECTION_EMAIL_FAILURE", 33);
        I = new b("DO_VI_SELF_INSPECTION_EMAIL_SUCCESS", 34);
        J = new b("DO_VI_SPLASH", 35);
        K = (new b[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J
        });
    }
}
