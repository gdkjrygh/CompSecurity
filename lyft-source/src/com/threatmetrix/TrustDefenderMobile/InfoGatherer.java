// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.WindowManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            StringUtils, StatWrapper, DisplayWrapper, NativeGatherer, 
//            WrapperHelper

class InfoGatherer
{

    private static final String a = StringUtils.a(com/threatmetrix/TrustDefenderMobile/InfoGatherer);

    InfoGatherer()
    {
    }

    static String a(long l, long l1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(l).append("-").append(Long.toString(l1));
        Log.d(a, (new StringBuilder()).append("getDeviceState: ").append(StringUtils.b(stringbuilder.toString())).toString());
        return StringUtils.b(stringbuilder.toString());
    }

    static String a(Context context, Context context1)
    {
        Log.d(a, "getDeviceFingerprint()");
        StringBuilder stringbuilder = new StringBuilder();
        if (Thread.currentThread().isInterrupted())
        {
            return "";
        }
        TelephonyManager telephonymanager = (TelephonyManager)context1.getSystemService("phone");
        context1 = "Unknown";
        if (telephonymanager.getPhoneType() == 1)
        {
            context1 = telephonymanager.getNetworkOperatorName();
        }
        stringbuilder.append(context1);
        stringbuilder.append(telephonymanager.getSimCountryIso());
        context1 = new StatWrapper(Environment.getDataDirectory().getPath());
        long l = context1.b();
        stringbuilder.append(((float)context1.a() * (float)l) / 1024F / 1024F / 1024F);
        context = new DisplayWrapper(((WindowManager)context.getSystemService("window")).getDefaultDisplay());
        stringbuilder.append(context.a()).append("x").append(context.b());
        Log.d(a, "Calling getCPUInfo");
        stringbuilder.append(e());
        Log.d(a, "Calling getMemInfo");
        stringbuilder.append(b());
        stringbuilder.append(Build.DEVICE).append(" ").append(Build.MODEL).append(" ").append(Build.PRODUCT).append(" ").append(Build.MANUFACTURER).append(" ").append(android.os.Build.VERSION.RELEASE);
        Log.d(a, (new StringBuilder()).append("getDeviceFingerprint returned: hash(").append(stringbuilder.toString()).append(")").toString());
        return StringUtils.b(stringbuilder.toString());
    }

    static String a(String s, List list, String s1)
    {
        Object obj;
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        obj = null;
        if (s == null || list == null) goto _L2; else goto _L1
_L1:
        s = new File(s);
        if (!s.exists()) goto _L2; else goto _L3
_L3:
        BufferedReader bufferedreader = new BufferedReader(new FileReader(s));
_L10:
        s = bufferedreader.readLine();
        if (s == null) goto _L5; else goto _L4
_L4:
        if (s1 == null) goto _L7; else goto _L6
_L6:
        if (s1.isEmpty()) goto _L7; else goto _L8
_L8:
        s = StringUtils.b(s, s1);
        if (s.isEmpty()) goto _L10; else goto _L9
_L9:
        obj = ((String)s.get(0)).trim();
        if (((String) (obj)).length() == 0) goto _L10; else goto _L11
_L11:
        if (!list.contains(obj) || s.size() <= 1)
        {
            break MISSING_BLOCK_LABEL_379;
        }
        s = ((String)s.get(1)).trim();
_L13:
        if (!s.isEmpty())
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(s);
        }
          goto _L10
        list;
        s = bufferedreader;
_L15:
        Log.d(a, "get info = FAILED", list);
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.d(a, "get info = tidy up failed", s);
            }
        }
_L2:
        return stringbuilder.toString();
_L7:
        obj = new StringBuilder();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (s.contains((String)iterator.next()))
            {
                if (((StringBuilder) (obj)).length() > 0)
                {
                    ((StringBuilder) (obj)).append(",");
                }
                ((StringBuilder) (obj)).append(s);
            }
        } while (true);
          goto _L12
        s;
        list = bufferedreader;
