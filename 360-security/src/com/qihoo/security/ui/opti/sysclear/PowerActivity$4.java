// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.os.RemoteException;
import android.view.View;
import com.qihoo.security.service.ProcessClearService;
import com.qihoo.security.support.b;
import com.qihoo360.mobilesafe.core.c.c;
import com.qihoo360.mobilesafe.service.KillBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            PowerActivity

class a
    implements android.view.ener
{

    final PowerActivity a;

    public void onClick(View view)
    {
        if (PowerActivity.a(a) == null)
        {
            return;
        }
        if (com.qihoo.security.ui.opti.sysclear.PowerActivity.b(a))
        {
            a.dismissDialog(1);
            return;
        }
        PowerActivity.a(a, true);
        view = PowerActivity.a(a).b(com.qihoo.security.ui.opti.sysclear.PowerActivity.c(a), PowerActivity.d(a));
        if (view == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        b.c(11310);
        String s = ((a) (view)).a;
        PowerActivity.g(a).put(s, Integer.valueOf(((a) (view)).d));
        arraylist = new ArrayList();
        KillBean killbean = new KillBean();
        killbean.memory = ((d) (view)).d;
        killbean.packageName = s;
        arraylist.add(killbean);
        if (PowerActivity.h(a) == null) goto _L4; else goto _L3
_L3:
        if (!PowerActivity.a(a).c()) goto _L6; else goto _L5
_L5:
        PowerActivity.h(a).a(arraylist);
_L7:
        ProcessClearService.b(arraylist);
_L4:
        PowerActivity.a(a).a(PowerActivity.e(a), PowerActivity.d(a), view);
        int i = PowerActivity.f(a);
        if (((a) (view)).c)
        {
            com.qihoo.security.ui.opti.sysclear.PowerActivity.c(a, PowerActivity.f(a) - ((a) (view)).d);
        }
        PowerActivity.a(a, true, PowerActivity.f(a), i);
_L2:
        a.dismissDialog(1);
        return;
_L6:
        com.qihoo.security.ui.opti.sysclear.PowerActivity.b(a, true);
        PowerActivity.h(a).b(arraylist);
          goto _L7
        RemoteException remoteexception;
        remoteexception;
          goto _L4
    }

    _cls9(PowerActivity poweractivity)
    {
        a = poweractivity;
        super();
    }
}
