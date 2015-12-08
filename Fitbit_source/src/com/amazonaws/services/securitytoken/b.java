// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.services.securitytoken;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.a;
import com.amazonaws.auth.x;
import com.amazonaws.d;
import com.amazonaws.d.k;
import com.amazonaws.f;
import com.amazonaws.http.e;
import com.amazonaws.http.r;
import com.amazonaws.http.s;
import com.amazonaws.internal.h;
import com.amazonaws.services.securitytoken.model.AssumeRoleRequest;
import com.amazonaws.services.securitytoken.model.AssumeRoleResult;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult;
import com.amazonaws.services.securitytoken.model.GetFederationTokenRequest;
import com.amazonaws.services.securitytoken.model.GetFederationTokenResult;
import com.amazonaws.services.securitytoken.model.GetSessionTokenRequest;
import com.amazonaws.services.securitytoken.model.GetSessionTokenResult;
import com.amazonaws.services.securitytoken.model.a.c;
import com.amazonaws.services.securitytoken.model.a.g;
import com.amazonaws.services.securitytoken.model.a.i;
import com.amazonaws.services.securitytoken.model.a.j;
import com.amazonaws.services.securitytoken.model.a.l;
import com.amazonaws.services.securitytoken.model.a.m;
import com.amazonaws.services.securitytoken.model.a.n;
import com.amazonaws.services.securitytoken.model.a.o;
import com.amazonaws.services.securitytoken.model.a.p;
import com.amazonaws.services.securitytoken.model.a.q;
import com.amazonaws.util.AWSRequestMetrics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.amazonaws.services.securitytoken:
//            a

