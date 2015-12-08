// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.leanplum:
//            Leanplum, LeanplumDeviceIdMode, g, LeanplumActivityHelper

final class Util
{

    private static final Executor a = Executors.newCachedThreadPool();
    private static boolean b = false;
    private static boolean c = false;

    private static DeviceIdInfo a(Context context)
    {
        try
        {
            context = ((Context) (Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[] {
                android/content/Context
            }).invoke(null, new Object[] {
                context
            })));
            context = new DeviceIdInfo((String)context.getClass().getMethod("getId", new Class[0]).invoke(context, new Object[0]), ((Boolean)context.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(context, new Object[0])).booleanValue());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (context.getClass().getName().equals("GooglePlayServicesNotAvailableException"))
            {
                Log.e("Leanplum", "Error getting advertising ID. Google Play services are not available.");
                return null;
            } else
            {
                throw context;
            }
        }
        return context;
    }

    public static DeviceIdInfo a(LeanplumDeviceIdMode leanplumdeviceidmode)
    {
        Context context;
        context = Leanplum.a();
        if (!leanplumdeviceidmode.equals(LeanplumDeviceIdMode.ADVERTISING_ID))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        Object obj = a(context);
        if (obj != null)
        {
            return ((DeviceIdInfo) (obj));
        }
        break MISSING_BLOCK_LABEL_35;
        Exception exception;
        exception;
        Log.e("Leanplum", "Error getting advertising ID", exception);
        if (e() || leanplumdeviceidmode.equals(LeanplumDeviceIdMode.ANDROID_ID))
        {
            return new DeviceIdInfo(android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id"));
        }
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE") != 0) goto _L2; else goto _L1
_L1:
        leanplumdeviceidmode = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo();
        if (leanplumdeviceidmode == null) goto _L4; else goto _L3
_L3:
        if (leanplumdeviceidmode.getMacAddress() != null) goto _L5; else goto _L4
_L9:
        if (leanplumdeviceidmode == null) goto _L2; else goto _L6
_L6:
        leanplumdeviceidmode = new DeviceIdInfo(leanplumdeviceidmode);
        return leanplumdeviceidmode;
        leanplumdeviceidmode;
        leanplumdeviceidmode.printStackTrace();
_L2:
        return new DeviceIdInfo(android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id"));
_L5:
        leanplumdeviceidmode = leanplumdeviceidmode.getMacAddress();
        exception = MessageDigest.getInstance("MD5");
        exception.update(leanplumdeviceidmode.getBytes());
        leanplumdeviceidmode = exception.digest();
        exception = new StringBuffer();
        int k = 0;
_L7:
        if (k >= leanplumdeviceidmode.length)
        {
            leanplumdeviceidmode = exception.toString();
            continue; /* Loop/switch isn't completed */
        }
        exception.append(String.format("%02x", new Object[] {
            Byte.valueOf(leanplumdeviceidmode[k])
        }));
        k++;
        if (true) goto _L7; else goto _L4
_L4:
        leanplumdeviceidmode = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static transient Object a(Map map, Object aobj[])
    {
        if (map != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return obj;
_L2:
        int l = aobj.length;
        int k = 0;
        do
        {
            obj = map;
            if (k >= l)
            {
                continue;
            }
            obj = aobj[k];
            if (!((Map)map).containsKey(obj))
            {
                return null;
            }
            map = ((Map) (((Map)map).get(obj)));
            k++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String a()
    {
        Object obj = Leanplum.a();
        try
        {
            obj = ((Context) (obj)).getPackageManager().getPackageInfo(((Context) (obj)).getPackageName(), 0).versionName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return "";
        }
        return ((String) (obj));
    }

    private static String a(String s)
    {
        String s1;
        if (s == null || s.length() == 0)
        {
            s1 = "";
        } else
        {
            char c1 = s.charAt(0);
            s1 = s;
            if (!Character.isUpperCase(c1))
            {
                return (new StringBuilder(String.valueOf(Character.toUpperCase(c1)))).append(s.substring(1)).toString();
            }
        }
        return s1;
    }

    private static String a(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag = true;
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                return stringbuilder.toString();
            }
            NameValuePair namevaluepair = (NameValuePair)list.next();
            if (namevaluepair.getValue() == null)
            {
                Log.w("Leanplum", (new StringBuilder("Request param ")).append(namevaluepair.getName()).append(" is null").toString());
            } else
            {
                if (flag)
                {
                    flag = false;
                } else
                {
                    stringbuilder.append("&");
                }
                stringbuilder.append(namevaluepair.getName());
                stringbuilder.append("=");
                stringbuilder.append(URLEncoder.encode(namevaluepair.getValue(), "UTF-8"));
            }
        } while (true);
    }

    private static HttpURLConnection a(String s, String s1, String s2, boolean flag, int k)
    {
        if (!s1.startsWith("http"))
        {
            String s3;
            if (flag)
            {
                s3 = "https://";
            } else
            {
                s3 = "http://";
            }
            s1 = (new StringBuilder(String.valueOf(s3))).append(s).append("/").append(s1).toString();
        }
        s = (HttpURLConnection)(new URL(s1)).openConnection();
        if (flag)
        {
            s1 = (SSLSocketFactory)SSLSocketFactory.getDefault();
            ((HttpsURLConnection)s).setSSLSocketFactory(s1);
        }
        s.setReadTimeout(k * 1000);
        s.setConnectTimeout(k * 1000);
        s.setRequestMethod(s2);
        if (s2.equals("GET"))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        s.setDoOutput(flag);
        s.setDoInput(true);
        s.setUseCaches(false);
        s.setInstanceFollowRedirects(true);
        return s;
    }

    public static HttpURLConnection a(String s, String s1, Map map, String s2, boolean flag, int k)
    {
        String s3 = s1;
        if (!s2.equals("GET")) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        iterator = map.keySet().iterator();
        s3 = "";
_L6:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        s3 = (new StringBuilder(String.valueOf(s1))).append(s3).toString();
_L2:
        s = a(s, s3, s2, flag, k);
        if (!s2.equals("GET"))
        {
            a(map, ((HttpURLConnection) (s)));
        }
        if (g.m && g.k)
        {
            Log.d("Leanplum", (new StringBuilder("Sending request at path ")).append(s3).append(" with parameters ").append(map).toString());
        }
        return s;
_L4:
        String s4 = (String)iterator.next();
        String s5 = (String)map.get(s4);
        if (s5 == null)
        {
            Log.w("Leanplum", (new StringBuilder("Request param ")).append(s4).append(" is null").toString());
        } else
        {
            StringBuilder stringbuilder = new StringBuilder(String.valueOf(s3));
            char c1;
            if (s3.length() == 0)
            {
                c1 = '?';
            } else
            {
                c1 = '&';
            }
            s3 = (new StringBuilder(String.valueOf(stringbuilder.append(c1).toString()))).append(s4).append("=").append(URLEncoder.encode(s5, "utf-8")).toString();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static HttpURLConnection a(String s, List list, List list1, String s1, String s2, Map map, String s3, boolean flag, 
            int k)
    {
        s2 = a(s1, s2, s3, flag, 60);
        s2.setRequestProperty("Content-Type", "multipart/form-data; boundary===================================leanplum");
        s2.setRequestProperty("Connection", "Keep-Alive");
        s3 = new DataOutputStream(s2.getOutputStream());
        s1 = map.keySet().iterator();
_L4:
        if (!s1.hasNext())
        {
            k = 0;
            break MISSING_BLOCK_LABEL_75;
        } else
        {
            String s4 = (String)s1.next();
            s3.writeBytes((new StringBuilder("--==================================leanplum\r\nContent-Disposition: form-data; name=\"")).append(s4).append("\"\r\n").append("\r\n").append((String)map.get(s4)).append("\r\n").toString());
            continue; /* Loop/switch isn't completed */
        }
_L1:
        int l;
        if (k >= list.size())
        {
            s3.writeBytes("--==================================leanplum--\r\n");
            s3.flush();
            s3.close();
            return s2;
        }
        s1 = (File)list.get(k);
        map = String.format("Content-Disposition: form-data; name=\"%s%d\";filename=\"%s\"", new Object[] {
            s, Integer.valueOf(k), s1.getName()
        });
        s3.writeBytes((new StringBuilder("--==================================leanplum\r\n")).append(map).append("\r\nContent-Type: application/octet-stream").append("\r\n\r\n").toString());
        if (k < list1.size())
        {
            s1 = (InputStream)list1.get(k);
        } else
        {
            s1 = new FileInputStream(s1);
        }
        map = new byte[4096];
_L2:
        l = s1.read(map);
label0:
        {
            if (l != -1)
            {
                break label0;
            }
            s1.close();
            s3.writeBytes("\r\n");
            k++;
        }
          goto _L1
        s3.write(map, 0, l);
          goto _L2
        s;
        Log.e("Leanplum", (new StringBuilder("Unable to read file while uploading ")).append(list.get(k)).toString());
        s1.close();
        return null;
        s;
        s1.close();
        throw s;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static JSONObject a(HttpURLConnection httpurlconnection)
    {
        StringBuilder stringbuilder;
        if (httpurlconnection.getResponseCode() < 400)
        {
            httpurlconnection = httpurlconnection.getInputStream();
        } else
        {
            httpurlconnection = httpurlconnection.getErrorStream();
        }
        httpurlconnection = new BufferedReader(new InputStreamReader(httpurlconnection));
        stringbuilder = new StringBuilder();
        do
        {
            String s = httpurlconnection.readLine();
            if (s == null)
            {
                httpurlconnection = stringbuilder.toString();
                if (g.m && g.k)
                {
                    Log.d("Leanplum", (new StringBuilder("Received response ")).append(httpurlconnection).toString());
                }
                return new JSONObject(new JSONTokener(httpurlconnection));
            }
            stringbuilder.append(s).append("\n");
        } while (true);
    }

    public static transient void a(AsyncTask asynctask, Object aobj[])
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            asynctask.executeOnExecutor(a, aobj);
            return;
        } else
        {
            asynctask.execute(aobj);
            return;
        }
    }

    public static void a(URLConnection urlconnection, OutputStream outputstream)
    {
        urlconnection = urlconnection.getInputStream();
        byte abyte0[] = new byte[4096];
        do
        {
            int k = urlconnection.read(abyte0);
            if (k == -1)
            {
                outputstream.close();
                return;
            }
            outputstream.write(abyte0, 0, k);
        } while (true);
    }

    public static void a(Map map)
    {
        Object obj1 = Leanplum.a();
        SharedPreferences sharedpreferences = ((Context) (obj1)).getSharedPreferences("__leanplum__", 0);
        if (sharedpreferences.getBoolean("installTimeInitialized", false))
        {
            return;
        }
        Object obj = ((Context) (obj1)).getPackageManager();
        obj1 = ((Context) (obj1)).getPackageName();
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            try
            {
                PackageInfo packageinfo = ((PackageManager) (obj)).getPackageInfo(((String) (obj1)), 0);
                map.put("installDate", (new StringBuilder()).append((double)packageinfo.firstInstallTime / 1000D).toString());
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception) { }
        }
        try
        {
            obj = new File(((PackageManager) (obj)).getApplicationInfo(((String) (obj1)), 0).sourceDir);
            if (((File) (obj)).exists())
            {
                map.put("updateDate", (new StringBuilder()).append((double)((File) (obj)).lastModified() / 1000D).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Map map) { }
        map = sharedpreferences.edit();
        map.putBoolean("installTimeInitialized", true);
        try
        {
            map.apply();
            return;
        }
        catch (NoSuchMethodError nosuchmethoderror)
        {
            map.commit();
        }
    }

    private static void a(Map map, HttpURLConnection httpurlconnection)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                map = httpurlconnection.getOutputStream();
                httpurlconnection = new BufferedWriter(new OutputStreamWriter(map, "UTF-8"));
                httpurlconnection.write(a(((List) (arraylist))));
                httpurlconnection.close();
                map.close();
                return;
            }
            String s = (String)iterator.next();
            arraylist.add(new BasicNameValuePair(s, (String)map.get(s)));
        } while (true);
    }

    public static String b()
    {
        if (e())
        {
            return "Android Emulator";
        }
        String s = Build.MANUFACTURER;
        String s1 = Build.MODEL;
        if (s1.startsWith(s))
        {
            return a(s1);
        } else
        {
            return (new StringBuilder(String.valueOf(a(s)))).append(" ").append(s1).toString();
        }
    }

    public static String c()
    {
        return "Android OS";
    }

    public static String d()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public static boolean e()
    {
        String s = Build.MODEL.toLowerCase(Locale.getDefault());
        return s.contains("google_sdk") || s.contains("emulator") || s.contains("sdk");
    }

    public static String f()
    {
        if (e())
        {
            return "Android Emulator";
        } else
        {
            return b();
        }
    }

    public static String g()
    {
        String s1 = Locale.getDefault().getLanguage();
        String s = s1;
        if (s1.equals(""))
        {
            s = "xx";
        }
        String s2 = Locale.getDefault().getCountry();
        s1 = s2;
        if (s2.equals(""))
        {
            s1 = "XX";
        }
        return (new StringBuilder(String.valueOf(s))).append("_").append(s1).toString();
    }

    public static boolean h()
    {
        Object obj;
        boolean flag;
        try
        {
            obj = (ConnectivityManager)Leanplum.a().getSystemService("connectivity");
        }
        catch (Exception exception)
        {
            Log.e("Leanplum", "Error getting connectivity info", exception);
            return false;
        }
        if (obj == null)
        {
            return false;
        }
        obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        flag = ((NetworkInfo) (obj)).isConnectedOrConnecting();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        return false;
        return true;
    }

    static boolean i()
    {
        if (b)
        {
            return c;
        }
        Object obj = Leanplum.a().getPackageManager();
        PackageInfo packageinfo;
        try
        {
            packageinfo = ((PackageManager) (obj)).getPackageInfo("com.google.android.gms", 64);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b = true;
            c = false;
            return false;
        }
        if (packageinfo.versionCode < 0x40ba50)
        {
            Log.i("Leanplum", (new StringBuilder("Google Play services version is too old: ")).append(packageinfo.versionCode).toString());
            b = true;
            c = false;
            return false;
        }
        try
        {
            obj = ((PackageManager) (obj)).getApplicationInfo("com.google.android.gms", 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            b = true;
            c = false;
            return false;
        }
        b = true;
        c = ((ApplicationInfo) (obj)).enabled;
        return ((ApplicationInfo) (obj)).enabled;
    }

    public static boolean j()
    {
        return LeanplumActivityHelper.b == null || LeanplumActivityHelper.a;
    }


    private class DeviceIdInfo
    {

        String a;
        boolean b;

        public DeviceIdInfo(String s)
        {
            a = s;
        }

        public DeviceIdInfo(String s, boolean flag)
        {
            a = s;
            b = flag;
        }
    }

}
