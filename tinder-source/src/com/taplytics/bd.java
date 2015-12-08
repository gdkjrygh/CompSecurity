// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            bc, gn, gs

public final class bd
{

    String a;
    String b;
    bc c;
    bc d;
    bc e;
    bc f;
    JSONObject g;
    JSONArray h;
    JSONArray i;
    JSONArray j;
    JSONObject k;
    JSONArray l;
    JSONArray m;
    JSONArray n;
    double o;
    JSONObject p;
    JSONObject q;
    HashMap r;
    private String s;
    private JSONObject t;

    public bd(JSONObject jsonobject)
        throws JSONException
    {
        o = -1D;
        r = new HashMap();
        if (jsonobject != null)
        {
            Object obj = jsonobject.opt("projectInfo");
            if (obj != null && (obj instanceof JSONObject))
            {
                c = new bc((JSONObject)obj);
                obj = c.opt("name");
                if (obj != null && (obj instanceof String))
                {
                    s = (String)obj;
                }
                obj = c.opt("deviceToken");
                if (obj != null && (obj instanceof String))
                {
                    b = (String)obj;
                }
            }
            obj = jsonobject.opt("sid");
            if (obj != null && (obj instanceof String))
            {
                a = (String)obj;
            }
            obj = jsonobject.opt("as");
            if (obj != null && (obj instanceof JSONObject))
            {
                d = new bc((JSONObject)obj);
            }
            obj = jsonobject.opt("codeExp");
            if (obj != null && (obj instanceof JSONObject))
            {
                e = new bc((JSONObject)obj);
            }
            obj = jsonobject.opt("experiments");
            if (obj != null && (obj instanceof JSONArray))
            {
                h = (JSONArray)obj;
            }
            obj = jsonobject.opt("exp");
            if (obj != null && (obj instanceof JSONArray))
            {
                i = (JSONArray)obj;
            }
            obj = jsonobject.opt("var");
            if (obj != null && (obj instanceof JSONArray))
            {
                j = (JSONArray)obj;
            }
            obj = jsonobject.opt("dynamicVars");
            if (obj != null && (obj instanceof JSONObject))
            {
                f = new bc((JSONObject)obj);
            }
            obj = jsonobject.opt("au");
            if (obj != null && (obj instanceof JSONObject))
            {
                k = (JSONObject)obj;
            }
            obj = jsonobject.opt("views");
            if (obj != null && (obj instanceof JSONArray))
            {
                l = (JSONArray)obj;
            }
            obj = jsonobject.opt("images");
            if (obj != null && (obj instanceof JSONObject))
            {
                g = (JSONObject)obj;
                (new gn()).execute(new JSONObject[] {
                    g
                });
            }
            obj = jsonobject.opt("regions");
            if (obj != null && (obj instanceof JSONArray))
            {
                m = (JSONArray)obj;
            }
            obj = jsonobject.opt("eventDelay");
            if (obj != null && (obj instanceof Double))
            {
                o = ((Double)obj).doubleValue();
            }
            obj = jsonobject.opt("pas");
            if (obj != null && (obj instanceof JSONObject))
            {
                q = (JSONObject)obj;
            }
            obj = jsonobject.opt("disabledEvents");
            if (obj != null && (obj instanceof JSONObject))
            {
                JSONObject jsonobject1 = (JSONObject)obj;
                Object obj1;
                String s3;
                for (Iterator iterator = jsonobject1.keys(); iterator.hasNext(); jsonobject1.put(s3, obj1))
                {
                    s3 = (String)iterator.next();
                    HashSet hashset = a(jsonobject1.get(s3));
                    obj1 = hashset;
                    if (hashset == null)
                    {
                        obj1 = JSONObject.NULL;
                    }
                }

                p = jsonobject1;
            }
            jsonobject = ((JSONObject) (jsonobject.opt("activities")));
            if (jsonobject != null && (jsonobject instanceof JSONObject))
            {
                t = (JSONObject)jsonobject;
                jsonobject = t.keys();
                do
                {
                    if (!jsonobject.hasNext())
                    {
                        break;
                    }
                    String s1 = (String)jsonobject.next();
                    if (!r.containsKey(s1) && (t.get(s1) instanceof JSONObject))
                    {
                        String s2 = ((JSONObject)t.get(s1)).optString("_id");
                        r.put(s2, s1);
                    }
                } while (true);
            }
        }
    }

