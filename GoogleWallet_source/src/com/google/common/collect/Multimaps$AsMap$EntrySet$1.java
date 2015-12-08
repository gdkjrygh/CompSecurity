// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Collection;

// Referenced classes of package com.google.common.collect:
//            Multimaps, Multimap

final class this._cls1
    implements Function
{

    final apply this$1;

    private Collection apply(Object obj)
    {
        return this._mth1(_fld0).get(obj);
    }

    public final volatile Object apply(Object obj)
    {
        return apply(obj);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
