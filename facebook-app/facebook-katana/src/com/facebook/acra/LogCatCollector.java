// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra;

import android.util.Log;
import com.facebook.acra.reporter.ReportsCrashes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.facebook.acra:
//            ACRA, Compatibility

class LogCatCollector
{

    private static final int DEFAULT_TAIL_COUNT = 100;
    private static final String NEWLINE = "\n";

    LogCatCollector()
    {
    }

    protected static String collectLogCat(String s)
    {
        boolean flag = false;
        Object obj;
        obj = new ArrayList();
        ((ArrayList) (obj)).add("logcat");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        ((ArrayList) (obj)).add("-b");
        ((ArrayList) (obj)).add(s);
        int i;
        s = new ArrayList(Arrays.asList(ACRA.getConfig().logcatArguments()));
        i = s.indexOf("-t");
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        if (i < s.size() && Compatibility.getAPILevel() < 8)
        {
            s.remove(i + 1);
            s.remove(i);
            s.add("-d");
        }
        ArrayList arraylist;
        ((ArrayList) (obj)).addAll(s);
        s = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec((String[])((ArrayList) (obj)).toArray(new String[((ArrayList) (obj)).size()])).getInputStream()));
        obj = ACRA.LOG_TAG;
        arraylist = new ArrayList(100);
        i = 0;
_L1:
        obj = s.readLine();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        arraylist.add(obj);
        i = i + ((String) (obj)).length() + 1;
          goto _L1
        s = new StringBuilder(i);
        i = ((flag) ? 1 : 0);
_L3:
        obj = s;
        if (i >= arraylist.size())
        {
            break; /* Loop/switch isn't completed */
        }
        s.append((String)arraylist.get(i));
        s.append("\n");
        i++;
        if (true) goto _L3; else goto _L2
        obj;
        s = null;
_L5:
        Log.e(ACRA.LOG_TAG, "LogCatCollector.collectLogcat could not retrieve data.", ((Throwable) (obj)));
        obj = s;
_L2:
        if (obj == null)
        {
            return null;
        } else
        {
            return ((StringBuilder) (obj)).toString();
        }
        obj;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
