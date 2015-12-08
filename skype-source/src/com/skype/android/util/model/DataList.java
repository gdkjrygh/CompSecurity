// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.model;

import java.util.AbstractList;
import java.util.Iterator;

// Referenced classes of package com.skype.android.util.model:
//            DataSet

public class DataList extends AbstractList
{

    final DataSet a;

    public Object get(int i)
    {
        return a.getItem(i);
    }

    public Iterator iterator()
    {
        return a.iterator();
    }

    public int size()
    {
        return a.getCount();
    }
}
