// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.java.strings.Charsets;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.utils:
//            IOUtils

public final class DebugUtils
{

    public static final char NEW_LINE_SEPARATOR = 10;
    public static final String UTF_8_ENC;

    private DebugUtils()
    {
    }

    public static void dumpIntent(Intent intent)
    {
        Object obj = SoundCloudApplication.TAG;
        (new StringBuilder("dumpIntent(")).append(intent).append(")");
        obj = intent.getExtras();
        if (obj != null)
        {
            intent = new HashMap();
            String s;
            for (Iterator iterator = ((Bundle) (obj)).keySet().iterator(); iterator.hasNext(); intent.put(s, ((Bundle) (obj)).get(s)))
            {
                s = (String)iterator.next();
            }

            obj = SoundCloudApplication.TAG;
            (new StringBuilder("extras: ")).append(intent);
        }
    }

    public static boolean dumpLog(Context context)
    {
        if (context.getPackageManager().checkPermission("android.permission.READ_LOGS", context.getPackageName()) != 0)
        {
            context = SoundCloudApplication.TAG;
            return false;
        }
        context = context.getExternalFilesDir("debug");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        BufferedReader bufferedreader;
        PrintStream printstream;
        IOUtils.mkdirs(context);
        context = new File(context, (new StringBuilder("log-")).append(System.currentTimeMillis()).toString());
        bufferedreader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -d").getInputStream(), UTF_8_ENC));
        printstream = new PrintStream(new FileOutputStream(context), true, UTF_8_ENC);
_L1:
        String s1 = bufferedreader.readLine();
label0:
        {
            if (s1 == null)
            {
                break label0;
            }
            try
            {
                printstream.println(s1);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = SoundCloudApplication.TAG;
                return false;
            }
        }
          goto _L1
        printstream.close();
        String s = SoundCloudApplication.TAG;
        (new StringBuilder("wrote log to ")).append(context);
        return true;
        context = SoundCloudApplication.TAG;
        return false;
    }

    public static void dumpStack(Context context)
    {
        Object obj1;
        obj1 = Thread.getAllStackTraces();
        context = context.getExternalFilesDir("debug");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        IOUtils.mkdirs(context);
        context = new File(context, (new StringBuilder("traces-")).append(System.currentTimeMillis()).toString());
        Object obj;
        obj = new PrintStream(new FileOutputStream(context), true, UTF_8_ENC);
        obj1 = ((Map) (obj1)).entrySet().iterator();
_L1:
        StackTraceElement astacktraceelement[];
        int j;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_181;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
        ((PrintStream) (obj)).println(entry.getKey());
        astacktraceelement = (StackTraceElement[])entry.getValue();
        j = astacktraceelement.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            StackTraceElement stacktraceelement = astacktraceelement[i];
            try
            {
                ((PrintStream) (obj)).println((new StringBuilder("  ")).append(stacktraceelement).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = SoundCloudApplication.TAG;
                return;
            }
            i++;
        } while (true);
        ((PrintStream) (obj)).println();
          goto _L1
        ((PrintStream) (obj)).close();
        obj = SoundCloudApplication.TAG;
        (new StringBuilder("dumped stack to ")).append(context);
        return;
        context = SoundCloudApplication.TAG;
        return;
    }

    public static String getLogDump(int i)
    {
        Object obj = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(String.format("logcat -v time -d -t %d", new Object[] {
            Integer.valueOf(i)
        })).getInputStream()));
        Object obj1 = new StringBuilder();
_L3:
        Object obj2 = ((BufferedReader) (obj)).readLine();
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj1)).append(((String) (obj2)));
        ((StringBuilder) (obj1)).append('\n');
          goto _L3
        obj1;
_L7:
        IOUtils.close(((java.io.Closeable) (obj)));
        return "";
_L2:
        obj1 = ((StringBuilder) (obj1)).toString();
        IOUtils.close(((java.io.Closeable) (obj)));
        return ((String) (obj1));
        obj;
        obj2 = null;
        obj1 = obj;
_L5:
        IOUtils.close(((java.io.Closeable) (obj2)));
        throw obj1;
        obj1;
        obj2 = obj;
        if (true) goto _L5; else goto _L4
_L4:
        IOException ioexception;
        ioexception;
        ioexception = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static 
    {
        UTF_8_ENC = Charsets.UTF_8.displayName();
    }
}
