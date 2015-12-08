// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import com.google.common.base.Function;

// Referenced classes of package com.google.android.apps.wallet.rpc:
//            ResponseMetadataProcessor

final class this._cls0
    implements Function
{

    final ResponseMetadataProcessor this$0;

    private static Integer apply(com.google.wallet.proto.Metadata.RejectedRequestInfo rejectedrequestinfo)
    {
        return rejectedrequestinfo.reason;
    }

    public final volatile Object apply(Object obj)
    {
        return apply((com.google.wallet.proto.Metadata.RejectedRequestInfo)obj);
    }

    jectedRequestInfo()
    {
        this$0 = ResponseMetadataProcessor.this;
        super();
    }
}
