// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import com.google.android.gms.cast.Q;
import com.google.android.gms.cast.m;
import com.google.android.gms.cast.o;
import com.google.android.gms.cast.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast.internal:
//            c, j, t, p, 
//            s

public class q extends c
{

    private static final String a = com.google.android.gms.cast.internal.j.b("com.google.cast.media");
    public long i;
    public p j;
    public final List k = new ArrayList();
    private final t l = new t();
    private final t m = new t();
    private final t n = new t();
    private final t o = new t();
    private final t p = new t();
    private final t q = new t();
    private final t r = new t();
    private final t s = new t();
    private final t t = new t();
    private final t u = new t();
    private final t v = new t();
    private final t w = new t();
    private final t x = new t();
    private final t y = new t();

    public q()
    {
        super(a, "MediaControlChannel");
        k.add(l);
        k.add(m);
        k.add(n);
        k.add(o);
        k.add(p);
        k.add(q);
        k.add(r);
        k.add(s);
        k.add(t);
        k.add(u);
        k.add(v);
        k.add(w);
        k.add(x);
        k.add(y);
        i();
    }

    private void a(long l1, JSONObject jsonobject)
        throws JSONException
    {
        int i1;
        int j1;
label0:
        {
            j1 = 1;
            boolean flag1 = l.a(l1);
            boolean flag;
            if (p.b() && !p.a(l1))
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (q.b())
            {
                flag = j1;
                if (!q.a(l1))
                {
                    break label0;
                }
            }
            if (r.b() && !r.a(l1))
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
        if (flag1 || j == null)
        {
            j = new p(jsonobject);
            i = SystemClock.elapsedRealtime();
            i1 = 31;
        } else
        {
            i1 = j.a(jsonobject, j1);
        }
        if ((i1 & 1) != 0)
        {
            i = SystemClock.elapsedRealtime();
            a();
        }
        if ((i1 & 2) != 0)
        {
            i = SystemClock.elapsedRealtime();
            a();
        }
        if ((i1 & 4) != 0)
        {
            b();
        }
        if ((i1 & 8) != 0)
        {
            c();
        }
        if ((i1 & 0x10) != 0)
        {
            d();
        }
        for (jsonobject = k.iterator(); jsonobject.hasNext(); ((t)jsonobject.next()).a(l1, 0, null)) { }
    }

    private long h()
        throws IllegalStateException
    {
        if (j == null)
        {
            throw new IllegalStateException("No current media session");
        } else
        {
            return j.b;
        }
    }

    private void i()
    {
        i = 0L;
        j = null;
        for (Iterator iterator = k.iterator(); iterator.hasNext();)
        {
            t t1 = (t)iterator.next();
            synchronized (t.b)
            {
                if (t1.a != -1L)
                {
                    t1.a();
                }
            }
        }

        break MISSING_BLOCK_LABEL_70;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final long a(s s1)
        throws IOException
    {
        JSONObject jsonobject = new JSONObject();
        long l1 = f();
        s.a(l1, s1);
        a(true);
        try
        {
            jsonobject.put("requestId", l1);
            jsonobject.put("type", "GET_STATUS");
            if (j != null)
            {
                jsonobject.put("mediaSessionId", j.b);
            }
        }
        // Misplaced declaration of an exception variable
        catch (s s1) { }
        a(jsonobject.toString(), l1);
        return l1;
    }

    public final long a(s s1, double d1, JSONObject jsonobject)
        throws IOException, IllegalStateException, IllegalArgumentException
    {
        JSONObject jsonobject1;
        long l1;
        if (Double.isInfinite(d1) || Double.isNaN(d1))
        {
            throw new IllegalArgumentException((new StringBuilder("Volume cannot be ")).append(d1).toString());
        }
        jsonobject1 = new JSONObject();
        l1 = f();
        q.a(l1, s1);
        a(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "SET_VOLUME");
        jsonobject1.put("mediaSessionId", h());
        s1 = new JSONObject();
        s1.put("level", d1);
        jsonobject1.put("volume", s1);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (s s1) { }
        }
        a(jsonobject1.toString(), l1);
        return l1;
    }

    public final long a(s s1, int i1, o ao[], int j1, Integer integer, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l1;
        jsonobject1 = new JSONObject();
        l1 = f();
        w.a(l1, s1);
        a(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "QUEUE_UPDATE");
        jsonobject1.put("mediaSessionId", h());
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        jsonobject1.put("currentItemId", i1);
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        jsonobject1.put("jump", j1);
        if (ao == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (ao.length <= 0)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        s1 = new JSONArray();
        i1 = 0;
_L2:
        if (i1 >= ao.length)
        {
            break; /* Loop/switch isn't completed */
        }
        s1.put(i1, ao[i1].a());
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        jsonobject1.put("items", s1);
        if (integer == null) goto _L4; else goto _L3
_L3:
        integer.intValue();
        JVM INSTR tableswitch 0 3: default 273
    //                   0 213
    //                   1 228
    //                   2 243
    //                   3 258;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        break; /* Loop/switch isn't completed */
_L9:
        break MISSING_BLOCK_LABEL_258;
_L4:
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (s s1) { }
        }
        a(jsonobject1.toString(), l1);
        return l1;
_L6:
        jsonobject1.put("repeatMode", "REPEAT_OFF");
          goto _L4
_L7:
        jsonobject1.put("repeatMode", "REPEAT_ALL");
          goto _L4
_L8:
        jsonobject1.put("repeatMode", "REPEAT_SINGLE");
          goto _L4
        jsonobject1.put("repeatMode", "REPEAT_ALL_AND_SHUFFLE");
          goto _L4
    }

    public final long a(s s1, long l1, int i1, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l2;
        jsonobject1 = new JSONObject();
        l2 = f();
        p.a(l2, s1);
        a(true);
        jsonobject1.put("requestId", l2);
        jsonobject1.put("type", "SEEK");
        jsonobject1.put("mediaSessionId", h());
        jsonobject1.put("currentTime", com.google.android.gms.cast.internal.j.a(l1));
        if (i1 != 1) goto _L2; else goto _L1
_L1:
        jsonobject1.put("resumeState", "PLAYBACK_START");
_L4:
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (s s1) { }
        }
        a(jsonobject1.toString(), l2);
        return l2;
_L2:
        if (i1 != 2) goto _L4; else goto _L3
_L3:
        jsonobject1.put("resumeState", "PLAYBACK_PAUSE");
          goto _L4
    }