_L14:
        if (list != null)
        {
            try
            {
                list.close();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                Log.d(a, "get info = tidy up failed", list);
            }
        }
        throw s;
_L12:
        if (((StringBuilder) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_379;
        }
        s = ((StringBuilder) (obj)).toString();
          goto _L13
_L5:
        if (bufferedreader != null)
        {
            try
            {
                bufferedreader.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.d(a, "get info = tidy up failed", s);
            }
        }
          goto _L2
        s;
        list = null;
          goto _L14
        s1;
        list = s;
        s = s1;
          goto _L14
        list;
        s = ((String) (obj));
          goto _L15
        s = "";
          goto _L13
    }

    static String a(StringBuilder stringbuilder)
    {
        StringBuilder stringbuilder1 = null;
        if (NativeGatherer.a().b())
        {
            List list1 = NativeGatherer.a().f("/system/fonts");
            String s = stringbuilder1;
            if (list1 != null)
            {
                s = stringbuilder1;
                if (!list1.isEmpty())
                {
                    s = stringbuilder1;
                    if (list1.size() == 2)
                    {
                        s = (String)list1.get(0);
                        stringbuilder.append((String)list1.get(1));
                    }
                }
            }
            return s;
        }
        List list = a();
        stringbuilder1 = new StringBuilder();
        for (Iterator iterator = list.iterator(); iterator.hasNext(); stringbuilder1.append((String)iterator.next())) { }
        stringbuilder.append(list.size());
        return StringUtils.b(stringbuilder1.toString());
    }

    static String a(List list)
    {
        StringBuilder stringbuilder1;
        Iterator iterator;
        stringbuilder1 = new StringBuilder();
        if (list == null || list.isEmpty())
        {
            return null;
        }
        iterator = list.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        URI uri;
        uri = (URI)iterator.next();
        if (Thread.currentThread().isInterrupted())
        {
            throw new InterruptedException();
        }
        if (uri == null) goto _L4; else goto _L3
_L3:
        if (!uri.getScheme().equals("file")) goto _L6; else goto _L5
_L5:
        Object obj1;
        obj1 = new File(uri.getPath());
        list = uri.getQuery();
        if (list != null && !list.isEmpty()) goto _L8; else goto _L7
_L7:
        if (stringbuilder1.length() > 0)
        {
            stringbuilder1.append(";");
        }
        StringBuilder stringbuilder = stringbuilder1.append(uri.getPath()).append("=");
        if (((File) (obj1)).exists())
        {
            list = "true";
        } else
        {
            list = "false";
        }
        stringbuilder.append(list);
          goto _L4
_L8:
        if (!((File) (obj1)).exists()) goto _L4; else goto _L9
_L9:
        Object obj;
        boolean flag;
        obj = StringUtils.d(list);
        flag = ((Map) (obj)).containsKey("grep");
        if (!flag && !((Map) (obj)).containsKey("keys")) goto _L4; else goto _L10
_L10:
        list = (String)((Map) (obj)).get("sep");
        if (!flag && (list == null || list.isEmpty()))
        {
            list = ":";
        }
        if (flag)
        {
            obj = (String)((Map) (obj)).get("grep");
        } else
        {
            obj = (String)((Map) (obj)).get("keys");
        }
        if (obj != null && !((String) (obj)).isEmpty()) goto _L11; else goto _L2
_L2:
        if (stringbuilder1.length() > 0)
        {
            Log.d(a, (new StringBuilder()).append("found ").append(stringbuilder1.toString()).toString());
        }
        return stringbuilder1.toString();
_L11:
        obj = StringUtils.b(((String) (obj)), ",");
        list = a(((File) (obj1)).getAbsolutePath(), ((List) (obj)), ((String) (list)));
        if (list != null && !list.isEmpty())
        {
            if (stringbuilder1.length() > 0)
            {
                stringbuilder1.append(";");
            }
            stringbuilder1.append(uri.getPath()).append("=").append(list);
        }
          goto _L4
_L6:
        if (!uri.getScheme().equals("intro")) goto _L4; else goto _L12
_L12:
        obj1 = uri.getHost();
        obj = uri.getPath();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_444;
        }
        if (!((String) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_457;
        }
        Log.d(a, "getURLs: empty className");
          goto _L4
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_468;
        }
        if (!((String) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_481;
        }
        Log.d(a, "getURLs: empty methodName");
          goto _L4
        list = ((List) (obj));
        if (((String) (obj)).startsWith("/"))
        {
            list = ((String) (obj)).substring(1);
        }
        obj = WrapperHelper.b(((String) (obj1)));
label0:
        {
            if (obj != null)
            {
                break label0;
            }
            try
            {
                Log.d(a, (new StringBuilder()).append("getURLs: failed to find class: ").append(((String) (obj1))).toString());
            }
            // Misplaced declaration of an exception variable
            catch (List list) { }
        }
          goto _L4
        obj1 = WrapperHelper.a(((Class) (obj)), list, new Class[0]);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_626;
        }
        list = ((List) (WrapperHelper.a(obj, ((java.lang.reflect.Method) (obj1)), new Object[0])));
        if (list == null) goto _L4; else goto _L13
