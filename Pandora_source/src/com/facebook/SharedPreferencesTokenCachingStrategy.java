// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            TokenCachingStrategy, LoggingBehavior

public class SharedPreferencesTokenCachingStrategy extends TokenCachingStrategy
{

    private static final String DEFAULT_CACHE_KEY = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
    private static final String JSON_VALUE = "value";
    private static final String JSON_VALUE_ENUM_TYPE = "enumType";
    private static final String JSON_VALUE_TYPE = "valueType";
    private static final String TAG = com/facebook/SharedPreferencesTokenCachingStrategy.getSimpleName();
    private static final String TYPE_BOOLEAN = "bool";
    private static final String TYPE_BOOLEAN_ARRAY = "bool[]";
    private static final String TYPE_BYTE = "byte";
    private static final String TYPE_BYTE_ARRAY = "byte[]";
    private static final String TYPE_CHAR = "char";
    private static final String TYPE_CHAR_ARRAY = "char[]";
    private static final String TYPE_DOUBLE = "double";
    private static final String TYPE_DOUBLE_ARRAY = "double[]";
    private static final String TYPE_ENUM = "enum";
    private static final String TYPE_FLOAT = "float";
    private static final String TYPE_FLOAT_ARRAY = "float[]";
    private static final String TYPE_INTEGER = "int";
    private static final String TYPE_INTEGER_ARRAY = "int[]";
    private static final String TYPE_LONG = "long";
    private static final String TYPE_LONG_ARRAY = "long[]";
    private static final String TYPE_SHORT = "short";
    private static final String TYPE_SHORT_ARRAY = "short[]";
    private static final String TYPE_STRING = "string";
    private static final String TYPE_STRING_LIST = "stringList";
    private SharedPreferences cache;
    private String cacheKey;

    public SharedPreferencesTokenCachingStrategy(Context context)
    {
        this(context, null);
    }

    public SharedPreferencesTokenCachingStrategy(Context context, String s)
    {
        Validate.notNull(context, "context");
        String s1 = s;
        if (Utility.isNullOrEmpty(s))
        {
            s1 = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
        }
        cacheKey = s1;
        s = context.getApplicationContext();
        if (s != null)
        {
            context = s;
        }
        cache = context.getSharedPreferences(cacheKey, 0);
    }