    public final long a(s s1, Q q1)
        throws IOException
    {
        JSONObject jsonobject;
        long l1;
        jsonobject = new JSONObject();
        l1 = f();
        u.a(l1, s1);
        a(true);
        jsonobject.put("requestId", l1);
        jsonobject.put("type", "EDIT_TRACKS_INFO");
        if (q1 == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        jsonobject.put("textTrackStyle", q1.b());
        jsonobject.put("mediaSessionId", h());
_L2:
        a(jsonobject.toString(), l1);
        return l1;
        s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final long a(s s1, m m1, boolean flag, long l1, long al[], JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l2;
        jsonobject1 = new JSONObject();
        l2 = f();
        l.a(l2, s1);
        a(true);
        jsonobject1.put("requestId", l2);
        jsonobject1.put("type", "LOAD");
        jsonobject1.put("media", m1.a());
        jsonobject1.put("autoplay", flag);
        jsonobject1.put("currentTime", com.google.android.gms.cast.internal.j.a(l1));
        if (al == null)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        s1 = new JSONArray();
        int i1 = 0;
_L2:
        if (i1 >= al.length)
        {
            break; /* Loop/switch isn't completed */
        }
        s1.put(i1, al[i1]);
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        jsonobject1.put("activeTrackIds", s1);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (s s1) { }
        }
        a(jsonobject1.toString(), l2);
        return l2;
    }

    public final long a(s s1, JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l1;
        jsonobject1 = new JSONObject();
        l1 = f();
        m.a(l1, s1);
        a(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "PAUSE");
        jsonobject1.put("mediaSessionId", h());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (s s1) { }
        }
        a(jsonobject1.toString(), l1);
        return l1;
    }

