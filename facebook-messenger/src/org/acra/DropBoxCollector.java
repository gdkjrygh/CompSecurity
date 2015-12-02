// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra;

import android.content.Context;
import android.text.format.Time;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.acra.reporter.ReportsCrashes;

// Referenced classes of package org.acra:
//            Compatibility, ACRA

class DropBoxCollector
{

    private static final String SYSTEM_TAGS[] = {
        "system_app_anr", "system_app_wtf", "system_app_crash", "system_server_anr", "system_server_wtf", "system_server_crash", "BATTERY_DISCHARGE_INFO", "SYSTEM_RECOVERY_LOG", "SYSTEM_BOOT", "SYSTEM_LAST_KMSG", 
        "APANIC_CONSOLE", "APANIC_THREADS", "SYSTEM_RESTART", "SYSTEM_TOMBSTONE", "data_app_strictmode"
    };

    DropBoxCollector()
    {
    }

    public static String read(Context context, String as[])
    {
        Object obj = Compatibility.getDropBoxServiceName();
        if (obj == null) goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder;
        Method method;
        stringbuilder = new StringBuilder();
        obj = context.getSystemService(((String) (obj)));
        method = obj.getClass().getMethod("getNextEntry", new Class[] {
            java/lang/String, Long.TYPE
        });
        if (method == null) goto _L4; else goto _L3
_L3:
        Time time;
        long l;
        time = new Time();
        time.setToNow();
        time.minute = time.minute - ACRA.getConfig().dropboxCollectionMinutes();
        time.normalize(false);
        l = time.toMillis(false);
        if (!ACRA.getConfig().includeDropBoxSystemTags()) goto _L6; else goto _L5
_L5:
        context = new ArrayList(Arrays.asList(SYSTEM_TAGS));
_L17:
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (as.length > 0)
        {
            context.addAll(Arrays.asList(as));
        }
        if (context.size() <= 0) goto _L8; else goto _L7
_L7:
        as = context.iterator();
_L13:
        if (!as.hasNext()) goto _L4; else goto _L9
_L9:
        String s;
        s = (String)as.next();
        stringbuilder.append("Tag: ").append(s).append('\n');
        context = ((Context) (method.invoke(obj, new Object[] {
            s, Long.valueOf(l)
        })));
        if (context == null) goto _L11; else goto _L10
_L10:
        Method method1;
        Method method2;
        Method method3;
        method1 = context.getClass().getMethod("getText", new Class[] {
            Integer.TYPE
        });
        method2 = context.getClass().getMethod("getTimeMillis", (Class[])null);
        method3 = context.getClass().getMethod("close", (Class[])null);
_L16:
        if (context == null) goto _L13; else goto _L12
_L12:
        String s1;
        long l1;
        l1 = ((Long)method2.invoke(context, (Object[])null)).longValue();
        time.set(l1);
        stringbuilder.append("@").append(time.format2445()).append('\n');
        s1 = (String)method1.invoke(context, new Object[] {
            Integer.valueOf(500)
        });
        if (s1 == null) goto _L15; else goto _L14
_L14:
        stringbuilder.append("Text: ").append(s1).append('\n');
_L18:
        method3.invoke(context, (Object[])null);
        context = ((Context) (method.invoke(obj, new Object[] {
            s, Long.valueOf(l1)
        })));
          goto _L16
_L6:
        context = new ArrayList();
          goto _L17
        context;
        Log.i(ACRA.LOG_TAG, "DropBoxManager not available.");
_L2:
        return "N/A";
_L15:
        stringbuilder.append("Not Text!").append('\n');
          goto _L18
        context;
        Log.i(ACRA.LOG_TAG, "DropBoxManager not available.");
          goto _L2
_L11:
        stringbuilder.append("Nothing.").append('\n');
          goto _L13
        context;
        Log.i(ACRA.LOG_TAG, "DropBoxManager not available.");
          goto _L2
_L8:
        stringbuilder.append("No tag configured for collection.");
_L4:
        context = stringbuilder.toString();
        return context;
        context;
        Log.i(ACRA.LOG_TAG, "DropBoxManager not available.");
          goto _L2
        context;
        Log.i(ACRA.LOG_TAG, "DropBoxManager not available.");
          goto _L2
        context;
        Log.i(ACRA.LOG_TAG, "DropBoxManager not available.");
          goto _L2
    }

}
