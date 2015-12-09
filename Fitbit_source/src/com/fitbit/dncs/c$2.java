// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs;

import android.content.Intent;
import com.fitbit.dncs.service.DncsPairingError;
import com.fitbit.dncs.service.DncsPairingService;
import com.fitbit.savedstate.g;
import com.fitbit.ui.s;
import com.fitbit.util.p;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.dncs:
//            c

class ading.c extends c
{

    final com.fitbit.dncs.c a;

    public void a(Intent intent)
    {
        if ("com.fitbit.dncs.service.DncsPairingService.ACTION_OPERATION_FINISHED".equals(intent.getAction()))
        {
            DncsPairingError dncspairingerror = DncsPairingService.b(intent);
            intent = DncsPairingService.a(intent);
            if (dncspairingerror != null && intent != null)
            {
                if (((PairingManager.DncsPairingTaskInfo) (intent)).b.a() && p.b(((PairingManager.DncsPairingTaskInfo) (intent)).a) && dncspairingerror == DncsPairingError.e && g.h() >= 3)
                {
                    c.b(a);
                } else
                if (com.fitbit.dncs.c.c(a) != null && dncspairingerror.b())
                {
                    s.a(com.fitbit.dncs.c.c(a), 0x7f0801b4, 0).i();
                    return;
                }
            }
        }
    }

    nt(com.fitbit.dncs.c c1)
    {
        a = c1;
        super();
    }
}
