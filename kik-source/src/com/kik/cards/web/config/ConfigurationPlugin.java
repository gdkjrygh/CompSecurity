// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.config;

import com.kik.cards.web.plugin.d;
import com.kik.cards.web.plugin.j;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kik.a.f.k;
import kik.android.d.b;
import kik.android.util.ar;
import org.c.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.config:
//            a

public class ConfigurationPlugin extends d
{

    private static final org.c.b a = c.a("CardsWebConfiguration");
    private a b;
    private ar d;

    public ConfigurationPlugin(a a1, ar ar)
    {
        super("Configuration");
        b = a1;
        d = ar;
    }

    private static Object a(int i, Object obj)
    {
        if (i == kik.android.d.b.a.a && (obj instanceof String))
        {
            return (String)obj;
        }
        if (i == kik.android.d.b.a.c && (obj instanceof Long))
        {
            return (Long)obj;
        }
        if (i == kik.android.d.b.a.b && (obj instanceof Boolean))
        {
            return (Boolean)obj;
        } else
        {
            return null;
        }
    }

    private static JSONObject a(b b1)
    {
        JSONObject jsonobject = new JSONObject();
        int i;
        jsonobject.put("name", b1.d());
        i = b1.a();
        if (i != kik.android.d.b.a.a) goto _L2; else goto _L1
_L1:
        Object obj = "string";
_L9:
        jsonobject.put("type", obj);
        if (b1.f() == null) goto _L4; else goto _L3
_L3:
        obj = new JSONArray();
        Object obj1;
        for (Iterator iterator = b1.f().iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(a(b1.a(), obj1)))
        {
            obj1 = iterator.next();
        }

          goto _L5
        b1;
        a.b((new StringBuilder("Error converting Configuration to JSONObject: ")).append(b1.getMessage()).toString());
        return jsonobject;
_L2:
        if (i != kik.android.d.b.a.d && i != kik.android.d.b.a.c) goto _L7; else goto _L6
_L7:
        if (i == kik.android.d.b.a.b)
        {
            obj = "boolean";
        } else
        {
            obj = "unknown";
        }
        continue; /* Loop/switch isn't completed */
_L5:
        jsonobject.put("possibleValues", obj);
_L4:
        jsonobject.put("defaultValue", a(b1.a(), b1.e()));
        jsonobject.put("value", a(b1.a(), b1.b()));
        return jsonobject;
_L6:
        obj = "number";
        if (true) goto _L9; else goto _L8
_L8:
    }

    public j getAvailableServerProfiles(JSONObject jsonobject)
    {
        Object obj;
        obj = b.b().b();
        jsonobject = new JSONObject();
        obj = ((Hashtable) (obj)).entrySet().iterator();
_L1:
        java.util.Map.Entry entry;
        JSONObject jsonobject1;
        Method amethod[];
        int l;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_243;
        }
        entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        jsonobject1 = new JSONObject();
        amethod = ((k)entry.getValue()).getClass().getMethods();
        l = amethod.length;
        for (int i = 0; i < l; i++)
        {
            Method method = amethod[i];
            try
            {
                if (method.isAccessible() && method.getParameterTypes().length == 0)
                {
                    jsonobject1.put(method.getName(), method.invoke(entry.getValue(), new Object[0]));
                }
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                a.b((new StringBuilder("Error generating getAvailableServerProfiles result: ")).append(jsonobject.getMessage()).toString());
                return new j(500);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                a.b((new StringBuilder("Exception with method reflection: ")).append(jsonobject.getMessage()).toString());
                return new j(500);
            }
            break MISSING_BLOCK_LABEL_252;
        }

        jsonobject.put((String)entry.getKey(), jsonobject1);
          goto _L1
        return new j(jsonobject);
    }

    public j getCurrentServerProfile(JSONObject jsonobject)
    {
        jsonobject = b.b().a(d);
        JSONObject jsonobject1 = new JSONObject();
        try
        {
            jsonobject1.put("name", jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            a.b((new StringBuilder("Error generating getCurrentServerProfile result: ")).append(jsonobject.getMessage()).toString());
            return new j(500);
        }
        return new j(jsonobject1);
    }

    public j getPreference(JSONObject jsonobject)
    {
        jsonobject = jsonobject.optString("name");
        if (jsonobject.length() == 0)
        {
            return new j(400);
        }
        jsonobject = b.b().a(jsonobject);
        if (jsonobject == null)
        {
            return new j(404);
        }
        JSONObject jsonobject1 = new JSONObject();
        try
        {
            jsonobject1.put("value", a(jsonobject.a(), jsonobject.b()));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            a.b((new StringBuilder("Error generating getPreference result: ")).append(jsonobject.getMessage()).toString());
            return new j(500);
        }
        return new j(jsonobject1);
    }

    public j getPreferenceList(JSONObject jsonobject)
    {
        Object obj = b.b().a();
        jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        for (obj = ((Collection) (obj)).iterator(); ((Iterator) (obj)).hasNext(); jsonarray.put(a((b)((Iterator) (obj)).next()))) { }
        try
        {
            jsonobject.put("preferences", jsonarray);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            a.b((new StringBuilder("Error generating getPreferenceList result: ")).append(jsonobject.getMessage()).toString());
            return new j(500);
        }
        return new j(jsonobject);
    }

    public j setCurrentServerProfile(JSONObject jsonobject)
    {
        jsonobject = jsonobject.optString("name");
        if (jsonobject.length() == 0)
        {
            return new j(400);
        }
        if (b.b().b(jsonobject))
        {
            return new j();
        } else
        {
            return new j(500);
        }
    }

    public j setPreference(JSONObject jsonobject)
    {
        Object obj = jsonobject.optString("name");
        if (((String) (obj)).length() == 0)
        {
            return new j(400);
        }
        jsonobject = jsonobject.optString("value");
        if (jsonobject.length() == 0)
        {
            return new j(400);
        }
        obj = b.b().a(((String) (obj)));
        if (obj == null)
        {
            return new j(404);
        }
        int i = ((b) (obj)).a();
        if (i != kik.android.d.b.a.a)
        {
            if (i == kik.android.d.b.a.c)
            {
                jsonobject = Long.valueOf(Long.parseLong(jsonobject));
            } else
            if (i == kik.android.d.b.a.b)
            {
                jsonobject = Boolean.valueOf(Boolean.parseBoolean(jsonobject));
            } else
            {
                jsonobject = null;
            }
        }
        if (((b) (obj)).a(jsonobject))
        {
            return new j();
        } else
        {
            return new j(400);
        }
    }

}
