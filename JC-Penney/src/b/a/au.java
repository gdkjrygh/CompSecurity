// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

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

// Referenced classes of package b.a:
//            cz, dk, cy, bh, 
//            bl, bo, bn, bp, 
//            bq, br, ca, cb, 
//            bu, bv, bt, cl, 
//            bm, bw, bx, bz, 
//            by, cc, cd, ce, 
//            cf, cg, ch, ci, 
//            cj, ck, fc, ba, 
//            ag, eu, be

public final class au
    implements cz
{

    public long a;
    public String b;
    public String c;
    public JSONArray d;
    public String e;
    public JSONObject f;
    public boolean g;
    private JSONObject h;
    private JSONArray i;
    private JSONArray j;
    private JSONArray k;
    private String l;
    private JSONArray m;
    private String n;
    private int o;
    private boolean p;
    private String q;

    public au(Throwable throwable, long l1)
    {
        int i1 = 0;
        super();
        c = "";
        o = -1;
        p = false;
        g = false;
        p = throwable instanceof dk;
        q = cy.a.a();
        e = "uhe";
        bh bh1 = new bh();
        bh1.a(new bl()).a(new bo()).a(new bn()).a(new bp()).a(new bq()).a(new br()).a(new ca()).a(new cb()).a(new bu()).a(new bv()).a(new bt()).a(new cl()).a(new bm()).a(new bw()).a(new bx()).a(new bz()).a(new by()).a(new cc()).a(new cd()).a(new ce()).a(new cf()).a(new cg()).a(new ch()).a(new ci()).a(new cj()).a(new ck());
        f = bh1.a();
        h = new JSONObject();
        a = l1;
        b = a(throwable);
        if (throwable.getMessage() != null)
        {
            c = throwable.getMessage();
        }
        if (!p)
        {
            o = c(throwable);
        }
        l = "android";
        n = fc.a.a();
        m = new JSONArray();
        throwable = b(throwable);
        for (int j1 = throwable.length; i1 < j1; i1++)
        {
            Object obj = throwable[i1];
            m.put(obj);
        }

    }

    private String a(Throwable throwable)
    {
        Throwable throwable1 = throwable;
        if (p)
        {
            return ((dk)throwable).b();
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

    public final JSONObject a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("app_state", f);
        hashmap.put("breadcrumbs", h);
        hashmap.put("current_thread_id", Long.valueOf(a));
        if (i != null)
        {
            hashmap.put("endpoints", i);
        }
        if (j != null)
        {
            hashmap.put("systemBreadcrumbs", j);
        }
        if (k != null && k.length() > 0)
        {
            hashmap.put("transactions", k);
        }
        hashmap.put("exception_name", b);
        hashmap.put("exception_reason", c);
        hashmap.put("platform", l);
        if (d != null)
        {
            hashmap.put("threads", d);
        }
        hashmap.put("ts", n);
        String s1 = e;
        String s = s1;
        if (a != 1L)
        {
            s = (new StringBuilder()).append(s1).append("-bg").toString();
        }
        hashmap.put("type", s);
        hashmap.put("unsymbolized_stacktrace", m);
        if (!p)
        {
            hashmap.put("suspect_line_index", Integer.valueOf(o));
        }
        hashmap.put("is_manually_logged", Boolean.valueOf(g));
        return new JSONObject(hashmap);
    }

    public final void a(be be)
    {
        i = (new ba(be)).a;
    }

    public final void a(OutputStream outputstream)
    {
        outputstream.write(a().toString().getBytes());
    }

    public final void a(String s, be be)
    {
        be = (new ba(be)).a;
        try
        {
            h.put(s, be);
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
        k = new JSONArray();
        for (list = list.iterator(); list.hasNext();)
        {
            ag ag1 = (ag)list.next();
            try
            {
                k.put(ag1.i());
            }
            catch (JSONException jsonexception)
            {
                eu.a(jsonexception);
            }
        }

    }

    public final void b(be be)
    {
        j = (new ba(be)).a;
    }

    public final String j()
    {
        return q;
    }
}
