// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            cg, cp, cf, bt, 
//            ed, bn, bg, dx, 
//            br

public final class bk
    implements cg
{

    public JSONArray a;
    public String b;
    public String c;
    public String d;
    public JSONObject e;
    private JSONObject f;
    private long g;
    private JSONArray h;
    private JSONArray i;
    private String j;
    private JSONArray k;
    private JSONArray l;
    private String m;
    private int n;
    private boolean o;
    private String p;

    public bk(Throwable throwable, long l1)
    {
        int i1 = 0;
        super();
        c = "";
        n = -1;
        o = false;
        o = throwable instanceof cp;
        p = cf.a.a();
        d = "uhe";
        bt bt1 = new bt();
        bt1.a(new bw.a()).a(new bw.c()).a(new bw.b()).a(new bw.d()).a(new bw.e()).a(new bw.f()).a(new bw.o()).a(new bw.p()).a(new bw.i()).a(new bw.j()).a(new bw.h()).a(new bw.z()).a(new bw.aa()).a(new bw.k()).a(new bw.l()).a(new bw.n()).a(new bw.m()).a(new bw.q()).a(new bw.r()).a(new bw.s()).a(new bw.t()).a(new bw.u()).a(new bw.v()).a(new bw.w()).a(new bw.x()).a(new bw.y());
        e = bt1.a();
        f = new JSONObject();
        g = l1;
        b = a(throwable);
        if (throwable.getMessage() != null)
        {
            c = throwable.getMessage();
        }
        if (!o)
        {
            n = c(throwable);
        }
        j = "android";
        m = ed.a.a();
        k = new JSONArray();
        throwable = b(throwable);
        for (int j1 = throwable.length; i1 < j1; i1++)
        {
            Object obj = throwable[i1];
            k.put(obj);
        }

    }

    private String a(Throwable throwable)
    {
        Throwable throwable1 = throwable;
        if (o)
        {
            return ((cp)throwable).a();
        }
        do
        {
            String s = throwable1.getClass().getName();
            throwable = throwable1.getCause();
            if (throwable != null && throwable != throwable1)
            {
                throwable1 = throwable;
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

    public final void a()
    {
        l = new JSONArray();
        Iterator iterator = Thread.getAllStackTraces().entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            HashMap hashmap = new HashMap();
            Thread thread = (Thread)entry.getKey();
            if (thread.getId() != g)
            {
                hashmap.put("name", thread.getName());
                hashmap.put("id", Long.valueOf(thread.getId()));
                hashmap.put("state", thread.getState().name());
                hashmap.put("stacktrace", new JSONArray(Arrays.asList((Object[])entry.getValue())));
                l.put(new JSONObject(hashmap));
            }
        } while (true);
    }

    public final void a(br br)
    {
        h = (new bn(br)).a;
    }

    public final void a(OutputStream outputstream)
    {
        outputstream.write(b().toString().getBytes());
    }

    public final void a(String s, br br)
    {
        br = (new bn(br)).a;
        try
        {
            f.put(s, br);
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
        i = new JSONArray();
        for (list = list.iterator(); list.hasNext();)
        {
            bg bg1 = (bg)list.next();
            try
            {
                i.put(bg1.j());
            }
            catch (JSONException jsonexception)
            {
                dx.a(jsonexception);
            }
        }

    }

    public final JSONObject b()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("app_state", e);
        hashmap.put("breadcrumbs", f);
        hashmap.put("current_thread_id", Long.valueOf(g));
        if (h != null)
        {
            hashmap.put("endpoints", h);
        }
        if (a != null)
        {
            hashmap.put("systemBreadcrumbs", a);
        }
        if (i != null && i.length() > 0)
        {
            hashmap.put("transactions", i);
        }
        hashmap.put("exception_name", b);
        hashmap.put("exception_reason", c);
        hashmap.put("platform", j);
        if (l != null)
        {
            hashmap.put("threads", l);
        }
        hashmap.put("ts", m);
        String s1 = d;
        String s = s1;
        if (g != 1L)
        {
            s = (new StringBuilder()).append(s1).append("-bg").toString();
        }
        hashmap.put("type", s);
        hashmap.put("unsymbolized_stacktrace", k);
        if (!o)
        {
            hashmap.put("suspect_line_index", Integer.valueOf(n));
        }
        return new JSONObject(hashmap);
    }

    public final String e()
    {
        return p;
    }
}
