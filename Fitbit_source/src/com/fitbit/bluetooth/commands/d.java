// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.commands;

import android.os.Bundle;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.e.a;

public abstract class d
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(boolean flag, Bundle bundle);
    }


    public static final String a = "com.fitbit.bluetooth.commands.Command.EXTRA_ENABLE";
    public static final String b = "com.fitbit.bluetooth.commands.Command.EXTRA_WAIT_FOR_USER";
    public static final String c = "com.fitbit.bluetooth.commands.Command.EXTRA_DATA";
    public static final String d = "com.fitbit.bluetooth.commands.Command.EXTRA_NOTIFICATION_ID";
    public static final String e = "com.fitbit.bluetooth.commands.Command.EXTRA_EVENT_ID";
    public static final String f = "com.fitbit.bluetooth.commands.Command.EXTRA_CATEGORY_COUNT";
    public static final String g = "com.fitbit.bluetooth.commands.Command.EXTRA_CREDENTIALS";
    public static final String h = String.format("%s.%s", new Object[] {
        com/fitbit/bluetooth/commands/d.getName(), "EXTRA_SESSION"
    });
    public static final String i = String.format("%s.%s", new Object[] {
        com/fitbit/bluetooth/commands/d.getName(), "EXTRA_BOOTMODE"
    });
    public static final String j = "com.fitbit.bluetooth.commands.Command.ACTION_CODE_DISPLAYED";
    protected final g k;
    protected final Bundle l;
    protected final a m;
    private boolean n;

    public d(g g1, Bundle bundle, a a1)
    {
        n = false;
        k = g1;
        m = a1;
        l = bundle;
    }

    protected abstract void g();

    protected abstract void h();

    protected boolean j()
    {
        return true;
    }

    protected abstract String k();

    public final boolean l()
    {
        com.fitbit.e.a.a(k(), "execute()", new Object[0]);
        if (j())
        {
            g();
            return true;
        } else
        {
            com.fitbit.e.a.a(k(), "Unable to execute command: command is invalid.", new Object[0]);
            return false;
        }
    }

    public final void m()
    {
        com.fitbit.e.a.a(k(), "cancel()", new Object[0]);
        n();
    }

    protected void n()
    {
        r();
        if (m != null)
        {
            m.a();
        }
    }

    public Bundle o()
    {
        return l;
    }

    public g p()
    {
        return k;
    }

    public final boolean q()
    {
        return n;
    }

    protected final void r()
    {
        com.fitbit.e.a.a(k(), "terminate()", new Object[0]);
        n = true;
        h();
    }

}
