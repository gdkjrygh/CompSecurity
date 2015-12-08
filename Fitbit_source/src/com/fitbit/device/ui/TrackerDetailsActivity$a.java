// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

// Referenced classes of package com.fitbit.device.ui:
//            TrackerDetailsActivity

private static class g
{

    private boolean a;
    private boolean b;
    private final View c;
    private final ProgressBar d;
    private final TextView e;
    private final TextView f;
    private final SwitchCompat g;

    private void g()
    {
        int i = 0;
        if (e())
        {
            g.setVisibility(8);
            d.setVisibility(0);
            return;
        }
        SwitchCompat switchcompat = g;
        if (!f())
        {
            i = 8;
        }
        switchcompat.setVisibility(i);
        d.setVisibility(8);
    }

    public TextView a()
    {
        return f;
    }

    public void a(boolean flag)
    {
        a = flag;
        g();
    }

    public TextView b()
    {
        return e;
    }

    public void b(boolean flag)
    {
        b = flag;
        g();
    }

    public SwitchCompat c()
    {
        return g;
    }

    public void c(boolean flag)
    {
        if (c != null)
        {
            c.setEnabled(flag);
            if (g != null)
            {
                g.setEnabled(flag);
            }
        }
    }

    public ProgressBar d()
    {
        return d;
    }

    public boolean e()
    {
        return a;
    }

    public boolean f()
    {
        return b;
    }

    public (View view)
    {
        Object obj1 = null;
        super();
        a = false;
        b = false;
        c = view;
        Object obj;
        if (view == null)
        {
            obj = null;
        } else
        {
            obj = (ProgressBar)view.findViewById(0x102000d);
        }
        d = ((ProgressBar) (obj));
        if (view == null)
        {
            obj = null;
        } else
        {
            obj = (TextView)view.findViewById(0x1020015);
        }
        e = ((TextView) (obj));
        if (view == null)
        {
            obj = null;
        } else
        {
            obj = (TextView)view.findViewById(0x1020014);
        }
        f = ((TextView) (obj));
        if (view == null)
        {
            view = obj1;
        } else
        {
            view = (SwitchCompat)view.findViewById(0x7f110479);
        }
        g = view;
        g();
    }
}
