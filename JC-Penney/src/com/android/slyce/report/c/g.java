// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import com.android.slyce.report.b.c;
import com.android.slyce.report.mpmetrics.ax;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.c:
//            a, y, h, i, 
//            x, au, ao, aq, 
//            av, ai, an, at

class g
{

    private static final Class b[] = new Class[0];
    private static final List c = Collections.emptyList();
    private final ax a;

    public g(ax ax1)
    {
        a = ax1;
    }

    private y a(Class class1, JSONObject jsonobject)
    {
        String s = null;
        Object obj;
        String s1;
        s1 = jsonobject.getString("name");
        if (!jsonobject.has("get"))
        {
            break MISSING_BLOCK_LABEL_142;
        }
        Object obj1 = jsonobject.getJSONObject("get");
        obj = ((JSONObject) (obj1)).getString("selector");
        obj1 = Class.forName(((JSONObject) (obj1)).getJSONObject("result").getString("type"));
        obj = new a(class1, ((String) (obj)), b, ((Class) (obj1)));
_L1:
        if (jsonobject.has("set"))
        {
            s = jsonobject.getJSONObject("set").getString("selector");
        }
        class1 = new y(s1, class1, ((a) (obj)), s);
        return class1;
        class1;
        throw new h("Can't create property reader", class1);
        class1;
        throw new h("Can't read property JSON", class1);
        class1;
        throw new h("Can't read property JSON, relevant arg/return class not found", class1);
        obj = null;
          goto _L1
    }

    private Integer a(int j, String s, ax ax1)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!ax1.a(s)) goto _L4; else goto _L3
_L3:
        int k = ax1.b(s);
_L6:
        if (-1 != k && -1 != j && k != j)
        {
            Log.e("MixpanelAPI.EditProtocol", "Path contains both a named and an explicit id, and they don't match. No views will be matched.");
            return null;
        }
        break; /* Loop/switch isn't completed */
_L4:
        Log.w("MixpanelAPI.EditProtocol", (new StringBuilder()).append("Path element contains an id name not known to the system. No views will be matched.\nMake sure that you're not stripping your packages R class out with proguard.\nid name was \"").append(s).append("\"").toString());
        return null;
_L2:
        k = -1;
        if (true) goto _L6; else goto _L5
