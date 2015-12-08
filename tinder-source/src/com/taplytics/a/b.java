// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics.a;

import android.util.Log;
import com.taplytics.ci;
import com.taplytics.gs;
import com.taplytics.j;
import com.taplytics.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.taplytics.a:
//            i

public final class b
{

    public static void a(i k)
    {
        ci ci1 = ci.b();
        if (!ci1.j)
        {
            k.a(null);
            return;
        }
        if (ci1.n)
        {
            ci1.a(k);
            return;
        }
        if (ci1.y == null)
        {
            ci1.y = new ArrayList();
        }
        ci1.y.add(k);
    }

    public static void a(JSONObject jsonobject)
    {
        if (ci.b().d == null) goto _L2; else goto _L1
_L1:
        Object obj;
        n n1;
        Object obj1;
        Object obj2;
        boolean flag;
        n1 = ci.b().d.c;
        Iterator iterator;
        try
        {
            if (!ci.b().j)
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            gs.c((new StringBuilder("Issue when updating user attributes: ")).append(jsonobject.getMessage()).toString());
            return;
        }
        if (n1.a == null)
        {
            n1.a = new JSONObject();
        }
        iterator = jsonobject.keys();
        flag = false;
_L7:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        obj1 = (String)iterator.next();
        if (!n.b.containsKey(obj1)) goto _L6; else goto _L5
_L5:
        obj2 = (String)n.b.get(obj1);
        obj = jsonobject.get(((String) (obj1)));
        if (obj2 != null && obj != null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        try
        {
            throw new Exception("No type or value to clean attribute value");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        gs.b("Cleaning AppUser JSON Attribute", ((Exception) (obj)));
          goto _L7
        if (!((String) (obj2)).equals("String") || !(obj instanceof String)) goto _L9; else goto _L8
_L8:
        if (obj == null) goto _L11; else goto _L10
_L10:
        n1.a.put(((String) (obj1)), obj);
        if (!((String) (obj1)).equals("email") && !((String) (obj1)).equals("user_id")) goto _L7; else goto _L12
_L9:
        if (!((String) (obj2)).equals("Number") || !(obj instanceof Number)) goto _L13; else goto _L8
_L13:
        if (!((String) (obj2)).equals("JSONObject") || !(obj instanceof JSONObject)) goto _L14; else goto _L8
_L14:
        break MISSING_BLOCK_LABEL_567;
_L11:
        Log.w(gs.a(), (new StringBuilder("user attribute: ")).append(((String) (obj1))).append(", must be of type: ").append((String)n.b.get(obj1)).toString());
          goto _L7
_L6:
        if (!((String) (obj1)).equals("customData"))
        {
            break MISSING_BLOCK_LABEL_425;
        }
        if (!n1.a.has("customData"))
        {
            break MISSING_BLOCK_LABEL_406;
        }
        obj = n1.a.getJSONObject(((String) (obj1)));
        obj1 = jsonobject.getJSONObject(((String) (obj1)));
        String s;
        for (obj2 = ((JSONObject) (obj1)).keys(); ((Iterator) (obj2)).hasNext(); ((JSONObject) (obj)).put(s, ((JSONObject) (obj1)).get(s)))
        {
            s = (String)((Iterator) (obj2)).next();
        }

        n1.a.put("customData", obj);
          goto _L7
        n1.a.put(((String) (obj1)), jsonobject.getJSONObject(((String) (obj1))));
          goto _L7
        obj2 = jsonobject.get(((String) (obj1)));
        if (!n1.a.has("customData"))
        {
            break MISSING_BLOCK_LABEL_485;
        }
        obj = n1.a.getJSONObject("customData");
        ((JSONObject) (obj)).put(((String) (obj1)), obj2);
_L15:
        if (((JSONObject) (obj)).length() > 0)
        {
            n1.a.put("customData", obj);
        }
          goto _L7
        obj = new JSONObject();
        ((JSONObject) (obj)).put(((String) (obj1)), obj2);
          goto _L15
_L4:
        if (gs.b())
        {
            gs.a((new StringBuilder("Update App User Attributes: ")).append(n1.a.toString()).toString());
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_546;
        }
        n1.a();
        return;
        n1.a(null);
        return;
_L2:
        Log.w("Taplytics", "Taplytics not yet instantiated. Call Taplytics.startTaplytics before any other Taplytics call.");
        return;
_L12:
        flag = true;
          goto _L7
        obj = null;
          goto _L8
    }
}
