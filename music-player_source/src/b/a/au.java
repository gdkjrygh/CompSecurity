// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package b.a:
//            fr

public final class au extends Enum
    implements fr
{

    public static final au a;
    public static final au b;
    public static final au c;
    public static final au d;
    public static final au e;
    public static final au f;
    public static final au g;
    public static final au h;
    public static final au i;
    public static final au j;
    public static final au k;
    public static final au l;
    public static final au m;
    public static final au n;
    public static final au o;
    public static final au p;
    public static final au q;
    private static final Map r;
    private static final au u[];
    private final short s;
    private final String t;

    private au(String s1, int i1, short word0, String s2)
    {
        super(s1, i1);
        s = word0;
        t = s2;
    }

    public static au valueOf(String s1)
    {
        return (au)Enum.valueOf(b/a/au, s1);
    }

    public static au[] values()
    {
        return (au[])u.clone();
    }

    public final short a()
    {
        return s;
    }

    static 
    {
        a = new au("DEVICE_ID", 0, (short)1, "device_id");
        b = new au("IDMD5", 1, (short)2, "idmd5");
        c = new au("MAC_ADDRESS", 2, (short)3, "mac_address");
        d = new au("OPEN_UDID", 3, (short)4, "open_udid");
        e = new au("MODEL", 4, (short)5, "model");
        f = new au("CPU", 5, (short)6, "cpu");
        g = new au("OS", 6, (short)7, "os");
        h = new au("OS_VERSION", 7, (short)8, "os_version");
        i = new au("RESOLUTION", 8, (short)9, "resolution");
        j = new au("IS_JAILBROKEN", 9, (short)10, "is_jailbroken");
        k = new au("IS_PIRATED", 10, (short)11, "is_pirated");
        l = new au("DEVICE_BOARD", 11, (short)12, "device_board");
        m = new au("DEVICE_BRAND", 12, (short)13, "device_brand");
        n = new au("DEVICE_MANUTIME", 13, (short)14, "device_manutime");
        o = new au("DEVICE_MANUFACTURER", 14, (short)15, "device_manufacturer");
        p = new au("DEVICE_MANUID", 15, (short)16, "device_manuid");
        q = new au("DEVICE_NAME", 16, (short)17, "device_name");
        u = (new au[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q
        });
        r = new HashMap();
        au au1;
        for (Iterator iterator = EnumSet.allOf(b/a/au).iterator(); iterator.hasNext(); r.put(au1.t, au1))
        {
            au1 = (au)iterator.next();
        }

    }
}
