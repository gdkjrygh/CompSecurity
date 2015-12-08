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

public final class cs extends Enum
    implements fr
{

    public static final cs a;
    public static final cs b;
    public static final cs c;
    public static final cs d;
    private static final Map e;
    private static final cs h[];
    private final short f;
    private final String g;

    private cs(String s, int i, short word0, String s1)
    {
        super(s, i);
        f = word0;
        g = s1;
    }

    public static cs valueOf(String s)
    {
        return (cs)Enum.valueOf(b/a/cs, s);
    }

    public static cs[] values()
    {
        return (cs[])h.clone();
    }

    public final short a()
    {
        return f;
    }

    static 
    {
        a = new cs("ID", 0, (short)1, "id");
        b = new cs("ERRORS", 1, (short)2, "errors");
        c = new cs("EVENTS", 2, (short)3, "events");
        d = new cs("GAME_EVENTS", 3, (short)4, "game_events");
        h = (new cs[] {
            a, b, c, d
        });
        e = new HashMap();
        cs cs1;
        for (Iterator iterator = EnumSet.allOf(b/a/cs).iterator(); iterator.hasNext(); e.put(cs1.g, cs1))
        {
            cs1 = (cs)iterator.next();
        }

    }
}
