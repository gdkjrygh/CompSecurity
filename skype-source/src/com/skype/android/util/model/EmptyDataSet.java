// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.model;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.skype.android.util.model:
//            DataSet

public class EmptyDataSet
    implements DataSet
{

    public EmptyDataSet()
    {
    }

    public int getCount()
    {
        return 0;
    }

    public Object getItem(int i)
    {
        throw new IndexOutOfBoundsException();
    }

    public Iterator iterator()
    {
        return Collections.emptySet().iterator();
    }
}
