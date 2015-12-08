// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Bundle;
import android.text.TextUtils;
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

    String getNameForLogging()
    {
        return "get_token";
    }

    void getTokenCompleted( , Bundle bundle)
    {
        getTokenClient = null;
        AuthorizationClient.access$3(AuthorizationClient.this);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        Object obj;
        arraylist = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        obj = .getPermissions();
        if (arraylist != null && (obj == null || arraylist.containsAll(((java.util.Collection) (obj)))))
        {
             = AccessToken.createFromNativeLogin(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE);
             = sult(pendingRequest, );
            completeAndValidate();
            return;
        }
        bundle = new ArrayList();
        obj = ((List) (obj)).iterator();
_L6:
        if (((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        if (!bundle.isEmpty())
        {
            addLoggingExtra("new_permissions", TextUtils.join(",", bundle));
        }
        .setPermissions(bundle);
_L2:
        tryNextHandler();
        return;
_L4:
        String s = (String)((Iterator) (obj)).next();
        if (!arraylist.contains(s))
        {
            bundle.add(s);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    boolean needsRestart()
    {
        return getTokenClient == null;
    }

    boolean tryAuthorize(final  request)
    {
        getTokenClient = new GetTokenClient(context, request.getApplicationId());
        if (!getTokenClient.start())
        {
            return false;
        } else
        {
            AuthorizationClient.access$2(AuthorizationClient.this);
            request = new com.facebook.internal.PlatformServiceClient.CompletedListener() {

                final AuthorizationClient.GetTokenAuthHandler this$1;
                private final AuthorizationClient.AuthorizationRequest val$request;

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
