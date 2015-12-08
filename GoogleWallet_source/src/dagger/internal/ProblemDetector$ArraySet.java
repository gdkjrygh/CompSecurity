// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package dagger.internal:
//            ProblemDetector

static class  extends AbstractSet
{

    private final ArrayList list = new ArrayList();

    public boolean add(Object obj)
    {
        list.add(obj);
        return true;
    }

    public Iterator iterator()
    {
        return list.iterator();
    }

    public int size()
    {
        throw new UnsupportedOperationException();
    }

    ()
    {
    }
}
