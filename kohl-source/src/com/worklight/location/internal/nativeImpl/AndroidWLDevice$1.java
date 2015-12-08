// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.nativeImpl;

import android.content.Context;
import com.worklight.common.WLConfig;
import com.worklight.location.internal.events.server.IWLRequestFactory;
import com.worklight.wlclient.WLRequest;
import com.worklight.wlclient.WLRequestListener;
import com.worklight.wlclient.api.WLRequestOptions;

// Referenced classes of package com.worklight.location.internal.nativeImpl:
//            AndroidWLDevice

static final class val.context
    implements IWLRequestFactory
{

    final Context val$context;

    public WLRequest createWLRequest(WLRequestListener wlrequestlistener, WLRequestOptions wlrequestoptions)
    {
        if (wlrequestlistener == null)
        {
            throw new IllegalArgumentException("listener is null");
        }
        if (wlrequestoptions == null)
        {
            throw new IllegalArgumentException("options is null");
        } else
        {
            return new WLRequest(wlrequestlistener, wlrequestoptions, WLConfig.getInstance(), val$context);
        }
    }

    ry(Context context1)
    {
        val$context = context1;
        super();
    }
}
