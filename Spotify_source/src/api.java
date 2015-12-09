// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.LoggingBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class api extends apj
{

    private String a;
    private SharedPreferences b;

    public api(Context context)
    {
        this(context, (byte)0);
    }

    private api(Context context, byte byte0)
    {
        Object obj = null;
        super();
        ars.a(context, "context");
        if (arp.a(null))
        {
            obj = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
        }
        a = ((String) (obj));
        obj = context.getApplicationContext();
        if (obj != null)
        {
            context = ((Context) (obj));
        }
        b = context.getSharedPreferences(a, 0);
    }

    private void a(String s, Bundle bundle)
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
        obj = new JSONObject(b.getString(s, "{}"));
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

    public final Bundle a()
    {
        Object obj = new Bundle();
        Iterator iterator = b.getAll().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            try
            {
                a(s, ((Bundle) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                LoggingBehavior loggingbehavior = LoggingBehavior.d;
                (new StringBuilder("Error reading cached value for key: '")).append(s).append("' -- ").append(obj);
                arb.c();
                return null;
            }
        } while (true);
        return ((Bundle) (obj));
    }

    public final void a(Bundle bundle)
    {
        android.content.SharedPreferences.Editor editor;
        Iterator iterator;
        ars.a(bundle, "bundle");
        editor = b.edit();
        iterator = bundle.keySet().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s = (String)iterator.next();
        Object obj2 = bundle.get(s);
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        JSONObject jsonobject = new JSONObject();
        if (!(obj2 instanceof Byte)) goto _L6; else goto _L5
_L5:
        Object obj1 = "byte";
        jsonobject.put("value", ((Byte)obj2).intValue());
        Object obj = null;
_L8:
        if (obj1 == null) goto _L4; else goto _L7
_L7:
        jsonobject.put("valueType", obj1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        jsonobject.putOpt("value", obj);
        editor.putString(s, jsonobject.toString());
          goto _L4
        bundle;
        obj = LoggingBehavior.d;
        (new StringBuilder("Error processing value for key: '")).append(s).append("' -- ").append(bundle);
        arb.c();
_L42:
        return;
_L6:
        if (!(obj2 instanceof Short))
        {
            break MISSING_BLOCK_LABEL_213;
        }
        obj1 = "short";
        jsonobject.put("value", ((Short)obj2).intValue());
        obj = null;
          goto _L8
        if (!(obj2 instanceof Integer))
        {
            break MISSING_BLOCK_LABEL_245;
        }
        obj1 = "int";
        jsonobject.put("value", ((Integer)obj2).intValue());
        obj = null;
          goto _L8
        if (!(obj2 instanceof Long))
        {
            break MISSING_BLOCK_LABEL_277;
        }
        obj1 = "long";
        jsonobject.put("value", ((Long)obj2).longValue());
        obj = null;
          goto _L8
        if (!(obj2 instanceof Float))
        {
            break MISSING_BLOCK_LABEL_309;
        }
        obj1 = "float";
        jsonobject.put("value", ((Float)obj2).doubleValue());
        obj = null;
          goto _L8
        if (!(obj2 instanceof Double))
        {
            break MISSING_BLOCK_LABEL_341;
        }
        obj1 = "double";
        jsonobject.put("value", ((Double)obj2).doubleValue());
        obj = null;
          goto _L8
        if (!(obj2 instanceof Boolean))
        {
            break MISSING_BLOCK_LABEL_373;
        }
        obj1 = "bool";
        jsonobject.put("value", ((Boolean)obj2).booleanValue());
        obj = null;
          goto _L8
        if (!(obj2 instanceof Character))
        {
            break MISSING_BLOCK_LABEL_402;
        }
        obj1 = "char";
        jsonobject.put("value", obj2.toString());
        obj = null;
          goto _L8
        if (!(obj2 instanceof String))
        {
            break MISSING_BLOCK_LABEL_431;
        }
        obj1 = "string";
        jsonobject.put("value", (String)obj2);
        obj = null;
          goto _L8
        if (!(obj2 instanceof Enum))
        {
            break MISSING_BLOCK_LABEL_478;
        }
        obj1 = "enum";
        jsonobject.put("value", obj2.toString());
        jsonobject.put("enumType", obj2.getClass().getName());
        obj = null;
          goto _L8
        obj = new JSONArray();
        if (!(obj2 instanceof byte[])) goto _L10; else goto _L9
_L9:
        int j;
        obj1 = (byte[])obj2;
        j = obj1.length;
        int i = 0;
_L12:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((JSONArray) (obj)).put(obj1[i]);
        i++;
        if (true) goto _L12; else goto _L11
_L10:
        if (!(obj2 instanceof short[])) goto _L14; else goto _L13
_L13:
        obj1 = (short[])obj2;
        j = obj1.length;
        i = 0;
_L16:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((JSONArray) (obj)).put(obj1[i]);
        i++;
        if (true) goto _L16; else goto _L15
_L14:
        if (!(obj2 instanceof int[])) goto _L18; else goto _L17
_L17:
        obj1 = (int[])obj2;
        j = obj1.length;
        i = 0;
_L20:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((JSONArray) (obj)).put(obj1[i]);
        i++;
        if (true) goto _L20; else goto _L19
_L18:
        if (!(obj2 instanceof long[])) goto _L22; else goto _L21
_L21:
        obj1 = (long[])obj2;
        j = obj1.length;
        i = 0;
_L24:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((JSONArray) (obj)).put(obj1[i]);
        i++;
        if (true) goto _L24; else goto _L23
_L22:
        if (!(obj2 instanceof float[])) goto _L26; else goto _L25
_L25:
        obj1 = (float[])obj2;
        j = obj1.length;
        i = 0;
_L28:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((JSONArray) (obj)).put(obj1[i]);
        i++;
        if (true) goto _L28; else goto _L27
_L26:
        if (!(obj2 instanceof double[])) goto _L30; else goto _L29
_L29:
        obj1 = (double[])obj2;
        j = obj1.length;
        i = 0;
_L32:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((JSONArray) (obj)).put(obj1[i]);
        i++;
        if (true) goto _L32; else goto _L31
_L30:
        if (!(obj2 instanceof boolean[])) goto _L34; else goto _L33
_L33:
        obj1 = (boolean[])obj2;
        j = obj1.length;
        i = 0;
_L36:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((JSONArray) (obj)).put(obj1[i]);
        i++;
        if (true) goto _L36; else goto _L35
_L34:
        if (!(obj2 instanceof char[])) goto _L38; else goto _L37
_L37:
        obj1 = (char[])obj2;
        j = obj1.length;
        i = 0;
_L40:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((JSONArray) (obj)).put(String.valueOf(obj1[i]));
        i++;
        if (true) goto _L40; else goto _L39
_L38:
        Iterator iterator1;
        if (!(obj2 instanceof List))
        {
            break MISSING_BLOCK_LABEL_927;
        }
        iterator1 = ((List)obj2).iterator();
_L41:
        if (!iterator1.hasNext())
        {
            break MISSING_BLOCK_LABEL_921;
        }
        obj2 = (String)iterator1.next();
        obj1 = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_912;
        }
        obj1 = JSONObject.NULL;
        ((JSONArray) (obj)).put(obj1);
          goto _L41
        obj1 = "stringList";
          goto _L8
        obj = null;
        obj1 = null;
          goto _L8
_L2:
        if (!editor.commit())
        {
            bundle = LoggingBehavior.d;
            arb.c();
            return;
        }
          goto _L42
_L11:
        obj1 = "byte[]";
          goto _L8
_L15:
        obj1 = "short[]";
          goto _L8
_L19:
        obj1 = "int[]";
          goto _L8
_L23:
        obj1 = "long[]";
          goto _L8
_L27:
        obj1 = "float[]";
          goto _L8
_L31:
        obj1 = "double[]";
          goto _L8
_L35:
        obj1 = "bool[]";
          goto _L8
_L39:
        obj1 = "char[]";
          goto _L8
    }

    public final void b()
    {
        b.edit().clear().commit();
    }

    static 
    {
        api.getSimpleName();
    }
}
