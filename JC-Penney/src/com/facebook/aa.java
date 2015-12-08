// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook:
//            ad, an, ak, al

final class aa
    implements Runnable
{

    final ArrayList a;
    final ak b;

    aa(ArrayList arraylist, ak ak1)
    {
        a = arraylist;
        b = ak1;
        super();
    }

    public void run()
    {
        Pair pair;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((ad)pair.first).a((an)pair.second))
        {
            pair = (Pair)iterator.next();
        }

        for (Iterator iterator1 = b.e().iterator(); iterator1.hasNext(); ((al)iterator1.next()).a(b)) { }
    }
}