_L13:
        list = list.toString();
        if (list == null) goto _L4; else goto _L14
_L14:
        if (stringbuilder1.length() > 0)
        {
            stringbuilder1.append(";");
        }
        stringbuilder1.append(uri.getHost()).append(uri.getPath()).append("=").append(list);
          goto _L4
        obj1 = WrapperHelper.a(((Class) (obj)), list);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_705;
        }
        list = ((List) (WrapperHelper.a(obj, ((java.lang.reflect.Field) (obj1)))));
        if (list == null) goto _L4; else goto _L15
_L15:
        if (!(list instanceof String)) goto _L4; else goto _L16
_L16:
        if (stringbuilder1.length() > 0)
        {
            stringbuilder1.append(";");
        }
        stringbuilder1.append(uri.getHost()).append(uri.getPath()).append("=").append((String)list);
          goto _L4
        Log.d(a, (new StringBuilder()).append("getURLs: failed to find method or field: ").append(list).toString());
          goto _L4
    }

    static List a()
    {
        ArrayList arraylist = new ArrayList();
        String as[] = (new File("/system/fonts/")).list();
        if (as != null)
        {
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                Object obj = as[i];
                if (obj != null && ((String) (obj)).endsWith(".ttf"))
                {
                    obj = new StringBuilder(((String) (obj)));
                    arraylist.add(((StringBuilder) (obj)).substring(0, ((StringBuilder) (obj)).length() - 4));
                }
                i++;
            }
        }
        return arraylist;
    }

    static List a(Context context, List list)
    {
        String as[];
        ArrayList arraylist;
        ArrayList arraylist1;
        ArrayList arraylist2;
        String s;
        PackageManager packagemanager;
        int i;
        int j;
        arraylist = new ArrayList();
        if (list == null || list.isEmpty())
        {
            return arraylist;
        }
        arraylist1 = new ArrayList();
        arraylist2 = new ArrayList();
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            try
            {
                obj = new URI(((String) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.d(a, "malformed check url", ((Throwable) (obj)));
                obj = null;
            }
            if (obj != null)
            {
                if (((URI) (obj)).getScheme() == null)
                {
                    Log.d(a, (new StringBuilder()).append("Failed to get url scheme from: ").append(obj).toString());
                } else
                {
                    arraylist2.add(obj);
                    StringBuilder stringbuilder = new StringBuilder(((URI) (obj)).getScheme());
                    stringbuilder.append("://");
                    if (((URI) (obj)).getHost() != null && !((URI) (obj)).getHost().isEmpty())
                    {
                        stringbuilder.append(((URI) (obj)).getHost());
                    } else
                    if (((URI) (obj)).getAuthority() != null && !((URI) (obj)).getAuthority().isEmpty())
                    {
                        stringbuilder.append(((URI) (obj)).getAuthority());
                    }
                    if (((URI) (obj)).getPath() != null && !((URI) (obj)).getPath().isEmpty())
                    {
                        stringbuilder.append(((URI) (obj)).getPath());
                    }
                    if (((URI) (obj)).getQuery() != null && !((URI) (obj)).getQuery().isEmpty())
                    {
                        stringbuilder.append("?").append(((URI) (obj)).getQuery());
                    }
                    arraylist1.add(stringbuilder.toString());
                }
            }
        }

        as = NativeGatherer.a().a((String[])arraylist1.toArray(new String[arraylist1.size()]));
        s = Build.TAGS;
        packagemanager = context.getPackageManager();
        j = 0;
        i = 0;
_L2:
        if (j >= arraylist2.size())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = (URI)arraylist2.get(j);
        String s1 = (String)arraylist1.get(j);
        if (Thread.currentThread().isInterrupted())
        {
            throw new InterruptedException();
        }
        boolean flag1 = false;
        boolean flag;
        if (((URI) (obj1)).getScheme().equals("file"))
        {
            flag = (new File(((URI) (obj1)))).exists();
        } else
        {
label0:
            {
                if (!((URI) (obj1)).getScheme().equals("tags"))
                {
                    break label0;
                }
                flag = flag1;
                if (s != null)
                {
                    if (((URI) (obj1)).getHost() == null)
                    {
                        context = ((URI) (obj1)).getAuthority();
                    } else
                    {
                        context = ((URI) (obj1)).getHost();
                    }
                    ArrayList arraylist3;
                    int k;
                    if (context != null && !context.isEmpty())
                    {
                        flag = s.contains(context);
                    } else
                    {
                        flag = false;
                    }
                }
            }
        }
        if (flag)
        {
            arraylist.add(s1);
        } else
        {
            i++;
        }
        j++;
        if (true) goto _L2; else goto _L1
label1:
        {
            if (!((URI) (obj1)).getScheme().equals("pkg"))
            {
                break label1;
            }
            flag = flag1;
            if (packagemanager == null)
            {
                break MISSING_BLOCK_LABEL_433;
            }
            if (((URI) (obj1)).getHost() == null)
            {
                context = ((URI) (obj1)).getAuthority();
            } else
            {
                context = ((URI) (obj1)).getHost();
            }
            flag = flag1;
            if (context == null)
            {
                break MISSING_BLOCK_LABEL_433;
            }
            try
            {
                packagemanager.getPackageInfo(context, 1);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                flag = flag1;
                break MISSING_BLOCK_LABEL_433;
            }
            flag = true;
            break MISSING_BLOCK_LABEL_433;
        }
        for (flag = flag1; !((URI) (obj1)).getScheme().equals("prop");)
        {
            break MISSING_BLOCK_LABEL_433;
        }

        if (((URI) (obj1)).getHost() == null)
        {
            context = ((URI) (obj1)).getAuthority();
        } else
        {
            context = ((URI) (obj1)).getHost();
        }
        if (context != null)
        {
            obj1 = ((URI) (obj1)).getQuery();
            if (obj1 != null)
            {
                if (context.equals("ro.build.version.codename"))
                {
                    flag = flag1;
                    if (((String) (obj1)).equalsIgnoreCase(android.os.Build.VERSION.CODENAME))
                    {
                        flag = true;
                    }
                } else
                if (context.equals("ro.build.date.utc"))
                {
                    flag = flag1;
                    if (((String) (obj1)).equals(Long.valueOf(Build.TIME)))
                    {
                        flag = true;
                    }
                } else
                if (context.equals("ro.build.type"))
                {
                    flag = flag1;
                    if (((String) (obj1)).equalsIgnoreCase(Build.TYPE))
                    {
                        flag = true;
                    }
                } else
                if (context.equals("ro.build.tags"))
                {
                    flag = flag1;
                    if (((String) (obj1)).equalsIgnoreCase(Build.TAGS))
                    {
                        flag = true;
                    }
                } else
                if (context.equals("ro.build.host"))
                {
                    flag = flag1;
                    if (((String) (obj1)).equalsIgnoreCase(Build.HOST))
                    {
                        flag = true;
                    }
                } else
                if (context.equals("ro.build.user"))
                {
                    flag = flag1;
                    if (((String) (obj1)).equalsIgnoreCase(Build.USER))
                    {
                        flag = true;
                    }
                } else
                if (context.equals("ro.build.id"))
                {
                    flag = flag1;
                    if (((String) (obj1)).equalsIgnoreCase(Build.ID))
                    {
                        flag = true;
                    }
                } else
                {
                    arraylist3 = new ArrayList();
                    Collections.addAll(arraylist3, new String[] {
                        context
                    });
                    context = a("/system/build.prop", ((List) (arraylist3)), "=");
                    if (context != null && ((String) (obj1)).equalsIgnoreCase(context))
                    {
                        flag = true;
                    } else
                    {
                        context = a("/default.prop", ((List) (arraylist3)), "=");
                        flag = flag1;
                        if (context != null)
                        {
                            flag = flag1;
                            if (((String) (obj1)).equalsIgnoreCase(context))
                            {
                                flag = true;
                            }
                        }
                    }
                }
                break MISSING_BLOCK_LABEL_433;
            }
        }
        break MISSING_BLOCK_LABEL_445;
_L1:
        Log.d(a, (new StringBuilder()).append("matched ").append(i).append("/").append(list.size()).toString());
        if (as != null && as.length > 0)
        {
            k = as.length;
            for (i = 0; i < k; i++)
            {
                context = as[i];
                arraylist.add((new StringBuilder()).append("a").append(context).toString());
            }

        }
        Collections.sort(arraylist);
        if (!arraylist.isEmpty() && Log.isLoggable(a, 3))
        {
            Log.d(a, (new StringBuilder()).append("found ").append(StringUtils.a(arraylist, ";")).toString());
        }
        return arraylist;
    }

    static boolean a(TZInfo tzinfo)
    {
        if (tzinfo == null)
        {
            throw new IllegalArgumentException("tzInfo cannot be null");
        }
        TimeZone timezone = TimeZone.getDefault();
        if (timezone != null)
        {
            tzinfo.a = timezone.getRawOffset() / 60000;
            tzinfo.b = timezone.getDSTSavings() / 60000;
            Log.d(a, (new StringBuilder()).append("getTimeZoneInfo: dstDiff=").append(tzinfo.b).append(" gmfOffset=").append(tzinfo.a).toString());
            return true;
        } else
        {
            Log.w(a, "getTimeZoneInfo: FAILED");
            return false;
        }
    }

    static String[] a(Context context)
    {
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", context.getPackageName()) == 0)
        {
            context = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo();
            String s = context.getBSSID();
            if (s == null)
            {
                return null;
            }
            Object obj = context.getSSID();
            if (obj == null || ((String) (obj)).contains("unknown ssid"))
            {
                return null;
            }
            context = ((Context) (obj));
            if (((String) (obj)).charAt(0) == '"')
            {
                context = ((String) (obj)).substring(1);
            }
            obj = context;
            if (context.charAt(context.length() - 1) == '"')
            {
                obj = context.substring(0, context.length() - 1);
            }
            return (new String[] {
                s, StringUtils.c(((String) (obj)))
            });
        } else
        {
            return null;
        }
    }

    static String b()
    {
        Object obj = new ArrayList();
        Collections.addAll(((java.util.Collection) (obj)), new String[] {
            "MemTotal"
        });
        obj = a("/proc/meminfo", ((List) (obj)), ":");
        Log.d(a, (new StringBuilder()).append("getMemInfo returned: ").append(((String) (obj))).toString());
        return ((String) (obj));
    }

    static String b(Context context)
    {
        Object obj;
        String s;
        Object obj1;
        obj = null;
        s = "-";
        obj1 = context.getApplicationInfo().packageName;
        int i;
        context = context.getPackageManager().getPackageInfo(((String) (obj1)), 128);
        i = ((PackageInfo) (context)).versionCode;
        context = ((PackageInfo) (context)).versionName;
_L1:
        StringBuilder stringbuilder = new StringBuilder();
        obj1 = stringbuilder.append(((String) (obj1))).append(":");
        obj = context;
        if (context == null)
        {
            obj = "-";
        }
        obj = ((StringBuilder) (obj1)).append(((String) (obj))).append(":");
        if (i == -1)
        {
            context = "-";
        } else
        {
            context = Integer.valueOf(i);
        }
        ((StringBuilder) (obj)).append(context);
        context = NativeGatherer.a().h();
        obj = stringbuilder.append(":");
        if (context == null)
        {
            context = s;
        }
        ((StringBuilder) (obj)).append(context);
        Log.d(a, (new StringBuilder()).append("Application Info ").append(stringbuilder.toString()).toString());
        return stringbuilder.toString();
        context;
        i = -1;
_L2:
        Log.e(a, "Invalid package name.", context);
        context = ((Context) (obj));
          goto _L1
        context;
          goto _L2
    }

    static String c()
    {
        Object obj = Locale.getDefault();
        StringBuffer stringbuffer = new StringBuffer();
        String s = ((Locale) (obj)).getLanguage();
        if (s != null)
        {
            stringbuffer.append(s);
            obj = ((Locale) (obj)).getCountry();
            if (obj != null)
            {
                stringbuffer.append("-");
                stringbuffer.append(((String) (obj)));
            }
        }
        return stringbuffer.toString();
    }

    static boolean c(Context context)
    {
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "mock_location");
        return context != null && context.equals("1");
    }

    static String d()
    {
        Object obj = Locale.getDefault();
        StringBuffer stringbuffer = new StringBuffer();
        String s = ((Locale) (obj)).getLanguage();
        if (s != null)
        {
            stringbuffer.append(s);
            obj = ((Locale) (obj)).getCountry();
            if (obj != null)
            {
                stringbuffer.append("_");
                stringbuffer.append(((String) (obj)));
            }
        }
        return stringbuffer.toString();
    }

    static String e()
    {
        Object obj = new ArrayList();
        Collections.addAll(((java.util.Collection) (obj)), new String[] {
            "Processor", "BogoMips", "Hardware", "Serial"
        });
        obj = a("/proc/cpuinfo", ((List) (obj)), ":");
        Log.d(a, (new StringBuilder()).append("getCPUInfo returned: ").append(((String) (obj))).toString());
        return ((String) (obj));
    }

    static long f()
    {
        long l = (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000L;
        Log.d(a, (new StringBuilder()).append(" getBootTime: ").append(l).toString());
        return l;
    }

    static long g()
    {
        long l1 = 0L;
        StatWrapper statwrapper = new StatWrapper(Environment.getDataDirectory().getPath());
        long l2 = statwrapper.c();
        long l3 = statwrapper.b();
        long l = l1;
        if (l2 != 0L)
        {
            l = l1;
            if (l3 != 0L)
            {
                l = (((l2 * l3 >> 20) << 20) / 10L) * 10L;
            }
        }
        Log.d(a, (new StringBuilder()).append("Free space on the phone ").append(l).toString());
        return l;
    }


    private class TZInfo
    {

        int a;
        int b;

        TZInfo()
        {
            a = 0;
            b = 0;
        }
    }

}
