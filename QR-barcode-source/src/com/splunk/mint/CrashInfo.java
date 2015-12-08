// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.splunk.mint:
//            BaseExecutor, InterfaceExecutor, Properties, Logger, 
//            Mint, LowPriorityThreadFactory

class CrashInfo extends BaseExecutor
    implements InterfaceExecutor
{

    private static final String crashCounterFile = "crashCounter";
    private static final String lastCrashIDFile = "lastCrashID";

    CrashInfo()
    {
    }

    protected static int getCrashCounter()
    {
        Object obj1;
        int i;
        i = 0;
        obj1 = new File((new StringBuilder()).append(Properties.FILES_PATH).append("/").append("crashCounter").toString());
        if (obj1 == null || ((File) (obj1)).exists()) goto _L2; else goto _L1
_L1:
        int j;
        ((File) (obj1)).createNewFile();
        j = Integer.valueOf(0).intValue();
        i = j;
_L3:
        return i;
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
_L2:
        Object obj;
        Object obj3;
        obj = null;
        obj3 = null;
        obj1 = new BufferedReader(new FileReader(((File) (obj1))));
        j = Integer.parseInt(((BufferedReader) (obj1)).readLine().trim());
        obj = Integer.valueOf(j);
_L4:
        j = ((Integer) (obj)).intValue();
        i = j;
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
                return j;
            }
            return j;
        }
          goto _L3
        obj;
        obj = Integer.valueOf(0);
          goto _L4
        Object obj2;
        obj2;
        obj1 = obj3;
_L8:
        obj = obj1;
        Logger.logWarning("There was a problem getting the crash counter");
        obj = obj1;
        if (!Mint.DEBUG)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
        ((Exception) (obj2)).printStackTrace();
        if (obj1 == null) goto _L3; else goto _L5
_L5:
        try
        {
            ((BufferedReader) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
            return 0;
        }
        return 0;
        obj1;
_L7:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw obj1;
        obj2;
        obj = obj1;
        obj1 = obj2;
        if (true) goto _L7; else goto _L6
_L6:
        obj2;
          goto _L8
    }

    protected static String getLastCrashID()
    {
        Object obj1 = new File((new StringBuilder()).append(Properties.FILES_PATH).append("/").append("lastCrashID").toString());
        if (obj1 == null || ((File) (obj1)).exists()) goto _L2; else goto _L1
_L1:
        ((File) (obj1)).createNewFile();
        Object obj2 = null;
_L4:
        return ((String) (obj2));
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
_L2:
        Object obj;
        Object obj4;
        obj = null;
        obj4 = null;
        obj1 = new BufferedReader(new FileReader(((File) (obj1))));
        obj = ((BufferedReader) (obj1)).readLine().trim();
_L5:
        obj2 = obj;
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
                return ((String) (obj));
            }
            return ((String) (obj));
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        ((Exception) (obj)).printStackTrace();
        obj = null;
          goto _L5
        Object obj3;
        obj3;
        obj1 = obj4;
_L9:
        obj = obj1;
        Logger.logWarning("There was a problem getting the last crash id");
        obj = obj1;
        if (!Mint.DEBUG)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        obj = obj1;
        ((Exception) (obj3)).printStackTrace();
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        return null;
        obj1;
_L7:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw obj1;
        obj3;
        obj = obj1;
        obj1 = obj3;
        if (true) goto _L7; else goto _L6
