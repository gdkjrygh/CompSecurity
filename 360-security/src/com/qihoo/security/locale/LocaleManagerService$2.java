// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale;

import android.os.RemoteException;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.locale:
//            LocaleManagerService, LocaleInfo

class a
    implements Runnable
{

    final LocaleManagerService a;

    public void run()
    {
        System.currentTimeMillis();
        LocaleManagerService.a(a, LocaleManagerService.b(a));
        List list = LocaleManagerService.c(a);
        list;
        JVM INSTR monitorenter ;
        String s;
        LocaleManagerService.b(a, LocaleManagerService.c(a));
        s = LocaleManagerService.d(a).a();
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        if (LocaleManagerService.c(a) == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = LocaleManagerService.c(a).iterator();
_L3:
        flag1 = flag;
        LocaleInfo localeinfo;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        localeinfo = (LocaleInfo)iterator.next();
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (s.equals(localeinfo.locale))
        {
            flag = true;
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        SharedPref.a(LocaleManagerService.e(a), "language", "");
        LocaleManagerService.a(a, LocaleManagerService.d(a).a());
        LocaleManagerService.f(a);
        list;
        JVM INSTR monitorexit ;
_L5:
        if (LocaleManagerService.a(a) != null)
        {
            LocaleManagerService.a(a).sendEmptyMessage(4);
        }
        return;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (RemoteException remoteexception) { }
        if (true) goto _L5; else goto _L4
_L4:
    }

    (LocaleManagerService localemanagerservice)
    {
        a = localemanagerservice;
        super();
    }
}
