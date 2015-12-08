// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.service;

import android.content.Intent;
import com.fitbit.util.z;

public class b
{
    private static class a
    {

        public static b a = new b();


        private a()
        {
        }
    }


    public static final String a = "com.fitbit.dncs.service.ACTION_DNCS_PAIRING_STATE_CHANGED";
    private com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo b;

    public b()
    {
        b = null;
    }

    public static b a()
    {
        return a.a;
    }

    void a(com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo dncspairingtaskinfo)
    {
        this;
        JVM INSTR monitorenter ;
        if (b != dncspairingtaskinfo)
        {
            z.a(new Intent("com.fitbit.dncs.service.ACTION_DNCS_PAIRING_STATE_CHANGED"));
            b = dncspairingtaskinfo;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        dncspairingtaskinfo;
        throw dncspairingtaskinfo;
    }

    public com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo b()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo dncspairingtaskinfo = b;
        this;
        JVM INSTR monitorexit ;
        return dncspairingtaskinfo;
        Exception exception;
        exception;
        throw exception;
    }

    public String c()
    {
        this;
        JVM INSTR monitorenter ;
        if (b == null) goto _L2; else goto _L1
_L1:
        String s = b.a;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo dncspairingtaskinfo = b;
        boolean flag;
        if (dncspairingtaskinfo == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
