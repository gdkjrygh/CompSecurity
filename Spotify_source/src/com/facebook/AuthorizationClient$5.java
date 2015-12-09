// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import aov;
import java.util.ArrayList;

// Referenced classes of package com.facebook:
//            AuthorizationClient, AccessToken

final class d
    implements aov
{

    private ArrayList a;
    private sult b;
    private ArrayList c;
    private ArrayList d;
    private AuthorizationClient e;

    public final void a()
    {
        Object obj;
        if (a.size() != 2 || a.get(0) == null || a.get(1) == null || !((String)a.get(0)).equals(a.get(1)))
        {
            break MISSING_BLOCK_LABEL_105;
        }
        obj = AccessToken.a(b.token, c, d);
        obj = sult.a(e.pendingRequest, ((AccessToken) (obj)));
_L1:
        e.b(((sult) (obj)));
        AuthorizationClient.a(e);
        return;
        obj = sult.a(e.pendingRequest, "User logged in as different Facebook user.", null);
          goto _L1
        Object obj1;
        obj1;
        e.b(sult.a(e.pendingRequest, "Caught exception", ((Exception) (obj1)).getMessage()));
        AuthorizationClient.a(e);
        return;
        obj1;
        AuthorizationClient.a(e);
        throw obj1;
    }

    sult(AuthorizationClient authorizationclient, ArrayList arraylist, sult sult, ArrayList arraylist1, ArrayList arraylist2)
    {
        e = authorizationclient;
        a = arraylist;
        b = sult;
        c = arraylist1;
        d = arraylist2;
        super();
    }
}
