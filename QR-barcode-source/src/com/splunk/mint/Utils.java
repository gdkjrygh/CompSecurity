// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.splunk.mint:
//            LowPriorityThreadFactory, MintLogLevel, Mint, Logger, 
//            Properties, EnumStateStatus

class Utils
{

    protected static final String CONNECTION = "connection";
    private static final int Debug = 20;
    private static final int Error = 60;
    private static final int Info = 30;
    private static final String LASTPINGTIME = "LASTPINGTIME";
    protected static final String STATE = "state";
    private static final int Verbose = 10;
    private static final int Warning = 50;
    private static ExecutorService executor = null;
    private static final String forceSendPingFile = ".setForceSendPingOnNextStart";

    Utils()
    {
    }

    protected static String MD5(String s)
        throws Exception
    {
        MessageDigest messagedigest = MessageDigest.getInstance("MD5");
        messagedigest.update(s.getBytes(), 0, s.length());
        return (new BigInteger(1, messagedigest.digest())).toString(16);
    }

    protected static boolean checkForRoot()
    {
        boolean flag1 = false;
        String as[] = new String[8];
        as[0] = "/sbin/";
        as[1] = "/system/bin/";
        as[2] = "/system/xbin/";
        as[3] = "/data/local/xbin/";
        as[4] = "/data/local/bin/";
        as[5] = "/system/sd/xbin/";
        as[6] = "/system/bin/failsafe/";
        as[7] = "/data/local/";
        int j = as.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    String s = as[i];
                    if (!(new File((new StringBuilder()).append(s).append("su").toString())).exists())
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    protected static void clearLastPingSentTime(Context context)
    {
        context = (new LowPriorityThreadFactory()).newThread(new Runnable(context) {

            final Context val$ctx;

            public void run()
            {
                if (ctx != null)
                {
                    SharedPreferences sharedpreferences = ctx.getSharedPreferences("Mint", 0);
                    if (sharedpreferences != null)
                    {
                        sharedpreferences.edit().putLong("LASTPINGTIME", 0L).commit();
                    }
                }
            }

            
            {
                ctx = context;
                super();
            }
        });
        ExecutorService executorservice = getExecutor();
        if (context != null && executorservice != null)
        {
            executorservice.submit(context);
        }
    }

    public static int convertLoggingLevelToInt(MintLogLevel mintloglevel)
    {
        byte byte1 = 10;
        byte byte0;
        if (mintloglevel.equals(MintLogLevel.Debug))
        {
            byte0 = 20;
        } else
        {
            if (mintloglevel.equals(MintLogLevel.Error))
            {
                return 60;
            }
            if (mintloglevel.equals(MintLogLevel.Info))
            {
                return 30;
            }
            byte0 = byte1;
            if (!mintloglevel.equals(MintLogLevel.Verbose))
            {
                byte0 = byte1;
                if (mintloglevel.equals(MintLogLevel.Warning))
                {
                    return 50;
                }
            }
        }
        return byte0;
    }

    public static final String getCarrier(Context context)
    {
label0:
        {
label1:
            {
                TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
                if (telephonymanager == null)
                {
                    break label0;
                }
                String s = null;
                if (telephonymanager.getSimState() == 5)
                {
                    s = telephonymanager.getSimOperatorName();
                }
                if (s != null)
                {
                    context = s;
                    if (s.length() != 0)
                    {
                        break label1;
                    }
                }
                context = telephonymanager.getNetworkOperatorName();
            }
            Object obj;
label2:
            {
                if (context != null)
                {
                    obj = context;
                    if (context.length() != 0)
                    {
                        break label2;
                    }
                }
                obj = "unknown";
            }
            return ((String) (obj));
        }
        return "unknown";
    }

    protected static HashMap getConnectionInfo(Context context)
    {
        HashMap hashmap;
        hashmap = new HashMap(2);
        hashmap.put("connection", "NA");
        hashmap.put("state", "NA");
        if (context != null) goto _L2; else goto _L1
_L1:
        if (Mint.DEBUG)
        {
            Logger.logError("Context in getConnection is null!");
        }
_L4:
        return hashmap;
_L2:
        PackageManager packagemanager;
        packagemanager = context.getPackageManager();
        if (packagemanager != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!Mint.DEBUG) goto _L4; else goto _L3
_L3:
        Logger.logError("PackageManager in CheckNetworkConnection is null!");
        return hashmap;
        if (packagemanager.checkPermission("android.permission.ACCESS_NETWORK_STATE", Properties.APP_PACKAGE) != 0) goto _L4; else goto _L5
_L5:
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context != null)
        {
            if (context.getSubtypeName() == null || context.getSubtypeName().length() == 0)
            {
                hashmap.put("connection", context.getTypeName());
            } else
            {
                hashmap.put("connection", context.getSubtypeName());
            }
            hashmap.put("state", context.getState().toString());
            return hashmap;
        } else
        {
            hashmap.put("connection", "No connection");
            return hashmap;
        }
    }

    private static ExecutorService getExecutor()
    {
        if (executor == null)
        {
            executor = Executors.newFixedThreadPool(1);
        }
        return executor;
    }

    protected static final String getMilisFromStart()
    {
        return String.valueOf(System.currentTimeMillis() - Properties.TIMESTAMP);
    }

    public static String getRandomSessionNumber()
    {
        String s = String.valueOf(System.currentTimeMillis());
        return s.substring(s.length() - 8, s.length());
    }

