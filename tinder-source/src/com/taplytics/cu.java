// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;
import android.os.AsyncTask;
import com.android.volley.Request;
import com.android.volley.a.i;
import com.android.volley.h;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            gs, ci, b, cs, 
//            bd, ba, bc, ct, 
//            dp, dr, ds

final class cu extends AsyncTask
{

    Random a;
    final cs b;

    private cu(cs cs1)
    {
        b = cs1;
        super();
        a = new Random();
    }

    cu(cs cs1, byte byte0)
    {
        this(cs1);
    }

    private transient JSONObject a(String as[])
    {
        Object obj;
        String s2;
        int j;
        long l;
        obj = null;
        String s;
        String s1;
        if (as != null && as.length > 0)
        {
            s = as[0];
        } else
        {
            s = null;
        }
        if (as != null && as.length > 1)
        {
            s1 = as[1];
        } else
        {
            s1 = null;
        }
        l = a.nextInt(1000) + 10;
        j = 1;
        as = ((String []) (obj));
_L3:
        if (j > 10)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        if (gs.b())
        {
            gs.a((new StringBuilder("Attempt #")).append(j).append(" to register").toString());
        }
        obj = ci.b().u;
        obj = new b("com.google.android.gms.gcm.GoogleCloudMessaging", "getInstance", new Class[] {
            android/content/Context
        }, new Object[] {
            obj
        });
        if (s == null) goto _L2; else goto _L1
_L1:
        if (gs.b())
        {
            gs.a("Posting the GCM token");
        }
        s2 = (String)((b) (obj)).a("register", new Class[] {
            [Ljava/lang/String;
        }, new Object[] {
            new String[] {
                s
            }
        });
        obj = s2;
        if (!gs.b())
        {
            break MISSING_BLOCK_LABEL_207;
        }
        gs.a((new StringBuilder("Push Token: ")).append(s2).toString());
        obj = s2;
_L5:
        as = new JSONObject();
        try
        {
            as.put("token", obj);
            as.put("env", s1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gs.b("Getting GCM token", ((Exception) (obj)));
            return as;
        }
        return as;
_L2:
        j++;
          goto _L3
        obj;
        as = s2;
_L6:
        gs.b((new StringBuilder("Failed to register on attempt ")).append(j).toString(), ((Exception) (obj)));
        obj = as;
        if (j == 10) goto _L5; else goto _L4
_L4:
        try
        {
            if (gs.b())
            {
                gs.a((new StringBuilder("Sleeping for ")).append(l).append(" ms before retry").toString());
            }
            Thread.sleep(l);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (gs.b())
            {
                gs.a("Thread interrupted: abort remaining retries!");
            }
            Thread.currentThread().interrupt();
        }
        l *= 2L;
          goto _L2
        obj;
          goto _L6
        obj = as;
          goto _L5
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        Object obj1;
        boolean flag;
        flag = false;
        obj1 = (JSONObject)obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        obj = ci.b().t;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        b.a = Boolean.valueOf(true);
        return;
        obj = ci.b().t.k;
        if (obj == null)
        {
            b.a = Boolean.valueOf(true);
            return;
        }
        obj = ((JSONObject) (obj)).optJSONArray("deviceInfo");
        int j;
        if (obj == null)
        {
            b.a = Boolean.valueOf(true);
            return;
        }
        j = 0;
_L16:
        Object obj2;
        if (j >= ((JSONArray) (obj)).length())
        {
            break MISSING_BLOCK_LABEL_215;
        }
        obj2 = ((JSONArray) (obj)).getJSONObject(j);
        boolean flag1 = flag;
        Object obj3;
        if (!((JSONObject) (obj1)).optString("env").equals("sandbox"))
        {
            break MISSING_BLOCK_LABEL_159;
        }
        obj3 = ((JSONObject) (obj2)).optString("pushTokenSandbox");
        flag1 = flag;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        flag1 = flag;
        if (((JSONObject) (obj1)).optString("token").equals(obj3))
        {
            flag1 = true;
        }
        flag = flag1;
        if (!((JSONObject) (obj1)).optString("env").equals("prod"))
        {
            break MISSING_BLOCK_LABEL_772;
        }
        obj2 = ((JSONObject) (obj2)).optString("pushToken");
        flag = flag1;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_772;
        }
        flag = flag1;
        if (((JSONObject) (obj1)).optString("token").equals(obj2))
        {
            flag = true;
        }
        break MISSING_BLOCK_LABEL_772;
        if (gs.b())
        {
            gs.a(((JSONObject) (obj1)).optString("token"));
        }
        if (((JSONObject) (obj1)).has("token"))
        {
            b.f = ((JSONObject) (obj1)).optString("token");
        }
        if (b.d != null)
        {
            ((JSONObject) (obj1)).optString("token");
        }
        if (flag) goto _L2; else goto _L1
_L1:
        obj3 = b;
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        if (((JSONObject) (obj1)).length() == 0) goto _L2; else goto _L4
_L4:
        obj = JSONObject.NULL;
        if (obj1 != obj) goto _L5; else goto _L2
_L2:
        b.a = Boolean.valueOf(true);
        return;
_L5:
        bd bd1;
        obj2 = new JSONObject();
        if (gs.b())
        {
            gs.a("Creating params");
        }
        bd1 = ci.b().t;
        if (bd1 == null) goto _L2; else goto _L6
_L6:
        ((JSONObject) (obj2)).put("ad", ci.b().c.b().get("id"));
        if (bd1.c == null) goto _L8; else goto _L7
_L7:
        obj = bd1.c.optString("_id");
_L12:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        ((JSONObject) (obj2)).put("pid", obj);
        if (ci.b().f != null)
        {
            ((JSONObject) (obj2)).put("t", ci.b().f);
        }
        if (bd1.k == null) goto _L10; else goto _L9
_L9:
        obj = bd1.k.optString("_id");
_L13:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_451;
        }
        ((JSONObject) (obj2)).put("auid", obj);
        if (bd1.a == null)
        {
            break MISSING_BLOCK_LABEL_722;
        }
        obj = bd1.a;
_L14:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_478;
        }
        ((JSONObject) (obj2)).put("sid", obj);
        if (gs.b())
        {
            gs.a((new StringBuilder("Posting GCM Token: ")).append(((JSONObject) (obj1)).optString("token")).toString());
            gs.a((new StringBuilder("Posting GCM Token, environment: ")).append(((JSONObject) (obj1)).optString("env")).toString());
        }
        ((JSONObject) (obj2)).put("pt", ((JSONObject) (obj1)).optString("token"));
        ((JSONObject) (obj2)).put("env", ((JSONObject) (obj1)).optString("env"));
        ((JSONObject) (obj2)).put("os", "Android");
        obj = ci.b().b;
        obj1 = new ct(((cs) (obj3)));
        if (!ci.b().j || ((JSONObject) (obj2)).length() == 0) goto _L2; else goto _L11
_L11:
        String s = (new StringBuilder()).append(((dp) (obj)).e).append(((dp) (obj)).b).append("/api/v1/pushToken").toString();
        Date date = new Date();
        obj1 = new i(1, s.replaceAll(" ", "%20"), ((JSONObject) (obj2)), new dr(((dp) (obj)), date, ((el) (obj1))), new ds(((dp) (obj)), s, ((el) (obj1))));
        obj1.l = "post_pushToken";
        ((dp) (obj)).f.a(((Request) (obj1)));
          goto _L2
        obj;
          goto _L2
_L8:
        obj = null;
          goto _L12
_L10:
        obj = null;
          goto _L13
        obj = null;
          goto _L14
        obj;
        gs.b("Posting GCM Token", ((Exception) (obj)));
          goto _L2
        obj;
        gs.b("Checking GCM Push Token", ((Exception) (obj)));
        b.a = Boolean.valueOf(true);
        return;
        obj;
        b.a = Boolean.valueOf(true);
        throw obj;
        j++;
        if (true) goto _L16; else goto _L15
_L15:
    }
}
