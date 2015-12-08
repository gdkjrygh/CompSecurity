// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.d;

import android.text.TextUtils;
import com.fitbit.data.domain.Measurable;
import com.fitbit.util.format.e;
import com.fitbit.util.w;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.d:
//            b

public class com.fitbit.d.a
{
    private static interface a
    {

        public abstract Date a(String s);
    }


    public com.fitbit.d.a()
    {
    }

    public static double a(JSONObject jsonobject, String s, double d1)
        throws JSONException
    {
        if (jsonobject.has(s))
        {
            d1 = jsonobject.getDouble(s);
        }
        return d1;
    }

    public static int a(JSONObject jsonobject, String s, int j)
        throws JSONException
    {
        int k = j;
        if (jsonobject.has(s))
        {
            k = j;
            if (!jsonobject.get(s).equals(""))
            {
                k = jsonobject.getInt(s);
            }
        }
        return k;
    }

    public static long a(JSONObject jsonobject, String s, long l)
        throws JSONException
    {
        long l1 = l;
        if (jsonobject.has(s))
        {
            l1 = l;
            if (!jsonobject.get(s).equals(""))
            {
                l1 = jsonobject.getLong(s);
            }
        }
        return l1;
    }

    public static Measurable a(JSONObject jsonobject, String s, Enum enum, Class class1)
        throws JSONException
    {
        if (jsonobject.has(s))
        {
            double d1 = jsonobject.getDouble(s);
            try
            {
                jsonobject = (Measurable)class1.newInstance();
                jsonobject.a(d1);
                jsonobject.b(enum);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new RuntimeException(jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new RuntimeException(jsonobject);
            }
            return jsonobject;
        } else
        {
            return null;
        }
    }

    public static Boolean a(JSONObject jsonobject, String s, boolean flag)
        throws JSONException
    {
        if (jsonobject.has(s))
        {
            return Boolean.valueOf(jsonobject.getBoolean(s));
        } else
        {
            return Boolean.valueOf(flag);
        }
    }

    public static Enum a(JSONObject jsonobject, String s, Class class1)
        throws JSONException
    {
        if (!jsonobject.has(s))
        {
            return null;
        } else
        {
            return w.a(jsonobject.getString(s), class1);
        }
    }

    public static Enum a(JSONObject jsonobject, String s, Class class1, Enum enum)
    {
        Enum enum1;
        if (!jsonobject.has(s))
        {
            enum1 = null;
        } else
        {
            enum1 = enum;
            if (!jsonobject.isNull(s))
            {
                jsonobject = jsonobject.optString(s);
                try
                {
                    jsonobject = w.a(Integer.parseInt(jsonobject), class1);
                }
                // Misplaced declaration of an exception variable
                catch (JSONObject jsonobject)
                {
                    com.fitbit.e.a.d(com/fitbit/d/a.getSimpleName(), String.format("Could not find mapping for %s in class %s, defaulting to %s", new Object[] {
                        s, class1, enum.name()
                    }), new Object[0]);
                    return enum;
                }
                return jsonobject;
            }
        }
        return enum1;
    }

    public static String a(JSONObject jsonobject, String s)
        throws JSONException
    {
        if (jsonobject.has(s))
        {
            return jsonobject.getString(s);
        } else
        {
            return null;
        }
    }

    public static Date a(JSONObject jsonobject, String s, a a1)
        throws JSONException
    {
        if (jsonobject.has(s))
        {
            jsonobject = jsonobject.getString(s);
            if (jsonobject != null && !"".equals(jsonobject))
            {
                return a1.a(jsonobject);
            }
        }
        return null;
    }

    public static Date a(JSONObject jsonobject, String s, TimeZone timezone)
        throws JSONException
    {
        return a(jsonobject, s, new a(timezone) {

            final TimeZone a;

            public Date a(String s1)
            {
                return com.fitbit.util.format.e.b(s1, a);
            }

            
            {
                a = timezone;
                super();
            }
        });
    }

    public static Map a(String s, Map map)
    {
        Map map1 = map;
        if (s != null)
        {
            try
            {
                map1 = b(new JSONObject(s));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return map;
            }
        }
        return map1;
    }

    public static JSONObject a(Map map)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("nutritionalValues", new JSONObject(map));
        return jsonobject;
    }

