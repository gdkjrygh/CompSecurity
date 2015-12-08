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

public final class ao extends Enum
    implements fr
{

    public static final ao a;
    private static final Map b;
    private static final ao e[];
    private final short c = 1;
    private final String d;

    private ao(String s, String s1)
    {
        super(s, 0);
        d = s1;
    }

    public static ao valueOf(String s)
    {
        return (ao)Enum.valueOf(b/a/ao, s);
    }

    public static ao[] values()
    {
        return (ao[])e.clone();
    }

    public final short a()
    {
        return c;
    }

    static 
    {
        a = new ao("LATENT", "latent");
        e = (new ao[] {
            a
        });
        b = new HashMap();
        ao ao1;
        for (Iterator iterator = EnumSet.allOf(b/a/ao).iterator(); iterator.hasNext(); b.put(ao1.d, ao1))
        {
            ao1 = (ao)iterator.next();
        }

    }
}
