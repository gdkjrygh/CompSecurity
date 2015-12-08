// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.a;

import android.content.Intent;
import com.fitbit.bluetooth.support.BluetoothSupportStatus;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.savedstate.s;
import com.fitbit.util.p;
import com.fitbit.util.z;
import java.util.Iterator;
import java.util.List;

public class com.fitbit.galileo.a.a
{
    public static class a
    {

        private final long a;
        private final long b;

        public long a()
        {
            return a;
        }

        public boolean b()
        {
            return a > 0L;
        }

        public long c()
        {
            return b;
        }

        public boolean d()
        {
            return b > 0L;
        }

        public long e()
        {
            return Math.min(a(), c());
        }

        private a()
        {
            this(TrackerSyncPreferencesSavedState.y(), s.f());
        }

        private a(long l, long l1)
        {
            if (l <= 0L)
            {
                l = 0L;
            }
            a = l;
            if (l1 <= 0L)
            {
                l1 = 0L;
            }
            b = l1;
        }

    }


    public static final String a = "ACTION_SYNC_DISABLED_DUE_SUPPORT_STATUS";

    public com.fitbit.galileo.a.a()
    {
    }

    public static void a()
    {
        a(false);
    }

    public static void a(boolean flag)
    {
        if (c(flag))
        {
            b(false);
            z.a(new Intent("ACTION_SYNC_DISABLED_DUE_SUPPORT_STATUS"));
        }
    }

    public static void b(boolean flag)
    {
        for (Iterator iterator = p.b(DeviceFeature.WIRELESS_SYNC).iterator(); iterator.hasNext(); ((Device)iterator.next()).b(flag)) { }
    }

    public static boolean b()
    {
label0:
        {
            Object obj = p.b(DeviceFeature.WIRELESS_SYNC);
            if (obj == null)
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (!((Device)((Iterator) (obj)).next()).u());
            return true;
        }
        return false;
    }

    public static a c()
    {
        return new a();
    }

    private static boolean c(boolean flag)
    {
        boolean flag1;
        if (com.fitbit.bluetooth.support.a.a().b().a() == com.fitbit.bluetooth.support.BluetoothSupportStatus.SupportLevel.d)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return !p.b(DeviceFeature.WIRELESS_SYNC).isEmpty() && flag1 && (flag || !TrackerSyncPreferencesSavedState.h());
    }
}
