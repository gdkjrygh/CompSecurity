// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class bpz extends bpj
{

    private static final String f = bpp.b("com.google.cast.media");
    public final List e = new ArrayList();
    private box g;
    private final bqc h = new bqc();
    private final bqc i = new bqc();
    private final bqc j = new bqc();
    private final bqc k = new bqc();
    private final bqc l = new bqc();
    private final bqc m = new bqc();
    private final bqc n = new bqc();
    private final bqc o = new bqc();
    private final bqc p = new bqc();
    private final bqc q = new bqc();
    private final bqc r = new bqc();
    private final bqc s = new bqc();
    private final bqc t = new bqc();
    private final bqc u = new bqc();

    public bpz()
    {
        super(f, "MediaControlChannel");
        e.add(h);
        e.add(i);
        e.add(j);
        e.add(k);
        e.add(l);
        e.add(m);
        e.add(n);
        e.add(o);
        e.add(p);
        e.add(q);
        e.add(r);
        e.add(s);
        e.add(t);
        e.add(u);
        c();
    }

    private void a(long l1, JSONObject jsonobject)
    {
        int i1;
        int j1;
label0:
        {
            j1 = 1;
            boolean flag1 = h.a(l1);
            boolean flag;
            if (l.b() && !l.a(l1))
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (m.b())
            {
                flag = j1;
                if (!m.a(l1))
                {
                    break label0;
                }
            }
            if (n.b() && !n.a(l1))
            {
                flag = j1;
            } else
            {
                flag = false;
            }
        }
        if (i1 != 0)
        {
            i1 = 2;
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if (flag)
        {
            j1 = i1 | 1;
        }
        if (flag1 || g == null)
        {
            g = new box(jsonobject);
            SystemClock.elapsedRealtime();
            i1 = 31;
        } else
        {
            i1 = g.a(jsonobject, j1);
        }
        if ((i1 & 1) != 0)
        {
            SystemClock.elapsedRealtime();
        }
        if ((i1 & 2) != 0)
        {
            SystemClock.elapsedRealtime();
        }
        for (jsonobject = e.iterator(); jsonobject.hasNext(); ((bqc)jsonobject.next()).a(l1, 0)) { }
    }

    private void c()
    {
        g = null;
        for (Iterator iterator = e.iterator(); iterator.hasNext();)
        {
            bqc bqc1 = (bqc)iterator.next();
            synchronized (bqc.b)
            {
                if (bqc1.a != -1L)
                {
                    bqc1.a();
                }
            }
        }

        break MISSING_BLOCK_LABEL_65;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final long a(bqb bqb)
    {
        JSONObject jsonobject = new JSONObject();
        long l1 = b();
        o.a(l1, bqb);
        a(true);
        try
        {
            jsonobject.put("requestId", l1);
            jsonobject.put("type", "GET_STATUS");
            if (g != null)
            {
                jsonobject.put("mediaSessionId", g.a);
            }
        }
        // Misplaced declaration of an exception variable
        catch (bqb bqb) { }
        a(jsonobject.toString(), l1);
        return l1;
    }

    public final long a(bqb bqb, bor bor1, boolean flag)
    {
        JSONObject jsonobject = new JSONObject();
        long l1 = b();
        h.a(l1, bqb);
        a(true);
        try
        {
            jsonobject.put("requestId", l1);
            jsonobject.put("type", "LOAD");
            jsonobject.put("media", bor1.a());
            jsonobject.put("autoplay", flag);
            jsonobject.put("currentTime", bpp.a(0L));
        }
        // Misplaced declaration of an exception variable
        catch (bqb bqb) { }
        a(jsonobject.toString(), l1);
        return l1;
    }

    public final void a()
    {
        super.a();
        c();
    }

    public final void a(String s1)
    {
        b.a("message received: %s", new Object[] {
            s1
        });
        Object obj;
        String s2;
        long l1;
        obj = new JSONObject(s1);
        s2 = ((JSONObject) (obj)).getString("type");
        l1 = ((JSONObject) (obj)).optLong("requestId", -1L);
        if (!s2.equals("MEDIA_STATUS"))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        obj = ((JSONObject) (obj)).getJSONArray("status");
        if (((JSONArray) (obj)).length() > 0)
        {
            a(l1, ((JSONArray) (obj)).getJSONObject(0));
            return;
        }
        try
        {
            g = null;
            o.a(l1, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b.b("Message is malformed (%s); ignoring: %s", new Object[] {
                ((JSONException) (obj)).getMessage(), s1
            });
        }
        return;
        if (s2.equals("INVALID_PLAYER_STATE"))
        {
            b.b("received unexpected error: Invalid Player State.", new Object[0]);
            ((JSONObject) (obj)).optJSONObject("customData");
            for (obj = e.iterator(); ((Iterator) (obj)).hasNext(); ((bqc)((Iterator) (obj)).next()).a(l1, 2100)) { }
            break MISSING_BLOCK_LABEL_330;
        }
        if (s2.equals("LOAD_FAILED"))
        {
            ((JSONObject) (obj)).optJSONObject("customData");
            h.a(l1, 2100);
            return;
        }
        if (s2.equals("LOAD_CANCELLED"))
        {
            ((JSONObject) (obj)).optJSONObject("customData");
            h.a(l1, 2101);
            return;
        }
        if (s2.equals("INVALID_REQUEST"))
        {
            b.b("received unexpected error: Invalid Request.", new Object[0]);
            ((JSONObject) (obj)).optJSONObject("customData");
            for (Iterator iterator = e.iterator(); iterator.hasNext(); ((bqc)iterator.next()).a(l1, 2100)) { }
        }
    }

    protected final boolean a(long l1)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((bqc)iterator.next()).b(l1)) { }
        Object obj = bqc.b;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator1 = e.iterator();
_L4:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        if (!((bqc)iterator1.next()).b()) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
