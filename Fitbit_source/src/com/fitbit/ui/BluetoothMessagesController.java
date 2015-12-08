// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.fitbit.dncs.NotificationManager;
import com.fitbit.e.a;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.threading.c;
import com.fitbit.util.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class BluetoothMessagesController
{

    private static final String b = "BluetoothMessagesController";
    private static final List g = new ArrayList();
    a a;
    private final FragmentActivity c;
    private boolean d;
    private boolean e;
    private final Set f;
    private c h;

    public BluetoothMessagesController(FragmentActivity fragmentactivity, Bundle bundle)
    {
        e = false;
        h = new _cls1();
    /* block-local class not found */
    class a {}

        a = new a(null);
        c = fragmentactivity;
        fragmentactivity = new HashSet(3);
        fragmentactivity.add("com.fitbit.bluetooth.BluetoothUtils.ACTION_BLUETOOTH_RESET_REQUEST");
        fragmentactivity.add("com.fitbit.galileo.GALILEO_FIRMWARE_UPDATE_REQUIRED_FOR_SYNC");
        fragmentactivity.add("ACTION_SYNC_DISABLED_DUE_SUPPORT_STATUS");
        f = fragmentactivity;
    }

    private void a(DialogTag dialogtag)
    {
        com.fitbit.e.a.a("BluetoothMessagesController", "onPositive(): %s", new Object[] {
            dialogtag
        });
        if (dialogtag != null)
        {
            f(dialogtag);
    /* block-local class not found */
    class DialogTag {}

            if (dialogtag == com.fitbit.ui.DialogTag.a)
            {
                dialogtag = new Intent("com.fitbit.bluetooth.BluetoothUtils.ACTION_BLUETOOTH_RESET_RESPONSE");
                dialogtag.putExtra("com.fitbit.bluetooth.BluetoothUtils.EXTRA_BLUETOOTH_RESET_RESPONSE", true);
                z.a(dialogtag);
            } else
            if (dialogtag == com.fitbit.ui.DialogTag.c)
            {
                TrackerSyncPreferencesSavedState.a(true);
                return;
            }
        }
    }

    static boolean a(BluetoothMessagesController bluetoothmessagescontroller)
    {
        return bluetoothmessagescontroller.c();
    }

    static boolean a(BluetoothMessagesController bluetoothmessagescontroller, DialogTag dialogtag)
    {
        return bluetoothmessagescontroller.e(dialogtag);
    }

    static FragmentActivity b(BluetoothMessagesController bluetoothmessagescontroller)
    {
        return bluetoothmessagescontroller.c;
    }

    private void b(DialogTag dialogtag)
    {
        com.fitbit.e.a.a("BluetoothMessagesController", "onNegative(): %s", new Object[] {
            dialogtag
        });
        if (dialogtag != null)
        {
            f(dialogtag);
            if (dialogtag == com.fitbit.ui.DialogTag.a)
            {
                dialogtag = new Intent("com.fitbit.bluetooth.BluetoothUtils.ACTION_BLUETOOTH_RESET_RESPONSE");
                dialogtag.putExtra("com.fitbit.bluetooth.BluetoothUtils.EXTRA_BLUETOOTH_RESET_RESPONSE", false);
                z.a(dialogtag);
            } else
            if (dialogtag == com.fitbit.ui.DialogTag.c)
            {
                TrackerSyncPreferencesSavedState.a(true);
                return;
            }
        }
    }

    static void b(BluetoothMessagesController bluetoothmessagescontroller, DialogTag dialogtag)
    {
        bluetoothmessagescontroller.b(dialogtag);
    }

    private void c(DialogTag dialogtag)
    {
        com.fitbit.e.a.a("BluetoothMessagesController", "onNeutral(): %s", new Object[] {
            dialogtag
        });
        b(dialogtag);
    }

    static void c(BluetoothMessagesController bluetoothmessagescontroller, DialogTag dialogtag)
    {
        bluetoothmessagescontroller.a(dialogtag);
    }

    private boolean c()
    {
        if (com.fitbit.util.b.a.a(17))
        {
            return c.isDestroyed();
        } else
        {
            return false;
        }
    }

    private SimpleConfirmDialogFragment d(DialogTag dialogtag)
    {
        if (dialogtag == null) goto _L2; else goto _L1
_L1:
    /* anonymous class not found */
    class _anm2 {}

        com.fitbit.ui._cls2.a[dialogtag.ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 42
    //                   2 81
    //                   3 93;
           goto _L2 _L3 _L4 _L5
_L2:
        return null;
_L3:
        dialogtag = NotificationManager.a().b();
        int i;
        if (dialogtag != null && dialogtag.a())
        {
            i = 0x7f080480;
        } else
        {
            i = 0x7f08047f;
        }
        return SimpleConfirmDialogFragment.a(null, 0x7f080486, 0x7f0802c2, 0x7f080566, i);
_L4:
        return SimpleConfirmDialogFragment.a(null, 0x7f08042e, 0, 0x7f080482, 0x7f080481);
_L5:
        return SimpleConfirmDialogFragment.a(null, 0x7f08042e, 0, 0x7f080065, 0x7f080064);
    }

    private void d()
    {
        if (g.isEmpty())
        {
            return;
        }
        if (!e)
        {
            com.fitbit.e.a.a("BluetoothMessagesController", "Cound not show dialog: activity is not resumed", new Object[0]);
            return;
        }
        DialogTag dialogtag = (DialogTag)g.get(0);
        SimpleConfirmDialogFragment simpleconfirmdialogfragment = d(dialogtag);
        if (simpleconfirmdialogfragment != null)
        {
            com.fitbit.e.a.a("BluetoothMessagesController", "Show dialog: %s", new Object[] {
                dialogtag
            });
            ad.a(c.getSupportFragmentManager(), dialogtag.a(), simpleconfirmdialogfragment);
            return;
        } else
        {
            com.fitbit.e.a.a("BluetoothMessagesController", "Unknown dialog: %s", new Object[] {
                dialogtag
            });
            f(dialogtag);
            return;
        }
    }

    static void d(BluetoothMessagesController bluetoothmessagescontroller, DialogTag dialogtag)
    {
        bluetoothmessagescontroller.c(dialogtag);
    }

    private void e()
    {
        for (Iterator iterator = g.iterator(); iterator.hasNext(); g((DialogTag)iterator.next())) { }
    }

    private boolean e(DialogTag dialogtag)
    {
        com.fitbit.e.a.a("BluetoothMessagesController", "addDialog(): %s", new Object[] {
            dialogtag
        });
        if (dialogtag != null)
        {
            if (!g.contains(dialogtag))
            {
                g.add(dialogtag);
                com.fitbit.e.a.a("BluetoothMessagesController", "Dialog added: %s. Current count: %s", new Object[] {
                    dialogtag, Integer.valueOf(g.size())
                });
                if (g.size() == 1)
                {
                    d();
                }
            }
            return true;
        } else
        {
            return false;
        }
    }

    private void f(DialogTag dialogtag)
    {
        com.fitbit.e.a.a("BluetoothMessagesController", "removeDialog(): %s", new Object[] {
            dialogtag
        });
        if (dialogtag != null && g.remove(dialogtag))
        {
            com.fitbit.e.a.a("BluetoothMessagesController", "Dialog removed: %s. Current count: %s", new Object[] {
                dialogtag, Integer.valueOf(g.size())
            });
            g(dialogtag);
            d();
        }
    }

    private void g(DialogTag dialogtag)
    {
        com.fitbit.e.a.a("BluetoothMessagesController", "hideDialog(): %s", new Object[] {
            dialogtag
        });
        if (dialogtag != null)
        {
            ad.a(c.getSupportFragmentManager(), dialogtag.a());
        }
    }

    public void a()
    {
        e = true;
        if (!d)
        {
            IntentFilter intentfilter = new IntentFilter();
            for (Iterator iterator = f.iterator(); iterator.hasNext(); intentfilter.addAction((String)iterator.next())) { }
            h.a(intentfilter);
            d = true;
        }
        a.a();
        d();
    }

    public void a(String s)
    {
        f.remove(s);
    }

    public void b()
    {
        e = false;
        if (d)
        {
            h.d();
            d = false;
        }
        a.b();
        e();
    }


    /* member class not found */
    class _cls1 {}

}
