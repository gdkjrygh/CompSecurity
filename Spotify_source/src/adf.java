// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class adf
{

    private static SimpleDateFormat a;

    public static int a(java.io.ObjectInputStream.GetField getfield, String s, int i)
    {
        int j;
        try
        {
            j = getfield.get(s, i);
        }
        // Misplaced declaration of an exception variable
        catch (java.io.ObjectInputStream.GetField getfield)
        {
            acl.a().b("Unable to read '%s' field in migration device with message (%s)", new Object[] {
                s, getfield.getMessage()
            });
            return i;
        }
        return j;
    }

    public static int a(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            return 0;
        } else
        {
            return boolean1.hashCode();
        }
    }

    public static int a(Long long1)
    {
        if (long1 == null)
        {
            return 0;
        } else
        {
            return long1.hashCode();
        }
    }

    public static int a(String s)
    {
        if (s == null)
        {
            return 0;
        } else
        {
            return s.hashCode();
        }
    }

    public static Object a(Context context, String s, String s1)
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
        acl.a().b("Read %s: %s", new Object[] {
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
                acl.a().e("Failed to close %s file for reading (%s)", new Object[] {
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
        acl.a().e("Failed to find %s class (%s)", new Object[] {
            s1, ((ClassNotFoundException) (obj1)).getMessage()
        });
        context = ((Context) (obj));
        obj = objectinputstream;
          goto _L1
        s;
        s = context;
        context = objectinputstream;
_L3:
        acl.a().a("%s file not found", new Object[] {
            s1
        });
        obj = context;
        context = s;
          goto _L1
        obj;
        context = ((Context) (obj1));
        s = ((String) (obj1));
        obj2 = objectinputstream;
        acl.a().e("Failed to cast %s object (%s)", new Object[] {
            s1, ((ClassCastException) (obj)).getMessage()
        });
        context = ((Context) (obj1));
        obj = objectinputstream;
          goto _L1
        context;
        obj = obj2;
_L2:
        acl.a().e("Failed to open %s file for reading (%s)", new Object[] {
            s1, context
        });
        context = s;
          goto _L1
        obj;
        context = s2;
        s = s2;
        obj2 = objectinputstream;
        acl.a().e("Failed to read %s object (%s)", new Object[] {
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

    public static Object a(java.io.ObjectInputStream.GetField getfield, String s, Object obj)
    {
        try
        {
            getfield = ((java.io.ObjectInputStream.GetField) (getfield.get(s, obj)));
        }
        // Misplaced declaration of an exception variable
        catch (java.io.ObjectInputStream.GetField getfield)
        {
            acl.a().b("Unable to read '%s' field in migration device with message (%s)", new Object[] {
                s, getfield.getMessage()
            });
            return obj;
        }
        return getfield;
    }

    public static String a(long l)
    {
        if (a == null)
        {
            a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z", Locale.US);
        }
        return a.format(Long.valueOf(l));
    }

    public static String a(java.io.ObjectInputStream.GetField getfield, String s)
    {
        return (String)a(getfield, s, null);
    }

    public static String a(String s, String s1)
    {
        try
        {
            s = s.getBytes("UTF-8");
            s1 = MessageDigest.getInstance(s1);
            s1.update(s, 0, s.length);
            s1 = s1.digest();
            s = new BigInteger(1, s1);
            s1 = (new StringBuilder("%0")).append(s1.length << 1).append("x").toString();
            s = String.format(Locale.US, s1, new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    static String a(Map map)
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
        map = a(System.currentTimeMillis());
        stringbuilder.append("&");
        stringbuilder.append(URLEncoder.encode("sent_at", "UTF-8"));
        stringbuilder.append("=");
        stringbuilder.append(URLEncoder.encode(map, "UTF-8"));
        return stringbuilder.toString();
    }

    public static JSONObject a(HttpsURLConnection httpsurlconnection)
    {
        StringBuffer stringbuffer;
        act act1;
        stringbuffer = new StringBuffer();
        act1 = acl.a();
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
        act1.e("Failed to read response. (%s)", new Object[] {
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
        act1.a("Response: %s", new Object[] {
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
                acl.a().e("Failed to parse json response. (%s)", new Object[] {
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
                    act1.c("%s", new Object[] {
                        s
                    });
                } else
                {
                    act1.e("%s", new Object[] {
                        s
                    });
                }
                return httpsurlconnection;
            }
        }
        return null;
    }

    public static void a(Object obj, Context context, String s, String s1)
    {
        Object obj1 = null;
        context = context.openFileOutput(s, 0);
        obj1 = context;
        s = new BufferedOutputStream(context);
        context = new ObjectOutputStream(s);
        obj1 = context;
        context.writeObject(obj);
        obj1 = context;
        acl.a().b("Wrote %s: %s", new Object[] {
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
            acl.a().e("Failed to serialize %s", new Object[] {
                s1
            });
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
_L3:
        acl.a().e("Failed to open %s for writing (%s)", new Object[] {
            s1, obj
        });
        context = ((Context) (obj1));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        acl.a().e("Failed to close %s file for writing (%s)", new Object[] {
            s1, obj
        });
        return;
        obj;
        obj1 = s;
          goto _L3
    }

    public static boolean a(Context context, String s)
    {
        return context.checkCallingOrSelfPermission(s) == 0;
    }

    public static boolean a(java.io.ObjectInputStream.GetField getfield, String s, boolean flag)
    {
        boolean flag1;
        try
        {
            flag1 = getfield.get(s, flag);
        }
        // Misplaced declaration of an exception variable
        catch (java.io.ObjectInputStream.GetField getfield)
        {
            acl.a().b("Unable to read '%s' field in migration device with message (%s)", new Object[] {
                s, getfield.getMessage()
            });
            return flag;
        }
        return flag1;
    }

    public static boolean a(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            return obj == null && obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public static long b(java.io.ObjectInputStream.GetField getfield, String s)
    {
        long l;
        try
        {
            l = getfield.get(s, -1L);
        }
        // Misplaced declaration of an exception variable
        catch (java.io.ObjectInputStream.GetField getfield)
        {
            acl.a().b("Unable to read '%s' field in migration device with message (%s)", new Object[] {
                s, getfield.getMessage()
            });
            return -1L;
        }
        return l;
    }
}
