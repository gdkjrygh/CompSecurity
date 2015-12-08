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
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            AccessTokenSource, LoggingBehavior

final class LegacyTokenHelper
{

    public static final String APPLICATION_ID_KEY = "com.facebook.TokenCachingStrategy.ApplicationId";
    public static final String DECLINED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.DeclinedPermissions";
    public static final String DEFAULT_CACHE_KEY = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
    public static final String EXPIRATION_DATE_KEY = "com.facebook.TokenCachingStrategy.ExpirationDate";
    private static final long INVALID_BUNDLE_MILLISECONDS = 0x8000000000000000L;
    private static final String IS_SSO_KEY = "com.facebook.TokenCachingStrategy.IsSSO";
    private static final String JSON_VALUE = "value";
    private static final String JSON_VALUE_ENUM_TYPE = "enumType";
    private static final String JSON_VALUE_TYPE = "valueType";
    public static final String LAST_REFRESH_DATE_KEY = "com.facebook.TokenCachingStrategy.LastRefreshDate";
    public static final String PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.Permissions";
    private static final String TAG = com/facebook/LegacyTokenHelper.getSimpleName();
    public static final String TOKEN_KEY = "com.facebook.TokenCachingStrategy.Token";
    public static final String TOKEN_SOURCE_KEY = "com.facebook.TokenCachingStrategy.AccessTokenSource";
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

    public LegacyTokenHelper(Context context)
    {
        this(context, null);
    }

    public LegacyTokenHelper(Context context, String s)
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

    public static String getApplicationId(Bundle bundle)
    {
        Validate.notNull(bundle, "bundle");
        return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
    }

    static Date getDate(Bundle bundle, String s)
    {
        long l;
        if (bundle != null)
        {
            if ((l = bundle.getLong(s, 0x8000000000000000L)) != 0x8000000000000000L)
            {
                return new Date(l);
            }
        }
        return null;
    }

    public static Date getExpirationDate(Bundle bundle)
    {
        Validate.notNull(bundle, "bundle");
        return getDate(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
    }

    public static long getExpirationMilliseconds(Bundle bundle)
    {
        Validate.notNull(bundle, "bundle");
        return bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate");
    }

    public static Date getLastRefreshDate(Bundle bundle)
    {
        Validate.notNull(bundle, "bundle");
        return getDate(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
    }

    public static long getLastRefreshMilliseconds(Bundle bundle)
    {
        Validate.notNull(bundle, "bundle");
        return bundle.getLong("com.facebook.TokenCachingStrategy.LastRefreshDate");
    }

    public static Set getPermissions(Bundle bundle)
    {
        Validate.notNull(bundle, "bundle");
        bundle = bundle.getStringArrayList("com.facebook.TokenCachingStrategy.Permissions");
        if (bundle == null)
        {
            return null;
        } else
        {
            return new HashSet(bundle);
        }
    }

    public static AccessTokenSource getSource(Bundle bundle)
    {
        Validate.notNull(bundle, "bundle");
        if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource"))
        {
            return (AccessTokenSource)bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
        }
        if (bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO"))
        {
            return AccessTokenSource.FACEBOOK_APPLICATION_WEB;
        } else
        {
            return AccessTokenSource.WEB_VIEW;
        }
    }

    public static String getToken(Bundle bundle)
    {
        Validate.notNull(bundle, "bundle");
        return bundle.getString("com.facebook.TokenCachingStrategy.Token");
    }

    public static boolean hasTokenInformation(Bundle bundle)
    {
        String s;
        if (bundle != null)
        {
            if ((s = bundle.getString("com.facebook.TokenCachingStrategy.Token")) != null && s.length() != 0 && bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) != 0L)
            {
                return true;
            }
        }
        return false;
    }

    public static void putApplicationId(Bundle bundle, String s)
    {
        Validate.notNull(bundle, "bundle");
        bundle.putString("com.facebook.TokenCachingStrategy.ApplicationId", s);
    }

    static void putDate(Bundle bundle, String s, Date date)
    {
        bundle.putLong(s, date.getTime());
    }

    public static void putDeclinedPermissions(Bundle bundle, Collection collection)
    {
        Validate.notNull(bundle, "bundle");
        Validate.notNull(collection, "value");
        bundle.putStringArrayList("com.facebook.TokenCachingStrategy.DeclinedPermissions", new ArrayList(collection));
    }

    public static void putExpirationDate(Bundle bundle, Date date)
    {
        Validate.notNull(bundle, "bundle");
        Validate.notNull(date, "value");
        putDate(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate", date);
    }

    public static void putExpirationMilliseconds(Bundle bundle, long l)
    {
        Validate.notNull(bundle, "bundle");
        bundle.putLong("com.facebook.TokenCachingStrategy.ExpirationDate", l);
    }

    public static void putLastRefreshDate(Bundle bundle, Date date)
    {
        Validate.notNull(bundle, "bundle");
        Validate.notNull(date, "value");
        putDate(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate", date);
    }

    public static void putLastRefreshMilliseconds(Bundle bundle, long l)
    {
        Validate.notNull(bundle, "bundle");
        bundle.putLong("com.facebook.TokenCachingStrategy.LastRefreshDate", l);
    }

    public static void putPermissions(Bundle bundle, Collection collection)
    {
        Validate.notNull(bundle, "bundle");
        Validate.notNull(collection, "value");
        bundle.putStringArrayList("com.facebook.TokenCachingStrategy.Permissions", new ArrayList(collection));
    }

    public static void putSource(Bundle bundle, AccessTokenSource accesstokensource)
    {
        Validate.notNull(bundle, "bundle");
        bundle.putSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource", accesstokensource);
    }

    public static void putToken(Bundle bundle, String s)
    {
        Validate.notNull(bundle, "bundle");
        Validate.notNull(s, "value");
        bundle.putString("com.facebook.TokenCachingStrategy.Token", s);
    }

    private void serializeKey(String s, Bundle bundle, android.content.SharedPreferences.Editor editor)
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
        cache.edit().clear().apply();
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
        Validate.notNull(bundle, "bundle");
        android.content.SharedPreferences.Editor editor = cache.edit();
        Iterator iterator = bundle.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            try
            {
                serializeKey(s, bundle, editor);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                Logger.log(LoggingBehavior.CACHE, 5, TAG, (new StringBuilder()).append("Error processing value for key: '").append(s).append("' -- ").append(bundle).toString());
                return;
            }
        } while (true);
        editor.apply();
    }

}
