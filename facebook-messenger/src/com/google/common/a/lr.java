// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.a:
//            dx, lq

class lr extends dx
{

    final java.util.Map.Entry a;
    final lq b;

    lr(lq lq, java.util.Map.Entry entry)
    {
        b = lq;
        a = entry;
        super();
    }

    protected java.util.Map.Entry a()
    {
        return a;
    }

    protected Object c()
    {
        return a();
    }

    public boolean equals(Object obj)
    {
        return a(obj);
    }

    public Object setValue(Object obj)
    {
        return super.setValue(Preconditions.checkNotNull(obj));
    }
}
