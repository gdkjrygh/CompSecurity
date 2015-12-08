// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.net.Uri;
import com.google.common.base.Predicate;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            ProtoWoblHolder

final class this._cls0
    implements Predicate
{

    final ProtoWoblHolder this$0;

    private static boolean apply(Uri uri)
    {
        return uri != null && "comgooglewallet".equals(uri.getScheme());
    }

    public final volatile boolean apply(Object obj)
    {
        return apply((Uri)obj);
    }

    ()
    {
        this$0 = ProtoWoblHolder.this;
        super();
    }
}
