// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.ag;
import com.android.slyce.a.ap;
import com.android.slyce.a.bp;
import com.android.slyce.a.c.a.a;
import com.android.slyce.a.c.c.e;

// Referenced classes of package com.android.slyce.a.c:
//            br, q, bn, s, 
//            n, u, av, ay

public class ax extends br
{

    public ax()
    {
    }

    public void a(q q1)
    {
        for (bn bn1 = com.android.slyce.a.c.bn.a(q1.c); bn1 != null && bn1 != com.android.slyce.a.c.bn.a && bn1 != bn.b || !(q1.f.c_() instanceof e);)
        {
            return;
        }

        q1.f.c_().a();
    }

    public boolean a(n n1)
    {
        Object obj = com.android.slyce.a.c.bn.a(n1.c);
        if (obj != null && obj != com.android.slyce.a.c.bn.a && obj != bn.b)
        {
            return super.a(n1);
        }
        obj = n1.j;
        Object obj1 = n1.j.g();
        if (obj1 != null)
        {
            if (((a) (obj1)).b() >= 0)
            {
                ((u) (obj)).e().a("Content-Length", String.valueOf(((a) (obj1)).b()));
                n1.f.a(n1.e);
            } else
            {
                ((u) (obj)).e().a("Transfer-Encoding", "Chunked");
                n1.f.a(new e(n1.e));
            }
        }
        obj1 = ((u) (obj)).a().toString();
        obj1 = ((u) (obj)).e().e(((String) (obj1)));
        ((u) (obj)).b((new StringBuilder()).append("\n").append(((String) (obj1))).toString());
        bp.a(n1.e, ((String) (obj1)).getBytes(), n1.g);
        obj = new ay(this, n1);
        obj1 = new com.android.slyce.a.ax();
        n1.e.a(((com.android.slyce.a.a.e) (obj1)));
        ((com.android.slyce.a.ax) (obj1)).a(((com.android.slyce.a.ay) (obj)));
        return true;
    }
}
