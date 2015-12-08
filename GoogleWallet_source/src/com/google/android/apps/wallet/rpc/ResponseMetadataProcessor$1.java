// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.common.base.Optional;

// Referenced classes of package com.google.android.apps.wallet.rpc:
//            ResponseMetadataProcessor

final class val.requestBeginTimeMillis
    implements Runnable
{

    final ResponseMetadataProcessor this$0;
    final long val$requestBeginTimeMillis;
    final Optional val$responseMetadataOptional;

    public final void run()
    {
        if (!ResponseMetadataProcessor.access$000(ResponseMetadataProcessor.this).getBoolean(AppControlKey.RESPONSE_METADATA_HANDLING))
        {
            return;
        }
        if (val$responseMetadataOptional.isPresent())
        {
            sponse sponse = new sponse((com.google.wallet.proto.Metadata)val$responseMetadataOptional.get(), val$requestBeginTimeMillis);
            ResponseMetadataProcessor.access$102(ResponseMetadataProcessor.this, Optional.of(sponse));
        } else
        {
            ResponseMetadataProcessor.access$102(ResponseMetadataProcessor.this, Optional.absent());
        }
        ResponseMetadataProcessor.access$200(ResponseMetadataProcessor.this);
    }

    sponse()
    {
        this$0 = final_responsemetadataprocessor;
        val$responseMetadataOptional = optional;
        val$requestBeginTimeMillis = J.this;
        super();
    }
}
