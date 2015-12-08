// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fitbit.bluetooth.g;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.galileo.ui.sync.SyncUICase;
import com.fitbit.galileo.ui.sync.a;
import com.fitbit.galileo.ui.sync.b;
import com.fitbit.util.bh;

// Referenced classes of package com.fitbit.device.ui:
//            DeviceView

public class DeviceViewWithMultipleDevicesSupport extends DeviceView
    implements com.fitbit.galileo.ui.sync.b.a
{
    public static interface a
    {

        public abstract void a(Device device);

        public abstract void b(Device device);
    }

    private class b
    {

        final DeviceViewWithMultipleDevicesSupport a;
        private com.fitbit.galileo.ui.sync.a b;

        private void a()
        {
            a.f.setVisibility(0);
            if (a.h.getVisibility() == 0)
            {
                a.h.setVisibility(8);
            }
        }

        private void b()
        {
            a.f.setSelected(true);
            a();
        }

        private void c()
        {
            a.f.setSelected(false);
            a();
        }

        private void d()
        {
            a.f.setSelected(false);
            if (a.h.getVisibility() == 8)
            {
                a.f.setVisibility(0);
                return;
            } else
            {
                a.f.setVisibility(8);
                return;
            }
        }

        private void e()
        {
            a.h.setVisibility(8);
            a.g.setVisibility(0);
        }

        private void f()
        {
            a.f.setVisibility(8);
            a.f.setSelected(false);
            a.g.setVisibility(8);
        }

        void a(SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1, boolean flag)
        {
            b = a1;
            a.b.setText(String.format(a.getContext().getString(0x7f080316), new Object[] {
                b.b
            }));
            if (!flag)
            {
                return;
            }
            f();
            static class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[SyncUICase.values().length];
                    try
                    {
                        a[SyncUICase.c.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror11) { }
                    try
                    {
                        a[SyncUICase.d.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        a[SyncUICase.g.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    try
                    {
                        a[SyncUICase.e.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        a[SyncUICase.i.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        a[SyncUICase.j.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        a[SyncUICase.k.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        a[SyncUICase.l.ordinal()] = 8;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[SyncUICase.m.ordinal()] = 9;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[SyncUICase.n.ordinal()] = 10;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[SyncUICase.o.ordinal()] = 11;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[SyncUICase.s.ordinal()] = 12;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (com.fitbit.device.ui._cls1.a[syncuicase.ordinal()])
            {
            default:
                d();
                return;

            case 1: // '\001'
                e();
                return;

            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
                b();
                return;

            case 12: // '\f'
                c();
                break;
            }
        }

        private b()
        {
            a = DeviceViewWithMultipleDevicesSupport.this;
            super();
        }

    }


    protected View e;
    protected ImageButton f;
    protected ProgressBar g;
    protected ImageButton h;
    protected com.fitbit.galileo.ui.sync.b i;
    private Device j;
    private final b k;
    private a l;

    public DeviceViewWithMultipleDevicesSupport(Context context)
    {
        super(context);
        k = new b(null);
    }

    public DeviceViewWithMultipleDevicesSupport(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        k = new b(null);
    }

    public DeviceViewWithMultipleDevicesSupport(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        k = new b(null);
    }

    private void d()
    {
        if (com.fitbit.bluetooth.g.f() && j.a(DeviceFeature.WIRELESS_SYNC))
        {
            if (j.x())
            {
                f.setVisibility(8);
                f.setSelected(false);
                h.setVisibility(0);
                return;
            } else
            {
                h.setVisibility(8);
                return;
            }
        } else
        {
            h.setVisibility(8);
            return;
        }
    }

    protected void a()
    {
        if (l != null)
        {
            l.a(j);
        }
    }

    public void a(Device device)
    {
        j = device;
        super.a(device);
        if (com.fitbit.bluetooth.g.f() && device.a(DeviceFeature.WIRELESS_SYNC))
        {
            e.setVisibility(0);
        } else
        {
            e.setVisibility(8);
        }
        d();
        i.f();
        device = device.c();
        k.a(i.a(device), i.b(device), true);
    }

    public void a(a a1)
    {
        l = a1;
    }

    public void a(SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1)
    {
    }

    public void a(String s, SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1)
    {
        if (bh.b(s, j.c()))
        {
            k.a(syncuicase, a1, true);
        }
    }

    protected void b()
    {
        if (l != null)
        {
            l.b(j);
        }
    }

    public void b(SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1)
    {
    }

    public void b(String s, SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1)
    {
        if (bh.b(s, j.c()))
        {
            k.a(syncuicase, a1, false);
        }
    }

    public a c()
    {
        return l;
    }

    protected void onAttachedToWindow()
    {
        i.a(this);
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow()
    {
        i.b(this);
        super.onDetachedFromWindow();
    }
}
