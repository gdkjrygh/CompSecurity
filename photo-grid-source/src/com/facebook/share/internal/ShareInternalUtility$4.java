// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.share.model.SharePhoto;
import java.util.UUID;

// Referenced classes of package com.facebook.share.internal:
//            ShareInternalUtility

final class val.appCallId
    implements com.facebook.internal.ity._cls4
{

    final UUID val$appCallId;

    public final com.facebook.internal.Store.Attachment apply(SharePhoto sharephoto)
    {
        return ShareInternalUtility.access$300(val$appCallId, sharephoto);
    }

    public final volatile Object apply(Object obj)
    {
        return apply((SharePhoto)obj);
    }

    Attachment()
    {
        val$appCallId = uuid;
        super();
    }
}
