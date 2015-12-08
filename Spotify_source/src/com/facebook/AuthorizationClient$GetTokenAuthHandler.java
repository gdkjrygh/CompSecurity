// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Bundle;
import android.text.TextUtils;
import aoi;
import ari;
import arj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook:
//            AuthorizationClient, AccessTokenSource, AccessToken

class this._cls0 extends this._cls0
{

    private static final long serialVersionUID = 1L;
    private transient aoi a;
    final AuthorizationClient this$0;

    final String a()
    {
        return "get_token";
    }

    final void a( , Bundle bundle)
    {
        a = null;
        AuthorizationClient.a(AuthorizationClient.this);
        if (bundle != null)
        {
            ArrayList arraylist = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Object obj = .permissions;
            if (arraylist != null && (obj == null || arraylist.containsAll(((java.util.Collection) (obj)))))
            {
                 = AccessToken.a(bundle, AccessTokenSource.d);
                 = com.facebook..permissions(pendingRequest, );
                AuthorizationClient.this.a();
                return;
            }
            bundle = new ArrayList();
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                String s = (String)((Iterator) (obj)).next();
                if (!arraylist.contains(s))
                {
                    bundle.add(s);
                }
            } while (true);
            if (!bundle.isEmpty())
            {
                a("new_permissions", TextUtils.join(",", bundle));
            }
            .permissions = bundle;
        }
        AuthorizationClient.this.a();
    }

    final boolean a( )
    {
        a = new aoi(AuthorizationClient.this.a, .applicationId);
        if (!a.a())
        {
            return false;
        } else
        {
            AuthorizationClient.b(AuthorizationClient.this);
             = new arj() {

                private AuthorizationClient.AuthorizationRequest a;
                private AuthorizationClient.GetTokenAuthHandler b;

                public final void a(Bundle bundle)
                {
                    b.a(a, bundle);
                }

            
            {
                b = AuthorizationClient.GetTokenAuthHandler.this;
                a = authorizationrequest;
                super();
            }
            };
            a.b = ;
            return true;
        }
    }

    final boolean b()
    {
        return a == null;
    }

    final void d()
    {
        if (a != null)
        {
            a.c = false;
            a = null;
        }
    }

    _cls1.a()
    {
        this$0 = AuthorizationClient.this;
        super(AuthorizationClient.this);
    }
}
