// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

class h
{

    final IntentFilter a;
    final BroadcastReceiver b;
    boolean c;

    h(IntentFilter intentfilter, BroadcastReceiver broadcastreceiver)
    {
        a = intentfilter;
        b = broadcastreceiver;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("Receiver{");
        stringbuilder.append(b);
        stringbuilder.append(" filter=");
        stringbuilder.append(a);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
