// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kik.android.sdkutils.a;

public class HeadphoneUnpluggedReceiver extends BroadcastReceiver
{

    private static HeadphoneUnpluggedReceiver b = new HeadphoneUnpluggedReceiver();
    private List a;

    public HeadphoneUnpluggedReceiver()
    {
        a = new ArrayList();
    }

    public static HeadphoneUnpluggedReceiver a()
    {
        return b;
    }

    public static void a(Context context)
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        context.registerReceiver(b, intentfilter);
    }

    public final void a(a a1)
    {
        a.add(a1);
    }

    public final void b(a a1)
    {
        a.remove(a1);
    }

    public void onReceive(Context context, Intent intent)
    {
        for (context = a.iterator(); context.hasNext(); ((a)context.next()).e()) { }
    }

}
