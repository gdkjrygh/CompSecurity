// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import com.microsoft.advertising.android.a.b;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.microsoft.advertising.android:
//            ah

final class c
    implements Runnable
{

    final ah a;
    private final String b;
    private final String c;

    public final void run()
    {
        Iterator iterator = ah.a(a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((b)iterator.next()).a(b, c);
        } while (true);
    }

    (ah ah1, String s, String s1)
    {
        a = ah1;
        b = s;
        c = s1;
        super();
    }
}
