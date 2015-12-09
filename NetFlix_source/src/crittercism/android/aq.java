// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            t, h

public final class aq
    implements t
{
    public static final class a
    {

        public static aq a(h h1, String s, String s1)
        {
            Object obj = null;
            h1 = h1.a(s, s1, null);
            if (h1 != null)
            {
                try
                {
                    h1 = new JSONObject(h1);
                }
                // Misplaced declaration of an exception variable
                catch (h h1)
                {
                    h1 = obj;
                }
            } else
            {
                h1 = null;
            }
            if (h1 == null)
            {
                return new aq((byte)0);
            } else
            {
                return new aq(h1, (byte)0);
            }
        }
    }


    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public String f;
    public String g;

    private aq()
    {
        a = false;
        b = false;
        c = 0;
        d = 5;
        e = 5;
        f = "Would you mind taking a second to rate my app?  I would really appreciate it!";
        g = "Rate My App";
    }

    aq(byte byte0)
    {
        this();
    }

    private aq(aq aq1)
    {
        a = aq1.a;
        b = aq1.b;
        c = aq1.c;
        d = aq1.d;
        e = aq1.e;
        f = aq1.f;
        g = aq1.g;
    }

    public aq(aq aq1, byte byte0)
    {
        this(aq1);
    }

    private aq(JSONObject jsonobject)
    {
        a = jsonobject.optBoolean("rateMyAppEnabled", false);
        b = jsonobject.optBoolean("hasRatedApp", false);
        c = jsonobject.optInt("numAppLoads", 0);
        d = jsonobject.optInt("rateAfterNumLoads", 5);
        e = jsonobject.optInt("remindAfterNumLoads", 5);
        f = jsonobject.optString("rateAppMessage", "Would you mind taking a second to rate my app?  I would really appreciate it!");
        g = jsonobject.optString("rateAppTitle", "Rate My App");
    }

    aq(JSONObject jsonobject, byte byte0)
    {
        this(jsonobject);
    }

    private JSONObject d()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("rateAfterNumLoads", d).put("remindAfterNumLoads", e).put("rateAppMessage", f).put("rateAppTitle", g).put("hasRatedApp", b).put("numAppLoads", c).put("rateMyAppEnabled", a);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        a = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean a(h h1, String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        h1.b(s, s1, d().toString());
        this;
        JVM INSTR monitorexit ;
        return true;
        h1;
        throw h1;
    }

    public final Object b()
    {
        return d();
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        a = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