    public static JSONObject a(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject.has("entity"))
        {
            return jsonobject.getJSONObject("entity");
        } else
        {
            return null;
        }
    }

    public static void a(JSONObject jsonobject, String s, Measurable measurable, Enum enum)
        throws JSONException
    {
        if (measurable != null)
        {
            jsonobject.put(s, measurable.a(enum).b());
        }
    }

    public static void a(JSONObject jsonobject, String s, Object obj)
        throws JSONException
    {
        if (obj == null)
        {
            return;
        } else
        {
            jsonobject.put(s, obj);
            return;
        }
    }

    public static void a(JSONObject jsonobject, String s, String s1)
        throws JSONException
    {
        jsonobject.put(s, s1);
    }

    public static void a(JSONObject jsonobject, String s, Date date)
        throws JSONException
    {
        a(jsonobject, s, com.fitbit.util.format.e.c(date));
    }

    public static void a(JSONObject jsonobject, String s, Date date, TimeZone timezone)
        throws JSONException
    {
        a(jsonobject, s, com.fitbit.util.format.e.b(date, timezone));
    }

    public static void a(JSONObject jsonobject, String s, List list)
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        for (list = list.iterator(); list.hasNext(); jsonarray.put(((b)list.next()).toPublicApiJsonObject())) { }
        jsonobject.put(s, jsonarray);
    }

    public static void a(JSONObject jsonobject, String s, UUID uuid)
        throws JSONException
    {
        if (uuid != null)
        {
            jsonobject.put(s, uuid);
        }
    }

    public static void a(JSONObject jsonobject, Map map)
        throws JSONException
    {
        jsonobject.put("nutritionalValues", new JSONObject(map));
    }

    public static void a(JSONObject jsonobject, JSONObject jsonobject1)
        throws JSONException
    {
        jsonobject.put("entity", jsonobject1);
    }

    public static long b(JSONObject jsonobject, String s, int j)
        throws JSONException
    {
        if (jsonobject.has(s) && !jsonobject.get(s).equals(""))
        {
            return jsonobject.getLong(s);
        } else
        {
            return (long)j;
        }
    }

    public static Date b(JSONObject jsonobject, String s, TimeZone timezone)
        throws JSONException
    {
        return a(jsonobject, s, new a(timezone) {

            final TimeZone a;

            public Date a(String s1)
            {
                return com.fitbit.util.format.e.a(s1, a);
            }

            
            {
                a = timezone;
                super();
            }
        });
    }

    public static List b(JSONObject jsonobject, String s, Class class1)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        if (jsonobject.has(s))
        {
            jsonobject = jsonobject.getJSONArray(s);
            int j = 0;
            do
            {
                try
                {
                    if (j >= jsonobject.length())
                    {
                        break;
                    }
                    s = jsonobject.getJSONObject(j);
                    b b1 = (b)class1.newInstance();
                    b1.initFromPublicApiJsonObject(s);
                    arraylist.add(b1);
                }
                // Misplaced declaration of an exception variable
                catch (JSONObject jsonobject)
                {
                    throw new RuntimeException(jsonobject);
                }
                // Misplaced declaration of an exception variable
                catch (JSONObject jsonobject)
                {
                    throw new RuntimeException(jsonobject);
                }
                j++;
            } while (true);
        }
        return arraylist;
    }

    public static Map b(JSONObject jsonobject)
        throws JSONException
    {
        HashMap hashmap = new HashMap();
        jsonobject = jsonobject.getJSONObject("nutritionalValues");
        JSONArray jsonarray = jsonobject.names();
        if (jsonarray != null)
        {
            for (int j = 0; j < jsonarray.length(); j++)
            {
                hashmap.put(jsonarray.getString(j), Double.valueOf(jsonobject.getDouble(jsonarray.getString(j))));
            }

        }
        return hashmap;
    }

    public static UUID b(JSONObject jsonobject, String s)
        throws JSONException
    {
        if (jsonobject.has(s))
        {
            return UUID.fromString(jsonobject.getString(s));
        } else
        {
            return null;
        }
    }

    public static void b(JSONObject jsonobject, String s, Date date)
        throws JSONException
    {
        a(jsonobject, s, com.fitbit.util.format.e.e(date));
    }

    public static Date c(JSONObject jsonobject, String s)
        throws JSONException
    {
        return a(jsonobject, s, new a() {

            public Date a(String s1)
            {
                return com.fitbit.util.format.e.d(s1);
            }

        });
    }

    public static Date d(JSONObject jsonobject, String s)
        throws JSONException
    {
        return a(jsonobject, s, new a() {

            public Date a(String s1)
            {
                return com.fitbit.util.format.e.e(s1);
            }

        });
    }

    public static Date e(JSONObject jsonobject, String s)
        throws JSONException
    {
        return a(jsonobject, s, new a() {

            public Date a(String s1)
            {
                return com.fitbit.util.format.e.i(s1);
            }

        });
    }

    public static Date f(JSONObject jsonobject, String s)
        throws JSONException
    {
        return a(jsonobject, s, new a() {

            public Date a(String s1)
            {
                return com.fitbit.util.format.e.h(s1);
            }

        });
    }

    public static int g(JSONObject jsonobject, String s)
        throws JSONException
    {
        int j;
        boolean flag = false;
        j = ((flag) ? 1 : 0);
        if (!jsonobject.has(s))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        jsonobject = jsonobject.getString(s);
        j = ((flag) ? 1 : 0);
        if (TextUtils.isEmpty(jsonobject))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        s = new int[3];
        s;
        s[0] = 0;
        s[1] = 0;
        s[2] = 0;
        String as[] = jsonobject.split(":");
        j = 0;
_L2:
        if (j >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        s[j] = Integer.valueOf(as[j]).intValue();
        j++;
        if (true) goto _L2; else goto _L1
        NumberFormatException numberformatexception;
        numberformatexception;
        com.fitbit.e.a.a("FBJsonHelper", "parse time offset of %s", numberformatexception, new Object[] {
            jsonobject
        });
_L1:
        j = s[0] * 3600 + s[1] * 60 + s[2];
        return j;
    }

    public static JSONObject h(JSONObject jsonobject, String s)
        throws JSONException
    {
        if (jsonobject.has(s) && !jsonobject.get(s).equals(""))
        {
            return jsonobject.getJSONObject(s);
        } else
        {
            return null;
        }
    }

    public static JSONArray i(JSONObject jsonobject, String s)
        throws JSONException
    {
        if (jsonobject.has(s) && !jsonobject.get(s).equals(""))
        {
            return jsonobject.getJSONArray(s);
        } else
        {
            return null;
        }
    }
}
