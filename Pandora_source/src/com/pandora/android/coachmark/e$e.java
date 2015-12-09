// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;


// Referenced classes of package com.pandora.android.coachmark:
//            e

public static final class z extends Enum
{

    private static final x A[];
    public static final x a;
    public static final x b;
    public static final x c;
    public static final x d;
    public static final x e;
    public static final x f;
    public static final x g;
    public static final x h;
    public static final x i;
    public static final x j;
    public static final x k;
    public static final x l;
    public static final x m;
    public static final x n;
    public static final x o;
    public static final x p;
    public static final x q;
    public static final x r;
    public static final x s;
    public static final x t;
    public static final x u;
    public static final x v;
    public static final x w;
    public static final x x;
    public final String y;
    public final x z;

    public static z valueOf(String s1)
    {
        return (z)Enum.valueOf(com/pandora/android/coachmark/e$e, s1);
    }

    public static z[] values()
    {
        return (z[])A.clone();
    }

    static 
    {
        a = new <init>("THUMBS", 0, "thumbs", a);
        b = new <init>("THUMB_UP", 1, "thumb_up", a);
        c = new <init>("THUMB_DOWN", 2, "thumb_down", a);
        d = new <init>("STATION_LIST", 3, "station_list", a);
        e = new <init>("MIN_SKIPS", 4, "min_skips", a);
        f = new <init>("SP_METER", 5, "meter", b);
        g = new <init>("SP_STATION_CREATED", 6, "existing_user_first_time_now_playing", b);
        h = new <init>("SP_FIRST_THUMB_UP", 7, "existing_user_1st_thumb_up", b);
        i = new <init>("SP_FIRST_THUMB_DOWN", 8, "existing_user_thumb_down", b);
        j = new <init>("SP_TOTAL_THUMBS_5", 9, "existing_user_5th_thumb_up", b);
        k = new <init>("SP_TOTAL_THUMBS_10", 10, "existing_user_10th_thumb_up", b);
        l = new <init>("SP_TOTAL_THUMBS_20", 11, "existing_user_20th_thumb_up", b);
        m = new <init>("SP_VARIETY_ADDED", 12, "existing_user_add_variety", b);
        n = new <init>("SP_AD_DISMISSED", 13, "now_playing_pandora_one_upsell_on_dismissal", e);
        o = new <init>("SP_AD_DISMISSED_TRIAL", 14, "now_playing_free_trial_on_dismissal", e);
        p = new <init>("ARTIST_AUDIO_MESSAGE", 15, "artist_message_follow_on_coachmark", f);
        q = new <init>("STATION_NOT_FOUND_MESSAGE", 16, "station_not_found_coachmark", g);
        r = new <init>("CASTING_AVAILABLE", 17, "casting_available", d);
        s = new <init>("P1_ALACARTE_PROMOTION", 18, "mdp_promotion", e);
        t = new <init>("P1_ALACARTE_WELCOME", 19, "mdp_welcome", e);
        u = new <init>("P1_ALACARTE_UPGRADE", 20, "mdp_expiration_upgrade", e);
        v = new <init>("P1_ALACARTE_FREE_TRIAL", 21, "mdp_expiration_free_trial", e);
        w = new <init>("SL_RESUME_VIDEO", 22, "sponsored_listening_resume_video", h);
        x = new <init>("TEST", 23, "test", a);
        A = (new A[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x
        });
    }

    private (String s1, int i1, String s2,  )
    {
        super(s1, i1);
        y = s2;
        z = ;
    }
}
