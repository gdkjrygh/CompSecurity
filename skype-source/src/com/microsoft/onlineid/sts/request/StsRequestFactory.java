// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.request;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.microsoft.onlineid.internal.d;
import com.microsoft.onlineid.internal.e;
import com.microsoft.onlineid.internal.k;
import com.microsoft.onlineid.internal.l;
import com.microsoft.onlineid.internal.transport.TransportFactory;
import com.microsoft.onlineid.sts.b;
import com.microsoft.onlineid.sts.c;
import com.microsoft.onlineid.sts.h;
import com.microsoft.onlineid.sts.i;
import com.microsoft.onlineid.sts.n;
import com.microsoft.onlineid.sts.t;

// Referenced classes of package com.microsoft.onlineid.sts.request:
//            d, e, h, b, 
//            f

public class StsRequestFactory
{

    protected final Context _applicationContext;
    private final c _clockSkewManager;

    public StsRequestFactory(Context context)
    {
        _applicationContext = context;
        _clockSkewManager = new c(context);
    }

    public StsRequestFactory(Context context, c c1)
    {
        _applicationContext = context;
        _clockSkewManager = c1;
    }

    private String buildTelemetry()
    {
        String s = _applicationContext.getPackageManager().getInstallerPackageName(_applicationContext.getPackageName());
        if (TextUtils.isEmpty(s))
        {
            return "";
        } else
        {
            return (new StringBuilder("PackageMarket=")).append(s).toString();
        }
    }

    public com.microsoft.onlineid.sts.request.d createDeviceAuthRequest(i j)
    {
        com.microsoft.onlineid.sts.request.d d1 = new com.microsoft.onlineid.sts.request.d();
        initializeRequest(d1);
        d1.a(j.a());
        return d1;
    }

    public com.microsoft.onlineid.sts.request.e createDeviceProvisionRequest(h h1)
    {
        com.microsoft.onlineid.sts.request.e e1 = new com.microsoft.onlineid.sts.request.e();
        initializeRequest(e1);
        e1.a(h1);
        return e1;
    }

    public com.microsoft.onlineid.sts.request.h createServiceRequest(b b1, i j, com.microsoft.onlineid.d d1, String s, String s1)
    {
        return createServiceRequest(b1, j, d1, s, s1, false);
    }

    public com.microsoft.onlineid.sts.request.h createServiceRequest(b b1, i j, com.microsoft.onlineid.d d1, String s, String s1, boolean flag)
    {
        k.a(b1, "userAccount");
        k.a(j, "deviceIdentity");
        k.a(d1, "scope");
        com.microsoft.onlineid.sts.request.h h1 = new com.microsoft.onlineid.sts.request.h();
        initializeRequest(h1);
        h1.a(flag);
        h1.a(b1.e());
        h1.b(j.c());
        h1.a(d1);
        h1.a(s1);
        h1.b(d.a(_applicationContext, s));
        h1.c(buildTelemetry());
        return h1;
    }

    public com.microsoft.onlineid.sts.request.h createServiceRequest(b b1, i j, String s, com.microsoft.onlineid.d d1)
    {
        return createServiceRequest(b1, j, d1, s, null);
    }

    protected n getConfig()
    {
        return new n(_applicationContext);
    }

    protected void initializeRequest(com.microsoft.onlineid.sts.request.b b1)
    {
        n n1 = getConfig();
        com.microsoft.onlineid.sts.n.b b2 = b1.b();
        boolean flag;
        if (b2 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e.a(flag);
        b1.a(n1.a(b2));
        b1.a(new TransportFactory(_applicationContext));
        b1.a(_clockSkewManager);
        b1.a(l.a(_applicationContext));
        if (b1 instanceof f)
        {
            ((f)b1).a(new t());
        }
    }
}
