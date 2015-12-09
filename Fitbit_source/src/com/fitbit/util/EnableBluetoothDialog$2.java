// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.bluetooth.BluetoothAdapter;
import android.support.v4.app.FragmentActivity;
import com.fitbit.bluetooth.e;
import com.fitbit.bluetooth.k;
import com.fitbit.bluetooth.n;

// Referenced classes of package com.fitbit.util:
//            EnableBluetoothDialog, ad, SimpleConfirmDialogFragment

class b
    implements ent.a
{

    final EnableBluetoothDialog a;
    private boolean b;

    public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        if (BluetoothAdapter.getDefaultAdapter().isEnabled())
        {
            EnableBluetoothDialog.b(a).d();
            if (EnableBluetoothDialog.a(a) != null)
            {
                EnableBluetoothDialog.a(a).b();
            }
        } else
        if (!b)
        {
            b = true;
            EnableBluetoothDialog.b(a).c();
            n.a().e();
            ableBluetoothProgressDialog.a(true);
            simpleconfirmdialogfragment = ableBluetoothProgressDialog.a(0, 0x7f080336, null);
            simpleconfirmdialogfragment.setCancelable(false);
            ad.a(EnableBluetoothDialog.c(a).getSupportFragmentManager(), "EnableBluetoothDialog.ProgressDialog", simpleconfirmdialogfragment);
            return;
        }
    }

    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        if (!b)
        {
            b = true;
            EnableBluetoothDialog.b(a).d();
            if (EnableBluetoothDialog.a(a) != null)
            {
                EnableBluetoothDialog.a(a).a();
            }
            EnableBluetoothDialog.a(a, null);
        }
    }

    public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    ent(EnableBluetoothDialog enablebluetoothdialog)
    {
        a = enablebluetoothdialog;
        super();
        b = false;
    }
}
