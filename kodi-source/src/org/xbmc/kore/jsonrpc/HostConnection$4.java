// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc;

import android.text.TextUtils;
import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.Credentials;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;
import java.net.Proxy;
import org.xbmc.kore.host.HostInfo;

// Referenced classes of package org.xbmc.kore.jsonrpc:
//            HostConnection

class this._cls0
    implements Authenticator
{

    final HostConnection this$0;

    public Request authenticate(Proxy proxy, Response response)
        throws IOException
    {
        if (TextUtils.isEmpty(HostConnection.access$300(HostConnection.this).getUsername()))
        {
            return null;
        } else
        {
            proxy = Credentials.basic(HostConnection.access$300(HostConnection.this).getUsername(), HostConnection.access$300(HostConnection.this).getPassword());
            return response.request().newBuilder().eader("Authorization", proxy).uild();
        }
    }

    public Request authenticateProxy(Proxy proxy, Response response)
        throws IOException
    {
        return null;
    }

    ()
    {
        this$0 = HostConnection.this;
        super();
    }
}
