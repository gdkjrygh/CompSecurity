// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            bj, dj, j, du, 
//            bs, ak

public final class bu
    implements bj
{

    private final j a;
    private final JSONObject b;
    private final double c;

    public bu(j j1, JSONObject jsonobject)
    {
        this(j1, jsonobject, dj.b());
    }

    private bu(j j1, JSONObject jsonobject, double d1)
    {
        du.a(j1.r);
        du.a(jsonobject);
        a = j1;
        b = jsonobject;
        c = d1;
    }

    public static bu a(ak ak, bs bs1)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("nop", true);
        bs1 = b(ak, bs1);
        ak = a(((Throwable) (ak)));
        jsonobject.put("e", (new StringBuilder(bs1)).append("\n").append(ak).toString());
        return new bu(j.g, jsonobject);
    }

    private static bu a(String s)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("n", s);
        return new bu(j.f, jsonobject);
    }

    public static bu a(String s, String s1, double d1)
    {
        j j1 = j.a(s);
        if (j1 == null)
        {
            throw new IllegalArgumentException(String.format("Cannot parse eventType %s", new Object[] {
                s
            }));
        } else
        {
            return new bu(j1, new JSONObject(s1), d1);
        }
    }

    public static bu a(Throwable throwable, bs bs1)
    {
        bs1 = b(throwable, bs1);
        throwable = a(throwable);
        throwable = (new StringBuilder(bs1)).append("\n").append(throwable);
        bs1 = new JSONObject();
        bs1.put("e", throwable.toString());
        return new bu(j.g, bs1);
    }

    private static String a(Throwable throwable)
    {
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        return stringwriter.toString();
    }

    private static String b(Throwable throwable, bs bs1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("exception_class: ").append(throwable.toString()).append(",");
        StringBuilder stringbuilder1 = stringbuilder.append("session_id: ");
        if (bs1 != null)
        {
            throwable = bs1.toString();
        } else
        {
            throwable = null;
        }
        stringbuilder1.append(throwable);
        return stringbuilder.toString();
    }

    public static bu e()
    {
        return a("feed_displayed");
    }

    public static bu f()
    {
        return a("feedback_displayed");
    }

    private JSONObject g()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("n", a.r);
            jsonobject.put("d", b);
            jsonobject.put("t", c);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }

    public final Object a()
    {
        return g();
    }

    public final double b()
    {
        return c;
    }

    public final j c()
    {
        return a;
    }

    public final JSONObject d()
    {
        return b;
    }
}
