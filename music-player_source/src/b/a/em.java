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

public final class em extends Enum
    implements fr
{

    public static final em a;
    public static final em b;
    public static final em c;
    public static final em d;
    public static final em e;
    public static final em f;
    public static final em g;
    private static final Map h;
    private static final em k[];
    private final short i;
    private final String j;

    private em(String s, int l, short word0, String s1)
    {
        super(s, l);
        i = word0;
        j = s1;
    }

    public static em valueOf(String s)
    {
        return (em)Enum.valueOf(b/a/em, s);
    }

    public static em[] values()
    {
        return (em[])k.clone();
    }

    public final short a()
    {
        return i;
    }

    static 
    {
        a = new em("ID", 0, (short)1, "id");
        b = new em("START_TIME", 1, (short)2, "start_time");
        c = new em("END_TIME", 2, (short)3, "end_time");
        d = new em("DURATION", 3, (short)4, "duration");
        e = new em("PAGES", 4, (short)5, "pages");
        f = new em("LOCATIONS", 5, (short)6, "locations");
        g = new em("TRAFFIC", 6, (short)7, "traffic");
        k = (new em[] {
            a, b, c, d, e, f, g
        });
        h = new HashMap();
        em em1;
        for (Iterator iterator = EnumSet.allOf(b/a/em).iterator(); iterator.hasNext(); h.put(em1.j, em1))
        {
            em1 = (em)iterator.next();
        }

    }
}
