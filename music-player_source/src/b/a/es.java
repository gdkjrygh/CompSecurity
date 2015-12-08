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

public final class es extends Enum
    implements fr
{

    public static final es a;
    public static final es b;
    private static final Map c;
    private static final es f[];
    private final short d;
    private final String e;

    private es(String s, int i, short word0, String s1)
    {
        super(s, i);
        d = word0;
        e = s1;
    }

    public static es valueOf(String s)
    {
        return (es)Enum.valueOf(b/a/es, s);
    }

    public static es[] values()
    {
        return (es[])f.clone();
    }

    public final short a()
    {
        return d;
    }

    static 
    {
        a = new es("UPLOAD_TRAFFIC", 0, (short)1, "upload_traffic");
        b = new es("DOWNLOAD_TRAFFIC", 1, (short)2, "download_traffic");
        f = (new es[] {
            a, b
        });
        c = new HashMap();
        es es1;
        for (Iterator iterator = EnumSet.allOf(b/a/es).iterator(); iterator.hasNext(); c.put(es1.e, es1))
        {
            es1 = (es)iterator.next();
        }

    }
}
