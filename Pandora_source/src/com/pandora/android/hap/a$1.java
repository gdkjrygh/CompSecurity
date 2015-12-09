// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.hap;

import android.os.RemoteException;
import java.io.IOException;
import p.df.a;
import p.dm.m;

// Referenced classes of package com.pandora.android.hap:
//            a, b

class a extends Thread
{

    final com.pandora.android.hap.a a;

    public void run()
    {
_L5:
        if (com.pandora.android.hap.a.a(a) == null) goto _L2; else goto _L1
_L1:
        boolean flag = com.pandora.android.hap.a.a(a).a();
        if (!flag) goto _L3; else goto _L2
_L2:
        p.df.a.a("HAPClient", "response thread COMPLETED");
        return;
_L3:
        byte abyte0[];
        com.airbiquity.hap.a a1;
        abyte0 = com.pandora.android.hap.a.a(a).b();
        a1 = com.pandora.android.hap.a.b(a);
        if (a1 == null) goto _L5; else goto _L4
_L4:
        p.df.a.a("HAPClient", (new StringBuilder()).append("aqSendMsg(): connectionId = ").append(com.pandora.android.hap.a.c(a)).append(", sequenceNumber = ").append(0).append(", responsePayload = ").append(m.d(abyte0)).append(", responseContentType = ").append("application/octet-stream").toString());
        com.pandora.android.hap.a.b(a).a(com.pandora.android.hap.a.c(a), 0, abyte0, "application/octet-stream");
          goto _L5
        Object obj;
        obj;
        p.df.a.a("HAPClient", (new StringBuilder()).append("error in hapService.aqSendMsg ").append(obj).toString());
        ((RemoteException) (obj)).printStackTrace();
          goto _L5
        obj;
        p.df.a.a("HAPClient", (new StringBuilder()).append("error in reading from pandora ").append(obj).toString());
        ((IOException) (obj)).printStackTrace();
          goto _L2
    }

    (com.pandora.android.hap.a a1, String s)
    {
        a = a1;
        super(s);
    }
}