_L6:
        obj3;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected void clearCrashCounter()
    {
        Thread thread = (new LowPriorityThreadFactory()).newThread(new Runnable() {

            final CrashInfo this$0;

            public void run()
            {
                File file = new File((new StringBuilder()).append(Properties.FILES_PATH).append("/").append("crashCounter").toString());
                if (file != null && file.exists())
                {
                    file.delete();
                }
            }

            
            {
                this$0 = CrashInfo.this;
                super();
            }
        });
        ExecutorService executorservice = getExecutor();
        if (thread != null && executorservice != null)
        {
            executorservice.submit(thread);
        }
    }

    public ExecutorService getExecutor()
    {
        if (executor == null)
        {
            executor = Executors.newFixedThreadPool(1);
        }
        return executor;
    }

    protected void saveCrashCounter()
    {
        Thread thread = (new LowPriorityThreadFactory()).newThread(new Runnable() {

            final CrashInfo this$0;

            public void run()
            {
                Object obj;
                Object obj1;
                Object obj2;
                Object obj3;
                IOException ioexception;
                Object obj4;
                File file = new File((new StringBuilder()).append(Properties.FILES_PATH).append("/").append("crashCounter").toString());
                int i;
                if (file != null && !file.exists())
                {
                    try
                    {
                        file.createNewFile();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        ((IOException) (obj)).printStackTrace();
                    }
                }
                obj1 = null;
                obj4 = null;
                obj2 = null;
                ioexception = null;
                obj3 = null;
                obj = new BufferedReader(new FileReader(file));
                i = Integer.parseInt(((BufferedReader) (obj)).readLine().trim());
                obj1 = Integer.valueOf(i);
_L7:
                i = ((Integer) (obj1)).intValue();
                obj1 = new BufferedWriter(new FileWriter(file));
                ((BufferedWriter) (obj1)).write(String.valueOf(Integer.valueOf(i + 1)));
                ((BufferedWriter) (obj1)).newLine();
                ((BufferedWriter) (obj1)).flush();
                ((BufferedWriter) (obj1)).close();
                if (obj != null)
                {
                    try
                    {
                        ((BufferedReader) (obj)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        ((IOException) (obj)).printStackTrace();
                    }
                }
                if (obj1 == null)
                {
                    break MISSING_BLOCK_LABEL_341;
                }
                ((BufferedWriter) (obj1)).close();
_L2:
                return;
                obj1;
                obj1 = Integer.valueOf(0);
                continue; /* Loop/switch isn't completed */
                obj;
                ((IOException) (obj)).printStackTrace();
                return;
                ioexception;
                obj = obj4;
_L5:
                obj1 = obj;
                obj2 = obj3;
                Logger.logWarning("There was a problem saving the crash counter");
                obj1 = obj;
                obj2 = obj3;
                if (!Mint.DEBUG)
                {
                    break MISSING_BLOCK_LABEL_235;
                }
                obj1 = obj;
                obj2 = obj3;
                ioexception.printStackTrace();
                if (obj != null)
                {
                    try
                    {
                        ((BufferedReader) (obj)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        ((IOException) (obj)).printStackTrace();
                    }
                }
                if (obj3 == null) goto _L2; else goto _L1
_L1:
                try
                {
                    ((BufferedWriter) (obj3)).close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    ((IOException) (obj)).printStackTrace();
                }
                return;
                obj;
_L4:
                if (obj1 != null)
                {
                    try
                    {
                        ((BufferedReader) (obj1)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1)
                    {
                        ((IOException) (obj1)).printStackTrace();
                    }
                }
                if (obj2 != null)
                {
                    try
                    {
                        ((BufferedWriter) (obj2)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1)
                    {
                        ((IOException) (obj1)).printStackTrace();
                    }
                }
                throw obj;
                Exception exception;
                exception;
                obj1 = obj;
                obj2 = ioexception;
                obj = exception;
                continue; /* Loop/switch isn't completed */
                exception;
                obj2 = obj1;
                obj1 = obj;
                obj = exception;
                if (true) goto _L4; else goto _L3
_L3:
                ioexception;
                  goto _L5
                ioexception;
                exception = ((Exception) (obj1));
                  goto _L5
                return;
                if (true) goto _L7; else goto _L6
_L6:
            }

            
            {
                this$0 = CrashInfo.this;
                super();
            }
        });
        ExecutorService executorservice = getExecutor();
        if (thread != null && executorservice != null)
        {
            executorservice.submit(thread);
        }
    }

    protected void saveLastCrashID(final String lastID)
    {
        if (lastID != null)
        {
            lastID = (new LowPriorityThreadFactory()).newThread(new Runnable() {

                final CrashInfo this$0;
                final String val$lastID;

                public void run()
                {
                    Object obj;
                    Object obj1;
                    Object obj3;
                    obj1 = new File((new StringBuilder()).append(Properties.FILES_PATH).append("/").append("lastCrashID").toString());
                    if (obj1 != null && !((File) (obj1)).exists())
                    {
                        try
                        {
                            ((File) (obj1)).createNewFile();
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            ((IOException) (obj)).printStackTrace();
                        }
                    }
                    obj = null;
                    obj3 = null;
                    obj1 = new BufferedWriter(new FileWriter(((File) (obj1))));
                    ((BufferedWriter) (obj1)).write(lastID);
                    ((BufferedWriter) (obj1)).newLine();
                    ((BufferedWriter) (obj1)).flush();
                    ((BufferedWriter) (obj1)).close();
                    if (obj1 == null)
                    {
                        break MISSING_BLOCK_LABEL_185;
                    }
                    ((BufferedWriter) (obj1)).close();
_L2:
                    return;
                    obj;
                    ((IOException) (obj)).printStackTrace();
                    return;
                    Object obj2;
                    obj2;
                    obj1 = obj3;
_L5:
                    obj = obj1;
                    Logger.logWarning("There was a problem saving the last crash id");
                    obj = obj1;
                    if (!Mint.DEBUG)
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    obj = obj1;
                    ((IOException) (obj2)).printStackTrace();
                    if (obj1 == null) goto _L2; else goto _L1
_L1:
                    try
                    {
                        ((BufferedWriter) (obj1)).close();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        ((IOException) (obj)).printStackTrace();
                    }
                    return;
                    obj1;
_L4:
                    if (obj != null)
                    {
                        try
                        {
                            ((BufferedWriter) (obj)).close();
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            ((IOException) (obj)).printStackTrace();
                        }
                    }
                    throw obj1;
                    obj2;
                    obj = obj1;
                    obj1 = obj2;
                    if (true) goto _L4; else goto _L3
_L3:
                    obj2;
                      goto _L5
                }

            
            {
                this$0 = CrashInfo.this;
                lastID = s;
                super();
            }
            });
            ExecutorService executorservice = getExecutor();
            if (lastID != null && executorservice != null)
            {
                executorservice.submit(lastID);
            }
        }
    }
}
