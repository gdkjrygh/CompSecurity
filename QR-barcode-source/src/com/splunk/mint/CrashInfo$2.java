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

// Referenced classes of package com.splunk.mint:
//            CrashInfo, Properties, Logger, Mint

class this._cls0
    implements Runnable
{

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

    ()
    {
        this$0 = CrashInfo.this;
        super();
    }
}
