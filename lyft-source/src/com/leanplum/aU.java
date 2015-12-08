// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.Log;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.leanplum:
//            Var, g, Leanplum, FileManager, 
//            a, c, ag, aV, 
//            Util, ActionContext, k, T

final class aU
{

    static final Map a = new HashMap();
    private static Map b = new ConcurrentHashMap();
    private static Map c = new HashMap();
    private static Map d = new HashMap();
    private static Map e = new HashMap();
    private static Map f = new HashMap();
    private static Map g = new HashMap();
    private static Map h = new HashMap();
    private static Map i;
    private static Map j;
    private static Map k;
    private static Map l;
    private static List m;
    private static aV n;
    private static boolean o = false;
    private static Map p;
    private static Object q;
    private static boolean r;
    private static int s;
    private static Map t;
    private static final Pattern u = Pattern.compile("(?:[^\\.\\[.(\\\\]+|\\\\.)+");

    static Object a(Object obj, Object obj1)
    {
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        return obj;
_L2:
        Map map;
        Object obj2;
        Map map1;
        Object obj3;
        Iterator iterator;
        int i1;
        if ((obj1 instanceof Number) || (obj1 instanceof Boolean) || (obj1 instanceof String) || (obj1 instanceof Character) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String) || (obj instanceof Character))
        {
            return obj1;
        }
        if (obj1 instanceof Map)
        {
            obj2 = ((Map)obj1).keySet();
        } else
        {
            obj2 = (Iterable)obj1;
        }
        if (obj instanceof Map)
        {
            obj3 = ((Map)obj).keySet();
        } else
        {
            obj3 = (Iterable)obj;
        }
        if (obj1 instanceof Map)
        {
            map = (Map)obj1;
        } else
        {
            map = null;
        }
        if (obj instanceof Map)
        {
            map1 = (Map)obj;
        } else
        {
            map1 = null;
        }
        if (obj != null || !(obj1 instanceof Map) || ((Map)obj1).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_609;
        }
        iterator = ((Iterable) (obj2)).iterator();
_L6:
        if (!iterator.hasNext())
        {
            i1 = 1;
        } else
        {
            obj4 = iterator.next();
            if (!(obj4 instanceof String))
            {
                i1 = 0;
            } else
            {
label0:
                {
                    obj4 = (String)obj4;
                    if (((String) (obj4)).length() >= 3 && ((String) (obj4)).charAt(0) == '[' && ((String) (obj4)).charAt(((String) (obj4)).length() - 1) == ']')
                    {
                        break label0;
                    }
                    i1 = 0;
                }
            }
        }
_L7:
        Object obj4;
        for (; !(obj instanceof List) && i1 == 0; i1 = 0)
        {
            break MISSING_BLOCK_LABEL_457;
        }

        obj1 = new ArrayList();
        for (obj = ((Iterable) (obj3)).iterator(); ((Iterator) (obj)).hasNext(); ((ArrayList) (obj1)).add(((Iterator) (obj)).next()))
        {
            break MISSING_BLOCK_LABEL_434;
        }

        obj2 = ((Iterable) (obj2)).iterator();
_L4:
        obj = obj1;
        if (!((Iterator) (obj2)).hasNext()) goto _L1; else goto _L3
_L3:
        obj = (String)((Iterator) (obj2)).next();
        i1 = Integer.parseInt(((String) (obj)).substring(1, ((String) (obj)).length() - 1));
        obj = map.get(obj);
        for (; i1 >= ((ArrayList) (obj1)).size(); ((ArrayList) (obj1)).add(null))
        {
            break MISSING_BLOCK_LABEL_448;
        }

