// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.splunk.mint:
//            BaseExecutor, InterfaceExecutor, LowPriorityThreadFactory, Properties, 
//            NetSenderResponse, MintUrls, Utils, Mint, 
//            MintCallback, NetSender

class DataFlusher extends BaseExecutor
    implements InterfaceExecutor
{

    DataFlusher()
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

    public void send()
    {
        this;
        JVM INSTR monitorenter ;
        Thread thread = (new LowPriorityThreadFactory()).newThread(new Runnable() {

            final DataFlusher this$0;

            public void run()
            {
                File file = new File((new StringBuilder()).append(Properties.FILES_PATH).append("/Mint.json").toString());
                NetSenderResponse netsenderresponse = new NetSenderResponse(MintUrls.getURL(), null);
                Object obj;
                if (!file.exists())
                {
                    netsenderresponse.setException(new Exception("There is no data to be sent. This is not an error."));
                    netsenderresponse.setSentSuccessfully(Boolean.valueOf(false));
                } else
                {
                    Object obj1 = null;
                    try
                    {
                        obj = Utils.readFile(file.getAbsolutePath());
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        netsenderresponse.setException(((Exception) (obj)));
                        netsenderresponse.setSentSuccessfully(Boolean.valueOf(false));
                        ((Exception) (obj)).printStackTrace();
                        obj = obj1;
                        if (Mint.mintCallback != null)
                        {
                            Mint.mintCallback.netSenderResponse(netsenderresponse);
                            obj = obj1;
                        }
                    }
                    if (obj != null && ((String) (obj)).length() != 0)
                    {
                        continue;
                    }
                    if (Mint.mintCallback != null)
                    {
                        Mint.mintCallback.netSenderResponse(netsenderresponse);
                        return;
                    }
                }
                do
                {
                    return;
                } while (!(new NetSender()).sendBlocking(null, ((String) (obj)), false).getSentSuccessfully().booleanValue());
                file.delete();
            }

            
            {
                this$0 = DataFlusher.this;
                super();
            }
        });
        if (getExecutor() != null)
        {
            getExecutor().execute(thread);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
