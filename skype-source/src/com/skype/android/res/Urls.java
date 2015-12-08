// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.skype.android.SkypeApplication;
import com.skype.android.util.DeviceFeatures;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class Urls
{
    public static final class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        public static final Type c;
        public static final Type d;
        public static final Type e;
        public static final Type f;
        public static final Type g;
        public static final Type h;
        public static final Type i;
        public static final Type j;
        public static final Type k;
        public static final Type l;
        public static final Type m;
        public static final Type n;
        public static final Type o;
        public static final Type p;
        public static final Type q;
        public static final Type r;
        public static final Type s;
        public static final Type t;
        public static final Type u;
        public static final Type v;
        public static final Type w;
        private static final Type z[];
        private boolean x;
        private int y;

        public static Type valueOf(String s1)
        {
            return (Type)Enum.valueOf(com/skype/android/res/Urls$Type, s1);
        }

        public static Type[] values()
        {
            return (Type[])z.clone();
        }

        public final boolean a()
        {
            return x;
        }

        final int b()
        {
            return y;
        }

        static 
        {
            a = new Type("SKYPE_HELP", 0, 0x7f080513, false);
            b = new Type("SKYPE_USER_FEEDBACK", 1, 0x7f080508, false);
            c = new Type("SKYPE_BUY_ONLINE_NUMBER", 2, 0x7f0804f6, true);
            d = new Type("SKYPE_BUY_VOICEMAIL", 3, 0x7f0804fa, true);
            e = new Type("SKYPE_BUY_CREDIT", 4, 0x7f0804f7, true);
            f = new Type("SKYPE_BUY_SUBSCRIPTION", 5, 0x7f0804f9, true);
            g = new Type("SKYPE_BUY_PREMIUM", 6, 0x7f0804f8, true);
            h = new Type("SKYPE_ACCOUNT", 7, 0x7f0804f1, true);
            int i1;
            if (DeviceFeatures.c())
            {
                i1 = 0x7f080569;
            } else
            {
                i1 = 0x7f080568;
            }
            i = new Type("ANDROID_MARKET_DETAILS", 8, i1, false);
            if (DeviceFeatures.c())
            {
                i1 = 0x7f08056c;
            } else
            if (DeviceFeatures.d())
            {
                i1 = 0x7f08056b;
            } else
            {
                i1 = 0x7f08056a;
            }
            j = new Type("ANDROID_MARKET_SEARCH", 9, i1, false);
            if (DeviceFeatures.c())
            {
                i1 = 0x7f08056f;
            } else
            if (DeviceFeatures.d())
            {
                i1 = 0x7f08056e;
            } else
            {
                i1 = 0x7f08056d;
            }
            k = new Type("ANDROID_MARKET", 10, i1, false);
            if (DeviceFeatures.c())
            {
                i1 = 0x7f080578;
            } else
            {
                i1 = 0x7f080577;
            }
            l = new Type("SKYPE_WIFI_URL", 11, i1, false);
            m = new Type("SKYPE_WIFI_PACKAGE", 12, 0x7f080576, false);
            n = new Type("SKYPE_FORGOTTEN_PASSWORD", 13, 0x7f080509, false);
            o = new Type("SKYPE_FEEDBACK", 14, 0x7f08034f, false);
            p = new Type("SKYPE_ACCOUNT_BLOCKED", 15, 0x7f0804f0, false);
            if (DeviceFeatures.c())
            {
                i1 = 0x7f08058c;
            } else
            if (DeviceFeatures.d())
            {
                i1 = 0x7f08058b;
            } else
            {
                i1 = 0x7f08058a;
            }
            q = new Type("WHITELIST_VERSION", 16, i1, false);
            r = new Type("LIVEID_AUTH", 17, 0, false);
            s = new Type("TERMS_OF_USE", 18, 0x7f08057e, false);
            t = new Type("PRIVACY_POLICY", 19, 0x7f080574, false);
            u = new Type("MANAGE_MSA_ALIASES", 20, 0x7f080566, false);
            v = new Type("MANAGE_PROFILE_LINK", 21, 0x7f080567, false);
            w = new Type("SKYPE_PSTN_BLOCKED_REGULATORY_INDIA", 22, 0x7f080563, false);
            z = (new Type[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w
            });
        }

        private Type(String s1, int i1, int j1, boolean flag)
        {
            super(s1, i1);
            x = flag;
            y = j1;
        }
    }


    private static Set a;
    private static Map b;
    private Context c;

    public Urls(Application application)
    {
        c = application;
    }

    private String a()
    {
        PackageInfo packageinfo;
        try
        {
            packageinfo = c.getPackageManager().getPackageInfo(c.getPackageName(), 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new RuntimeException(namenotfoundexception);
        }
        return String.format("%s", new Object[] {
            packageinfo.versionName
        });
    }

    private String b()
    {
        Object obj = c.getResources().getConfiguration().locale;
        String s = ((Locale) (obj)).getLanguage();
        obj = ((Locale) (obj)).toString();
        if (b.containsKey(obj))
        {
            s = (String)b.get(obj);
        }
        if (!a.contains(s))
        {
            s = null;
        }
        obj = s;
        if (s == null)
        {
            obj = Locale.ENGLISH.toString();
        }
        return ((String) (obj));
    }

    private String d(Type type)
    {
        StringBuilder stringbuilder = new StringBuilder();
        c.getApplicationContext();
        stringbuilder.append(String.format(c.getString(0x7f0804f5), new Object[] {
            SkypeApplication.g(), a(), b(), c.getString(type.b())
        }));
        return stringbuilder.toString();
    }

    public final String a(Type type)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Type.values().length];
                try
                {
                    a[Type.r.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    a[Type.k.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    a[Type.i.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    a[Type.j.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    a[Type.o.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    a[Type.b.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    a[Type.p.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    a[Type.q.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    a[Type.l.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    a[Type.m.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[Type.w.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[Type.v.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[Type.u.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[Type.c.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[Type.d.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[Type.g.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[Type.e.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[Type.h.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[Type.f.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[Type.n.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Type.a.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Type.s.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Type.t.ordinal()] = 23;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[type.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("no defined url: ")).append(type).toString());

        case 1: // '\001'
            try
            {
                type = (new StringBuilder()).append(c.getString(0x7f080564)).append(URLEncoder.encode(c.getString(0x7f080565), "utf-8")).toString();
            }
            // Misplaced declaration of an exception variable
            catch (Type type)
            {
                throw new RuntimeException(type);
            }
            return type;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
            return c.getString(type.b());

        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
            if (type.a())
            {
                if (!TextUtils.isEmpty(null))
                {
                    return a(null, b(type), c.getString(type.b()), null);
                } else
                {
                    return d(type);
                }
            } else
            {
                return c.getString(type.b());
            }

        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
            return d(type);
        }
    }

    public final String a(String s, String s1)
    {
        android.net.Uri.Builder builder = Uri.parse(a(Type.b)).buildUpon();
        builder.appendQueryParameter("p", "20703").appendQueryParameter("v", "6.13.0.608").appendQueryParameter("lang", c.getResources().getConfiguration().locale.toString()).appendQueryParameter("u", s);
        if (s1 != null)
        {
            builder.appendQueryParameter("eTag", s1);
        }
        return builder.build().toString();
    }

    public final String a(String s, String s1, String s2, String s3)
    {
        android.net.Uri.Builder builder = Uri.parse(c.getString(0x7f080573)).buildUpon();
        builder.appendQueryParameter(c.getString(0x7f080579), s).appendQueryParameter(c.getString(0x7f08050e), s1).appendQueryParameter(c.getString(0x7f08050d), c.getString(0x7f080515, new Object[] {
            a(), s2
        })).appendQueryParameter(c.getString(0x7f080562), b()).appendQueryParameter("returnUrl", s3).appendQueryParameter("cancelUrl", s3);
        return builder.build().toString();
    }

    public final String b(Type type)
    {
        switch (_cls1.a[type.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("no defined url: ")).append(type).toString());

        case 14: // '\016'
        case 15: // '\017'
        case 18: // '\022'
            return c.getString(0x7f08050c);

        case 16: // '\020'
            return c.getString(0x7f08050f);

        case 19: // '\023'
            return c.getString(0x7f080511);

        case 17: // '\021'
            return c.getString(0x7f080510);
        }
    }

    public final String c(Type type)
    {
        switch (_cls1.a[type.ordinal()])
        {
        default:
            return null;

        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
            return c.getString(type.b());
        }
    }

    static 
    {
        Object obj = new HashSet();
        ((Set) (obj)).add(Locale.ENGLISH.toString());
        ((Set) (obj)).add("da");
        ((Set) (obj)).add(Locale.GERMAN.toString());
        ((Set) (obj)).add("es");
        ((Set) (obj)).add("et");
        ((Set) (obj)).add("fi");
        ((Set) (obj)).add(Locale.FRENCH.toString());
        ((Set) (obj)).add(Locale.ITALIAN.toString());
        ((Set) (obj)).add(Locale.JAPANESE.toString());
        ((Set) (obj)).add(Locale.KOREAN.toString());
        ((Set) (obj)).add("nl");
        ((Set) (obj)).add("pl");
        ((Set) (obj)).add("pt");
        ((Set) (obj)).add("pt-BR");
        ((Set) (obj)).add("ru");
        ((Set) (obj)).add("sv");
        ((Set) (obj)).add("zh-Hans");
        ((Set) (obj)).add("zh-Hant");
        ((Set) (obj)).add("tr");
        ((Set) (obj)).add("bg");
        ((Set) (obj)).add("hi");
        ((Set) (obj)).add("ca");
        ((Set) (obj)).add("hr");
        ((Set) (obj)).add("cs");
        ((Set) (obj)).add("el");
        ((Set) (obj)).add("hu");
        ((Set) (obj)).add("no");
        ((Set) (obj)).add("ro");
        ((Set) (obj)).add("sr");
        ((Set) (obj)).add("sk");
        ((Set) (obj)).add("sl");
        ((Set) (obj)).add("uk");
        ((Set) (obj)).add("vi");
        ((Set) (obj)).add("lt");
        ((Set) (obj)).add("lv");
        a = ((Set) (obj));
        obj = new HashMap();
        b = ((Map) (obj));
        ((Map) (obj)).put(Locale.TRADITIONAL_CHINESE.toString(), "zh-Hant");
        b.put(Locale.SIMPLIFIED_CHINESE.toString(), "zh-Hans");
        b.put(Locale.CHINESE.toString(), "zh-Hans");
        b.put("nb_NO", "no");
    }
}
