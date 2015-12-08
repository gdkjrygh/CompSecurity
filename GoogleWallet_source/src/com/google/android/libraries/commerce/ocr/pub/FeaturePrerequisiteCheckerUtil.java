// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.pub;

import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.base.Function;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import javax.inject.Provider;

public class FeaturePrerequisiteCheckerUtil
{

    public static final HashSet ALL_CPU_ABIS = newHashSet(new String[] {
        "armeabi", "armeabi-v7a", "arm64-v8a", "x86", "mips"
    });
    public static final String CPU_ARM64_V8A = "arm64-v8a";
    public static final String CPU_ARMEABI = "armeabi";
    public static final String CPU_ARMEABI_V7A = "armeabi-v7a";
    public static final String CPU_MIPS = "mips";
    public static final String CPU_X86 = "x86";
    private static final String DELIMETER = ",";
    public static final HashSet EMPTY_BLACKLIST = new HashSet();
    static final int MIN_ORIENTATION_SDK = 13;
    static final int MIN_SDK = 9;
    public static final HashSet NATIVE_CPU_ABIS = newHashSet(new String[] {
        "armeabi-v7a", "arm64-v8a"
    });
    private static final String TAG = "FeaturePrerequisiteCheckerUtil";
    private final int buildVersion;
    private final Provider cameraCountProvider;
    private final Function cameraInfoProvider;
    private final String model;
    private final PackageManager packageManager;

    protected FeaturePrerequisiteCheckerUtil(int i, String s, Function function, PackageManager packagemanager)
    {
        this(i, s, function, getCameraCountProvider(), packagemanager);
    }

    protected FeaturePrerequisiteCheckerUtil(int i, String s, Function function, Provider provider, PackageManager packagemanager)
    {
        buildVersion = i;
        model = s;
        cameraInfoProvider = function;
        cameraCountProvider = provider;
        packageManager = packagemanager;
    }

    public FeaturePrerequisiteCheckerUtil(PackageManager packagemanager)
    {
        this(android.os.Build.VERSION.SDK_INT, Build.MODEL, getCameraInfoFunction(), packagemanager);
    }

    static Provider getCameraCountProvider()
    {
        return new Provider() {

            private static Integer get()
            {
                int i;
                try
                {
                    i = Camera.getNumberOfCameras();
                }
                catch (RuntimeException runtimeexception)
                {
                    Log.e("FeaturePrerequisiteCheckerUtil", "Exception getting camera count", runtimeexception);
                    return Integer.valueOf(0);
                }
                return Integer.valueOf(i);
            }

            public final volatile Object get()
            {
                return get();
            }

        };
    }

    static Function getCameraInfoFunction()
    {
        return new Function() {

            private static android.hardware.Camera.CameraInfo apply(Integer integer)
            {
                android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
                Camera.getCameraInfo(integer.intValue(), camerainfo);
                return camerainfo;
            }

            public final volatile Object apply(Object obj)
            {
                return apply((Integer)obj);
            }

        };
    }

    public static transient HashSet newHashSet(Object aobj[])
    {
        HashSet hashset = new HashSet(aobj.length);
        Collections.addAll(hashset, aobj);
        return hashset;
    }

    public static HashSet split(String s)
    {
        s = s.split(",");
        if (s.length == 1 && TextUtils.isEmpty(s[0]))
        {
            return newHashSet(new String[0]);
        } else
        {
            return newHashSet(s);
        }
    }

    public boolean buildVersionOK()
    {
        int i = buildVersion;
        Log.v("FeaturePrerequisiteCheckerUtil", (new StringBuilder(26)).append("Build version: ").append(i).toString());
        if (buildVersion < 9)
        {
            int j = buildVersion;
            Log.w("FeaturePrerequisiteCheckerUtil", (new StringBuilder(50)).append("Build version ").append(j).append(" is less than 9").toString());
            return false;
        } else
        {
            return true;
        }
    }

