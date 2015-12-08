// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import com.digby.localpoint.sdk.core.ILPID;
import java.util.Locale;

// Referenced classes of package com.digby.localpoint.sdk.core.impl:
//            LPMessage

private class messageId
    implements ILPID
{

    private final long messageId;
    final LPMessage this$0;

    public String getValue()
    {
        return String.format(Locale.US, "%d", new Object[] {
            Long.valueOf(messageId)
        });
    }

    public (long l)
    {
        this$0 = LPMessage.this;
        super();
        messageId = l;
    }
}
