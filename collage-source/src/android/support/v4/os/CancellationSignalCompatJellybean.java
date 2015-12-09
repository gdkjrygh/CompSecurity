// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.os;

import android.os.CancellationSignal;

class CancellationSignalCompatJellybean
{

    CancellationSignalCompatJellybean()
    {
    }

    public static void cancel(Object obj)
    {
        ((CancellationSignal)obj).cancel();
    }

    public static Object create()
    {
        return new CancellationSignal();
    }
}
