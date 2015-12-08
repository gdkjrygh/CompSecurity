// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.b.a.c;
import com.appboy.d;
import com.appboy.d.a;
import com.appboy.d.g;
import com.appboy.d.h;
import com.appboy.d.j;
import com.appboy.d.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            eo, cq, co, bx

public final class cn
{

    private static final String d;
    public final JSONArray a;
    public final a b;
    public final cq c;

    public cn(JSONObject jsonobject, bx bx)
    {
        Object obj;
        Object obj1;
        c c1;
        obj = null;
        super();
        obj1 = jsonobject.optJSONArray("feed");
        if (obj1 != null)
        {
            a = ((JSONArray) (obj1));
        } else
        {
            a = null;
        }
        obj1 = jsonobject.optJSONObject("inapp");
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        c1 = (c)bo.app.eo.a(((JSONObject) (obj1)), "type", com/appboy/b/a/c, null);
        if (c1 != null) goto _L4; else goto _L3
_L3:
        (new StringBuilder("In-app message type was null.  Not parsing in-app message JSON: ")).append(((JSONObject) (obj1)).toString());
        bx = null;
_L10:
        b = bx;
        bx = jsonobject.optJSONObject("config");
        jsonobject = obj;
        if (bx != null)
        {
            try
            {
                jsonobject = new cq(bx);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                (new StringBuilder("Encountered JSONException processing server config: ")).append(bx.toString());
                jsonobject = obj;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                (new StringBuilder("Encountered Exception processing server config: ")).append(bx.toString());
                jsonobject = obj;
            }
        }
        c = jsonobject;
        return;
_L4:
        bo.app.co.a[c1.ordinal()];
        JVM INSTR tableswitch 1 4: default 333
    //                   1 183
    //                   2 221
    //                   3 259
    //                   4 273;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        (new StringBuilder("Unknown in-app message type.  Not parsing in-app message JSON: ")).append(((JSONObject) (obj1)).toString());
        bx = null;
          goto _L10
_L6:
        bx = new g(((JSONObject) (obj1)), bx);
          goto _L10
        bx;
        (new StringBuilder("Encountered JSONException processing In-app message: ")).append(((JSONObject) (obj1)).toString());
        bx = null;
          goto _L10
_L7:
        bx = new j(((JSONObject) (obj1)), bx);
          goto _L10
        bx;
        (new StringBuilder("Encountered Exception processing In-app message: ")).append(((JSONObject) (obj1)).toString());
_L2:
        bx = null;
          goto _L10
_L8:
        bx = new k(((JSONObject) (obj1)), bx);
          goto _L10
_L9:
        bx = new h(((JSONObject) (obj1)), bx);
          goto _L10
    }

    static 
    {
        d = String.format("%s.%s", new Object[] {
            d.a, bo/app/cn.getName()
        });
    }
}
