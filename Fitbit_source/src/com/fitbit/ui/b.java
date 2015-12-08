// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;
import com.fitbit.bluetooth.g;
import com.fitbit.pedometer.d;
import com.fitbit.savedstate.ChinaStoreUtilsSavedState;
import com.fitbit.util.ChinaConfirmationDialog;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;

public class b
    implements com.fitbit.util.ChinaConfirmationDialog.a
{

    public static final String a = "com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_ACTION_PERMISSION_RESPONSE";
    public static final String b = "com.fitbit.FitbitMobile.ChinaConfirmationDialogController.NETWORK_ACTION_PERMISSION_RESPONSE";
    public static final String c = "com.fitbit.FitbitMobile.ChinaConfirmationDialogController.CONTACTS_ACTION_PERMISSION_RESPONSE";
    public static final String d = "com.fitbit.FitbitMobile.ChinaConfirmationDialogController.ACTION_PERMISSION_RESPONSE_VALUE_KEY";
    private static final String e = "com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_ACTION_PERMISSION_REQUEST";
    private static final String f = "com.fitbit.FitbitMobile.ChinaConfirmationDialogController.NETWORK_ACTION_PERMISSION_REQUEST";
    private static final String g = "com.fitbit.FitbitMobile.ChinaConfirmationDialogController.CONTACTS_ACTION_PERMISSION_REQUEST";
    private static final String h = "com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_NO_PERMISSION_DIALOG_ACTION";
    private static final String i = "com.fitbit.FitbitMobile.ChinaConfirmationDialogController.NETWORK_NO_PERMISSION_DIALOG_ACTION";
    private static final String j = "com.fitbit.ui.dialogs.TAG_DLG_CHINA_CONFIRMATION_BLUETOOTH";
    private static final String k = "com.fitbit.ui.dialogs.TAG_DLG_CHINA_CONFIRMATION_NETWORK";
    private static final String l = "com.fitbit.ui.dialogs.TAG_DLG_CHINA_CONFIRMATION_CONTACTS";
    private static final String m = "com.fitbit.ui.dialogs.TAG_DLG_CHINA_NO_PERMISSION_BLUETOOTH";
    private static final String n = "com.fitbit.ui.dialogs.TAG_DLG_CHINA_NO_PERMISSION_NETWORK";
    private static final EnumSet o = EnumSet.noneOf(com/fitbit/savedstate/ChinaStoreUtilsSavedState$ConfirmationScope);
    private static final HashMap p = new HashMap();
    private static Boolean q = null;
    private boolean r;
    private boolean s;
    private Intent t;
    private BroadcastReceiver u;
    private FragmentActivity v;

    public b(FragmentActivity fragmentactivity)
    {
        u = new BroadcastReceiver() {

            final b a;

            public void onReceive(Context context, Intent intent)
            {
                if (b.a(a))
                {
                    b.a(a, intent);
                    return;
                } else
                {
                    b.b(a, intent);
                    return;
                }
            }

            
            {
                a = b.this;
                super();
            }
        };
        v = fragmentactivity;
    }

    private void a(Intent intent)
    {
        intent = intent.getAction();
        if (intent != null)
        {
            if (intent.equalsIgnoreCase("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_ACTION_PERMISSION_REQUEST"))
            {
                g(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.a);
            } else
            {
                if (intent.equalsIgnoreCase("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.NETWORK_ACTION_PERMISSION_REQUEST"))
                {
                    g(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.b);
                    return;
                }
                if (intent.equalsIgnoreCase("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.CONTACTS_ACTION_PERMISSION_REQUEST"))
                {
                    g(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.c);
                    return;
                }
                if (intent.equalsIgnoreCase("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_NO_PERMISSION_DIALOG_ACTION"))
                {
                    a(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.a);
                    return;
                }
                if (intent.equalsIgnoreCase("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.NETWORK_NO_PERMISSION_DIALOG_ACTION"))
                {
                    a(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.b);
                    return;
                }
            }
        }
    }

    private void a(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope confirmationscope, boolean flag, boolean flag1)
    {
        synchronized (p)
        {
            int i1 = confirmationscope.a();
            p.put(Integer.valueOf(i1), Boolean.valueOf(flag1));
        }
        if (flag && flag1)
        {
            ChinaStoreUtilsSavedState.a(confirmationscope, flag1);
        }
        hashmap = null;
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.values().length];
                try
                {
                    a[com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[confirmationscope.ordinal()];
        JVM INSTR tableswitch 1 3: default 84
    //                   1 127
    //                   2 133
    //                   3 139;
           goto _L1 _L2 _L3 _L4
_L1:
        confirmationscope = hashmap;
_L6:
        if (confirmationscope != null)
        {
            confirmationscope = new Intent(confirmationscope);
            confirmationscope.putExtra("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.ACTION_PERMISSION_RESPONSE_VALUE_KEY", flag1);
            LocalBroadcastManager.getInstance(v).sendBroadcast(confirmationscope);
        }
        return;
        confirmationscope;
        hashmap;
        JVM INSTR monitorexit ;
        throw confirmationscope;
_L2:
        confirmationscope = "com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_ACTION_PERMISSION_RESPONSE";
        continue; /* Loop/switch isn't completed */
_L3:
        confirmationscope = "com.fitbit.FitbitMobile.ChinaConfirmationDialogController.NETWORK_ACTION_PERMISSION_RESPONSE";
        continue; /* Loop/switch isn't completed */
_L4:
        confirmationscope = "com.fitbit.FitbitMobile.ChinaConfirmationDialogController.CONTACTS_ACTION_PERMISSION_RESPONSE";
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void a(b b1, Intent intent)
    {
        b1.a(intent);
    }

    static boolean a(b b1)
    {
        return b1.s;
    }

    static Intent b(b b1, Intent intent)
    {
        b1.t = intent;
        return intent;
    }

    public static void b(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope confirmationscope)
    {
        synchronized (p)
        {
            int i1 = confirmationscope.a();
            p.put(Integer.valueOf(i1), Boolean.valueOf(true));
        }
        return;
        confirmationscope;
        hashmap;
        JVM INSTR monitorexit ;
        throw confirmationscope;
    }

    public static boolean c(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope confirmationscope)
    {
        Object obj;
        if (!e())
        {
            break MISSING_BLOCK_LABEL_77;
        }
        obj = ChinaStoreUtilsSavedState.a(confirmationscope);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = p;
        obj;
        JVM INSTR monitorenter ;
        boolean flag;
        int i1 = confirmationscope.a();
        if (!p.containsKey(Integer.valueOf(i1)))
        {
            break MISSING_BLOCK_LABEL_72;
        }
        flag = ((Boolean)p.get(Integer.valueOf(i1))).booleanValue();
_L4:
        return flag;
        confirmationscope;
        obj;
        JVM INSTR monitorexit ;
        throw confirmationscope;
_L2:
        return ((Boolean) (obj)).booleanValue();
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        return true;
    }

    public static boolean d(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope confirmationscope)
    {
        return ChinaStoreUtilsSavedState.a(confirmationscope) != null;
    }

    public static void e(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope confirmationscope)
    {
        Object obj = null;
        _cls2.a[confirmationscope.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 63
    //                   2 69
    //                   3 75;
           goto _L1 _L2 _L3 _L4
_L1:
        confirmationscope = obj;
_L6:
        if (confirmationscope != null)
        {
            confirmationscope = new Intent(confirmationscope);
            LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(confirmationscope);
        }
        return;
_L2:
        confirmationscope = "com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_ACTION_PERMISSION_REQUEST";
        continue; /* Loop/switch isn't completed */
_L3:
        confirmationscope = "com.fitbit.FitbitMobile.ChinaConfirmationDialogController.NETWORK_ACTION_PERMISSION_REQUEST";
        continue; /* Loop/switch isn't completed */
_L4:
        confirmationscope = "com.fitbit.FitbitMobile.ChinaConfirmationDialogController.CONTACTS_ACTION_PERMISSION_REQUEST";
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static boolean e()
    {
        com/fitbit/ui/b;
        JVM INSTR monitorenter ;
        boolean flag;
        if (q == null)
        {
            q = Boolean.valueOf(com.fitbit.pedometer.d.a(FitBitApplication.a().getPackageManager()));
        }
        flag = q.booleanValue();
        com/fitbit/ui/b;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private void f()
    {
        if (r)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        r = true;
        LocalBroadcastManager localbroadcastmanager = LocalBroadcastManager.getInstance(v.getApplicationContext());
        IntentFilter intentfilter = new IntentFilter("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_ACTION_PERMISSION_REQUEST");
        intentfilter.addAction("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.NETWORK_ACTION_PERMISSION_REQUEST");
        intentfilter.addAction("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.CONTACTS_ACTION_PERMISSION_REQUEST");
        intentfilter.addAction("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_NO_PERMISSION_DIALOG_ACTION");
        intentfilter.addAction("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.NETWORK_NO_PERMISSION_DIALOG_ACTION");
        localbroadcastmanager.registerReceiver(u, intentfilter);
        for (Iterator iterator = o.iterator(); iterator.hasNext(); h((com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope)iterator.next())) { }
        if (!e() || !com.fitbit.bluetooth.g.f())
        {
            break MISSING_BLOCK_LABEL_154;
        }
        HashMap hashmap = p;
        hashmap;
        JVM INSTR monitorenter ;
        int i1 = com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.a.a();
        if (!p.containsKey(Integer.valueOf(i1)))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        hashmap;
        JVM INSTR monitorexit ;
        if (true == i1)
        {
            g(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.a);
        }
        return;
        Exception exception;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void f(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope confirmationscope)
    {
        Object obj = null;
        _cls2.a[confirmationscope.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 59
    //                   2 65;
           goto _L1 _L2 _L3
_L1:
        confirmationscope = obj;
_L5:
        if (confirmationscope != null)
        {
            confirmationscope = new Intent(confirmationscope);
            LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(confirmationscope);
        }
        return;
_L2:
        confirmationscope = "com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_NO_PERMISSION_DIALOG_ACTION";
        continue; /* Loop/switch isn't completed */
_L3:
        confirmationscope = "com.fitbit.FitbitMobile.ChinaConfirmationDialogController.NETWORK_NO_PERMISSION_DIALOG_ACTION";
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void g(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope confirmationscope)
    {
        if (e())
        {
            Boolean boolean1 = ChinaStoreUtilsSavedState.a(confirmationscope);
            if (boolean1 != null)
            {
                a(confirmationscope, false, boolean1.booleanValue());
            } else
            {
                boolean flag = c(confirmationscope);
                if (!flag)
                {
                    if (!o.contains(confirmationscope))
                    {
                        o.add(confirmationscope);
                        h(confirmationscope);
                        return;
                    }
                } else
                {
                    a(confirmationscope, false, flag);
                    return;
                }
            }
            return;
        } else
        {
            a(confirmationscope, false, true);
            return;
        }
    }

    private void h(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope confirmationscope)
    {
        String s1 = "com.fitbit.ui.dialogs.TAG_DLG_CHINA_CONFIRMATION_BLUETOOTH";
        _cls2.a[confirmationscope.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 63
    //                   2 73
    //                   3 83;
           goto _L1 _L2 _L3 _L4
_L1:
        int i1 = -1;
_L6:
        confirmationscope = ChinaConfirmationDialog.a(this, -1, i1, confirmationscope);
        if (confirmationscope != null)
        {
            ad.a(v.getSupportFragmentManager(), s1, confirmationscope);
        }
        return;
_L2:
        i1 = 0x7f0800e4;
        s1 = "com.fitbit.ui.dialogs.TAG_DLG_CHINA_CONFIRMATION_BLUETOOTH";
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = 0x7f0800e8;
        s1 = "com.fitbit.ui.dialogs.TAG_DLG_CHINA_CONFIRMATION_NETWORK";
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 0x7f0800e5;
        s1 = "com.fitbit.ui.dialogs.TAG_DLG_CHINA_CONFIRMATION_CONTACTS";
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void i(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope confirmationscope)
    {
        Object obj;
        FragmentManager fragmentmanager;
        fragmentmanager = v.getSupportFragmentManager();
        obj = null;
        _cls2.a[confirmationscope.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 55
    //                   2 68
    //                   3 81;
           goto _L1 _L2 _L3 _L4
_L1:
        confirmationscope = obj;
_L6:
        if (confirmationscope != null)
        {
            confirmationscope.dismissAllowingStateLoss();
        }
        return;
_L2:
        confirmationscope = (DialogFragment)fragmentmanager.findFragmentByTag("com.fitbit.ui.dialogs.TAG_DLG_CHINA_CONFIRMATION_BLUETOOTH");
        continue; /* Loop/switch isn't completed */
_L3:
        confirmationscope = (DialogFragment)fragmentmanager.findFragmentByTag("com.fitbit.ui.dialogs.TAG_DLG_CHINA_CONFIRMATION_NETWORK");
        continue; /* Loop/switch isn't completed */
_L4:
        confirmationscope = (DialogFragment)fragmentmanager.findFragmentByTag("com.fitbit.ui.dialogs.TAG_DLG_CHINA_CONFIRMATION_CONTACTS");
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a()
    {
        s = false;
        LocalBroadcastManager.getInstance(v.getApplicationContext()).unregisterReceiver(u);
        r = false;
    }

    public void a(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope confirmationscope)
    {
        _cls2.a[confirmationscope.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 65
    //                   2 75;
           goto _L1 _L2 _L3
_L1:
        int i1;
        confirmationscope = null;
        i1 = -1;
_L5:
        if (-1 != i1)
        {
            SimpleConfirmDialogFragment simpleconfirmdialogfragment = SimpleConfirmDialogFragment.a(null, 0x7f08042e, 0, -1, i1);
            ad.a(v.getSupportFragmentManager(), confirmationscope, simpleconfirmdialogfragment);
        }
        return;
_L2:
        i1 = 0x7f080188;
        confirmationscope = "com.fitbit.ui.dialogs.TAG_DLG_CHINA_NO_PERMISSION_BLUETOOTH";
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = 0x7f08018d;
        confirmationscope = "com.fitbit.ui.dialogs.TAG_DLG_CHINA_NO_PERMISSION_NETWORK";
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(ChinaConfirmationDialog chinaconfirmationdialog, com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope confirmationscope, boolean flag)
    {
        a(confirmationscope, flag, true);
        o.remove(confirmationscope);
    }

    public void b()
    {
        s = true;
        f();
        if (t != null)
        {
            a(t);
            t = null;
        }
    }

    public void b(ChinaConfirmationDialog chinaconfirmationdialog, com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope confirmationscope, boolean flag)
    {
        a(confirmationscope, flag, false);
        o.remove(confirmationscope);
    }

    public void c()
    {
        f();
    }

    public void d()
    {
        for (Iterator iterator = o.iterator(); iterator.hasNext(); i((com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope)iterator.next())) { }
    }

}
