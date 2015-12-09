// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le;

import com.fitbit.f.a;

// Referenced classes of package bluetooth.le:
//            b

private static final class a
    implements Runnable
{

    final b a;

    public void run()
    {
        com.fitbit.f.a.a("BluetoothLeScanner", "Scan timeout!");
        a.a();
    }

    public e(b b1)
    {
        a = b1;
    }
}
