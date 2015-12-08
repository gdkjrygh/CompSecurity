// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.b;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

// Referenced classes of package android.support.v4.b:
//            d

private static final class b
{

    final IntentFilter a;
    final BroadcastReceiver b;
    boolean c;

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("Receiver{");
        stringbuilder.append(b);
        stringbuilder.append(" filter=");
        stringbuilder.append(a);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    Receiver(IntentFilter intentfilter, BroadcastReceiver broadcastreceiver)
    {
        a = intentfilter;
        b = broadcastreceiver;
    }
}
