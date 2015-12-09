// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.k;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.ag;
import com.facebook.h;
import com.facebook.internal.aw;
import com.facebook.internal.b;
import com.facebook.internal.bl;
import com.facebook.internal.m;
import com.facebook.internal.y;
import com.facebook.l;
import com.facebook.n;
import com.facebook.q;
import com.facebook.share.a.g;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            aa, b, h, s, 
//            o, q, c, f, 
//            l, r, d, g, 
//            e, t, y, m

public class a
{

    private static final String a = com/facebook/share/internal/a.getSimpleName();
    private static y b;
    private static final ConcurrentHashMap c = new ConcurrentHashMap();
    private static bl d = new bl(1);
    private static bl e = new bl(1);
    private static Handler f;
    private static boolean g;
    private static volatile int h;
    private static h i;
    private String j;
    private g k;
    private boolean l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private boolean s;
    private Bundle t;
    private com.facebook.a.a u;

    private a(String s1, g g1)
    {
        j = s1;
        k = g1;
    }

    static int a(int i1)
    {
        h = i1;
        return i1;
    }

    static String a(a a1, String s1)
    {
        a1.r = s1;
        return s1;
    }

    static void a(a a1)
    {
        if (AccessToken.a() == null)
        {
            aa aa1 = new aa(com.facebook.q.f(), com.facebook.q.h(), a1.j);
            if (aa1.a())
            {
                aa1.a(new com.facebook.share.internal.b(a1));
            }
            return;
        }
        com.facebook.share.internal.h h1 = new com.facebook.share.internal.h(a1);
        if (!aw.a(a1.r))
        {
            h1.a();
            return;
        } else
        {
            o o1 = new o(a1, a1.j, a1.k);
            com.facebook.share.internal.q q1 = new com.facebook.share.internal.q(a1, a1.j, a1.k);
            ag ag1 = new ag();
            o1.a(ag1);
            q1.a(ag1);
            ag1.a(new c(a1, o1, q1, h1));
            GraphRequest.b(ag1);
            return;
        }
    }

    private static void a(a a1, g g1, com.facebook.share.internal.m m1)
    {
        Object obj = null;
        g g3 = a1.k;
        g g2;
        if (g1 == g3)
        {
            g2 = g1;
        } else
        {
            g2 = g3;
            if (g1 != g.a)
            {
                if (g3 == g.a)
                {
                    g2 = g1;
                } else
                {
                    g2 = null;
                }
            }
        }
        if (g2 == null)
        {
            a1 = new l("Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\"", new Object[] {
                a1.j, a1.k.toString(), g1.toString()
            });
            g1 = obj;
        } else
        {
            a1.k = g2;
            g2 = null;
            g1 = a1;
            a1 = g2;
        }
        a(m1, ((a) (g1)), ((l) (a1)));
    }

    private static void a(a a1, String s1, Bundle bundle)
    {
        s1 = new Intent(s1);
        if (a1 != null)
        {
            bundle = new Bundle();
            bundle.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", a1.j);
        }
        if (bundle != null)
        {
            s1.putExtras(bundle);
        }
        android.support.v4.content.k.a(com.facebook.q.f()).a(s1);
    }

    static void a(a a1, String s1, n n1)
    {
        Bundle bundle = new Bundle();
        if (n1 != null)
        {
            n1 = n1.e();
            if (n1 != null)
            {
                bundle.putString("error", n1.toString());
            }
        }
        n1 = new Bundle(bundle);
        n1.putString("object_id", a1.j);
        n1.putString("object_type", a1.k.toString());
        n1.putString("current_action", s1);
        if (a1.u == null)
        {
            a1.u = com.facebook.a.a.c(com.facebook.q.f());
        }
        a1.u.b("fb_like_control_error", n1);
    }

