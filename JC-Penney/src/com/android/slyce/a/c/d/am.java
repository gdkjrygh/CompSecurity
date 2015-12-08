// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import android.net.Uri;
import com.android.slyce.a.ag;
import com.android.slyce.a.b.j;
import com.android.slyce.a.c.bn;
import com.android.slyce.a.c.l;
import com.android.slyce.a.c.u;
import java.io.IOException;
import java.util.Hashtable;

// Referenced classes of package com.android.slyce.a.c.d:
//            a, al, aj, as, 
//            ab

class am extends a
{

    boolean n;
    final al o;

    am(al al1, ag ag, bn bn)
    {
        o = al1;
        super(ag, bn);
    }

    public void a(boolean flag, ab ab)
    {
        super.a(flag, ab);
        if (!n)
        {
            try
            {
                a();
            }
            // Misplaced declaration of an exception variable
            catch (ab ab)
            {
                ab.printStackTrace();
            }
            n = true;
            ab = (as)o.d.x.get(o.b);
            if (((as) (ab)).c.f())
            {
                o.a.j.b((new StringBuilder()).append("using new spdy connection for host: ").append(o.a.j.d().getHost()).toString());
                aj.a(o.d, o.a, this, o.c);
            }
            ab.b(this);
        }
    }
}
