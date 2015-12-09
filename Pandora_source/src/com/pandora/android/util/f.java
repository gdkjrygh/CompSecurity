// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.pandora.android.provider.b;
import com.pandora.radio.data.aa;
import p.cm.ad;
import p.cw.c;
import p.df.a;

// Referenced classes of package com.pandora.android.util:
//            s, l

public class f
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        private static final a h[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/pandora/android/util/f$a, s1);
        }

        public static a[] values()
        {
            return (a[])h.clone();
        }

        static 
        {
            a = new a("MP3_APP_SHOW_ALBUM_DETAILS", 0);
            b = new a("MP3_APP_SHOW_TRACK_DETAILS", 1);
            c = new a("MP3_APP_SEARCH", 2);
            d = new a("BROWSER_ALBUM_SONG_URL", 3);
            e = new a("BROWSER_ALBUM_URL", 4);
            f = new a("BROWSER_SONG_URL", 5);
            g = new a("BROWSER_SEARCH_URL", 6);
            h = (new a[] {
                a, b, c, d, e, f, g
            });
        }

        private a(String s1, int i)
        {
            super(s1, i);
        }
    }


    private static final String a = String.format("http://www.amazon.com/gp/dmusic/device/mp3/store/%s?tag=%s&utm_source=pandora&utm_campaign=pandora", new Object[] {
        "album/%s/highlight:%s", "pandoramobile-20"
    });
    private static final String b = String.format("http://www.amazon.com/gp/dmusic/device/mp3/store/%s?tag=%s&utm_source=pandora&utm_campaign=pandora", new Object[] {
        "album/%s", "pandoramobile-20"
    });
    private static final String c = String.format("http://www.amazon.com/gp/dmusic/device/mp3/store/%s?tag=%s&utm_source=pandora&utm_campaign=pandora", new Object[] {
        "track/%s", "pandoramobile-20"
    });
    private static final String d = String.format("http://www.amazon.com/gp/dmusic/device/mp3/store/%s?tag=%s&utm_source=pandora&utm_campaign=pandora", new Object[] {
        "search/%s+type:tracks", "pandoramobile-20"
    });

    private static a a(Context context, String s1, String s2)
    {
        if (com.pandora.android.util.s.a(s1) && com.pandora.android.util.s.a(s2))
        {
            if (a(context))
            {
                return com.pandora.android.util.a.c;
            } else
            {
                return a.g;
            }
        }
        if (!com.pandora.android.util.s.a(s1) && !com.pandora.android.util.s.a(s2))
        {
            if (a(context))
            {
                return com.pandora.android.util.a.b;
            } else
            {
                return a.d;
            }
        }
        if (!com.pandora.android.util.s.a(s2))
        {
            if (a(context))
            {
                return com.pandora.android.util.a.b;
            } else
            {
                return a.f;
            }
        }
        if (!com.pandora.android.util.s.a(s1))
        {
            if (a(context))
            {
                return com.pandora.android.util.a.a;
            } else
            {
                return a.e;
            }
        } else
        {
            return a.g;
        }
    }

    private static String a(a a1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[com.pandora.android.util.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.pandora.android.util.a.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.pandora.android.util.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.util._cls1.a[a1.ordinal()])
        {
        default:
            throw new IllegalArgumentException("defaultStoreType: unknown launchType ");

        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return p.cm.ad.a.a.name();

        case 3: // '\003'
        case 7: // '\007'
            return p.cm.ad.a.b.name();
        }
    }

    private static String a(a a1, String s1, String s2, String s3)
    {
        p.df.a.a("AmazonStoreManager", (new StringBuilder()).append("buildAmazonStoreUrl() -> ").append(a1).append(" -->  albumAsin = ").append(s1).append(" songAsin = ").append(s2).append(" search=").append(s3).toString());
        switch (com.pandora.android.util._cls1.a[a1.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("launch type is not a launch amazon store in browser launch type ").append(a1).toString());

        case 4: // '\004'
            return String.format(a, new Object[] {
                s1, s2
            });

        case 2: // '\002'
        case 5: // '\005'
            return String.format(b, new Object[] {
                s1
            });

        case 1: // '\001'
        case 6: // '\006'
            return String.format(c, new Object[] {
                s2
            });

        case 3: // '\003'
        case 7: // '\007'
            return String.format(d, new Object[] {
                s3
            });
        }
    }

    private static String a(aa aa1)
    {
        if (aa1 == null)
        {
            return null;
        } else
        {
            return com.pandora.android.util.s.b((new StringBuilder()).append(aa1.t()).append(" ").append(aa1.s()).toString());
        }
    }

    private static void a(Context context, a a1, String s1, String s2, String s3)
    {
        Intent intent;
        p.df.a.a("AmazonStoreManager", (new StringBuilder()).append("launchAmazonStoreApp() -> ").append(a1).append(" -->  albumAsin = ").append(s1).append(" songAsin = ").append(s2).append(" search=").append(s3).toString());
        intent = new Intent();
        intent.setFlags(0x10000000);
        intent.setAction("com.amazon.mp3.action.EXTERNAL_EVENT");
        intent.putExtra("com.amazon.mp3.extra.REFERRER_NAME", "pandoramobile-20");
        com.pandora.android.util._cls1.a[a1.ordinal()];
        JVM INSTR tableswitch 1 3: default 120
    //                   1 147
    //                   2 227
    //                   3 265;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalStateException((new StringBuilder()).append("launch type is not a launch amazon MP3 app launch type ").append(a1).toString());
_L2:
        intent.putExtra("com.amazon.mp3.extra.EXTERNAL_EVENT_TYPE", "com.amazon.mp3.type.SHOW_TRACK_DETAIL");
        intent.putExtra("com.amazon.mp3.extra.TRACK_ASIN", s2);
        if (!com.pandora.android.util.s.a(s1))
        {
            intent.putExtra("com.amazon.mp3.extra.ALBUM_ASIN", s1);
        }
_L6:
        p.df.a.a("AmazonStoreManager", (new StringBuilder()).append("launchAmazonStore() --> Launching Amazon App ").append(a1).append("  Intent = ").append(intent.toUri(1)).toString());
        context.startActivity(intent);
        return;
_L3:
        intent.putExtra("com.amazon.mp3.extra.EXTERNAL_EVENT_TYPE", "com.amazon.mp3.type.SHOW_ALBUM_DETAIL");
        intent.putExtra("com.amazon.mp3.extra.ALBUM_ASIN", s1);
        if (!com.pandora.android.util.s.a(s2))
        {
            intent.putExtra("com.amazon.mp3.extra.TRACK_ASIN", s2);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        intent.putExtra("com.amazon.mp3.extra.EXTERNAL_EVENT_TYPE", "com.amazon.mp3.type.SEARCH");
        intent.putExtra("com.amazon.mp3.extra.SEARCH_STRING", s3);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void a(Context context, aa aa1)
    {
        while (aa1 == null || aa1.M() || !aa1.j()) 
        {
            return;
        }
        c c1 = b.a.b();
        if (c1.l().l())
        {
            com.pandora.android.util.l.a(context, aa1, com.pandora.radio.data.t.a.c);
            return;
        } else
        {
            a(context, aa1.A(), aa1.H(), a(aa1));
            a(c1, aa1, a(aa1));
            return;
        }
    }

    private static void a(Context context, String s1, String s2, String s3)
    {
        a a1 = a(context, s1, s2);
        if (a(context))
        {
            a(context, a1, s1, s2, s3);
        } else
        if (!b(context, a1, s1, s2, s3))
        {
            com.pandora.android.util.s.a(context, 0x7f08009d);
            return;
        }
    }

    public static void a(Context context, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        if (!a(context))
        {
            com.pandora.android.activity.a.a(context, s6);
        } else
        {
            a(context, s1, s2, s3);
            context = a(((Context) (b.a.h())), s1, s2);
            s5 = a(((a) (context)));
            s6 = a(((a) (context)), s1, s2, s3);
        }
        a(b.a.b(), s5, s4, s6);
    }

    private static void a(c c1, aa aa1, String s1)
    {
        String s2 = aa1.A();
        String s3 = aa1.H();
        a a1 = a(c1.s(), s2, s3);
        (new ad(c1, a(a1, s2, s3, s1), a(a1), aa1)).a_(new Object[0]);
    }

    private static void a(c c1, String s1, String s2, String s3)
    {
        (new ad(c1, s3, s1, s2)).a_(new Object[0]);
    }

    private static boolean a(Context context)
    {
        if (!b.a.b().l().l())
        {
            context = context.getPackageManager();
            Intent intent = new Intent();
            intent.setAction("com.amazon.mp3.action.EXTERNAL_EVENT");
            if (context.resolveActivity(intent, 0x10000) != null)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean b(Context context, a a1, String s1, String s2, String s3)
    {
        a1 = a(a1, s1, s2, s3);
        p.df.a.a("AmazonStoreManager", (new StringBuilder()).append("launchAmazonStoreInBrowser() -->  url = ").append(a1).toString());
        return com.pandora.android.activity.a.a(context, a1);
    }

}
