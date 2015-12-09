// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks;

import android.bluetooth.BluetoothDevice;
import com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatus;
import com.fitbit.bluetooth.connection.d;
import com.fitbit.bluetooth.connection.e;
import com.fitbit.e.a;
import com.fitbit.galileo.GalileoTracker;
import com.fitbit.galileo.b;
import com.fitbit.galileo.bluetooth.f;
import com.fitbit.galileo.c;
import com.fitbit.galileo.tasks.subtasks.GalileoSubTask;
import com.fitbit.galileo.tasks.subtasks.g;
import java.util.List;

public class ae extends f
    implements com.fitbit.galileo.b.a, com.fitbit.galileo.tasks.subtasks.GalileoSubTask.a
{

    private static final String a = "SearchTrackerTask";
    private final b b;
    private final String c;
    private BluetoothDevice d;
    private List e;

    public ae(String s)
    {
        b = new b(this, com.fitbit.util.threading.FitbitHandlerThread.ThreadName.d);
        c = s;
    }

    public void a()
    {
        com.fitbit.galileo.c.a().b();
        if (!b.d())
        {
            com.fitbit.e.a.a("SearchTrackerTask", "Failed to start scanner", new Object[0]);
            r();
        }
    }

    public void a(GalileoSubTask galileosubtask)
    {
        a();
    }

    public void a(List list)
    {
        e = list;
        com.fitbit.galileo.c.a().a(list);
        if (l())
        {
            q();
        } else
        if (d == null)
        {
            r();
            return;
        }
    }

    public boolean a(GalileoTracker galileotracker)
    {
        if (l())
        {
            return true;
        }
        com.fitbit.e.a.a("SearchTrackerTask", "foundTrackerId(%s) validTrackerId(%s)", new Object[] {
            galileotracker.e(), c
        });
        if (com.fitbit.galileo.a.f.a(c, galileotracker.e()))
        {
            d = galileotracker.a();
            o();
            return true;
        } else
        {
            return false;
        }
    }

    protected void b()
    {
        b.e();
    }

    public void b(GalileoSubTask galileosubtask)
    {
        r();
    }

    protected String c()
    {
        return "SearchTrackerTask";
    }

    public void c(GalileoSubTask galileosubtask)
    {
        e();
    }

    protected void d()
    {
        com.fitbit.e.a.a("SearchTrackerTask", "Searching tracker with id: %s", new Object[] {
            c
        });
        Object obj = com.fitbit.bluetooth.connection.d.a().b();
        if (com.fitbit.bluetooth.connection.e.a(((BluetoothConnectionServiceStatus) (obj))))
        {
            obj = ((BluetoothConnectionServiceStatus) (obj)).h();
            if (com.fitbit.galileo.a.f.a(c, com.fitbit.galileo.a.f.a(((BluetoothDevice) (obj)))))
            {
                d = ((BluetoothDevice) (obj));
                o();
                return;
            } else
            {
                (new g()).a(this);
                return;
            }
        } else
        {
            a();
            return;
        }
    }

    protected void e()
    {
        b.e();
        q();
    }

    public BluetoothDevice f()
    {
        return d;
    }

    public List g()
    {
        return e;
    }

    public int t()
    {
        int i = 0;
        if (e != null)
        {
            i = e.size();
        }
        return i;
    }
}
