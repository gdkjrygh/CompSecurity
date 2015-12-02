// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.bridge.upload;

import java.io.File;

// Referenced classes of package com.facebook.tools.dextr.bridge.upload:
//            BackgroundUploadServiceImpl

class b
    implements Runnable
{

    final oundUploadListener a;
    final File b;
    final BackgroundUploadServiceImpl c;

    public void run()
    {
        a.a(b);
    }

    oundUploadListener(BackgroundUploadServiceImpl backgrounduploadserviceimpl, oundUploadListener ounduploadlistener, File file)
    {
        c = backgrounduploadserviceimpl;
        a = ounduploadlistener;
        b = file;
        super();
    }
}
