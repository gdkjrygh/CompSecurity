// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.moa;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.aviary.android.feather.headless.moa:
//            d, b, j, i

public final class a
{

    public a()
    {
    }

    public static String a(d d1, i k)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        d1;
        JVM INSTR monitorenter ;
        Iterator iterator = d1.iterator();
_L4:
        JSONObject jsonobject1;
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_249;
        }
        obj = (b)iterator.next();
        jsonobject1 = new JSONObject();
        jsonobject1.accumulate("action", ((b) (obj)).b());
        obj = ((b) (obj)).a().iterator();
_L3:
        java.util.Map.Entry entry;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_239;
        }
        entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        if (!(entry.getValue() instanceof j)) goto _L2; else goto _L1
_L1:
        jsonobject1.accumulate((String)entry.getKey(), ((j)(j)entry.getValue()).a());
          goto _L3
        k;
        d1;
        JVM INSTR monitorexit ;
        throw k;
_L2:
label0:
        {
            if (!(entry.getValue() instanceof Collection))
            {
                break label0;
            }
            JSONArray jsonarray1 = new JSONArray();
            a(jsonarray1, (Collection)entry.getValue());
            jsonobject1.accumulate((String)entry.getKey(), jsonarray1);
        }
          goto _L3
        jsonobject1.accumulate((String)entry.getKey(), entry.getValue());
          goto _L3
        jsonarray.put(jsonobject1);
          goto _L4
        d1;
        JVM INSTR monitorexit ;
        jsonobject.put("metadata", k.e());
        jsonobject.put("actionlist", jsonarray);
        return jsonobject.toString();
    }

    static void a(JSONArray jsonarray, Collection collection)
    {
        collection;
        JVM INSTR monitorenter ;
        Iterator iterator = collection.iterator();
_L3:
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        obj = iterator.next();
        if (!(obj instanceof j)) goto _L2; else goto _L1
_L1:
        jsonarray.put(((j)obj).a());
          goto _L3
        jsonarray;
        collection;
        JVM INSTR monitorexit ;
        throw jsonarray;
_L2:
label0:
        {
            if (!(obj instanceof Collection))
            {
                break label0;
            }
            JSONArray jsonarray1 = new JSONArray();
            a(jsonarray1, (Collection)obj);
            jsonarray.put(jsonarray1);
        }
          goto _L3
        jsonarray.put(obj);
          goto _L3
        collection;
        JVM INSTR monitorexit ;
    }
}
