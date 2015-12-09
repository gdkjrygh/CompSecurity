// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.bluetooth;


// Referenced classes of package com.fitbit.galileo.bluetooth:
//            d, f

public final class BluetoothWorker extends d
{
    public static final class BluetoothWorkerName extends Enum
    {

        public static final BluetoothWorkerName a;
        public static final BluetoothWorkerName b;
        public static final BluetoothWorkerName c;
        public static final BluetoothWorkerName d;
        public static final BluetoothWorkerName e;
        public static final BluetoothWorkerName f;
        public static final BluetoothWorkerName g;
        private static final BluetoothWorkerName h[];
        private final BluetoothWorkerType type;

        public static BluetoothWorkerName valueOf(String s)
        {
            return (BluetoothWorkerName)Enum.valueOf(com/fitbit/galileo/bluetooth/BluetoothWorker$BluetoothWorkerName, s);
        }

        public static BluetoothWorkerName[] values()
        {
            return (BluetoothWorkerName[])h.clone();
        }

        public BluetoothWorkerType a()
        {
            return type;
        }

        public boolean b()
        {
            return type == BluetoothWorkerType.a;
        }

        public boolean c()
        {
            return type == BluetoothWorkerType.b;
        }

        static 
        {
            a = new BluetoothWorkerName("TRACKER_SYNC", 0, BluetoothWorkerType.b);
            b = new BluetoothWorkerName("TRACKER_PAIR", 1, BluetoothWorkerType.b);
            c = new BluetoothWorkerName("TRACKER_FIRMWARE_UPDATE", 2, BluetoothWorkerType.b);
            d = new BluetoothWorkerName("LIVE_DATA", 3, BluetoothWorkerType.a);
            e = new BluetoothWorkerName("DNCS_CONNECT", 4, BluetoothWorkerType.b);
            f = new BluetoothWorkerName("DNCS_PAIR", 5, BluetoothWorkerType.b);
            g = new BluetoothWorkerName("DNCS_UNPAIR", 6, BluetoothWorkerType.b);
            h = (new BluetoothWorkerName[] {
                a, b, c, d, e, f, g
            });
        }

        private BluetoothWorkerName(String s, int i, BluetoothWorkerType bluetoothworkertype)
        {
            super(s, i);
            type = bluetoothworkertype;
        }
    }

    public static final class BluetoothWorkerType extends Enum
    {

        public static final BluetoothWorkerType a;
        public static final BluetoothWorkerType b;
        private static final BluetoothWorkerType c[];

        public static BluetoothWorkerType valueOf(String s)
        {
            return (BluetoothWorkerType)Enum.valueOf(com/fitbit/galileo/bluetooth/BluetoothWorker$BluetoothWorkerType, s);
        }

        public static BluetoothWorkerType[] values()
        {
            return (BluetoothWorkerType[])c.clone();
        }

        static 
        {
            a = new BluetoothWorkerType("NORMAL", 0);
            b = new BluetoothWorkerType("EXCLUSIVE", 1);
            c = (new BluetoothWorkerType[] {
                a, b
            });
        }

        private BluetoothWorkerType(String s, int i)
        {
            super(s, i);
        }
    }


    protected final BluetoothWorkerName a;
    private boolean b;

    public BluetoothWorker(BluetoothWorkerName bluetoothworkername)
    {
        b = false;
        a = bluetoothworkername;
    }

    protected void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (!b)
        {
            b = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean a(f f1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        flag = super.a(f1);
        return flag;
        this;
        JVM INSTR monitorexit ;
        return false;
        f1;
        this;
        JVM INSTR monitorexit ;
        throw f1;
    }

    protected void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (b)
        {
            b = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public BluetoothWorkerName c()
    {
        return a;
    }

    public boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean e()
    {
        return a.b();
    }

    public boolean f()
    {
        return a.c();
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(a).toString();
    }
}
