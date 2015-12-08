// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.commands;

import android.content.Intent;
import android.os.Bundle;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.e.a;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.fitbit.bluetooth.commands:
//            CommandName, g, i, n, 
//            c, m, l, u, 
//            t, a, TrackerAuthCommand, v, 
//            h, x, p, q, 
//            b, k, o, d

public class f
{
    private static class a
    {

        public static f a = new f();


        private a()
        {
        }
    }


    private static final String a = "CommandsRegistry";
    private final HashMap b = new HashMap();

    public f()
    {
        b.put(com.fitbit.bluetooth.commands.CommandName.a, com/fitbit/bluetooth/commands/g);
        b.put(CommandName.b, com/fitbit/bluetooth/commands/i);
        b.put(CommandName.c, com/fitbit/bluetooth/commands/n);
        b.put(CommandName.d, com/fitbit/bluetooth/commands/c);
        b.put(CommandName.f, com/fitbit/bluetooth/commands/m);
        b.put(CommandName.e, com/fitbit/bluetooth/commands/l);
        b.put(CommandName.h, com/fitbit/bluetooth/commands/u);
        b.put(com.fitbit.bluetooth.commands.CommandName.g, com/fitbit/bluetooth/commands/t);
        b.put(CommandName.i, com/fitbit/bluetooth/commands/a);
        b.put(CommandName.j, com/fitbit/bluetooth/commands/TrackerAuthCommand);
        b.put(CommandName.k, com/fitbit/bluetooth/commands/v);
        b.put(CommandName.l, com/fitbit/bluetooth/commands/h);
        b.put(CommandName.m, com/fitbit/bluetooth/commands/x);
        b.put(CommandName.n, com/fitbit/bluetooth/commands/p);
        b.put(CommandName.o, com/fitbit/bluetooth/commands/q);
        b.put(CommandName.p, com/fitbit/bluetooth/commands/b);
        b.put(CommandName.q, com/fitbit/bluetooth/commands/k);
        b.put(CommandName.r, com/fitbit/bluetooth/commands/o);
    }

    public static CommandName a(d d1)
    {
        for (Iterator iterator = a().b.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((Class)entry.getValue()).isInstance(d1))
            {
                return (CommandName)entry.getKey();
            }
        }

        return null;
    }

    public static d a(g g1, Intent intent, d.a a1)
    {
        if (g1 != null && intent.hasExtra("com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_COMMAND"))
        {
            Class class1 = (Class)a().b.get(intent.getSerializableExtra("com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_COMMAND"));
            if (class1 != null)
            {
                try
                {
                    Constructor constructor = class1.getConstructor(new Class[] {
                        com/fitbit/bluetooth/connection/g, android/os/Bundle, com/fitbit/bluetooth/commands/d$a
                    });
                    constructor.setAccessible(true);
                    g1 = (d)constructor.newInstance(new Object[] {
                        g1, intent.getExtras(), a1
                    });
                }
                // Misplaced declaration of an exception variable
                catch (g g1)
                {
                    com.fitbit.e.a.f("CommandsRegistry", (new StringBuilder()).append("Could not create instance of ").append(class1).toString(), g1, new Object[0]);
                    return null;
                }
                return g1;
            }
        }
        return null;
    }

    private static f a()
    {
        return com.fitbit.bluetooth.commands.a.a;
    }
}
