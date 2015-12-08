// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.order;

import com.dominos.android.sdk.common.StringHelper;
import com.google.a.a.ae;

// Referenced classes of package com.dominos.android.sdk.common.dom.order:
//            Address

class this._cls0
    implements ae
{

    final Address this$0;

    public volatile boolean apply(Object obj)
    {
        return apply((String)obj);
    }

    public boolean apply(String s)
    {
        return StringHelper.isNotEmpty(s);
    }

    ()
    {
        this$0 = Address.this;
        super();
    }
}
