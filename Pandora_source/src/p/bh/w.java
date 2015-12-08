// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


// Referenced classes of package p.bh:
//            a

public final class w extends Enum
{

    public static final w a;
    public static final w b;
    public static final w c;
    public static final w d;
    public static final w e;
    public static final w f;
    public static final w g;
    public static final w h;
    public static final w i;
    public static final w j;
    public static final w k;
    public static final w l;
    public static final w m;
    public static final w n;
    public static final w o;
    public static final w p;
    public static final w q;
    public static final w r;
    public static final w s;
    public static final w t;
    private static final w u[];

    private w(String s1, int i1)
    {
        super(s1, i1);
    }

    public static w a(a a1)
    {
        w w1 = m;
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[p.bh.a.values().length];
                try
                {
                    a[a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[a.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[a.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[a.h.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.i.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.j.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[a1.ordinal()])
        {
        default:
            return w1;

        case 1: // '\001'
            return a;

        case 2: // '\002'
            return b;

        case 3: // '\003'
            return c;

        case 4: // '\004'
            return d;

        case 5: // '\005'
            return e;

        case 6: // '\006'
            return f;

        case 7: // '\007'
            return g;

        case 8: // '\b'
            return h;

        case 9: // '\t'
            return i;

        case 10: // '\n'
            return j;
        }
    }

    public static w valueOf(String s1)
    {
        return (w)Enum.valueOf(p/bh/w, s1);
    }

    public static w[] values()
    {
        return (w[])u.clone();
    }

    static 
    {
        a = new w("USER_EXIT", 0);
        b = new w("IGNITION_OFF", 1);
        c = new w("BLUETOOTH_OFF", 2);
        d = new w("USB_DISCONNECTED", 3);
        e = new w("REQUEST_WHILE_IN_NONE_HMI_LEVEL", 4);
        f = new w("TOO_MANY_REQUESTS", 5);
        g = new w("DRIVER_DISTRACTION_VIOLATION", 6);
        h = new w("LANGUAGE_CHANGE", 7);
        i = new w("MASTER_RESET", 8);
        j = new w("FACTORY_DEFAULTS", 9);
        k = new w("TRANSPORT_ERROR", 10);
        l = new w("APPLICATION_REQUESTED_DISCONNECT", 11);
        m = new w("DEFAULT", 12);
        n = new w("TRANSPORT_DISCONNECT", 13);
        o = new w("HB_TIMEOUT", 14);
        p = new w("BLUETOOTH_DISABLED", 15);
        q = new w("BLUETOOTH_ADAPTER_ERROR", 16);
        r = new w("SYNC_REGISTRATION_ERROR", 17);
        s = new w("APP_INTERFACE_UNREG", 18);
        t = new w("GENERIC_ERROR", 19);
        u = (new w[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t
        });
    }
}
