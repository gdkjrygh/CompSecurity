// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.fitbit.bluetooth.g;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.e.a;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.ui.b;
import com.fitbit.util.p;
import java.util.List;

// Referenced classes of package com.fitbit.device.ui:
//            DeviceView, UseBluetoothCell, UseBluetoothCell_, b

public class c extends com.fitbit.ui.a.c
{

    public static final int b = 1;
    public static final int c = 2;
    private static final String d = com/fitbit/device/ui/c.getSimpleName();
    protected Context a;
    private DeviceViewWithMultipleDevicesSupport.a e;
    private CheckBox f;
    private boolean g;
    private com.fitbit.util.threading.c h;

    public c()
    {
        e = null;
        f = null;
        g = false;
        h = new com.fitbit.util.threading.c() {

            final c a;

            public void a(Intent intent)
            {
                if ("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_ACTION_PERMISSION_RESPONSE".equals(intent.getAction()))
                {
                    boolean flag = intent.getBooleanExtra("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.ACTION_PERMISSION_RESPONSE_VALUE_KEY", false);
                    if (com.fitbit.device.ui.c.a(a) != null)
                    {
                        com.fitbit.device.ui.c.a(a).setChecked(flag);
                    }
                    TrackerSyncPreferencesSavedState.c(flag);
                }
            }

            
            {
                a = c.this;
                super();
            }
        };
    }

    static CheckBox a(c c1)
    {
        return c1.f;
    }

    private void a(DeviceView deviceview, int i)
    {
        deviceview.a((Device)getItem(i));
    }

    private void a(UseBluetoothCell usebluetoothcell)
    {
        boolean flag;
        if (!com.fitbit.bluetooth.g.h())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = (CheckBox)usebluetoothcell.findViewById(0x7f110385);
        f.setChecked(flag);
        f.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final c a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag1)
            {
                boolean flag2 = com.fitbit.ui.b.c(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.a);
                if (!flag1 || flag2)
                {
                    TrackerSyncPreferencesSavedState.c(flag1);
                    return;
                }
                if (!com.fitbit.ui.b.d(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.a))
                {
                    com.fitbit.ui.b.e(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.a);
                    return;
                } else
                {
                    com.fitbit.ui.b.f(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.a);
                    com.fitbit.device.ui.c.a(a).setChecked(false);
                    TrackerSyncPreferencesSavedState.c(false);
                    return;
                }
            }

            
            {
                a = c.this;
                super();
            }
        });
        usebluetoothcell.setOnClickListener(new android.view.View.OnClickListener() {

            final c a;

            public void onClick(View view)
            {
                view = com.fitbit.device.ui.c.a(a);
                boolean flag1;
                if (!com.fitbit.device.ui.c.a(a).isChecked())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                view.setChecked(flag1);
            }

            
            {
                a = c.this;
                super();
            }
        });
    }

    private boolean f()
    {
        return com.fitbit.bluetooth.g.f() && p.a(this, DeviceFeature.WIRELESS_SYNC);
    }

    public void a()
    {
        h.a(new IntentFilter("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_ACTION_PERMISSION_RESPONSE"));
    }

    public void a(DeviceViewWithMultipleDevicesSupport.a a1)
    {
        e = a1;
    }

    public void a(List list)
    {
        clear();
        addAll(list);
        notifyDataSetChanged();
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    public void b()
    {
        h.d();
    }

    public DeviceViewWithMultipleDevicesSupport.a c()
    {
        return e;
    }

    public int getCount()
    {
        int j = super.getCount();
        int i;
        if (f())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + j;
    }

    public int getItemViewType(int i)
    {
        return !f() || i != getCount() - 1 ? 1 : 2;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            switch (getItemViewType(i))
            {
            default:
                return view;

            case 2: // '\002'
                view = com.fitbit.device.ui.UseBluetoothCell_.a(a);
                a(view);
                return view;

            case 1: // '\001'
                view = com.fitbit.device.ui.b.a(a, e, g);
                a(view, i);
                com.fitbit.e.a.b(d, "The encoded device on view is %s", new Object[] {
                    ViewCompat.getTransitionName(view)
                });
                com.fitbit.e.a.b(d, "the device image transition name is %s", new Object[] {
                    ViewCompat.getTransitionName(view.findViewById(0x7f1100ba))
                });
                return view;
            }
        }
        switch (getItemViewType(i))
        {
        default:
            return view;

        case 1: // '\001'
            View view1;
            if (!(view instanceof DeviceView))
            {
                view = com.fitbit.device.ui.b.a(a, e, g);
                view1 = view;
                viewgroup = view;
            } else
            {
                viewgroup = (DeviceView)view;
                view1 = view;
            }
            a(viewgroup, i);
            com.fitbit.e.a.b(d, "The encoded device on view is %s", new Object[] {
                ViewCompat.getTransitionName(viewgroup)
            });
            com.fitbit.e.a.b(d, "the device image transition name is %s", new Object[] {
                ViewCompat.getTransitionName(viewgroup.findViewById(0x7f1100ba))
            });
            return view1;

        case 2: // '\002'
            break;
        }
        if (!(view instanceof UseBluetoothCell))
        {
            view = com.fitbit.device.ui.UseBluetoothCell_.a(a);
            view1 = view;
            viewgroup = view;
        } else
        {
            viewgroup = (UseBluetoothCell)view;
            view1 = view;
        }
        a(viewgroup);
        return view1;
    }

    public int getViewTypeCount()
    {
        byte byte0 = 1;
        if (getCount() > 1)
        {
            byte0 = 2;
        }
        return byte0;
    }

}
