// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import com.google.common.base.Function;

// Referenced classes of package com.google.android.apps.wallet.wobs.caching:
//            WobDatastore

final class this._cls0
    implements Function
{

    final WobDatastore this$0;

    private static String apply(String s)
    {
        return (new StringBuilder(String.valueOf(s).length() + 2)).append("'").append(s).append("'").toString();
    }

    public final volatile Object apply(Object obj)
    {
        return apply((String)obj);
    }

    ()
    {
        this$0 = WobDatastore.this;
        super();
    }
}
