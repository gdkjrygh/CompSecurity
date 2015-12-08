// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Referenced classes of package com.splunk.mint:
//            CrashInfo, Properties, Logger, Mint

class val.lastID
    implements Runnable
{

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
        ((BufferedWriter) (obj1)).write(val$lastID);
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

    ()
    {
        this$0 = final_crashinfo;
        val$lastID = String.this;
        super();
    }
}
