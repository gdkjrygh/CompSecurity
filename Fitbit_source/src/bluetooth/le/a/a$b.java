// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le.a;

import com.fitbit.f.a;

// Referenced classes of package bluetooth.le.a:
//            a

private static final class a
    implements Runnable
{

    final bluetooth.le.a.a a;

    public void run()
    {
        com.fitbit.f.a.e("ConnectedDevicesScanner", "Scan timeout!");
        a.b();
    }

    public (bluetooth.le.a.a a1)
    {
        a = a1;
    }
}
