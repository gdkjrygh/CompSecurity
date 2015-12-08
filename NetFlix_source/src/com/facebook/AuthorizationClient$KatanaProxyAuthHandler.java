// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.ServerProtocol;
import java.util.Collection;

// Referenced classes of package com.facebook:
//            AuthorizationClient, AccessTokenSource, AccessToken, NativeProtocol

class > extends >
{

    private static final long serialVersionUID = 1L;
    final AuthorizationClient this$0;

    private > handleResultOk(Intent intent)
    {
        > > = null;
        Bundle bundle = intent.getExtras();
        String s = bundle.getString("error");
        intent = s;
        if (s == null)
        {
            intent = bundle.getString("error_type");
        }
        if (intent == null)
        {
            > = t(AccessToken.createFromWebBundle(pendingRequest.tPermissions(), bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB));
        } else
        if (!ServerProtocol.errorsProxyAuthDisabled.contains(intent))
        {
            if (ServerProtocol.errorsUserCanceled.contains(intent))
            {
                return lt(null);
            } else
            {
                return t(intent, bundle.getString("error_description"));
            }
        }
        return >;
    }

    boolean onActivityResult(int i, int j, Intent intent)
    {
        if (intent == null)
        {
            intent = lt("Operation canceled");
        } else
        if (j == 0)
        {
            intent = lt(intent.getStringExtra("error"));
        } else
        if (j != -1)
        {
            intent = t("Unexpected resultCode from authorization.", null);
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
        return tryIntent(NativeProtocol.createProxyAuthIntent(context, handleresultok.tApplicationId(), handleresultok.tPermissions()), handleresultok.tRequestCode());
    }

    ()
    {
        this$0 = AuthorizationClient.this;
        super(AuthorizationClient.this);
    }
}
