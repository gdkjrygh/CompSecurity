// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.e;

import com.roidapp.baselib.d.a;
import java.net.HttpURLConnection;

// Referenced classes of package com.roidapp.baselib.e:
//            g, s

public class r extends g
{

    public r(String s, s s1)
    {
        super(s, s1);
    }

    protected final Object a(HttpURLConnection httpurlconnection)
    {
        if (httpurlconnection != null)
        {
            return com.roidapp.baselib.d.a.a(httpurlconnection.getInputStream(), "UTF-8");
        } else
        {
            return null;
        }
    }
}
