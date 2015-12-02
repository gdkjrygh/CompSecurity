// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class c extends Enum
    implements cif
{

    public static final c A;
    public static final c B;
    public static final c C;
    private static final c D[];
    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final c h;
    public static final c i;
    public static final c j;
    public static final c k;
    public static final c l;
    public static final c m;
    public static final c n;
    public static final c o;
    public static final c p;
    public static final c q;
    public static final c r;
    public static final c s;
    public static final c t;
    public static final c u;
    public static final c v;
    public static final c w;
    public static final c x;
    public static final c y;
    public static final c z;

    private c(String s1, int i1)
    {
        super(s1, i1);
    }

    public static c valueOf(String s1)
    {
        return (c)Enum.valueOf(c, s1);
    }

    public static c[] values()
    {
        return (c[])D.clone();
    }

    static 
    {
        a = new c("DO_DOCUMENT_CAMERA_BACK", 0);
        b = new c("DO_DOCUMENT_CAMERA_FLASH", 1);
        c = new c("DO_DOCUMENT_CAMERA_GALLERY", 2);
        d = new c("DO_DOCUMENT_CAMERA_PERMISSION_DENIED", 3);
        e = new c("DO_DOCUMENT_CAMERA_PERMISSION_DIALOG_CANCEL", 4);
        f = new c("DO_DOCUMENT_CAMERA_PERMISSION_DIALOG_SETTINGS", 5);
        g = new c("DO_DOCUMENT_CAMERA_PERMISSION_GRANTED", 6);
        h = new c("DO_DOCUMENT_CAMERA_RETAKE", 7);
        i = new c("DO_DOCUMENT_CAMERA_SAVE", 8);
        j = new c("DO_DOCUMENT_CAMERA_SHOOT", 9);
        k = new c("DO_DOCUMENT_CAMERA_SWITCH", 10);
        l = new c("DO_DOCUMENT_METADATA_NO", 11);
        m = new c("DO_DOCUMENT_METADATA_SUBMIT", 12);
        n = new c("DO_DOCUMENT_METADATA_YES", 13);
        o = new c("DO_OH_BANNER_TAP", 14);
        p = new c("DO_OH_BANNER_TUTORIAL_DISMISS", 15);
        q = new c("DO_OH_LIST_POI", 16);
        r = new c("DO_OH_POI_DETAILS_DIRECTIONS", 17);
        s = new c("DO_SIGN_OUT", 18);
        t = new c("DO_SIGN_OUT_CONFIRMATION_CANCEL", 19);
        u = new c("DO_SIGN_OUT_CONFIRMATION_CONFIRM", 20);
        v = new c("DO_VI_LIST_POI", 21);
        w = new c("DO_VI_LIST_SELF_INSPECTION", 22);
        x = new c("DO_VI_POI_DETAILS_DIRECTIONS", 23);
        y = new c("DO_VI_POI_DETAILS_EMAIL", 24);
        z = new c("DO_VI_PROMPT_RESUME", 25);
        A = new c("DO_VI_PROMPT_UPLOAD", 26);
        B = new c("DO_VI_SELF_INSPECTION_EMAIL", 27);
        C = new c("DO_VI_SPLASH_CONTINUE", 28);
        D = (new c[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C
        });
    }
}
