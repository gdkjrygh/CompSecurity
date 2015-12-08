// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import android.app.Notification;
import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.ParcelUuid;
import android.support.v4.app.TaskStackBuilder;
import com.fitbit.FitBitApplication;
import com.fitbit.bluetooth.f;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.FirmwareImage;
import com.fitbit.data.domain.device.FirmwareVersion;
import com.fitbit.device.ui.DevicesListFragment;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.galileo.protocol.commands.SendFirmwareImageCommand;
import com.fitbit.home.ui.HomeActivity;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.savedstate.h;
import com.fitbit.synclair.ForegroundService;
import com.fitbit.synclair.SynclairError;
import com.fitbit.synclair.operation.info.a;
import com.fitbit.synclair.ui.SynclairActivity;
import com.fitbit.synclair.ui.controller.SynclairType;
import com.fitbit.util.bh;
import com.fitbit.util.p;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.synclair.operation:
//            BaseSynclairOperation

public class l extends BaseSynclairOperation
    implements a
{

    private static final String a = "SendFirmwareImageOperation";
    private static final long e = 10000L;
    private static final boolean f = false;
    private static final int s = 100;
    private final SynclairType g;
    private final BluetoothWorker h;
    private final BluetoothDevice i;
    private final GalileoTrackerType j;
    private final b k[];
    private final f l = new f();
    private a m;
    private int n;
    private SendFirmwareImageCommand o;
    private com.fitbit.synclair.operation.info.a.a p;
    private boolean q;
    private android.app.Notification.Builder r;
    private ForegroundService t;
    private boolean u;
    private ServiceConnection v;
    private ParcelUuid w;

    public l(SynclairType synclairtype, BluetoothWorker bluetoothworker, BluetoothDevice bluetoothdevice, GalileoTrackerType galileotrackertype, List list)
    {
        super(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.f);
        n = -1;
        q = com.fitbit.savedstate.h.h();
        v = new _cls2();
        w = new ParcelUuid(UUID.randomUUID());
        x();
        g = synclairtype;
        h = bluetoothworker;
        i = bluetoothdevice;
        j = galileotrackertype;
        t();
    /* block-local class not found */
    class b {}

        int i1;
        if (list != null)
        {
            i1 = list.size();
        } else
        {
            i1 = 0;
        }
        synclairtype = new b[i1];
        if (list != null)
        {
            i1 = 0;
            int j1 = 0;
            for (; i1 < list.size(); i1++)
            {
                bluetoothworker = (FirmwareImage)list.get(i1);
                synclairtype[i1] = new b(bluetoothworker, j1);
                j1 += bluetoothworker.c().length;
            }

        }
        if (q && synclairtype.length == 0)
        {
            synclairtype = new b[2];
            synclairtype[0] = new b(new FirmwareImage(com.fitbit.data.domain.device.FirmwareImage.DeviceMode.APP, new FirmwareVersion(new int[] {
                1, 0
            }), com.fitbit.data.domain.device.FirmwareImage.TypeOfData.MICROV2, new byte[0x30d40]), 0);
            synclairtype[1] = new b(new FirmwareImage(com.fitbit.data.domain.device.FirmwareImage.DeviceMode.BSL, new FirmwareVersion(new int[] {
                1, 0
            }), com.fitbit.data.domain.device.FirmwareImage.TypeOfData.MICROV2, new byte[0x30d40]), 0x30d40);
        }
        k = synclairtype;
    }

    public static Notification a(android.app.Notification.Builder builder)
    {
        if (com.fitbit.util.b.a.a(16))
        {
            return builder.build();
        } else
        {
            return builder.getNotification();
        }
    }

    private PendingIntent a(TaskStackBuilder taskstackbuilder)
    {
        if (com.fitbit.util.b.a.b(19))
        {
            return taskstackbuilder.getPendingIntent(0, 0x18000000);
        } else
        {
            return taskstackbuilder.getPendingIntent(0, 0x8000000);
        }
    }

    static SendFirmwareImageCommand a(l l1)
    {
        return l1.o;
    }

    static SendFirmwareImageCommand a(l l1, SendFirmwareImageCommand sendfirmwareimagecommand)
    {
        l1.o = sendfirmwareimagecommand;
        return sendfirmwareimagecommand;
    }

    static ForegroundService a(l l1, ForegroundService foregroundservice)
    {
        l1.t = foregroundservice;
        return foregroundservice;
    }

    private String a(BluetoothDevice bluetoothdevice)
    {
        Device device = com.fitbit.util.p.c(com.fitbit.galileo.a.f.a(bluetoothdevice));
        if (device != null)
        {
            return device.j();
        } else
        {
            com.fitbit.e.a.f("SendFirmwareImageOperation", "device not exists in profile", new Object[0]);
            return bluetoothdevice.getName();
        }
    }

    private void a(FirmwareImage firmwareimage, int i1)
    {
        (new Handler()).postDelayed(new _cls3(i1, firmwareimage), 100L);
    }

    static void a(l l1, int i1)
    {
        l1.c(i1);
    }

    static void a(l l1, FirmwareImage firmwareimage, int i1)
    {
        l1.a(firmwareimage, i1);
    }

    static boolean a(l l1, boolean flag)
    {
        l1.u = flag;
        return flag;
    }

    static BluetoothWorker b(l l1)
    {
        return l1.h;
    }

    private b b(int i1)
    {
        if (k != null && i1 >= 0 && i1 < k.length)
        {
            return k[i1];
        } else
        {
            return null;
        }
    }

    private void c(int i1)
    {
        com.fitbit.e.a.a("SendFirmwareImageOperation", "updateNotificationWithProgress %s, bound = %s, foregroundService = %s", new Object[] {
            Integer.valueOf(i1), Boolean.valueOf(u), t
        });
        if (u && t != null)
        {
            Notification notification;
            if (i1 < 100)
            {
                notification = d(i1);
            } else
            {
                notification = w();
            }
            t.a(notification);
        }
    }

    static void c(l l1)
    {
        l1.u();
    }

    private Notification d(int i1)
    {
        String s1 = bh.a(FitBitApplication.a().getApplicationContext(), 0x7f0801c3, new String[] {
            a(i)
        });
        r.setContentText(s1);
        r.setProgress(100, i1, false);
        return a(r);
    }

    static ParcelUuid d(l l1)
    {
        return l1.w;
    }

    static com.fitbit.synclair.operation.info.a.a e(l l1)
    {
        return l1.p;
    }

    private void t()
    {
        Object obj = FitBitApplication.a().getApplicationContext();
        r = new android.app.Notification.Builder(((Context) (obj)));
        r.setSmallIcon(0x7f020268);
        Object obj1 = ((Context) (obj)).getString(0x7f080059);
        r.setContentTitle(((CharSequence) (obj1)));
        r.setAutoCancel(true);
        obj1 = TaskStackBuilder.create(((Context) (obj)));
        Intent intent = HomeActivity.d(((Context) (obj)));
        Intent intent1 = DevicesListFragment.a(((Context) (obj)), com.fitbit.util.p.c(com.fitbit.galileo.a.f.a(i)));
        obj = SynclairActivity.a(((Context) (obj)), g.name(), a(i), null, true);
        ((TaskStackBuilder) (obj1)).addNextIntent(intent);
        ((TaskStackBuilder) (obj1)).addNextIntent(intent1);
        ((TaskStackBuilder) (obj1)).addNextIntent(((Intent) (obj)));
        obj = a(((TaskStackBuilder) (obj1)));
        r.setContentIntent(((PendingIntent) (obj)));
    }

    private void u()
    {
        if (!g())
        {
            return;
        }
        a("sendNextImage()");
        if (o == null)
        {
            int i1 = n + 1;
            n = i1;
            b b1 = b(i1);
            if (b1 == null)
            {
                a("There is no more images to send. Finishing...");
                TrackerSyncPreferencesSavedState.r();
                a(null);
                return;
            }
            a((new StringBuilder()).append("Sending image: mode=").append(b1.a.d()).append(", index=").append(n).toString());
            o = new SendFirmwareImageCommand(FitBitApplication.a(), h, i, j, b1.a);
            o.registerListener(0, new _cls1());
            l.a();
    /* block-local class not found */
    class a {}

            m = new a(b1);
            l.a(m);
            if (q)
            {
                a(b1.a, 0);
                return;
            } else
            {
                o.startLoading();
                return;
            }
        } else
        {
            a("Error: previous command is in progress");
            a(SynclairError.i);
            return;
        }
    }

    private Notification v()
    {
        String s1 = FitBitApplication.a().getApplicationContext().getString(0x7f0801c2);
        r.setContentText(s1);
        r.setProgress(0, 0, false);
        return a(r);
    }

    private Notification w()
    {
        String s1 = FitBitApplication.a().getApplicationContext().getString(0x7f0801c1);
        r.setContentText(s1);
        r.setProgress(0, 0, false);
        return a(r);
    }

    private void x()
    {
        com.fitbit.e.a.a("SendFirmwareImageOperation", "bindToForegroundService", new Object[0]);
        Context context = FitBitApplication.a().getApplicationContext();
        context.bindService(new Intent(context, com/fitbit/synclair/ForegroundService), v, 1);
    }

    private void y()
    {
        com.fitbit.e.a.a("SendFirmwareImageOperation", "unbindFromForegroundService bound = %s", new Object[] {
            Boolean.valueOf(u)
        });
        if (u)
        {
            boolean flag = s();
            t.a(flag);
            FitBitApplication.a().getApplicationContext().unbindService(v);
            u = false;
            t = null;
        }
    }

    public void a(com.fitbit.synclair.operation.info.a.a a1)
    {
        if (p != a1 && (a1 == null || g()))
        {
            p = a1;
        }
    }

    protected void l()
    {
        if (o != null)
        {
            o.stopLoading();
        }
        super.l();
    }

    protected void m()
    {
        TrackerSyncPreferencesSavedState.d(false);
        p = null;
        m = null;
        l.a();
        if (com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationResult.b == a())
        {
            Notification notification = v();
            t.a(notification);
            com.fitbit.mixpanel.f.d("Unsuccessful Firmware Updates");
        } else
        {
            com.fitbit.mixpanel.f.a("Unsuccessful Firmware Updates", "0");
        }
        y();
    }

    protected void o()
    {
        if (k != null && k.length > 0)
        {
            TrackerSyncPreferencesSavedState.d(true);
            u();
            return;
        } else
        {
            a(SynclairError.i);
            return;
        }
    }

    protected String p()
    {
        return "SendFirmwareImageOperation";
    }

    public int q()
    {
        boolean flag = false;
        b b1 = b(n);
        int i1;
        if (b1 != null)
        {
            i1 = b1.b + b1.d;
        } else
        {
            i1 = ((flag) ? 1 : 0);
            if (k != null)
            {
                i1 = ((flag) ? 1 : 0);
                if (k.length <= n)
                {
                    return r();
                }
            }
        }
        return i1;
    }

    public int r()
    {
        if (k != null && k.length > 0)
        {
            b b1 = k[k.length - 1];
            int i1 = b1.b;
            return b1.c + i1;
        } else
        {
            return 0;
        }
    }

    public boolean s()
    {
        boolean flag;
        if (a() == com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationResult.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag || 100L == ((long)q() * 100L) / (long)r();
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}

}
