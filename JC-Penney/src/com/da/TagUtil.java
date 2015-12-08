// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.da;

import android.app.Application;
import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// Referenced classes of package com.da:
//            LoggingUtil

final class TagUtil
{

    static final int ATTRIBUTES_MAX_LENGTH = 50;
    static final int HASH_FIRST_OFFSET = 255;
    static final int HASH_SECOND_OFFSET = 256;
    static final int HASH_SIXTEEN = 16;
    static final int SESSIONID_MAX_LENGTH = 10;
    static final int VISITORID_MAX_LENGTH = 23;

    private TagUtil()
    {
    }

    static boolean deleteFile(Application application, String s)
    {
        return (new File(application.getApplicationContext().getDir("DigitalAnalytics", 0), s)).delete();
    }

    static String flatten(String as[], int i)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int k = as.length;
        int j = i;
        if (i >= k)
        {
            j = k;
        }
        for (i = 0; i < j; i++)
        {
            stringbuilder.append(as[i]);
            if (i != j - 1)
            {
                stringbuilder.append("-_-");
            }
        }

        return stringbuilder.toString();
    }

    static Map generateAttributes(String as[], int i)
    {
        String s;
        String s1;
        int j;
        j = 50;
        s1 = "&";
        s = s1;
        i;
        JVM INSTR tableswitch 1 15: default 84
    //                   1 242
    //                   2 272
    //                   3 362
    //                   4 302
    //                   5 332
    //                   6 212
    //                   7 86
    //                   8 86
    //                   9 86
    //                   10 86
    //                   11 86
    //                   12 86
    //                   13 86
    //                   14 392
    //                   15 422;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L9 _L10
_L10:
        break MISSING_BLOCK_LABEL_422;
_L8:
        break; /* Loop/switch isn't completed */
_L1:
        s = s1;
_L11:
        int k = as.length;
        String as1[];
        String s3;
        StringBuilder stringbuilder;
        if (k <= 50)
        {
            j = k;
        }
        stringbuilder = new StringBuilder();
        k = 0;
        while (k < j) 
        {
            String s2;
            if (i == 2)
            {
                s2 = (new StringBuilder()).append(s).append(k + 1).append("=").toString();
                s2 = (new StringBuilder()).append("").append(s2).toString();
                s2 = (new StringBuilder()).append(s2).append(as[k]).toString();
            } else
            {
                s2 = (new StringBuilder()).append(s).append("_a").append(k + 1).append("=").toString();
                s2 = (new StringBuilder()).append("").append(s2).toString();
                s2 = (new StringBuilder()).append(s2).append(as[k]).toString();
            }
            stringbuilder.append(s2);
            LoggingUtil.log("", 4);
            k++;
        }
        break MISSING_BLOCK_LABEL_529;
_L7:
        LoggingUtil.log("tid=6", 4);
        s = (new StringBuilder()).append("&").append("pv").toString();
          goto _L11
_L2:
        LoggingUtil.log("tid=1", 4);
        s = (new StringBuilder()).append("&").append("pv").toString();
          goto _L11
_L3:
        LoggingUtil.log("tid=2", 4);
        s = (new StringBuilder()).append("&").append("rg").toString();
          goto _L11
_L5:
        LoggingUtil.log("tid=4", 4);
        s = (new StringBuilder()).append("&").append("s").toString();
          goto _L11
_L6:
        LoggingUtil.log("tid=5", 4);
        s = (new StringBuilder()).append("&").append("pr").toString();
          goto _L11
_L4:
        LoggingUtil.log("tid=3", 4);
        s = (new StringBuilder()).append("&").append("o").toString();
          goto _L11
_L9:
        LoggingUtil.log("tid=14", 4);
        s = (new StringBuilder()).append("&").append("c").toString();
          goto _L11
        LoggingUtil.log("tid=15", 4);
        s = (new StringBuilder()).append("&").append("e").toString();
          goto _L11
        s = stringbuilder.toString();
        as = new HashMap();
        as1 = s.split("&");
        j = as1.length;
        i = 0;
        while (i < j) 
        {
            s3 = as1[i];
            if (s3.contains("="))
            {
                k = s3.indexOf('=');
                as.put(s3.substring(0, k), s3.substring(k + 1));
            }
            i++;
        }
        return as;
    }

    static String generateHash(String as[])
    {
        boolean flag = false;
        Object obj = new StringBuilder();
        int k = as.length;
        for (int i = 0; i < k; i++)
        {
            ((StringBuilder) (obj)).append(as[i]);
            if (i < k - 1)
            {
                ((StringBuilder) (obj)).append("-_-");
            }
        }

        as = ((StringBuilder) (obj)).toString();
        as = MessageDigest.getInstance("SHA1").digest(as.getBytes("UTF-8"));
        obj = new StringBuffer();
        for (int j = ((flag) ? 1 : 0); j < as.length; j++)
        {
            ((StringBuffer) (obj)).append(Integer.toString((as[j] & 0xff) + 256, 16).substring(1));
        }

        return ((StringBuffer) (obj)).toString();
    }

    static String generateSessionId()
    {
        Random random = new Random();
        long l1 = random.nextLong() % 0x2540be3ffL + 0x3b9aca00L;
        long l = l1;
        if (l1 < 0L)
        {
            l = l1 * -1L;
        }
        LoggingUtil.log((new StringBuilder()).append("first sid = ").append(l).toString(), 4);
        LoggingUtil.log((new StringBuilder()).append("first CM_cjsid_complete has length: ").append(String.valueOf(l).length()).append(l).toString(), 4);
        do
        {
            if (String.valueOf(l).length() == 10)
            {
                break;
            }
            LoggingUtil.log("length check fail, creating new random cjsid", 4);
            long l2 = random.nextLong() % 0x2540be3ffL + 0x3b9aca00L;
            l = l2;
            if (l2 < 0L)
            {
                l = l2 * -1L;
            }
        } while (true);
        LoggingUtil.log((new StringBuilder()).append("final sid = ").append(l).toString(), 4);
        LoggingUtil.log((new StringBuilder()).append("final CM_cjsid_complete has length: ").append(String.valueOf(l).length()).toString(), 4);
        return String.valueOf(l);
    }

    static String generateVisitorId()
    {
        Random random = new Random();
        long l2 = 0x174876e800L + random.nextLong() % 0xe8d4a50fffL;
        long l4 = random.nextLong() % 0x174876e7ffL + 0x2540be400L;
        long l = l2;
        if (l2 < 0L)
        {
            l = l2 * -1L;
        }
        l2 = l4;
        if (l4 < 0L)
        {
            l2 = l4 * -1L;
        }
        LoggingUtil.log((new StringBuilder()).append("CM_random_uid_1 = ").append(l).toString(), 4);
        LoggingUtil.log((new StringBuilder()).append("CM_random_uid_2 = ").append(l2).toString(), 4);
        String s = (new StringBuilder()).append(String.valueOf(l)).append(String.valueOf(l2)).toString();
        LoggingUtil.log((new StringBuilder()).append("CM_cjuid_complete = ").append(s).toString(), 4);
        LoggingUtil.log((new StringBuilder()).append("CM_cjuid_complete has length: ").append(String.valueOf(s).length()).append(s).toString(), 4);
        long l1;
        long l3;
        for (; String.valueOf(s).length() != 23; s = (new StringBuilder()).append(String.valueOf(l1)).append(String.valueOf(l3)).toString())
        {
            LoggingUtil.log("length check fail, creating new random cjuid", 4);
            l3 = 0x174876e800L + random.nextLong() % 0xe8d4a50fffL;
            long l5 = random.nextLong() % 0x174876e7ffL + 0x2540be400L;
            l1 = l3;
            if (l3 < 0L)
            {
                l1 = l3 * -1L;
            }
            l3 = l5;
            if (l5 < 0L)
            {
                l3 = l5 * -1L;
            }
        }

        LoggingUtil.log((new StringBuilder()).append("final uid = ").append(s).toString(), 4);
        LoggingUtil.log((new StringBuilder()).append("final CM_cjuid_complete has length: ").append(String.valueOf(s).length()).append(s).toString(), 4);
        return s;
    }

    static String readFromFile(Application application, String s)
    {
        Object obj2 = null;
        Object obj;
        String s1;
        Object obj1;
        Object obj3;
        String s2;
        try
        {
            obj1 = new File(application.getApplicationContext().getDir("DigitalAnalytics", 0), s);
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            application = null;
            s = null;
            obj1 = null;
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            s = new FileInputStream(((File) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            application = null;
            s = null;
            continue; /* Loop/switch isn't completed */
        }
        application = new BufferedReader(new InputStreamReader(s, "UTF-8"));
        obj = application;
        s1 = s;
        obj3 = new StringBuilder();
_L2:
        obj = application;
        s1 = s;
        s2 = application.readLine();
        if (s2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = application;
        s1 = s;
        ((StringBuilder) (obj3)).append(s2);
        if (true) goto _L2; else goto _L1
        obj;
_L10:
        obj = application;
        s1 = s;
        LoggingUtil.log((new StringBuilder()).append("File: ").append(((File) (obj1)).getAbsolutePath()).append(" Not Found").toString(), 3);
        if (application != null)
        {
            try
            {
                application.close();
            }
            // Misplaced declaration of an exception variable
            catch (Application application)
            {
                LoggingUtil.forceLog(application.getMessage(), application, 1);
                return null;
            }
        }
        application = obj2;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        s.close();
        application = obj2;
_L4:
        return application;
_L1:
        obj = application;
        s1 = s;
        obj3 = ((StringBuilder) (obj3)).toString();
        obj = obj3;
        if (application != null)
        {
            try
            {
                application.close();
            }
            // Misplaced declaration of an exception variable
            catch (Application application)
            {
                LoggingUtil.forceLog(application.getMessage(), application, 1);
                return ((String) (obj));
            }
        }
        application = ((Application) (obj));
        if (s == null) goto _L4; else goto _L3
_L3:
        s.close();
        return ((String) (obj));
        obj1;
        s = null;
        application = null;
_L8:
        obj = application;
        s1 = s;
        LoggingUtil.forceLog(((Exception) (obj1)).getMessage(), ((Throwable) (obj1)), 1);
        obj = application;
        s1 = s;
        throw new RuntimeException(((Throwable) (obj1)));
        application;
        s = s1;
_L6:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        ((BufferedReader) (obj)).close();
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                LoggingUtil.forceLog(s.getMessage(), s, 1);
            }
        }
        throw application;
        application;
        s = null;
        obj = null;
        continue; /* Loop/switch isn't completed */
        application;
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        application = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L8; else goto _L7
_L7:
        application;
        application = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static void writeToFile(Application application, String s, String s1)
    {
        Object obj = null;
        File file = new File(application.getApplicationContext().getDir("DigitalAnalytics", 0), s);
        s = new FileOutputStream(file);
        application = s;
        s.write(s1.getBytes("UTF-8"));
        application = s;
        LoggingUtil.log((new StringBuilder()).append("Offline File created at: ").append(file.getAbsolutePath()).toString(), 3);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        s.close();
        return;
        application;
        LoggingUtil.forceLog(application.getMessage(), application, 1);
        return;
        s1;
        s = null;
_L4:
        application = s;
        LoggingUtil.forceLog(s1.getMessage(), s1, 1);
        application = s;
        throw new RuntimeException(s1);
        s1;
        s = application;
        application = s1;
_L1:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                LoggingUtil.forceLog(s.getMessage(), s, 1);
            }
        }
        throw application;
        s1;
        s = null;
        file = obj;
_L2:
        application = s;
        LoggingUtil.forceLog(s1.getMessage(), s1, 1);
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        application = s;
        if (file.delete())
        {
            break MISSING_BLOCK_LABEL_171;
        }
        application = s;
        LoggingUtil.log("Cleanup Failure!!!", 4);
        application = s;
        throw new RuntimeException(s1);
        application;
        s = null;
          goto _L1
        s1;
        s = null;
          goto _L2
        s1;
          goto _L2
        s1;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
