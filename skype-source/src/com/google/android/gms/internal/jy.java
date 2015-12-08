// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.ak;
import com.google.android.gms.tagmanager.cl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            f

final class jy
{

    private static h.a a(int i, JSONArray jsonarray, h.a aa[], Set set)
        throws ke.g, JSONException
    {
        boolean flag = false;
        int j = 0;
        if (set.contains(Integer.valueOf(i)))
        {
            b((new StringBuilder("Value cycle detected. Current value reference: ")).append(i).append(".  Previous value references: ").append(set).append(".").toString());
        }
        Object obj = a(jsonarray, i, "values");
        if (aa[i] != null)
        {
            return aa[i];
        }
        set.add(Integer.valueOf(i));
        h.a a1 = new h.a();
        if (obj instanceof JSONArray)
        {
            obj = (JSONArray)obj;
            a1.a = 2;
            a1.l = true;
            for (a1.c = new h.a[((JSONArray) (obj)).length()]; j < a1.c.length; j++)
            {
                a1.c[j] = a(((JSONArray) (obj)).getInt(j), jsonarray, aa, set);
            }

        } else
        if (obj instanceof JSONObject)
        {
            obj = (JSONObject)obj;
            JSONArray jsonarray1 = ((JSONObject) (obj)).optJSONArray("escaping");
            if (jsonarray1 != null)
            {
                a1.k = new int[jsonarray1.length()];
                for (int k = 0; k < a1.k.length; k++)
                {
                    a1.k[k] = jsonarray1.getInt(k);
                }

            }
            if (((JSONObject) (obj)).has("function_id"))
            {
                a1.a = 5;
                a1.g = ((JSONObject) (obj)).getString("function_id");
            } else
            if (((JSONObject) (obj)).has("macro_reference"))
            {
                a1.a = 4;
                a1.l = true;
                a1.f = cl.a(a(((JSONObject) (obj)).getInt("macro_reference"), jsonarray, aa, set));
            } else
            if (((JSONObject) (obj)).has("template_token"))
            {
                a1.a = 7;
                a1.l = true;
                obj = ((JSONObject) (obj)).getJSONArray("template_token");
                a1.j = new h.a[((JSONArray) (obj)).length()];
                int l = ((flag) ? 1 : 0);
                while (l < a1.j.length) 
                {
                    a1.j[l] = a(((JSONArray) (obj)).getInt(l), jsonarray, aa, set);
                    l++;
                }
            } else
            {
                a1.a = 3;
                a1.l = true;
                int i1 = ((JSONObject) (obj)).length();
                a1.d = new h.a[i1];
                a1.e = new h.a[i1];
                Iterator iterator = ((JSONObject) (obj)).keys();
                i1 = 0;
                while (iterator.hasNext()) 
                {
                    String s = (String)iterator.next();
                    a1.d[i1] = a((new Integer(s)).intValue(), jsonarray, aa, set);
                    a1.e[i1] = a(((JSONObject) (obj)).getInt(s), jsonarray, aa, set);
                    i1++;
                }
            }
        } else
        if (obj instanceof String)
        {
            a1.b = (String)obj;
            a1.a = 1;
        } else
        if (obj instanceof Boolean)
        {
            a1.i = ((Boolean)obj).booleanValue();
            a1.a = 8;
        } else
        if (obj instanceof Integer)
        {
            a1.h = ((Integer)obj).intValue();
            a1.a = 6;
        } else
        {
            b((new StringBuilder("Invalid value type: ")).append(obj).toString());
        }
        aa[i] = a1;
        set.remove(Integer.valueOf(i));
        return a1;
    }

    private static ke.a a(JSONObject jsonobject, JSONArray jsonarray, JSONArray jsonarray1, h.a aa[])
        throws ke.g, JSONException
    {
        ke.b b1 = new ke.b((byte)0);
        jsonobject = jsonobject.getJSONArray("property");
        int i = 0;
        while (i < jsonobject.length()) 
        {
            Object obj = (JSONObject)a(jsonarray, jsonobject.getInt(i), "properties");
            String s = (String)a(jsonarray1, ((JSONObject) (obj)).getInt("key"), "key");
            int j = ((JSONObject) (obj)).getInt("value");
            if (j < 0 || j >= aa.length)
            {
                b((new StringBuilder("Index out of bounds detected: ")).append(j).append(" in ").append("value").toString());
            }
            obj = (h.a)aa[j];
            if (com.google.android.gms.internal.f.cl.toString().equals(s))
            {
                b1.a(((h.a) (obj)));
            } else
            {
                b1.a(s, ((h.a) (obj)));
            }
            i++;
        }
        return b1.a();
    }

