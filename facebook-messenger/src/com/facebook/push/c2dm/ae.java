// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.push.c2dm:
//            UnregisterPushTokenParams

public class ae
    implements f
{

    public ae()
    {
    }

    public n a(UnregisterPushTokenParams unregisterpushtokenparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("token", unregisterpushtokenparams.a()));
        return new n("unregisterPush", "POST", "method/user.unregisterPushCallback", arraylist, t.STRING);
    }

    public volatile n a(Object obj)
    {
        return a((UnregisterPushTokenParams)obj);
    }

    public Boolean a(UnregisterPushTokenParams unregisterpushtokenparams, r r1)
    {
        return Boolean.valueOf("true".equals(r1.b()));
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((UnregisterPushTokenParams)obj, r1);
    }
}
