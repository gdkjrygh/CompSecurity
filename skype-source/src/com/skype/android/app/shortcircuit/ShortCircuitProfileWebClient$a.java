// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import com.skype.android.app.token.TokenRequestCallback;
import com.skype.android.concurrent.AsyncService;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.shortcircuit:
//            ShortCircuitProfileWebClient, ProfileServiceTokenRequest

private abstract class operationLogTag
    implements TokenRequestCallback, Runnable
{

    private final String operationLogTag;
    final ShortCircuitProfileWebClient this$0;

    public void onTokenRetrieved(com.skype.android.app.token.nt nt, String s)
    {
        if (s != null)
        {
            ShortCircuitProfileWebClient.access$1102(ShortCircuitProfileWebClient.this, ProfileServiceTokenRequest.getProfileServiceToken(nt, s));
            ShortCircuitProfileWebClient.access$1200(ShortCircuitProfileWebClient.this).a(this);
            return;
        } else
        {
            ShortCircuitProfileWebClient.access$500().severe(String.format("Operation %s did not complete successfully. Unable to retrieve Token", new Object[] {
                operationLogTag
            }));
            return;
        }
    }

    protected (String s)
    {
        this$0 = ShortCircuitProfileWebClient.this;
        super();
        operationLogTag = s;
    }
}