    protected static final String getTime()
    {
        long l = System.currentTimeMillis();
        long l1;
        try
        {
            l1 = Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis() / 1000L;
        }
        catch (Exception exception)
        {
            return String.valueOf(l);
        }
        return String.valueOf(l1);
    }

    protected static EnumStateStatus isGPSOn(Context context)
    {
        EnumStateStatus enumstatestatus = EnumStateStatus.ON;
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_FINE_LOCATION", Properties.APP_PACKAGE) == 0)
        {
            if (!((LocationManager)context.getSystemService("location")).isProviderEnabled("gps"))
            {
                enumstatestatus = EnumStateStatus.OFF;
            }
            return enumstatestatus;
        } else
        {
            return EnumStateStatus.NA;
        }
    }

    public static final boolean isKitKat()
    {
        return android.os.Build.VERSION.SDK_INT == 19;
    }

    public static String readFile(String s)
        throws Exception
    {
        Object obj;
        Object obj1;
        StringBuilder stringbuilder;
        if (s == null)
        {
            throw new IllegalArgumentException("filePath Argument is null");
        }
        stringbuilder = new StringBuilder();
        obj = null;
        obj1 = null;
        s = new BufferedReader(new FileReader(s));
_L3:
        obj = s.readLine();
        if (obj == null) goto _L2; else goto _L1
_L1:
        stringbuilder.append(((String) (obj)));
          goto _L3
        obj1;
        obj = s;
        s = ((String) (obj1));
_L7:
        throw s;
        s;
_L5:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        throw s;
_L2:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        return stringbuilder.toString();
        obj1;
        obj = s;
        s = ((String) (obj1));
        if (true) goto _L5; else goto _L4
_L4:
        s;
        obj = obj1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static final String readLogs()
    {
        Object obj;
        Object obj1;
        int i;
        int j = Properties.LOG_LINES;
        i = j;
        if (j < 0)
        {
            i = 100;
        }
        obj1 = Properties.LOG_FILTER;
        obj = new StringBuilder();
        ArrayList arraylist;
        obj1 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec((new StringBuilder()).append("logcat -d ").append(((String) (obj1))).toString()).getInputStream()));
        arraylist = new ArrayList();
_L1:
        String s = ((BufferedReader) (obj1)).readLine();
label0:
        {
            if (s == null)
            {
                break label0;
            }
            try
            {
                arraylist.add(s);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logger.logError("Error reading logcat output!");
                return ((Exception) (obj)).getMessage();
            }
        }
          goto _L1
        if (arraylist.size() == 0)
        {
            return "You must add the android.permission.READ_LOGS permission to your manifest file!";
        }
        int k = arraylist.size() - i;
        i = k;
        if (k < 0)
        {
            i = 0;
        }
_L3:
        if (i >= arraylist.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuilder) (obj)).append((new StringBuilder()).append((String)arraylist.get(i)).append("\n").toString());
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        obj = ((StringBuilder) (obj)).toString();
        return ((String) (obj));
    }

    protected static void setForceSendPingOnNextStart()
    {
        Thread thread = (new LowPriorityThreadFactory()).newThread(new Runnable() {

            public void run()
            {
                File file;
                file = new File((new StringBuilder()).append(Properties.FILES_PATH).append("/").append(".setForceSendPingOnNextStart").toString());
                if (file == null || file.exists())
                {
                    break MISSING_BLOCK_LABEL_50;
                }
                file.createNewFile();
                return;
                IOException ioexception;
                ioexception;
                ioexception.printStackTrace();
                return;
            }

        });
        ExecutorService executorservice = getExecutor();
        if (thread != null && executorservice != null)
        {
            executorservice.submit(thread);
        }
    }

    protected static void setLastPingSentTime(Context context)
    {
        context = (new LowPriorityThreadFactory()).newThread(new Runnable(context) {

            final Context val$ctx;

            public void run()
            {
                if (ctx != null)
                {
                    SharedPreferences sharedpreferences = ctx.getSharedPreferences("Mint", 0);
                    if (sharedpreferences != null)
                    {
                        sharedpreferences.edit().putLong("LASTPINGTIME", System.currentTimeMillis()).commit();
                    }
                }
            }

            
            {
                ctx = context;
                super();
            }
        });
        ExecutorService executorservice = getExecutor();
        if (context != null && executorservice != null)
        {
            executorservice.submit(context);
        }
    }

    protected static boolean shouldSendPing(Context context)
    {
        com/splunk/mint/Utils;
        JVM INSTR monitorenter ;
        Object obj = new File((new StringBuilder()).append(Properties.FILES_PATH).append("/").append(".setForceSendPingOnNextStart").toString());
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!((File) (obj)).exists()) goto _L2; else goto _L3
_L3:
        ((File) (obj)).delete();
        boolean flag = true;
_L5:
        com/splunk/mint/Utils;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        boolean flag1;
        flag1 = true;
        flag = flag1;
        if (context == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = context.getSharedPreferences("Mint", 0);
        flag = flag1;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        long l = ((SharedPreferences) (obj)).getLong("LASTPINGTIME", 0L);
        boolean flag2;
        if (System.currentTimeMillis() - l > (long)(Properties.RemoteSettingsProps.sessionTime.intValue() * 1000))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        flag = flag2;
        if (!flag2)
        {
            continue; /* Loop/switch isn't completed */
        }
        setLastPingSentTime(context);
        flag = flag2;
        if (true) goto _L5; else goto _L4
_L4:
        context;
        throw context;
    }

}
