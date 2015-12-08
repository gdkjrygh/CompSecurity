// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nup extends Enum
{

    public static final nup A;
    public static final nup B;
    public static final nup C;
    public static final nup D;
    public static final nup E;
    public static final nup F;
    private static nup H;
    private static nup I;
    private static nup J;
    private static final nup K[];
    public static final nup a;
    public static final nup b;
    public static final nup c;
    public static final nup d;
    public static final nup e;
    public static final nup f;
    public static final nup g;
    public static final nup h;
    public static final nup i;
    public static final nup j;
    public static final nup k;
    public static final nup l;
    public static final nup m;
    public static final nup n;
    public static final nup o;
    public static final nup p;
    public static final nup q;
    public static final nup r;
    public static final nup s;
    public static final nup t;
    public static final nup u;
    public static final nup v;
    public static final nup w;
    public static final nup x;
    public static final nup y;
    public static final nup z;
    final int G;

    private nup(String s1, int i1, int j1)
    {
        super(s1, i1);
        G = j1;
    }

    public static nup valueOf(String s1)
    {
        return (nup)Enum.valueOf(nup, s1);
    }

    public static nup[] values()
    {
        return (nup[])K.clone();
    }

    static 
    {
        a = new nup("ADD_TO_ALBUM", 0, b.GW);
        b = new nup("EDIT_ALBUM", 1, b.Hj);
        c = new nup("ADD_AND_REMOVE_FROM_ALBUM", 2, b.GU);
        d = new nup("CREATE_LINK", 3, b.Hb);
        e = new nup("CREATE_ALBUM", 4, b.GY);
        f = new nup("CREATE_ANIMATION", 5, b.GZ);
        g = new nup("CREATE_COLLAGE", 6, b.Ha);
        h = new nup("CREATE_MOVIE", 7, b.Hc);
        i = new nup("CREATE_STORY", 8, b.Hd);
        j = new nup("DELETE_MOVIE", 9, b.Hf);
        k = new nup("DOWNLOAD_PHOTO", 10, b.Hh);
        l = new nup("DOWNLOAD_VIDEO", 11, b.Hi);
        m = new nup("REMOVE_FROM_ALBUM", 12, b.Hs);
        n = new nup("DELETE_ALBUM", 13, b.He);
        o = new nup("RENAME_ALBUM", 14, b.Hu);
        p = new nup("SAVE_ITEMS", 15, b.Hw);
        q = new nup("SAVE_ALBUM", 16, b.Hv);
        r = new nup("SAVE_STORY", 17, b.Hz);
        s = new nup("SAVE_MOVIE", 18, b.Hy);
        H = new nup("ADD_LABEL", 19, b.GV);
        I = new nup("UPDATE_SETTINGS", 20, b.HE);
        t = new nup("EDIT_STORY", 21, b.Hl);
        J = new nup("REBUILD_STORY", 22, b.Hr);
        u = new nup("DELETE_STORY", 23, b.Hg);
        v = new nup("EDIT_MEDIA_CAPTION", 24, b.Hk);
        w = new nup("SAVE_MEDIA_CAPTION", 25, b.Hx);
        x = new nup("EDIT_STORY_CAPTION", 26, b.Hm);
        y = new nup("EDIT_STORY_TITLE", 27, b.Ho);
        z = new nup("EDIT_STORY_LOCATION", 28, b.Hn);
        A = new nup("REMOVE_STORY_PHOTO", 29, b.Ht);
        B = new nup("SET_ALBUM_COVER", 30, b.HA);
        C = new nup("SET_STORY_COVER_PHOTO", 31, b.HB);
        D = new nup("SHARE_STORY", 32, b.HC);
        E = new nup("SIGN_IN", 33, b.HD);
        F = new nup("FREE_UP_SPACE", 34, b.Hq);
        K = (new nup[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, H, 
            I, t, J, u, v, w, x, y, z, A, 
            B, C, D, E, F
        });
    }
}
