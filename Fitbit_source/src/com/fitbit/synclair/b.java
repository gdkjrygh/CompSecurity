// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair;

import com.fitbit.e.a;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.synclair.config.bean.DeviceBaseConfigBean;
import com.fitbit.synclair.operation.BaseSynclairOperation;
import com.fitbit.synclair.operation.e;

// Referenced classes of package com.fitbit.synclair:
//            a

public class b extends com.fitbit.synclair.a
{
    private static class a
    {

        public static b a = new b();


        private a()
        {
        }
    }


    public static final String d = "com.fitbit.synclair.FirmwareUpdateManager.ACTION_CHANGED";
    private static final String f = "FirmwareUpdateManager";
    private com.fitbit.synclair.config.bean.a g;

    private b()
    {
        super(new BluetoothWorker(com.fitbit.galileo.bluetooth.BluetoothWorker.BluetoothWorkerName.c));
    }


    static com.fitbit.synclair.config.bean.a a(b b1, com.fitbit.synclair.config.bean.a a1)
    {
        b1.g = a1;
        return a1;
    }

    public static b j()
    {
        return com.fitbit.synclair.a.a;
    }

    public boolean a(String s, GalileoTrackerType galileotrackertype)
    {
        com.fitbit.e.a.a(m(), "startManager(%s, %s)", new Object[] {
            s, galileotrackertype
        });
        if (s != null && s != null)
        {
            if (G())
            {
                a = s;
                c = galileotrackertype;
                if (H())
                {
                    return true;
                }
                J();
            } else
            {
                O();
            }
        }
        return false;
    }

    protected void f()
    {
        g = null;
        super.f();
    }

    public boolean k()
    {
        com.fitbit.e.a.a(m(), "startOperationToLoadConfig()", new Object[0]);
        return a(new e(c), new SynclairManager.a() {

            final b a;

            protected volatile void a(BaseSynclairOperation basesynclairoperation)
            {
                a((e)basesynclairoperation);
            }

            protected void a(e e1)
            {
                com.fitbit.synclair.b.a(a, (com.fitbit.synclair.config.bean.a)e1.d());
                super.a(e1);
            }

            
            {
                a = b.this;
                super(b.this);
            }
        });
    }

    protected String l()
    {
        return "com.fitbit.synclair.FirmwareUpdateManager.ACTION_CHANGED";
    }

    protected String m()
    {
        return "FirmwareUpdateManager";
    }

    public com.fitbit.synclair.config.bean.a n()
    {
        return g;
    }

    public DeviceBaseConfigBean o()
    {
        return n();
    }
}
