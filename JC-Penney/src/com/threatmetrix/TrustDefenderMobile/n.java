// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.content.pm.PackageManager;
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
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            aa, ab, i, NativeGatherer, 
//            aq, o

class n
{

    private static final String a = com/threatmetrix/TrustDefenderMobile/n.getSimpleName();

    n()
    {
    }

    static String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Object obj = new aa(Environment.getDataDirectory().getPath());
        long l = ((aa) (obj)).b();
        long l1 = ((aa) (obj)).c();
        float f = 1.0F;
        if (l1 * l != 0L)
        {
            f = ((float)l1 * (float)l) / 1024F / 1024F / 1024F;
        }
        stringbuilder.append(f);
        stringbuilder.append(" - ");
        stringbuilder.append(Long.toString((System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000L));
        obj = a;
        (new StringBuilder("getDeviceState: ")).append(ab.b(stringbuilder.toString()));
        return ab.b(stringbuilder.toString());
    }

    static String a(Context context, Context context1)
    {
        Object obj = a;
        obj = new StringBuilder();
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
        ((StringBuilder) (obj)).append(context1);
        ((StringBuilder) (obj)).append(telephonymanager.getSimCountryIso());
        context1 = new aa(Environment.getDataDirectory().getPath());
        long l = context1.b();
        ((StringBuilder) (obj)).append(((float)context1.a() * (float)l) / 1024F / 1024F / 1024F);
        context = new i(((WindowManager)context.getSystemService("window")).getDefaultDisplay());
        ((StringBuilder) (obj)).append(context.a()).append("x").append(context.b());
        context = a;
        context = new ArrayList();
        Collections.addAll(context, new String[] {
            "Processor", "BogoMips", "Hardware", "Serial"
        });
        context = a("/proc/cpuinfo", ((List) (context)), ":");
        context1 = a;
        (new StringBuilder("getCPUInfo returned: ")).append(context);
        ((StringBuilder) (obj)).append(context);
        context = a;
        context = new ArrayList();
        Collections.addAll(context, new String[] {
            "MemTotal"
        });
        context = a("/proc/meminfo", ((List) (context)), ":");
        context1 = a;
        (new StringBuilder("getMemInfo returned: ")).append(context);
        ((StringBuilder) (obj)).append(context);
        ((StringBuilder) (obj)).append(Build.DEVICE).append(" ").append(Build.MODEL).append(" ").append(Build.PRODUCT).append(" ").append(Build.MANUFACTURER).append(" ").append(android.os.Build.VERSION.RELEASE);
        context = a;
        (new StringBuilder("getDeviceFingerprint returned: hash(")).append(((StringBuilder) (obj)).toString()).append(")");
        return ab.b(((StringBuilder) (obj)).toString());
    }

    private static String a(String s, List list, String s1)
    {
        Object obj;
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        obj = null;
        if (s == null || list == null || !(new File(s)).exists()) goto _L2; else goto _L1
_L1:
        BufferedReader bufferedreader = new BufferedReader(new FileReader(new File(s)));
_L9:
        s = bufferedreader.readLine();
        if (s == null) goto _L4; else goto _L3
_L3:
        if (s1 == null) goto _L6; else goto _L5
_L5:
        if (s1.isEmpty()) goto _L6; else goto _L7
_L7:
        s = ab.b(s, s1);
        if (s.isEmpty()) goto _L9; else goto _L8
_L8:
        obj = ((String)s.get(0)).trim();
        if (((String) (obj)).length() == 0) goto _L9; else goto _L10
_L10:
        if (!list.contains(obj) || s.size() <= 1)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        s = ((String)s.get(1)).trim();
_L12:
        if (!s.isEmpty())
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(s);
        }
          goto _L9
        s;
        s = bufferedreader;
_L14:
        list = a;
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s = a;
            }
        }
_L2:
        return stringbuilder.toString();
_L6:
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
          goto _L11
        s;
        list = bufferedreader;
_L13:
        if (list != null)
        {
            try
            {
                list.close();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list = a;
            }
        }
        throw s;
