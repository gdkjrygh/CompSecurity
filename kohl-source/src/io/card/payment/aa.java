// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class aa
{

    private static String a = null;
    private static String b = null;
    private static String c;

    static HashMap a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("android_model", Build.MODEL);
        hashmap.put("android_build_id", Build.ID);
        hashmap.put("android_board", Build.BOARD);
        hashmap.put("android_bootloader", Build.BOOTLOADER);
        hashmap.put("android_brand", Build.BRAND);
        hashmap.put("android_cpu_abi", Build.CPU_ABI);
        hashmap.put("android_cpu_abi2", Build.CPU_ABI2);
        hashmap.put("android_device", Build.DEVICE);
        hashmap.put("android_display", Build.DISPLAY);
        hashmap.put("android_hardware", Build.HARDWARE);
        hashmap.put("android_manufacturer", Build.MANUFACTURER);
        hashmap.put("android_product", Build.PRODUCT);
        hashmap.put("android_tags", Build.TAGS);
        hashmap.put("android_time", String.valueOf(Build.TIME));
        hashmap.put("android_user", Build.USER);
        hashmap.put("android_sdk", String.valueOf(android.os.Build.VERSION.SDK_INT));
        hashmap.put("android_version", android.os.Build.VERSION.RELEASE);
        if (b != null)
        {
            hashmap.put("supported_capture_resolutions", b);
        }
        return hashmap;
    }

    static HashMap a(Context context)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("uid", b(context));
        hashmap.put("manufacturer", Build.MANUFACTURER);
        hashmap.put("model", (new StringBuilder()).append(Build.MODEL).append(',').append(Build.PRODUCT).toString());
        hashmap.put("os", "android");
        hashmap.put("os_version", android.os.Build.VERSION.RELEASE);
        hashmap.put("library_version", "sdk-3.1.5");
        return hashmap;
    }

    static void a(List list)
    {
        if (list != null)
        {
            b = "[";
            for (list = list.iterator(); list.hasNext();)
            {
                android.hardware.Camera.Size size = (android.hardware.Camera.Size)list.next();
                b = (new StringBuilder()).append(b).append("[").append(size.width).append(", ").append(size.height).append("], ").toString();
            }

            b = (new StringBuilder()).append(b).append("]").toString();
        }
        (new StringBuilder("- supported preview sizes: ")).append(b).toString();
    }

    public static String b()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        String s;
        String s1;
        int i;
        i = android.os.Build.VERSION.SDK_INT;
        s1 = android.os.Build.VERSION.INCREMENTAL;
        s = (new StringBuilder("unknown[")).append(i).append("]").toString();
        if (i != 10000) goto _L4; else goto _L3
_L3:
        s = (new StringBuilder("Current Development: ")).append(android.os.Build.VERSION.CODENAME).toString();
_L6:
        c = (new StringBuilder()).append(android.os.Build.VERSION.RELEASE).append(" (").append(s).append(")/").append(s1).toString();
_L2:
        return c;
_L4:
        if (i >= 14)
        {
            s = "Ice Cream Sandwich";
        } else
        if (i >= 13)
        {
            s = "Honeycomb MR2";
        } else
        if (i >= 12)
        {
            s = "Honeycomb MR1";
        } else
        if (i >= 11)
        {
            s = "Honeycomb";
        } else
        if (i >= 10)
        {
            s = "Gingerbread MR1";
        } else
        if (i >= 9)
        {
            s = "Gingerbread";
        } else
        if (i >= 8)
        {
            s = "Froyo";
        } else
        if (i >= 7)
        {
            s = "Eclair MR1";
        } else
        if (i >= 6)
        {
            s = "Eclair 0.1";
        } else
        if (i >= 5)
        {
            s = "Eclair";
        } else
        if (i >= 4)
        {
            s = "Donut";
        } else
        if (i >= 3)
        {
            s = "Cupcake";
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static String b(Context context)
    {
        if (a != null)
        {
            return a;
        }
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (context.contentEquals("9774d56d682e549c"))
        {
            context = "n/a";
        }
        if (android.os.Build.VERSION.SDK_INT < 9) goto _L2; else goto _L1
_L1:
        Object obj = (String)android/os/Build.getField("SERIAL").get(null);
_L4:
        a = (new StringBuilder()).append(context).append(' ').append(((String) (obj))).toString();
        (new StringBuilder("device UUID: ")).append(a).toString();
        return a;
        obj;
        Log.w("DeviceInfo", "error getting serial number", ((Throwable) (obj)));
_L2:
        obj = "n/a";
        if (true) goto _L4; else goto _L3
_L3:
    }

}
