// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import com.google.common.base.Function;
import java.net.URI;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            ProtoWoblRenderUtils

final class 
    implements Function
{

    private static URI apply(com.google.wallet.proto. )
    {
        return URI.create(.tapUri);
    }

    public final volatile Object apply(Object obj)
    {
        return apply((com.google.wallet.proto.)obj);
    }

    ()
    {
    }
}
