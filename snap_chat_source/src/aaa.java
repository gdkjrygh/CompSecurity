// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class aaa
    implements aax
{

    public long a;
    public JSONArray b;
    public String c;
    public String d;
    public JSONArray e;
    public String f;
    public JSONObject g;
    private JSONObject h;
    private JSONArray i;
    private JSONArray j;
    private String k;
    private JSONArray l;
    private String m;
    private int n;
    private boolean o;
    private String p;

    public aaa(Throwable throwable, long l1)
    {
        int i1 = 0;
        super();
        d = "";
        n = -1;
        o = false;
        o = throwable instanceof aaH;
        p = aaw.a.a();
        f = "uhe";
        aak aak1 = new aak();
        aak1.a(new aan.a()).a(new aan.d()).a(new aan.c()).a(new aan.e()).a(new aan.f()).a(new aan.g()).a(new aan.p()).a(new aan.q()).a(new aan.j()).a(new aan.k()).a(new aan.i()).a(new aan.A()).a(new aan.b()).a(new aan.l()).a(new aan.m()).a(new aan.o()).a(new aan.n()).a(new aan.r()).a(new aan.s()).a(new aan.t()).a(new aan.u()).a(new aan.v()).a(new aan.w()).a(new aan.x()).a(new aan.y()).a(new aan.z());
        g = aak1.a();
        h = new JSONObject();
        a = l1;
        c = a(throwable);
        if (throwable.getMessage() != null)
        {
            d = throwable.getMessage();
        }
        if (!o)
        {
            n = c(throwable);
        }
        k = "android";
        m = abp.a.a();
        l = new JSONArray();
        throwable = b(throwable);
        for (int j1 = throwable.length; i1 < j1; i1++)
        {
            Object obj = throwable[i1];
            l.put(obj);
        }

    }

    private String a(Throwable throwable)
    {
        if (o)
        {
            return null;
        }
        do
        {
            String s = throwable.getClass().getName();
            throwable1 = throwable.getCause();
            if (throwable1 != null && throwable1 != throwable)
            {
                throwable = throwable1;
            } else
            {
                return s;
            }
        } while (true);
    }

    private static String[] b(Throwable throwable)
    {
        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter = new PrintWriter(stringwriter);
        do
        {
            throwable.printStackTrace(printwriter);
            Throwable throwable1 = throwable.getCause();
            if (throwable1 == null || throwable1 == throwable)
            {
                return stringwriter.toString().split("\n");
            }
            throwable = throwable1;
        } while (true);
    }

    private static int c(Throwable throwable)
    {
        StackTraceElement astacktraceelement[];
        int i1;
        astacktraceelement = throwable.getStackTrace();
        i1 = 0;
_L6:
        if (i1 >= astacktraceelement.length) goto _L2; else goto _L1
_L1:
        throwable = astacktraceelement[i1];
        Class class1 = Class.forName(throwable.getClassName());
        throwable = ClassLoader.getSystemClassLoader();
_L5:
        if (throwable == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        if (class1.getClassLoader() != throwable) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L7:
        if (!flag)
        {
            return i1 + 1;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        throwable = throwable.getParent();
          goto _L5
        throwable;
        i1++;
          goto _L6
_L2:
        return -1;
        flag = false;
          goto _L7
    }

    public final JSONObject a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("app_state", g);
        hashmap.put("breadcrumbs", h);
        hashmap.put("current_thread_id", Long.valueOf(a));
        if (i != null)
        {
            hashmap.put("endpoints", i);
        }
        if (b != null)
        {
            hashmap.put("systemBreadcrumbs", b);
        }
        if (j != null && j.length() > 0)
        {
            hashmap.put("transactions", j);
        }
        hashmap.put("exception_name", c);
        hashmap.put("exception_reason", d);
        hashmap.put("platform", k);
        if (e != null)
        {
            hashmap.put("threads", e);
        }
        hashmap.put("ts", m);
        String s1 = f;
        String s = s1;
        if (a != 1L)
        {
            s = (new StringBuilder()).append(s1).append("-bg").toString();
        }
        hashmap.put("type", s);
        hashmap.put("unsymbolized_stacktrace", l);
        if (!o)
        {
            hashmap.put("suspect_line_index", Integer.valueOf(n));
        }
        return new JSONObject(hashmap);
    }

    public final void a(aai aai)
    {
        i = (new aae(aai)).a;
    }

    public final void a(OutputStream outputstream)
    {
        outputstream.write(a().toString().getBytes());
    }

    public final void a(String s, aai aai)
    {
        aai = (new aae(aai)).a;
        try
        {
            h.put(s, aai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public final void a(List list)
    {
        j = new JSONArray();
        for (list = list.iterator(); list.hasNext();)
        {
            ZV zv = (ZV)list.next();
            try
            {
                j.put(zv.d());
            }
            catch (JSONException jsonexception)
            {
                abk.a(jsonexception);
            }
        }

    }

    public final String e()
    {
        return p;
    }
}
