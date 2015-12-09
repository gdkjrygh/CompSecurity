// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook:
//            aa, aj, ag, ah

final class x
    implements Runnable
{

    final ArrayList a;
    final ag b;

    x(ArrayList arraylist, ag ag1)
    {
        a = arraylist;
        b = ag1;
        super();
    }

    public final void run()
    {
        Pair pair;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((aa)pair.first).a((aj)pair.second))
        {
            pair = (Pair)iterator.next();
        }

        for (Iterator iterator1 = b.e().iterator(); iterator1.hasNext(); ((ah)iterator1.next()).a()) { }
    }
}
