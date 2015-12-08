// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class CommonUtils
{
    static final class Architecture extends Enum
    {

        private static final Architecture $VALUES[];
        public static final Architecture ARM64;
        public static final Architecture ARMV6;
        public static final Architecture ARMV7;
        public static final Architecture ARMV7S;
        public static final Architecture ARM_UNKNOWN;
        public static final Architecture PPC;
        public static final Architecture PPC64;
        public static final Architecture UNKNOWN;
        public static final Architecture X86_32;
        public static final Architecture X86_64;
        private static final Map matcher;

        static Architecture getValue()
        {
            Object obj = Build.CPU_ABI;
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                Fabric.getLogger().d("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                obj = UNKNOWN;
            } else
            {
                obj = ((String) (obj)).toLowerCase(Locale.US);
                Architecture architecture = (Architecture)matcher.get(obj);
                obj = architecture;
                if (architecture == null)
                {
                    return UNKNOWN;
                }
            }
            return ((Architecture) (obj));
        }

        public static Architecture valueOf(String s)
        {
            return (Architecture)Enum.valueOf(io/fabric/sdk/android/services/common/CommonUtils$Architecture, s);
        }

        public static Architecture[] values()
        {
            return (Architecture[])$VALUES.clone();
        }

        static 
        {
            X86_32 = new Architecture("X86_32", 0);
            X86_64 = new Architecture("X86_64", 1);
            ARM_UNKNOWN = new Architecture("ARM_UNKNOWN", 2);
            PPC = new Architecture("PPC", 3);
            PPC64 = new Architecture("PPC64", 4);
            ARMV6 = new Architecture("ARMV6", 5);
            ARMV7 = new Architecture("ARMV7", 6);
            UNKNOWN = new Architecture("UNKNOWN", 7);
            ARMV7S = new Architecture("ARMV7S", 8);
            ARM64 = new Architecture("ARM64", 9);
            $VALUES = (new Architecture[] {
                X86_32, X86_64, ARM_UNKNOWN, PPC, PPC64, ARMV6, ARMV7, UNKNOWN, ARMV7S, ARM64
            });
            matcher = new HashMap(4);
            matcher.put("armeabi-v7a", ARMV7);
            matcher.put("armeabi", ARMV6);
            matcher.put("x86", X86_32);
        }

        private Architecture(String s, int i)
        {
            super(s, i);
        }
    }


    static final int BYTES_IN_A_GIGABYTE = 0x40000000;
    static final int BYTES_IN_A_KILOBYTE = 1024;
    static final int BYTES_IN_A_MEGABYTE = 0x100000;
    private static final String CLS_SHARED_PREFERENCES_NAME = "com.crashlytics.prefs";
    static final boolean CLS_TRACE_DEFAULT = false;
    static final String CLS_TRACE_PREFERENCE_NAME = "com.crashlytics.Trace";
    static final String CRASHLYTICS_BUILD_ID = "com.crashlytics.android.build_id";
    public static final int DEVICE_STATE_BETAOS = 8;
    public static final int DEVICE_STATE_COMPROMISEDLIBRARIES = 32;
    public static final int DEVICE_STATE_DEBUGGERATTACHED = 4;
    public static final int DEVICE_STATE_ISSIMULATOR = 1;
    public static final int DEVICE_STATE_JAILBROKEN = 2;
    public static final int DEVICE_STATE_VENDORINTERNAL = 16;
    static final String ENCRYPTION_AES = "AES/ECB/PKCS7Padding";
    static final String FABRIC_BUILD_ID = "io.fabric.android.build_id";
    public static final Comparator FILE_MODIFIED_COMPARATOR = new Comparator() {

        public int compare(File file, File file1)
        {
            return (int)(file.lastModified() - file1.lastModified());
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((File)obj, (File)obj1);
        }

    };
    public static final String GOOGLE_SDK = "google_sdk";
    private static final char HEX_VALUES[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    private static final boolean LOGGING_DISABLED_DEFAULT = false;
    private static final String LOGGING_DISABLED_KEY = "com.crashlytics.SilenceCrashlyticsLogCat";
    private static final String LOG_PRIORITY_NAME_ASSERT = "A";
    private static final String LOG_PRIORITY_NAME_DEBUG = "D";
    private static final String LOG_PRIORITY_NAME_ERROR = "E";
    private static final String LOG_PRIORITY_NAME_INFO = "I";
    private static final String LOG_PRIORITY_NAME_UNKNOWN = "?";
    private static final String LOG_PRIORITY_NAME_VERBOSE = "V";
    private static final String LOG_PRIORITY_NAME_WARN = "W";
    public static final String MD5_INSTANCE = "MD5";
    public static final String SDK = "sdk";
    public static final String SHA1_INSTANCE = "SHA-1";
    private static final long UNCALCULATED_TOTAL_RAM = -1L;
    private static Boolean clsTrace = null;
    private static Boolean loggingEnabled = null;
    private static long totalRamInBytes = -1L;

    public CommonUtils()
    {
    }

    public static long calculateFreeRamInBytes(Context context)
    {
        android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
        ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(memoryinfo);
        return memoryinfo.availMem;
    }

    public static long calculateUsedDiskSpaceInBytes(String s)
    {
        s = new StatFs(s);
        long l = s.getBlockSize();
        return l * (long)s.getBlockCount() - l * (long)s.getAvailableBlocks();
    }

    public static boolean canTryConnection(Context context)
    {
label0:
        {
            if (checkPermission(context, "android.permission.ACCESS_NETWORK_STATE"))
            {
                context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (context == null || !context.isConnectedOrConnecting())
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean checkPermission(Context context, String s)
    {
        return context.checkCallingOrSelfPermission(s) == 0;
    }

    public static void closeOrLog(Closeable closeable, String s)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        Fabric.getLogger().e("Fabric", s, closeable);
        return;
    }

    public static void closeQuietly(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        throw closeable;
        closeable;
    }

    static long convertMemInfoToBytes(String s, String s1, int i)
    {
        return Long.parseLong(s.split(s1)[0].trim()) * (long)i;
    }

    public static void copyStream(InputStream inputstream, OutputStream outputstream, byte abyte0[])
        throws IOException
    {
        do
        {
            int i = inputstream.read(abyte0);
            if (i != -1)
            {
                outputstream.write(abyte0, 0, i);
            } else
            {
                return;
            }
        } while (true);
    }

    public static Cipher createCipher(int i, String s)
        throws InvalidKeyException
    {
        if (s.length() < 32)
        {
            throw new InvalidKeyException("Key must be at least 32 bytes.");
        }
        s = new SecretKeySpec(s.getBytes(), 0, 32, "AES/ECB/PKCS7Padding");
        Cipher cipher;
        try
        {
            cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Fabric.getLogger().e("Fabric", "Could not create Cipher for AES/ECB/PKCS7Padding - should never happen.", s);
            throw new RuntimeException(s);
        }
        cipher.init(i, s);
        return cipher;
    }

    public static transient String createInstanceIdFrom(String as[])
    {
        if (as != null && as.length != 0)
        {
            Object obj = new ArrayList();
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s = as[i];
                if (s != null)
                {
                    ((List) (obj)).add(s.replace("-", "").toLowerCase(Locale.US));
                }
            }

            Collections.sort(((List) (obj)));
            as = new StringBuilder();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); as.append((String)((Iterator) (obj)).next())) { }
            as = as.toString();
            if (as.length() > 0)
            {
                return sha1(as);
            }
        }
        return null;
    }

    public static byte[] dehexify(String s)
    {
        int j = s.length();
        byte abyte0[] = new byte[j / 2];
        for (int i = 0; i < j; i += 2)
        {
            abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }

        return abyte0;
    }

    public static String extractFieldFromSystemFile(File file, String s)
    {
        Object obj;
        Object obj2;
        String s1;
        obj = null;
        obj2 = null;
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_90;
        }
        obj = null;
        s1 = null;
        Object obj1 = new BufferedReader(new FileReader(file), 1024);
_L2:
        s1 = ((BufferedReader) (obj1)).readLine();
        obj = obj2;
        if (s1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = Pattern.compile("\\s*:\\s*").split(s1, 2);
        if (obj.length <= 1 || !obj[0].equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = obj[1];
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
        closeOrLog(((Closeable) (obj1)), "Failed to close system file reader.");
        return ((String) (obj));
        obj1;
        s = s1;
_L6:
        obj = s;
        Fabric.getLogger().e("Fabric", (new StringBuilder()).append("Error parsing ").append(file).toString(), ((Throwable) (obj1)));
        closeOrLog(s, "Failed to close system file reader.");
        return null;
        file;
_L4:
        closeOrLog(((Closeable) (obj)), "Failed to close system file reader.");
        throw file;
        file;
        obj = obj1;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        s = ((String) (obj1));
        obj1 = exception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void finishAffinity(Activity activity, int i)
    {
        if (activity == null)
        {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            activity.finishAffinity();
            return;
        } else
        {
            activity.setResult(i);
            activity.finish();
            return;
        }
    }

    public static void finishAffinity(Context context, int i)
    {
        if (context instanceof Activity)
        {
            finishAffinity((Activity)context, i);
        }
    }

    public static void flushOrLog(Flushable flushable, String s)
    {
        if (flushable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        flushable.flush();
        return;
        flushable;
        Fabric.getLogger().e("Fabric", s, flushable);
        return;
    }

    public static String getAppIconHashOrNull(Context context)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        context = context.getResources().openRawResource(getAppIconResourceId(context));
        obj = context;
        obj1 = context;
        String s = sha1(context);
        obj = context;
        obj1 = context;
        boolean flag = isNullOrEmpty(s);
        obj = s;
        if (flag)
        {
            obj = null;
        }
        closeOrLog(context, "Failed to close icon input stream.");
        return ((String) (obj));
        context;
        obj1 = obj;
        Fabric.getLogger().e("Fabric", "Could not calculate hash for app icon.", context);
        closeOrLog(((Closeable) (obj)), "Failed to close icon input stream.");
        return null;
        context;
        closeOrLog(((Closeable) (obj1)), "Failed to close icon input stream.");
        throw context;
    }

    public static int getAppIconResourceId(Context context)
    {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    public static android.app.ActivityManager.RunningAppProcessInfo getAppProcessInfo(String s, Context context)
    {
        Object obj1 = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
        Object obj = null;
        context = obj;
        if (obj1 != null)
        {
            obj1 = ((List) (obj1)).iterator();
            do
            {
                context = obj;
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                context = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj1)).next();
            } while (!((android.app.ActivityManager.RunningAppProcessInfo) (context)).processName.equals(s));
        }
        return context;
    }

    public static float getBatteryLevel(Context context)
    {
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i = context.getIntExtra("level", -1);
        int j = context.getIntExtra("scale", -1);
        return (float)i / (float)j;
    }

    public static int getBatteryVelocity(Context context, boolean flag)
    {
        float f = getBatteryLevel(context);
        if (!flag)
        {
            return 1;
        }
        if (flag && (double)f >= 99D)
        {
            return 3;
        }
        return !flag || (double)f >= 99D ? 0 : 2;
    }

    public static byte[] getBitmapBytes(Bitmap bitmap)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    public static boolean getBooleanResourceValue(Context context, String s, boolean flag)
    {
        boolean flag1 = flag;
        if (context != null)
        {
            Resources resources = context.getResources();
            flag1 = flag;
            if (resources != null)
            {
                int i = getResourcesIdentifier(context, s, "bool");
                if (i > 0)
                {
                    flag1 = resources.getBoolean(i);
                } else
                {
                    int j = getResourcesIdentifier(context, s, "string");
                    flag1 = flag;
                    if (j > 0)
                    {
                        return Boolean.parseBoolean(context.getString(j));
                    }
                }
            }
        }
        return flag1;
    }

    public static int getCpuArchitectureInt()
    {
        return Architecture.getValue().ordinal();
    }

    public static int getDeviceState(Context context)
    {
        int j = 0;
        if (isEmulator(context))
        {
            j = false | true;
        }
        int i = j;
        if (isRooted(context))
        {
            i = j | 2;
        }
        j = i;
        if (isDebuggerAttached())
        {
            j = i | 4;
        }
        return j;
    }

    public static boolean getProximitySensorEnabled(Context context)
    {
        while (isEmulator(context) || ((SensorManager)context.getSystemService("sensor")).getDefaultSensor(8) == null) 
        {
            return false;
        }
        return true;
    }

    public static String getResourcePackageName(Context context)
    {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0)
        {
            return context.getResources().getResourcePackageName(i);
        } else
        {
            return context.getPackageName();
        }
    }

    public static int getResourcesIdentifier(Context context, String s, String s1)
    {
        return context.getResources().getIdentifier(s, s1, getResourcePackageName(context));
    }

    public static SharedPreferences getSharedPrefs(Context context)
    {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    public static String getStringsFileValue(Context context, String s)
    {
        int i = getResourcesIdentifier(context, s, "string");
        if (i > 0)
        {
            return context.getString(i);
        } else
        {
            return "";
        }
    }

    public static long getTotalRamInBytes()
    {
        io/fabric/sdk/android/services/common/CommonUtils;
        JVM INSTR monitorenter ;
        if (totalRamInBytes != -1L) goto _L2; else goto _L1
_L1:
        long l1 = 0L;
        String s = extractFieldFromSystemFile(new File("/proc/meminfo"), "MemTotal");
        long l = l1;
        if (TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        s = s.toUpperCase(Locale.US);
        if (!s.endsWith("KB")) goto _L6; else goto _L5
_L5:
        l = convertMemInfoToBytes(s, "KB", 1024);
_L4:
        totalRamInBytes = l;
_L2:
        l = totalRamInBytes;
        io/fabric/sdk/android/services/common/CommonUtils;
        JVM INSTR monitorexit ;
        return l;
_L6:
label0:
        {
            if (!s.endsWith("MB"))
            {
                break label0;
            }
            l = convertMemInfoToBytes(s, "MB", 0x100000);
        }
          goto _L4
label1:
        {
            if (!s.endsWith("GB"))
            {
                break label1;
            }
            l = convertMemInfoToBytes(s, "GB", 0x40000000);
        }
          goto _L4
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Unexpected meminfo format while computing RAM: ").append(s).toString());
        l = l1;
          goto _L4
        NumberFormatException numberformatexception;
        numberformatexception;
        Fabric.getLogger().e("Fabric", (new StringBuilder()).append("Unexpected meminfo format while computing RAM: ").append(s).toString(), numberformatexception);
        l = l1;
          goto _L4
        Exception exception;
        exception;
        throw exception;
    }

    private static String hash(InputStream inputstream, String s)
    {
        byte abyte0[];
        s = MessageDigest.getInstance("SHA-1");
        abyte0 = new byte[1024];
_L1:
        int i = inputstream.read(abyte0);
label0:
        {
            if (i == -1)
            {
                break label0;
            }
            try
            {
                s.update(abyte0, 0, i);
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                Fabric.getLogger().e("Fabric", "Could not calculate hash for app icon.", inputstream);
                return "";
            }
        }
          goto _L1
        inputstream = hexify(s.digest());
        return inputstream;
    }

    private static String hash(String s, String s1)
    {
        return hash(s.getBytes(), s1);
    }

    private static String hash(byte abyte0[], String s)
    {
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance(s);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Fabric.getLogger().e("Fabric", (new StringBuilder()).append("Could not create hashing algorithm: ").append(s).append(", returning empty string.").toString(), abyte0);
            return "";
        }
        messagedigest.update(abyte0);
        return hexify(messagedigest.digest());
    }

    public static String hexify(byte abyte0[])
    {
        char ac[] = new char[abyte0.length * 2];
        for (int i = 0; i < abyte0.length; i++)
        {
            int j = abyte0[i] & 0xff;
            ac[i * 2] = HEX_VALUES[j >>> 4];
            ac[i * 2 + 1] = HEX_VALUES[j & 0xf];
        }

        return new String(ac);
    }

    public static void hideKeyboard(Context context, View view)
    {
        context = (InputMethodManager)context.getSystemService("input_method");
        if (context != null)
        {
            context.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean isAppDebuggable(Context context)
    {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean isClsTrace(Context context)
    {
        if (clsTrace == null)
        {
            clsTrace = Boolean.valueOf(getBooleanResourceValue(context, "com.crashlytics.Trace", false));
        }
        return clsTrace.booleanValue();
    }

    public static boolean isDebuggerAttached()
    {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static boolean isEmulator(Context context)
    {
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        return "sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT) || context == null;
    }

    public static boolean isLoggingEnabled(Context context)
    {
        boolean flag = false;
        if (loggingEnabled == null)
        {
            if (!getBooleanResourceValue(context, "com.crashlytics.SilenceCrashlyticsLogCat", false))
            {
                flag = true;
            }
            loggingEnabled = Boolean.valueOf(flag);
        }
        return loggingEnabled.booleanValue();
    }

    public static boolean isNullOrEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    public static boolean isRooted(Context context)
    {
        boolean flag;
        flag = isEmulator(context);
        context = Build.TAGS;
        break MISSING_BLOCK_LABEL_9;
        if ((flag || context == null || !context.contains("test-keys")) && !(new File("/system/app/Superuser.apk")).exists())
        {
            context = new File("/system/xbin/su");
            if (flag || !context.exists())
            {
                return false;
            }
        }
        return true;
    }

    public static void logControlled(Context context, int i, String s, String s1)
    {
        if (isClsTrace(context))
        {
            Fabric.getLogger().log(i, "Fabric", s1);
        }
    }

    public static void logControlled(Context context, String s)
    {
        if (isClsTrace(context))
        {
            Fabric.getLogger().d("Fabric", s);
        }
    }

    public static void logControlledError(Context context, String s, Throwable throwable)
    {
        if (isClsTrace(context))
        {
            Fabric.getLogger().e("Fabric", s);
        }
    }

    public static void logOrThrowIllegalArgumentException(String s, String s1)
    {
        if (Fabric.isDebuggable())
        {
            throw new IllegalArgumentException(s1);
        } else
        {
            Fabric.getLogger().w(s, s1);
            return;
        }
    }

    public static void logOrThrowIllegalStateException(String s, String s1)
    {
        if (Fabric.isDebuggable())
        {
            throw new IllegalStateException(s1);
        } else
        {
            Fabric.getLogger().w(s, s1);
            return;
        }
    }

    public static String logPriorityToString(int i)
    {
        switch (i)
        {
        default:
            return "?";

        case 7: // '\007'
            return "A";

        case 3: // '\003'
            return "D";

        case 6: // '\006'
            return "E";

        case 4: // '\004'
            return "I";

        case 2: // '\002'
            return "V";

        case 5: // '\005'
            return "W";
        }
    }

    public static String md5(String s)
    {
        return hash(s, "MD5");
    }

    public static String md5(byte abyte0[])
    {
        return hash(abyte0, "MD5");
    }

    public static void openKeyboard(Context context, View view)
    {
        context = (InputMethodManager)context.getSystemService("input_method");
        if (context != null)
        {
            context.showSoftInputFromInputMethod(view.getWindowToken(), 0);
        }
    }

    public static String padWithZerosToMaxIntWidth(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("value must be zero or greater");
        } else
        {
            return String.format(Locale.US, "%1$10s", new Object[] {
                Integer.valueOf(i)
            }).replace(' ', '0');
        }
    }

    public static String resolveBuildId(Context context)
    {
        String s = null;
        int j = getResourcesIdentifier(context, "io.fabric.android.build_id", "string");
        int i = j;
        if (j == 0)
        {
            i = getResourcesIdentifier(context, "com.crashlytics.android.build_id", "string");
        }
        if (i != 0)
        {
            s = context.getResources().getString(i);
            Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Build ID is: ").append(s).toString());
        }
        return s;
    }

    public static String sha1(InputStream inputstream)
    {
        return hash(inputstream, "SHA-1");
    }

    public static String sha1(String s)
    {
        return hash(s, "SHA-1");
    }

    public static String sha1(byte abyte0[])
    {
        return hash(abyte0, "SHA-1");
    }

    public static String streamToString(InputStream inputstream)
        throws IOException
    {
        inputstream = (new Scanner(inputstream)).useDelimiter("\\A");
        if (inputstream.hasNext())
        {
            return inputstream.next();
        } else
        {
            return "";
        }
    }

    public static boolean stringsEqualIncludingNull(String s, String s1)
    {
        if (s == s1)
        {
            return true;
        }
        if (s != null)
        {
            return s.equals(s1);
        } else
        {
            return false;
        }
    }

}
