// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import com.microsoft.advertising.android.a.b;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.microsoft.advertising.android:
//            ah, bo

final class b
    implements Runnable
{

    final ah a;
    private final bo b;

    public final void run()
    {
        Iterator iterator = ah.a(a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                b.a();
                return;
            }
            ((b)iterator.next()).a(b);
        } while (true);
    }

    (ah ah1, bo bo1)
    {
        a = ah1;
        b = bo1;
        super();
    }
}
