// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

// Referenced classes of package android.support.v4.content:
//            LocalBroadcastManager

private static class receiver
{

    boolean broadcasting;
    final IntentFilter filter;
    final BroadcastReceiver receiver;

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("Receiver{");
        stringbuilder.append(receiver);
        stringbuilder.append(" filter=");
        stringbuilder.append(filter);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    (IntentFilter intentfilter, BroadcastReceiver broadcastreceiver)
    {
        filter = intentfilter;
        receiver = broadcastreceiver;
    }
}
