// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public abstract class buj
{

    private static final String a = buj.getSimpleName();
    private static long j = 1L;
    private String b;
    private String c;
    private Map d;
    private final buk e;
    private final bus f;
    private buh g;
    private String h;
    private bre i;
    private long k;
    private Integer l;
    private String m;

    public buj(buh buh, buk buk1, bus bus)
    {
        this(buh, buk1, bus, null);
    }

    public buj(buh buh, buk buk1, bus bus, String s1)
    {
        long l1 = j;
        j = 1L + l1;
        k = l1;
        g = buh;
        h = s1;
        e = buk1;
        f = bus;
        d = new LinkedHashMap();
    }

    public static void l()
    {
    }

    public String a(buh buh)
    {
        String s1 = e.a(buh);
        if (s1 != null)
        {
            buh = s1;
            if (h != null)
            {
                buh = (new StringBuilder()).append(s1).append(h).toString();
            }
            return buh;
        } else
        {
            throw new RuntimeException((new StringBuilder("API ")).append(buh.toString()).append(" has no record for server ").append(e.c()).toString());
        }
    }

    public final void a(bre bre)
    {
        if (i != null)
        {
            IllegalStateException illegalstateexception = new IllegalStateException("Multiple exceptions reported");
            Log.e(a, (new StringBuilder("first error=")).append(i).toString());
            Log.e(a, (new StringBuilder("second error=")).append(bre).toString());
            Log.e(a, "", illegalstateexception);
            throw illegalstateexception;
        } else
        {
            i = bre;
            return;
        }
    }

    public final void a(Integer integer)
    {
        l = integer;
    }

    public final void a(String s1)
    {
        b = s1;
    }

    protected final void a(String s1, String s2)
    {
        d.put(s1, s2);
    }

    public boolean a()
    {
        return false;
    }

    public abstract String b();

    public final void b(String s1)
    {
        c = s1;
    }

    public final void b(String s1, String s2)
    {
        a(new brg(s1, s2));
    }

    public abstract void c();

    public final void c(String s1)
    {
        m = s1;
    }

    public abstract void d();

    public abstract String e();

    public final bus f()
    {
        return f;
    }

    public final String g()
    {
        return b;
    }

    public final String h()
    {
        return c;
    }

    public final buh i()
    {
        return g;
    }

    public final Map j()
    {
        return d;
    }

    public final String k()
    {
        return m;
    }

    public void m()
    {
    }

    protected final JSONObject n()
    {
        String s1 = c;
        Object obj = (new JSONTokener(s1)).nextValue();
        if (!(obj instanceof JSONObject))
        {
            throw new JSONException((new StringBuilder("could not parse:")).append(s1).append("\nnextValue:").append(obj).toString());
        } else
        {
            return (JSONObject)obj;
        }
    }

    public final String o()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" SN:").append(k).toString();
    }

    public final long p()
    {
        return k;
    }

    public final bre q()
    {
        return i;
    }

    public final boolean r()
    {
        return i == null;
    }

    public final Integer s()
    {
        return l;
    }

    public final buk t()
    {
        return e;
    }

}
