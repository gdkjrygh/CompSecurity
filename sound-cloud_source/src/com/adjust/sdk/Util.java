// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//            AdjustFactory, Reflection, ILogger

public class Util
{

    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z";
    private static SimpleDateFormat dateFormat;
    private static final String fieldReadErrorMessage = "Unable to read '%s' field in migration device with message (%s)";

    public Util()
    {
    }

    public static boolean checkPermission(Context context, String s)
    {
        return context.checkCallingOrSelfPermission(s) == 0;
    }

    public static String convertToHex(byte abyte0[])
    {
        BigInteger biginteger = new BigInteger(1, abyte0);
        abyte0 = (new StringBuilder("%0")).append(abyte0.length << 1).append("x").toString();
        return String.format(Locale.US, abyte0, new Object[] {
            biginteger
        });
    }

    public static HttpsURLConnection createGETHttpsURLConnection(String s, String s1)
        throws IOException
    {
        s = createHttpsURLConnection(s, s1);
        s.setRequestMethod("GET");
        return s;
    }

    public static HttpsURLConnection createHttpsURLConnection(String s, String s1)
        throws IOException
    {
        s = AdjustFactory.getHttpsURLConnection(new URL(s));
        s.setRequestProperty("Client-SDK", s1);
        s.setConnectTimeout(60000);
        s.setReadTimeout(60000);
        return s;
    }

    public static HttpsURLConnection createPOSTHttpsURLConnection(String s, String s1, Map map)
        throws IOException
    {
        s = createHttpsURLConnection(s, s1);
        s.setRequestMethod("POST");
        s.setUseCaches(false);
        s.setDoInput(true);
        s.setDoOutput(true);
        s1 = new DataOutputStream(s.getOutputStream());
        s1.writeBytes(getPostDataString(map));
        s1.flush();
        s1.close();
        return s;
    }

    protected static String createUuid()
    {
        return UUID.randomUUID().toString();
    }

    public static String dateFormat(long l)
    {
        if (dateFormat == null)
        {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z", Locale.US);
        }
        return dateFormat.format(Long.valueOf(l));
    }

    public static boolean equalBoolean(Boolean boolean1, Boolean boolean2)
    {
        return equalObject(boolean1, boolean2);
    }

    public static boolean equalEnum(Enum enum, Enum enum1)
    {
        return equalObject(enum, enum1);
    }

    public static boolean equalInt(Integer integer, Integer integer1)
    {
        return equalObject(integer, integer1);
    }

    public static boolean equalLong(Long long1, Long long2)
    {
        return equalObject(long1, long2);
    }