_L5:
        if (-1 != k)
        {
            return Integer.valueOf(k);
        } else
        {
            return Integer.valueOf(j);
        }
    }

    private Object a(Object obj, String s)
    {
        if ("java.lang.CharSequence".equals(s))
        {
            return obj;
        }
        try
        {
            if (!"boolean".equals(s) && !"java.lang.Boolean".equals(s))
            {
                if ("int".equals(s) || "java.lang.Integer".equals(s))
                {
                    return Integer.valueOf(((Number)obj).intValue());
                }
                if ("float".equals(s) || "java.lang.Float".equals(s))
                {
                    return Float.valueOf(((Number)obj).floatValue());
                }
                if ("android.graphics.Bitmap".equals(s))
                {
                    byte abyte0[] = Base64.decode((String)obj, 0);
                    return BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
                } else
                {
                    throw new h((new StringBuilder()).append("Don't know how to interpret type ").append(s).append(" (arg was ").append(obj).append(")").toString());
                }
            }
        }
        catch (ClassCastException classcastexception)
        {
            throw new h((new StringBuilder()).append("Couldn't interpret <").append(obj).append("> as ").append(s).toString());
        }
        return obj;
    }

    public an a(JSONObject jsonobject)
    {
        List list;
        Object obj;
        Class class1;
        Object aobj[];
        int j;
        try
        {
            list = a(jsonobject.getJSONArray("path"), a);
            if (list.size() == 0)
            {
                throw new i("Edit will not be bound to any element in the UI.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new h("Can't create property mutator", jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new h("Can't interpret instructions due to JSONException", jsonobject);
        }
        obj = ((x)list.get(list.size() - 1)).b;
        class1 = Class.forName(((String) (obj)));
        obj = a(class1, jsonobject.getJSONObject("property"));
        jsonobject = jsonobject.getJSONArray("args");
        aobj = new Object[jsonobject.length()];
        j = 0;
_L2:
        if (j >= jsonobject.length())
        {
            break; /* Loop/switch isn't completed */
        }
        JSONArray jsonarray = jsonobject.getJSONArray(j);
        aobj[j] = a(jsonarray.get(0), jsonarray.getString(1));
        j++;
        if (true) goto _L2; else goto _L1
        jsonobject;
        throw new h((new StringBuilder()).append("Can't find class for visit path: ").append(((String) (obj))).toString(), jsonobject);
_L1:
        jsonobject = ((y) (obj)).a(aobj);
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        throw new h((new StringBuilder()).append("Can't update a read-only property ").append(((y) (obj)).a).append(" (add a mutator to make this work)").toString());
        jsonobject = new au(list, jsonobject, ((y) (obj)).c);
        return jsonobject;
    }

    public an a(JSONObject jsonobject, at at)
    {
        String s;
        String s1;
        try
        {
            s = jsonobject.getString("event_name");
            s1 = jsonobject.getString("event_type");
            jsonobject = a(jsonobject.getJSONArray("path"), a);
            if (jsonobject.size() == 0)
            {
                throw new i((new StringBuilder()).append("event '").append(s).append("' will not be bound to any element in the UI.").toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new h("Can't interpret instructions due to JSONException", jsonobject);
        }
        if ("click".equals(s1))
        {
            return new ao(jsonobject, 1, s, at);
        }
        if ("selected".equals(s1))
        {
            return new ao(jsonobject, 4, s, at);
        }
        if ("text_changed".equals(s1))
        {
            return new aq(jsonobject, s, at);
        }
        if ("detected".equals(s1))
        {
            return new av(jsonobject, s, at);
        } else
        {
            throw new h((new StringBuilder()).append("Mixpanel can't track event type \"").append(s1).append("\"").toString());
        }
    }

    List a(JSONArray jsonarray, ax ax1)
    {
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < jsonarray.length(); j++)
        {
            Object obj1 = jsonarray.getJSONObject(j);
            Object obj = com.android.slyce.report.b.c.a(((JSONObject) (obj1)), "prefix");
            String s = com.android.slyce.report.b.c.a(((JSONObject) (obj1)), "view_class");
            int l = ((JSONObject) (obj1)).optInt("index", -1);
            String s1 = com.android.slyce.report.b.c.a(((JSONObject) (obj1)), "contentDescription");
            int i1 = ((JSONObject) (obj1)).optInt("id", -1);
            String s2 = com.android.slyce.report.b.c.a(((JSONObject) (obj1)), "mp_id_name");
            obj1 = com.android.slyce.report.b.c.a(((JSONObject) (obj1)), "tag");
            int k;
            if ("shortest".equals(obj))
            {
                k = 1;
            } else
            if (obj == null)
            {
                k = 0;
            } else
            {
                Log.w("MixpanelAPI.EditProtocol", (new StringBuilder()).append("Unrecognized prefix type \"").append(((String) (obj))).append("\". No views will be matched").toString());
                return c;
            }
            obj = a(i1, s2, ax1);
            if (obj == null)
            {
                return c;
            }
            arraylist.add(new x(k, s, l, ((Integer) (obj)).intValue(), s1, ((String) (obj1))));
        }

        return arraylist;
    }

    public ai b(JSONObject jsonobject)
    {
        int j;
        ArrayList arraylist = new ArrayList();
        Class class1;
        Object obj;
        int k;
        try
        {
            jsonobject = jsonobject.getJSONObject("config").getJSONArray("classes");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new h("Can't read snapshot configuration", jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new h("Can't resolve types for snapshot configuration", jsonobject);
        }
        j = 0;
_L6:
        if (j >= jsonobject.length()) goto _L2; else goto _L1
_L1:
        obj = jsonobject.getJSONObject(j);
        class1 = Class.forName(((JSONObject) (obj)).getString("name"));
        obj = ((JSONObject) (obj)).getJSONArray("properties");
        k = 0;
_L4:
        if (k >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(a(class1, ((JSONArray) (obj)).getJSONObject(k)));
        k++;
        if (true) goto _L4; else goto _L3
_L2:
        jsonobject = new ai(arraylist, a);
        return jsonobject;
_L3:
        j++;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
