// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.enums.SocialNetwork;
import com.appboy.models.MessageButton;
import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.support.AppboyLogger;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            co, er, aj, ff, 
//            df, ev, ep, cx, 
//            bo

public final class cz
    implements co
{

    private static final String a;
    private final aj b;
    private final JSONObject c;
    private final double d;

    private cz(aj aj1, JSONObject jsonobject)
    {
        this(aj1, jsonobject, er.b());
    }

    private cz(aj aj1, JSONObject jsonobject, double d1)
    {
        ff.a(aj1.s);
        ff.a(jsonobject);
        b = aj1;
        c = jsonobject;
        d = d1;
    }

    public static cz a(bo bo, cx cx1)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("nop", true);
        cx1 = b(bo, cx1);
        bo = a(((Throwable) (bo)));
        jsonobject.put("e", (new StringBuilder(cx1)).append("\n").append(bo).toString());
        return new cz(aj.h, jsonobject);
    }

    public static cz a(df df1)
    {
        return new cz(aj.a, df1.a());
    }

    public static cz a(SocialNetwork socialnetwork)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("n", socialnetwork.forJsonPut());
        return new cz(aj.f, jsonobject);
    }

    public static cz a(String s)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("new", s);
        return new cz(aj.k, jsonobject);
    }

    public static cz a(String s, int i)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("key", s);
        jsonobject.put("value", i);
        return new cz(aj.l, jsonobject);
    }

    public static cz a(String s, AppboyProperties appboyproperties)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("n", ev.a(s));
        if (appboyproperties != null && appboyproperties.size() > 0)
        {
            jsonobject.put("p", appboyproperties.forJsonPut());
        }
        return new cz(aj.b, jsonobject);
    }

    public static cz a(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("old", s);
        jsonobject.put("new", s1);
        return new cz(aj.k, jsonobject);
    }

    public static cz a(String s, String s1, double d1)
    {
        aj aj1 = aj.a(s);
        if (aj1 == null)
        {
            throw new IllegalArgumentException(String.format("Cannot parse eventType %s", new Object[] {
                s
            }));
        } else
        {
            return new cz(aj1, new JSONObject(s1), d1);
        }
    }

    public static cz a(String s, String s1, MessageButton messagebutton)
    {
        if (messagebutton == null)
        {
            return b(s, s1, null);
        } else
        {
            return b(s, s1, String.valueOf(messagebutton.getId()));
        }
    }

    public static cz a(String s, String s1, String s2)
    {
        return b(s, s1, s2);
    }

    public static cz a(String s, String s1, BigDecimal bigdecimal, int i, AppboyProperties appboyproperties)
    {
        bigdecimal = ep.a(bigdecimal);
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("pid", s);
        jsonobject.put("c", s1);
        jsonobject.put("p", bigdecimal.doubleValue());
        jsonobject.put("q", i);
        if (appboyproperties != null && appboyproperties.size() > 0)
        {
            jsonobject.put("pr", appboyproperties.forJsonPut());
        }
        return new cz(aj.c, jsonobject);
    }

    public static cz a(String s, String as[])
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
        return new cz(aj.o, jsonobject);
    }

    public static cz a(Throwable throwable, cx cx1)
    {
        cx1 = b(throwable, cx1);
        throwable = a(throwable);
        throwable = (new StringBuilder(cx1)).append("\n").append(throwable);
        cx1 = new JSONObject();
        cx1.put("e", throwable.toString());
        return new cz(aj.h, cx1);
    }

    public static cz a(JSONObject jsonobject)
    {
        String s = jsonobject.getString("n");
        aj aj1 = aj.a(jsonobject.getString("n"));
        if (aj1 == null)
        {
            throw new IllegalArgumentException(String.format("Cannot parse eventType %s", new Object[] {
                s
            }));
        } else
        {
            return new cz(aj1, jsonobject.getJSONObject("d"), jsonobject.getDouble("t"));
        }
    }

    private static String a(Throwable throwable)
    {
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        return stringwriter.toString();
    }

    public static boolean a(co co1)
    {
        return co1.b() == aj.h && co1.c().optBoolean("nop", false);
    }

    public static cz b(String s)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("cid", s);
        return new cz(aj.d, jsonobject);
    }

    public static cz b(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("cid", s);
        jsonobject.put("a", s1);
        return new cz(aj.e, jsonobject);
    }

    private static cz b(String s, String s1, String s2)
    {
        JSONObject jsonobject = new JSONObject();
        if (!ev.b(s))
        {
            JSONArray jsonarray = new JSONArray();
            jsonarray.put(s);
            jsonobject.put("campaign_ids", jsonarray);
        }
        if (!ev.b(s1))
        {
            s = new JSONArray();
            s.put(s1);
            jsonobject.put("card_ids", s);
        }
        if (s2 != null)
        {
            jsonobject.put("bid", s2);
        }
        return new cz(aj.r, jsonobject);
    }

    private static String b(Throwable throwable, cx cx1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("exception_class: ").append(throwable.toString()).append(",");
        StringBuilder stringbuilder1 = stringbuilder.append("session_id: ");
        if (cx1 != null)
        {
            throwable = cx1.toString();
        } else
        {
            throwable = null;
        }
        stringbuilder1.append(throwable);
        return stringbuilder.toString();
    }

    public static cz c(String s)
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        jsonarray.put(s);
        jsonobject.put("ids", jsonarray);
        return new cz(aj.i, jsonobject);
    }

    public static cz c(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        if (!ev.b(s))
        {
            JSONArray jsonarray = new JSONArray();
            jsonarray.put(s);
            jsonobject.put("campaign_ids", jsonarray);
        }
        if (!ev.b(s1))
        {
            s = new JSONArray();
            s.put(s1);
            jsonobject.put("card_ids", s);
        }
        return new cz(aj.p, jsonobject);
    }

    public static cz d(String s)
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        jsonarray.put(s);
        jsonobject.put("ids", jsonarray);
        return new cz(aj.j, jsonobject);
    }

    public static cz d(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        if (!ev.b(s))
        {
            JSONArray jsonarray = new JSONArray();
            jsonarray.put(s);
            jsonobject.put("campaign_ids", jsonarray);
        }
        if (!ev.b(s1))
        {
            s = new JSONArray();
            s.put(s1);
            jsonobject.put("card_ids", s);
        }
        return new cz(aj.q, jsonobject);
    }

    public static cz e()
    {
        return e("feed_displayed");
    }

    private static cz e(String s)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("n", s);
        return new cz(aj.g, jsonobject);
    }

    public static cz e(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("key", s);
        jsonobject.put("value", s1);
        return new cz(aj.m, jsonobject);
    }

    public static cz f()
    {
        return e("feedback_displayed");
    }

    public static cz f(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("key", s);
        jsonobject.put("value", s1);
        return new cz(aj.n, jsonobject);
    }

    private JSONObject g()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("n", b.s);
            jsonobject.put("d", c);
            jsonobject.put("t", d);
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.e(a, "Caught exception creating Appboy event Json.", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    public final double a()
    {
        return d;
    }

    public final aj b()
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
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/cz.getName()
        });
    }
}
