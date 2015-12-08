// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class AppInterfaceUnregisteredReason extends Enum
{

    public static final AppInterfaceUnregisteredReason a;
    public static final AppInterfaceUnregisteredReason b;
    public static final AppInterfaceUnregisteredReason c;
    public static final AppInterfaceUnregisteredReason d;
    public static final AppInterfaceUnregisteredReason e;
    public static final AppInterfaceUnregisteredReason f;
    public static final AppInterfaceUnregisteredReason g;
    public static final AppInterfaceUnregisteredReason h;
    public static final AppInterfaceUnregisteredReason i;
    public static final AppInterfaceUnregisteredReason j;
    private static AppInterfaceUnregisteredReason k;
    private static final AppInterfaceUnregisteredReason l[];

    private AppInterfaceUnregisteredReason(String s, int i1)
    {
        super(s, i1);
    }

    public static AppInterfaceUnregisteredReason a(String s)
    {
        return valueOf(s);
    }

    public static AppInterfaceUnregisteredReason valueOf(String s)
    {
        return (AppInterfaceUnregisteredReason)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/AppInterfaceUnregisteredReason, s);
    }

    public static AppInterfaceUnregisteredReason[] values()
    {
        return (AppInterfaceUnregisteredReason[])l.clone();
    }

    static 
    {
        a = new AppInterfaceUnregisteredReason("USER_EXIT", 0);
        b = new AppInterfaceUnregisteredReason("IGNITION_OFF", 1);
        c = new AppInterfaceUnregisteredReason("BLUETOOTH_OFF", 2);
        d = new AppInterfaceUnregisteredReason("USB_DISCONNECTED", 3);
        e = new AppInterfaceUnregisteredReason("REQUEST_WHILE_IN_NONE_HMI_LEVEL", 4);
        f = new AppInterfaceUnregisteredReason("TOO_MANY_REQUESTS", 5);
        g = new AppInterfaceUnregisteredReason("DRIVER_DISTRACTION_VIOLATION", 6);
        h = new AppInterfaceUnregisteredReason("LANGUAGE_CHANGE", 7);
        i = new AppInterfaceUnregisteredReason("MASTER_RESET", 8);
        j = new AppInterfaceUnregisteredReason("FACTORY_DEFAULTS", 9);
        k = new AppInterfaceUnregisteredReason("APP_UNAUTHORIZED", 10);
        l = (new AppInterfaceUnregisteredReason[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
