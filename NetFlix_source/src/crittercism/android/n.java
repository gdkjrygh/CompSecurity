// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            s, m, l, i, 
//            au, as, at, aq

public final class n extends s
{

    public n(m m1)
    {
        this((new StringBuilder()).append(m1.a()).append("/android_v2/handle_app_loads").toString());
    }

    private n(String s1)
    {
        a = s1;
        b = new Vector();
    }

    private static n a(String s1)
    {
        Object obj;
        n n1;
        n1 = new n(s1);
        obj = new JSONObject();
        JSONObject jsonobject;
        Object obj1;
        obj1 = l.i().m();
        jsonobject = new JSONObject(((SharedPreferences) (obj1)).getString(h(), (new JSONObject()).toString()));
        obj1 = ((SharedPreferences) (obj1)).edit();
        ((android.content.SharedPreferences.Editor) (obj1)).remove(h());
        obj = jsonobject;
        if (!((android.content.SharedPreferences.Editor) (obj1)).commit())
        {
            throw new Exception("failed to remove app loads from Shared Preferences");
        }
          goto _L1
        obj;
_L3:
        (new StringBuilder("Exception in AppLoads.readFromDisk(): ")).append(obj.getClass().getName());
        obj = jsonobject;
_L1:
        try
        {
            s1 = a(((JSONObject) (obj)), s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return n1;
        }
        return s1;
        Exception exception;
        exception;
        jsonobject = ((JSONObject) (obj));
        obj = exception;
        if (true) goto _L3; else goto _L2
_L2:
    }

    private static n a(JSONObject jsonobject, String s1)
    {
        JSONArray jsonarray;
        n n1;
        n1 = new n(s1);
        s1 = new JSONObject();
        jsonarray = new JSONArray();
        int j;
        try
        {
            if (jsonobject.has("requestData"))
            {
                s1 = jsonobject.getJSONObject("requestData");
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            s1 = new JSONObject();
        }
        if (!s1.has("app_loads")) goto _L2; else goto _L1
_L1:
        jsonobject = s1.getJSONArray("app_loads");
_L4:
        j = 0;
        while (j < jsonobject.length()) 
        {
            try
            {
                n1.a(jsonobject.getJSONObject(j));
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                (new StringBuilder("Exception in AppLoads.fromJSON: ")).append(s1.getClass().getName());
            }
            j++;
        }
        break MISSING_BLOCK_LABEL_136;
        jsonobject;
        jsonobject = new JSONArray();
        continue; /* Loop/switch isn't completed */
        return n1;
_L2:
        jsonobject = jsonarray;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String h()
    {
        new String();
        String s1;
        try
        {
            s1 = l.i().a();
        }
        catch (Exception exception)
        {
            exception = new String();
        }
        return (new StringBuilder("critter_pendingapploads_")).append(s1).toString();
    }

    public final void a()
    {
        JSONObject jsonobject;
        JSONObject jsonobject1 = new JSONObject();
        new JSONObject();
        try
        {
            jsonobject = l.i().c.a(new boolean[] {
                false
            });
            jsonobject.put("ts", au.a.a());
        }
        catch (Exception exception)
        {
            exception = new JSONObject();
        }
        jsonobject1.put("app_state", jsonobject);
        jsonobject1.put("type", s.g);
        jsonobject = jsonobject1;
_L2:
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        b.add(jsonobject);
        return;
        Exception exception1;
        exception1;
        exception1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
    }

    public final void a(JSONObject jsonobject)
    {
        Object obj2;
        obj2 = null;
        (new StringBuilder("responseObject = ")).append(jsonobject.toString());
        int j = b.size();
        if (j != 0) goto _L2; else goto _L1
_L1:
        return;
        Exception exception;
        exception;
_L2:
        l l1;
        super.a(jsonobject);
        l1 = l.i();
        if (!jsonobject.has("success")) goto _L4; else goto _L3
_L3:
        if (jsonobject.getInt("success") == 1)
        {
            l1.c.i();
        }
_L10:
        new JSONObject();
        Object obj;
        if (!jsonobject.has("me"))
        {
            break MISSING_BLOCK_LABEL_541;
        }
        obj = jsonobject.getJSONObject("me");
        if (!((JSONObject) (obj)).has("username")) goto _L6; else goto _L5
_L5:
        Object obj1 = new as(((JSONObject) (obj)).getString("username"));
_L11:
        if (obj1 != null)
        {
            try
            {
                l1.d = ((as) (obj1));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                (new StringBuilder("Exception setting user object in AppLoads$handleResponseObject: ")).append(obj1.getClass().getName());
            }
            obj1 = l1.e.e();
            obj = ((JSONObject) (obj)).optJSONObject("notify");
            if (obj == null)
            {
                ((aq) (obj1)).c();
            } else
            if (((JSONObject) (obj)).optString("type") != null && ((JSONObject) (obj)).optString("type").equals("rate_my_app"))
            {
                obj1 = new aq(((aq) (obj1)), (byte)0);
                obj1.d = ((JSONObject) (obj)).optInt("rate_after_load_num", 5);
                obj1.e = ((JSONObject) (obj)).optInt("remind_after_load_num", 5);
                obj1.f = ((JSONObject) (obj)).optString("message", "Would you mind taking a second to rate my app?  I would really appreciate it!");
                obj1.g = ((JSONObject) (obj)).optString("title", "Rate My App");
                ((aq) (obj1)).a();
                l1.e.a(((aq) (obj1)));
            }
        }
        try
        {
            if (jsonobject.has("apm"))
            {
                obj = jsonobject.getJSONObject("apm");
                (new StringBuilder("apmSettings = ")).append(((JSONObject) (obj)).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            (new StringBuilder("Exception getting apm settings in AppLoads$handleResponseObject: ")).append(obj.getClass().getName());
        }
        if (!jsonobject.has("app_settings")) goto _L1; else goto _L7
_L7:
        jsonobject = jsonobject.getJSONObject("app_settings");
        if (!jsonobject.has("settings")) goto _L1; else goto _L8
_L8:
        obj = jsonobject.getJSONObject("settings");
        if (!((JSONObject) (obj)).has("need_pkg")) goto _L1; else goto _L9
_L9:
        obj1 = new StringBuilder("settings need_pkg = ");
        if (((JSONObject) (obj)).getInt("need_pkg") == 1)
        {
            jsonobject = "true";
        } else
        {
            jsonobject = "false";
        }
        try
        {
            ((StringBuilder) (obj1)).append(jsonobject);
            if (((JSONObject) (obj)).getInt("need_pkg") == 1)
            {
                l1.c.h();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            (new StringBuilder("Exception setting app settings in AppLoads$handleResponseObject: ")).append(jsonobject.getClass().getName());
            return;
        }
          goto _L1
_L4:
        try
        {
            l1.c.i();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            (new StringBuilder("Exception in AppLoads$handleResponseObject: ")).append(obj.getClass().getName());
        }
          goto _L10
_L6:
        obj1 = new as();
          goto _L11
        obj1;
_L12:
        (new StringBuilder("Exception getting user object in AppLoads$handleResponseObject: ")).append(obj1.getClass().getName());
        obj1 = obj2;
          goto _L11
        obj1;
        obj = null;
          goto _L12
        obj = null;
        obj1 = obj2;
          goto _L11
    }

    public final JSONObject b()
    {
        Object obj;
        JSONObject jsonobject1 = new JSONObject();
        new JSONObject();
        new JSONArray();
        JSONObject jsonobject;
        try
        {
            obj = new JSONArray(b);
        }
        catch (Exception exception)
        {
            exception = new JSONArray();
        }
        jsonobject = l.i().c.d();
        jsonobject.put("app_loads", obj);
        obj = jsonobject;
_L1:
        Exception exception1;
        try
        {
            jsonobject1.put("requestUrl", a);
            jsonobject1.put("requestData", obj);
        }
        catch (Exception exception2)
        {
            return new JSONObject();
        }
        return jsonobject1;
        exception1;
        exception1 = new JSONObject();
          goto _L1
    }

    public final void c()
    {
        try
        {
            android.content.SharedPreferences.Editor editor = l.i().m().edit();
            editor.remove(h());
            editor.putString(h(), b().toString());
            if (!editor.commit())
            {
                throw new Exception("commit failed");
            }
        }
        catch (Exception exception) { }
    }

    public final JSONObject d()
    {
        return super.d();
    }

    protected final void e()
    {
        n n1 = a(a);
        n1.a((Vector)b);
        b = n1.b;
    }
}