    static ke.c a(String s)
        throws JSONException, ke.g
    {
        s = new JSONObject(s);
        Object obj = s.get("resource");
        h.a aa[];
        List list;
        List list1;
        Object obj1;
        Object obj2;
        if (obj instanceof JSONObject)
        {
            obj1 = (JSONObject)obj;
            obj = new ke.d((byte)0);
            aa = a(((JSONObject) (obj1)));
            obj2 = ((JSONObject) (obj1)).getJSONArray("properties");
            JSONArray jsonarray = ((JSONObject) (obj1)).getJSONArray("key");
            list = a(((JSONObject) (obj1)).getJSONArray("tags"), ((JSONArray) (obj2)), jsonarray, aa);
            list1 = a(((JSONObject) (obj1)).getJSONArray("predicates"), ((JSONArray) (obj2)), jsonarray, aa);
            obj2 = a(((JSONObject) (obj1)).getJSONArray("macros"), ((JSONArray) (obj2)), jsonarray, aa);
            for (Iterator iterator = ((List) (obj2)).iterator(); iterator.hasNext(); ((ke.d) (obj)).a((ke.a)iterator.next())) { }
        } else
        {
            throw new ke.g("Resource map not found");
        }
        obj1 = ((JSONObject) (obj1)).getJSONArray("rules");
        for (int i = 0; i < ((JSONArray) (obj1)).length(); i++)
        {
            ((ke.d) (obj)).a(a(((JSONArray) (obj1)).getJSONObject(i), list, ((List) (obj2)), list1, aa));
        }

        ((ke.d) (obj)).a("1");
        ((ke.d) (obj)).a();
        s.optJSONArray("runtime");
        return ((ke.d) (obj)).b();
    }

    private static ke.e a(JSONObject jsonobject, List list, List list1, List list2, h.a aa[])
        throws JSONException
    {
        ke.f f1 = new ke.f((byte)0);
        JSONArray jsonarray = jsonobject.optJSONArray("positive_predicate");
        JSONArray jsonarray1 = jsonobject.optJSONArray("negative_predicate");
        JSONArray jsonarray2 = jsonobject.optJSONArray("add_tag");
        JSONArray jsonarray3 = jsonobject.optJSONArray("remove_tag");
        JSONArray jsonarray4 = jsonobject.optJSONArray("add_tag_rule_name");
        JSONArray jsonarray5 = jsonobject.optJSONArray("remove_tag_rule_name");
        JSONArray jsonarray6 = jsonobject.optJSONArray("add_macro");
        JSONArray jsonarray7 = jsonobject.optJSONArray("remove_macro");
        JSONArray jsonarray8 = jsonobject.optJSONArray("add_macro_rule_name");
        jsonobject = jsonobject.optJSONArray("remove_macro_rule_name");
        if (jsonarray != null)
        {
            for (int i = 0; i < jsonarray.length(); i++)
            {
                f1.a((ke.a)list2.get(jsonarray.getInt(i)));
            }

        }
        if (jsonarray1 != null)
        {
            for (int j = 0; j < jsonarray1.length(); j++)
            {
                f1.b((ke.a)list2.get(jsonarray1.getInt(j)));
            }

        }
        if (jsonarray2 != null)
        {
            for (int k = 0; k < jsonarray2.length(); k++)
            {
                f1.c((ke.a)list.get(jsonarray2.getInt(k)));
            }

        }
        if (jsonarray3 != null)
        {
            for (int l = 0; l < jsonarray3.length(); l++)
            {
                f1.d((ke.a)list.get(jsonarray3.getInt(l)));
            }

        }
        if (jsonarray4 != null)
        {
            for (int i1 = 0; i1 < jsonarray4.length(); i1++)
            {
                f1.a(aa[jsonarray4.getInt(i1)].b);
            }

        }
        if (jsonarray5 != null)
        {
            for (int j1 = 0; j1 < jsonarray5.length(); j1++)
            {
                f1.b(aa[jsonarray5.getInt(j1)].b);
            }

        }
        if (jsonarray6 != null)
        {
            for (int k1 = 0; k1 < jsonarray6.length(); k1++)
            {
                f1.e((ke.a)list1.get(jsonarray6.getInt(k1)));
            }

        }
        if (jsonarray7 != null)
        {
            for (int l1 = 0; l1 < jsonarray7.length(); l1++)
            {
                f1.f((ke.a)list1.get(jsonarray7.getInt(l1)));
            }

        }
        if (jsonarray8 != null)
        {
            for (int i2 = 0; i2 < jsonarray8.length(); i2++)
            {
                f1.c(aa[jsonarray8.getInt(i2)].b);
            }

        }
        if (jsonobject != null)
        {
            for (int j2 = 0; j2 < jsonobject.length(); j2++)
            {
                f1.d(aa[jsonobject.getInt(j2)].b);
            }

        }
        return f1.a();
    }

    private static Object a(JSONArray jsonarray, int i, String s)
        throws ke.g
    {
        if (i < 0 || i >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_21;
        }
        jsonarray = ((JSONArray) (jsonarray.get(i)));
        return jsonarray;
        jsonarray;
        b((new StringBuilder("Index out of bounds detected: ")).append(i).append(" in ").append(s).toString());
        return null;
    }

    private static List a(JSONArray jsonarray, JSONArray jsonarray1, JSONArray jsonarray2, h.a aa[])
        throws JSONException, ke.g
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            arraylist.add(a(jsonarray.getJSONObject(i), jsonarray1, jsonarray2, aa));
        }

        return arraylist;
    }

    private static h.a[] a(JSONObject jsonobject)
        throws JSONException, ke.g
    {
        jsonobject = ((JSONObject) (jsonobject.opt("values")));
        h.a aa[];
        if (jsonobject instanceof JSONArray)
        {
            jsonobject = (JSONArray)jsonobject;
            aa = new h.a[jsonobject.length()];
            for (int i = 0; i < aa.length; i++)
            {
                a(i, ((JSONArray) (jsonobject)), aa, ((Set) (new HashSet(0))));
            }

        } else
        {
            throw new ke.g("Missing Values list");
        }
        return aa;
    }

    private static void b(String s)
        throws ke.g
    {
        ak.a(s);
        throw new ke.g(s);
    }
}
