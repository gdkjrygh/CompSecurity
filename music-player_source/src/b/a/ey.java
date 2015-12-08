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

public final class ey extends Enum
    implements fr
{

    public static final ey a;
    public static final ey b;
    public static final ey c;
    public static final ey d;
    public static final ey e;
    public static final ey f;
    public static final ey g;
    public static final ey h;
    public static final ey i;
    public static final ey j;
    public static final ey k;
    private static final Map l;
    private static final ey o[];
    private final short m;
    private final String n;

    private ey(String s, int i1, short word0, String s1)
    {
        super(s, i1);
        m = word0;
        n = s1;
    }

    public static ey valueOf(String s)
    {
        return (ey)Enum.valueOf(b/a/ey, s);
    }

    public static ey[] values()
    {
        return (ey[])o.clone();
    }

    public final short a()
    {
        return m;
    }

    static 
    {
        a = new ey("CLIENT_STATS", 0, (short)1, "client_stats");
        b = new ey("APP_INFO", 1, (short)2, "app_info");
        c = new ey("DEVICE_INFO", 2, (short)3, "device_info");
        d = new ey("MISC_INFO", 3, (short)4, "misc_info");
        e = new ey("ACTIVATE_MSG", 4, (short)5, "activate_msg");
        f = new ey("INSTANT_MSGS", 5, (short)6, "instant_msgs");
        g = new ey("SESSIONS", 6, (short)7, "sessions");
        h = new ey("IMPRINT", 7, (short)8, "imprint");
        i = new ey("ID_TRACKING", 8, (short)9, "id_tracking");
        j = new ey("ACTIVE_USER", 9, (short)10, "active_user");
        k = new ey("CONTROL_POLICY", 10, (short)11, "control_policy");
        o = (new ey[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
        l = new HashMap();
        ey ey1;
        for (Iterator iterator = EnumSet.allOf(b/a/ey).iterator(); iterator.hasNext(); l.put(ey1.n, ey1))
        {
            ey1 = (ey)iterator.next();
        }

    }
}
