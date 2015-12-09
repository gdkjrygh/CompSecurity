// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.fitbit.bluetooth.g;
import com.fitbit.data.domain.device.Device;
import com.fitbit.device.ui.setup.choose.ChooseTrackerActivity_;
import com.fitbit.device.ui.setup.replace.ReplaceDeviceActivity_;
import com.fitbit.e.a;
import com.fitbit.galileo.service.GalileoServicesStateListener;
import com.fitbit.galileo.ui.sync.SyncUICase;
import com.fitbit.galileo.ui.sync.b;
import com.fitbit.synclair.ui.SynclairActivity;
import com.fitbit.ui.fragments.FitbitFragment;
import com.fitbit.ui.s;
import com.fitbit.util.p;
import java.util.List;

// Referenced classes of package com.fitbit.device.ui:
//            DevicesListFragment_, DevicesListFragment

public class DevicesFragment extends FitbitFragment
    implements DeviceViewWithMultipleDevicesSupport.a, DevicesListFragment.a
{

    public static final String a = "com.fitbit.device.ui.DevicesFragment.EXTRA_DEVICE_DETAILS_PENDING_MESSAGE";
    public static final int b = 4001;
    private static final String f = "DevicesFragment";
    private static final int g = 1000;
    protected b c;
    protected GalileoServicesStateListener d;
    protected DevicesListFragment e;

    public DevicesFragment()
    {
    }

    static void a(DevicesFragment devicesfragment, Device device)
    {
        devicesfragment.c(device);
    }

    static void b(DevicesFragment devicesfragment, Device device)
    {
        devicesfragment.d(device);
    }

    private void c(Device device)
    {
        String s1 = device.c();
        if (!com.fitbit.bluetooth.g.a(getActivity())) goto _L2; else goto _L1
_L1:
        return;
_L2:
        c.f();
        SyncUICase syncuicase = c.a(s1);
        com.fitbit.galileo.ui.sync.a a1 = c.b(s1);
        c.c(s1);
        static class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[SyncUICase.values().length];
                try
                {
                    a[SyncUICase.g.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[SyncUICase.j.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[SyncUICase.l.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[SyncUICase.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[SyncUICase.a.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[SyncUICase.i.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[SyncUICase.o.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[SyncUICase.n.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[SyncUICase.k.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[SyncUICase.m.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.fitbit.device.ui._cls3.a[syncuicase.ordinal()])
        {
        case 4: // '\004'
        case 5: // '\005'
        default:
            if (!com.fitbit.bluetooth.g.a(getActivity(), c) && !com.fitbit.bluetooth.g.c(getActivity()) && com.fitbit.bluetooth.g.c(getActivity(), new com.fitbit.util.EnableBluetoothDialog.a(device) {

        final Device a;
        final DevicesFragment b;

        public void a()
        {
            s.a(b.getActivity(), 0x7f08008e, 1).i();
        }

        public void b()
        {
            com.fitbit.device.ui.DevicesFragment.a(b, a);
        }

        public void c()
        {
            s.a(b.getActivity(), 0x7f08008e, 1).i();
        }

            
            {
                b = DevicesFragment.this;
                a = device;
                super();
            }
    }, "BluetoothUtils.REQUEST_ENABLE_BLUETOOTH_FOR_SYNC"))
            {
                com.fitbit.e.a.a("DevicesFragment", "Starting galileo sync service from DevicesFragment", new Object[0]);
                com.fitbit.multipledevice.a.a().a(device.c(), com.fitbit.serverinteraction.SynclairApi.SyncTrigger.b, true);
                return;
            }
            break;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
            d.b(device.c());
            s.a(getActivity(), a1.c, 1).i();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void d(Device device)
    {
        if (device != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1 = device.c();
        c.f();
        SyncUICase syncuicase = c.a(s1);
        com.fitbit.galileo.ui.sync.a a1 = c.b(s1);
        c.c(s1);
        switch (com.fitbit.device.ui._cls3.a[syncuicase.ordinal()])
        {
        default:
            if (!com.fitbit.bluetooth.g.a(getActivity(), c) && !com.fitbit.bluetooth.g.c(getActivity()) && com.fitbit.bluetooth.g.c(getActivity(), new com.fitbit.util.EnableBluetoothDialog.a(device) {

        final Device a;
        final DevicesFragment b;

        public void a()
        {
            s.a(b.getActivity(), 0x7f08008d, 1).i();
        }

        public void b()
        {
            com.fitbit.device.ui.DevicesFragment.b(b, a);
        }

        public void c()
        {
            s.a(b.getActivity(), 0x7f08008d, 1).i();
        }

            
            {
                b = DevicesFragment.this;
                a = device;
                super();
            }
    }, "BluetoothUtils.REQUEST_ENABLE_BLUETOOTH_FOR_UPDATE"))
            {
                SynclairActivity.a(getActivity(), device.j(), device.d());
                return;
            }
            break;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            s.a(getActivity(), a1.c, 1).i();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void a()
    {
        getActivity().setTitle(0x7f0802dd);
        setHasOptionsMenu(true);
        if (getChildFragmentManager().findFragmentByTag("devicesList") == null)
        {
            e = DevicesListFragment_.e().a();
            FragmentTransaction fragmenttransaction = getChildFragmentManager().beginTransaction();
            fragmenttransaction.add(0x7f11027e, e);
            fragmenttransaction.commit();
        }
    }

    public void a(Device device)
    {
        c(device);
    }

    public void b(Device device)
    {
        d(device);
    }

    public void c()
    {
    }

    protected void d()
    {
        c.f();
        Object obj = c.d();
        Object obj1 = c.e();
        c.c(null);
        switch (com.fitbit.device.ui._cls3.a[((SyncUICase) (obj)).ordinal()])
        {
        default:
            if (com.fitbit.bluetooth.g.c(getActivity()))
            {
                return;
            }
            break;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            s.a(getActivity(), ((com.fitbit.galileo.ui.sync.a) (obj1)).c, 1).i();
            return;

        case 5: // '\005'
            s.a(getActivity(), getString(0x7f08053e), 1).i();
            return;
        }
        int i;
        if (p.c().isEmpty() || !com.fitbit.multipledevice.b.a())
        {
            obj = ChooseTrackerActivity_.a(this).a();
        } else
        {
            obj = ReplaceDeviceActivity_.a(this).a();
        }
        obj1 = (ActionMenuItemView)getActivity().findViewById(0x7f1104d7);
        i = ((ActionMenuItemView) (obj1)).getWidth() / 2;
        i = ((ActionMenuItemView) (obj1)).getHeight() / 2;
        ActivityCompat.startActivityForResult(getActivity(), ((android.content.Intent) (obj)), 1000, null);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
        menuinflater.inflate(0x7f120005, menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131821783: 
            d();
            break;
        }
        return true;
    }

    public void onPause()
    {
        super.onPause();
        if (e != null)
        {
            e.a(null);
        }
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        menu = menu.findItem(0x7f1104d7);
        if (p.a().size() == 0)
        {
            menu.setTitle(0x7f080153);
            return;
        } else
        {
            menu.setTitle(0x7f08014b);
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        if (e != null)
        {
            e.a(this);
        }
    }
}
