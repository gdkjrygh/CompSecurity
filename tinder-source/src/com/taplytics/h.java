// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import com.taplytics.a.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            hu, ci, bd, b, 
//            j, i

public final class h extends hu
{

    final b a;
    final a b;

    public h(a a1, b b1)
    {
        b = a1;
        a = b1;
        super();
    }

    public final void c()
    {
        HashSet hashset;
        JSONArray jsonarray = ci.b().t.m;
        hashset = new HashSet();
        if (jsonarray != null)
        {
            for (int k = 0; k < jsonarray.length(); k++)
            {
                if (jsonarray.optJSONObject(k) != null)
                {
                    hashset.add(jsonarray.optJSONObject(k).optString("_id"));
                }
            }

        }
        Iterator iterator;
        int l;
        int i1;
        int j1;
        l = ((Integer)a.a("getGeofenceTransition")).intValue();
        i1 = ((Integer)com.taplytics.b.a("com.google.android.gms.location.Geofence", "GEOFENCE_TRANSITION_ENTER")).intValue();
        j1 = ((Integer)com.taplytics.b.a("com.google.android.gms.location.Geofence", "GEOFENCE_TRANSITION_EXIT")).intValue();
        iterator = ((List)a.a("getTriggeringGeofences")).iterator();
_L3:
        String s;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_220;
            }
            s = (String)(new b(iterator.next())).a("getRequestId");
        } while (!hashset.contains(s));
        if (l != i1) goto _L2; else goto _L1
_L1:
        try
        {
            ci.b().d.a("tlGeofenceEnter", null, null, s);
        }
        catch (Exception exception)
        {
            return;
        }
          goto _L3
_L2:
        if (l != j1) goto _L3; else goto _L4
_L4:
        ci.b().d.a("tlGeofenceExit", null, null, s);
          goto _L3
        ci.b().d.a(new i(this));
        return;
    }
}
