// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.http;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

// Referenced classes of package twitter4j.internal.http:
//            HttpClientImpl, HttpClientConfiguration

class this._cls0 extends Authenticator
{

    final HttpClientImpl this$0;

    protected PasswordAuthentication getPasswordAuthentication()
    {
        if (getRequestorType().equals(java.net.uestorType.PROXY))
        {
            return new PasswordAuthentication(CONF.getHttpProxyUser(), CONF.getHttpProxyPassword().toCharArray());
        } else
        {
            return null;
        }
    }

    ration()
    {
        this$0 = HttpClientImpl.this;
        super();
    }
}