    public static boolean equalObject(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            return obj == null && obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public static boolean equalString(String s, String s1)
    {
        return equalObject(s, s1);
    }

    public static boolean equalsDouble(Double double1, Double double2)
    {
        if (double1 != null && double2 != null) goto _L2; else goto _L1
_L1:
        if (double1 != null || double2 != null) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (Double.doubleToLongBits(double1.doubleValue()) != Double.doubleToLongBits(double2.doubleValue()))
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public static boolean equalsMap(Map map, Map map1)
    {
        if (map == null || map1 == null)
        {
            return map == null && map1 == null;
        } else
        {
            return map.entrySet().equals(map1.entrySet());
        }
    }

    private static ILogger getLogger()
    {
        return AdjustFactory.getLogger();
    }

    public static String getPlayAdId(Context context)
    {
        return Reflection.getPlayAdId(context);
    }

    private static String getPostDataString(Map map)
        throws UnsupportedEncodingException
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) 
        {
            map = (java.util.Map.Entry)iterator.next();
            String s = URLEncoder.encode((String)map.getKey(), "UTF-8");
            map = (String)map.getValue();
            if (map != null)
            {
                map = URLEncoder.encode(map, "UTF-8");
            } else
            {
                map = "";
            }
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("&");
            }
            stringbuilder.append(s);
            stringbuilder.append("=");
            stringbuilder.append(map);
        }
        map = dateFormat(System.currentTimeMillis());
        stringbuilder.append("&");
        stringbuilder.append(URLEncoder.encode("sent_at", "UTF-8"));
        stringbuilder.append("=");
        stringbuilder.append(URLEncoder.encode(map, "UTF-8"));
        return stringbuilder.toString();
    }

    public static String hash(String s, String s1)
    {
        try
        {
            s = s.getBytes("UTF-8");
            s1 = MessageDigest.getInstance(s1);
            s1.update(s, 0, s.length);
            s = convertToHex(s1.digest());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static int hashBoolean(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            return 0;
        } else
        {
            return boolean1.hashCode();
        }
    }

    public static int hashEnum(Enum enum)
    {
        if (enum == null)
        {
            return 0;
        } else
        {
            return enum.hashCode();
        }
    }

    public static int hashLong(Long long1)
    {
        if (long1 == null)
        {
            return 0;
        } else
        {
            return long1.hashCode();
        }
    }

    public static int hashMap(Map map)
    {
        if (map == null)
        {
            return 0;
        } else
        {
            return map.entrySet().hashCode();
        }
    }

    public static int hashString(String s)
    {
        if (s == null)
        {
            return 0;
        } else
        {
            return s.hashCode();
        }
    }

    public static Boolean isPlayTrackingEnabled(Context context)
    {
        return Reflection.isPlayTrackingEnabled(context);
    }

    public static String md5(String s)
    {
        return hash(s, "MD5");
    }

    public static String quote(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            s1 = s;
            if (Pattern.compile("\\s").matcher(s).find())
            {
                return String.format(Locale.US, "'%s'", new Object[] {
                    s
                });
            }
        }
        return s1;
    }

    public static boolean readBooleanField(java.io.ObjectInputStream.GetField getfield, String s, boolean flag)
    {
        boolean flag1;
        try
        {
            flag1 = getfield.get(s, flag);
        }
        // Misplaced declaration of an exception variable
        catch (java.io.ObjectInputStream.GetField getfield)
        {
            getLogger().debug("Unable to read '%s' field in migration device with message (%s)", new Object[] {
                s, getfield.getMessage()
            });
            return flag;
        }
        return flag1;
    }

    public static JSONObject readHttpResponse(HttpsURLConnection httpsurlconnection)
        throws Exception
    {
        StringBuffer stringbuffer;
        ILogger ilogger;
        stringbuffer = new StringBuffer();
        ilogger = getLogger();
        Object obj;
        Integer integer;
        integer = Integer.valueOf(httpsurlconnection.getResponseCode());
        if (integer.intValue() < 400)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        obj = httpsurlconnection.getErrorStream();
_L2:
        obj = new BufferedReader(new InputStreamReader(((java.io.InputStream) (obj))));
_L1:
        String s2 = ((BufferedReader) (obj)).readLine();
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        stringbuffer.append(s2);
          goto _L1
        obj;
        ilogger.error("Failed to read response. (%s)", new Object[] {
            ((Exception) (obj)).getMessage()
        });
        throw obj;
        obj;
        if (httpsurlconnection != null)
        {
            httpsurlconnection.disconnect();
        }
        throw obj;
        obj = httpsurlconnection.getInputStream();
          goto _L2
        if (httpsurlconnection != null)
        {
            httpsurlconnection.disconnect();
        }
        httpsurlconnection = stringbuffer.toString();
        ilogger.verbose("Response: %s", new Object[] {
            httpsurlconnection
        });
        if (httpsurlconnection != null && httpsurlconnection.length() != 0)
        {
            try
            {
                httpsurlconnection = new JSONObject(httpsurlconnection);
            }
            // Misplaced declaration of an exception variable
            catch (HttpsURLConnection httpsurlconnection)
            {
                getLogger().error("Failed to parse json response. (%s)", new Object[] {
                    httpsurlconnection.getMessage()
                });
                httpsurlconnection = null;
            }
            if (httpsurlconnection != null)
            {
                String s1 = httpsurlconnection.optString("message", null);
                String s = s1;
                if (s1 == null)
                {
                    s = "No message found";
                }
                if (integer != null && integer.intValue() == 200)
                {
                    ilogger.info("%s", new Object[] {
                        s
                    });
                } else
                {
                    ilogger.error("%s", new Object[] {
                        s
                    });
                }
                return httpsurlconnection;
            }
        }
        return null;
    }

    public static int readIntField(java.io.ObjectInputStream.GetField getfield, String s, int i)
    {
        int j;
        try
        {
            j = getfield.get(s, i);
        }
        // Misplaced declaration of an exception variable
        catch (java.io.ObjectInputStream.GetField getfield)
        {
            getLogger().debug("Unable to read '%s' field in migration device with message (%s)", new Object[] {
                s, getfield.getMessage()
            });
            return i;
        }
        return j;
    }

    public static long readLongField(java.io.ObjectInputStream.GetField getfield, String s, long l)
    {
        long l1;
        try
        {
            l1 = getfield.get(s, l);
        }
        // Misplaced declaration of an exception variable
        catch (java.io.ObjectInputStream.GetField getfield)
        {
            getLogger().debug("Unable to read '%s' field in migration device with message (%s)", new Object[] {
                s, getfield.getMessage()
            });
            return l;
        }
        return l1;
    }

    public static Object readObject(Context context, String s, String s1)
    {
        Object obj;
        Object obj1;
        String s2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj5 = null;
        obj1 = null;
        obj4 = null;
        obj = null;
        s2 = null;
        obj3 = null;
        obj6 = null;
        context = context.openFileInput(s);
        Object obj2;
        s = ((String) (obj));
        obj2 = context;
        obj = new BufferedInputStream(context);
        ObjectInputStream objectinputstream = new ObjectInputStream(((java.io.InputStream) (obj)));
        obj = obj6;
        context = obj5;
        obj1 = obj4;
        s2 = obj3;
        s = ((String) (objectinputstream.readObject()));
        obj = s;
        context = s;
        obj1 = s;
        s2 = s;
        getLogger().debug("Read %s: %s", new Object[] {
            s1, s
        });
        obj = objectinputstream;
        context = s;
_L1:
        if (obj != null)
        {
            try
            {
                ((Closeable) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                getLogger().error("Failed to close %s file for reading (%s)", new Object[] {
                    s1, s
                });
                return context;
            }
        }
        return context;
        obj1;
        context = ((Context) (obj));
        s = ((String) (obj));
        obj2 = objectinputstream;
        getLogger().error("Failed to find %s class (%s)", new Object[] {
            s1, ((ClassNotFoundException) (obj1)).getMessage()
        });
        context = ((Context) (obj));
        obj = objectinputstream;
          goto _L1
        s;
        s = context;
        context = objectinputstream;
_L3:
        getLogger().verbose("%s file not found", new Object[] {
            s1
        });
        obj = context;
        context = s;
          goto _L1
        obj;
        context = ((Context) (obj1));
        s = ((String) (obj1));
        obj2 = objectinputstream;
        getLogger().error("Failed to cast %s object (%s)", new Object[] {
            s1, ((ClassCastException) (obj)).getMessage()
        });
        context = ((Context) (obj1));
        obj = objectinputstream;
          goto _L1
        context;
        obj = obj2;
_L2:
        getLogger().error("Failed to open %s file for reading (%s)", new Object[] {
            s1, context
        });
        context = s;
          goto _L1
        obj;
        context = s2;
        s = s2;
        obj2 = objectinputstream;
        getLogger().error("Failed to read %s object (%s)", new Object[] {
            s1, ((Exception) (obj)).getMessage()
        });
        context = s2;
        obj = objectinputstream;
          goto _L1
        context;
        obj = null;
        s = s2;
          goto _L2
        context;
        s = s2;
          goto _L2
        context;
        context = null;
        s = ((String) (obj1));
          goto _L3
        s;
        s = ((String) (obj1));
          goto _L3
        context;
        context = ((Context) (obj));
        s = ((String) (obj1));
          goto _L3
    }

    public static Object readObjectField(java.io.ObjectInputStream.GetField getfield, String s, Object obj)
    {
        try
        {
            getfield = ((java.io.ObjectInputStream.GetField) (getfield.get(s, obj)));
        }
        // Misplaced declaration of an exception variable
        catch (java.io.ObjectInputStream.GetField getfield)
        {
            getLogger().debug("Unable to read '%s' field in migration device with message (%s)", new Object[] {
                s, getfield.getMessage()
            });
            return obj;
        }
        return getfield;
    }

    public static String readStringField(java.io.ObjectInputStream.GetField getfield, String s, String s1)
    {
        return (String)readObjectField(getfield, s, s1);
    }

    public static String sha1(String s)
    {
        return hash(s, "SHA-1");
    }

    public static void writeObject(Object obj, Context context, String s, String s1)
    {
        Object obj1 = null;
        context = context.openFileOutput(s, 0);
        obj1 = context;
        s = new BufferedOutputStream(context);
        context = new ObjectOutputStream(s);
        obj1 = context;
        context.writeObject(obj);
        obj1 = context;
        getLogger().debug("Wrote %s: %s", new Object[] {
            s1, obj
        });
_L2:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        context.close();
        return;
        obj;
        obj1 = context;
        try
        {
            getLogger().error("Failed to serialize %s", new Object[] {
                s1
            });
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
_L3:
        getLogger().error("Failed to open %s for writing (%s)", new Object[] {
            s1, obj
        });
        context = ((Context) (obj1));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        getLogger().error("Failed to close %s file for writing (%s)", new Object[] {
            s1, obj
        });
        return;
        obj;
        obj1 = s;
          goto _L3
    }
}
