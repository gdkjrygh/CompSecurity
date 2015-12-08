// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import com.pandora.android.provider.b;
import com.pandora.radio.provider.i;
import p.cw.c;

// Referenced classes of package p.ca:
//            ac

class ject
    implements Runnable
{

    final String a;
    final ring b;

    public void run()
    {
        if (ac.a(b.b) == null)
        {
            c c1 = b.a.b();
            ac.a(b.b, c1.y().a(b.a.h(), a));
        }
    }

    ring(ring ring, String s)
    {
        b = ring;
        a = s;
        super();
    }
}
