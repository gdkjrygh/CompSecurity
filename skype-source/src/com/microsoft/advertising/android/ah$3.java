// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import com.microsoft.advertising.android.a.a;
import com.microsoft.advertising.android.a.b;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.microsoft.advertising.android:
//            ah, av

final class b
    implements Runnable
{

    final ah a;
    private final a b;

    public final void run()
    {
        Iterator iterator = com.microsoft.advertising.android.ah.a(a).iterator();
_L1:
        if (!iterator.hasNext())
        {
            return;
        }
        try
        {
            ((b)iterator.next()).a(b);
        }
        catch (Exception exception)
        {
            com.microsoft.advertising.android.av.a("EventLogger", "exception thrown by listener", exception);
            return;
        }
          goto _L1
    }

    (ah ah1, a a1)
    {
        a = ah1;
        b = a1;
        super();
    }
}
