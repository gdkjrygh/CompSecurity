// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import com.tinder.model.Match;
import java.util.ArrayList;
import java.util.Collections;

// Referenced classes of package com.tinder.adapters:
//            x

class a extends ArrayList
{

    final x a;

    public void add(int i, Object obj)
    {
        super.add(i, (Match)obj);
        if (!x.a(a))
        {
            a.notifyItemInserted(i + 1);
        }
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
        if (!x.a(a))
        {
            a.notifyItemInserted(i + 1);
        }
        return true;
    }

    (x x1)
    {
        a = x1;
        super(10);
    }
}
