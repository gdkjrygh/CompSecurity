// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import java.io.File;
import java.io.IOException;

// Referenced classes of package com.splunk.mint:
//            Utils, Properties

static final class es
    implements Runnable
{

    public void run()
    {
        File file;
        file = new File((new StringBuilder()).append(Properties.FILES_PATH).append("/").append(".setForceSendPingOnNextStart").toString());
        if (file == null || file.exists())
        {
            break MISSING_BLOCK_LABEL_50;
        }
        file.createNewFile();
        return;
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
        return;
    }

    es()
    {
    }
}
