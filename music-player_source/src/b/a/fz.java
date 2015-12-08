// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package b.a:
//            ga

public final class fz
    implements Serializable
{

    private static Map d = new HashMap();
    public final String a;
    public final byte b;
    public final ga c;

    public fz(String s, byte byte0, ga ga)
    {
        a = s;
        b = byte0;
        c = ga;
    }

    public static void a(Class class1, Map map)
    {
        d.put(class1, map);
    }

}
