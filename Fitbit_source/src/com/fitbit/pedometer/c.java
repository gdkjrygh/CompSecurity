// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.e.a;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.p;

// Referenced classes of package com.fitbit.pedometer:
//            d, e

public class c
    implements d.a
{

    public static final String a = "com.fitbit.ui.dialogs.TAG_DLG_HTC_PEDOMETER_COMPATIBILITY";
    private static final String b = "HtcPedometerCompatibilityController";
    private static String c;
    private BroadcastReceiver d;
    private FragmentActivity e;
    private boolean f;

    public c(FragmentActivity fragmentactivity)
    {
        d = new BroadcastReceiver() {

            final c a;

            public void onReceive(Context context, Intent intent)
            {
                if (com.fitbit.pedometer.c.a(a))
                {
                    com.fitbit.e.a.a("HtcPedometerCompatibilityController", "onReceive", new Object[0]);
                    context = intent.getAction();
                    if (context != null && context.equalsIgnoreCase("com.fitbit.FitbitMobile.HtcAdapterNotificationsReceiver.HTC_ADAPTER_COMPATIBILITY_STATUS_ACTION"))
                    {
                        com.fitbit.e.a.a("HtcPedometerCompatibilityController", "HTC_ADAPTER_COMPATIBILITY_STATUS_ACTION", new Object[0]);
                        context = intent.getExtras().getString("com.fitbit.FitbitMobile.HtcAdapterNotificationsReceiver.HTC_ADAPTER_COMPATIBILITY_STATUS_KEY");
                        if (context != null && (c.i() == null || !context.equals(c.i())))
                        {
                            com.fitbit.e.a.a("HtcPedometerCompatibilityController", "newStatus", new Object[0]);
                            com.fitbit.pedometer.c.a(intent.getExtras().getString("com.fitbit.FitbitMobile.HtcAdapterNotificationsReceiver.HTC_ADAPTER_COMPATIBILITY_STATUS_KEY"));
                        }
                        c.b(a);
                    }
                }
            }

            
            {
                a = c.this;
                super();
            }
        };
        com.fitbit.e.a.a("HtcPedometerCompatibilityController", "HtcPedometerCompatibilityController", new Object[0]);
        e = fragmentactivity;
    }

    static String a(String s)
    {
        c = s;
        return s;
    }

    static boolean a(c c1)
    {
        return c1.f;
    }

    static void b(c c1)
    {
        c1.j();
    }

    static String i()
    {
        return c;
    }

    private void j()
    {
        com.fitbit.e.a.a("HtcPedometerCompatibilityController", "showOrHideDialogIfNeeded", new Object[0]);
        if (c != null)
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityController", "null != lastKnownStatus", new Object[0]);
            SimpleConfirmDialogFragment simpleconfirmdialogfragment = com.fitbit.pedometer.d.a(c, e, this, true);
            e e1 = com.fitbit.pedometer.e.g();
            boolean flag;
            if (simpleconfirmdialogfragment == null || PedometerAdapterHelper.PedometerManufacturer.b == e1.a())
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityController", "null == fragment || PedometerManufacturer.HTC == adapter.getManufacturer()", new Object[0]);
                flag = true;
            } else
            if (p.l())
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityController", "isMotionbitLinked", new Object[0]);
                ad.a(e.getSupportFragmentManager(), "com.fitbit.ui.dialogs.TAG_DLG_HTC_PEDOMETER_COMPATIBILITY", simpleconfirmdialogfragment);
                flag = false;
            } else
            {
                flag = true;
            }
            if (flag)
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityController", "shouldHideDialog", new Object[0]);
                ad.a(e.getSupportFragmentManager(), "com.fitbit.ui.dialogs.TAG_DLG_HTC_PEDOMETER_COMPATIBILITY");
            }
        }
    }

    public void a()
    {
        com.fitbit.e.a.a("HtcPedometerCompatibilityController", "onPause", new Object[0]);
        h();
    }

    public void b()
    {
        com.fitbit.e.a.a("HtcPedometerCompatibilityController", "onResume", new Object[0]);
        Object obj = LocalBroadcastManager.getInstance(e.getApplicationContext());
        IntentFilter intentfilter = new IntentFilter("com.fitbit.FitbitMobile.HtcAdapterNotificationsReceiver.HTC_ADAPTER_COMPATIBILITY_STATUS_ACTION");
        ((LocalBroadcastManager) (obj)).registerReceiver(d, intentfilter);
        f = true;
        obj = (SimpleConfirmDialogFragment)e.getSupportFragmentManager().findFragmentByTag("com.fitbit.ui.dialogs.TAG_DLG_HTC_PEDOMETER_COMPATIBILITY");
        if (obj != null && ((SimpleConfirmDialogFragment) (obj)).getDialog() != null)
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityController", "dialogFragment != null && dialogFragment.getDialog() != null", new Object[0]);
            ((SimpleConfirmDialogFragment) (obj)).getDialog().hide();
            ((SimpleConfirmDialogFragment) (obj)).getDialog().show();
        } else
        {
            j();
        }
        if (c != null)
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityController", "null != lastKnownStatus", new Object[0]);
            if (c() && p.l())
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityController", "isFixableError && isMotionbitLinked", new Object[0]);
                e();
            }
            return;
        } else
        {
            e();
            return;
        }
    }

    public boolean c()
    {
        boolean flag = false;
        com.fitbit.e.a.a("HtcPedometerCompatibilityController", "isFixableCompatibilityError()", new Object[0]);
        if (c != null)
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityController", "null != lastKnownStatus", new Object[0]);
            flag = com.fitbit.pedometer.d.a(c);
        }
        return flag;
    }

    public void d()
    {
        com.fitbit.e.a.a("HtcPedometerCompatibilityController", "showCompatibilityDialog", new Object[0]);
        if (c != null)
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityController", "null != lastKnownStatus", new Object[0]);
            SimpleConfirmDialogFragment simpleconfirmdialogfragment = com.fitbit.pedometer.d.a(c, e, this, false);
            if (simpleconfirmdialogfragment != null)
            {
                com.fitbit.e.a.a("HtcPedometerCompatibilityController", "null != fragment", new Object[0]);
                ad.a(e.getSupportFragmentManager(), "com.fitbit.ui.dialogs.TAG_DLG_HTC_PEDOMETER_COMPATIBILITY", simpleconfirmdialogfragment);
            }
        }
    }

    public void e()
    {
        com.fitbit.e.a.a("HtcPedometerCompatibilityController", "queryPedometerAdapter", new Object[0]);
        e e1 = com.fitbit.pedometer.e.g();
        if (com.fitbit.pedometer.PedometerAdapterHelper.PedometerManufacturer.a == e1.a() || PedometerAdapterHelper.PedometerManufacturer.b == e1.a())
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityController", "adapter.getManufacturer() == DUMMY || adapter.getManufacturer() == HTC", new Object[0]);
            com.fitbit.pedometer.e.a(new e.b() {

                final c a;

                public void a(e e2)
                {
                    com.fitbit.e.a.a("HtcPedometerCompatibilityController", "onResultDelivered", new Object[0]);
                    if (PedometerAdapterHelper.PedometerManufacturer.b == e2.a())
                    {
                        com.fitbit.e.a.a("HtcPedometerCompatibilityController", "PedometerManufacturer.HTC", new Object[0]);
                        if (p.l())
                        {
                            com.fitbit.e.a.a("HtcPedometerCompatibilityController", "isMotionbitLinked", new Object[0]);
                            com.fitbit.pedometer.service.a.b();
                            com.fitbit.multipledevice.a.a().b();
                        }
                    }
                }

                public volatile void a(Object obj)
                {
                    a((e)obj);
                }

            
            {
                a = c.this;
                super();
            }
            }, true);
        }
    }

    public void f()
    {
        com.fitbit.e.a.a("HtcPedometerCompatibilityController", "onPositiveActionTaken", new Object[0]);
    }

    public void g()
    {
        com.fitbit.e.a.a("HtcPedometerCompatibilityController", "onNegativeActionTaken", new Object[0]);
        if (p.l())
        {
            com.fitbit.e.a.a("HtcPedometerCompatibilityController", "isMotionbitLinked == true", new Object[0]);
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            e.startActivity(intent);
        }
    }

    public void h()
    {
        LocalBroadcastManager.getInstance(e.getApplicationContext()).unregisterReceiver(d);
        f = false;
    }
}