    static void a(a a1, boolean flag, String s1, String s2, String s3, String s4, String s5)
    {
        s1 = aw.a(s1, null);
        s2 = aw.a(s2, null);
        s3 = aw.a(s3, null);
        s4 = aw.a(s4, null);
        s5 = aw.a(s5, null);
        boolean flag1;
        if (flag != a1.l || !aw.a(s1, a1.m) || !aw.a(s2, a1.n) || !aw.a(s3, a1.o) || !aw.a(s4, a1.p) || !aw.a(s5, a1.q))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            a1.l = flag;
            a1.m = s1;
            a1.n = s2;
            a1.o = s3;
            a1.p = s4;
            a1.q = s5;
            k(a1);
            a(a1, "com.facebook.sdk.LikeActionController.UPDATED", ((Bundle) (null)));
        }
    }

    private static void a(com.facebook.share.internal.m m1, a a1, l l1)
    {
        if (m1 == null)
        {
            return;
        } else
        {
            f.post(new f(m1, a1, l1));
            return;
        }
    }

    static void a(String s1)
    {
        a(((a) (null)), s1, ((Bundle) (null)));
    }

    public static void a(String s1, g g1, com.facebook.share.internal.m m1)
    {
        if (!g)
        {
            i();
        }
        a a1 = b(s1);
        if (a1 != null)
        {
            a(a1, g1, m1);
            return;
        } else
        {
            e.a(new com.facebook.share.internal.l(s1, g1, m1));
            return;
        }
    }

    static void a(String s1, String s2)
    {
        String s3;
        String s4;
        s4 = null;
        s3 = null;
        s1 = b.b(s1);
        s3 = s1;
        s4 = s1;
        s1.write(s2.getBytes());
        aw.a(s1);
_L2:
        return;
        s1;
        s4 = s3;
        Log.e(a, "Unable to serialize controller to disk", s1);
        if (s3 == null) goto _L2; else goto _L1
_L1:
        aw.a(s3);
        return;
        s1;
        if (s4 != null)
        {
            aw.a(s4);
        }
        throw s1;
    }

    static boolean a(a a1, boolean flag)
    {
        a1.s = flag;
        return flag;
    }

    private static a b(String s1)
    {
        s1 = e(s1);
        a a1 = (a)c.get(s1);
        if (a1 != null)
        {
            d.a(new r(s1, false));
        }
        return a1;
    }

    static String b(a a1)
    {
        return a1.m;
    }

    static void b(String s1, g g1, com.facebook.share.internal.m m1)
    {
        a a1 = b(s1);
        if (a1 != null)
        {
            a(a1, g1, m1);
            return;
        }
        a a2 = c(s1);
        a1 = a2;
        if (a2 == null)
        {
            a1 = new a(s1, g1);
            k(a1);
        }
        s1 = e(s1);
        d.a(new r(s1, true));
        c.put(s1, a1);
        f.post(new d(a1));
        a(m1, a1, ((l) (null)));
    }

    private static a c(String s1)
    {
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        s1 = e(s1);
        s1 = b.a(s1);
        Object obj;
        a a1;
        a1 = obj2;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = s1;
        String s2 = aw.a(s1);
        a1 = obj2;
        obj = s1;
        if (aw.a(s2))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = s1;
        a1 = d(s2);
        obj = a1;
        if (s1 != null)
        {
            aw.a(s1);
            obj = a1;
        }
_L2:
        return ((a) (obj));
        IOException ioexception;
        ioexception;
        s1 = null;
_L5:
        obj = s1;
        Log.e(a, "Unable to deserialize controller from disk", ioexception);
        obj = obj1;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        aw.a(s1);
        return null;
        s1;
        obj = null;
_L4:
        if (obj != null)
        {
            aw.a(((java.io.Closeable) (obj)));
        }
        throw s1;
        s1;
        if (true) goto _L4; else goto _L3
_L3:
        ioexception;
          goto _L5
    }

    static String c(a a1)
    {
        return a1.n;
    }

    private static a d(String s1)
    {
        s1 = new JSONObject(s1);
        if (s1.optInt("com.facebook.share.internal.LikeActionController.version", -1) != 3)
        {
            return null;
        }
        a a1;
        JSONObject jsonobject;
        a1 = new a(s1.getString("object_id"), com.facebook.share.a.g.a(s1.optInt("object_type", g.a.a())));
        a1.m = s1.optString("like_count_string_with_like", null);
        a1.n = s1.optString("like_count_string_without_like", null);
        a1.o = s1.optString("social_sentence_with_like", null);
        a1.p = s1.optString("social_sentence_without_like", null);
        a1.l = s1.optBoolean("is_object_liked");
        a1.q = s1.optString("unlike_token", null);
        jsonobject = s1.optJSONObject("facebook_dialog_analytics_bundle");
        s1 = a1;
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        a1.t = com.facebook.internal.b.a(jsonobject);
        s1 = a1;
_L2:
        return s1;
        s1;
        Log.e(a, "Unable to deserialize controller from JSON", s1);
        s1 = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static String d(a a1)
    {
        return a1.o;
    }

    static String e()
    {
        return a;
    }

    static String e(a a1)
    {
        return a1.p;
    }

    private static String e(String s1)
    {
        String s2 = null;
        Object obj = AccessToken.a();
        if (obj != null)
        {
            s2 = ((AccessToken) (obj)).b();
        }
        obj = s2;
        if (s2 != null)
        {
            obj = aw.b(s2);
        }
        return String.format(Locale.ROOT, "%s|%s|com.fb.sdk.like|%d", new Object[] {
            s1, aw.a(((String) (obj)), ""), Integer.valueOf(h)
        });
    }

    static int f()
    {
        return h;
    }

    static String f(a a1)
    {
        return a1.q;
    }

    static String g(a a1)
    {
        return a1.r;
    }

    static ConcurrentHashMap g()
    {
        return c;
    }

    static y h()
    {
        return b;
    }

    static g h(a a1)
    {
        return a1.k;
    }

    static String i(a a1)
    {
        return a1.j;
    }

    private static void i()
    {
        com/facebook/share/internal/a;
        JVM INSTR monitorenter ;
        boolean flag = g;
        if (!flag) goto _L2; else goto _L1
_L1:
        com/facebook/share/internal/a;
        JVM INSTR monitorexit ;
        return;
_L2:
        f = new Handler(Looper.getMainLooper());
        h = com.facebook.q.f().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
        b = new y(a, new com.facebook.internal.ag());
        i = new com.facebook.share.internal.g();
        com.facebook.internal.k.a(m.d.a(), new e());
        g = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static boolean j(a a1)
    {
        return a1.l;
    }

    private static void k(a a1)
    {
        String s1 = l(a1);
        a1 = e(a1.j);
        if (!aw.a(s1) && !aw.a(a1))
        {
            e.a(new t(a1, s1));
        }
    }

    private static String l(a a1)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("com.facebook.share.internal.LikeActionController.version", 3);
            jsonobject.put("object_id", a1.j);
            jsonobject.put("object_type", a1.k.a());
            jsonobject.put("like_count_string_with_like", a1.m);
            jsonobject.put("like_count_string_without_like", a1.n);
            jsonobject.put("social_sentence_with_like", a1.o);
            jsonobject.put("social_sentence_without_like", a1.p);
            jsonobject.put("is_object_liked", a1.l);
            jsonobject.put("unlike_token", a1.q);
            if (a1.t != null)
            {
                jsonobject.put("facebook_dialog_analytics_bundle", com.facebook.internal.b.a(a1.t));
            }
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            Log.e(a, "Unable to serialize controller to JSON", a1);
            return null;
        }
        return jsonobject.toString();
    }

    public final String a()
    {
        if (l)
        {
            return m;
        } else
        {
            return n;
        }
    }

    public final String b()
    {
        if (l)
        {
            return o;
        } else
        {
            return p;
        }
    }

    public final boolean c()
    {
        return l;
    }

    public final boolean d()
    {
        boolean flag;
        Object obj = k;
        if (y.a() || com.facebook.share.internal.y.b())
        {
            flag = true;
        } else
        {
label0:
            {
                if (obj == g.c)
                {
                    break label0;
                }
                obj = AccessToken.a();
                if (obj == null || ((AccessToken) (obj)).c() == null || !((AccessToken) (obj)).c().contains("publish_actions"))
                {
                    break label0;
                }
                flag = true;
            }
        }
_L1:
        return !flag;
        flag = false;
          goto _L1
    }

}
