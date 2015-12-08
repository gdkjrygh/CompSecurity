// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.a.i;
import com.android.volley.h;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, bd, bc, q, 
//            dp, dz, ea, gt, 
//            gs, hb, bf, p, 
//            hi, hj, gz

public final class n
{

    public static Map b;
    public JSONObject a;
    private boolean c;
    private Boolean d;
    private Boolean e;

    public n()
    {
        c = false;
        d = Boolean.valueOf(false);
        e = Boolean.valueOf(false);
    }

    static JSONObject a(n n1, JSONObject jsonobject)
    {
        n1.a = jsonobject;
        return jsonobject;
    }

    static void a(n n1, bf bf1)
    {
        n1.a(bf1);
    }

    static boolean a(n n1)
    {
        n1.c = false;
        return false;
    }

    public final String a(String s)
    {
        String s1 = null;
        if (a != null)
        {
            s1 = a.optString(s, null);
        }
        return s1;
    }

    public final void a()
    {
        if (ci.b().j && a != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        JSONObject jsonobject = new JSONObject(a.toString());
        Object obj1;
        Object obj2;
        obj1 = ci.b();
        obj2 = ((ci) (obj1)).t;
        if (obj2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj;
        JSONObject jsonobject1;
        if (a.length() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new JSONObject();
        jsonobject1 = ((bd) (obj2)).k;
        if (((ci) (obj1)).f != null)
        {
            ((JSONObject) (obj)).put("t", ((ci) (obj1)).f);
        }
        if (((bd) (obj2)).a != null)
        {
            ((JSONObject) (obj)).put("sid", ((bd) (obj2)).a);
        }
        if (((bd) (obj2)).c != null)
        {
            ((JSONObject) (obj)).put("pid", ((bd) (obj2)).c.getString("_id"));
        }
        ((JSONObject) (obj)).put("k", "a4cbf0842807b43a0000");
        ((JSONObject) (obj)).put("au", a);
        if (jsonobject1 == null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        boolean flag = jsonobject1.has("_id");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        ((JSONObject) (obj)).put("auid", jsonobject1.getString("_id"));
_L4:
        Exception exception;
        try
        {
            if (!obj.equals(JSONObject.NULL) && ((JSONObject) (obj)).length() != 0)
            {
                obj1 = ((ci) (obj1)).b;
                obj2 = new q(this, jsonobject);
                if (ci.b().j)
                {
                    String s = (new StringBuilder()).append(((dp) (obj1)).e).append(((dp) (obj1)).b).append("/api/v1/clientAppUser").toString();
                    Date date = new Date();
                    obj = new i(1, s.replaceAll(" ", "%20"), ((JSONObject) (obj)), new dz(((dp) (obj1)), date, ((el) (obj2))), new ea(((dp) (obj1)), s, ((el) (obj2))));
                    obj.l = "post_clientAppUser";
                    ((dp) (obj1)).f.a(((Request) (obj)));
                }
            }
            a = null;
            obj = gt.a();
            if (gs.b())
            {
                gs.a("Delete App User Attributes From Disk");
            }
            gt.a("TLUserAttributes.json", new hb(((gt) (obj))));
            return;
        }
        catch (JSONException jsonexception)
        {
            gs.b("Copying app user attributes", jsonexception);
        }
        break MISSING_BLOCK_LABEL_388;
        exception;
        gs.b("Flushing App User Attributes", exception);
        a = jsonobject;
        a(((bf) (null)));
        return;
        a(((bf) (null)));
        return;
        obj2;
        gs.b("Getting appUser_id", ((Exception) (obj2)));
        if (true) goto _L4; else goto _L3
_L3:
        if (obj2 != null) goto _L1; else goto _L5
_L5:
        a(((bf) (null)));
        return;
    }

    public final void a(bf bf1)
    {
        if (bf1 != null)
        {
            bf1.a();
        }
        gt gt1 = gt.a();
        JSONObject jsonobject = a;
        Context context = ci.b().u;
        if (context == null)
        {
            if (gs.b())
            {
                gs.a("Writing User Attributes to Disk: No App Context to write JSON to disk");
            }
        } else
        {
            (new hj(jsonobject, "TLUserAttributes.json", context.getCacheDir(), new gz(gt1))).execute(new Void[0]);
        }
        if (!c)
        {
            c = true;
            Executors.newSingleThreadScheduledExecutor().schedule(new p(this, bf1), Math.round((30D + hi.a(10D)) * 1000D), TimeUnit.MILLISECONDS);
        }
    }

    static 
    {
        HashMap hashmap = new HashMap();
        hashmap.put("user_id", "String");
        hashmap.put("email", "String");
        hashmap.put("name", "String");
        hashmap.put("gender", "String");
        hashmap.put("age", "Number");
        hashmap.put("firstName", "String");
        hashmap.put("lastName", "String");
        hashmap.put("avatarUrl", "String");
        b = Collections.unmodifiableMap(hashmap);
    }
}
