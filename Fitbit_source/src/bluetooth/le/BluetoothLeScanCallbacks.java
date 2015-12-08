// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le;

import java.util.List;

public interface BluetoothLeScanCallbacks
{
    public static final class ScanError extends Enum
    {

        public static final ScanError a;
        public static final ScanError b;
        public static final ScanError c;
        public static final ScanError d;
        private static final ScanError e[];

        public static ScanError valueOf(String s)
        {
            return (ScanError)Enum.valueOf(bluetooth/le/BluetoothLeScanCallbacks$ScanError, s);
        }

        public static ScanError[] values()
        {
            return (ScanError[])e.clone();
        }

        static 
        {
            a = new ScanError("ALREADY_STARTED", 0);
            b = new ScanError("BLUETOOTH_OFF", 1);
            c = new ScanError("UNSUPPORTED", 2);
            d = new ScanError("INTERNAL_STACK_ERROR", 3);
            e = (new ScanError[] {
                a, b, c, d
            });
        }

        private ScanError(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void A_();

    public abstract void B_();

    public abstract void a(ScanError scanerror);

    public abstract void a(List list);
}
