// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.b.a.c;
import com.appboy.d.e;
import com.appboy.d.g;
import com.appboy.d.h;
import com.appboy.f;
import com.appboy.f.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            dl, bp, br, az

public final class bo
{

    private static final String d;
    public final JSONArray a;
    public final com.appboy.d.a b;
    public final br c;

    public bo(JSONObject jsonobject, az az)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        super();
        obj = jsonobject.optJSONArray("feed");
        c c1;
        if (obj != null)
        {
            a = ((JSONArray) (obj));
        } else
        {
            a = null;
        }
        obj = jsonobject.optJSONObject("inapp");
        if (obj == null)
        {
            obj = jsonobject.optJSONObject("slideup");
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        c1 = (c)a.a.dl.a(((JSONObject) (obj)), "type", com/appboy/b/a/c, c.a);
        a.a.bp.a[c1.ordinal()];
        JVM INSTR tableswitch 1 3: default 324
    //                   1 148
    //                   2 194
    //                   3 240;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_240;
_L3:
        az = new h(((JSONObject) (obj)), az);
_L7:
        b = az;
        az = jsonobject.optJSONObject("config");
        jsonobject = obj1;
        if (az != null)
        {
            try
            {
                jsonobject = new br(az);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                com.appboy.f.a.b(d, (new StringBuilder("Encountered JSONException processing server config: ")).append(az.toString()).toString(), jsonobject);
                jsonobject = obj1;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                com.appboy.f.a.b(d, (new StringBuilder("Encountered Exception processing server config: ")).append(az.toString()).toString(), jsonobject);
                jsonobject = obj1;
            }
        }
        c = jsonobject;
        return;
_L4:
        az = new e(((JSONObject) (obj)), az);
          goto _L7
        az;
        com.appboy.f.a.b(d, (new StringBuilder("Encountered JSONException processing In-app message: ")).append(((JSONObject) (obj)).toString()).toString(), az);
        az = null;
          goto _L7
_L5:
        az = new g(((JSONObject) (obj)), az);
          goto _L7
        az;
        com.appboy.f.a.b(d, (new StringBuilder("Encountered Exception processing In-app message: ")).append(((JSONObject) (obj)).toString()).toString(), az);
_L2:
        az = null;
          goto _L7
        az = new h(((JSONObject) (obj)), az);
          goto _L7
    }

    static 
    {
        d = String.format("%s.%s", new Object[] {
            f.a, a/a/bo.getName()
        });
    }
}
