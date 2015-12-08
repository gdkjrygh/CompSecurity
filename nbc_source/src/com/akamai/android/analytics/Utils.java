// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.akamai.android.analytics:
//            CSMAKEYS, InternalCodes

public class Utils
{

    public Utils()
    {
    }

    public static String connectivityType(Context context)
    {
        NetworkInfo networkinfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo.isAvailable() && networkinfo.isConnectedOrConnecting())
        {
            String s = networkinfo.getTypeName();
            String s1 = networkinfo.getSubtypeName();
            context = s;
            if (s1 != null)
            {
                context = s;
                if (s1.length() > 0)
                {
                    context = (new StringBuilder(String.valueOf(s))).append(":").append(networkinfo.getSubtypeName()).toString();
                }
            }
            return context;
        } else
        {
            return "-";
        }
    }

    public static String generateUniqueId(Context context, boolean flag)
    {
        SharedPreferences sharedpreferences = null;
        SharedPreferences sharedpreferences1 = context.getSharedPreferences("AnalyticsData", 0);
        sharedpreferences = sharedpreferences1;
        String s1 = sharedpreferences1.getString("UNIQUEID", null);
        Object obj1;
        obj1 = sharedpreferences1;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        sharedpreferences = sharedpreferences1;
        obj1 = md5((new StringBuilder(String.valueOf(s1))).append(Long.toString(System.currentTimeMillis())).append(Double.toString(Math.random())).append(Double.toString(Math.random())).toString());
        return ((String) (obj1));
        return s1;
        obj1;
        obj1 = sharedpreferences;
        String s = "";
        Object obj = s;
        boolean flag1 = flag;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        String s2;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        try
        {
            obj2 = (TelephonyManager)context.getSystemService("phone");
        }
        catch (Exception exception)
        {
            obj2 = null;
        }
        obj = null;
        obj5 = null;
        obj4 = null;
        obj3 = null;
        s2 = obj4;
        if (obj2 != null)
        {
            try
            {
                obj = ((TelephonyManager) (obj2)).getDeviceId();
            }
            catch (Exception exception1)
            {
                exception1 = obj5;
            }
            try
            {
                s2 = ((TelephonyManager) (obj2)).getSimSerialNumber();
            }
            catch (Exception exception3)
            {
                exception3 = obj4;
            }
        }
        Exception exception2;
        try
        {
            obj2 = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            obj2 = obj3;
        }
        flag1 = flag;
        if (obj == null)
        {
            flag1 = flag;
            if (s2 == null)
            {
                flag1 = flag;
                if (obj2 == null)
                {
                    flag1 = true;
                }
            }
        }
        context = s;
        obj = (new StringBuilder(String.valueOf(""))).append("DeviceId:").append(((String) (obj))).toString();
        context = ((Context) (obj));
        obj = (new StringBuilder(String.valueOf(obj))).append("SimNo:").append(s2).toString();
        context = ((Context) (obj));
        try
        {
            obj = (new StringBuilder(String.valueOf(obj))).append("AndroidID:").append(((String) (obj2))).toString();
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception2)
        {
            exception2 = context;
        }
        context = md5((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(obj))).append("Build Board:").append(Build.BOARD).toString()))).append("DISPLAY:").append(Build.DISPLAY).toString()))).append("ID:").append(Build.ID).toString()))).append("MODEL:").append(Build.MODEL).toString()))).append("TAGS:").append(Build.TAGS).toString()))).append("USER:").append(Build.USER).toString()))).append("Device:").append(Build.DEVICE).toString()))).append(Long.toString(System.currentTimeMillis())).append(Double.toString(Math.random())).toString());
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_508;
        }
        obj = ((SharedPreferences) (obj1)).edit();
        if (obj != null)
        {
            try
            {
                ((android.content.SharedPreferences.Editor) (obj)).putString("UNIQUEID", context);
                ((android.content.SharedPreferences.Editor) (obj)).commit();
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception1) { }
        }
        if (flag1)
        {
            return md5((new StringBuilder(String.valueOf(context))).append(Long.toString(System.currentTimeMillis())).append(Double.toString(Math.random())).append(Double.toString(Math.random())).toString());
        } else
        {
            return context;
        }
    }

    public static String getBitRateBucketInfo(ArrayList arraylist, HashMap hashmap)
    {
        Object obj;
        HashMap hashmap1;
        StringTokenizer stringtokenizer;
        PluginConfigInfo.MatchRules matchrules;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (hashmap.containsKey(CSMAKEYS.transitionstreamtimes.toString()))
        {
            stringtokenizer = new StringTokenizer((String)hashmap.get(CSMAKEYS.transitionstreamtimes.toString()), ",");
            hashmap1 = new HashMap();
            hashmap = arraylist.iterator();
        } else
        {
            if (hashmap.containsKey(CSMAKEYS.bitratebuckettimes.toString()))
            {
                return (String)hashmap.get(CSMAKEYS.bitratebuckettimes.toString());
            }
            return "-";
        }
        if (hashmap.hasNext()) goto _L2; else goto _L1
_L1:
        if (stringtokenizer.hasMoreTokens()) goto _L4; else goto _L3
_L3:
        hashmap = "";
        obj = arraylist.iterator();
        arraylist = hashmap;
_L14:
        if (!((Iterator) (obj)).hasNext())
        {
            return arraylist.substring(0, arraylist.length() - 1);
        }
        break MISSING_BLOCK_LABEL_546;
_L2:
        hashmap1.put(((PluginConfigInfo.MatchRules)hashmap.next()).key, Integer.valueOf(0));
        break MISSING_BLOCK_LABEL_50;
_L4:
        hashmap = stringtokenizer.nextToken();
        Iterator iterator;
        String s;
        byte byte0;
        try
        {
            l = Integer.parseInt(hashmap.substring(0, hashmap.indexOf(":")));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            l = -1;
        }
        try
        {
            i1 = Integer.parseInt(hashmap.substring(hashmap.indexOf(":") + 1));
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            i1 = 0;
        }
        iterator = arraylist.iterator();
_L11:
        if (!iterator.hasNext()) goto _L1; else goto _L5
_L5:
        matchrules = (PluginConfigInfo.MatchRules)iterator.next();
        byte0 = -1;
        j = -1;
        s = matchrules.value;
        i = byte0;
        k = j;
        if (s == null) goto _L7; else goto _L6
_L6:
        i = byte0;
        k = j;
        if (s.equalsIgnoreCase("-")) goto _L7; else goto _L8
_L8:
        if (s.indexOf("min:") == -1)
        {
            break MISSING_BLOCK_LABEL_301;
        }
        obj = s.substring(s.indexOf("min:") + 4);
        hashmap = ((HashMap) (obj));
        if (((String) (obj)).indexOf(";") != -1)
        {
            hashmap = ((String) (obj)).substring(0, ((String) (obj)).indexOf(";"));
        }
        i = Integer.parseInt(hashmap);
        j = i * 1000;
_L12:
        i = byte0;
        k = j;
        if (s.indexOf("max:") == -1) goto _L7; else goto _L9
_L9:
        obj = s.substring(s.indexOf("max:") + 4);
        hashmap = ((HashMap) (obj));
        if (((String) (obj)).indexOf(";") != -1)
        {
            hashmap = ((String) (obj)).substring(0, ((String) (obj)).indexOf(";"));
        }
        i = Integer.parseInt(hashmap);
        i *= 1000;
        k = j;
_L7:
        if (i != -1 || k != -1)
        {
            break MISSING_BLOCK_LABEL_470;
        }
        if (l != -1 && l != 0) goto _L11; else goto _L10
_L10:
        hashmap1.put(matchrules.key, Integer.valueOf(((Integer)hashmap1.get(matchrules.key)).intValue() + i1));
          goto _L1
        hashmap;
        j = -1;
          goto _L12
        hashmap;
        i = -1;
        k = j;
          goto _L7
        j = k;
        if (k == -1)
        {
            j = 0;
        }
        k = i;
        if (i == -1)
        {
            k = 0x7fffffff;
        }
        if (l < j || l >= k) goto _L11; else goto _L13
_L13:
        hashmap1.put(matchrules.key, Integer.valueOf(((Integer)hashmap1.get(matchrules.key)).intValue() + i1));
          goto _L1
        hashmap = (PluginConfigInfo.MatchRules)((Iterator) (obj)).next();
        arraylist = (new StringBuilder(String.valueOf(arraylist))).append(((PluginConfigInfo.MatchRules) (hashmap)).key).append(":").append(hashmap1.get(((PluginConfigInfo.MatchRules) (hashmap)).key)).append(",").toString();
          goto _L14
    }

    public static String hashMapStrIntToCommaSepStr(HashMap hashmap)
    {
        Object obj = new ArrayList(hashmap.keySet());
        Collections.sort(((java.util.List) (obj)));
        String s = "";
        obj = ((ArrayList) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                hashmap = s;
                if (s.endsWith(","))
                {
                    hashmap = s.substring(0, s.length() - 1);
                }
                return hashmap;
            }
            String s1 = (String)((Iterator) (obj)).next();
            s = (new StringBuilder(String.valueOf(s))).append(s1).append(":").append(hashmap.get(s1)).append(",").toString();
        } while (true);
    }

    public static boolean httpSend(String s, boolean flag)
    {
        Log.d(InternalCodes.debugTAG, (new StringBuilder("HttpSend:")).append(s).append(":TryEncoded:").append(flag).toString());
        Object obj;
        URISyntaxException urisyntaxexception;
        try
        {
            obj = new DefaultHttpClient();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return true;
        }
        ((HttpClient) (obj)).execute(new HttpGet(new URI(s)));
_L2:
        return true;
        urisyntaxexception;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (!s.contains("?")) goto _L2; else goto _L3
_L3:
        urisyntaxexception = s.substring(0, s.indexOf("?") + 1);
        s = s.substring(s.indexOf("?") + 1, s.length());
        httpSend((new StringBuilder(String.valueOf(urisyntaxexception))).append(Uri.encode(s, "=")).toString(), false);
        return true;
        s;
        return true;
        s;
        return true;
        s;
        return true;
        s;
        return true;
        s;
        return true;
    }

    public static String md5(String s)
    {
        if (s == null)
        {
            return null;
        }
        Object obj;
        int i;
        try
        {
            obj = MessageDigest.getInstance("MD5");
            ((MessageDigest) (obj)).update(s.getBytes());
            s = ((MessageDigest) (obj)).digest();
            obj = new StringBuffer();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        i = 0;
        if (i >= s.length)
        {
            return ((StringBuffer) (obj)).toString();
        }
        ((StringBuffer) (obj)).append(Integer.toHexString(s[i] & 0xff));
        i++;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_36;
        }
    }

    public static HashMap splitStrToStrInt(String s)
    {
        HashMap hashmap;
        int i;
        i = 0;
        hashmap = new HashMap();
        if (s != null && !s.equals("-")) goto _L2; else goto _L1
_L1:
        return hashmap;
_L2:
        String as[];
        int j;
        try
        {
            s = s.split(",");
            j = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return hashmap;
        }
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        as = s[i].split(":", 2);
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        if (as.length == 2)
        {
            hashmap.put(as[0], Integer.valueOf(Integer.parseInt(as[1])));
        }
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_82;
_L4:
        break MISSING_BLOCK_LABEL_36;
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static String stripPrefix(String s, String s1)
    {
        while (s == null || s1 == null || !s.toLowerCase().startsWith(s1)) 
        {
            return s;
        }
        return s.substring(s1.length());
    }
}
