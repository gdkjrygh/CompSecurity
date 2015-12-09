// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.ui;

import com.fitbit.data.domain.device.Device;
import com.fitbit.e.a;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.bh;
import com.fitbit.util.bo;
import com.fitbit.util.p;
import com.fitbit.util.threading.FitbitHandlerThread;
import java.util.Iterator;
import java.util.List;

public class DncsPairingRequestDialogController
{
    public static final class DncsPairingTrigger extends Enum
    {

        public static final DncsPairingTrigger a;
        public static final DncsPairingTrigger b;
        private static final DncsPairingTrigger c[];

        public static DncsPairingTrigger a()
        {
            return a;
        }

        public static DncsPairingTrigger valueOf(String s)
        {
            return (DncsPairingTrigger)Enum.valueOf(com/fitbit/dncs/ui/DncsPairingRequestDialogController$DncsPairingTrigger, s);
        }

        public static DncsPairingTrigger[] values()
        {
            return (DncsPairingTrigger[])c.clone();
        }

        static 
        {
            a = new DncsPairingTrigger("AUTO", 0);
            b = new DncsPairingTrigger("USER", 1);
            c = (new DncsPairingTrigger[] {
                a, b
            });
        }

        private DncsPairingTrigger(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String a = "DncsPairingRequestDialogController";
    private static final String b = "com.fitbit.dncs.ui.DncsPairingRequestDialogController.DIALOG_TAG_DNCS_PAIRING";
    private String c;
    private DncsPairingTrigger d;
    private a e;

    private DncsPairingRequestDialogController()
    {
        d = com.fitbit.dncs.ui.DncsPairingTrigger.a();
    }

    DncsPairingRequestDialogController(_cls1 _pcls1)
    {
        this();
    }

    static DncsPairingTrigger a(DncsPairingRequestDialogController dncspairingrequestdialogcontroller, DncsPairingTrigger dncspairingtrigger)
    {
        dncspairingrequestdialogcontroller.d = dncspairingtrigger;
        return dncspairingtrigger;
    }

    static a a(DncsPairingRequestDialogController dncspairingrequestdialogcontroller, a a1)
    {
        dncspairingrequestdialogcontroller.e = a1;
        return a1;
    }

    public static DncsPairingRequestDialogController a()
    {
    /* block-local class not found */
    class b {}

        return com.fitbit.dncs.ui.b.a;
    }

    static String a(DncsPairingRequestDialogController dncspairingrequestdialogcontroller)
    {
        return dncspairingrequestdialogcontroller.c;
    }

    static String a(DncsPairingRequestDialogController dncspairingrequestdialogcontroller, String s)
    {
        dncspairingrequestdialogcontroller.c = s;
        return s;
    }

    private void a(Device device, a a1, boolean flag)
    {
    /* block-local class not found */
    class a {}

label0:
        {
            if (a1 != null && device != null)
            {
                com.fitbit.e.a.a("DncsPairingRequestDialogController", "postRequestProcessed: %s, isPositive = %s", new Object[] {
                    device.c(), Boolean.valueOf(flag)
                });
                if (!flag)
                {
                    break label0;
                }
                a1.a(device);
            }
            return;
        }
        a1.b(device);
    }

    static void a(DncsPairingRequestDialogController dncspairingrequestdialogcontroller, String s, a a1)
    {
        dncspairingrequestdialogcontroller.a(s, a1);
    }

    static void a(DncsPairingRequestDialogController dncspairingrequestdialogcontroller, String s, boolean flag)
    {
        dncspairingrequestdialogcontroller.a(s, flag);
    }

    private void a(FitbitActivity fitbitactivity, Device device)
    {
        if (fitbitactivity == null || !fitbitactivity.P() || fitbitactivity.Q() || fitbitactivity.isFinishing())
        {
            return;
        }
        if (device != null)
        {
            String s = device.c();
            com.fitbit.e.a.a("DncsPairingRequestDialogController", "Show for request for encodedDeviceId = %s at %s", new Object[] {
                s, fitbitactivity.getClass().getSimpleName()
            });
            SimpleConfirmDialogFragment simpleconfirmdialogfragment = new SimpleConfirmDialogFragment(0x7f080167, 0x7f0802c2);
            int i;
            if (d == DncsPairingTrigger.b)
            {
                i = 0x7f080168;
            } else
            {
                i = bo.a(device);
            }
            SimpleConfirmDialogFragment.a(simpleconfirmdialogfragment, fitbitactivity.getString(i), fitbitactivity.getString(0x7f080166, new Object[] {
                device.j()
            }), new _cls5(s));
            ad.a(fitbitactivity.getSupportFragmentManager(), "com.fitbit.dncs.ui.DncsPairingRequestDialogController.DIALOG_TAG_DNCS_PAIRING", simpleconfirmdialogfragment);
            return;
        } else
        {
            ad.a(fitbitactivity.getSupportFragmentManager(), "com.fitbit.dncs.ui.DncsPairingRequestDialogController.DIALOG_TAG_DNCS_PAIRING");
            return;
        }
    }

    private void a(String s, a a1)
    {
        if (s != null && a1 != null)
        {
            com.fitbit.e.a.a("DncsPairingRequestDialogController", "postRequestCanceled: %s", new Object[] {
                s
            });
            a1.a(s);
        }
    }

    private void a(String s, boolean flag)
    {
        if (s != null && bh.b(c, s))
        {
            s = p.d(c);
            a a1 = e;
            c = null;
            e = null;
            c();
            a(((Device) (s)), a1, flag);
        }
    }

    static a b(DncsPairingRequestDialogController dncspairingrequestdialogcontroller)
    {
        return dncspairingrequestdialogcontroller.e;
    }

    private void c()
    {
        Device device = p.d(c);
        for (Iterator iterator = FitbitActivity.Z().iterator(); iterator.hasNext(); a((FitbitActivity)iterator.next(), device)) { }
    }

    static void c(DncsPairingRequestDialogController dncspairingrequestdialogcontroller)
    {
        dncspairingrequestdialogcontroller.c();
    }

    public void a(a a1)
    {
        FitbitHandlerThread.a(new _cls4(a1));
    }

    public void a(FitbitActivity fitbitactivity)
    {
        a(fitbitactivity, p.d(c));
    }

    public void a(String s)
    {
        FitbitHandlerThread.a(new _cls3(s));
    }

    public void a(String s, DncsPairingTrigger dncspairingtrigger, a a1)
    {
        FitbitHandlerThread.a(new _cls1(s, a1, dncspairingtrigger));
    }

    public void b()
    {
        FitbitHandlerThread.a(new _cls2());
    }

    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
