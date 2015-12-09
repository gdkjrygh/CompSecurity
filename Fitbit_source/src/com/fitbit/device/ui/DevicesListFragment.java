// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ListFragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.bx;
import com.fitbit.data.bl.fw;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceType;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.home.ui.g;
import com.fitbit.multipledevice.b;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.a.a;
import com.fitbit.util.ad;
import com.fitbit.util.bj;
import com.fitbit.util.p;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.fitbit.device.ui:
//            ScaleDetailsActivity, TrackerDetailsActivity, DevicesFragment, c

public class DevicesListFragment extends ListFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{
    public static interface a
    {

        public abstract void c();
    }

    private class b extends g
    {

        final DevicesListFragment a;

        public b()
        {
            a = DevicesListFragment.this;
            super(getActivity(), 90);
        }
    }

    private class c extends com.fitbit.home.ui.b
    {

        final DevicesListFragment a;

        public c(Device device)
        {
            a = DevicesListFragment.this;
        /* block-local class not found */
        class _cls1 {}

            super(getActivity(), new _cls1(DevicesListFragment.this, device));
        }
    }


    private static final String d = com/fitbit/device/ui/DevicesListFragment.getSimpleName();
    private static final long e = 62000L;
    private static final String f = "TAG_UNPAIR_CONFIRMATION_DIALOG";
    private static final int g = 0;
    protected com.fitbit.device.ui.c a;
    protected View b;
    protected View c;
    private Timer h;
    private g i;
    private boolean j;
    private a k;
    private boolean l;

    public DevicesListFragment()
    {
        j = false;
        k = null;
        l = false;
    }

    public static Intent a(Context context, Device device)
    {
        if (device.g() == DeviceType.SCALE)
        {
            return com.fitbit.device.ui.ScaleDetailsActivity.a(context, device);
        }
        if (device.h() == DeviceVersion.MOTIONBIT)
        {
            return null;
        } else
        {
            return com.fitbit.device.ui.TrackerDetailsActivity.a(context, device);
        }
    }

    static g a(DevicesListFragment deviceslistfragment)
    {
        return deviceslistfragment.i;
    }

    static boolean a(DevicesListFragment deviceslistfragment, boolean flag)
    {
        deviceslistfragment.l = flag;
        return flag;
    }

    static boolean b(DevicesListFragment deviceslistfragment)
    {
        return deviceslistfragment.l;
    }

    private void e()
    {
        f();
        h = new Timer();
        h.schedule(new TimerTask() {

            final DevicesListFragment a;

            public void run()
            {
                a.d();
            }

            
            {
                a = DevicesListFragment.this;
                super();
            }
        }, 0L, 62000L);
    }

    private void f()
    {
        if (h != null)
        {
            h.cancel();
        }
    }

    protected void a()
    {
        j = com.fitbit.multipledevice.b.a();
        if (getParentFragment() instanceof DevicesFragment)
        {
            a.a((DevicesFragment)getParentFragment());
        }
        a.a(j);
        setListAdapter(a);
    }

    public void a(Loader loader, List list)
    {
        c().a(list);
        if (list.size() != 0)
        {
            com.fitbit.util.a.a.b(getActivity(), c, b);
        } else
        {
            com.fitbit.util.a.a.b(getActivity(), b, c);
        }
        if (k != null)
        {
            k.c();
        }
    }

    public void a(Device device)
    {
        device = SimpleConfirmDialogFragment.a(new com.fitbit.util.SimpleConfirmDialogFragment.a(device) {

            final Device a;
            final DevicesListFragment b;

            public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
                com.fitbit.device.ui.DevicesListFragment.a(b).a(b. new c(a));
                com.fitbit.device.ui.DevicesListFragment.a(b).a(fw.a(b.getActivity(), a.c()));
            }

            public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
            }

            public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
            }

            
            {
                b = DevicesListFragment.this;
                a = device;
                super();
            }
        }, 0x7f080147, 0x7f0802c2, -1, getString(0x7f080149, new Object[] {
            device.i()
        }));
        ad.a(getChildFragmentManager(), "TAG_UNPAIR_CONFIRMATION_DIALOG", device);
    }

    public void a(a a1)
    {
        k = a1;
    }

    public void a(boolean flag)
    {
        l = flag;
        getLoaderManager().restartLoader(88, null, this);
    }

    protected void b()
    {
        getLoaderManager().initLoader(88, null, this);
        if (j)
        {
            registerForContextMenu(getListView());
        }
        c.setVisibility(4);
        b.setVisibility(4);
        i = new b();
    }

    public com.fitbit.device.ui.c c()
    {
        return (com.fitbit.device.ui.c)super.getListAdapter();
    }

    protected void d()
    {
        a.notifyDataSetChanged();
    }

    public ListAdapter getListAdapter()
    {
        return c();
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        Object obj = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
        if (((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position < 0 || ((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position >= c().getCount())
        {
            return false;
        }
        obj = (Device)c().getItem(((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position);
        switch (menuitem.getItemId())
        {
        default:
            return super.onContextItemSelected(menuitem);

        case 0: // '\0'
            a(((Device) (obj)));
            break;
        }
        return true;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        if (view.getId() == 0x102000a)
        {
            view = (android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo;
            view = (Device)c().getItem(((android.widget.AdapterView.AdapterContextMenuInfo) (view)).position);
            if (DeviceType.TRACKER.equals(view.g()))
            {
                contextmenu.setHeaderTitle(view.j());
                contextmenu.add(0, 0, 0, 0x7f080147);
            }
        }
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new bj(getActivity(), bx.c()) {

            final DevicesListFragment a;

            public List b()
            {
                List list = an.a().f();
                if (list != null)
                {
                    Collections.sort(list, p.a);
                }
                return list;
            }

            protected Intent f()
            {
                Intent intent = bx.a(getContext(), com.fitbit.device.ui.DevicesListFragment.b(a));
                com.fitbit.device.ui.DevicesListFragment.a(a, false);
                return intent;
            }

            public Object f_()
            {
                return b();
            }

            
            {
                a = DevicesListFragment.this;
                super(context, intentfilter);
            }
        };
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return null;
    }

    public void onListItemClick(ListView listview, View view, int i1, long l1)
    {
        super.onListItemClick(listview, view, i1, l1);
        listview = (Device)listview.getItemAtPosition(i1);
        listview = a(getActivity(), listview);
        if (listview != null)
        {
            ActivityCompat.startActivityForResult(getActivity(), listview, 4001, null);
        }
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (List)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onPause()
    {
        a.b();
        f();
        super.onPause();
    }

    public void onResume()
    {
        a.notifyDataSetChanged();
        a.a();
        e();
        super.onResume();
    }

}