    public final long a(s s1, boolean flag, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l1;
        jsonobject1 = new JSONObject();
        l1 = f();
        r.a(l1, s1);
        a(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "SET_VOLUME");
        jsonobject1.put("mediaSessionId", h());
        s1 = new JSONObject();
        s1.put("muted", flag);
        jsonobject1.put("volume", s1);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (s s1) { }
        }
        a(jsonobject1.toString(), l1);
        return l1;
    }

    public final long a(s s1, int ai[], int i1, JSONObject jsonobject)
        throws IOException, IllegalStateException, IllegalArgumentException
    {
        JSONObject jsonobject1;
        long l1;
        if (ai == null || ai.length == 0)
        {
            throw new IllegalArgumentException("itemIdsToReorder must not be null or empty.");
        }
        jsonobject1 = new JSONObject();
        l1 = f();
        y.a(l1, s1);
        a(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "QUEUE_REORDER");
        jsonobject1.put("mediaSessionId", h());
        s1 = new JSONArray();
        int j1 = 0;
_L2:
        if (j1 >= ai.length)
        {
            break; /* Loop/switch isn't completed */
        }
        s1.put(j1, ai[j1]);
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
        jsonobject1.put("itemIds", s1);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        jsonobject1.put("insertBefore", i1);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (s s1) { }
        }
        a(jsonobject1.toString(), l1);
        return l1;
    }

    public final long a(s s1, int ai[], JSONObject jsonobject)
        throws IOException, IllegalStateException, IllegalArgumentException
    {
        JSONObject jsonobject1;
        long l1;
        if (ai == null || ai.length == 0)
        {
            throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
        }
        jsonobject1 = new JSONObject();
        l1 = f();
        x.a(l1, s1);
        a(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "QUEUE_REMOVE");
        jsonobject1.put("mediaSessionId", h());
        s1 = new JSONArray();
        int i1 = 0;
_L2:
        if (i1 >= ai.length)
        {
            break; /* Loop/switch isn't completed */
        }
        s1.put(i1, ai[i1]);
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        jsonobject1.put("itemIds", s1);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (s s1) { }
        }
        a(jsonobject1.toString(), l1);
        return l1;
    }

    public final long a(s s1, long al[])
        throws IOException
    {
        JSONObject jsonobject;
        long l1;
        jsonobject = new JSONObject();
        l1 = f();
        t.a(l1, s1);
        a(true);
        jsonobject.put("requestId", l1);
        jsonobject.put("type", "EDIT_TRACKS_INFO");
        jsonobject.put("mediaSessionId", h());
        s1 = new JSONArray();
        int i1 = 0;
_L2:
        if (i1 >= al.length)
        {
            break; /* Loop/switch isn't completed */
        }
        s1.put(i1, al[i1]);
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            jsonobject.put("activeTrackIds", s1);
        }
        // Misplaced declaration of an exception variable
        catch (s s1) { }
        a(jsonobject.toString(), l1);
        return l1;
    }

    public final long a(s s1, o ao[], int i1, int j1, JSONObject jsonobject)
        throws IOException, IllegalArgumentException
    {
        JSONObject jsonobject1;
        long l1;
        if (ao == null || ao.length == 0)
        {
            throw new IllegalArgumentException("items must not be null or empty.");
        }
        if (i1 < 0 || i1 >= ao.length)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid startIndex: ")).append(i1).toString());
        }
        jsonobject1 = new JSONObject();
        l1 = f();
        l.a(l1, s1);
        a(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "QUEUE_LOAD");
        s1 = new JSONArray();
        int k1 = 0;
_L2:
        if (k1 >= ao.length)
        {
            break; /* Loop/switch isn't completed */
        }
        s1.put(k1, ao[k1].a());
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
        jsonobject1.put("items", s1);
        j1;
        JVM INSTR tableswitch 0 3: default 314
    //                   0 229
    //                   1 269
    //                   2 284
    //                   3 299;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_299;
_L3:
        try
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid repeat mode: ")).append(j1).toString());
        }
        // Misplaced declaration of an exception variable
        catch (s s1) { }
_L9:
        a(jsonobject1.toString(), l1);
        return l1;
_L4:
        jsonobject1.put("repeatMode", "REPEAT_OFF");
