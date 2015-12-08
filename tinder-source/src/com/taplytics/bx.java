// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import com.taplytics.a.j;
import com.taplytics.a.k;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            hu, ci, bd, bc, 
//            bw, gs

final class bx extends hu
{

    final String a;
    final Object b;
    final j c;
    final bw d;

    bx(bw bw1, String s, Object obj, j j1)
    {
        d = bw1;
        a = s;
        b = obj;
        c = j1;
        super();
    }

    public final void c()
    {
        Object obj;
        super.d();
        bc bc1;
        try
        {
            bc1 = ci.b().t.f;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gs.b("Problem setting dynamic var after tlprop promise return", ((Exception) (obj)));
            return;
        }
        if (bc1 == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (!bc1.has(a))
        {
            d.a(a, b);
            return;
        }
        obj = null;
        if (bc1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        obj = bc1.getJSONObject(a);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        if (((JSONObject) (obj)).has("value"))
        {
            break MISSING_BLOCK_LABEL_97;
        }
        d.a(a, b);
        return;
        Object obj1 = ((JSONObject) (obj)).get("value");
        if (!ci.b().g) goto _L2; else goto _L1
_L1:
        if (!d.a.containsKey(a) || !(d.a.get(a) instanceof j)) goto _L4; else goto _L3
_L3:
        obj = (j)d.a.get(a);
_L6:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Field field = obj.getClass().getDeclaredField("variable");
        field.setAccessible(true);
        if (field.get(obj) != obj1)
        {
            field.set(obj, obj1);
            if (((j) (obj)).b != null)
            {
                ((j) (obj)).b.a(obj1);
            }
        }
        field.setAccessible(false);
        return;
_L4:
        obj = c;
        continue; /* Loop/switch isn't completed */
_L2:
        obj = c;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
