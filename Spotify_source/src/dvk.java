// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.concurrent.atomic.AtomicInteger;

public class dvk
{

    private static final dvl a = new dvl();
    private static final AtomicInteger b = new AtomicInteger();

    public dvk()
    {
    }

    private static String a(ServiceConnection serviceconnection, String s)
    {
        String s1 = serviceconnection.getClass().getSimpleName();
        return (new StringBuilder()).append(s).append(s1).append(":").append(serviceconnection.hashCode()).toString();
    }

    public static void a(Context context, ServiceConnection serviceconnection, String s)
    {
        a.a(a(serviceconnection, s), -1);
        b.decrementAndGet();
        dmz.a(gew);
        context.unbindService(serviceconnection);
    }

    public static boolean a(Context context, Intent intent, ServiceConnection serviceconnection, String s)
    {
        boolean flag = context.bindService(intent, serviceconnection, 1);
        a.a(a(serviceconnection, s), 1);
        b.incrementAndGet();
        return flag;
    }

}
