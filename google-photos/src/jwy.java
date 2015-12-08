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

public class jwy extends jwe
{

    private static final String g = jwo.b("com.google.cast.media");
    public long e;
    public jvu f;
    private final List h = new ArrayList();
    private final jwz i = new jwz(0x5265c00L);
    private final jwz j = new jwz(0x5265c00L);
    private final jwz k = new jwz(0x5265c00L);
    private final jwz l = new jwz(0x5265c00L);
    private final jwz m = new jwz(0x5265c00L);
    private final jwz n = new jwz(0x5265c00L);
    private final jwz o = new jwz(0x5265c00L);
    private final jwz p = new jwz(0x5265c00L);
    private final jwz q = new jwz(0x5265c00L);
    private final jwz r = new jwz(0x5265c00L);
    private final jwz s = new jwz(0x5265c00L);
    private final jwz t = new jwz(0x5265c00L);
    private final jwz u = new jwz(0x5265c00L);
    private final jwz v = new jwz(0x5265c00L);

    public jwy(String s1)
    {
        super(g, "MediaControlChannel", s1, 1000L);
        h.add(i);
        h.add(j);
        h.add(k);
        h.add(l);
        h.add(m);
        h.add(n);
        h.add(o);
        h.add(p);
        h.add(q);
        h.add(r);
        h.add(s);
        h.add(t);
        h.add(u);
        h.add(v);
        c();
    }

    private void a(long l1, JSONObject jsonobject)
    {
        int i1;
        int j1;
label0:
        {
            j1 = 1;
            boolean flag1 = i.a(l1);
            boolean flag;
            if (m.b() && !m.a(l1))
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (n.b())
            {
                flag = j1;
                if (!n.a(l1))
                {
                    break label0;
                }
            }
            if (o.b() && !o.a(l1))
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
        if (flag1 || f == null)
        {
            f = new jvu(jsonobject);
            e = SystemClock.elapsedRealtime();
            i1 = 31;
        } else
        {
            i1 = f.a(jsonobject, j1);
        }
        if ((i1 & 1) != 0)
        {
            e = SystemClock.elapsedRealtime();
            a();
        }
        if ((i1 & 2) != 0)
        {
            e = SystemClock.elapsedRealtime();
            a();
        }
        for (jsonobject = h.iterator(); jsonobject.hasNext(); ((jwz)jsonobject.next()).a(l1, 0, null)) { }
    }

    private void c()
    {
        e = 0L;
        f = null;
        for (Iterator iterator = h.iterator(); iterator.hasNext();)
        {
            jwz jwz1 = (jwz)iterator.next();
            synchronized (jwz.b)
            {
                if (jwz1.a != -1L)
                {
                    jwz1.a();
                }
            }
        }

        break MISSING_BLOCK_LABEL_70;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a()
    {
    }

    public final void a(String s1)
    {
        b.a("message received: %s", new Object[] {
            s1
        });
        Object obj;
        Object obj1;
        long l1;
        obj = new JSONObject(s1);
        obj1 = ((JSONObject) (obj)).getString("type");
        l1 = ((JSONObject) (obj)).optLong("requestId", -1L);
        if (!((String) (obj1)).equals("MEDIA_STATUS"))
        {
            break MISSING_BLOCK_LABEL_127;
        }
        obj = ((JSONObject) (obj)).getJSONArray("status");
        if (((JSONArray) (obj)).length() > 0)
        {
            a(l1, ((JSONArray) (obj)).getJSONObject(0));
            return;
        }
        try
        {
            f = null;
            a();
            p.a(l1, 0, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b.c("Message is malformed (%s); ignoring: %s", new Object[] {
                ((JSONException) (obj)).getMessage(), s1
            });
        }
        return;
        if (((String) (obj1)).equals("INVALID_PLAYER_STATE"))
        {
            b.c("received unexpected error: Invalid Player State.", new Object[0]);
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            for (obj1 = h.iterator(); ((Iterator) (obj1)).hasNext(); ((jwz)((Iterator) (obj1)).next()).a(l1, 2100, obj)) { }
            break MISSING_BLOCK_LABEL_329;
        }
        if (((String) (obj1)).equals("LOAD_FAILED"))
        {
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            i.a(l1, 2100, obj);
            return;
        }
        if (((String) (obj1)).equals("LOAD_CANCELLED"))
        {
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            i.a(l1, 2101, obj);
            return;
        }
        if (((String) (obj1)).equals("INVALID_REQUEST"))
        {
            b.c("received unexpected error: Invalid Request.", new Object[0]);
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            for (Iterator iterator = h.iterator(); iterator.hasNext(); ((jwz)iterator.next()).a(l1, 2100, obj)) { }
        }
    }

    protected final boolean a(long l1)
    {
        for (Iterator iterator = h.iterator(); iterator.hasNext(); ((jwz)iterator.next()).a(l1, 2102)) { }
        Object obj = jwz.b;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator1 = h.iterator();
_L4:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        if (!((jwz)iterator1.next()).b()) goto _L4; else goto _L3
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

    public final void b()
    {
        super.b();
        c();
    }

}
