// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.services.cognitoidentity;

import com.amazonaws.a;
import com.amazonaws.auth.x;
import com.amazonaws.d;
import com.amazonaws.f;
import com.amazonaws.g;
import com.amazonaws.http.e;
import com.amazonaws.http.o;
import com.amazonaws.http.s;
import com.amazonaws.internal.h;
import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest;
import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult;
import com.amazonaws.services.cognitoidentity.model.GetIdRequest;
import com.amazonaws.services.cognitoidentity.model.GetIdResult;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult;
import com.amazonaws.services.cognitoidentity.model.a.c;
import com.amazonaws.services.cognitoidentity.model.a.i;
import com.amazonaws.services.cognitoidentity.model.a.j;
import com.amazonaws.services.cognitoidentity.model.a.k;
import com.amazonaws.services.cognitoidentity.model.a.l;
import com.amazonaws.services.cognitoidentity.model.a.m;
import com.amazonaws.services.cognitoidentity.model.a.n;
import com.amazonaws.services.cognitoidentity.model.a.p;
import com.amazonaws.util.AWSRequestMetrics;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.amazonaws.services.cognitoidentity:
//            a

public class b extends a
    implements com.amazonaws.services.cognitoidentity.a
{

    protected List g;
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
        super(b(d1), f1);
        h = h1;
        l();
    }

    public b(com.amazonaws.auth.h h1, d d1, com.amazonaws.metrics.g g1)
    {
        super(b(d1), g1);
        h = h1;
        l();
    }

    public b(d d1)
    {
        this(((com.amazonaws.auth.h) (new x())), d1);
    }

    private g a(f f1, com.amazonaws.http.m m1, e e1)
    {
        Object obj1;
        f1.a(b);
        f1.a(f);
        obj1 = e1.c();
        ((AWSRequestMetrics) (obj1)).a(com.amazonaws.util.AWSRequestMetrics.Field.e);
        Object obj = h.a();
        ((AWSRequestMetrics) (obj1)).b(com.amazonaws.util.AWSRequestMetrics.Field.e);
        com.amazonaws.b b1 = f1.a();
        obj1 = obj;
        if (b1 != null)
        {
            obj1 = obj;
            if (b1.b() != null)
            {
                obj1 = b1.b();
            }
        }
        e1.a(((com.amazonaws.auth.g) (obj1)));
        obj = new o(g);
        return d.a(f1, m1, ((com.amazonaws.http.m) (obj)), e1);
        f1;
        ((AWSRequestMetrics) (obj1)).b(com.amazonaws.util.AWSRequestMetrics.Field.e);
        throw f1;
    }

    private static d b(d d1)
    {
        return d1;
    }

    private void l()
    {
        g = new ArrayList();
        g.add(new i());
        g.add(new k());
        g.add(new n());
        g.add(new com.amazonaws.services.cognitoidentity.model.a.b());
        g.add(new j());
        g.add(new l());
        g.add(new m());
        g.add(new com.amazonaws.services.cognitoidentity.model.a.o());
        g.add(new p());
        g.add(new com.amazonaws.d.b());
        a("cognito-identity.us-east-1.amazonaws.com");
        com.amazonaws.b.d d1 = new com.amazonaws.b.d();
        e.addAll(d1.a("/com/amazonaws/services/cognitoidentity/request.handlers"));
        e.addAll(d1.b("/com/amazonaws/services/cognitoidentity/request.handler2s"));
    }

    public GetCredentialsForIdentityResult a(GetCredentialsForIdentityRequest getcredentialsforidentityrequest)
    {
        Object obj1;
        Object obj2;
        GetCredentialsForIdentityResult getcredentialsforidentityresult;
        AWSRequestMetrics awsrequestmetrics;
        obj1 = null;
        getcredentialsforidentityresult = null;
        obj2 = a(((com.amazonaws.b) (getcredentialsforidentityrequest)));
        awsrequestmetrics = ((e) (obj2)).c();
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.d);
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.i);
        obj1 = (new c()).a(getcredentialsforidentityrequest);
        ((f) (obj1)).a(awsrequestmetrics);
        Object obj;
        getcredentialsforidentityrequest = ((GetCredentialsForIdentityRequest) (obj1));
        obj = getcredentialsforidentityresult;
        awsrequestmetrics.b(com.amazonaws.util.AWSRequestMetrics.Field.i);
        getcredentialsforidentityrequest = ((GetCredentialsForIdentityRequest) (obj1));
        obj = getcredentialsforidentityresult;
        obj2 = a(((f) (obj1)), ((com.amazonaws.http.m) (new com.amazonaws.http.p(new com.amazonaws.services.cognitoidentity.model.a.d()))), ((e) (obj2)));
        getcredentialsforidentityrequest = ((GetCredentialsForIdentityRequest) (obj1));
        obj = obj2;
        getcredentialsforidentityresult = (GetCredentialsForIdentityResult)((g) (obj2)).a();
        a(awsrequestmetrics, ((f) (obj1)), ((g) (obj2)), true);
        return getcredentialsforidentityresult;
        Exception exception;
        exception;
        obj1 = null;
