// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, shelduck, hi, gs, 
//            bd, bb, cv, gn, 
//            bw, bz, eq

final class er
    implements Runnable
{

    final JSONObject a;
    final eq b;

    er(eq eq, JSONObject jsonobject)
    {
        b = eq;
        a = jsonobject;
        super();
    }

    public final void run()
    {
        Object obj2;
        JSONObject jsonobject1;
        ci ci1;
        Object obj3;
        int i;
        i = 0;
        ci1 = ci.b();
        JSONObject jsonobject = a;
        if (jsonobject == null || ci1.t == null || hi.a(shelduck.m))
        {
            return;
        }
        obj3 = jsonobject.optJSONObject("ViewElement");
        jsonobject1 = jsonobject.optJSONObject("Image");
        obj2 = jsonobject.optJSONObject("Variable");
        if (obj3 == null) goto _L2; else goto _L1
_L1:
        String s;
        boolean flag;
        s = ((JSONObject) (obj3)).optString("key");
        flag = ((JSONObject) (obj3)).optBoolean("android");
        if (s == null || !Boolean.valueOf(flag).booleanValue()) goto _L2; else goto _L3
_L3:
        if (gs.b())
        {
            gs.a((new StringBuilder("Got Updated View from Socket: ")).append(s).toString());
        }
        Object obj = ci1.t.l;
        if (obj == null) goto _L5; else goto _L4
_L4:
        obj = new bb(((JSONArray) (obj)));
_L8:
        if (i >= ((bb) (obj)).length()) goto _L7; else goto _L6
_L6:
        Object obj4 = ((bb) (obj)).optJSONObject(i);
        Object obj1;
        obj1 = obj;
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_497;
        }
        obj4 = ((JSONObject) (obj4)).optString("key");
        obj1 = obj;
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_497;
        }
        obj1 = obj;
        if (s.equals(obj4))
        {
            obj1 = ((bb) (obj)).a(i);
        }
        break MISSING_BLOCK_LABEL_497;
_L5:
        obj = new bb();
          goto _L8
_L7:
        try
        {
            ((bb) (obj)).put(obj3);
            ci1.t.l = new JSONArray(((bb) (obj)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gs.b("Update View From Socket JSONException", ((Exception) (obj)));
        }
        cv.a().b();
_L2:
        if (jsonobject1 == null)
        {
            break MISSING_BLOCK_LABEL_382;
        }
        obj3 = jsonobject1.optString("_id");
        if (((String) (obj3)).equals("") || ci.b().u == null || ci1.t == null)
        {
            break MISSING_BLOCK_LABEL_382;
        }
        if (gs.b())
        {
            gs.a((new StringBuilder("Got Update Image From Socket: ")).append(((String) (obj3))).toString());
        }
        obj1 = ci1.t.g;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_321;
        }
        obj = new JSONObject();
        if (((JSONObject) (obj)).has(((String) (obj3))))
        {
            ((JSONObject) (obj)).remove(((String) (obj3)));
        }
        ((JSONObject) (obj)).put(((String) (obj3)), jsonobject1);
        obj = new JSONObject();
        ((JSONObject) (obj)).put(((String) (obj3)), jsonobject1);
        (new gn()).execute(new JSONObject[] {
            obj
        });
_L9:
        if (obj2 != null)
        {
            obj = bw.a();
            try
            {
                obj2 = (JSONObject)obj2;
                obj1 = ((JSONObject) (obj2)).optString("name");
                obj2 = ((JSONObject) (obj2)).opt("value");
                gs.a((new StringBuilder("Client updated variable: ")).append(((String) (obj1))).toString());
                hi.a(new bz(((bw) (obj)), ((String) (obj1)), obj2));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                gs.b("Error updating dynamic variable", ((Exception) (obj)));
            }
        }
        cv.a().i();
        return;
        obj;
        gs.b("Updating Image From Socket JSONException", ((Exception) (obj)));
          goto _L9
        i++;
        obj = obj1;
          goto _L8
    }
}
