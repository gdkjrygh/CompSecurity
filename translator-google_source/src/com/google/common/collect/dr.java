// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ee, dl, dm

abstract class dr extends ee
{

    dr()
    {
    }

    abstract dl a();

    public void clear()
    {
        a().clear();
    }

    public boolean contains(Object obj)
    {
        if (obj instanceof dm)
        {
            obj = (dm)obj;
            break MISSING_BLOCK_LABEL_12;
        }
        do
        {
            return false;
        } while (((dm) (obj)).getCount() <= 0 || a().count(((dm) (obj)).getElement()) != ((dm) (obj)).getCount());
        return true;
    }

    public boolean remove(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof dm)
        {
            obj = (dm)obj;
            Object obj1 = ((dm) (obj)).getElement();
            int i = ((dm) (obj)).getCount();
            flag = flag1;
            if (i != 0)
            {
                flag = a().setCount(obj1, i, 0);
            }
        }
        return flag;
    }
}
