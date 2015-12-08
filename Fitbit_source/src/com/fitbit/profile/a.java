// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.profile;

import android.content.Intent;
import android.nfc.NdefMessage;
import com.fitbit.util.as;

public class a
{

    private static final String a = "NFCTagMessageHolder";
    private static a b;
    private String c;

    private a()
    {
    }

    public static a a()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/fitbit/profile/a;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new a();
        }
        com/fitbit/profile/a;
        JVM INSTR monitorexit ;
_L2:
        return b;
        Exception exception;
        exception;
        com/fitbit/profile/a;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static boolean b(Intent intent)
    {
        return intent != null && "android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction());
    }

    public void a(Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        a(as.a(((NdefMessage)intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES")[0]).getRecords()[0]));
        this;
        JVM INSTR monitorexit ;
        return;
        intent;
        throw intent;
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        com.fitbit.e.a.a("NFCTagMessageHolder", "Set unhandled nfc message: [%s]", new Object[] {
            s
        });
_L1:
        c = s;
        this;
        JVM INSTR monitorexit ;
        return;
        com.fitbit.e.a.a("NFCTagMessageHolder", "Cleared unhandled nfc message", new Object[0]);
          goto _L1
        s;
        throw s;
    }

    public String b()
    {
        this;
        JVM INSTR monitorenter ;
        String s = c;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
