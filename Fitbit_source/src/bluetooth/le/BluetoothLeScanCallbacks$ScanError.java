// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le;


// Referenced classes of package bluetooth.le:
//            BluetoothLeScanCallbacks

public static final class  extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(bluetooth/le/BluetoothLeScanCallbacks$ScanError, s);
    }

    public static [] values()
    {
        return ([])e.clone();
    }

    static 
    {
        a = new <init>("ALREADY_STARTED", 0);
        b = new <init>("BLUETOOTH_OFF", 1);
        c = new <init>("UNSUPPORTED", 2);
        d = new <init>("INTERNAL_STACK_ERROR", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
