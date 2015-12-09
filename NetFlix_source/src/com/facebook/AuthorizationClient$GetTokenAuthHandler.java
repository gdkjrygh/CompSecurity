// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook:
//            AuthorizationClient, GetTokenClient, AccessTokenSource, AccessToken

class this._cls0 extends this._cls0
{

    private static final long serialVersionUID = 1L;
    private transient GetTokenClient getTokenClient;
    final AuthorizationClient this$0;

    void cancel()
    {
        if (getTokenClient != null)
        {
            getTokenClient.cancel();
            getTokenClient = null;
        }
    }

    void getTokenCompleted( , Bundle bundle)
    {
        getTokenClient = null;
        AuthorizationClient.access$000(AuthorizationClient.this);
        if (bundle != null)
        {
            ArrayList arraylist = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Object obj = .getPermissions();
            if (arraylist != null && (obj == null || arraylist.containsAll(((java.util.Collection) (obj)))))
            {
                 = sult(AccessToken.createFromNativeLogin(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE));
                completeAndValidate();
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
            .setPermissions(bundle);
        }
        tryNextHandler();
    }

    boolean tryAuthorize(final  request)
    {
        getTokenClient = new GetTokenClient(context, request.getApplicationId());
        if (!getTokenClient.start())
        {
            return false;
        } else
        {
            AuthorizationClient.access$100(AuthorizationClient.this);
            request = new GetTokenClient.CompletedListener() {

                final AuthorizationClient.GetTokenAuthHandler this$1;
                final AuthorizationClient.AuthorizationRequest val$request;

                public void completed(Bundle bundle)
                {
                    getTokenCompleted(request, bundle);
                }

            
            {
                this$1 = AuthorizationClient.GetTokenAuthHandler.this;
                request = authorizationrequest;
                super();
            }
            };
            getTokenClient.setCompletedListener(request);
            return true;
        }
    }

    _cls1.val.request()
    {
        this$0 = AuthorizationClient.this;
        super(AuthorizationClient.this);
    }
}