    public boolean cameraOK()
    {
        int i;
        int j;
        j = ((Integer)cameraCountProvider.get()).intValue();
        i = 0;
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        android.hardware.Camera.CameraInfo camerainfo = (android.hardware.Camera.CameraInfo)cameraInfoProvider.apply(Integer.valueOf(i));
        Object obj;
        if (camerainfo.facing == 0)
        {
            obj = "rear-";
        } else
        {
            obj = "forward-";
        }
        Log.v("FeaturePrerequisiteCheckerUtil", (new StringBuilder(String.valueOf(obj).length() + 39)).append("Camera #").append(i).append(" is a ").append(((String) (obj))).append("facing camera.").toString());
        if (camerainfo.facing == 0)
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e("FeaturePrerequisiteCheckerUtil", (new StringBuilder(50)).append("Unable to query camera info for camera ").append(i).toString(), ((Throwable) (obj)));
        i++;
          goto _L3
_L2:
        Log.w("FeaturePrerequisiteCheckerUtil", "No rear-facing camera detected.");
        return false;
    }

    public boolean cpuAbiOK(HashSet hashset)
    {
        String s = String.valueOf(Build.CPU_ABI);
        if (s.length() != 0)
        {
            s = "CPU_ABI: ".concat(s);
        } else
        {
            s = new String("CPU_ABI: ");
        }
        Log.v("FeaturePrerequisiteCheckerUtil", s);
        s = String.valueOf(Build.CPU_ABI2);
        if (s.length() != 0)
        {
            s = "CPU_ABI2: ".concat(s);
        } else
        {
            s = new String("CPU_ABI2: ");
        }
        Log.v("FeaturePrerequisiteCheckerUtil", s);
        if (!hashset.contains(Build.CPU_ABI) && !hashset.contains(Build.CPU_ABI2))
        {
            Log.w("FeaturePrerequisiteCheckerUtil", String.format("CPU ABIs [%s, %s] are not supported.", new Object[] {
                Build.CPU_ABI, Build.CPU_ABI2
            }));
            return false;
        } else
        {
            return true;
        }
    }

    public boolean isConnectionOK(HashSet hashset, ConnectivityManager connectivitymanager, TelephonyManager telephonymanager)
    {
        NetworkInfo networkinfo = connectivitymanager.getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnectedOrConnecting())
        {
            Log.v("FeaturePrerequisiteCheckerUtil", "No active network connection");
            return false;
        }
        connectivitymanager = String.valueOf(networkinfo.getTypeName());
        if (connectivitymanager.length() != 0)
        {
            connectivitymanager = "Connection type = ".concat(connectivitymanager);
        } else
        {
            connectivitymanager = new String("Connection type = ");
        }
        Log.v("FeaturePrerequisiteCheckerUtil", connectivitymanager);
        int i;
        switch (networkinfo.getType())
        {
        default:
            return false;

        case 1: // '\001'
        case 6: // '\006'
        case 9: // '\t'
            return true;

        case 0: // '\0'
            i = telephonymanager.getNetworkType();
            break;
        }
        Log.v("FeaturePrerequisiteCheckerUtil", (new StringBuilder(36)).append("Mobile connection type = ").append(i).toString());
        return !hashset.contains(Integer.valueOf(telephonymanager.getNetworkType()));
    }

    public boolean modelOK(String s)
    {
        return modelOK(split(s));
    }

    public boolean modelOK(HashSet hashset)
    {
        String s = String.valueOf(model);
        if (s.length() != 0)
        {
            s = "Model: ".concat(s);
        } else
        {
            s = new String("Model: ");
        }
        Log.v("FeaturePrerequisiteCheckerUtil", s);
        for (hashset = hashset.iterator(); hashset.hasNext();)
        {
            if (((String)hashset.next()).equalsIgnoreCase(model))
            {
                hashset = model;
                Log.w("FeaturePrerequisiteCheckerUtil", (new StringBuilder(String.valueOf(hashset).length() + 22)).append("Model ").append(hashset).append(" is blacklisted.").toString());
                return false;
            }
        }

        return true;
    }

    public boolean orientationOk()
    {
        return buildVersion < 13 || packageManager.hasSystemFeature("android.hardware.screen.portrait");
    }

}
