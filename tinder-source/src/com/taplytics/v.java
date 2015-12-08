// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.util.Pair;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            u, t, ci, j, 
//            gs

final class v
    implements Runnable
{

    final u a;

    v(u u1)
    {
        a = u1;
        super();
    }

    public final void run()
    {
        int i = 0;
        Object obj;
        a.a.b.setAccessible(true);
        obj = a.a.b.invoke(a.a.d, new Object[] {
            ci.b().u
        });
        a.a.b.setAccessible(false);
        a.a.c = obj.getClass().getDeclaredMethod("getEvents", new Class[] {
            Long.TYPE, Integer.TYPE
        });
        a.a.c.setAccessible(true);
        obj = (Pair)a.a.c.invoke(obj, new Object[] {
            Long.valueOf(0x7fffffffffffffffL), Integer.valueOf(30)
        });
        a.a.c.setAccessible(false);
_L3:
        if (i >= ((JSONArray)((Pair) (obj)).second).length()) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject;
        long l;
        if (!(((JSONArray)((Pair) (obj)).second).opt(i) instanceof JSONObject))
        {
            break MISSING_BLOCK_LABEL_383;
        }
        jsonobject = ((JSONArray)((Pair) (obj)).second).getJSONObject(i);
        if (jsonobject.optLong("event_id") > a.a.g)
        {
            a.a.g = jsonobject.optLong("event_id");
            ci.b().d.a("amplitude", jsonobject.optString("event_type"), null, jsonobject.optJSONObject("event_properties"));
            if (gs.b())
            {
                gs.a("logged amplitude event");
            }
            if (jsonobject.optLong("event_id") > a.a.g)
            {
                a.a.g = jsonobject.optLong("event_id");
            }
            break MISSING_BLOCK_LABEL_383;
        }
        l = i;
        long l1;
        long l2;
        l1 = a.a.g;
        l2 = jsonobject.optLong("event_id");
        i = (int)(l + (l1 - l2));
        break MISSING_BLOCK_LABEL_383;
        Exception exception;
        exception;
        gs.c((new StringBuilder("error while getting amplitude event: ")).append(exception.getMessage()).toString());
_L2:
        return;
        i++;
          goto _L3
    }
}
