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

public final class fe extends Enum
    implements fr
{

    public static final fe a;
    public static final fe b;
    public static final fe c;
    public static final fe d;
    public static final fe e;
    public static final fe f;
    public static final fe g;
    public static final fe h;
    public static final fe i;
    public static final fe j;
    private static final Map k;
    private static final fe n[];
    private final short l;
    private final String m;

    private fe(String s, int i1, short word0, String s1)
    {
        super(s, i1);
        l = word0;
        m = s1;
    }

    public static fe valueOf(String s)
    {
        return (fe)Enum.valueOf(b/a/fe, s);
    }

    public static fe[] values()
    {
        return (fe[])n.clone();
    }

    public final short a()
    {
        return l;
    }

    static 
    {
        a = new fe("VERSION", 0, (short)1, "version");
        b = new fe("ADDRESS", 1, (short)2, "address");
        c = new fe("SIGNATURE", 2, (short)3, "signature");
        d = new fe("SERIAL_NUM", 3, (short)4, "serial_num");
        e = new fe("TS_SECS", 4, (short)5, "ts_secs");
        f = new fe("LENGTH", 5, (short)6, "length");
        g = new fe("ENTITY", 6, (short)7, "entity");
        h = new fe("GUID", 7, (short)8, "guid");
        i = new fe("CHECKSUM", 8, (short)9, "checksum");
        j = new fe("CODEX", 9, (short)10, "codex");
        n = (new fe[] {
            a, b, c, d, e, f, g, h, i, j
        });
        k = new HashMap();
        fe fe1;
        for (Iterator iterator = EnumSet.allOf(b/a/fe).iterator(); iterator.hasNext(); k.put(fe1.m, fe1))
        {
            fe1 = (fe)iterator.next();
        }

    }
}