        ((ArrayList) (obj1)).set(i1, a(((ArrayList) (obj1)).get(i1), obj));
          goto _L4
        obj4 = ((String) (obj4)).substring(1, ((String) (obj4)).length() - 1);
        if ((new StringBuilder()).append(Integer.getInteger(((String) (obj4)))).toString().equals(obj4)) goto _L6; else goto _L5
_L5:
        i1 = 0;
          goto _L7
        if (!(obj instanceof Map) && !(obj1 instanceof Map))
        {
            break MISSING_BLOCK_LABEL_607;
        }
        obj1 = new HashMap();
        if (obj3 == null) goto _L9; else goto _L8
_L8:
        obj = ((Iterable) (obj3)).iterator();
_L12:
        if (((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_564;
        }
_L9:
        obj2 = ((Iterable) (obj2)).iterator();
_L11:
        obj = obj1;
        if (!((Iterator) (obj2)).hasNext()) goto _L1; else goto _L10
_L10:
        obj3 = ((Iterator) (obj2)).next();
        if (map1 != null)
        {
            obj = map1.get(obj3);
        } else
        {
            obj = null;
        }
        ((HashMap) (obj1)).put(obj3, a(obj, map.get(obj3)));
          goto _L11
        obj3 = ((Iterator) (obj)).next();
        if (map.get(obj3) == null)
        {
            ((HashMap) (obj1)).put(obj3, map1.get(obj3));
        }
          goto _L12
        return null;
    }

    private static Object a(Object obj, Object obj1, boolean flag)
    {
        Object obj2 = null;
        if (obj != null) goto _L2; else goto _L1
_L1:
        return obj2;
_L2:
        if (!(obj instanceof Map))
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj3 = ((Map)obj).get(obj1);
        obj2 = obj3;
        if (flag)
        {
            obj2 = obj3;
            if (obj3 == null)
            {
                obj2 = obj3;
                if (obj1 instanceof String)
                {
                    obj2 = new HashMap();
                    ((Map)obj).put((String)obj1, obj2);
                    return obj2;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
        if (!(obj instanceof List)) goto _L1; else goto _L3
_L3:
        Object obj4 = ((List)obj).get(((Integer)obj1).intValue());
        obj2 = obj4;
        if (flag)
        {
            obj2 = obj4;
            if (obj4 == null)
            {
                obj2 = obj4;
                if (obj1 instanceof String)
                {
                    HashMap hashmap = new HashMap();
                    ((List)obj).set(((Integer)obj1).intValue(), hashmap);
                    return hashmap;
                }
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public static Object a(Object aobj[])
    {
        Object obj;
        if (q != null)
        {
            obj = q;
        } else
        {
            obj = a;
        }
        return a(aobj, obj);
    }

    public static Object a(Object aobj[], Object obj)
    {
        int j1 = aobj.length;
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                return obj;
            }
            obj = a(obj, aobj[i1], false);
            i1++;
        } while (true);
    }

    public static String a(Object obj)
    {
        String s1 = null;
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof Character) || (obj instanceof Byte) || (obj instanceof BigInteger))
        {
            s1 = "integer";
        } else
        {
            if ((obj instanceof Float) || (obj instanceof Double) || (obj instanceof BigDecimal))
            {
                return "float";
            }
            if (obj instanceof String)
            {
                return "string";
            }
            if ((obj instanceof List) || (obj instanceof Array))
            {
                return "list";
            }
            if (obj instanceof Map)
            {
                return "group";
            }
            if (obj instanceof Boolean)
            {
                return "bool";
            }
        }
        return s1;
    }

    public static Map a()
    {
        return g;
    }

    public static void a(Var var)
    {
        b.put(var.name(), var);
        synchronized (a)
        {
            a(var.name(), var.nameComponents(), var.defaultValue(), var.kind(), a, e);
        }
        while (com.leanplum.g.a() || !Leanplum.hasStartedAndRegisteredAsDeveloper() || FileManager.a()) 
        {
            return;
        }
        g();
    }

    public static void a(aV av)
    {
        n = av;
    }

    public static void a(String s1, int i1, List list, Map map)
    {
        HashMap hashmap = new HashMap();
        HashMap hashmap1 = new HashMap();
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                list = new HashMap();
                list.put("kind", Integer.valueOf(i1));
                list.put("values", hashmap);
                list.put("kinds", hashmap1);
                list.put("order", arraylist);
                list.put("options", map);
                f.put(s1, list);
                return;
            }
            a a1 = (a)list.next();
            a(a1.a(), a(a1.a()), a1.c(), a1.b(), ((Map) (hashmap)), ((Map) (hashmap1)));
            arraylist.add(a1.a());
        } while (true);
    }

    private static void a(String s1, String as[], Object obj, String s2, Map map, Map map1)
    {
        int i1 = 0;
        do
        {
            if (i1 >= as.length - 1)
            {
                ((Map)map).put(as[as.length - 1], obj);
                map1.put(s1, s2);
                return;
            }
            map = ((Map) (a(map, as[i1], true)));
            i1++;
        } while (true);
    }

    public static void a(Map map, Map map1, Map map2)
    {
        j = map;
        l = map2;
        k = map1;
    }

    public static void a(Map map, Map map1, Map map2, List list)
    {
        if (map == null) goto _L2; else goto _L1
_L1:
        Object obj;
        g = map;
        synchronized (a)
        {
            q = a(a, g);
        }
        map = (new HashMap(b)).keySet().iterator();
_L7:
        if (map.hasNext()) goto _L4; else goto _L3
_L3:
        o();
_L2:
        if (map1 == null) goto _L6; else goto _L5
_L5:
        i = map1;
        map = new HashMap();
        obj = map1.keySet().iterator();
_L8:
        if (((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_232;
        }
        p = map;
_L6:
        if (map2 != null)
        {
            h = map2;
        }
        if (map1 != null || map2 != null)
        {
            map = new HashSet();
            map1 = new HashSet();
            com.leanplum.c.a(map, map1);
            obj = com.leanplum.c.b();
            if (obj != null)
            {
                ((ag) (obj)).setRegionsData(map2, map, map1);
            }
        }
        m = list;
        s++;
        if (!r)
        {
            e();
            o = true;
            if (n != null)
            {
                n.a();
            }
        }
        return;
_L4:
        obj = (String)map.next();
        ((Var)b.get(obj)).a();
          goto _L7
        String s1 = (String)((Iterator) (obj)).next();
        Map map3 = (Map)map1.get(s1);
        HashMap hashmap = new HashMap(map3);
        Map map4 = (Map)map3.get("vars");
        Map map5 = (Map)a((Map)Util.a(f, new Object[] {
            hashmap.get("action"), "values"
        }), map4);
        map.put(s1, hashmap);
        hashmap.put("vars", map5);
        if (map3.get("action") != null)
        {
            (new ActionContext(map3.get("action").toString(), map4, s1)).b();
        }
          goto _L8
    }

    public static void a(boolean flag)
    {
        r = flag;
    }

    public static boolean a(String s1, String s2, InputStream inputstream, boolean flag, String s3, int i1)
    {
label0:
        {
label1:
            {
                if (g.k)
                {
                    if (com.leanplum.g.a())
                    {
                        break label0;
                    }
                    if (inputstream != null)
                    {
                        break label1;
                    }
                }
                return false;
            }
            HashMap hashmap = new HashMap();
            HashMap hashmap1 = new HashMap();
            if (flag)
            {
                hashmap1.put("hash", s3);
                hashmap1.put("size", Integer.valueOf(i1));
            } else
            if (g.j && Util.e())
            {
                s2 = FileManager.a(inputstream);
                hashmap1.put("hash", ((k) (s2)).a);
                hashmap1.put("size", Integer.valueOf(((k) (s2)).b));
            } else
            {
                hashmap1.put("size", Integer.valueOf(FileManager.a(FileManager.a(s1, s2, null))));
            }
            hashmap.put("", hashmap1);
            c.put(s1, hashmap);
            d.put(s1, inputstream);
            h();
        }
        return true;
    }

    public static String[] a(String s1)
    {
        Matcher matcher = u.matcher(s1);
        ArrayList arraylist = new ArrayList();
        do
        {
            if (!matcher.find())
            {
                return (String[])arraylist.toArray(new String[0]);
            }
            arraylist.add(s1.substring(matcher.start(), matcher.end()));
        } while (true);
    }

    public static Var b(String s1)
    {
        return (Var)b.get(s1);
    }

    public static Map b()
    {
        return i;
    }

    public static int c(String s1)
    {
        int i1;
        try
        {
            s1 = s1.replace("res/", "");
            String s2 = s1.substring(0, s1.lastIndexOf('.'));
            s1 = s2.substring(s2.lastIndexOf('/') + 1);
            s2 = s2.substring(0, s2.lastIndexOf('/')).replace('/', '.');
            Context context = Leanplum.a();
            i1 = context.getResources().getIdentifier(s1, s2, context.getPackageName());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return 0;
        }
        return i1;
    }

    public static boolean c()
    {
        return o;
    }

    public static void d()
    {
        Object obj;
        if (com.leanplum.g.a())
        {
            return;
        }
        obj = Leanplum.a().getSharedPreferences("__leanplum__", 0);
        String s1 = ((SharedPreferences) (obj)).getString("__leanplum_token", null);
        if (s1 == null)
        {
            a(new HashMap(), new HashMap(), new HashMap(), new ArrayList());
            return;
        }
        T.c(s1);
        String s2;
        s2 = ((SharedPreferences) (obj)).getString("__leanplum_variables", "{}");
        String s3 = ((SharedPreferences) (obj)).getString("__leanplum_messages", "{}");
        String s4 = ((SharedPreferences) (obj)).getString("regions", "{}");
        String s5 = ((SharedPreferences) (obj)).getString("variants", "[]");
        a(com.leanplum.a.a(com.leanplum.a.b(T.a(), s2)), com.leanplum.a.a(com.leanplum.a.b(T.a(), s3)), com.leanplum.a.a(com.leanplum.a.b(T.a(), s4)), com.leanplum.a.a(new JSONArray(com.leanplum.a.b(T.a(), s5))));
        s2 = ((SharedPreferences) (obj)).getString("deviceId", null);
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        s2 = com.leanplum.a.b(T.a(), s2);
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        T.a(s2);
        obj = ((SharedPreferences) (obj)).getString("userId", null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        obj = com.leanplum.a.b(T.a(), ((String) (obj)));
        if (obj != null)
        {
            try
            {
                T.b(((String) (obj)));
            }
            catch (Exception exception)
            {
                Log.e("Leanplum", "Could not load variable diffs", exception);
            }
        }
        m();
        return;
    }

    public static void e()
    {
        while (com.leanplum.g.a() || T.a() == null) 
        {
            return;
        }
        android.content.SharedPreferences.Editor editor = Leanplum.a().getSharedPreferences("__leanplum__", 0).edit();
        String s1 = com.leanplum.a.a(g);
        editor.putString("__leanplum_variables", com.leanplum.a.a(T.a(), s1));
        s1 = com.leanplum.a.a(p);
        editor.putString("__leanplum_messages", com.leanplum.a.a(T.a(), s1));
        s1 = com.leanplum.a.a(h);
        editor.putString("regions", com.leanplum.a.a(T.a(), s1));
        try
        {
            String s2 = com.leanplum.a.a(m).toString();
            editor.putString("variants", com.leanplum.a.a(T.a(), s2));
        }
        catch (JSONException jsonexception)
        {
            Log.e("Leanplum", (new StringBuilder("Error converting ")).append(m).append(" to JSON").toString(), jsonexception);
        }
        editor.putString("deviceId", com.leanplum.a.a(T.a(), T.c()));
        editor.putString("userId", com.leanplum.a.a(T.a(), T.d()));
        editor.putString("__leanplum_token", T.a());
        try
        {
            editor.apply();
            return;
        }
        catch (NoSuchMethodError nosuchmethoderror)
        {
            editor.commit();
        }
    }

    public static int f()
    {
        return s;
    }

    static void g()
    {
        boolean flag3;
        flag3 = false;
        break MISSING_BLOCK_LABEL_3;
_L4:
        Object obj;
        Map map;
        do
        {
            return;
        } while (com.leanplum.g.a() || j == null);
        if (!a.equals(j))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = f;
        map = l;
        if (((Map) (obj)).size() == map.size()) goto _L2; else goto _L1
_L1:
        boolean flag1 = flag3;
_L5:
        if (flag1) goto _L4; else goto _L3
_L3:
        obj = new HashMap();
        ((HashMap) (obj)).put("variables", com.leanplum.a.a(a));
        ((HashMap) (obj)).put("kinds", com.leanplum.a.a(e));
        ((HashMap) (obj)).put("fileAttributes", com.leanplum.a.a(c));
        ((HashMap) (obj)).put("actionDefinitions", com.leanplum.a.a(f));
        T.b("setVars", ((Map) (obj))).h();
        return;
_L2:
        Iterator iterator = ((Map) (obj)).keySet().iterator();
_L12:
label0:
        {
            if (iterator.hasNext())
            {
                break label0;
            }
            flag1 = true;
        }
          goto _L5
        Map map1;
        Object obj1;
        obj1 = (String)iterator.next();
        map1 = (Map)((Map) (obj)).get(obj1);
        obj1 = (Map)map.get(obj1);
        flag1 = flag3;
        if (obj1 == null) goto _L5; else goto _L6
_L6:
        flag1 = flag3;
        if (!map1.get("kind").equals(((Map) (obj1)).get("kind"))) goto _L5; else goto _L7
_L7:
        flag1 = flag3;
        if (!map1.get("values").equals(((Map) (obj1)).get("values"))) goto _L5; else goto _L8
_L8:
        flag1 = flag3;
        if (!map1.get("kinds").equals(((Map) (obj1)).get("kinds"))) goto _L5; else goto _L9
_L9:
        boolean flag;
        boolean flag2;
        if (map1.get("options") == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((Map) (obj1)).get("options") == null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        flag1 = flag3;
        if (flag != flag2) goto _L5; else goto _L10
_L10:
        if (!map1.get("options").equals(((Map) (obj1)).get("options"))) goto _L12; else goto _L11
_L11:
        flag1 = flag3;
          goto _L5
        if (true) goto _L4; else goto _L13
_L13:
    }

    static void h()
    {
        if (!com.leanplum.g.a() && k != null && Leanplum.hasStartedAndRegisteredAsDeveloper() && g.n) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        Iterator iterator = c.keySet().iterator();
        int i1 = 0;
        do
        {
label0:
            {
                if (iterator.hasNext())
                {
                    break label0;
                }
                if (arraylist.size() > 0)
                {
                    HashMap hashmap = new HashMap();
                    hashmap.put("data", arraylist1.toString());
                    T.b("uploadFile", hashmap).a(arraylist, arraylist2);
                    return;
                }
            }
            if (true)
            {
                continue;
            }
            String s1 = (String)iterator.next();
            Map map = (Map)c.get(s1);
            Object obj = (Map)k.get(s1);
            Map map1 = (Map)map.get("");
            if (obj != null)
            {
                obj = ((Map) (obj)).get("");
            } else
            {
                obj = null;
            }
            obj = (Map)obj;
            if (FileManager.a(map1, ((Map) (obj))))
            {
                if (g.m)
                {
                    Log.d("Leanplum", (new StringBuilder("Will upload file ")).append(s1).append(". Local attributes: ").append(map1).append("; server attributes: ").append(obj).toString());
                }
                obj = (String)map1.get("hash");
                if (obj == null)
                {
                    obj = "";
                }
                String s2 = FileManager.b(s1);
                JSONObject jsonobject;
                int j1;
                if (i1 > 0x1900000 && arraylist.size() > 0 || arraylist.size() >= 16)
                {
                    HashMap hashmap1 = new HashMap();
                    hashmap1.put("data", arraylist1.toString());
                    T.b("uploadFile", hashmap1).a(arraylist, arraylist2);
                    arraylist2 = new ArrayList();
                    arraylist1 = new ArrayList();
                    arraylist = new ArrayList();
                    i1 = 0;
                } else
                {
                    ArrayList arraylist3 = arraylist;
                    arraylist = arraylist2;
                    arraylist2 = arraylist3;
                }
                j1 = ((Integer)map1.get("size")).intValue();
                arraylist2.add(s2);
                jsonobject = new JSONObject();
                try
                {
                    jsonobject.put("hash", obj);
                    jsonobject.put("size", (new StringBuilder()).append(map1.get("size")).toString());
                    jsonobject.put("filename", s1);
                    arraylist1.add(jsonobject);
                }
                catch (JSONException jsonexception)
                {
                    Log.e("Leanplum", "Unable to upload files", jsonexception);
                    arraylist1.add(new JSONObject());
                }
                arraylist.add((InputStream)d.get(s1));
                obj = arraylist2;
                i1 = j1 + i1;
                arraylist2 = arraylist;
                arraylist = ((ArrayList) (obj));
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static boolean i()
    {
        return r;
    }

    public static List j()
    {
        return m;
    }

    public static Map k()
    {
        return f;
    }

    public static Map l()
    {
        return p;
    }

    public static Map m()
    {
        if (t != null) goto _L2; else goto _L1
_L1:
        Object obj = Leanplum.a().getSharedPreferences("__leanplum__", 0);
        if (T.a() == null) goto _L2; else goto _L3
_L3:
        obj = ((SharedPreferences) (obj)).getString("__leanplum_attributes", null);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj = "{}";
_L4:
        try
        {
            t = com.leanplum.a.a(((String) (obj)));
        }
        catch (Exception exception)
        {
            Log.e("Leanplum", "Could not load user attributes", exception);
        }
_L2:
        if (t == null)
        {
            t = new HashMap();
        }
        return t;
        obj = com.leanplum.a.b(T.a(), ((String) (obj)));
          goto _L4
    }

    public static void n()
    {
        if (com.leanplum.g.a() || T.a() == null || t == null)
        {
            return;
        }
        android.content.SharedPreferences.Editor editor = Leanplum.a().getSharedPreferences("__leanplum__", 0).edit();
        String s1 = com.leanplum.a.a(t);
        editor.putString("__leanplum_attributes", com.leanplum.a.a(T.a(), s1));
        try
        {
            editor.apply();
            return;
        }
        catch (NoSuchMethodError nosuchmethoderror)
        {
            editor.commit();
        }
    }

    private static void o()
    {
        Iterator iterator = (new HashMap(b)).keySet().iterator();
        do
        {
            Object obj;
            Map map;
            Object obj1;
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        return;
                    }
                    obj = (String)iterator.next();
                    obj = (Var)b.get(obj);
                    obj1 = ((Var) (obj)).a;
                } while (!((Var) (obj)).b || !((Var) (obj)).kind().equals("file") || obj1 == null || ((Var) (obj)).defaultValue().equals(obj1));
                map = (Map)c.get(obj1);
                obj1 = (InputStream)d.get(obj1);
            } while (map == null || obj1 == null);
            ((Var) (obj)).setOverrideResId(c(((Var) (obj)).stringValue()));
        } while (true);
    }

}
