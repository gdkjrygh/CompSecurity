// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.net.NetworkInfo;
import com.facebook.auth.credentials.UserTokenCredentials;
import com.facebook.e.c;
import com.facebook.webrtc.IWebrtcConfigInterface;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            m

public class n
    implements IWebrtcConfigInterface
{

    private static final Class a = com/facebook/orca/fbwebrtc/n;
    private final a b;
    private final a c;
    private final a d;
    private final a e;
    private final m f;
    private final c g;

    public n(a a1, a a2, a a3, a a4, m m1, c c1)
    {
        b = a1;
        c = a2;
        d = a3;
        e = a4;
        f = m1;
        g = c1;
    }

    public String getConnectivityStatus()
    {
        NetworkInfo networkinfo = g.c();
        if (networkinfo == null || !networkinfo.isConnectedOrConnecting())
        {
            return "";
        }
        if (networkinfo.getType() == 0)
        {
            return "cell";
        } else
        {
            return networkinfo.getTypeName();
        }
    }

    public int getMinVersion()
    {
        return f.a();
    }

    public boolean isVoipAllowedOnCell()
    {
        return !((Boolean)c.b()).booleanValue();
    }

    public String newPeerConnectionConfig()
    {
        Object obj = (UserTokenCredentials)b.b();
        if (obj == null)
        {
            return "";
        }
        String s = ((UserTokenCredentials) (obj)).a();
        obj = ((UserTokenCredentials) (obj)).b();
        obj = (new StringBuilder()).append("api.facebook.com:443:").append(s).append(":").append(((String) (obj))).append(":");
        if (((Boolean)d.b()).booleanValue())
        {
            s = "1";
        } else
        {
            s = "0";
        }
        s = ((StringBuilder) (obj)).append(s).toString();
        return (new StringBuilder()).append("STUN ").append("stun.fbsbx.com:3478").append(",TURN ").append(s).toString();
    }

    public boolean shouldSendIceAfterAnswer()
    {
        return ((Boolean)e.b()).booleanValue();
    }

}
