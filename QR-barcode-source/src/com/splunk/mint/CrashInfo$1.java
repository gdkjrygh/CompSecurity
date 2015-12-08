// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import java.io.File;

// Referenced classes of package com.splunk.mint:
//            CrashInfo, Properties

class this._cls0
    implements Runnable
{

    final CrashInfo this$0;

    public void run()
    {
        File file = new File((new StringBuilder()).append(Properties.FILES_PATH).append("/").append("crashCounter").toString());
        if (file != null && file.exists())
        {
            file.delete();
        }
    }

    ()
    {
        this$0 = CrashInfo.this;
        super();
    }
}
