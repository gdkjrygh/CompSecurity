// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.w;

import android.os.Bundle;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class e
{

    public e()
    {
    }

    public static double a(JsonNode jsonnode, double d1)
    {
        if (jsonnode != null && !jsonnode.isNull())
        {
            if (jsonnode.isTextual())
            {
                double d2;
                try
                {
                    d2 = Double.parseDouble(jsonnode.textValue());
                }
                // Misplaced declaration of an exception variable
                catch (JsonNode jsonnode)
                {
                    return d1;
                }
                return d2;
            }
            if (jsonnode.isNumber())
            {
                return jsonnode.doubleValue();
            }
        }
        return d1;
    }

    public static float a(JsonNode jsonnode, float f1)
    {
        if (jsonnode != null && !jsonnode.isNull())
        {
            if (jsonnode.isTextual())
            {
                float f2;
                try
                {
                    f2 = Float.parseFloat(jsonnode.textValue());
                }
                // Misplaced declaration of an exception variable
                catch (JsonNode jsonnode)
                {
                    return f1;
                }
                return f2;
            }
            if (jsonnode.isNumber())
            {
                return jsonnode.numberValue().floatValue();
            }
        }
        return f1;
    }

    public static int a(JsonNode jsonnode, int i)
    {
        if (jsonnode != null && !jsonnode.isNull())
        {
            if (jsonnode.isTextual())
            {
                int j;
                try
                {
                    j = Integer.parseInt(jsonnode.textValue());
                }
                // Misplaced declaration of an exception variable
                catch (JsonNode jsonnode)
                {
                    return i;
                }
                return j;
            }
            if (jsonnode.isNumber())
            {
                return jsonnode.intValue();
            }
        }
        return i;
    }

    public static long a(JsonNode jsonnode, long l)
    {
        if (jsonnode != null && !jsonnode.isNull())
        {
            if (jsonnode.isTextual())
            {
                long l1;
                try
                {
                    l1 = Long.parseLong(jsonnode.textValue());
                }
                // Misplaced declaration of an exception variable
                catch (JsonNode jsonnode)
                {
                    return l;
                }
                return l1;
            }
            if (jsonnode.isNumber())
            {
                return jsonnode.longValue();
            }
        }
        return l;
    }

    public static Bundle a(JSONObject jsonobject)
    {
        Bundle bundle = new Bundle();
        Iterator iterator = jsonobject.keys();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            Object obj = jsonobject.get(s);
            if (obj instanceof String)
            {
                bundle.putString(s, (String)obj);
            } else
            if (obj instanceof Integer)
            {
                bundle.putInt(s, ((Integer)obj).intValue());
            } else
            if (obj instanceof Float)
            {
                bundle.putFloat(s, ((Float)obj).floatValue());
            } else
            if (obj instanceof Double)
            {
                bundle.putDouble(s, ((Double)obj).doubleValue());
            } else
            if (obj instanceof JSONArray)
            {
                obj = (JSONArray)obj;
                if (((JSONArray) (obj)).length() == 0)
                {
                    bundle.putParcelableArrayList(s, hq.a());
                } else
                if (((JSONArray) (obj)).get(0) instanceof JSONObject)
                {
                    bundle.putParcelableArrayList(s, a(((JSONArray) (obj))));
                } else
                if (((JSONArray) (obj)).get(0) instanceof String)
                {
                    bundle.putStringArrayList(s, b(((JSONArray) (obj))));
                }
            } else
            if (obj instanceof JSONObject)
            {
                bundle.putBundle(s, a((JSONObject)obj));
            }
        } while (true);
        return bundle;
    }

    public static String a(JsonNode jsonnode, String s)
    {
        if (jsonnode != null && !jsonnode.isNull())
        {
            if (jsonnode.isTextual())
            {
                return jsonnode.textValue();
            }
            if (jsonnode.isNumber())
            {
                return jsonnode.numberValue().toString();
            }
        }
        return s;
    }

    public static ArrayList a(JSONArray jsonarray)
    {
        ArrayList arraylist = hq.a();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            arraylist.add(a(jsonarray.getJSONObject(i)));
        }

        return arraylist;
    }

    public static boolean a(JsonNode jsonnode)
    {
        return jsonnode != null && !jsonnode.isNull();
    }

    public static boolean a(JsonNode jsonnode, boolean flag)
    {
        boolean flag1;
        boolean flag2;
        flag1 = true;
        flag2 = false;
        break MISSING_BLOCK_LABEL_4;
        while (!jsonnode.isNumber()) 
        {
            do
            {
                return flag;
            } while (jsonnode == null || jsonnode.isNull());
label0:
            {
                if (jsonnode.isBoolean())
                {
                    return jsonnode.booleanValue();
                }
                if (!jsonnode.isTextual())
                {
                    continue;
                }
                jsonnode = jsonnode.textValue();
                if (!"on".equals(jsonnode) && !"1".equals(jsonnode))
                {
                    flag = flag2;
                    if (!"true".equals(jsonnode))
                    {
                        break label0;
                    }
                }
                flag = true;
            }
            return flag;
        }
        if (jsonnode.intValue() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public static String b(JsonNode jsonnode)
    {
        return a(jsonnode, ((String) (null)));
    }

    public static ArrayList b(JSONArray jsonarray)
    {
        ArrayList arraylist = hq.a();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            arraylist.add(jsonarray.getString(i));
        }

        return arraylist;
    }

    public static long c(JsonNode jsonnode)
    {
        return a(jsonnode, 0L);
    }

    public static int d(JsonNode jsonnode)
    {
        return a(jsonnode, 0);
    }

    public static double e(JsonNode jsonnode)
    {
        return a(jsonnode, 0.0D);
    }

    public static float f(JsonNode jsonnode)
    {
        return a(jsonnode, 0.0F);
    }

    public static boolean g(JsonNode jsonnode)
    {
        return a(jsonnode, false);
    }
}
