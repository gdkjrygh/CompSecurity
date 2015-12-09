// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.adapter;

import java.util.Collections;
import java.util.HashSet;

public final class For extends Enum
{

    private static final z A[];
    public static final z a;
    public static final z b;
    public static final z c;
    public static final z d;
    public static final z e;
    public static final z f;
    public static final z g;
    public static final z h;
    public static final z i;
    public static final z j;
    public static final z k;
    public static final z l;
    public static final z m;
    public static final z n;
    public static final z o;
    public static final z p;
    public static final z q;
    public static final z r;
    public static final z s;
    public static final z t;
    public static final z u;
    public static final z v;
    public static final z w;
    public static final z x;
    public static final z y;
    public static final z z;
    public final DisableWhen mDisableWhen;
    public final HashSet mVisibleFor;
    public final ShowWhen mVisibleWhen;

    public static For valueOf(String s1)
    {
        return (For)Enum.valueOf(com/spotify/mobile/android/ui/adapter/SettingsAdapter$Item, s1);
    }

    public static For[] values()
    {
        return (For[])A.clone();
    }

    static 
    {
        a = new <init>("OFFLINE_MODE", 0, ShowWhen.f, DisableWhen.b, new For[0]);
        b = new <init>("CROSSFADE", 1, DisableWhen.b, new For[0]);
        c = new <init>("GAPLESS", 2, DisableWhen.b, new For[0]);
        d = new <init>("UNAVAILABLE_TRACKS", 3, DisableWhen.a, new For[0]);
        e = new <init>("NORMALIZE", 4, DisableWhen.b, new For[0]);
        f = new <init>("SEND_BROADCASTS", 5, DisableWhen.b, new For[0]);
        g = new <init>("DEVICE_PICKER", 6, ShowWhen.c, new For[0]);
        h = new <init>("PRIVATE_SESSION", 7, DisableWhen.b, new For[0]);
        i = new <init>("FACEBOOK", 8, DisableWhen.b, new For[0]);
        j = new <init>("LASTFM", 9, DisableWhen.b, new For[0]);
        k = new <init>("ARSENAL", 10, new For[] {
            For.c
        });
        l = new <init>("STREAM_QUALITY", 11, DisableWhen.b, new For[0]);
        m = new <init>("DOWNLOAD_QUALITY", 12, ShowWhen.e, DisableWhen.b, new For[0]);
        n = new <init>("DOWNLOAD_OVER_3G", 13, ShowWhen.f, DisableWhen.b, new For[0]);
        o = new <init>("AUDIO_EFFECTS", 14, ShowWhen.d, DisableWhen.b, new For[0]);
        p = new <init>("NOTIFICATIONS", 15, new For[0]);
        q = new <init>("NIELSEN_OCR", 16, ShowWhen.g, new For[] {
            For.b
        });
        r = new <init>("VERSION", 17, DisableWhen.d, new For[] {
            For.b
        });
        s = new <init>("LICENSES", 18, new For[] {
            For.b
        });
        t = new <init>("TERMS_CONDITIONS", 19, new For[] {
            For.b
        });
        u = new <init>("PRIVACY_POLICY", 20, new For[] {
            For.b
        });
        v = new <init>("BUG_REPORTING", 21, ShowWhen.b, new For[] {
            For.b
        });
        w = new <init>("SUPPORT", 22, new For[] {
            For.b
        });
        x = new <init>("DELETE_CACHE", 23, DisableWhen.c, new For[0]);
        y = new <init>("LOGOUT", 24, new For[0]);
        z = new <init>("DEBUG_TOOLS", 25, ShowWhen.b, new For[] {
            For.b
        });
        A = (new A[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z
        });
    }

    private transient For(String s1, int i1, DisableWhen disablewhen, For afor[])
    {
        class ShowWhen extends Enum
        {

            public static final ShowWhen a;
            public static final ShowWhen b;
            public static final ShowWhen c;
            public static final ShowWhen d;
            public static final ShowWhen e;
            public static final ShowWhen f;
            public static final ShowWhen g;
            private static final ShowWhen h[];

            public static ShowWhen valueOf(String s2)
            {
                return (ShowWhen)Enum.valueOf(com/spotify/mobile/android/ui/adapter/SettingsAdapter$Item$ShowWhen, s2);
            }

            public static ShowWhen[] values()
            {
                return (ShowWhen[])h.clone();
            }

            static 
            {
                a = new ShowWhen("EVER", 0);
                b = new ShowWhen("DEBUG_MENU_ENABLED", 1);
                c = new ShowWhen("CONNECT_ICON_ENABLED", 2);
                d = new ShowWhen("AUDIO_EFFECTS_CONTROL_AVAILABLE", 3);
                e = new ShowWhen("HIGH_BITRATE_OFFLINE_ENABLED", 4);
                f = new ShowWhen("OFFLINE_ENABLED", 5);
                g = new ShowWhen("NIELSEN_OCR_ENABLED", 6);
                h = (new ShowWhen[] {
                    a, b, c, d, e, f, g
                });
            }

            private ShowWhen(String s1, int i1)
            {
                super(s1, i1);
            }
        }

        this(s1, i1, ShowWhen.a, disablewhen, afor);
    }

    private transient For(String s1, int i1, ShowWhen showwhen, DisableWhen disablewhen, For afor[])
    {
        super(s1, i1);
        mVisibleFor = new HashSet();
        class For extends Enum
        {

            public static final For a;
            public static final For b;
            public static final For c;
            private static For d;
            private static final For e[];

            public static For valueOf(String s2)
            {
                return (For)Enum.valueOf(com/spotify/mobile/android/ui/adapter/SettingsAdapter$Item$For, s2);
            }

            public static For[] values()
            {
                return (For[])e.clone();
            }

            static 
            {
                a = new For("REGISTERED_USER", 0);
                d = new For("ANONYMOUS_USER", 1);
                b = new For("ANY_USER", 2);
                c = new For("ARSENAL_USER", 3);
                e = (new For[] {
                    a, d, b, c
                });
            }

            private For(String s1, int i1)
            {
                super(s1, i1);
            }
        }

        if (afor == null || afor.length == 0)
        {
            mVisibleFor.add(For.a);
        } else
        {
            Collections.addAll(mVisibleFor, afor);
        }
        mVisibleWhen = showwhen;
        mDisableWhen = disablewhen;
    }

    private transient For(String s1, int i1, ShowWhen showwhen, For afor[])
    {
        class DisableWhen extends Enum
        {

            public static final DisableWhen a;
            public static final DisableWhen b;
            public static final DisableWhen c;
            public static final DisableWhen d;
            private static final DisableWhen e[];

            public static DisableWhen valueOf(String s2)
            {
                return (DisableWhen)Enum.valueOf(com/spotify/mobile/android/ui/adapter/SettingsAdapter$Item$DisableWhen, s2);
            }

            public static DisableWhen[] values()
            {
                return (DisableWhen[])e.clone();
            }

            static 
            {
                a = new DisableWhen("NEVER", 0);
                b = new DisableWhen("PLAYING_REMOTELY", 1);
                c = new DisableWhen("DELETING_CACHE", 2);
                d = new DisableWhen("ALWAYS", 3);
                e = (new DisableWhen[] {
                    a, b, c, d
                });
            }

            private DisableWhen(String s1, int i1)
            {
                super(s1, i1);
            }
        }

        this(s1, i1, showwhen, DisableWhen.a, afor);
    }

    private transient For(String s1, int i1, For afor[])
    {
        this(s1, i1, ShowWhen.a, DisableWhen.a, afor);
    }
}
