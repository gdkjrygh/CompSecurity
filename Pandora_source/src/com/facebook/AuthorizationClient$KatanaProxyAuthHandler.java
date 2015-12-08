// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import java.util.Collection;

// Referenced classes of package com.facebook:
//            AuthorizationClient, AccessTokenSource, AccessToken

class > extends >
{

    private static final long serialVersionUID = 1L;
    private String applicationId;
    final AuthorizationClient this$0;

    private > handleResultOk(Intent intent)
    {
        Bundle bundle = intent.getExtras();
        String s = bundle.getString("error");
        intent = s;
        if (s == null)
        {
            intent = bundle.getString("error_type");
        }
        String s2 = bundle.getString("error_code");
        String s1 = bundle.getString("error_message");
        s = s1;
        if (s1 == null)
        {
            s = bundle.getString("error_description");
        }
        s1 = bundle.getString("e2e");
        if (!Utility.isNullOrEmpty(s1))
        {
            AuthorizationClient.access$200(AuthorizationClient.this, applicationId, s1);
        }
        if (intent == null && s2 == null && s == null)
        {
            intent = AccessToken.createFromWebBundle(pendingRequest.tPermissions(), bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB);
            return t(pendingRequest, intent);
        }
        if (ServerProtocol.errorsProxyAuthDisabled.contains(intent))
        {
            return null;
        }
        if (ServerProtocol.errorsUserCanceled.contains(intent))
        {
            return lt(pendingRequest, null);
        } else
        {
            return t(pendingRequest, intent, s, s2);
        }
    }

    String getNameForLogging()
    {
        return "katana_proxy_auth";
    }

    boolean onActivityResult(int i, int j, Intent intent)
    {
        if (intent == null)
        {
            intent = lt(pendingRequest, "Operation canceled");
        } else
        if (j == 0)
        {
            intent = lt(pendingRequest, intent.getStringExtra("error"));
        } else
        if (j != -1)
        {
            intent = t(pendingRequest, "Unexpected resultCode from authorization.", null);
        } else
        {
            intent = handleResultOk(intent);
        }
        if (intent != null)
        {
            completeAndValidate(intent);
        } else
        {
            tryNextHandler();
        }
        return true;
    }

    boolean tryAuthorize(handleResultOk handleresultok)
    {
        applicationId = handleresultok.tApplicationId();
        String s = AuthorizationClient.access$100();
        Intent intent = NativeProtocol.createProxyAuthIntent(context, handleresultok.tApplicationId(), handleresultok.tPermissions(), s, handleresultok.Rerequest(), handleresultok.tDefaultAudience());
        addLoggingExtra("e2e", s);
        return tryIntent(intent, handleresultok.tRequestCode());
    }

    ()
    {
        this$0 = AuthorizationClient.this;
        super(AuthorizationClient.this);
    }
}
