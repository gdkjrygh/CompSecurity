// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.database.DataSetObserver;
import com.fitbit.e.a;
import com.fitbit.util.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.fitbit.ui:
//            k

class it>
    implements Runnable
{

    final a a;

    public void run()
    {
        String s = null;
        com.fitbit.ui.(a);
        HashSet hashset = new HashSet(a.a);
        a(a);
        HashSet hashset1 = new HashSet(a.a);
        for (Iterator iterator = a(a).iterator(); iterator.hasNext(); ((DataSetObserver)iterator.next()).onChanged()) { }
        hashset1.removeAll(hashset);
        hashset.removeAll(a.a);
        if (hashset1.size() > 0 || hashset.size() > 0)
        {
            Object obj;
            if (hashset1.size() > 0)
            {
                obj = d.a(",", hashset1);
            } else
            {
                obj = null;
            }
            if (hashset.size() > 0)
            {
                s = d.a(",", hashset);
            }
            com.fitbit.e.a.a("RelocatableListAdapter", "shown = %s; hidden = %s", new Object[] {
                obj, s
            });
            for (obj = com.fitbit.ui.(a).iterator(); ((Iterator) (obj)).hasNext(); ((asNext)((Iterator) (obj)).next()).ext(a, hashset1, hashset)) { }
        }
    }

    aSetObserver(aSetObserver asetobserver)
    {
        a = asetobserver;
        super();
    }
}