_L11:
        if (((StringBuilder) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        s = ((StringBuilder) (obj)).toString();
          goto _L12
_L4:
        try
        {
            bufferedreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = a;
        }
          goto _L2
        s;
        list = null;
          goto _L13
        s1;
        list = s;
        s = s1;
          goto _L13
        s;
        s = ((String) (obj));
          goto _L14
        s = "";
          goto _L12
    }

    static String a(StringBuilder stringbuilder)
    {
        String as[] = null;
        if (NativeGatherer.a.a())
        {
            List list = NativeGatherer.a.e("/system/fonts");
            String s = as;
            if (list != null)
            {
                s = as;
                if (!list.isEmpty())
                {
                    s = as;
                    if (list.size() == 2)
                    {
                        s = (String)list.get(0);
                        stringbuilder.append((String)list.get(1));
                    }
                }
            }
            return s;
        }
        ArrayList arraylist = new ArrayList();
        as = (new File("/system/fonts/")).list();
        if (as != null)
        {
            int k = as.length;
            for (int j = 0; j < k; j++)
            {
                Object obj = as[j];
                if (obj != null && ((String) (obj)).endsWith(".ttf"))
                {
                    obj = new StringBuilder(((String) (obj)));
                    arraylist.add(((StringBuilder) (obj)).substring(0, ((StringBuilder) (obj)).length() - 4));
                }
            }

        }
        StringBuilder stringbuilder1 = new StringBuilder();
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); stringbuilder1.append((String)iterator.next())) { }
        stringbuilder.append(arraylist.size());
        return ab.b(stringbuilder1.toString());
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
_L2:
        URI uri;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        uri = (URI)iterator.next();
        if (Thread.currentThread().isInterrupted())
        {
            throw new InterruptedException();
        }
        if (uri == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (uri.getScheme().equals("file"))
        {
            File file = new File(uri.getPath());
            list = uri.getQuery();
            if (list == null || list.isEmpty())
            {
                if (stringbuilder1.length() > 0)
                {
                    stringbuilder1.append(";");
                }
                StringBuilder stringbuilder = stringbuilder1.append(uri.getPath()).append("=");
                if (file.exists())
                {
                    list = "true";
                } else
                {
                    list = "false";
                }
                stringbuilder.append(list);
                continue; /* Loop/switch isn't completed */
            }
            if (!file.exists())
            {
                continue; /* Loop/switch isn't completed */
            }
            Object obj = ab.d(list);
            boolean flag = ((Map) (obj)).containsKey("grep");
            if (!flag && !((Map) (obj)).containsKey("keys"))
            {
                continue; /* Loop/switch isn't completed */
            }
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
            if (obj == null || ((String) (obj)).isEmpty())
            {
                break; /* Loop/switch isn't completed */
            }
            obj = ab.b(((String) (obj)), ",");
            list = a(file.getAbsolutePath(), ((List) (obj)), ((String) (list)));
            if (list != null && !list.isEmpty())
            {
                if (stringbuilder1.length() > 0)
                {
                    stringbuilder1.append(";");
                }
                stringbuilder1.append(uri.getPath()).append("=").append(list);
            }
            continue; /* Loop/switch isn't completed */
        }
        if (!uri.getScheme().equals("intro"))
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj1;
        Object obj2;
        obj2 = uri.getHost();
        obj1 = uri.getPath();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_401;
        }
        if (!((String) (obj2)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_408;
        }
        list = a;
        continue; /* Loop/switch isn't completed */
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_419;
        }
        if (!((String) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_426;
        }
        list = a;
        continue; /* Loop/switch isn't completed */
        list = ((List) (obj1));
        if (((String) (obj1)).startsWith("/"))
        {
            list = ((String) (obj1)).substring(1);
        }
        obj1 = aq.b(((String) (obj2)));
        if (obj1 == null)
        {
            try
            {
                list = a;
                (new StringBuilder("getURLs: failed to find class: ")).append(((String) (obj2)));
            }
            // Misplaced declaration of an exception variable
            catch (List list) { }
            continue; /* Loop/switch isn't completed */
        }
        obj2 = aq.a(((Class) (obj1)), list, new Class[0]);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_563;
        }
        list = ((List) (aq.a(obj1, ((java.lang.reflect.Method) (obj2)), new Object[0])));
        if (list == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        list = list.toString();
        if (list == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (stringbuilder1.length() > 0)
        {
            stringbuilder1.append(";");
        }
        stringbuilder1.append(uri.getHost()).append(uri.getPath()).append("=").append(list);
        continue; /* Loop/switch isn't completed */
        obj2 = aq.a(((Class) (obj1)), list);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_642;
        }
        list = ((List) (aq.a(obj1, ((java.lang.reflect.Field) (obj2)))));
        if (list == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (list instanceof String)
        {
            if (stringbuilder1.length() > 0)
            {
                stringbuilder1.append(";");
            }
            stringbuilder1.append(uri.getHost()).append(uri.getPath()).append("=").append((String)list);
        }
        continue; /* Loop/switch isn't completed */
        obj1 = a;
        (new StringBuilder("getURLs: failed to find method or field: ")).append(list);
        if (true) goto _L2; else goto _L1
_L1:
        if (stringbuilder1.length() > 0)
        {
            list = a;
            (new StringBuilder("found ")).append(stringbuilder1.toString());
        }
        return stringbuilder1.toString();
    }

    static List a(Context context, List list)
    {
        ArrayList arraylist;
        String as[];
        String s;
        PackageManager packagemanager;
        Iterator iterator;
        int j;
        boolean flag;
        flag = false;
        arraylist = new ArrayList();
        if (list == null || list.isEmpty())
        {
            return arraylist;
        }
        as = NativeGatherer.a.a((String[])list.toArray(new String[list.size()]));
        s = Build.TAGS;
        packagemanager = context.getPackageManager();
        iterator = list.iterator();
        j = 0;
_L3:
        boolean flag1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_275;
        }
        String s1 = (String)iterator.next();
        if (Thread.currentThread().isInterrupted())
        {
            throw new InterruptedException();
        }
        try
        {
            context = new URI(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = a;
            context = null;
        }
        if (context == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (context.getScheme().equals("file"))
        {
            flag1 = (new File(context)).exists();
        } else
        {
label0:
            {
                if (!context.getScheme().equals("tags"))
                {
                    break label0;
                }
                if (s == null)
                {
                    break MISSING_BLOCK_LABEL_260;
                }
                context = context.getHost();
                if (context == null || context.isEmpty())
                {
                    break MISSING_BLOCK_LABEL_260;
                }
                flag1 = s.contains(context);
            }
        }
_L1:
        if (flag1)
        {
            arraylist.add(s1);
        } else
        {
            j++;
        }
        continue; /* Loop/switch isn't completed */
        if (!context.getScheme().equals("pkg") || packagemanager == null)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        context = context.getHost();
        packagemanager.getPackageInfo(context, 1);
        flag1 = true;
          goto _L1
        context;
        flag1 = false;
          goto _L1
        context = a;
        (new StringBuilder("matched ")).append(j).append("/").append(list.size());
        if (as != null && as.length > 0)
        {
            int l = as.length;
            for (int k = ((flag) ? 1 : 0); k < l; k++)
            {
                context = as[k];
                arraylist.add((new StringBuilder("z")).append(context).toString());
            }

        }
        Collections.sort(arraylist);
        if (!arraylist.isEmpty() && Log.isLoggable(a, 3))
        {
            context = a;
            (new StringBuilder("found ")).append(ab.a(arraylist, ";"));
        }
        return arraylist;
        if (true) goto _L3; else goto _L2
_L2:
    }

    static boolean a(o o1)
    {
        if (o1 == null)
        {
            throw new IllegalArgumentException("tzInfo cannot be null");
        }
        Object obj = TimeZone.getDefault();
        if (obj != null)
        {
            o1.a = ((TimeZone) (obj)).getRawOffset() / 60000;
            o1.b = ((TimeZone) (obj)).getDSTSavings() / 60000;
            obj = a;
            (new StringBuilder("getTimeZoneInfo: dstDiff=")).append(o1.b).append(" gmfOffset=").append(o1.a);
            return true;
        } else
        {
            Log.w(a, "getTimeZoneInfo: FAILED");
            return false;
        }
    }

}
