// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class SearchMultipleTrackersTask extends f
    implements com.fitbit.galileo.b.a, com.fitbit.galileo.tasks.subtasks.GalileoSubTask.a
{
    public static final class ScanDuration extends Enum
    {

        public static final ScanDuration a;
        public static final ScanDuration b;
        private static final ScanDuration c[];
        private final Long value;

        public static ScanDuration valueOf(String s)
        {
            return (ScanDuration)Enum.valueOf(com/fitbit/galileo/tasks/SearchMultipleTrackersTask$ScanDuration, s);
        }

        public static ScanDuration[] values()
        {
            return (ScanDuration[])c.clone();
        }

        public Long a()
        {
            return value;
        }

        static 
        {
            a = new ScanDuration("DEFAULT", 0, null);
            b = new ScanDuration("QUICK", 1, Long.valueOf(3000L));
            c = (new ScanDuration[] {
                a, b
            });
        }

        private ScanDuration(String s, int i, Long long1)
        {
            super(s, i);
            value = long1;
        }
    }


    private final b a;
    protected final List b;
    private final Map c = new HashMap();
    private g d;

    public SearchMultipleTrackersTask(List list, ScanDuration scanduration)
    {
        d = null;
        if (list == null)
        {
            list = new ArrayList();
        }
        b = list;
        if (scanduration == null || scanduration.a() == null)
        {
            a = new b(this, com.fitbit.util.threading.FitbitHandlerThread.ThreadName.d);
            return;
        } else
        {
            a = new b(this, com.fitbit.util.threading.FitbitHandlerThread.ThreadName.d, scanduration.a().longValue());
            return;
        }
    }

    private void a()
    {
        com.fitbit.e.a.a(c(), "Disconnecting current tracker", new Object[0]);
        d = new g();
        d.a(this);
    }

    private void g()
    {
        com.fitbit.e.a.a(c(), "Searching for devices", new Object[0]);
        com.fitbit.galileo.c.a().b();
        if (!a.d())
        {
            com.fitbit.e.a.a(c(), "Failed to start scanner", new Object[0]);
            r();
        }
    }

    private void t()
    {
        com.fitbit.e.a.a(c(), "Found valid trackers: %s", new Object[] {
            c
        });
        if (a(c))
        {
            o();
            return;
        } else
        {
            r();
            return;
        }
    }

    public void a(GalileoSubTask galileosubtask)
    {
        if (d == galileosubtask)
        {
            g();
            return;
        } else
        {
            r();
            return;
        }
    }

    public final void a(List list)
    {
        if (l())
        {
            q();
            return;
        } else
        {
            com.fitbit.galileo.c.a().a(list);
            t();
            return;
        }
    }

    protected boolean a(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        return b.size() == 1 && com.fitbit.galileo.a.f.a((String)b.get(0), com.fitbit.galileo.a.f.a(bluetoothconnectionservicestatus.h()));
    }

    public final boolean a(GalileoTracker galileotracker)
    {
        String s;
        Iterator iterator;
        if (l())
        {
            return true;
        }
        s = galileotracker.e();
        iterator = b.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s1;
        s1 = (String)iterator.next();
        com.fitbit.e.a.a(c(), "foundTrackerId(%s) validTrackerId(%s)", new Object[] {
            s, s1
        });
        if (!com.fitbit.galileo.a.f.a(s1, s)) goto _L4; else goto _L3
_L3:
        boolean flag;
        c.put(s, galileotracker);
        flag = b(galileotracker);
_L6:
        return flag || b.size() == c.size();
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected abstract boolean a(Map map);

    protected void b()
    {
        a.e();
    }

    public void b(GalileoSubTask galileosubtask)
    {
        r();
    }

    protected abstract boolean b(GalileoTracker galileotracker);

    public void c(GalileoSubTask galileosubtask)
    {
        e();
    }

    protected final void d()
    {
        boolean flag = true;
        if (b.isEmpty())
        {
            com.fitbit.e.a.a(c(), "Empty items", new Object[0]);
            r();
            return;
        }
        com.fitbit.e.a.a(c(), "Valid trackers: %s", new Object[] {
            b
        });
        BluetoothConnectionServiceStatus bluetoothconnectionservicestatus = com.fitbit.bluetooth.connection.d.a().b();
        if (com.fitbit.bluetooth.connection.e.a(bluetoothconnectionservicestatus))
        {
            android.bluetooth.BluetoothDevice bluetoothdevice = bluetoothconnectionservicestatus.h();
            if (a(bluetoothconnectionservicestatus))
            {
                com.fitbit.e.a.a(c(), "Skipping search...", new Object[0]);
                c.put(com.fitbit.galileo.a.f.a(bluetoothdevice), new GalileoTracker(bluetoothdevice));
                t();
                return;
            }
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a();
            return;
        } else
        {
            g();
            return;
        }
    }

    protected void e()
    {
        a.e();
        q();
    }

    public abstract Object f();
}