    private static HashSet a(Object obj)
    {
        if (obj != null && (obj instanceof JSONArray)) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((HashSet) (obj));
_L2:
        HashSet hashset;
        JSONArray jsonarray;
        int i1;
        jsonarray = (JSONArray)obj;
        hashset = new HashSet();
        i1 = 0;
_L5:
        obj = hashset;
        if (i1 >= jsonarray.length()) goto _L4; else goto _L3
_L3:
        hashset.add(jsonarray.get(i1));
        i1++;
          goto _L5
        obj;
        gs.c((new StringBuilder("Exception occured while converting JSONArray to HashSet: ")).append(((JSONException) (obj)).getMessage()).toString());
        return hashset;
    }

    public static JSONObject a(JSONObject jsonobject, String s1)
    {
        if (!s1.equals("baseline")) goto _L2; else goto _L1
_L1:
        jsonobject = jsonobject.optJSONObject("baseline");
_L4:
        return jsonobject;
_L2:
        JSONArray jsonarray;
        int i1;
        jsonarray = jsonobject.optJSONArray("variations");
        i1 = 0;
        jsonobject = null;
_L6:
        if (i1 >= jsonarray.length()) goto _L4; else goto _L3
_L3:
        JSONObject jsonobject1;
        boolean flag;
        jsonobject1 = jsonarray.getJSONObject(i1);
        flag = jsonobject1.optString("name").equals(s1);
        jsonobject = jsonobject1;
        if (flag) goto _L4; else goto _L5
_L5:
        i1++;
        jsonobject = jsonobject1;
          goto _L6
        jsonobject;
        return null;
    }

    public final String[] a()
    {
        ArrayList arraylist;
        int i1;
        arraylist = new ArrayList();
        i1 = 0;
_L12:
        if (i1 >= h.length()) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = h.getJSONObject(i1);
        if (!jsonobject.has("distFilters") || jsonobject.optJSONArray("distFilters") == null) goto _L4; else goto _L3
_L3:
        JSONArray jsonarray = jsonobject.optJSONArray("distFilters");
        int j1 = 0;
_L10:
        Object obj;
        if (j1 >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = jsonarray.optJSONObject(j1);
        if (obj == null) goto _L6; else goto _L5
_L5:
        if (!((JSONObject) (obj)).has("type") || !(((JSONObject) (obj)).get("type") instanceof String) || !((JSONObject) (obj)).get("type").equals("osType") || !((JSONObject) (obj)).has("values") || ((JSONObject) (obj)).optJSONArray("values") == null) goto _L6; else goto _L7
_L7:
        obj = ((JSONObject) (obj)).optJSONArray("values");
        int k1 = 0;
_L9:
        if (k1 >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        if ((((JSONArray) (obj)).get(k1) instanceof String) && ((JSONArray) (obj)).get(k1).equals("Android"))
        {
            arraylist.add((new StringBuilder()).append(jsonobject.optString("name")).append(" (").append(jsonobject.optString("status")).append(")").toString());
        }
          goto _L8
_L2:
        String as[];
        try
        {
            as = (String[])arraylist.toArray(new String[arraylist.size()]);
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return as;
_L8:
        k1++;
        if (true) goto _L9; else goto _L6
_L6:
        j1++;
        if (true) goto _L10; else goto _L4
_L4:
        i1++;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final String[] a(String s1)
    {
        JSONArray jsonarray;
        int i1;
        boolean flag;
        flag = false;
        i1 = 0;
        jsonarray = null;
_L9:
        if (i1 >= h.length()) goto _L2; else goto _L1
_L1:
        if (h.getJSONObject(i1).getString("name").equals(s1))
        {
            jsonarray = h.getJSONObject(i1).optJSONArray("variations");
        }
          goto _L3
_L7:
        try
        {
            s1 = new String[jsonarray.length() + 1];
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        i1 = ((flag) ? 1 : 0);
_L5:
        if (i1 >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        s1[i1] = jsonarray.getJSONObject(i1).optString("name");
        i1++;
        if (true) goto _L5; else goto _L4
_L4:
        s1[jsonarray.length()] = "baseline";
        return s1;
_L3:
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (jsonarray != null) goto _L7; else goto _L6
_L6:
        return null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final JSONObject b(String s1)
    {
        int i1 = 0;
        JSONObject jsonobject = null;
        do
        {
label0:
            {
label1:
                {
                    boolean flag;
                    try
                    {
                        if (i1 >= h.length())
                        {
                            break label1;
                        }
                        jsonobject = h.getJSONObject(i1);
                        flag = jsonobject.optString("name").equals(s1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s1)
                    {
                        return null;
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return jsonobject;
            }
            i1++;
        } while (true);
    }
}
