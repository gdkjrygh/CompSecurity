// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Function;

// Referenced classes of package com.google.common.a:
//            iu

class iv
    implements Function
{

    final iu a;

    iv(iu iu)
    {
        a = iu;
        super();
    }

    public Object a(java.util.Map.Entry entry)
    {
        return entry.getValue();
    }

    public Object apply(Object obj)
    {
        return a((java.util.Map.Entry)obj);
    }
}
