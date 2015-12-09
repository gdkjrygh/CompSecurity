// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.util.Pair;
import aoo;
import aou;
import aov;
import aoz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook:
//            Request

final class 
    implements Runnable
{

    private ArrayList a;
    private aou b;

    public final void run()
    {
        Pair pair;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((aoo)pair.first).a((aoz)pair.second))
        {
            pair = (Pair)iterator.next();
        }

        for (Iterator iterator1 = b.d.iterator(); iterator1.hasNext(); ((aov)iterator1.next()).a()) { }
    }

    (ArrayList arraylist, aou aou1)
    {
        a = arraylist;
        b = aou1;
        super();
    }
}
