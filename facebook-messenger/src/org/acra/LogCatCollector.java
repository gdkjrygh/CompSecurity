// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra;

import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.acra.reporter.ReportsCrashes;
import org.acra.util.BoundedLinkedList;

// Referenced classes of package org.acra:
//            ACRA, Compatibility

class LogCatCollector
{

    private static final int DEFAULT_TAIL_COUNT = 100;

    LogCatCollector()
    {
    }

    protected static String collectLogCat(String s)
    {
        int j = -1;
        Object obj;
        obj = new ArrayList();
        ((ArrayList) (obj)).add("logcat");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        ((ArrayList) (obj)).add("-b");
        ((ArrayList) (obj)).add(s);
        Object obj1;
        int k;
        obj1 = new ArrayList(Arrays.asList(ACRA.getConfig().logcatArguments()));
        k = ((List) (obj1)).indexOf("-t");
        int i;
        i = j;
        if (k <= -1)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        i = j;
        if (k >= ((List) (obj1)).size())
        {
            break MISSING_BLOCK_LABEL_148;
        }
        j = Integer.parseInt((String)((List) (obj1)).get(k + 1));
        i = j;
        if (Compatibility.getAPILevel() >= 8)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        ((List) (obj1)).remove(k + 1);
        ((List) (obj1)).remove(k);
        ((List) (obj1)).add("-d");
        i = j;
        IOException ioexception;
        if (i <= 0)
        {
            i = 100;
        }
        s = new BoundedLinkedList(i);
        ((ArrayList) (obj)).addAll(((java.util.Collection) (obj1)));
        obj = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec((String[])((ArrayList) (obj)).toArray(new String[((ArrayList) (obj)).size()])).getInputStream()));
        Log.d(ACRA.LOG_TAG, "Retrieving logcat output...");
_L3:
        obj1 = ((BufferedReader) (obj)).readLine();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        s.add((new StringBuilder()).append(((String) (obj1))).append("\n").toString());
          goto _L3
        ioexception;
_L5:
        Log.e(ACRA.LOG_TAG, "LogCatCollector.collectLogcat could not retrieve data.", ioexception);
_L2:
        return s.toString();
        ioexception;
        s = null;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
