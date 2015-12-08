// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.support;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;

// Referenced classes of package com.fitbit.bluetooth.support:
//            BluetoothSupportStatus

public class com.fitbit.bluetooth.support.a
{
    private static class a
    {

        public static com.fitbit.bluetooth.support.a a = new com.fitbit.bluetooth.support.a();


        private a()
        {
        }
    }


    public static final String a = "com.fitbit.FitbitMobile.BluetoothSupportStatusController.ACTION_SUPPORT_STATUS_CHANGED";
    private static final String b = "BluetoothSupportStatusController";
    private static final String c = "com.fitbit.FitbitMobile.BluetoothSupportStatusController";
    private static final String d = "LEVEL";
    private static final String e = "MESSAGE";
    private BluetoothSupportStatus f;
    private boolean g;

    private com.fitbit.bluetooth.support.a()
    {
        f = new BluetoothSupportStatus();
        g = false;
        f();
    }


    public static com.fitbit.bluetooth.support.a a()
    {
        return a.a;
    }

    private SharedPreferences d()
    {
        return FitBitApplication.a().getSharedPreferences("com.fitbit.FitbitMobile.BluetoothSupportStatusController", 0);
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = d();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        obj = ((SharedPreferences) (obj)).edit();
        if (f == null) goto _L2; else goto _L1
_L1:
        ((android.content.SharedPreferences.Editor) (obj)).putString("LEVEL", f.a().toString());
        ((android.content.SharedPreferences.Editor) (obj)).putString("MESSAGE", f.b());
_L3:
        ((android.content.SharedPreferences.Editor) (obj)).commit();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ((android.content.SharedPreferences.Editor) (obj)).clear();
          goto _L3
        Exception exception;
        exception;
        throw exception;
        com.fitbit.e.a.e("BluetoothSupportStatusController", "Could not save preferences. Preferences does not exists", new Object[0]);
          goto _L4
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = d();
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!((SharedPreferences) (obj)).contains("LEVEL")) goto _L2; else goto _L3
_L3:
        String s = ((SharedPreferences) (obj)).getString("LEVEL", BluetoothSupportStatus.SupportLevel.b().toString());
        obj = ((SharedPreferences) (obj)).getString("MESSAGE", null);
        a(new BluetoothSupportStatus(BluetoothSupportStatus.SupportLevel.a(s), ((String) (obj))));
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.fitbit.e.a.e("BluetoothSupportStatusController", "Could not load preferences. Preferences does not exists", new Object[0]);
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public void a(BluetoothSupportStatus bluetoothsupportstatus)
    {
        this;
        JVM INSTR monitorenter ;
        if (bluetoothsupportstatus != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!g || f != bluetoothsupportstatus && !bluetoothsupportstatus.equals(f))
        {
            g = true;
            f = bluetoothsupportstatus;
            com.fitbit.e.a.a("BluetoothSupportStatusController", "Support status changed: %s", new Object[] {
                bluetoothsupportstatus
            });
            e();
            bluetoothsupportstatus = new Intent("com.fitbit.FitbitMobile.BluetoothSupportStatusController.ACTION_SUPPORT_STATUS_CHANGED");
            LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(bluetoothsupportstatus);
        }
        if (true) goto _L1; else goto _L3
_L3:
        bluetoothsupportstatus;
        throw bluetoothsupportstatus;
    }

    public BluetoothSupportStatus b()
    {
        this;
        JVM INSTR monitorenter ;
        BluetoothSupportStatus bluetoothsupportstatus = f;
        this;
        JVM INSTR monitorexit ;
        return bluetoothsupportstatus;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = g;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
