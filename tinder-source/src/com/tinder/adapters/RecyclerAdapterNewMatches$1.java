// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import com.tinder.model.Match;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.tinder.adapters:
//            ab

class a extends ArrayList
{

    final ab a;

    public void add(int i, Object obj)
    {
        super.add(i, (Match)obj);
        a.notifyItemInserted(i);
    }

    public boolean add(Object obj)
    {
        obj = (Match)obj;
        int j = Collections.binarySearch(this, obj);
        int i = j;
        if (j < 0)
        {
            i = ~j;
        }
        super.add(i, obj);
        a.notifyItemInserted(i);
        return true;
    }

    public boolean addAll(Collection collection)
    {
        super.addAll(collection);
        Collections.sort(this);
        a.notifyDataSetChanged();
        return true;
    }

    (ab ab1)
    {
        a = ab1;
        super(10);
    }
}
