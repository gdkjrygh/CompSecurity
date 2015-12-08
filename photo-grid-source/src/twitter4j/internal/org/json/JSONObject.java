// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.org.json;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package twitter4j.internal.org.json:
//            JSONTokener, JSONException, JSONArray

public class JSONObject
{

    public static final Object NULL = new Null(null);
    private Map map;

    public JSONObject()
    {
        map = new HashMap();
    }

    public JSONObject(Object obj)
    {
        this();
        populateMap(obj);
    }

    public JSONObject(Object obj, String as[])
    {
        this();
        Class class1 = obj.getClass();
        int i = 0;
        while (i < as.length) 
        {
            String s = as[i];
            try
            {
                putOpt(s, class1.getField(s).get(obj));
            }
            catch (Exception exception) { }
            i++;
        }
    }

    public JSONObject(String s)
    {
        this(new JSONTokener(s));
    }

    public JSONObject(String s, Locale locale)
    {
        this();
        ResourceBundle resourcebundle = ResourceBundle.getBundle(s, locale, Thread.currentThread().getContextClassLoader());
        Enumeration enumeration = resourcebundle.getKeys();
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break;
            }
            Object obj1 = enumeration.nextElement();
            if (obj1 instanceof String)
            {
                String as[] = ((String)obj1).split("\\.");
                int j = as.length - 1;
                int i = 0;
                Object obj = this;
                while (i < j) 
                {
                    String s1 = as[i];
                    s = ((String) (((JSONObject) (obj)).opt(s1)));
                    if (s instanceof JSONObject)
                    {
                        s = (JSONObject)s;
                    } else
                    {
                        s = null;
                    }
                    locale = s;
                    if (s == null)
                    {
                        locale = new JSONObject();
                        ((JSONObject) (obj)).put(s1, locale);
                    }
                    i++;
                    obj = locale;
                }
                ((JSONObject) (obj)).put(as[j], resourcebundle.getString((String)obj1));
            }
        } while (true);
    }

    public JSONObject(Map map1)
    {
        map = new HashMap();
        if (map1 != null)
        {
            map1 = map1.entrySet().iterator();
            do
            {
                if (!map1.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)map1.next();
                Object obj = entry.getValue();
                if (obj != null)
                {
                    map.put(entry.getKey(), wrap(obj));
                }
            } while (true);
        }
    }

    public JSONObject(JSONObject jsonobject, String as[])
    {
        this();
        int i = 0;
        while (i < as.length) 
        {
            try
            {
                putOnce(as[i], jsonobject.opt(as[i]));
            }
            catch (Exception exception) { }
            i++;
        }
    }

    public JSONObject(JSONTokener jsontokener)
    {
        this();
        if (jsontokener.nextClean() != '{')
        {
            throw jsontokener.syntaxError((new StringBuilder("A JSONObject text must begin with '{' found:")).append(jsontokener.nextClean()).toString());
        }
          goto _L1
_L11:
        jsontokener.back();
_L1:
        jsontokener.nextClean();
        JVM INSTR lookupswitch 2: default 72
    //                   0: 163
    //                   125: 192;
           goto _L2 _L3 _L4
_L2:
        String s;
        char c;
        jsontokener.back();
        s = jsontokener.nextValue().toString();
        c = jsontokener.nextClean();
        if (c != '=') goto _L6; else goto _L5
_L5:
        if (jsontokener.next() != '>')
        {
            jsontokener.back();
        }
_L10:
        putOnce(s, jsontokener.nextValue());
        jsontokener.nextClean();
        JVM INSTR lookupswitch 3: default 156
    //                   44: 183
    //                   59: 183
    //                   125: 192;
           goto _L7 _L8 _L8 _L4
_L7:
        throw jsontokener.syntaxError("Expected a ',' or '}'");
_L3:
        throw jsontokener.syntaxError("A JSONObject text must end with '}'");
_L6:
        if (c == ':') goto _L10; else goto _L9
_L9:
        throw jsontokener.syntaxError("Expected a ':' after a key");
_L8:
        if (jsontokener.nextClean() != '}') goto _L11; else goto _L4
_L4:
    }

    public static String numberToString(Number number)
    {
        if (number == null)
        {
            throw new JSONException("Null pointer");
        }
        testValidity(number);
        String s = number.toString();
        number = s;
        if (s.indexOf('.') > 0)
        {
            number = s;
            if (s.indexOf('e') < 0)
            {
                number = s;
                if (s.indexOf('E') < 0)
                {
                    for (; s.endsWith("0"); s = s.substring(0, s.length() - 1)) { }
                    number = s;
                    if (s.endsWith("."))
                    {
                        number = s.substring(0, s.length() - 1);
                    }
                }
            }
        }
        return number;
    }

    private void populateMap(Object obj)
    {
        Object obj1;
        Object obj2;
        boolean flag = false;
        obj1 = obj.getClass();
        Method amethod[];
        Method method;
        int i;
        if (((Class) (obj1)).getClassLoader() != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            amethod = ((Class) (obj1)).getMethods();
            i = ((flag) ? 1 : 0);
        } else
        {
            amethod = ((Class) (obj1)).getDeclaredMethods();
            i = ((flag) ? 1 : 0);
        }
        if (i >= amethod.length) goto _L2; else goto _L1
_L1:
        method = amethod[i];
        if (!Modifier.isPublic(method.getModifiers())) goto _L4; else goto _L3
_L3:
        obj2 = method.getName();
        obj1 = "";
        if (!((String) (obj2)).startsWith("get")) goto _L6; else goto _L5
_L5:
        if (((String) (obj2)).equals("getClass") || ((String) (obj2)).equals("getDeclaringClass"))
        {
            break MISSING_BLOCK_LABEL_273;
        }
          goto _L7
_L14:
        if (((String) (obj1)).length() <= 0 || !Character.isUpperCase(((String) (obj1)).charAt(0)) || method.getParameterTypes().length != 0) goto _L4; else goto _L8
_L8:
        if (((String) (obj1)).length() != 1) goto _L10; else goto _L9
_L9:
        obj2 = ((String) (obj1)).toLowerCase();
_L12:
        obj1 = method.invoke(obj, null);
        if (obj1 != null)
        {
            try
            {
                map.put(obj2, wrap(obj1));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
_L4:
        i++;
        break MISSING_BLOCK_LABEL_33;
_L7:
        obj1 = ((String) (obj2)).substring(3);
        continue; /* Loop/switch isn't completed */
_L6:
        if (((String) (obj2)).startsWith("is"))
        {
            obj1 = ((String) (obj2)).substring(2);
        }
        continue; /* Loop/switch isn't completed */
_L10:
        obj2 = obj1;
        if (Character.isUpperCase(((String) (obj1)).charAt(1))) goto _L12; else goto _L11
_L11:
        obj2 = (new StringBuilder()).append(((String) (obj1)).substring(0, 1).toLowerCase()).append(((String) (obj1)).substring(1)).toString();
          goto _L12
_L2:
        return;
        obj1 = "";
        if (true) goto _L14; else goto _L13
_L13:
    }

    public static String quote(String s)
    {
        StringBuilder stringbuilder;
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
label4:
                        {
label5:
                            {
label6:
                                {
                                    int i = 0;
                                    if (s == null || s.length() == 0)
                                    {
                                        return "\"\"";
                                    }
                                    int j = s.length();
                                    stringbuilder = new StringBuilder(j + 4);
                                    stringbuilder.append('"');
                                    char c1 = '\0';
label7:
                                    do
                                    {
                                        {
                                            if (i >= j)
                                            {
                                                break label0;
                                            }
                                            char c = s.charAt(i);
                                            switch (c)
                                            {
                                            default:
                                                if (c < ' ' || c >= '\200' && c < '\240' || c >= '\u2000' && c < '\u2100')
                                                {
                                                    String s1 = (new StringBuilder("000")).append(Integer.toHexString(c)).toString();
                                                    stringbuilder.append("\\u").append(s1.substring(s1.length() - 4));
                                                } else
                                                {
                                                    stringbuilder.append(c);
                                                }
                                                break;

                                            case 8: // '\b'
                                                break label5;

                                            case 9: // '\t'
                                                break label4;

                                            case 10: // '\n'
                                                break label3;

                                            case 12: // '\f'
                                                break label2;

                                            case 13: // '\r'
                                                break label1;

                                            case 34: // '"'
                                            case 92: // '\\'
                                                break label7;

                                            case 47: // '/'
                                                break label6;
                                            }
                                        }
                                        i++;
                                        c1 = c;
                                    } while (true);
                                    stringbuilder.append('\\');
                                    stringbuilder.append(c);
                                    break MISSING_BLOCK_LABEL_212;
                                }
                                if (c1 == '<')
                                {
                                    stringbuilder.append('\\');
                                }
                                stringbuilder.append(c);
                                break MISSING_BLOCK_LABEL_212;
                            }
                            stringbuilder.append("\\b");
                            break MISSING_BLOCK_LABEL_212;
                        }
                        stringbuilder.append("\\t");
                        break MISSING_BLOCK_LABEL_212;
                    }
                    stringbuilder.append("\\n");
                    break MISSING_BLOCK_LABEL_212;
                }
                stringbuilder.append("\\f");
                break MISSING_BLOCK_LABEL_212;
            }
            stringbuilder.append("\\r");
            break MISSING_BLOCK_LABEL_212;
        }
        stringbuilder.append('"');
        return stringbuilder.toString();
    }

    public static Object stringToValue(String s)
    {
        if (!s.equals("")) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        int i;
        if (s.equalsIgnoreCase("true"))
        {
            return Boolean.TRUE;
        }
        if (s.equalsIgnoreCase("false"))
        {
            return Boolean.FALSE;
        }
        if (s.equalsIgnoreCase("null"))
        {
            return NULL;
        }
        i = s.charAt(0);
        if ((i < '0' || i > '9') && i != '.' && i != '-' && i != '+') goto _L1; else goto _L3
_L3:
        if (i != '0' || s.length() <= 2 || s.charAt(1) != 'x' && s.charAt(1) != 'X')
        {
            break MISSING_BLOCK_LABEL_140;
        }
        i = Integer.parseInt(s.substring(2), 16);
        return Integer.valueOf(i);
        Exception exception;
        exception;
label0:
        {
            Long long1;
            int j;
            try
            {
                if (s.indexOf('.') >= 0 || s.indexOf('e') >= 0 || s.indexOf('E') >= 0)
                {
                    return Double.valueOf(s);
                }
                long1 = new Long(s);
                if (long1.longValue() != (long)long1.intValue())
                {
                    break label0;
                }
                j = long1.intValue();
            }
            catch (Exception exception1)
            {
                return s;
            }
            return Integer.valueOf(j);
        }
        return long1;
    }

    public static void testValidity(Object obj)
    {
        if (obj != null)
        {
            if (obj instanceof Double)
            {
                if (((Double)obj).isInfinite() || ((Double)obj).isNaN())
                {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
            } else
            if ((obj instanceof Float) && (((Float)obj).isInfinite() || ((Float)obj).isNaN()))
            {
                throw new JSONException("JSON does not allow non-finite numbers.");
            }
        }
    }

    public static String valueToString(Object obj)
    {
        if (obj == null || obj.equals(null))
        {
            return "null";
        }
        if (obj instanceof Number)
        {
            return numberToString((Number)obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof JSONObject) || (obj instanceof JSONArray))
        {
            return obj.toString();
        }
        if (obj instanceof Map)
        {
            return (new JSONObject((Map)obj)).toString();
        }
        if (obj instanceof Collection)
        {
            return (new JSONArray((Collection)obj)).toString();
        }
        if (obj.getClass().isArray())
        {
            return (new JSONArray(obj)).toString();
        } else
        {
            return quote(obj.toString());
        }
    }

    static String valueToString(Object obj, int i, int j)
    {
        if (obj == null || obj.equals(null))
        {
            return "null";
        }
        if (obj instanceof Number)
        {
            return numberToString((Number)obj);
        }
        if (obj instanceof Boolean)
        {
            return obj.toString();
        }
        if (obj instanceof JSONObject)
        {
            return ((JSONObject)obj).toString(i, j);
        }
        if (obj instanceof JSONArray)
        {
            return ((JSONArray)obj).toString(i, j);
        }
        if (obj instanceof Map)
        {
            return (new JSONObject((Map)obj)).toString(i, j);
        }
        if (obj instanceof Collection)
        {
            return (new JSONArray((Collection)obj)).toString(i, j);
        }
        if (obj.getClass().isArray())
        {
            return (new JSONArray(obj)).toString(i, j);
        } else
        {
            return quote(obj.toString());
        }
    }

    public static Object wrap(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        Object obj1;
        try
        {
            return NULL;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj1 = null;
        }
          goto _L3
_L2:
        obj1 = obj;
        if (obj instanceof JSONObject) goto _L3; else goto _L4
_L4:
        obj1 = obj;
        if (obj instanceof JSONArray) goto _L3; else goto _L5
_L5:
        obj1 = obj;
        if (NULL.equals(obj)) goto _L3; else goto _L6
_L6:
        obj1 = obj;
        if (obj instanceof Byte) goto _L3; else goto _L7
_L7:
        obj1 = obj;
        if (obj instanceof Character) goto _L3; else goto _L8
_L8:
        obj1 = obj;
        if (obj instanceof Short) goto _L3; else goto _L9
_L9:
        obj1 = obj;
        if (obj instanceof Integer) goto _L3; else goto _L10
_L10:
        obj1 = obj;
        if (obj instanceof Long) goto _L3; else goto _L11
_L11:
        obj1 = obj;
        if (obj instanceof Boolean) goto _L3; else goto _L12
_L12:
        obj1 = obj;
        if (obj instanceof Float) goto _L3; else goto _L13
_L13:
        obj1 = obj;
        if (obj instanceof Double) goto _L3; else goto _L14
_L14:
        obj1 = obj;
        if (obj instanceof String) goto _L3; else goto _L15
_L15:
        if (obj instanceof Collection)
        {
            return new JSONArray((Collection)obj);
        }
        if (obj.getClass().isArray())
        {
            return new JSONArray(obj);
        }
        if (obj instanceof Map)
        {
            return new JSONObject((Map)obj);
        }
        obj1 = obj.getClass().getPackage();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        obj1 = ((Package) (obj1)).getName();
_L16:
        if (((String) (obj1)).startsWith("java.") || ((String) (obj1)).startsWith("javax.") || obj.getClass().getClassLoader() == null)
        {
            return obj.toString();
        }
        obj = new JSONObject(obj);
        return obj;
_L3:
        return obj1;
        obj1 = "";
          goto _L16
    }

    public JSONObject append(String s, Object obj)
    {
        testValidity(obj);
        Object obj1 = opt(s);
        if (obj1 == null)
        {
            put(s, (new JSONArray()).put(obj));
            return this;
        }
        if (obj1 instanceof JSONArray)
        {
            put(s, ((JSONArray)obj1).put(obj));
            return this;
        } else
        {
            throw new JSONException((new StringBuilder("JSONObject[")).append(s).append("] is not a JSONArray.").toString());
        }
    }

    public Object get(String s)
    {
        if (s == null)
        {
            throw new JSONException("Null key.");
        }
        Object obj = opt(s);
        if (obj == null)
        {
            throw new JSONException((new StringBuilder("JSONObject[")).append(quote(s)).append("] not found.").toString());
        } else
        {
            return obj;
        }
    }

    public boolean getBoolean(String s)
    {
        Object obj = get(s);
        if (obj.equals(Boolean.FALSE) || (obj instanceof String) && ((String)obj).equalsIgnoreCase("false"))
        {
            return false;
        }
        if (obj.equals(Boolean.TRUE) || (obj instanceof String) && ((String)obj).equalsIgnoreCase("true"))
        {
            return true;
        } else
        {
            throw new JSONException((new StringBuilder("JSONObject[")).append(quote(s)).append("] is not a Boolean.").toString());
        }
    }

    public int getInt(String s)
    {
        Object obj = get(s);
        int i;
        try
        {
            if (obj instanceof Number)
            {
                return ((Number)obj).intValue();
            }
            i = Integer.parseInt((String)obj);
        }
        catch (Exception exception)
        {
            throw new JSONException((new StringBuilder("JSONObject[")).append(quote(s)).append("] is not an int.").toString());
        }
        return i;
    }

    public JSONArray getJSONArray(String s)
    {
        Object obj = get(s);
        if (obj instanceof JSONArray)
        {
            return (JSONArray)obj;
        } else
        {
            throw new JSONException((new StringBuilder("JSONObject[")).append(quote(s)).append("] is not a JSONArray.").toString());
        }
    }

    public JSONObject getJSONObject(String s)
    {
        Object obj = get(s);
        if (obj instanceof JSONObject)
        {
            return (JSONObject)obj;
        } else
        {
            throw new JSONException((new StringBuilder("JSONObject[")).append(quote(s)).append("] is not a JSONObject.").toString());
        }
    }

    public long getLong(String s)
    {
        Object obj = get(s);
        long l;
        try
        {
            if (obj instanceof Number)
            {
                return ((Number)obj).longValue();
            }
            l = Long.parseLong((String)obj);
        }
        catch (Exception exception)
        {
            throw new JSONException((new StringBuilder("JSONObject[")).append(quote(s)).append("] is not a long.").toString());
        }
        return l;
    }

    public String getString(String s)
    {
        s = ((String) (get(s)));
        if (s == NULL)
        {
            return null;
        } else
        {
            return s.toString();
        }
    }

    public boolean has(String s)
    {
        return map.containsKey(s);
    }

    public boolean isNull(String s)
    {
        return NULL.equals(opt(s));
    }

    public Iterator keys()
    {
        return map.keySet().iterator();
    }

    public int length()
    {
        return map.size();
    }

    public JSONArray names()
    {
        JSONArray jsonarray1 = new JSONArray();
        for (Iterator iterator = keys(); iterator.hasNext(); jsonarray1.put(iterator.next())) { }
        JSONArray jsonarray = jsonarray1;
        if (jsonarray1.length() == 0)
        {
            jsonarray = null;
        }
        return jsonarray;
    }

    public Object opt(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return map.get(s);
        }
    }

    public JSONObject put(String s, double d)
    {
        put(s, new Double(d));
        return this;
    }

    public JSONObject put(String s, int i)
    {
        put(s, new Integer(i));
        return this;
    }

    public JSONObject put(String s, long l)
    {
        put(s, new Long(l));
        return this;
    }

    public JSONObject put(String s, Object obj)
    {
        if (s == null)
        {
            throw new JSONException("Null key.");
        }
        if (obj != null)
        {
            testValidity(obj);
            map.put(s, obj);
            return this;
        } else
        {
            remove(s);
            return this;
        }
    }

    public JSONObject put(String s, Collection collection)
    {
        put(s, new JSONArray(collection));
        return this;
    }

    public JSONObject put(String s, Map map1)
    {
        put(s, new JSONObject(map1));
        return this;
    }

    public JSONObject put(String s, boolean flag)
    {
        Boolean boolean1;
        if (flag)
        {
            boolean1 = Boolean.TRUE;
        } else
        {
            boolean1 = Boolean.FALSE;
        }
        put(s, boolean1);
        return this;
    }

    public JSONObject putOnce(String s, Object obj)
    {
        if (s != null && obj != null)
        {
            if (opt(s) != null)
            {
                throw new JSONException((new StringBuilder("Duplicate key \"")).append(s).append("\"").toString());
            }
            put(s, obj);
        }
        return this;
    }

    public JSONObject putOpt(String s, Object obj)
    {
        if (s != null && obj != null)
        {
            put(s, obj);
        }
        return this;
    }

    public Object remove(String s)
    {
        return map.remove(s);
    }

    public Iterator sortedKeys()
    {
        return (new TreeSet(map.keySet())).iterator();
    }

    public String toString()
    {
        String s;
        StringBuilder stringbuilder;
        try
        {
            Iterator iterator = keys();
            stringbuilder = new StringBuilder("{");
            Object obj;
            for (; iterator.hasNext(); stringbuilder.append(valueToString(map.get(obj))))
            {
                if (stringbuilder.length() > 1)
                {
                    stringbuilder.append(',');
                }
                obj = iterator.next();
                stringbuilder.append(quote(obj.toString()));
                stringbuilder.append(':');
            }

        }
        catch (Exception exception)
        {
            return null;
        }
        stringbuilder.append('}');
        s = stringbuilder.toString();
        return s;
    }

    public String toString(int i)
    {
        return toString(i, 0);
    }

    String toString(int i, int j)
    {
        StringBuilder stringbuilder;
        Object obj;
        int k;
        boolean flag;
        int i1;
        flag = false;
        k = length();
        if (k == 0)
        {
            return "{}";
        }
        obj = sortedKeys();
        i1 = j + i;
        stringbuilder = new StringBuilder("{");
        if (k != 1) goto _L2; else goto _L1
_L1:
        obj = ((Iterator) (obj)).next();
        stringbuilder.append(quote(obj.toString()));
        stringbuilder.append(": ");
        stringbuilder.append(valueToString(map.get(obj), i, j));
_L6:
        stringbuilder.append('}');
        return stringbuilder.toString();
_L4:
        Object obj1;
        stringbuilder.append(quote(obj1.toString()));
        stringbuilder.append(": ");
        stringbuilder.append(valueToString(map.get(obj1), i, i1));
_L2:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = ((Iterator) (obj)).next();
        int l;
        if (stringbuilder.length() > 1)
        {
            stringbuilder.append(",\n");
        } else
        {
            stringbuilder.append('\n');
        }
        l = 0;
        while (l < i1) 
        {
            stringbuilder.append(' ');
            l++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (stringbuilder.length() > 1)
        {
            stringbuilder.append('\n');
            i = ((flag) ? 1 : 0);
            while (i < j) 
            {
                stringbuilder.append(' ');
                i++;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Writer write(Writer writer)
    {
        boolean flag = false;
        Iterator iterator;
        iterator = keys();
        writer.write(123);
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        writer.write(44);
        Object obj;
        obj = iterator.next();
        writer.write(quote(obj.toString()));
        writer.write(58);
        obj = map.get(obj);
        if (obj instanceof JSONObject)
        {
            ((JSONObject)obj).write(writer);
            break MISSING_BLOCK_LABEL_136;
        }
        if (obj instanceof JSONArray)
        {
            ((JSONArray)obj).write(writer);
            break MISSING_BLOCK_LABEL_136;
        }
        try
        {
            writer.write(valueToString(obj));
        }
        // Misplaced declaration of an exception variable
        catch (Writer writer)
        {
            throw new JSONException(writer);
        }
        break MISSING_BLOCK_LABEL_136;
_L2:
        writer.write(125);
        return writer;
        flag = true;
          goto _L3
    }


    private class Null
    {

        protected final Object clone()
        {
            return this;
        }

        public final boolean equals(Object obj)
        {
            return obj == null || obj == this;
        }

        public final String toString()
        {
            return "null";
        }

        private Null()
        {
        }

        Null(_cls1 _pcls1)
        {
            this();
        }
    }

}
