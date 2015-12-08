// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.bluetooth.BluetoothAdapter;
import android.support.v4.app.FragmentActivity;
import com.fitbit.bluetooth.e;
import com.fitbit.bluetooth.k;
import com.fitbit.bluetooth.n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.fitbit.util:
//            SimpleConfirmDialogFragment, r, ProgressDialogFragment, ad

public class EnableBluetoothDialog extends SimpleConfirmDialogFragment
{
    public static class EnableBluetoothProgressDialog extends ProgressDialogFragment
    {

        private static final Set a = new HashSet();
        private static boolean b = false;

        public static EnableBluetoothProgressDialog a(int j, int k, android.content.DialogInterface.OnCancelListener oncancellistener)
        {
            EnableBluetoothProgressDialog enablebluetoothprogressdialog = new EnableBluetoothProgressDialog();
            a(((ProgressDialogFragment) (enablebluetoothprogressdialog)), j, k, oncancellistener);
            return enablebluetoothprogressdialog;
        }

        public static void a(boolean flag)
        {
            b = flag;
            if (!b)
            {
                for (Iterator iterator = a.iterator(); iterator.hasNext(); ((EnableBluetoothProgressDialog)iterator.next()).dismiss()) { }
            }
        }

        public void onPause()
        {
            super.onPause();
            a.remove(this);
        }

        public void onResume()
        {
            super.onResume();
            if (b)
            {
                a.add(this);
                return;
            } else
            {
                dismiss();
                return;
            }
        }


        public EnableBluetoothProgressDialog()
        {
        }
    }

    public static interface a
    {

        public abstract void a();

        public abstract void b();

        public abstract void c();
    }


    private static final String e = "EnableBluetoothDialog.ProgressDialog";
    private e f = new e(true) {

        final EnableBluetoothDialog a;

        protected void b()
        {
            d();
            EnableBluetoothProgressDialog.a(false);
            if (EnableBluetoothDialog.a(a) != null)
            {
                EnableBluetoothDialog.a(a).b();
            }
            EnableBluetoothDialog.a(a, null);
        }

        protected void m()
        {
            d();
            EnableBluetoothProgressDialog.a(false);
            if (EnableBluetoothDialog.a(a) != null)
            {
                EnableBluetoothDialog.a(a).c();
            }
            EnableBluetoothDialog.a(a, null);
        }

            
            {
                a = EnableBluetoothDialog.this;
                super(flag);
            }
    };
    private a g;
    private FragmentActivity h;
    private SimpleConfirmDialogFragment.a i = new SimpleConfirmDialogFragment.a() {

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
                EnableBluetoothProgressDialog.a(true);
                simpleconfirmdialogfragment = EnableBluetoothProgressDialog.a(0, 0x7f080336, null);
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

            
            {
                a = EnableBluetoothDialog.this;
                super();
                b = false;
            }
    };

    public EnableBluetoothDialog()
    {
    }

    public EnableBluetoothDialog(FragmentActivity fragmentactivity, int j, int k)
    {
        super(j, k);
        h = fragmentactivity;
        b(i);
        setCancelable(false);
    }

    static FragmentActivity a(EnableBluetoothDialog enablebluetoothdialog, FragmentActivity fragmentactivity)
    {
        enablebluetoothdialog.h = fragmentactivity;
        return fragmentactivity;
    }

    static a a(EnableBluetoothDialog enablebluetoothdialog)
    {
        return enablebluetoothdialog.g;
    }

    public static EnableBluetoothDialog a(FragmentActivity fragmentactivity, a a1)
    {
        fragmentactivity = new EnableBluetoothDialog(fragmentactivity, 0x7f08042e, 0x7f0802c2);
        a(((EnableBluetoothDialog) (fragmentactivity)), 0x7f080335, 0x7f080367, a1);
        return fragmentactivity;
    }

    public static void a(EnableBluetoothDialog enablebluetoothdialog, int j, int k, a a1)
    {
        enablebluetoothdialog.setArguments(r.a(j, k));
        enablebluetoothdialog.a(a1);
    }

    static e b(EnableBluetoothDialog enablebluetoothdialog)
    {
        return enablebluetoothdialog.f;
    }

    static FragmentActivity c(EnableBluetoothDialog enablebluetoothdialog)
    {
        return enablebluetoothdialog.h;
    }

    public void a(a a1)
    {
        g = a1;
    }
}