_L4:
        getcredentialsforidentityrequest = ((GetCredentialsForIdentityRequest) (obj1));
        obj = getcredentialsforidentityresult;
        awsrequestmetrics.b(com.amazonaws.util.AWSRequestMetrics.Field.i);
        getcredentialsforidentityrequest = ((GetCredentialsForIdentityRequest) (obj1));
        obj = getcredentialsforidentityresult;
        throw exception;
        exception;
        obj1 = obj;
        obj = getcredentialsforidentityrequest;
        getcredentialsforidentityrequest = exception;
_L2:
        a(awsrequestmetrics, ((f) (obj)), ((g) (obj1)), true);
        throw getcredentialsforidentityrequest;
        getcredentialsforidentityrequest;
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GetIdResult a(GetIdRequest getidrequest)
    {
        Object obj1;
        Object obj2;
        GetIdResult getidresult;
        AWSRequestMetrics awsrequestmetrics;
        obj1 = null;
        getidresult = null;
        obj2 = a(((com.amazonaws.b) (getidrequest)));
        awsrequestmetrics = ((e) (obj2)).c();
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.d);
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.i);
        obj1 = (new com.amazonaws.services.cognitoidentity.model.a.e()).a(getidrequest);
        ((f) (obj1)).a(awsrequestmetrics);
        Object obj;
        getidrequest = ((GetIdRequest) (obj1));
        obj = getidresult;
        awsrequestmetrics.b(com.amazonaws.util.AWSRequestMetrics.Field.i);
        getidrequest = ((GetIdRequest) (obj1));
        obj = getidresult;
        obj2 = a(((f) (obj1)), ((com.amazonaws.http.m) (new com.amazonaws.http.p(new com.amazonaws.services.cognitoidentity.model.a.f()))), ((e) (obj2)));
        getidrequest = ((GetIdRequest) (obj1));
        obj = obj2;
        getidresult = (GetIdResult)((g) (obj2)).a();
        a(awsrequestmetrics, ((f) (obj1)), ((g) (obj2)), true);
        return getidresult;
        Exception exception;
        exception;
        obj1 = null;
_L4:
        getidrequest = ((GetIdRequest) (obj1));
        obj = getidresult;
        awsrequestmetrics.b(com.amazonaws.util.AWSRequestMetrics.Field.i);
        getidrequest = ((GetIdRequest) (obj1));
        obj = getidresult;
        throw exception;
        exception;
        obj1 = obj;
        obj = getidrequest;
        getidrequest = exception;
_L2:
        a(awsrequestmetrics, ((f) (obj)), ((g) (obj1)), true);
        throw getidrequest;
        getidrequest;
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public GetOpenIdTokenResult a(GetOpenIdTokenRequest getopenidtokenrequest)
    {
        Object obj1;
        Object obj2;
        GetOpenIdTokenResult getopenidtokenresult;
        AWSRequestMetrics awsrequestmetrics;
        obj1 = null;
        getopenidtokenresult = null;
        obj2 = a(((com.amazonaws.b) (getopenidtokenrequest)));
        awsrequestmetrics = ((e) (obj2)).c();
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.d);
        awsrequestmetrics.a(com.amazonaws.util.AWSRequestMetrics.Field.i);
        obj1 = (new com.amazonaws.services.cognitoidentity.model.a.g()).a(getopenidtokenrequest);
        ((f) (obj1)).a(awsrequestmetrics);
        Object obj;
        getopenidtokenrequest = ((GetOpenIdTokenRequest) (obj1));
        obj = getopenidtokenresult;
        awsrequestmetrics.b(com.amazonaws.util.AWSRequestMetrics.Field.i);
        getopenidtokenrequest = ((GetOpenIdTokenRequest) (obj1));
        obj = getopenidtokenresult;
        obj2 = a(((f) (obj1)), ((com.amazonaws.http.m) (new com.amazonaws.http.p(new com.amazonaws.services.cognitoidentity.model.a.h()))), ((e) (obj2)));
        getopenidtokenrequest = ((GetOpenIdTokenRequest) (obj1));
        obj = obj2;
        getopenidtokenresult = (GetOpenIdTokenResult)((g) (obj2)).a();
        a(awsrequestmetrics, ((f) (obj1)), ((g) (obj2)), true);
        return getopenidtokenresult;
        Exception exception;
        exception;
        obj1 = null;
_L4:
        getopenidtokenrequest = ((GetOpenIdTokenRequest) (obj1));
        obj = getopenidtokenresult;
        awsrequestmetrics.b(com.amazonaws.util.AWSRequestMetrics.Field.i);
        getopenidtokenrequest = ((GetOpenIdTokenRequest) (obj1));
        obj = getopenidtokenresult;
        throw exception;
        exception;
        obj1 = obj;
        obj = getopenidtokenrequest;
        getopenidtokenrequest = exception;
_L2:
        a(awsrequestmetrics, ((f) (obj)), ((g) (obj1)), true);
        throw getopenidtokenrequest;
        getopenidtokenrequest;
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(String s1)
    {
        super.a(s1);
    }

    public void a(String s1, String s2, String s3)
        throws IllegalArgumentException
    {
        super.a(s1, s2, s3);
    }

    public com.amazonaws.h a_(com.amazonaws.b b1)
    {
        return d.a(b1);
    }
}
