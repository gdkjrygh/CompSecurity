// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import java.io.File;

// Referenced classes of package com.splunk.mint:
//            DataFlusher, Properties, NetSenderResponse, MintUrls, 
//            Utils, Mint, MintCallback, NetSender

class this._cls0
    implements Runnable
{

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

    nse()
    {
        this$0 = DataFlusher.this;
        super();
    }
}
