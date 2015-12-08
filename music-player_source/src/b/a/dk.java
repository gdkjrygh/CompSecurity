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

public final class dk extends Enum
    implements fr
{

    public static final dk a;
    public static final dk b;
    public static final dk c;
    public static final dk d;
    public static final dk e;
    public static final dk f;
    public static final dk g;
    public static final dk h;
    public static final dk i;
    public static final dk j;
    private static final Map k;
    private static final dk n[];
    private final short l;
    private final String m;

    private dk(String s, int i1, short word0, String s1)
    {
        super(s, i1);
        l = word0;
        m = s1;
    }

    public static dk valueOf(String s)
    {
        return (dk)Enum.valueOf(b/a/dk, s);
    }

    public static dk[] values()
    {
        return (dk[])n.clone();
    }

    public final short a()
    {
        return l;
    }

    static 
    {
        a = new dk("TIME_ZONE", 0, (short)1, "time_zone");
        b = new dk("LANGUAGE", 1, (short)2, "language");
        c = new dk("COUNTRY", 2, (short)3, "country");
        d = new dk("LATITUDE", 3, (short)4, "latitude");
        e = new dk("LONGITUDE", 4, (short)5, "longitude");
        f = new dk("CARRIER", 5, (short)6, "carrier");
        g = new dk("LATENCY", 6, (short)7, "latency");
        h = new dk("DISPLAY_NAME", 7, (short)8, "display_name");
        i = new dk("ACCESS_TYPE", 8, (short)9, "access_type");
        j = new dk("ACCESS_SUBTYPE", 9, (short)10, "access_subtype");
        n = (new dk[] {
            a, b, c, d, e, f, g, h, i, j
        });
        k = new HashMap();
        dk dk1;
        for (Iterator iterator = EnumSet.allOf(b/a/dk).iterator(); iterator.hasNext(); k.put(dk1.m, dk1))
        {
            dk1 = (dk)iterator.next();
        }

    }
}
