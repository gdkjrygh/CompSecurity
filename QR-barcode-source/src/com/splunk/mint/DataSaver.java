// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.splunk.mint:
//            BaseExecutor, InterfaceExecutor, LowPriorityThreadFactory, Properties, 
//            DataSaverResponse, Mint, MintCallback

class DataSaver extends BaseExecutor
    implements InterfaceExecutor
{

    public static final String FILEPATH = "/Mint.json";

    DataSaver()
    {
    }

    public ExecutorService getExecutor()
    {
        if (executor == null)
        {
            executor = Executors.newFixedThreadPool(1);
        }
        return executor;
    }

    public void save(final String jsonData)
    {
        this;
        JVM INSTR monitorenter ;
        jsonData = (new LowPriorityThreadFactory()).newThread(new Runnable() {

            final DataSaver this$0;
            final String val$jsonData;

            public void run()
            {
                Object obj;
                Object obj1;
                Object obj3;
                DataSaverResponse datasaverresponse;
                obj1 = new File((new StringBuilder()).append(Properties.FILES_PATH).append("/Mint.json").toString());
                datasaverresponse = new DataSaverResponse(jsonData, ((File) (obj1)).getAbsolutePath());
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
                obj1 = new BufferedWriter(new FileWriter(((File) (obj1)), true));
                ((BufferedWriter) (obj1)).append(jsonData);
                ((BufferedWriter) (obj1)).flush();
                ((BufferedWriter) (obj1)).close();
                if (obj1 != null)
                {
                    try
                    {
                        ((BufferedWriter) (obj1)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        ((IOException) (obj)).printStackTrace();
                    }
                }
                datasaverresponse.setSavedSuccessfully(Boolean.valueOf(true));
                if (Mint.mintCallback == null)
                {
                    break MISSING_BLOCK_LABEL_298;
                }
                Mint.mintCallback.dataSaverResponse(datasaverresponse);
_L2:
                return;
                Object obj2;
                obj2;
                obj1 = obj3;
_L5:
                obj = obj1;
                ((IOException) (obj2)).printStackTrace();
                obj = obj1;
                datasaverresponse.setException(((Exception) (obj2)));
                obj = obj1;
                datasaverresponse.setSavedSuccessfully(Boolean.valueOf(false));
                obj = obj1;
                if (Mint.mintCallback == null)
                {
                    break MISSING_BLOCK_LABEL_200;
                }
                obj = obj1;
                Mint.mintCallback.dataSaverResponse(datasaverresponse);
                if (obj1 != null)
                {
                    try
                    {
                        ((BufferedWriter) (obj1)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        ((IOException) (obj)).printStackTrace();
                    }
                }
                datasaverresponse.setSavedSuccessfully(Boolean.valueOf(true));
                if (Mint.mintCallback == null) goto _L2; else goto _L1
_L1:
                Mint.mintCallback.dataSaverResponse(datasaverresponse);
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
                datasaverresponse.setSavedSuccessfully(Boolean.valueOf(true));
                if (Mint.mintCallback != null)
                {
                    Mint.mintCallback.dataSaverResponse(datasaverresponse);
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
                this$0 = DataSaver.this;
                jsonData = s;
                super();
            }
        });
        if (getExecutor() != null)
        {
            getExecutor().execute(jsonData);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        jsonData;
        throw jsonData;
    }
}
