// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.FinalizableWeakReference;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            Interners

class hashCode extends FinalizableWeakReference
{

    final int hashCode;
    final hashCode this$0;

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof hashCode)
            {
                obj = (hashCode)obj;
                if (((hashCode) (obj)).hashCode != hashCode)
                {
                    return false;
                }
                Object obj1 = super.get();
                if (obj1 == null || !obj1.equals(((hashCode) (obj)).get()))
                {
                    return false;
                }
            } else
            {
                return obj.equals(this);
            }
        }
        return true;
    }

    public void finalizeReferent()
    {
        get(this._cls0.this).remove(this);
    }

    public Object get()
    {
        Object obj = super.get();
        if (obj == null)
        {
            finalizeReferent();
        }
        return obj;
    }

    public int hashCode()
    {
        return hashCode;
    }

    (Object obj, int i)
    {
        this$0 = this._cls0.this;
        super(obj, this._mth0());
        hashCode = i;
    }
}
