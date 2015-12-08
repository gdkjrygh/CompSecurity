// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.api.client.util:
//            ArrayMap

final class this._cls0 extends AbstractSet
{

    final ArrayMap this$0;

    public Iterator iterator()
    {
        return new ator(ArrayMap.this);
    }

    public int size()
    {
        return ArrayMap.this.size;
    }

    ator()
    {
        this$0 = ArrayMap.this;
        super();
    }
}
