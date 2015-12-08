// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import com.microsoft.advertising.android.a.b;
import com.microsoft.advertising.android.a.e;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.microsoft.advertising.android:
//            ah, h

final class d
    implements Runnable
{

    final ah a;
    private final e b;
    private final String c;
    private final String d;

    public final void run()
    {
        Iterator iterator = ah.a(a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            b b1 = (b)iterator.next();
            b1.a(new h(a.a(), com.microsoft.advertising.android.a., b, c, d));
            b1.a(a.a(), c, b);
        } while (true);
    }

    (ah ah1, e e, String s, String s1)
    {
        a = ah1;
        b = e;
        c = s;
        d = s1;
        super();
    }
}
