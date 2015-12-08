// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.app.GmsApplicationContext;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.gservices.GServicesHelper;
import com.google.android.gms.common.internal.Asserts;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicInteger;

public final class AndroidUtils
{

    public static final GservicesValue ANDROID_ID = GservicesValue.value("android_id", Long.valueOf(0L));
    private static final char HEX_DIGITS[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };
    private static boolean sInMainGmsProcess = false;
    private static String sProcessName = null;
    private static final AtomicInteger sUniqueRequestCode = new AtomicInteger();

    private AndroidUtils()
    {
    }

    public static void assertMainGmsProcess()
    {
        if (Build.TYPE.equals("user"))
        {
            return;
        }
        com/google/android/gms/common/util/AndroidUtils;
        JVM INSTR monitorenter ;
        if (!sInMainGmsProcess)
        {
            String s = GmsApplicationContext.getInstance().getApplicationInfo().processName;
            String s1 = getProcessName();
            boolean flag = s.equals(s1);
            sInMainGmsProcess = flag;
            Asserts.checkState(flag, "Current process (%d, %s) is not the GMS Core main process (%s)", new Object[] {
                Integer.valueOf(Process.myPid()), s1, s
            });
        }
        com/google/android/gms/common/util/AndroidUtils;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        com/google/android/gms/common/util/AndroidUtils;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static Intent createGmsCoreIntent(String s)
    {
        return (new Intent(s)).setPackage("com.google.android.gms");
    }

    public static String getAndroidCertHeaderValue(Context context, String s)
    {
        Object obj;
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        obj = null;
        context = getPackageCertificateHashBytes(context.getPackageManager().getPackageInfo(s, 64), "SHA1");
        if (context == null)
        {
            context = null;
        } else
        {
            try
            {
                context = toHex$5a238448(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.d("AndroidUtils", (new StringBuilder("Cannot get package certificate for [")).append(s).append("]").toString());
                context = obj;
            }
        }
        return context;
    }

    public static long getAndroidId$faab219()
    {
        return GServicesHelper.getLong(ANDROID_ID);
    }

    public static Context getCallingContext(Activity activity)
    {
        String s = getCallingPackage(activity);
        Object obj;
        if (s == null)
        {
            Log.e("AndroidUtils", (new StringBuilder("getCallingContext(): couldn't find calling package name from ")).append(activity).toString());
            obj = null;
        } else
        {
            obj = activity;
            if (!activity.getPackageName().equals(s))
            {
                try
                {
                    activity = activity.createPackageContext(s, 0);
                }
                // Misplaced declaration of an exception variable
                catch (Activity activity)
                {
                    return null;
                }
                return activity;
            }
        }
        return ((Context) (obj));
    }

    public static String getCallingPackage(Activity activity)
    {
        ComponentName componentname = activity.getCallingActivity();
        if (componentname == null)
        {
            activity = null;
        } else
        {
            String s = componentname.getPackageName();
            activity = s;
            if (s == null)
            {
                Log.e("AndroidUtils", (new StringBuilder("getCallingPackage(): Couldn't get a package name from ")).append(componentname).toString());
                return null;
            }
        }
        return activity;
    }

    public static int getCurrentVersionCode(Context context)
    {
        String s = context.getPackageName();
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(s, 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("AndroidUtils", (new StringBuilder("Could not find package info for package: ")).append(s).toString());
            return -1;
        }
        return i;
    }

    public static MessageDigest getMessageDigest(String s)
    {
        int i = 0;
_L3:
        if (i >= 2) goto _L2; else goto _L1
_L1:
        MessageDigest messagedigest = MessageDigest.getInstance(s);
        if (messagedigest != null)
        {
            return messagedigest;
        }
        continue; /* Loop/switch isn't completed */
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
        i++;
          goto _L3
_L2:
        return null;
    }

    public static String getMetadataTagForPackage(Context context, String s, String s1)
    {
        try
        {
            context = context.getPackageManager().getApplicationInfo(s, 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("AndroidUtils", "Caller attempted to insert app data for non-existent package.", context);
            return "";
        }
        if (context != null)
        {
            if ((context = ((ApplicationInfo) (context)).metaData) != null)
            {
                return context.getString(s1);
            }
        }
        return null;
    }

    public static String getNetworkId(Context context)
    {
        context = (TelephonyManager)context.getSystemService("phone");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        context = context.getNetworkOperator();
        return context;
        context;
        return "none";
    }

    public static byte[] getPackageCertificateHashBytes(Context context, String s)
        throws android.content.pm.PackageManager.NameNotFoundException
    {
        return getPackageCertificateHashBytes(context.getPackageManager().getPackageInfo(s, 64), "SHA1");
    }

    private static byte[] getPackageCertificateHashBytes(PackageInfo packageinfo, String s)
    {
label0:
        {
            if (packageinfo.signatures != null && packageinfo.signatures.length > 0)
            {
                s = getMessageDigest(s);
                if (s != null)
                {
                    break label0;
                }
            }
            return null;
        }
        return s.digest(packageinfo.signatures[0].toByteArray());
    }

    private static String getProcessName()
    {
        com/google/android/gms/common/util/AndroidUtils;
        JVM INSTR monitorenter ;
        Object obj;
        if (sProcessName == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        obj = sProcessName;
        com/google/android/gms/common/util/AndroidUtils;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        com/google/android/gms/common/util/AndroidUtils;
        JVM INSTR monitorexit ;
        Object obj2;
        obj = null;
        obj2 = null;
        Object obj1 = new BufferedReader(new FileReader("/proc/self/cmdline"));
        obj = ((BufferedReader) (obj1)).readLine().trim();
        com/google/android/gms/common/util/AndroidUtils;
        JVM INSTR monitorenter ;
        if (sProcessName == null)
        {
            sProcessName = ((String) (obj));
        }
        com/google/android/gms/common/util/AndroidUtils;
        JVM INSTR monitorexit ;
        try
        {
            ((BufferedReader) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w("AndroidUtils", ((Exception) (obj)).getMessage(), ((Throwable) (obj)));
        }
        return sProcessName;
        obj;
        com/google/android/gms/common/util/AndroidUtils;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        com/google/android/gms/common/util/AndroidUtils;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2) { }
        finally
        {
            obj = obj1;
        }
_L4:
        obj = obj1;
        Log.e("AndroidUtils", ((IOException) (obj2)).getMessage(), ((Throwable) (obj2)));
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w("AndroidUtils", ((Exception) (obj)).getMessage(), ((Throwable) (obj)));
            }
        }
        break MISSING_BLOCK_LABEL_71;
        obj1;
_L2:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w("AndroidUtils", ((Exception) (obj)).getMessage(), ((Throwable) (obj)));
            }
        }
        throw obj1;
        if (true) goto _L2; else goto _L1
_L1:
        IOException ioexception;
        ioexception;
        obj1 = obj2;
        obj2 = ioexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Context getRemoteContext(Context context, String s)
    {
        if (context.getPackageName().equals(s))
        {
            return context;
        }
        try
        {
            context = context.createPackageContext(s, 3);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static boolean hasSystemSharedLibrary(Context context, String s)
    {
        context = context.getPackageManager().getSystemSharedLibraryNames();
        if (context != null)
        {
            int i = 0;
            while (i < context.length) 
            {
                if (s.equalsIgnoreCase(context[i]))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static String toHex$5a238448(byte abyte0[])
    {
        int j = abyte0.length;
        StringBuilder stringbuilder = new StringBuilder(j * 2);
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(HEX_DIGITS[(abyte0[i] & 0xf0) >>> 4]);
            stringbuilder.append(HEX_DIGITS[abyte0[i] & 0xf]);
        }

        return stringbuilder.toString();
    }

    public static void verifyPackageName(Context context, String s)
        throws SecurityException
    {
        for (int i = Binder.getCallingUid(); i == Process.myUid() || GooglePlayServicesUtil.uidHasPackageName(context, i, s);)
        {
            return;
        }

        throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[] {
            s
        }));
    }

}
