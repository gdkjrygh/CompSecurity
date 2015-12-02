// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.bridge.upload;

import java.io.File;
import java.util.Set;

// Referenced classes of package com.facebook.tools.dextr.bridge.upload:
//            BackgroundUploadServiceImpl

class c
    implements Runnable
{

    final File a;
    final oundUploadListener b;
    final boolean c;
    final BackgroundUploadServiceImpl d;

    public void run()
    {
        if (!a.exists())
        {
            return;
        }
        synchronized (BackgroundUploadServiceImpl.a(d))
        {
            BackgroundUploadServiceImpl.a(d).add(a);
        }
        BackgroundUploadServiceImpl.a(d, a, b, c);
        synchronized (BackgroundUploadServiceImpl.a(d))
        {
            BackgroundUploadServiceImpl.a(d).remove(a);
        }
        return;
        exception;
        set;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        set;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    oundUploadListener(BackgroundUploadServiceImpl backgrounduploadserviceimpl, File file, oundUploadListener ounduploadlistener, boolean flag)
    {
        d = backgrounduploadserviceimpl;
        a = file;
        b = ounduploadlistener;
        c = flag;
        super();
    }
}
