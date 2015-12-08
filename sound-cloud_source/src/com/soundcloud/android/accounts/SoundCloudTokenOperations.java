// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import com.soundcloud.android.api.oauth.Token;

class SoundCloudTokenOperations
{
    private static final class TokenDataKeys extends Enum
    {

        private static final TokenDataKeys $VALUES[];
        public static final TokenDataKeys ACCESS_TOKEN;
        public static final TokenDataKeys EXPIRES_IN;
        public static final TokenDataKeys REFRESH_TOKEN;
        public static final TokenDataKeys SCOPE;
        private String key;

        public static TokenDataKeys valueOf(String s)
        {
            return (TokenDataKeys)Enum.valueOf(com/soundcloud/android/accounts/SoundCloudTokenOperations$TokenDataKeys, s);
        }

        public static TokenDataKeys[] values()
        {
            return (TokenDataKeys[])$VALUES.clone();
        }

        public final String key()
        {
            return key;
        }

        static 
        {
            ACCESS_TOKEN = new TokenDataKeys("ACCESS_TOKEN", 0, "access_token");
            REFRESH_TOKEN = new TokenDataKeys("REFRESH_TOKEN", 1, "refresh_token");
            SCOPE = new TokenDataKeys("SCOPE", 2, "scope");
            EXPIRES_IN = new TokenDataKeys("EXPIRES_IN", 3, "expires_in");
            $VALUES = (new TokenDataKeys[] {
                ACCESS_TOKEN, REFRESH_TOKEN, SCOPE, EXPIRES_IN
            });
        }

        private TokenDataKeys(String s, int i, String s1)
        {
            super(s, i);
            key = s1;
        }
    }


    private final AccountManager accountManager;
    private Token token;

    public SoundCloudTokenOperations(AccountManager accountmanager)
    {
        token = Token.EMPTY;
        accountManager = accountmanager;
    }

    private String getAccessToken(Account account)
    {
        return accountManager.peekAuthToken(account, TokenDataKeys.ACCESS_TOKEN.key());
    }

    private String getRefreshToken(Account account)
    {
        return accountManager.peekAuthToken(account, TokenDataKeys.REFRESH_TOKEN.key());
    }

    private String getScope(Account account)
    {
        return accountManager.getUserData(account, TokenDataKeys.SCOPE.key());
    }

    public Token getTokenFromAccount(Account account)
    {
        if (token == Token.EMPTY && account != null)
        {
            token = new Token(getAccessToken(account), getRefreshToken(account), getScope(account));
        }
        return token;
    }

    public void invalidateToken(Token token1, Account account)
    {
        if (account != null)
        {
            accountManager.invalidateAuthToken(account.type, token1.getAccessToken());
            accountManager.invalidateAuthToken(account.type, token1.getRefreshToken());
            accountManager.setUserData(account, TokenDataKeys.EXPIRES_IN.key(), null);
            accountManager.setUserData(account, TokenDataKeys.SCOPE.key(), null);
            token = Token.EMPTY;
        }
    }

    public void resetToken()
    {
        token = Token.EMPTY;
    }

    public void setToken(Token token1)
    {
        token = token1;
    }

    public void storeSoundCloudTokenData(Account account, Token token1)
    {
        if (account != null)
        {
            accountManager.setUserData(account, TokenDataKeys.EXPIRES_IN.key(), Long.toString(token1.getExpiresAt()));
            accountManager.setUserData(account, TokenDataKeys.SCOPE.key(), token1.getScope());
            accountManager.setAuthToken(account, TokenDataKeys.ACCESS_TOKEN.key(), token1.getAccessToken());
            accountManager.setAuthToken(account, TokenDataKeys.REFRESH_TOKEN.key(), token1.getRefreshToken());
        }
    }
}
