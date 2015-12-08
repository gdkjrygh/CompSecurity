// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import android.os.Bundle;
import com.vungle.publisher.bv;
import com.vungle.publisher.cn;
import com.vungle.publisher.env.WrapperFramework;
import com.vungle.publisher.net.http.HttpRequest;

// Referenced classes of package com.vungle.publisher.protocol:
//            ProtocolHttpRequest

public static abstract class _cls9 extends com.vungle.publisher.net.http._cls9
{

    cn a;
    bv c;
    String d;
    protected WrapperFramework e;
    protected String f;
    private String g;

    protected ProtocolHttpRequest a()
    {
        ProtocolHttpRequest protocolhttprequest = (ProtocolHttpRequest)super._mth9();
        Bundle bundle = ((HttpRequest) (protocolhttprequest)).c;
        bundle.putString("X-VUNGLE-BUNDLE-ID", c.a());
        bundle.putString("X-VUNGLE-LANGUAGE", a.a());
        bundle.putString("X-VUNGLE-TIMEZONE", a.c());
        String s = g;
        Object obj = s;
        if (s == null)
        {
            obj = new StringBuilder("VungleDroid/3.3.3");
            WrapperFramework wrapperframework = e;
            String s1 = f;
            boolean flag;
            boolean flag1;
            if (wrapperframework != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (s1 != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag || flag1)
            {
                ((StringBuilder) (obj)).append(';');
                if (flag)
                {
                    ((StringBuilder) (obj)).append(wrapperframework);
                }
                if (flag1)
                {
                    ((StringBuilder) (obj)).append('/');
                    ((StringBuilder) (obj)).append(s1);
                }
            }
            obj = ((StringBuilder) (obj)).toString();
            g = ((String) (obj));
        }
        bundle.putString("User-Agent", ((String) (obj)));
        if (ProtocolHttpRequest.a(protocolhttprequest))
        {
            bundle.putLong("X-VUNG-DATE", System.currentTimeMillis());
        }
        return protocolhttprequest;
    }

    protected HttpRequest c()
    {
        return a();
    }

    protected _cls9()
    {
    }
}