_L10:
        jsonobject1.put("startIndex", i1);
        if (jsonobject == null) goto _L9; else goto _L8
_L8:
        jsonobject1.put("customData", jsonobject);
          goto _L9
_L5:
        jsonobject1.put("repeatMode", "REPEAT_ALL");
          goto _L10
_L6:
        jsonobject1.put("repeatMode", "REPEAT_SINGLE");
          goto _L10
        jsonobject1.put("repeatMode", "REPEAT_ALL_AND_SHUFFLE");
          goto _L10
    }

    public final long a(s s1, o ao[], int i1, JSONObject jsonobject)
        throws IOException, IllegalStateException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l1;
        if (ao == null || ao.length == 0)
        {
            throw new IllegalArgumentException("itemsToInsert must not be null or empty.");
        }
        jsonobject1 = new JSONObject();
        l1 = f();
        v.a(l1, s1);
        a(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "QUEUE_INSERT");
        jsonobject1.put("mediaSessionId", h());
        s1 = new JSONArray();
        int j1 = 0;
_L2:
        if (j1 >= ao.length)
        {
            break; /* Loop/switch isn't completed */
        }
        s1.put(j1, ao[j1].a());
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
        jsonobject1.put("items", s1);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        jsonobject1.put("insertBefore", i1);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (s s1) { }
        }
        a(jsonobject1.toString(), l1);
        return l1;
    }

    public void a()
    {
    }

    public final void a(String s1)
    {
        f.a("message received: %s", new Object[] {
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
            break MISSING_BLOCK_LABEL_144;
        }
        obj = ((JSONObject) (obj)).getJSONArray("status");
        if (((JSONArray) (obj)).length() > 0)
        {
            a(l1, ((JSONArray) (obj)).getJSONObject(0));
            return;
        }
        try
        {
            j = null;
            a();
            b();
            c();
            d();
            s.a(l1, 0, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            f.c("Message is malformed (%s); ignoring: %s", new Object[] {
                ((JSONException) (obj)).getMessage(), s1
            });
        }
        return;
        if (((String) (obj1)).equals("INVALID_PLAYER_STATE"))
        {
            f.c("received unexpected error: Invalid Player State.", new Object[0]);
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            for (obj1 = k.iterator(); ((Iterator) (obj1)).hasNext(); ((t)((Iterator) (obj1)).next()).a(l1, 2100, obj)) { }
            break MISSING_BLOCK_LABEL_354;
        }
        if (((String) (obj1)).equals("LOAD_FAILED"))
        {
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            l.a(l1, 2100, obj);
            return;
        }
        if (((String) (obj1)).equals("LOAD_CANCELLED"))
        {
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            l.a(l1, 2101, obj);
            return;
        }
        if (((String) (obj1)).equals("INVALID_REQUEST"))
        {
            f.c("received unexpected error: Invalid Request.", new Object[0]);
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            for (Iterator iterator = k.iterator(); iterator.hasNext(); ((t)iterator.next()).a(l1, 2100, obj)) { }
        }
    }

    protected final boolean a(long l1)
    {
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((t)iterator.next()).b(l1)) { }
        Object obj = t.b;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator1 = k.iterator();
_L4:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        if (!((t)iterator1.next()).b()) goto _L4; else goto _L3
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

    public final long b(s s1, JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l1;
        jsonobject1 = new JSONObject();
        l1 = f();
        o.a(l1, s1);
        a(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "STOP");
        jsonobject1.put("mediaSessionId", h());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (s s1) { }
        }
        a(jsonobject1.toString(), l1);
        return l1;
    }

    public void b()
    {
    }

    public final long c(s s1, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l1;
        jsonobject1 = new JSONObject();
        l1 = f();
        n.a(l1, s1);
        a(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "PLAY");
        jsonobject1.put("mediaSessionId", h());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (s s1) { }
        }
        a(jsonobject1.toString(), l1);
        return l1;
    }

    public void c()
    {
    }

    public void d()
    {
    }

    public final void e()
    {
        super.e();
        i();
    }

    public final m g()
    {
        if (j == null)
        {
            return null;
        } else
        {
            return j.c;
        }
    }

}
