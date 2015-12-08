// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;


// Referenced classes of package com.fitbit.bluetooth:
//            e, n, k

public class c
{
    public static interface a
    {

        public abstract void a();
    }


    private static final String a = "BluetoothRestarter";
    private final a b;
    private final e c = new e(true) {

        final c a;

        protected void a()
        {
            com.fitbit.e.a.a("BluetoothRestarter", "Bluetooth is disabled. Trying to enable...", new Object[0]);
            if (!n.a().e())
            {
                com.fitbit.e.a.a("BluetoothRestarter", "Unable to enable Bluetooth.", new Object[0]);
                d();
            }
        }

        protected void b()
        {
            com.fitbit.e.a.a("BluetoothRestarter", "Bluetooth is enabled.", new Object[0]);
            d();
            c.a(a);
            if (c.b(a) != null)
            {
                c.b(a).a();
            }
        }

            
            {
                a = c.this;
                super(flag);
            }
    };

    public c(a a1)
    {
        b = a1;
    }

    static void a(c c1)
    {
        c1.c();
    }

    static a b(c c1)
    {
        return c1.b;
    }

    private void b()
    {
        c.c();
    }

    private void c()
    {
        c.d();
    }

    public boolean a()
    {
        b();
        if (!n.a().d())
        {
            c();
            return false;
        } else
        {
            return true;
        }
    }
}
