// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import com.pandora.android.activity.a;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.i;
import p.cw.c;

// Referenced classes of package p.ca:
//            bb

class ject
    implements Runnable
{

    final String a;
    final String b;
    final ring c;

    public void run()
    {
        c c1 = b.a.b();
        if (s.a(a) && s.a(b) && c1.d().p())
        {
            c1.d().a(p.cw.b);
        } else
        {
            if (p.ca.bb.a(c.c) == null)
            {
                p.ca.bb.a(c.c, c1.y().a(b.a.h(), a));
            }
            if (p.ca.bb.a(c.c) != null && p.ca.bb.a(c.c).A() && (s.a(a) || p.ca.bb.a(c.c).h().equals(a)))
            {
                com.pandora.android.activity.a.a(p.ca.bb.a(c.c), b, true, false, p.cw.b, null);
                return;
            }
        }
    }

    ring(ring ring, String s1, String s2)
    {
        c = ring;
        a = s1;
        b = s2;
        super();
    }
}
