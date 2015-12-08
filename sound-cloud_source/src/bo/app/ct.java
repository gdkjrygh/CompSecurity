// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.d;
import com.appboy.d.b.a;
import com.appboy.d.l;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            ci, el, ae, fa, 
//            cz, eq, ej, cr, 
//            bi

public final class ct
    implements ci
{

    private static final String a;
    private final ae b;
    private final JSONObject c;
    private final double d;

    private ct(ae ae1, JSONObject jsonobject)
    {
        this(ae1, jsonobject, el.b());
    }

    private ct(ae ae1, JSONObject jsonobject, double d1)
    {
        bo.app.fa.a(ae1.r);
        bo.app.fa.a(jsonobject);
        b = ae1;
        c = jsonobject;
        d = d1;
    }

    public static ct a(bi bi, cr cr1)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("nop", true);
        cr1 = b(bi, cr1);
        bi = a(((Throwable) (bi)));
        jsonobject.put("e", (new StringBuilder(cr1)).append("\n").append(bi).toString());
        return new ct(ae.g, jsonobject);
    }

    public static ct a(cz cz1)
    {
        return new ct(bo.app.ae.a, cz1.a());
    }

    public static ct a(String s)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("new", s);
        return new ct(ae.j, jsonobject);
    }

    public static ct a(String s, int i)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("key", s);
        jsonobject.put("value", i);
        return new ct(ae.k, jsonobject);
    }

    public static ct a(String s, a a1)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("n", bo.app.eq.a(s));
        if (a1 != null && a1.a.length() > 0)
        {
            jsonobject.put("p", a1.a);
        }
        return new ct(ae.b, jsonobject);
    }

    public static ct a(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("old", s);
        jsonobject.put("new", s1);
        return new ct(ae.j, jsonobject);
    }

    public static ct a(String s, String s1, double d1)
    {
        ae ae1 = bo.app.ae.a(s);
        if (ae1 == null)
        {
            throw new IllegalArgumentException(String.format("Cannot parse eventType %s", new Object[] {
                s
            }));
        } else
        {
            return new ct(ae1, new JSONObject(s1), d1);
        }
    }

    public static ct a(String s, String s1, l l1)
    {
        ae ae1 = ae.q;
        if (l1 != null)
        {
            l1 = String.valueOf(l1.a);
        } else
        {
            l1 = null;
        }
        return new ct(ae1, b(s, s1, l1));
    }

    public static ct a(String s, String s1, String s2)
    {
        return new ct(ae.q, b(s, s1, s2));
    }

    public static ct a(String s, String s1, BigDecimal bigdecimal, int i, a a1)
    {
        bigdecimal = bo.app.ej.a(bigdecimal);
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("pid", s);
        jsonobject.put("c", s1);
        jsonobject.put("p", bigdecimal.doubleValue());
        jsonobject.put("q", i);
        if (a1 != null && a1.a.length() > 0)
        {
            jsonobject.put("pr", a1.a);
        }
        return new ct(ae.c, jsonobject);
    }

    public static ct a(String s, String as[])
    {
        JSONArray jsonarray;
        if (as == null)
        {
            jsonarray = null;
        } else
        {
            jsonarray = new JSONArray();
        }
        if (as != null)
        {
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                jsonarray.put(as[i]);
            }

        }
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("key", s);
        if (as == null)
        {
            jsonobject.put("value", JSONObject.NULL);
        } else
        {
            jsonobject.put("value", jsonarray);
        }
        return new ct(ae.n, jsonobject);
    }

    public static ct a(Throwable throwable, cr cr1)
    {
        cr1 = b(throwable, cr1);
        throwable = a(throwable);
        throwable = (new StringBuilder(cr1)).append("\n").append(throwable);
        cr1 = new JSONObject();
        cr1.put("e", throwable.toString());
        return new ct(ae.g, cr1);
    }

    public static ct a(JSONObject jsonobject)
    {
        String s = jsonobject.getString("n");
        ae ae1 = bo.app.ae.a(jsonobject.getString("n"));
        if (ae1 == null)
        {
            throw new IllegalArgumentException(String.format("Cannot parse eventType %s", new Object[] {
                s
            }));
        } else
        {
            return new ct(ae1, jsonobject.getJSONObject("d"), jsonobject.getDouble("t"));
        }
    }

    private static String a(Throwable throwable)
    {
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        return stringwriter.toString();
    }

    public static boolean a(ci ci1)
    {
        return ci1.b() == ae.g && ci1.c().optBoolean("nop", false);
    }

    public static ct b(String s)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("cid", s);
        return new ct(bo.app.ae.d, jsonobject);
    }

    public static ct b(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("cid", s);
        jsonobject.put("a", s1);
        return new ct(ae.e, jsonobject);
    }

    private static String b(Throwable throwable, cr cr1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("exception_class: ").append(throwable.toString()).append(",");
        StringBuilder stringbuilder1 = stringbuilder.append("session_id: ");
        if (cr1 != null)
        {
            throwable = cr1.toString();
        } else
        {
            throwable = null;
        }
        stringbuilder1.append(throwable);
        return stringbuilder.toString();
    }

    private static JSONObject b(String s, String s1, String s2)
    {
        JSONObject jsonobject = new JSONObject();
        if (!eq.b(s))
        {
            JSONArray jsonarray = new JSONArray();
            jsonarray.put(s);
            jsonobject.put("campaign_ids", jsonarray);
        }
        if (!eq.b(s1))
        {
            s = new JSONArray();
            s.put(s1);
            jsonobject.put("card_ids", s);
        }
        if (!eq.b(s2))
        {
            jsonobject.put("bid", s2);
        }
        return jsonobject;
    }

    public static ct c(String s)
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        jsonarray.put(s);
        jsonobject.put("ids", jsonarray);
        return new ct(ae.h, jsonobject);
    }

    public static ct c(String s, String s1)
    {
        return new ct(ae.o, b(s, s1, null));
    }

    public static ct d(String s)
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        jsonarray.put(s);
        jsonobject.put("ids", jsonarray);
        return new ct(ae.i, jsonobject);
    }

    public static ct d(String s, String s1)
    {
        return new ct(ae.p, b(s, s1, null));
    }

    public static ct e()
    {
        return e("feed_displayed");
    }

    private static ct e(String s)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("n", s);
        return new ct(ae.f, jsonobject);
    }

    public static ct e(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("key", s);
        jsonobject.put("value", s1);
        return new ct(bo.app.ae.l, jsonobject);
    }

    public static ct f()
    {
        return e("feedback_displayed");
    }

    public static ct f(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("key", s);
        jsonobject.put("value", s1);
        return new ct(ae.m, jsonobject);
    }

    private JSONObject g()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("n", b.r);
            jsonobject.put("d", c);
            jsonobject.put("t", d);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public final double a()
    {
        return d;
    }

    public final ae b()
    {
        return b;
    }

    public final JSONObject c()
    {
        return c;
    }

    public final String d()
    {
        return g().toString();
    }

    public final Object forJsonPut()
    {
        return g();
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, bo/app/ct.getName()
        });
    }
}
