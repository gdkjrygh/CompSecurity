// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;

import java.util.AbstractList;
import java.util.RandomAccess;

final class ImmutableList extends AbstractList
    implements RandomAccess
{

    private final Object views[];

    ImmutableList(Object aobj[])
    {
        views = aobj;
    }

    public boolean contains(Object obj)
    {
        boolean flag1 = false;
        Object aobj[] = views;
        int j = aobj.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (aobj[i] != obj)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public Object get(int i)
    {
        return views[i];
    }

    public int size()
    {
        return views.length;
    }
}
