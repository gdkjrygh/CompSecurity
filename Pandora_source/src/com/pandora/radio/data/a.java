// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.content.ContentValues;
import android.database.Cursor;
import com.pandora.radio.util.i;
import java.io.Serializable;
import java.security.InvalidParameterException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.cw.c;
import p.cx.u;

// Referenced classes of package com.pandora.radio.data:
//            b

public class com.pandora.radio.data.a
    implements Serializable
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a a(String s1)
        {
            if ("html".equalsIgnoreCase(s1))
            {
                return a;
            }
            if ("adm".equalsIgnoreCase(s1))
            {
                return b;
            }
            if ("iad".equalsIgnoreCase(s1))
            {
                throw new InvalidParameterException("Ad type 'iad' not supported on Android");
            }
            if ("video".equalsIgnoreCase(s1))
            {
                return c;
            }
            if ("google".equalsIgnoreCase(s1))
            {
                return d;
            } else
            {
                return a;
            }
        }

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/pandora/radio/data/a$a, s1);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        public String toString()
        {
            static class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[a.values().length];
                    try
                    {
                        a[a.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[a.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[com.pandora.radio.data.a.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[a.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1.a[ordinal()])
            {
            default:
                return "html";

            case 2: // '\002'
                return "adm";

            case 3: // '\003'
                return "video";

            case 4: // '\004'
                return "google";
            }
        }

        static 
        {
            a = new a("HTML", 0);
            b = new a("ADM", 1);
            c = new a("VIDEO", 2);
            d = new a("GOOGLE", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static class b
    {

        private final com.pandora.radio.data.a a;
        private final a b;

        private String d(String s1)
        {
            return String.format("Cannot call %s() when constructed with Builder(Cursor || JSONObject);", new Object[] {
                s1
            });
        }

        private void e(String s1)
        {
            if (b == a.a || b == a.b)
            {
                throw new InvalidParameterException(d(s1));
            } else
            {
                return;
            }
        }

        public b a(int i1)
        {
            e("setHeight");
            com.pandora.radio.data.a.a(a, i1);
            return this;
        }

        public b a(a a1)
        {
            e("setType");
            com.pandora.radio.data.a.a(a, a1);
            return this;
        }

        public b a(String s1)
        {
            e("setInterstitialHtml");
            com.pandora.radio.data.a.a(a, s1);
            return this;
        }

        public b a(boolean flag)
        {
            e("setIsCreateStationAdFollowOnBanner");
            com.pandora.radio.data.a.a(a, flag);
            return this;
        }

        public com.pandora.radio.data.a a()
        {
            return a;
        }

        public b b(String s1)
        {
            e("setDfpAdUnitId");
            com.pandora.radio.data.a.b(a, s1);
            return this;
        }

        public b b(boolean flag)
        {
            e("setIsValueExchangeFollowOnBanner");
            com.pandora.radio.data.a.b(a, flag);
            return this;
        }

        public b c(String s1)
        {
            e("setHtml");
            com.pandora.radio.data.a.c(a, s1);
            return this;
        }

        public b(Cursor cursor)
        {
            this(new com.pandora.radio.data.a(cursor), a.a);
        }

        public b(com.pandora.radio.data.a a1)
        {
            this(new com.pandora.radio.data.a(a1), com.pandora.radio.data.a.c);
        }

        private b(com.pandora.radio.data.a a1, a a2)
        {
            if (com.pandora.radio.data.a.a(a1) == com.pandora.radio.data.a.c)
            {
                throw new InvalidParameterException("Use a VideoAdData constructor to build AdData of type AdType.VIDEO");
            } else
            {
                a = a1;
                b = a2;
                return;
            }
        }

        public b(String s1, int i1, a a1)
        {
            this(new com.pandora.radio.data.a(s1, i1, a1), com.pandora.radio.data.a.c);
        }

        public b(JSONObject jsonobject, boolean flag, c c1)
            throws JSONException
        {
            this(new com.pandora.radio.data.a(jsonobject, flag, c1), a.b);
        }
    }

    private static final class b.a extends Enum
    {

        public static final b.a a;
        public static final b.a b;
        public static final b.a c;
        private static final b.a d[];

        public static b.a valueOf(String s1)
        {
            return (b.a)Enum.valueOf(com/pandora/radio/data/a$b$a, s1);
        }

        public static b.a[] values()
        {
            return (b.a[])d.clone();
        }

        static 
        {
            a = new b.a("CURSOR", 0);
            b = new b.a("JSON", 1);
            c = new b.a("REGULAR", 2);
            d = (new b.a[] {
                a, b, c
            });
        }

        private b.a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    protected String a;
    protected boolean b;
    protected boolean c;
    private boolean d;
    private String e;
    private String f;
    private int g;
    private boolean h;
    private boolean i;
    private String j;
    private String k;
    private String l;
    private boolean m;
    private boolean n;
    private boolean o;
    private a p;
    private boolean q;
    private boolean r;
    private int s;
    private String t;
    private com.pandora.radio.data.b u;
    private Object v;

    private com.pandora.radio.data.a(Cursor cursor)
    {
        boolean flag1 = true;
        super();
        p = a.a;
        u = new com.pandora.radio.data.b();
        boolean flag;
        if (cursor.getInt(4) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        e = cursor.getString(5);
        f = cursor.getString(18);
        g = cursor.getInt(6);
        a = cursor.getString(7);
        if (cursor.getInt(8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        if (cursor.getInt(9) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if (cursor.getInt(10) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        j = cursor.getString(11);
        k = cursor.getString(12);
        l = cursor.getString(13);
        if (cursor.getInt(14) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        m = flag;
        if (cursor.getInt(16) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n = flag;
        if (cursor.getInt(17) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o = flag;
        p = a.a(cursor.getString(15));
        q = false;
        r = false;
        s = b(g);
        i = false;
    }

    com.pandora.radio.data.a(Cursor cursor, _cls1 _pcls1)
    {
        this(cursor);
    }

    private com.pandora.radio.data.a(com.pandora.radio.data.a a1)
    {
        p = a.a;
        u = new com.pandora.radio.data.b();
        d = a1.d;
        e = a1.e;
        f = a1.f;
        g = a1.g;
        a = a1.a;
        b = a1.b;
        h = a1.h;
        c = a1.c;
        j = a1.j;
        k = a1.k;
        l = a1.l;
        m = a1.m;
        n = a1.n;
        o = a1.o;
        p = a1.p;
        q = a1.q;
        r = a1.r;
        t = a1.t;
        s = a1.s;
        i = a1.i;
    }

    com.pandora.radio.data.a(com.pandora.radio.data.a a1, _cls1 _pcls1)
    {
        this(a1);
    }

    protected com.pandora.radio.data.a(String s1, int i1, a a1)
    {
        p = a.a;
        u = new com.pandora.radio.data.b();
        e = s1;
        g = i1;
        p = a1;
        s = b(i1);
    }

    private com.pandora.radio.data.a(JSONObject jsonobject, boolean flag, c c1)
        throws JSONException
    {
        String s2 = null;
        super();
        p = a.a;
        u = new com.pandora.radio.data.b();
        if (jsonobject == null)
        {
            throw new InvalidParameterException("jsonResponse is null");
        }
        String s1 = jsonobject.optString("logonSponsor");
        if (!com.pandora.radio.util.i.a(s1))
        {
            ((u)c1.p()).c(s1);
        }
        a a1;
        if (a("html", jsonobject))
        {
            c1 = (String)jsonobject.get("html");
        } else
        if (a("imageUrl", jsonobject))
        {
            c1 = jsonobject.optString("clickUrl");
            s1 = String.format("<img src=\"%s\" style=\"height:100%%;width:100%%;\">", new Object[] {
                jsonobject.optString("imageUrl")
            });
            if (!com.pandora.radio.util.i.a(c1))
            {
                c1 = String.format("<html><head></head><body style=\"padding:0px;margin:0px;background-color:transparent;\">%s</body></html>", new Object[] {
                    String.format("<a target=\"_blank\" href=\"%s\" border=0>%s</a>", new Object[] {
                        c1, s1
                    })
                });
            } else
            {
                c1 = String.format("<html><head></head><body style=\"padding:0px;margin:0px;background-color:transparent;\">%s</body></html>", new Object[] {
                    s1
                });
            }
        } else
        {
            c1 = null;
        }
        if (a("intskip", jsonobject))
        {
            s1 = jsonobject.getString("intskip");
        } else
        {
            s1 = null;
        }
        if (a("adId", jsonobject))
        {
            s2 = jsonobject.getString("adId");
        }
        a1 = a(jsonobject);
        e = c1;
        p = a1;
        g = a(jsonobject, a1);
        f = s1;
        t = s2;
        a = jsonobject.optString("impressionUrl");
        if (a("bannerRenderTracker", jsonobject))
        {
            j = jsonobject.getString("bannerRenderTracker");
        }
        if (a("bannerRenderDarkTracker", jsonobject))
        {
            k = jsonobject.getString("bannerRenderDarkTracker");
        }
        if (a("bannerDisplayAfterDarkTracker", jsonobject))
        {
            l = jsonobject.getString("bannerDisplayAfterDarkTracker");
        }
        h = flag;
        s = b(g);
    }

    com.pandora.radio.data.a(JSONObject jsonobject, boolean flag, c c1, _cls1 _pcls1)
        throws JSONException
    {
        this(jsonobject, flag, c1);
    }

    static int a(com.pandora.radio.data.a a1, int i1)
    {
        a1.g = i1;
        return i1;
    }

    private int a(JSONObject jsonobject, a a1)
        throws JSONException
    {
        if (jsonobject.has("height"))
        {
            return jsonobject.getInt("height");
        }
        switch (_cls1.a[a1.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("getAdHeight() called with unknown AdType: ").append(a1).toString());

        case 2: // '\002'
            return 250;

        case 1: // '\001'
        case 3: // '\003'
        case 4: // '\004'
            return 50;
        }
    }

    static a a(com.pandora.radio.data.a a1)
    {
        return a1.p;
    }

    static a a(com.pandora.radio.data.a a1, a a2)
    {
        a1.p = a2;
        return a2;
    }

    private a a(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONArray("creatives");
        if (jsonobject == null)
        {
            return a.a;
        }
        if (jsonobject.length() > 0)
        {
            return a.a(jsonobject.getJSONObject(0).getString("type"));
        } else
        {
            return a.a;
        }
    }

    static String a(com.pandora.radio.data.a a1, String s1)
    {
        a1.f = s1;
        return s1;
    }

    static boolean a(com.pandora.radio.data.a a1, boolean flag)
    {
        a1.q = flag;
        return flag;
    }

    private boolean a(String s1, JSONObject jsonobject)
    {
        return jsonobject.has(s1) && !com.pandora.radio.util.i.a(jsonobject.optString(s1));
    }

    private int b(int i1)
    {
        return i1 != 250 ? 320 : 300;
    }

    static String b(com.pandora.radio.data.a a1, String s1)
    {
        a1.t = s1;
        return s1;
    }

    static boolean b(com.pandora.radio.data.a a1, boolean flag)
    {
        a1.r = flag;
        return flag;
    }

    static String c(com.pandora.radio.data.a a1, String s1)
    {
        a1.e = s1;
        return s1;
    }

    public ContentValues J()
    {
        boolean flag = true;
        ContentValues contentvalues = new ContentValues();
        int i1;
        if (d)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("dismissed", Integer.valueOf(i1));
        contentvalues.put("html", e);
        contentvalues.put("interstitialHtml", f);
        contentvalues.put("height", Integer.valueOf(g));
        contentvalues.put("impressionUrl", a);
        if (b)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("impressionSent", Integer.valueOf(i1));
        if (h)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("isAudioAdFollowOnBanner", Integer.valueOf(i1));
        if (c)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("isVideoAdFollowOnBanner", Integer.valueOf(i1));
        contentvalues.put("bannerRenderTrackerUrl", j);
        contentvalues.put("bannerRenderDarkTrackerUrl", k);
        contentvalues.put("bannerDisplayAfterDarkTrackerUrl", l);
        if (m)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("bannerRenderTracked", Integer.valueOf(i1));
        if (n)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("bannerRenderDarkImpressionSent", Integer.valueOf(i1));
        if (o)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        contentvalues.put("bannerRenderDisplayAfterDarkImpressionSent", Integer.valueOf(i1));
        contentvalues.put("type", p.toString());
        return contentvalues;
    }

    public boolean K()
    {
        return d;
    }

    public String L()
    {
        return e;
    }

    public int M()
    {
        return g;
    }

    public int N()
    {
        return s;
    }

    public String O()
    {
        return f;
    }

    public String P()
    {
        return t;
    }

    public boolean Q()
    {
        return i;
    }

    public boolean R()
    {
        return b;
    }

    public void S()
    {
        b = true;
    }

    public void T()
    {
        d = true;
    }

    public boolean U()
    {
        return h || c || q || r;
    }

    public boolean V()
    {
        return h;
    }

    public boolean W()
    {
        return c;
    }

    public boolean X()
    {
        return q;
    }

    public boolean Y()
    {
        return r;
    }

    public String Z()
    {
        return j;
    }

    public void a(int i1)
    {
        g = i1;
        s = b(i1);
    }

    public void a(int i1, int j1)
    {
        s = i1;
        g = j1;
    }

    public void a(com.pandora.radio.data.b b1)
    {
        u = b1;
    }

    public void a(Object obj)
    {
        v = obj;
    }

    public String aa()
    {
        return k;
    }

    public String ab()
    {
        return l;
    }

    public boolean ac()
    {
        return m;
    }

    public void ad()
    {
        m = true;
    }

    public void ae()
    {
        n = true;
    }

    public boolean af()
    {
        return o;
    }

    public void ag()
    {
        o = true;
    }

    public a ah()
    {
        return p;
    }

    public Object ai()
    {
        return v;
    }

    public void b(boolean flag)
    {
        i = flag;
    }

    public com.pandora.radio.data.b c()
    {
        return u;
    }
}
