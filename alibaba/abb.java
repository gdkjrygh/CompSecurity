// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.alibaba.akita.net.io.HttpInvoker;
import com.alibaba.akita.net.io.SpdyEngine;
import org.apache.http.message.BasicHeader;

public class abb
{

    public static void a(Application application, boolean flag)
    {
        abb;
        JVM INSTR monitorenter ;
        if (flag) goto _L2; else goto _L1
_L1:
        abb;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!gt.c())
        {
            BasicHeader abasicheader[] = new BasicHeader[2];
            abasicheader[0] = new BasicHeader("did", lk.e(application));
            abasicheader[1] = new BasicHeader("ali_did", lk.e(application));
            HttpInvoker.init(abasicheader, (com.alibaba.akita.app.BaseApplication.h)application);
            SpdyEngine.initialize(abasicheader);
            gt.d();
        }
        if (true) goto _L1; else goto _L3
_L3:
        application;
        throw application;
    }
}
