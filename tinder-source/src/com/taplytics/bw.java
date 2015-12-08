// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.util.Log;
import com.taplytics.a.j;
import com.taplytics.a.k;
import java.util.WeakHashMap;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, bd, bc, bx, 
//            hq, em, by

public final class bw
{

    private static bw b;
    WeakHashMap a;

    public bw()
    {
        a = new WeakHashMap();
    }

    public static bw a()
    {
        if (b != null)
        {
            return b;
        } else
        {
            bw bw1 = new bw();
            b = bw1;
            return bw1;
        }
    }

    public final Object a(String s, Object obj, j j1)
        throws Exception
    {
        if (ci.b().g)
        {
            a.put(s, j1);
        }
        if (ci.b().t == null) goto _L2; else goto _L1
_L1:
        Object obj1 = ci.b().t.f;
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        if (((bc) (obj1)).optJSONObject(s) == null) goto _L2; else goto _L4
_L4:
        Object obj2 = ((bc) (obj1)).optJSONObject(s).opt("value");
        if (obj2 == null) goto _L2; else goto _L5
_L5:
        obj1 = ((bc) (obj1)).optJSONObject(s).opt("value");
        if (j1.b != null)
        {
            j1.b.a(obj1);
        }
        s = ((String) (obj1));
_L7:
        return s;
        Throwable throwable;
        throwable;
        Log.w("Taplytics", "Problem casting dynamic variable", throwable);
        a(s, obj);
_L2:
        ci.b().s.a(new bx(this, s, obj, j1));
        s = ((String) (obj));
        if (j1.b != null)
        {
            j1.b.a(obj);
            return obj;
        }
        if (true) goto _L7; else goto _L6
_L6:
        s;
        return obj;
    }

    final void a(String s, Object obj)
    {
        em.a().c.a(new by(this, s, obj));
    }
}
