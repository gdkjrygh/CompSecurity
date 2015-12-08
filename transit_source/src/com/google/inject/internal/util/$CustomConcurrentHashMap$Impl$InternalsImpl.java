// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.io.Serializable;

// Referenced classes of package com.google.inject.internal.util:
//            $CustomConcurrentHashMap

class this._cls0
    implements this._cls0, Serializable
{

    static final long serialVersionUID = 0L;
    final Entry this$0;

    public Object getEntry(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("key");
        } else
        {
            int i = _mth0(obj);
            return _mth0(i).ry(obj, i);
        }
    }

    public boolean removeEntry(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("entry");
        } else
        {
            int i = ry.ry(obj);
            return ry(i).Entry(obj, i);
        }
    }

    public boolean removeEntry(Object obj, Object obj1)
    {
        if (obj == null)
        {
            throw new NullPointerException("entry");
        } else
        {
            int i = Entry.Entry(obj);
            return Entry(i).Entry(obj, i, obj1);
        }
    }

    Q()
    {
        this$0 = this._cls0.this;
        super();
    }
}
