// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


// Referenced classes of package com.ford.syncV4.proxy.rpc.enums:
//            AppInterfaceUnregisteredReason

public final class SyncDisconnectedReason extends Enum
{

    public static final SyncDisconnectedReason a;
    public static final SyncDisconnectedReason b;
    public static final SyncDisconnectedReason c;
    public static final SyncDisconnectedReason d;
    public static final SyncDisconnectedReason e;
    public static final SyncDisconnectedReason f;
    public static final SyncDisconnectedReason g;
    public static final SyncDisconnectedReason h;
    public static final SyncDisconnectedReason i;
    private static SyncDisconnectedReason j;
    private static SyncDisconnectedReason k;
    private static SyncDisconnectedReason l;
    private static SyncDisconnectedReason m;
    private static SyncDisconnectedReason n;
    private static SyncDisconnectedReason o;
    private static SyncDisconnectedReason p;
    private static SyncDisconnectedReason q;
    private static SyncDisconnectedReason r;
    private static SyncDisconnectedReason s;
    private static SyncDisconnectedReason t;
    private static final SyncDisconnectedReason u[];

    private SyncDisconnectedReason(String s1, int i1)
    {
        super(s1, i1);
    }

    public static SyncDisconnectedReason a(AppInterfaceUnregisteredReason appinterfaceunregisteredreason)
    {
        SyncDisconnectedReason syncdisconnectedreason = t;
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[AppInterfaceUnregisteredReason.values().length];
                try
                {
                    a[AppInterfaceUnregisteredReason.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[AppInterfaceUnregisteredReason.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[AppInterfaceUnregisteredReason.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[AppInterfaceUnregisteredReason.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[AppInterfaceUnregisteredReason.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[AppInterfaceUnregisteredReason.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[AppInterfaceUnregisteredReason.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[AppInterfaceUnregisteredReason.h.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[AppInterfaceUnregisteredReason.i.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[AppInterfaceUnregisteredReason.j.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[appinterfaceunregisteredreason.ordinal()])
        {
        default:
            return syncdisconnectedreason;

        case 1: // '\001'
            return j;

        case 2: // '\002'
            return k;

        case 3: // '\003'
            return l;

        case 4: // '\004'
            return m;

        case 5: // '\005'
            return n;

        case 6: // '\006'
            return o;

        case 7: // '\007'
            return p;

        case 8: // '\b'
            return q;

        case 9: // '\t'
            return r;

        case 10: // '\n'
            return s;
        }
    }

    public static SyncDisconnectedReason valueOf(String s1)
    {
        return (SyncDisconnectedReason)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/SyncDisconnectedReason, s1);
    }

    public static SyncDisconnectedReason[] values()
    {
        return (SyncDisconnectedReason[])u.clone();
    }

    static 
    {
        j = new SyncDisconnectedReason("USER_EXIT", 0);
        k = new SyncDisconnectedReason("IGNITION_OFF", 1);
        l = new SyncDisconnectedReason("BLUETOOTH_OFF", 2);
        m = new SyncDisconnectedReason("USB_DISCONNECTED", 3);
        n = new SyncDisconnectedReason("REQUEST_WHILE_IN_NONE_HMI_LEVEL", 4);
        o = new SyncDisconnectedReason("TOO_MANY_REQUESTS", 5);
        p = new SyncDisconnectedReason("DRIVER_DISTRACTION_VIOLATION", 6);
        q = new SyncDisconnectedReason("LANGUAGE_CHANGE", 7);
        r = new SyncDisconnectedReason("MASTER_RESET", 8);
        s = new SyncDisconnectedReason("FACTORY_DEFAULTS", 9);
        a = new SyncDisconnectedReason("TRANSPORT_ERROR", 10);
        b = new SyncDisconnectedReason("APPLICATION_REQUESTED_DISCONNECT", 11);
        t = new SyncDisconnectedReason("DEFAULT", 12);
        c = new SyncDisconnectedReason("TRANSPORT_DISCONNECT", 13);
        d = new SyncDisconnectedReason("HB_TIMEOUT", 14);
        e = new SyncDisconnectedReason("BLUETOOTH_DISABLED", 15);
        f = new SyncDisconnectedReason("BLUETOOTH_ADAPTER_ERROR", 16);
        g = new SyncDisconnectedReason("SYNC_REGISTRATION_ERROR", 17);
        h = new SyncDisconnectedReason("APP_INTERFACE_UNREG", 18);
        i = new SyncDisconnectedReason("GENERIC_ERROR", 19);
        u = (new SyncDisconnectedReason[] {
            j, k, l, m, n, o, p, q, r, s, 
            a, b, t, c, d, e, f, g, h, i
        });
    }
}
