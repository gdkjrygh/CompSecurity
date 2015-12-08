// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bxg extends Enum
{

    public static final bxg a;
    public static final bxg b;
    public static final bxg c;
    public static final bxg d;
    public static final bxg e;
    public static final bxg f;
    public static final bxg g;
    public static final bxg h;
    public static final bxg i;
    public static final bxg j;
    public static final bxg k;
    public static final bxg l;
    public static final bxg m;
    public static final bxg n;
    public static final bxg o;
    public static final bxg p;
    public static final bxg q;
    public static final bxg r;
    public static final bxg s;
    public static final bxg t;
    public static final bxg u;
    private static final bxg v[];

    private bxg(String s1, int i1)
    {
        super(s1, i1);
    }

    public static bxg valueOf(String s1)
    {
        return (bxg)Enum.valueOf(bxg, s1);
    }

    public static bxg[] values()
    {
        return (bxg[])v.clone();
    }

    static 
    {
        a = new bxg("CONSTRAINTS", 0);
        b = new bxg("USER_EDITS", 1);
        c = new bxg("STORYBOARD", 2);
        d = new bxg("SOUNDTRACK", 3);
        e = new bxg("SOUNDTRACK_READINESS", 4);
        f = new bxg("MUSIC_LIBRARY", 5);
        g = new bxg("TITLE", 6);
        h = new bxg("KEEP_ORIGINAL_AUDIO", 7);
        i = new bxg("VIDEO_AND_PHOTO_READINESS", 8);
        j = new bxg("THEME", 9);
        k = new bxg("MAXIMUM_TARGET_DURATION", 10);
        l = new bxg("FORCED_CLIP_SELECTION", 11);
        m = new bxg("SAVING", 12);
        n = new bxg("ACTIONS_AVAILABLE", 13);
        o = new bxg("RUNNING_MODE", 14);
        p = new bxg("CLOUD_MODIFIED_STORYBOARD", 15);
        q = new bxg("ASSET_READINESS", 16);
        r = new bxg("UI_ASSET_READINESS", 17);
        s = new bxg("CLOUD_STORYBOARD_MODIFICATION_CHANGE", 18);
        t = new bxg("EDIT_READY", 19);
        u = new bxg("PREVIEW_READY", 20);
        v = (new bxg[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u
        });
    }
}
