// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.model;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.util.model:
//            DataSet

public class ListDataSet
    implements DataSet
{

    protected final List a;
    private List b;

    public ListDataSet(List list)
    {
        b = Collections.emptyList();
        a = list;
    }

    public int getCount()
    {
        return a.size();
    }

    public Object getItem(int i)
    {
        return a.get(i);
    }

    public Iterator iterator()
    {
        return a.iterator();
    }
}
