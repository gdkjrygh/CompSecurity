// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook:
//            GraphRequest, j, i

static final class b
    implements Runnable
{

    final ArrayList a;
    final i b;

    public final void run()
    {
        Pair pair;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); (()pair.first).a((j)pair.second))
        {
            pair = (Pair)iterator.next();
        }

        for (Iterator iterator1 = b.e.iterator(); iterator1.hasNext(); ((b)iterator1.next()).b()) { }
    }

    (ArrayList arraylist, i k)
    {
        a = arraylist;
        b = k;
        super();
    }
}
