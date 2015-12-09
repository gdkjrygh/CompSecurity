// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import android.text.TextUtils;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.e.a;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;

// Referenced classes of package com.fitbit.serverinteraction:
//            ServerGateway, o

class a extends Authenticator
{

    final URL a;
    final ServerGateway b;

    protected PasswordAuthentication getPasswordAuthentication()
    {
        String s = a.getHost();
        if (b.a.a())
        {
            com.fitbit.e.a.a("ServerGateway", String.format("Requesting Host %s, Url host %s", new Object[] {
                getRequestingHost(), s
            }), new Object[0]);
        }
        if (TextUtils.equals(s, getRequestingHost()))
        {
            return new PasswordAuthentication(com.fitbit.serverinteraction.ServerGateway.a(b).l(), com.fitbit.serverinteraction.ServerGateway.a(b).m().toCharArray());
        } else
        {
            return null;
        }
    }

    (ServerGateway servergateway, URL url)
    {
        b = servergateway;
        a = url;
        super();
    }
}
