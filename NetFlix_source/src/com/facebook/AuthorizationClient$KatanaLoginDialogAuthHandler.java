// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package com.facebook:
//            AuthorizationClient, AccessTokenSource, AccessToken, NativeProtocol, 
//            SessionDefaultAudience

class this._cls0 extends this._cls0
{

    private static final long serialVersionUID = 1L;
    final AuthorizationClient this$0;

    private this._cls0 handleResultOk(Intent intent)
    {
        Object obj = null;
        Bundle bundle = intent.getExtras();
        String s = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        if (s == null)
        {
            intent = com.facebook.this._mth0(AccessToken.createFromNativeLogin(bundle, AccessTokenSource.FACEBOOK_APPLICATION_NATIVE));
        } else
        {
            intent = obj;
            if (!"ServiceDisabled".equals(s))
            {
                if ("UserCanceled".equals(s))
                {
                    return com.facebook.this._mth0(null);
                } else
                {
                    return com.facebook.this._mth0(s, bundle.getString("error_description"));
                }
            }
        }
        return intent;
    }

    boolean onActivityResult(int i, int j, Intent intent)
    {
        if (intent == null)
        {
            intent = com.facebook.this._mth0("Operation canceled");
        } else
        if (NativeProtocol.isServiceDisabledResult20121101(intent))
        {
            intent = null;
        } else
        if (j == 0)
        {
            intent = com.facebook.this._mth0(intent.getStringExtra("com.facebook.platform.status.ERROR_DESCRIPTION"));
        } else
        if (j != -1)
        {
            intent = com.facebook.this._mth0("Unexpected resultCode from authorization.", null);
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
        return tryIntent(NativeProtocol.createLoginDialog20121101Intent(context, handleresultok.cationId(), new ArrayList(handleresultok.ssions()), handleresultok.ltAudience().getNativeProtocolAudience()), handleresultok.stCode());
    }

    ()
    {
        this$0 = AuthorizationClient.this;
        super(AuthorizationClient.this);
    }
}