    private void deserializeKey(String s, Bundle bundle)
        throws JSONException
    {
        Object obj;
        Object obj1;
        int i;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        flag = false;
        flag1 = false;
        flag2 = false;
        flag3 = false;
        flag4 = false;
        flag5 = false;
        i = 0;
        obj = new JSONObject(cache.getString(s, "{}"));
        obj1 = ((JSONObject) (obj)).getString("valueType");
        if (!((String) (obj1)).equals("bool")) goto _L2; else goto _L1
_L1:
        bundle.putBoolean(s, ((JSONObject) (obj)).getBoolean("value"));
_L4:
        return;
_L2:
        if (((String) (obj1)).equals("bool[]"))
        {
            obj = ((JSONObject) (obj)).getJSONArray("value");
            for (obj1 = new boolean[((JSONArray) (obj)).length()]; i < obj1.length; i++)
            {
                obj1[i] = ((JSONArray) (obj)).getBoolean(i);
            }

            bundle.putBooleanArray(s, ((boolean []) (obj1)));
            return;
        }
        if (((String) (obj1)).equals("byte"))
        {
            bundle.putByte(s, (byte)((JSONObject) (obj)).getInt("value"));
            return;
        }
        if (((String) (obj1)).equals("byte[]"))
        {
            obj = ((JSONObject) (obj)).getJSONArray("value");
            obj1 = new byte[((JSONArray) (obj)).length()];
            for (int j = ((flag) ? 1 : 0); j < obj1.length; j++)
            {
                obj1[j] = (byte)((JSONArray) (obj)).getInt(j);
            }

            bundle.putByteArray(s, ((byte []) (obj1)));
            return;
        }
        if (((String) (obj1)).equals("short"))
        {
            bundle.putShort(s, (short)((JSONObject) (obj)).getInt("value"));
            return;
        }
        if (((String) (obj1)).equals("short[]"))
        {
            obj = ((JSONObject) (obj)).getJSONArray("value");
            obj1 = new short[((JSONArray) (obj)).length()];
            for (int k = ((flag1) ? 1 : 0); k < obj1.length; k++)
            {
                obj1[k] = (short)((JSONArray) (obj)).getInt(k);
            }

            bundle.putShortArray(s, ((short []) (obj1)));
            return;
        }
        if (((String) (obj1)).equals("int"))
        {
            bundle.putInt(s, ((JSONObject) (obj)).getInt("value"));
            return;
        }
        if (((String) (obj1)).equals("int[]"))
        {
            obj = ((JSONObject) (obj)).getJSONArray("value");
            obj1 = new int[((JSONArray) (obj)).length()];
            for (int l = ((flag2) ? 1 : 0); l < obj1.length; l++)
            {
                obj1[l] = ((JSONArray) (obj)).getInt(l);
            }

            bundle.putIntArray(s, ((int []) (obj1)));
            return;
        }
        if (((String) (obj1)).equals("long"))
        {
            bundle.putLong(s, ((JSONObject) (obj)).getLong("value"));
            return;
        }
        if (((String) (obj1)).equals("long[]"))
        {
            obj = ((JSONObject) (obj)).getJSONArray("value");
            obj1 = new long[((JSONArray) (obj)).length()];
            for (int i1 = ((flag3) ? 1 : 0); i1 < obj1.length; i1++)
            {
                obj1[i1] = ((JSONArray) (obj)).getLong(i1);
            }

            bundle.putLongArray(s, ((long []) (obj1)));
            return;
        }
        if (((String) (obj1)).equals("float"))
        {
            bundle.putFloat(s, (float)((JSONObject) (obj)).getDouble("value"));
            return;
        }
        if (((String) (obj1)).equals("float[]"))
        {
            obj = ((JSONObject) (obj)).getJSONArray("value");
            obj1 = new float[((JSONArray) (obj)).length()];
            for (int j1 = ((flag4) ? 1 : 0); j1 < obj1.length; j1++)
            {
                obj1[j1] = (float)((JSONArray) (obj)).getDouble(j1);
            }

            bundle.putFloatArray(s, ((float []) (obj1)));
            return;
        }
        if (((String) (obj1)).equals("double"))
        {
            bundle.putDouble(s, ((JSONObject) (obj)).getDouble("value"));
            return;
        }
        if (((String) (obj1)).equals("double[]"))
        {
            obj = ((JSONObject) (obj)).getJSONArray("value");
            obj1 = new double[((JSONArray) (obj)).length()];
            for (int k1 = ((flag5) ? 1 : 0); k1 < obj1.length; k1++)
            {
                obj1[k1] = ((JSONArray) (obj)).getDouble(k1);
            }

            bundle.putDoubleArray(s, ((double []) (obj1)));
            return;
        }
        if (!((String) (obj1)).equals("char"))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((JSONObject) (obj)).getString("value");
        if (obj != null && ((String) (obj)).length() == 1)
        {
            bundle.putChar(s, ((String) (obj)).charAt(0));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (((String) (obj1)).equals("char[]"))
        {
            obj = ((JSONObject) (obj)).getJSONArray("value");
            obj1 = new char[((JSONArray) (obj)).length()];
            for (int l1 = 0; l1 < obj1.length; l1++)
            {
                String s1 = ((JSONArray) (obj)).getString(l1);
                if (s1 != null && s1.length() == 1)
                {
                    obj1[l1] = s1.charAt(0);
                }
            }

            bundle.putCharArray(s, ((char []) (obj1)));
            return;
        }
        if (((String) (obj1)).equals("string"))
        {
            bundle.putString(s, ((JSONObject) (obj)).getString("value"));
            return;
        }
        if (((String) (obj1)).equals("stringList"))
        {
            obj1 = ((JSONObject) (obj)).getJSONArray("value");
            int j2 = ((JSONArray) (obj1)).length();
            ArrayList arraylist = new ArrayList(j2);
            int i2 = 0;
            while (i2 < j2) 
            {
                obj = ((JSONArray) (obj1)).get(i2);
                if (obj == JSONObject.NULL)
                {
                    obj = null;
                } else
                {
                    obj = (String)obj;
                }
                arraylist.add(i2, obj);
                i2++;
            }
            bundle.putStringArrayList(s, arraylist);
            return;
        }
        if (((String) (obj1)).equals("enum"))
        {
            try
            {
                bundle.putSerializable(s, Enum.valueOf(Class.forName(((JSONObject) (obj)).getString("enumType")), ((JSONObject) (obj)).getString("value")));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private void serializeKey(String s, Bundle bundle, android.content.SharedPreferences.Editor editor)
        throws JSONException
    {
        Object obj = null;
        int i2 = 0;
        int l3 = 0;
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        int i = 0;
        Object obj1 = bundle.get(s);
        if (obj1 != null)
        {
            JSONObject jsonobject = new JSONObject();
            if (obj1 instanceof Byte)
            {
                jsonobject.put("value", ((Byte)obj1).intValue());
                bundle = null;
                obj = "byte";
            } else
            if (obj1 instanceof Short)
            {
                jsonobject.put("value", ((Short)obj1).intValue());
                bundle = null;
                obj = "short";
            } else
            if (obj1 instanceof Integer)
            {
                jsonobject.put("value", ((Integer)obj1).intValue());
                bundle = null;
                obj = "int";
            } else
            if (obj1 instanceof Long)
            {
                jsonobject.put("value", ((Long)obj1).longValue());
                bundle = null;
                obj = "long";
            } else
            if (obj1 instanceof Float)
            {
                jsonobject.put("value", ((Float)obj1).doubleValue());
                bundle = null;
                obj = "float";
            } else
            if (obj1 instanceof Double)
            {
                jsonobject.put("value", ((Double)obj1).doubleValue());
                bundle = null;
                obj = "double";
            } else
            if (obj1 instanceof Boolean)
            {
                jsonobject.put("value", ((Boolean)obj1).booleanValue());
                bundle = null;
                obj = "bool";
            } else
            if (obj1 instanceof Character)
            {
                jsonobject.put("value", obj1.toString());
                bundle = null;
                obj = "char";
            } else
            if (obj1 instanceof String)
            {
                jsonobject.put("value", (String)obj1);
                bundle = null;
                obj = "string";
            } else
            if (obj1 instanceof Enum)
            {
                jsonobject.put("value", obj1.toString());
                jsonobject.put("enumType", obj1.getClass().getName());
                bundle = null;
                obj = "enum";
            } else
            {
                bundle = new JSONArray();
                if (obj1 instanceof byte[])
                {
                    obj = "byte[]";
                    byte abyte0[] = (byte[])(byte[])obj1;
                    i2 = abyte0.length;
                    while (i < i2) 
                    {
                        bundle.put(abyte0[i]);
                        i++;
                    }
                } else
                if (obj1 instanceof short[])
                {
                    obj = "short[]";
                    short aword0[] = (short[])(short[])obj1;
                    l3 = aword0.length;
                    int j = i2;
                    while (j < l3) 
                    {
                        bundle.put(aword0[j]);
                        j++;
                    }
                } else
                if (obj1 instanceof int[])
                {
                    obj = "int[]";
                    int ai[] = (int[])(int[])obj1;
                    int j2 = ai.length;
                    int k = l3;
                    while (k < j2) 
                    {
                        bundle.put(ai[k]);
                        k++;
                    }
                } else
                if (obj1 instanceof long[])
                {
                    obj = "long[]";
                    long al[] = (long[])(long[])obj1;
                    int k2 = al.length;
                    int l = ((flag) ? 1 : 0);
                    while (l < k2) 
                    {
                        bundle.put(al[l]);
                        l++;
                    }
                } else
                if (obj1 instanceof float[])
                {
                    obj = "float[]";
                    float af[] = (float[])(float[])obj1;
                    int l2 = af.length;
                    int i1 = ((flag1) ? 1 : 0);
                    while (i1 < l2) 
                    {
                        bundle.put(af[i1]);
                        i1++;
                    }
                } else
                if (obj1 instanceof double[])
                {
                    obj = "double[]";
                    double ad[] = (double[])(double[])obj1;
                    int i3 = ad.length;
                    int j1 = ((flag2) ? 1 : 0);
                    while (j1 < i3) 
                    {
                        bundle.put(ad[j1]);
                        j1++;
                    }
                } else
                if (obj1 instanceof boolean[])
                {
                    obj = "bool[]";
                    boolean aflag[] = (boolean[])(boolean[])obj1;
                    int j3 = aflag.length;
                    int k1 = ((flag3) ? 1 : 0);
                    while (k1 < j3) 
                    {
                        bundle.put(aflag[k1]);
                        k1++;
                    }
                } else
                if (obj1 instanceof char[])
                {
                    obj = "char[]";
                    char ac[] = (char[])(char[])obj1;
                    int k3 = ac.length;
                    int l1 = ((flag4) ? 1 : 0);
                    while (l1 < k3) 
                    {
                        bundle.put(String.valueOf(ac[l1]));
                        l1++;
                    }
                } else
                if (obj1 instanceof List)
                {
                    String s1 = "stringList";
                    for (Iterator iterator = ((List)obj1).iterator(); iterator.hasNext(); bundle.put(obj))
                    {
                        String s2 = (String)iterator.next();
                        obj = s2;
                        if (s2 == null)
                        {
                            obj = JSONObject.NULL;
                        }
                    }

                    obj = s1;
                } else
                {
                    bundle = null;
                }
            }
            if (obj != null)
            {
                jsonobject.put("valueType", obj);
                if (bundle != null)
                {
                    jsonobject.putOpt("value", bundle);
                }
                editor.putString(s, jsonobject.toString());
                return;
            }
        }
    }

    public void clear()
    {
        cache.edit().clear().commit();
    }

    public Bundle load()
    {
        Object obj = new Bundle();
        Iterator iterator = cache.getAll().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            try
            {
                deserializeKey(s, ((Bundle) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logger.log(LoggingBehavior.CACHE, 5, TAG, (new StringBuilder()).append("Error reading cached value for key: '").append(s).append("' -- ").append(obj).toString());
                return null;
            }
        } while (true);
        return ((Bundle) (obj));
    }

    public void save(Bundle bundle)
    {
        android.content.SharedPreferences.Editor editor;
        Iterator iterator;
        Validate.notNull(bundle, "bundle");
        editor = cache.edit();
        iterator = bundle.keySet().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s = (String)iterator.next();
        serializeKey(s, bundle, editor);
        if (true) goto _L4; else goto _L3
_L3:
        bundle;
        Logger.log(LoggingBehavior.CACHE, 5, TAG, (new StringBuilder()).append("Error processing value for key: '").append(s).append("' -- ").append(bundle).toString());
_L6:
        return;
_L2:
        if (!editor.commit())
        {
            Logger.log(LoggingBehavior.CACHE, 5, TAG, "SharedPreferences.Editor.commit() was not successful");
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

}
