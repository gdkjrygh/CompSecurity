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

public final class ac extends Enum
    implements fr
{

    public static final ac a;
    public static final ac b;
    public static final ac c;
    public static final ac d;
    public static final ac e;
    public static final ac f;
    public static final ac g;
    public static final ac h;
    public static final ac i;
    public static final ac j;
    private static final Map k;
    private static final ac n[];
    private final short l;
    private final String m;

    private ac(String s, int i1, short word0, String s1)
    {
        super(s, i1);
        l = word0;
        m = s1;
    }

    public static ac valueOf(String s)
    {
        return (ac)Enum.valueOf(b/a/ac, s);
    }

    public static ac[] values()
    {
        return (ac[])n.clone();
    }

    public final short a()
    {
        return l;
    }

    static 
    {
        a = new ac("KEY", 0, (short)1, "key");
        b = new ac("VERSION", 1, (short)2, "version");
        c = new ac("VERSION_INDEX", 2, (short)3, "version_index");
        d = new ac("PACKAGE_NAME", 3, (short)4, "package_name");
        e = new ac("SDK_TYPE", 4, (short)5, "sdk_type");
        f = new ac("SDK_VERSION", 5, (short)6, "sdk_version");
        g = new ac("CHANNEL", 6, (short)7, "channel");
        h = new ac("WRAPPER_TYPE", 7, (short)8, "wrapper_type");
        i = new ac("WRAPPER_VERSION", 8, (short)9, "wrapper_version");
        j = new ac("VERTICAL_TYPE", 9, (short)10, "vertical_type");
        n = (new ac[] {
            a, b, c, d, e, f, g, h, i, j
        });
        k = new HashMap();
        ac ac1;
        for (Iterator iterator = EnumSet.allOf(b/a/ac).iterator(); iterator.hasNext(); k.put(ac1.m, ac1))
        {
            ac1 = (ac)iterator.next();
        }

    }
}
