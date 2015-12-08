// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.oauth.Token;

// Referenced classes of package com.soundcloud.android.api.legacy:
//            TokenListener

class SoundCloudTokenListener
    implements TokenListener
{

    private final AccountOperations accountOperations;

    public SoundCloudTokenListener(AccountOperations accountoperations)
    {
        accountOperations = accountoperations;
    }

    public Token onTokenInvalid(Token token)
    {
        Token token1;
        boolean flag;
        if (!accountOperations.isUserLoggedIn())
        {
            break MISSING_BLOCK_LABEL_38;
        }
        token1 = accountOperations.getSoundCloudToken();
        flag = token1.equals(token);
        if (!flag)
        {
            accountOperations.invalidateSoundCloudToken(token);
            return token1;
        }
        accountOperations.invalidateSoundCloudToken(token);
        return null;
        Exception exception;
        exception;
        accountOperations.invalidateSoundCloudToken(token);
        throw exception;
    }

    public void onTokenRefreshed(Token token)
    {
        if (accountOperations.isUserLoggedIn() && token.valid() && token.hasDefaultScope())
        {
            accountOperations.storeSoundCloudTokenData(token);
        }
    }
}
