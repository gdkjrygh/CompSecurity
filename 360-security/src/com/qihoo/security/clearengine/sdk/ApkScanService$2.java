// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.sdk;

import android.os.Process;

// Referenced classes of package com.qihoo.security.clearengine.sdk:
//            ApkScanService

class a
    implements Runnable
{

    final ApkScanService a;

    public void run()
    {
        Process.killProcess(Process.myPid());
    }

    _cls9(ApkScanService apkscanservice)
    {
        a = apkscanservice;
        super();
    }
}
