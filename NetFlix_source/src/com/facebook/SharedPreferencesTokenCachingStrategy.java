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
            obj1 = new boolean[((JSONArray) (obj)).length()];
            for (int i = 0; i < obj1.length; i++)
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
            for (int j = 0; j < obj1.length; j++)
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
            for (int k = 0; k < obj1.length; k++)
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
            for (int l = 0; l < obj1.length; l++)
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
            for (int i1 = 0; i1 < obj1.length; i1++)
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
            for (int j1 = 0; j1 < obj1.length; j1++)
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
            for (int k1 = 0; k1 < obj1.length; k1++)
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
        Object obj1 = bundle.get(s);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        JSONObject jsonobject;
        bundle = null;
        obj = null;
        jsonobject = new JSONObject();
        if (!(obj1 instanceof Byte))
        {
            break; /* Loop/switch isn't completed */
        }
        bundle = "byte";
        jsonobject.put("value", ((Byte)obj1).intValue());
_L4:
        if (bundle != null)
        {
            jsonobject.put("valueType", bundle);
            if (obj != null)
            {
                jsonobject.putOpt("value", obj);
            }
            editor.putString(s, jsonobject.toString());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (obj1 instanceof Short)
        {
            bundle = "short";
            jsonobject.put("value", ((Short)obj1).intValue());
        } else
        if (obj1 instanceof Integer)
        {
            bundle = "int";
            jsonobject.put("value", ((Integer)obj1).intValue());
        } else
        if (obj1 instanceof Long)
        {
            bundle = "long";
            jsonobject.put("value", ((Long)obj1).longValue());
        } else
        if (obj1 instanceof Float)
        {
            bundle = "float";
            jsonobject.put("value", ((Float)obj1).doubleValue());
        } else
        if (obj1 instanceof Double)
        {
            bundle = "double";
            jsonobject.put("value", ((Double)obj1).doubleValue());
        } else
        if (obj1 instanceof Boolean)
        {
            bundle = "bool";
            jsonobject.put("value", ((Boolean)obj1).booleanValue());
        } else
        if (obj1 instanceof Character)
        {
            bundle = "char";
            jsonobject.put("value", obj1.toString());
        } else
        if (obj1 instanceof String)
        {
            bundle = "string";
            jsonobject.put("value", (String)obj1);
        } else
        {
label0:
            {
                if (!(obj1 instanceof Enum))
                {
                    break label0;
                }
                bundle = "enum";
                jsonobject.put("value", obj1.toString());
                jsonobject.put("enumType", obj1.getClass().getName());
            }
        }
          goto _L4
        JSONArray jsonarray;
        String s1;
        int i;
        int j;
        jsonarray = new JSONArray();
        if (!(obj1 instanceof byte[]))
        {
            break MISSING_BLOCK_LABEL_446;
        }
        s1 = "byte[]";
        obj1 = (byte[])(byte[])obj1;
        j = obj1.length;
        i = 0;
_L6:
        obj = jsonarray;
        bundle = s1;
        if (i >= j) goto _L4; else goto _L5
_L5:
        jsonarray.put(obj1[i]);
        i++;
          goto _L6
        if (!(obj1 instanceof short[]))
        {
            break MISSING_BLOCK_LABEL_510;
        }
        s1 = "short[]";
        obj1 = (short[])(short[])obj1;
        j = obj1.length;
        i = 0;
_L8:
        obj = jsonarray;
        bundle = s1;
        if (i >= j) goto _L4; else goto _L7
_L7:
        jsonarray.put(obj1[i]);
        i++;
          goto _L8
        if (!(obj1 instanceof int[]))
        {
            break MISSING_BLOCK_LABEL_574;
        }
        s1 = "int[]";
        obj1 = (int[])(int[])obj1;
        j = obj1.length;
        i = 0;
_L10:
        obj = jsonarray;
        bundle = s1;
        if (i >= j) goto _L4; else goto _L9
_L9:
        jsonarray.put(obj1[i]);
        i++;
          goto _L10
        if (!(obj1 instanceof long[]))
        {
            break MISSING_BLOCK_LABEL_638;
        }
        s1 = "long[]";
        obj1 = (long[])(long[])obj1;
        j = obj1.length;
        i = 0;
_L12:
        obj = jsonarray;
        bundle = s1;
        if (i >= j) goto _L4; else goto _L11
_L11:
        jsonarray.put(obj1[i]);
        i++;
          goto _L12
        if (!(obj1 instanceof float[]))
        {
            break MISSING_BLOCK_LABEL_703;
        }
        s1 = "float[]";
        obj1 = (float[])(float[])obj1;
        j = obj1.length;
        i = 0;
_L14:
        obj = jsonarray;
        bundle = s1;
        if (i >= j) goto _L4; else goto _L13
_L13:
        jsonarray.put(obj1[i]);
        i++;
          goto _L14
        if (!(obj1 instanceof double[]))
        {
            break MISSING_BLOCK_LABEL_767;
        }
        s1 = "double[]";
        obj1 = (double[])(double[])obj1;
        j = obj1.length;
        i = 0;
_L16:
        obj = jsonarray;
        bundle = s1;
        if (i >= j) goto _L4; else goto _L15
_L15:
        jsonarray.put(obj1[i]);
        i++;
          goto _L16
        if (!(obj1 instanceof boolean[]))
        {
            break MISSING_BLOCK_LABEL_831;
        }
        s1 = "bool[]";
        obj1 = (boolean[])(boolean[])obj1;
        j = obj1.length;
        i = 0;
_L18:
        obj = jsonarray;
        bundle = s1;
        if (i >= j) goto _L4; else goto _L17
_L17:
        jsonarray.put(obj1[i]);
        i++;
          goto _L18
        if (!(obj1 instanceof char[]))
        {
            break MISSING_BLOCK_LABEL_898;
        }
        s1 = "char[]";
        obj1 = (char[])(char[])obj1;
        j = obj1.length;
        i = 0;
_L20:
        obj = jsonarray;
        bundle = s1;
        if (i >= j) goto _L4; else goto _L19
_L19:
        jsonarray.put(String.valueOf(obj1[i]));
        i++;
          goto _L20
        if (!(obj1 instanceof List))
        {
            break MISSING_BLOCK_LABEL_973;
        }
        s1 = "stringList";
        obj1 = ((List)obj1).iterator();
_L22:
        obj = jsonarray;
        bundle = s1;
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L21
_L21:
        obj = (String)((Iterator) (obj1)).next();
        bundle = ((Bundle) (obj));
        if (obj == null)
        {
            bundle = ((Bundle) (JSONObject.NULL));
        }
        jsonarray.put(bundle);
          goto _L22
        obj = null;
          goto _L4
    }

    public void clear()
    {
        cache.edit().clear().commit();
    }

    public Bundle load()
    {
        Bundle bundle;
        Iterator iterator;
        bundle = new Bundle();
        iterator = cache.getAll().keySet().iterator();
_L2:
        Object obj;
        obj = bundle;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (String)iterator.next();
        deserializeKey(((String) (obj)), bundle);
        if (true) goto _L2; else goto _L1
        JSONException jsonexception;
        jsonexception;
        Logger.log(LoggingBehavior.CACHE, 5, TAG, (new StringBuilder()).append("Error reading cached value for key: '").append(((String) (obj))).append("' -- ").append(jsonexception).toString());
        obj = null;
_L1:
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
