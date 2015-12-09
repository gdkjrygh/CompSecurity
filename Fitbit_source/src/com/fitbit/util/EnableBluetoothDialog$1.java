// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import com.fitbit.bluetooth.e;

// Referenced classes of package com.fitbit.util:
//            EnableBluetoothDialog

class a extends e
{

    final EnableBluetoothDialog a;

    protected void b()
    {
        d();
        ableBluetoothProgressDialog.a(false);
        if (EnableBluetoothDialog.a(a) != null)
        {
            EnableBluetoothDialog.a(a).b();
        }
        EnableBluetoothDialog.a(a, null);
    }

    protected void m()
    {
        d();
        ableBluetoothProgressDialog.a(false);
        if (EnableBluetoothDialog.a(a) != null)
        {
            EnableBluetoothDialog.a(a).c();
        }
        EnableBluetoothDialog.a(a, null);
    }

    ableBluetoothProgressDialog(EnableBluetoothDialog enablebluetoothdialog, boolean flag)
    {
        a = enablebluetoothdialog;
        super(flag);
    }
}
