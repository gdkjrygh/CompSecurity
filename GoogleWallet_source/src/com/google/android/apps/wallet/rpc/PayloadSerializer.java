// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import com.google.common.base.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

// Referenced classes of package com.google.android.apps.wallet.rpc:
//            RpcException

public interface PayloadSerializer
{

    public abstract RpcException getBadResponseRpcException(int i, HttpURLConnection httpurlconnection, Optional optional)
        throws IOException;

    public abstract Object getResponsePayload(InputStream inputstream, Object obj)
        throws IOException;
}
