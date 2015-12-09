// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import com.pandora.radio.util.i;
import java.io.Serializable;
import java.util.Hashtable;
import org.json.JSONObject;

public class ai
    implements Serializable
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a f[];
        public String e;

        public static a a(String s1)
        {
            if (s1.equals("true"))
            {
                return c;
            }
            if (s1.equals("false"))
            {
                return d;
            }
            if (s1.equals("disabled"))
            {
                return a;
            } else
            {
                return b;
            }
        }

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/pandora/radio/data/ai$a, s1);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        static 
        {
            a = new a("DISABLED", 0, "disabled");
            b = new a("ENABLED", 1, "");
            c = new a("TRUE", 2, "true");
            d = new a("FALSE", 3, "false");
            f = (new a[] {
                a, b, c, d
            });
        }

        private a(String s1, int i1, String s2)
        {
            super(s1, i1);
            e = s2;
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/pandora/radio/data/ai$b, s1);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new b("unknown", 0);
            b = new b("male", 1);
            c = new b("female", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private b a;
    private int b;
    private String c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private String k;
    private String l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private String s;
    private boolean t;
    private a u;
    private a v;

    public ai(b b1, int i1, String s1, boolean flag, boolean flag1, boolean flag2, boolean flag3, 
            boolean flag4, boolean flag5, boolean flag6, String s2, String s3, boolean flag7, boolean flag8, 
            boolean flag9, boolean flag10, boolean flag11, boolean flag12, String s4, boolean flag13, a a1, 
            a a2)
    {
        a = b1;
        b = i1;
        b1 = s1;
        if (s1 == null)
        {
            b1 = "";
        }
        c = b1;
        d = flag;
        e = flag1;
        f = flag2;
        g = flag3;
        h = flag4;
        i = flag5;
        j = flag6;
        k = s2;
        l = s3;
        m = flag7;
        n = flag8;
        o = flag9;
        p = flag10;
        q = flag11;
        r = flag12;
        s = s4;
        t = flag13;
        u = a1;
        v = a2;
    }

    public ai(ai ai1)
    {
        this(ai1.a(), ai1.c(), ai1.d(), ai1.e(), ai1.f(), ai1.g(), ai1.h(), ai1.i(), ai1.j(), ai1.k(), ai1.l(), ai1.m(), ai1.n(), ai1.o(), ai1.p(), ai1.q(), ai1.r(), ai1.s(), ai1.t(), ai1.u(), ai1.v(), ai1.w());
    }

    public ai(JSONObject jsonobject)
    {
        boolean flag1 = true;
        super();
        a = b(jsonobject.optString("gender"));
        b = jsonobject.optInt("birthYear", 0);
        c = jsonobject.optString("zipCode", "");
        boolean flag;
        if (!jsonobject.optBoolean("isProfilePrivate", true))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        e = jsonobject.optBoolean("enableComments", false);
        f = jsonobject.optBoolean("pushNotificationDeviceOptIn", true);
        g = jsonobject.optBoolean("emailOptInPandora", true);
        h = jsonobject.optBoolean("pushOptInPandora", true);
        i = jsonobject.optBoolean("emailOptInListeners", true);
        j = jsonobject.optBoolean("pushOptInListeners", true);
        if (!jsonobject.optBoolean("isExplicitContentFilterEnabled", false))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        m = flag;
        n = jsonobject.optBoolean("isExplicitContentFilterPINProtected", false);
        o = jsonobject.optBoolean("facebookAutoShareEnabled", false);
        p = jsonobject.optBoolean("autoShareTrackPlay", false);
        q = jsonobject.optBoolean("autoShareLikes", false);
        r = jsonobject.optBoolean("autoShareFollows", false);
        s = jsonobject.optString("facebookSettingChecksum");
        t = jsonobject.optBoolean("userInitiatedChange", false);
        if (jsonobject.has("artistAudioMessagesEnabled"))
        {
            u = a.a(jsonobject.optString("artistAudioMessagesEnabled", ""));
        } else
        {
            u = a.a;
        }
        if (jsonobject.has("emailOptInArtists"))
        {
            v = a.a(Boolean.toString(jsonobject.optBoolean("emailOptInArtists", false)));
        } else
        {
            v = a.a;
        }
        k = null;
        l = null;
    }

    public static int a(String s1)
    {
        int i1;
        try
        {
            i1 = Integer.parseInt(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return -1;
        }
        return i1;
    }

    public static String a(b b1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[b.values().length];
                try
                {
                    a[b.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[b1.ordinal()])
        {
        default:
            return "";

        case 1: // '\001'
            return "Female";

        case 2: // '\002'
            return "Male";
        }
    }

    public static b b(String s1)
    {
        if ("Male".equalsIgnoreCase(s1))
        {
            return b.b;
        }
        if ("Female".equalsIgnoreCase(s1))
        {
            return b.c;
        } else
        {
            return b.a;
        }
    }

    public b a()
    {
        return a;
    }

    public Hashtable a(ai ai1, String s1, String s2)
    {
        boolean flag1 = true;
        Hashtable hashtable = new Hashtable();
        if (ai1.a != a)
        {
            hashtable.put("gender", a(a).toLowerCase());
        }
        if (ai1.b != b)
        {
            hashtable.put("birthYear", Integer.valueOf(b));
        }
        if (com.pandora.radio.util.i.a(ai1.c, c) != 0)
        {
            hashtable.put("zipCode", c);
        }
        boolean flag;
        if (ai1.d != d)
        {
            if (!d)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hashtable.put("isProfilePrivate", Boolean.valueOf(flag));
        }
        if (ai1.e != e)
        {
            hashtable.put("enableComments", Boolean.valueOf(e));
        }
        if (ai1.f != f)
        {
            hashtable.put("pushNotificationDeviceOptIn", Boolean.valueOf(f));
        }
        if (ai1.g != g)
        {
            hashtable.put("emailOptInPandora", Boolean.valueOf(g));
        }
        if (ai1.h != h)
        {
            hashtable.put("pushOptInPandora", Boolean.valueOf(h));
        }
        if (ai1.i != i)
        {
            hashtable.put("emailOptInListeners", Boolean.valueOf(i));
        }
        if (ai1.j != j)
        {
            hashtable.put("pushOptInListeners", Boolean.valueOf(j));
        }
        if (ai1.m != m)
        {
            if (!m)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            hashtable.put("isExplicitContentFilterEnabled", Boolean.valueOf(flag));
        }
        if (ai1.n != n)
        {
            hashtable.put("isExplicitContentFilterPINProtected", Boolean.valueOf(n));
        }
        if (!com.pandora.radio.util.i.a(s1))
        {
            hashtable.put("currentUsername", s1);
        }
        if (!com.pandora.radio.util.i.a(s2))
        {
            hashtable.put("currentPassword", s2);
        }
        if (com.pandora.radio.util.i.a(ai1.k, k) != 0)
        {
            hashtable.put("newUsername", k);
        }
        if (!com.pandora.radio.util.i.a(l))
        {
            hashtable.put("newPassword", l);
        }
        if (ai1.o != o)
        {
            hashtable.put("facebookAutoShareEnabled", Boolean.valueOf(o));
        }
        if (ai1.p != p)
        {
            hashtable.put("autoShareTrackPlay", Boolean.valueOf(p));
        }
        if (ai1.q != q)
        {
            hashtable.put("autoShareLikes", Boolean.valueOf(q));
        }
        if (ai1.r != r)
        {
            hashtable.put("autoShareFollows", Boolean.valueOf(r));
        }
        if (ai1.s != s)
        {
            hashtable.put("facebookSettingChecksum", s);
        }
        if (ai1.u != u)
        {
            hashtable.put("artistAudioMessagesEnabled", u.e);
        }
        if (ai1.v != v)
        {
            hashtable.put("emailOptInArtists", Boolean.valueOf(v.e));
        }
        hashtable.put("userInitiatedChange", Boolean.valueOf(t));
        return hashtable;
    }

    public void a(a a1)
    {
        u = a1;
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public boolean a(ai ai1)
    {
        return a() == ai1.a() && c() == ai1.c() && d() == ai1.d() && e() == ai1.e() && f() == ai1.f() && g() == ai1.g() && h() == ai1.h() && i() == ai1.i() && j() == ai1.j() && k() == ai1.k() && l() == ai1.l() && m() == ai1.m() && n() == ai1.n() && o() == ai1.o() && p() == ai1.p() && q() == ai1.q() && r() == ai1.r() && s() == ai1.s() && t() == ai1.t() && v() == ai1.v() && w() == ai1.w();
    }

    public String b()
    {
        return a(a);
    }

    public void b(a a1)
    {
        v = a1;
    }

    public void b(boolean flag)
    {
        e = flag;
    }

    public boolean b(ai ai1)
    {
        return p() != ai1.p() || s() != ai1.s() || r() != ai1.r() || q() != ai1.q();
    }

    public int c()
    {
        return b;
    }

    public void c(String s1)
    {
        k = s1;
    }

    public void c(boolean flag)
    {
        f = flag;
    }

    public String d()
    {
        return c;
    }

    public void d(boolean flag)
    {
        g = flag;
    }

    public void e(boolean flag)
    {
        h = flag;
    }

    public boolean e()
    {
        return d;
    }

    public void f(boolean flag)
    {
        i = flag;
    }

    public boolean f()
    {
        return e;
    }

    public void g(boolean flag)
    {
        j = flag;
    }

    public boolean g()
    {
        return f;
    }

    public void h(boolean flag)
    {
        m = flag;
    }

    public boolean h()
    {
        return g;
    }

    public void i(boolean flag)
    {
        o = flag;
    }

    public boolean i()
    {
        return h;
    }

    public void j(boolean flag)
    {
        p = flag;
    }

    public boolean j()
    {
        return i;
    }

    public void k(boolean flag)
    {
        q = flag;
    }

    public boolean k()
    {
        return j;
    }

    public String l()
    {
        return k;
    }

    public void l(boolean flag)
    {
        r = flag;
    }

    public String m()
    {
        return l;
    }

    public void m(boolean flag)
    {
        t = flag;
    }

    public boolean n()
    {
        return m;
    }

    public boolean o()
    {
        return n;
    }

    public boolean p()
    {
        return o;
    }

    public boolean q()
    {
        return p;
    }

    public boolean r()
    {
        return q;
    }

    public boolean s()
    {
        return r;
    }

    public String t()
    {
        return s;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("UserSettingsData ( ");
        stringbuffer.append((new StringBuilder()).append(" gender : ").append(a).toString());
        stringbuffer.append((new StringBuilder()).append(", birthYear : ").append(b).toString());
        String s1;
        if ((new StringBuilder()).append(", zipCode : ").append(c).toString() == null)
        {
            s1 = "";
        } else
        {
            s1 = c;
        }
        stringbuffer.append(s1);
        stringbuffer.append((new StringBuilder()).append(", isProfilePublic : ").append(d).toString());
        stringbuffer.append((new StringBuilder()).append(", enableComments : ").append(e).toString());
        stringbuffer.append((new StringBuilder()).append(", pushNotificationDeviceOptIn : ").append(f).toString());
        stringbuffer.append((new StringBuilder()).append(", emailOptInPandora : ").append(g).toString());
        stringbuffer.append((new StringBuilder()).append(", pushOptInPandora : ").append(h).toString());
        stringbuffer.append((new StringBuilder()).append(", emailOptInListeners : ").append(i).toString());
        stringbuffer.append((new StringBuilder()).append(", pushOptInListeners : ").append(j).toString());
        stringbuffer.append((new StringBuilder()).append(", username : ").append(k).toString());
        stringbuffer.append((new StringBuilder()).append(", password : ").append(l).toString());
        stringbuffer.append((new StringBuilder()).append(", allowExplicitContent : ").append(m).toString());
        stringbuffer.append((new StringBuilder()).append(", isExplicitContentFilterPINProtected : ").append(n).toString());
        stringbuffer.append((new StringBuilder()).append(", facebookAutoShareEnabled : ").append(o).toString());
        stringbuffer.append((new StringBuilder()).append(", facebookAutoShareTrackPlay : ").append(p).toString());
        stringbuffer.append((new StringBuilder()).append(", facebookAutoShareLikes : ").append(q).toString());
        stringbuffer.append((new StringBuilder()).append(", facebookAutoShareFollows : ").append(r).toString());
        stringbuffer.append((new StringBuilder()).append(", facebookSettingChecksum : ").append(s).toString());
        stringbuffer.append((new StringBuilder()).append(", userInitiatedChange : ").append(t).toString());
        stringbuffer.append((new StringBuilder()).append(", artistAudioMessagesEnabled : ").append(u).toString());
        stringbuffer.append((new StringBuilder()).append(", emailOptInArtistsEnabled : ").append(v).toString());
        stringbuffer.append(")");
        return stringbuffer.toString();
    }

    public boolean u()
    {
        return t;
    }

    public a v()
    {
        return u;
    }

    public a w()
    {
        return v;
    }
}
