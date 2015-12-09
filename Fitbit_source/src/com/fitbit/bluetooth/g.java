// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.telephony.TelephonyManager;
import com.fitbit.FitBitApplication;
import com.fitbit.bluetooth.support.BluetoothSupportStatus;
import com.fitbit.bluetooth.support.a;
import com.fitbit.galileo.ui.sync.SyncUICase;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.ui.b;
import com.fitbit.ui.s;
import com.fitbit.util.EnableBluetoothDialog;
import com.fitbit.util.ad;
import com.fitbit.util.ar;
import com.fitbit.util.z;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.fitbit.bluetooth:
//            n

public class g
{

    public static final String a = "BluetoothUtils.REQUEST_ENABLE_BLUETOOTH";
    public static final String b = "BluetoothUtils.REQUEST_ENABLE_BLUETOOTH_FOR_SYNC";
    public static final String c = "BluetoothUtils.REQUEST_ENABLE_BLUETOOTH_FOR_UPDATE";
    public static final String d = "com.fitbit.bluetooth.BluetoothUtils.ACTION_BLUETOOTH_RESET_REQUEST";
    public static final String e = "com.fitbit.bluetooth.BluetoothUtils.ACTION_BLUETOOTH_RESET_RESPONSE";
    public static final String f = "com.fitbit.bluetooth.BluetoothUtils.EXTRA_BLUETOOTH_RESET_RESPONSE";
    public static final String g = "com.fitbit.bluetooth.BluetoothUtils.RESULT_RECEIVER_KEY";

    public g()
    {
    }

    public static String a(int j)
    {
        switch (j)
        {
        default:
            return "UNKNOWN";

        case 10: // '\n'
            return "NONE";

        case 12: // '\f'
            return "BONDED";

        case 11: // '\013'
            return "BONDING";
        }
    }

    public static void a(Fragment fragment, com.fitbit.util.EnableBluetoothDialog.a a1, String s1)
    {
        a(fragment.getActivity(), a1, s1);
    }

    public static void a(FragmentActivity fragmentactivity, com.fitbit.util.EnableBluetoothDialog.a a1, String s1)
    {
        if (c() && !g())
        {
            a1 = EnableBluetoothDialog.a(fragmentactivity, a1);
            ad.a(fragmentactivity.getSupportFragmentManager(), s1, a1);
        }
    }

    public static boolean a()
    {
        Intent intent = new Intent("com.fitbit.bluetooth.BluetoothUtils.ACTION_BLUETOOTH_RESET_REQUEST");
        boolean aflag[] = new boolean[1];
        aflag[0] = false;
        intent.putExtra("com.fitbit.bluetooth.BluetoothUtils.RESULT_RECEIVER_KEY", new BluetoothUtils._cls1(null, aflag));
        z.b(intent);
        return aflag[0];
    }

    public static boolean a(Activity activity)
    {
        if (!(com.fitbit.ui.b.c(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.a) & TrackerSyncPreferencesSavedState.l()))
        {
            s.a(activity, 0x7f080571, 1).i();
            return true;
        } else
        {
            return false;
        }
    }

    public static boolean a(Activity activity, com.fitbit.galileo.ui.sync.b b1)
    {
        if (b1 != null && b1.d() == SyncUICase.a)
        {
            s.a(activity, activity.getString(0x7f08053e), 1).i();
            return true;
        } else
        {
            return false;
        }
    }

    public static boolean a(BluetoothDevice bluetoothdevice)
    {
label0:
        {
            Object obj = BluetoothAdapter.getDefaultAdapter();
            if (obj == null || bluetoothdevice == null)
            {
                break label0;
            }
            obj = ((BluetoothAdapter) (obj)).getBondedDevices().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (!((BluetoothDevice)((Iterator) (obj)).next()).equals(bluetoothdevice));
            return true;
        }
        return false;
    }

