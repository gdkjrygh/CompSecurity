// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import com.android.volley.toolbox.n;
import com.kik.android.a;
import com.kik.g.e;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.k;
import com.kik.l.ab;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kik.a.d.aa;
import kik.a.d.j;
import kik.a.e.l;
import kik.a.e.r;
import kik.a.e.v;
import kik.a.e.w;
import org.c.b;
import org.c.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package kik.android.util:
//            cl, cq, cm, cn, 
//            co, ar, DeviceUtils

public final class ck
{
    private static final class a
    {

        final ArrayList a;
        final HashSet b;
        final Map c;
        int d;

        private a()
        {
            a = new ArrayList();
            b = new HashSet();
            c = new LinkedHashMap();
            d = kik.android.util.a.a;
        }

        a(byte byte0)
        {
            this();
        }
    }

    public static final class a.a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        private static final int d[];

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = (new int[] {
                a, b, c
            });
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b g[];
        public final String d;
        public final String e;
        public final String f;

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(kik/android/util/ck$b, s);
        }

        public static b[] values()
        {
            return (b[])g.clone();
        }

        static 
        {
            a = new b("PROMOTED", 0, "promoted", "Promoted Chat Add", "Promoted Chat Message");
            b = new b("SUGGESTED", 1, "suggested", "Suggested Chat Add", "Suggested Chat Message");
            c = new b("PREMIUM", 2, "premium", "Premium Promoted Chat Add", "Premium Promoted Chat Message");
            g = (new b[] {
                a, b, c
            });
        }

        private b(String s, int i1, String s1, String s2, String s3)
        {
            super(s, i1);
            d = s1;
            e = s2;
            f = s3;
        }
    }

    private static final class c extends n
    {

        com.android.volley.r.b a;
        com.android.volley.r.a b;

        protected final com.android.volley.r a(com.android.volley.k k1)
        {
            if (k1.a != 200)
            {
                return com.android.volley.r.a(new com.android.volley.w(k1));
            }
            try
            {
                k1 = com.android.volley.r.a(new JSONArray(new String(k1.b, com.android.volley.toolbox.f.a(k1.c))), com.android.volley.toolbox.f.a(k1));
            }
            // Misplaced declaration of an exception variable
            catch (com.android.volley.k k1)
            {
                return com.android.volley.r.a(new com.android.volley.w(k1));
            }
            // Misplaced declaration of an exception variable
            catch (com.android.volley.k k1)
            {
                return com.android.volley.r.a(new com.android.volley.w(k1));
            }
            return k1;
        }

        public final void b(com.android.volley.w w1)
        {
            b.a(w1);
        }

        protected final void b(Object obj)
        {
            obj = (JSONArray)obj;
            a.a(obj);
        }

        public final Map i()
        {
            HashMap hashmap = new HashMap();
            hashmap.put("User-Agent", kik.android.util.DeviceUtils.a(""));
            return hashmap;
        }

        public c(String s, com.android.volley.r.b b1, com.android.volley.r.a a1)
        {
            super(s, b1, a1);
            a = b1;
            b = a1;
        }
    }


    private static final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();
    private static final org.c.b o = org.c.c.a("SponsoredUserManager");
    private EnumMap b;
    private final v c;
    private final ab d;
    private r e;
    private final w f;
    private final l g;
    private final kik.android.d.c h;
    private com.kik.android.a i;
    private final boolean j;
    private final int k;
    private final ar l;
    private f m;
    private k n;
    private i p;

    public ck(v v, ab ab, w w1, l l1, kik.android.d.c c1, boolean flag, int i1, 
            ar ar)
    {
        m = new f();
        n = new k(this);
        p = new cl(this);
        c = v;
        d = ab;
        f = w1;
        g = l1;
        h = c1;
        j = flag;
        k = i1;
        l = ar;
        b = new EnumMap(kik/android/util/ck$b);
        v = b.values();
        int j1 = v.length;
        for (i1 = 0; i1 < j1; i1++)
        {
            ab = v[i1];
            b.put(ab, new a((byte)0));
        }

    }

    static EnumMap a(ck ck1)
    {
        return ck1.b;
    }

    static void a(ck ck1, JSONArray jsonarray, b b1)
    {
        a a1;
        a1 = (a)ck1.b.get(b1);
        a1.a.clear();
        a1.b.clear();
        a1.c.clear();
        a1.d = kik.android.util.a.a.a;
        if (!a(jsonarray)) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L18:
        if (i1 >= jsonarray.length()) goto _L4; else goto _L3
_L3:
        Object obj = jsonarray.getJSONObject(i1);
        if (obj == null) goto _L6; else goto _L5
_L5:
        String s;
        j j1;
        String s1;
        s = ((JSONObject) (obj)).getString("username");
        j1 = kik.a.d.j.a(((JSONObject) (obj)).getString("jid"));
        s1 = ((JSONObject) (obj)).getString("byline");
        if (!((JSONObject) (obj)).isNull("display_pic")) goto _L8; else goto _L7
_L7:
        b1 = null;
_L14:
        if (!((JSONObject) (obj)).isNull("display_pic_last_modified")) goto _L10; else goto _L9
_L9:
        long l1 = 0L;
_L15:
        Object obj1;
        Object obj2;
        String s2;
        boolean flag;
        s2 = ((JSONObject) (obj)).getString("first_name");
        obj1 = ((JSONObject) (obj)).getString("last_name");
        flag = ((JSONObject) (obj)).getBoolean("verified");
        obj2 = new StringBuilder();
        if (!kik.android.util.cq.c(s2)) goto _L12; else goto _L11
_L11:
        obj = "";
_L16:
        obj2 = ((StringBuilder) (obj2)).append(((String) (obj)));
        obj = obj1;
        if (kik.android.util.cq.c(((String) (obj1))))
        {
            obj = "";
        }
        obj2 = ((StringBuilder) (obj2)).append(((String) (obj))).toString();
        if (j1 == null) goto _L6; else goto _L13
_L13:
        boolean flag1;
        flag1 = ck1.e.c(j1.a());
        obj1 = ck1.e.a(j1.a(), false);
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        obj = new kik.a.d.k(j1, ((String) (obj2)), s, flag1, String.valueOf(l1), b1);
        ((kik.a.d.k) (obj)).b(flag);
        a1.a.add(obj);
        a1.b.add(s);
        a1.c.put(j1.a(), s1);
        ck1.e.a(((kik.a.d.k) (obj)));
          goto _L6
_L8:
        b1 = ((JSONObject) (obj)).getString("display_pic");
          goto _L14
_L10:
        l1 = ((JSONObject) (obj)).getLong("display_pic_last_modified");
          goto _L15
_L12:
        obj = (new StringBuilder()).append(s2).append(" ").toString();
          goto _L16
_L4:
        try
        {
            a1.d = kik.android.util.a.a.c;
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            jsonarray.printStackTrace();
        }
        ck1.n.a(null);
_L2:
        return;
_L6:
        i1++;
        if (true) goto _L18; else goto _L17
_L17:
    }

    private static boolean a(Object obj)
    {
        if (!(obj instanceof JSONArray)) goto _L2; else goto _L1
_L1:
        obj = (JSONArray)obj;
        int i1 = 0;
_L12:
        if (i1 >= ((JSONArray) (obj)).length()) goto _L4; else goto _L3
_L3:
        Object obj1 = ((JSONArray) (obj)).get(i1);
        if (!(obj1 instanceof JSONObject)) goto _L6; else goto _L5
_L5:
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        obj1 = (JSONObject)obj1;
        flag1 = ((JSONObject) (obj1)).isNull("username");
        flag2 = ((JSONObject) (obj1)).isNull("jid");
        flag3 = ((JSONObject) (obj1)).isNull("byline");
        flag4 = ((JSONObject) (obj1)).isNull("verified");
        flag5 = ((JSONObject) (obj1)).isNull("first_name");
        flag6 = ((JSONObject) (obj1)).isNull("last_name");
        flag7 = ((JSONObject) (obj1)).has("display_pic");
        flag8 = ((JSONObject) (obj1)).has("display_pic_last_modified");
        if (flag1 || flag2) goto _L8; else goto _L7
_L7:
        boolean flag;
        if (kik.a.d.j.a(((JSONObject) (obj1)).getString("jid")) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L9
_L15:
        if (!((JSONObject) (obj1)).getString("username").matches("^[\\w\\.]{2,30}$"))
        {
            return false;
        }
        if (!((JSONObject) (obj1)).getString("jid").matches("^[\\w\\.]+@talk\\.kik\\.com$"))
        {
            return false;
        }
        if (!((JSONObject) (obj1)).getString("byline").matches("^.{0,40}"))
        {
            return false;
        }
        if (!((JSONObject) (obj1)).getString("first_name").matches("^.{1,255}$"))
        {
            return false;
        }
        if (!((JSONObject) (obj1)).getString("last_name").matches("^.{0,255}$"))
        {
            return false;
        }
        if (((JSONObject) (obj1)).isNull("display_pic_last_modified")) goto _L11; else goto _L10
_L10:
        flag1 = String.valueOf(((JSONObject) (obj1)).getLong("display_pic_last_modified")).matches("^[0-9]+$");
        if (!flag1)
        {
            return false;
        }
          goto _L11
_L6:
        return false;
_L11:
        i1++;
          goto _L12
_L4:
        return true;
        obj;
        ((JSONException) (obj)).printStackTrace();
        return false;
_L2:
        return false;
_L9:
        if (!flag || flag3 || flag4 || flag5 || flag6 || !flag7 || !flag8) goto _L8; else goto _L13
_L13:
        flag = true;
_L16:
        if (flag) goto _L15; else goto _L14
_L14:
        return false;
_L8:
        flag = false;
          goto _L16
    }

    static k b(ck ck1)
    {
        return ck1.n;
    }

    static v c(ck ck1)
    {
        return ck1.c;
    }

    public final e a()
    {
        return n.a();
    }

    public final void a(r r1, com.kik.android.a a1)
    {
        e = r1;
        i = a1;
        m.a(e.c(), p);
        m.a(g.e(), p);
    }

    public final void a(b b1)
    {
        Object obj;
        if (!h.a(l).equals("piranha"))
        {
            if (((a) (obj = (a)b.get(b1))).d != kik.android.util.a.a.b)
            {
                obj.d = kik.android.util.a.a.b;
                String s1 = f.d().c;
                if (k < 9)
                {
                    obj = "https://bot-dashboard.appspot.com/api";
                } else
                if (j)
                {
                    obj = "https://engine.kik.com/api";
                } else
                {
                    obj = "https://engine.apikik.com/api";
                }
                if (b1 == kik.android.util.b.c)
                {
                    String s;
                    if (i.c())
                    {
                        s = "1";
                    } else
                    {
                        s = "0";
                    }
                    obj = String.format("%s/v2/discovery/%s?username=%s&sample=%s", new Object[] {
                        obj, b1.d, s1, s
                    });
                } else
                {
                    obj = String.format("%s/v2/discovery/%s?username=%s", new Object[] {
                        obj, b1.d, s1
                    });
                }
                b1 = new c(((String) (obj)), new cm(this, b1), new cn(this, b1));
                a.execute(new co(this, b1));
                return;
            }
        }
    }

    public final boolean a(kik.a.d.k k1)
    {
        boolean flag1 = false;
        b ab[] = b.values();
        int j1 = ab.length;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < j1)
                {
                    if (!a(k1, ab[i1]))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    public final boolean a(kik.a.d.k k1, b b1)
    {
        return ((a)b.get(b1)).a.contains(k1);
    }

    public final int b()
    {
        b ab[] = b.values();
        int k1 = ab.length;
        int i1 = 0;
        int j1 = 0;
        for (; i1 < k1; i1++)
        {
            b b1 = ab[i1];
            j1 += ((a)b.get(b1)).a.size();
        }

        return j1;
    }

    public final boolean b(b b1)
    {
        b1 = (a)b.get(b1);
        return ((a) (b1)).d == kik.android.util.a.a.c || !((a) (b1)).a.isEmpty();
    }

    public final ArrayList c(b b1)
    {
        return new ArrayList(((a)b.get(b1)).a);
    }

    public final void c()
    {
        m.a();
        a.shutdown();
    }

    public final Map d(b b1)
    {
        return new HashMap(((a)b.get(b1)).c);
    }

}
