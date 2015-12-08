// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b.a;

import android.bluetooth.BluetoothAdapter;
import android.os.Looper;

final class h
    implements Runnable
{

    private Object a[];

    h(Object aobj[])
    {
        a = aobj;
        super();
    }

    public final void run()
    {
        Looper.prepare();
        a[1] = BluetoothAdapter.getDefaultAdapter();
        a[0] = new Boolean(true);
        Looper.loop();
    }
}
