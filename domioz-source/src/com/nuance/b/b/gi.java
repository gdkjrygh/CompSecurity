// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.dragon.toolkit.a.aa;
import com.nuance.dragon.toolkit.a.al;
import com.nuance.dragon.toolkit.a.x;
import com.nuance.dragon.toolkit.b.e;

// Referenced classes of package com.nuance.b.b:
//            fr, gh

final class gi
    implements Runnable
{

    final String a;
    final e b;
    final aa c;
    final int d = 30000;
    final al e[];
    final gh f;

    gi(gh gh1, String s, e e1, aa aa, al aal[])
    {
        f = gh1;
        a = s;
        b = e1;
        c = aa;
        e = aal;
        super();
    }

    public final void run()
    {
        com.nuance.b.b.fr.e("Creating Transaction");
        x x1 = new x(a, b, c, d);
        if (e != null)
        {
            al aal[] = e;
            int j = aal.length;
            for (int i = 0; i < j; i++)
            {
                x1.a(aal[i]);
            }

        }
        x1.e();
        f.a(x1);
    }
}
