// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Tables, Table, Sets

class _cls00 extends tion
    implements Set
{

    final  this$0;

    public boolean contains(Object obj)
    {
        if (obj instanceof tion)
        {
            obj = (tion)obj;
            return .cellSet().contains(Tables.immutableCell((() (obj)).(), (() (obj)).(), (() (obj)).()));
        } else
        {
            return false;
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof Set)
            {
                obj = (Set)obj;
                flag = flag1;
                if (((Set) (obj)).size() == size())
                {
                    return containsAll(((java.util.Collection) (obj)));
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Sets.hashCodeImpl(this);
    }

    public boolean remove(Object obj)
    {
        if (obj instanceof containsAll)
        {
            obj = (containsAll)obj;
            return .cellSet().remove(Tables.immutableCell((() (obj)).(), (() (obj)).(), (() (obj)).()));
        } else
        {
            return false;
        }
    }

    tion()
    {
        this$0 = this._cls0.this;
        super(.cellSet(), _mth00());
    }
}
