// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook:
//            D, C

final class y
    implements Runnable
{

    final ArrayList a;
    final C b;

    y(ArrayList arraylist, C c)
    {
        a = arraylist;
        b = c;
        super();
    }

    public final void run()
    {
        Pair pair;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((GraphRequest.b)pair.first).a((D)pair.second))
        {
            pair = (Pair)iterator.next();
        }

        for (Iterator iterator1 = b.e.iterator(); iterator1.hasNext(); ((C.a)iterator1.next()).a()) { }
    }
}
