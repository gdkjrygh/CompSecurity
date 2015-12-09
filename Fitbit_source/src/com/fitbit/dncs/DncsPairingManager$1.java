// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs;

import android.content.Intent;
import com.fitbit.dncs.service.DncsPairingService;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.dncs:
//            DncsPairingManager

class a extends c
{

    final DncsPairingManager a;

    public void a(Intent intent)
    {
        Object obj;
        obj = intent.getAction();
        if (!"com.fitbit.dncs.service.DncsPairingService.ACTION_OPERATION_STARTED".equals(obj))
        {
            break MISSING_BLOCK_LABEL_83;
        }
        obj = DncsPairingService.a(intent);
        intent = ((Intent) (DncsPairingManager.a(a)));
        intent;
        JVM INSTR monitorenter ;
        obj = DncsPairingManager.a(a, ((csPairingTaskInfo) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        csPairingTaskInfo cspairingtaskinfo = new csPairingTaskInfo(((csPairingTaskInfo) (obj)).a, ((csPairingTaskInfo) (obj)).b, ((csPairingTaskInfo) (obj)).c + 1, null);
        DncsPairingManager.a(a, ((csPairingTaskInfo) (obj)), cspairingtaskinfo, false);
        intent;
        JVM INSTR monitorexit ;
        return;
        obj;
        intent;
        JVM INSTR monitorexit ;
        throw obj;
        com.fitbit.dncs.service.DncsPairingError dncspairingerror;
        if (!"com.fitbit.dncs.service.DncsPairingService.ACTION_OPERATION_FINISHED".equals(obj))
        {
            break MISSING_BLOCK_LABEL_152;
        }
        obj = DncsPairingService.a(intent);
        dncspairingerror = DncsPairingService.b(intent);
        intent = ((Intent) (DncsPairingManager.a(a)));
        intent;
        JVM INSTR monitorenter ;
        obj = DncsPairingManager.a(a, ((csPairingTaskInfo) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (dncspairingerror == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        if (DncsPairingManager.a(dncspairingerror))
        {
            break MISSING_BLOCK_LABEL_144;
        }
        DncsPairingManager.b(a, ((csPairingTaskInfo) (obj)));
        intent;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        intent;
        JVM INSTR monitorexit ;
        throw exception;
    }

    csPairingTaskInfo(DncsPairingManager dncspairingmanager)
    {
        a = dncspairingmanager;
        super();
    }
}