    public static boolean a(Fragment fragment, com.fitbit.util.EnableBluetoothDialog.a a1, String s1, boolean flag)
    {
        return c(fragment.getActivity(), a1, s1);
    }

    public static boolean a(FragmentActivity fragmentactivity, com.fitbit.util.EnableBluetoothDialog.a a1, String s1, boolean flag)
    {
        if (flag && a(((Activity) (fragmentactivity))))
        {
            return false;
        }
        if (!ar.c(FitBitApplication.a()))
        {
            s.a(fragmentactivity, 0x7f08053d, 0).i();
            return false;
        }
        if (!g())
        {
            a(fragmentactivity, a1, s1);
            return false;
        } else
        {
            return true;
        }
    }

    public static boolean a(String s1)
    {
        return a(b(s1));
    }

    public static BluetoothDevice b(String s1)
    {
        Object obj = null;
        BluetoothAdapter bluetoothadapter = BluetoothAdapter.getDefaultAdapter();
        BluetoothDevice bluetoothdevice = obj;
        if (bluetoothadapter != null)
        {
            bluetoothdevice = obj;
            if (s1 != null)
            {
                try
                {
                    bluetoothdevice = bluetoothadapter.getRemoteDevice(s1);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    return null;
                }
            }
        }
        return bluetoothdevice;
    }

    public static boolean b()
    {
        com.fitbit.galileo.ui.sync.c c1 = com.fitbit.galileo.ui.sync.b.a(FitBitApplication.a());
        if (SyncUICase.a.equals(c1.d()) && c1.c())
        {
            return a();
        } else
        {
            return false;
        }
    }

    public static boolean b(Activity activity)
    {
        return a(activity, com.fitbit.galileo.ui.sync.b.a(FitBitApplication.a()));
    }

    public static boolean b(FragmentActivity fragmentactivity, com.fitbit.util.EnableBluetoothDialog.a a1, String s1)
    {
        boolean flag = com.fitbit.ui.b.c(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.a);
        boolean flag1 = com.fitbit.ui.b.d(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.a);
        if (!flag)
        {
            if (!flag1)
            {
                com.fitbit.ui.b.e(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.a);
                return false;
            } else
            {
                com.fitbit.ui.b.f(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.a);
                return false;
            }
        } else
        {
            return a(fragmentactivity, a1, s1, true);
        }
    }

    public static boolean c()
    {
        return BluetoothAdapter.getDefaultAdapter() != null;
    }

    public static boolean c(Activity activity)
    {
        if (!com.fitbit.dncs.service.b.a().d())
        {
            s.a(activity, 0x7f08009c, 1).i();
            return true;
        } else
        {
            return false;
        }
    }

    public static boolean c(FragmentActivity fragmentactivity, com.fitbit.util.EnableBluetoothDialog.a a1, String s1)
    {
        return a(fragmentactivity, a1, s1, true);
    }

    public static boolean d()
    {
        return c() && n.c();
    }

    public static boolean e()
    {
        return com.fitbit.bluetooth.support.a.a().b().a().a();
    }

    public static boolean f()
    {
        return d() && e();
    }

    public static boolean g()
    {
        return c() && BluetoothAdapter.getDefaultAdapter().isEnabled();
    }

    public static boolean h()
    {
        boolean flag2 = false;
        boolean flag;
        boolean flag1;
        if (!com.fitbit.ui.b.c(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!TrackerSyncPreferencesSavedState.l())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            flag2 = true;
        }
        return flag2;
    }

    public static boolean i()
    {
        return ((TelephonyManager)FitBitApplication.a().getSystemService("phone")).getSimState() != 1;
    }

    // Unreferenced inner class com/fitbit/bluetooth/BluetoothUtils$1

/* anonymous class */
    static final class BluetoothUtils._cls1 extends ResultReceiver
    {

        final boolean a[];

        protected void onReceiveResult(int j, Bundle bundle)
        {
            a[0] = true;
        }

            
            {
                a = aflag;
                super(handler);
            }
    }

}
