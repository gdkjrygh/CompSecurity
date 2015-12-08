// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.aq;

import java.util.HashMap;
import p.as.d;

// Referenced classes of package p.aq:
//            b

class u
    implements Runnable
{

    final d a;
    final HashMap b;
    final b c;

    u(b b1, d d, HashMap hashmap)
    {
        c = b1;
        a = d;
        b = hashmap;
        super();
    }

    public void run()
    {
        c.a(a, b);
    }
}