public class b extends a
    implements com.amazonaws.services.securitytoken.a
{

    protected final List g;
    private com.amazonaws.auth.h h;

    public b()
    {
        this(((com.amazonaws.auth.h) (new x())), new d());
    }

    public b(com.amazonaws.auth.g g1)
    {
        this(g1, new d());
    }

    public b(com.amazonaws.auth.g g1, d d1)
    {
        this(((com.amazonaws.auth.h) (new h(g1))), d1);
    }

    public b(com.amazonaws.auth.h h1)
    {
        this(h1, new d());
    }

    public b(com.amazonaws.auth.h h1, d d1)
    {
        this(h1, d1, ((com.amazonaws.http.f) (new s(d1))));
    }

    public b(com.amazonaws.auth.h h1, d d1, com.amazonaws.http.f f1)
    {
        super(d1, f1);
        g = new ArrayList();
        h = h1;
        l();
    }

    public b(com.amazonaws.auth.h h1, d d1, com.amazonaws.metrics.g g1)
    {
        super(d1, g1);
        g = new ArrayList();
        h = h1;
        l();
    }

    public b(d d1)
    {
        this(((com.amazonaws.auth.h) (new x())), d1);
    }

    private com.amazonaws.g a(f f1, com.amazonaws.d.m m1, e e1)
    {
        f1.a(b);
        f1.a(f);
        com.amazonaws.b b1 = f1.a();
        java.util.Map.Entry entry;
        for (Iterator iterator = b1.c().entrySet().iterator(); iterator.hasNext(); f1.b((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        Object obj = h.a();
        if (b1.b() != null)
        {
            obj = b1.b();
        }
        e1.a(((com.amazonaws.auth.g) (obj)));
        m1 = new r(m1);
        obj = new com.amazonaws.http.d(g);
        return d.a(f1, m1, ((com.amazonaws.http.m) (obj)), e1);
    }

    private void l()
    {
        g.add(new g());
        g.add(new m());
        g.add(new p());
        g.add(new q());
        g.add(new n());
        g.add(new o());
        g.add(new k());
        a("sts.amazonaws.com");
        com.amazonaws.b.d d1 = new com.amazonaws.b.d();
        e.addAll(d1.a("/com/amazonaws/services/securitytoken/request.handlers"));
        e.addAll(d1.b("/com/amazonaws/services/securitytoken/request.handler2s"));
    }

    public AssumeRoleResult a(AssumeRoleRequest assumerolerequest)
    {
        Object obj;
        AssumeRoleResult assumeroleresult;
        AWSRequestMetrics awsrequestmetrics;
        e e1;
        assumeroleresult = null;
        obj = null;
        e1 = a(((com.amazonaws.b) (assumerolerequest)));
        awsrequestmetrics = e1.c();
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.d);
        f f1 = (new com.amazonaws.services.securitytoken.model.a.a()).a(assumerolerequest);
        assumerolerequest = assumeroleresult;
        f1.a(awsrequestmetrics);
        assumerolerequest = assumeroleresult;
        obj = a(f1, ((com.amazonaws.d.m) (new com.amazonaws.services.securitytoken.model.a.b())), e1);
        assumerolerequest = ((AssumeRoleRequest) (obj));
        assumeroleresult = (AssumeRoleResult)((com.amazonaws.g) (obj)).a();
        a(awsrequestmetrics, f1, ((com.amazonaws.g) (obj)));
        return assumeroleresult;
        Exception exception;
        exception;
        f1 = null;
        assumerolerequest = ((AssumeRoleRequest) (obj));
        obj = exception;
_L2:
        a(awsrequestmetrics, f1, ((com.amazonaws.g) (assumerolerequest)));
        throw obj;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public AssumeRoleWithWebIdentityResult a(AssumeRoleWithWebIdentityRequest assumerolewithwebidentityrequest)
    {
        Object obj;
        AssumeRoleWithWebIdentityResult assumerolewithwebidentityresult;
        AWSRequestMetrics awsrequestmetrics;
        e e1;
        assumerolewithwebidentityresult = null;
        obj = null;
        e1 = a(((com.amazonaws.b) (assumerolewithwebidentityrequest)));
        awsrequestmetrics = e1.c();
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.d);
        f f1 = (new c()).a(assumerolewithwebidentityrequest);
        assumerolewithwebidentityrequest = assumerolewithwebidentityresult;
        f1.a(awsrequestmetrics);
        assumerolewithwebidentityrequest = assumerolewithwebidentityresult;
        obj = a(f1, ((com.amazonaws.d.m) (new com.amazonaws.services.securitytoken.model.a.d())), e1);
        assumerolewithwebidentityrequest = ((AssumeRoleWithWebIdentityRequest) (obj));
        assumerolewithwebidentityresult = (AssumeRoleWithWebIdentityResult)((com.amazonaws.g) (obj)).a();
        a(awsrequestmetrics, f1, ((com.amazonaws.g) (obj)));
        return assumerolewithwebidentityresult;
        Exception exception;
        exception;
        f1 = null;
        assumerolewithwebidentityrequest = ((AssumeRoleWithWebIdentityRequest) (obj));
        obj = exception;
_L2:
        a(awsrequestmetrics, f1, ((com.amazonaws.g) (assumerolewithwebidentityrequest)));
        throw obj;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public GetFederationTokenResult a(GetFederationTokenRequest getfederationtokenrequest)
    {
        Object obj;
        GetFederationTokenResult getfederationtokenresult;
        AWSRequestMetrics awsrequestmetrics;
        e e1;
        getfederationtokenresult = null;
        obj = null;
        e1 = a(((com.amazonaws.b) (getfederationtokenrequest)));
        awsrequestmetrics = e1.c();
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.d);
        f f1 = (new i()).a(getfederationtokenrequest);
        getfederationtokenrequest = getfederationtokenresult;
        f1.a(awsrequestmetrics);
        getfederationtokenrequest = getfederationtokenresult;
        obj = a(f1, ((com.amazonaws.d.m) (new j())), e1);
        getfederationtokenrequest = ((GetFederationTokenRequest) (obj));
        getfederationtokenresult = (GetFederationTokenResult)((com.amazonaws.g) (obj)).a();
        a(awsrequestmetrics, f1, ((com.amazonaws.g) (obj)));
        return getfederationtokenresult;
        Exception exception;
        exception;
        f1 = null;
        getfederationtokenrequest = ((GetFederationTokenRequest) (obj));
        obj = exception;
_L2:
        a(awsrequestmetrics, f1, ((com.amazonaws.g) (getfederationtokenrequest)));
        throw obj;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public GetSessionTokenResult a()
        throws AmazonServiceException, AmazonClientException
    {
        return a(new GetSessionTokenRequest());
    }

    public GetSessionTokenResult a(GetSessionTokenRequest getsessiontokenrequest)
    {
        Object obj;
        GetSessionTokenResult getsessiontokenresult;
        AWSRequestMetrics awsrequestmetrics;
        e e1;
        getsessiontokenresult = null;
        obj = null;
        e1 = a(((com.amazonaws.b) (getsessiontokenrequest)));
        awsrequestmetrics = e1.c();
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.d);
        f f1 = (new com.amazonaws.services.securitytoken.model.a.k()).a(getsessiontokenrequest);
        getsessiontokenrequest = getsessiontokenresult;
        f1.a(awsrequestmetrics);
        getsessiontokenrequest = getsessiontokenresult;
        obj = a(f1, ((com.amazonaws.d.m) (new l())), e1);
        getsessiontokenrequest = ((GetSessionTokenRequest) (obj));
        getsessiontokenresult = (GetSessionTokenResult)((com.amazonaws.g) (obj)).a();
        a(awsrequestmetrics, f1, ((com.amazonaws.g) (obj)));
        return getsessiontokenresult;
        Exception exception;
        exception;
        f1 = null;
        getsessiontokenrequest = ((GetSessionTokenRequest) (obj));
        obj = exception;
_L2:
        a(awsrequestmetrics, f1, ((com.amazonaws.g) (getsessiontokenrequest)));
        throw obj;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public com.amazonaws.h c_(com.amazonaws.b b1)
    {
        return d.a(b1);
    }
}
