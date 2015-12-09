// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra.util;

import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

public class ProcFileReader
{

    public static final int CANNOT_DETERMINE_OPEN_FDS = -1;
    private static final String FD_DIR = String.format("/proc/%s/fd", new Object[] {
        Integer.valueOf(Process.myPid())
    });
    private static final String FD_DIR_STRING = "/fd/";
    private static final String PIPE_STRING = "pipe";
    public static final int SECURITY_EXCEPTION = -2;
    private static final String SOCKET_STRING = "socket";
    private static final Class TAG = com/facebook/acra/util/ProcFileReader;

    public ProcFileReader()
    {
    }

    public static int getOpenFDCount()
    {
        String as[];
        int i;
        try
        {
            as = (new File(FD_DIR)).list();
        }
        catch (SecurityException securityexception)
        {
            Log.e(TAG.toString(), securityexception.getMessage());
            return -2;
        }
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        i = as.length;
        return i;
        return -1;
    }

    public static OpenFDLimits getOpenFDLimits()
    {
        Object obj = new Scanner(new File("/proc/self/limits"));
        Object obj1 = ((Scanner) (obj)).findWithinHorizon("Max open files", 5000);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        ((Scanner) (obj)).close();
_L4:
        return null;
_L2:
        obj1 = new OpenFDLimits(((Scanner) (obj)).next(), ((Scanner) (obj)).next());
        ((Scanner) (obj)).close();
        return ((OpenFDLimits) (obj1));
        obj;
        obj = null;
_L9:
        if (obj == null) goto _L4; else goto _L3
_L3:
        ((Scanner) (obj)).close();
        return null;
        obj;
        obj = null;
_L8:
        if (obj == null) goto _L4; else goto _L5
_L5:
        ((Scanner) (obj)).close();
        return null;
        obj;
        Object obj3;
        obj3 = null;
        obj1 = obj;
_L7:
        if (obj3 != null)
        {
            ((Scanner) (obj3)).close();
        }
        throw obj1;
        obj1;
        obj3 = obj;
        if (true) goto _L7; else goto _L6
_L6:
        Object obj2;
        obj2;
          goto _L8
          goto _L4
        obj2;
          goto _L9
    }

    public static String getOpenFileDescriptors()
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        Object obj;
        Object obj1;
        Counter counter;
        File afile[];
        HashMap hashmap;
        int i;
        int j;
        try
        {
            afile = (new File(FD_DIR)).listFiles();
            hashmap = new HashMap();
            j = afile.length;
        }
        catch (Exception exception)
        {
            Log.e(TAG.toString(), "Exception caught while reading open file descriptors: ", exception);
            return exception.getMessage();
        }
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L1
_L1:
        obj = afile[i].getCanonicalPath();
        obj1 = ((String) (obj)).substring(((String) (obj)).lastIndexOf("/fd/") + 4);
        if (!((String) (obj1)).startsWith("pipe")) goto _L4; else goto _L3
_L3:
        obj = "pipe";
_L5:
        counter = (Counter)hashmap.get(obj);
        obj1 = counter;
        if (counter != null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        obj1 = new Counter(null);
        hashmap.put(obj, obj1);
        obj1.count = ((Counter) (obj1)).count + 1;
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (((String) (obj1)).startsWith("socket"))
        {
            obj = "socket";
        }
        if (true) goto _L5; else goto _L2
_L2:
        for (obj = hashmap.entrySet().iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append((String)((java.util.Map.Entry) (obj1)).getKey()).append(" ").append(((Counter)((java.util.Map.Entry) (obj1)).getValue()).count).append("\n"))
        {
            obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        String s = stringbuilder.toString();
        return s;
        if (true) goto _L7; else goto _L6
_L6:
    }


    private class OpenFDLimits
    {

        public final String hardLimit;
        public final String softLimit;

        public OpenFDLimits(String s, String s1)
        {
            softLimit = s;
            hardLimit = s1;
        }
    }


    private class Counter
    {

        public int count;

        private Counter()
        {
        }

        Counter(_cls1 _pcls1)
        {
            this();
        }
    }

}
