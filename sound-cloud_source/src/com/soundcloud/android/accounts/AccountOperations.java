// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.a;
import com.google.android.gms.auth.b;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.legacy.model.ScModelManager;
import com.soundcloud.android.api.oauth.Token;
import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.onboarding.auth.SignupVia;
import com.soundcloud.android.playback.PlaybackService;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.storage.LegacyUserStorage;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.Lazy;
import java.io.IOException;
import rx.R;

// Referenced classes of package com.soundcloud.android.accounts:
//            SoundCloudTokenOperations, AccountRemovalFunction

public class AccountOperations
{
    public static final class AccountInfoKeys extends Enum
    {

        private static final AccountInfoKeys $VALUES[];
        public static final AccountInfoKeys SIGNUP;
        public static final AccountInfoKeys USERNAME;
        public static final AccountInfoKeys USER_ID;
        public static final AccountInfoKeys USER_PERMALINK;
        private final String key;

        public static AccountInfoKeys valueOf(String s)
        {
            return (AccountInfoKeys)Enum.valueOf(com/soundcloud/android/accounts/AccountOperations$AccountInfoKeys, s);
        }

        public static AccountInfoKeys[] values()
        {
            return (AccountInfoKeys[])$VALUES.clone();
        }

        public final String getKey()
        {
            return key;
        }

        static 
        {
            USERNAME = new AccountInfoKeys("USERNAME", 0, "currentUsername");
            USER_ID = new AccountInfoKeys("USER_ID", 1, "currentUserId");
            USER_PERMALINK = new AccountInfoKeys("USER_PERMALINK", 2, "currentUserPermalink");
            SIGNUP = new AccountInfoKeys("SIGNUP", 3, "signup");
            $VALUES = (new AccountInfoKeys[] {
                USERNAME, USER_ID, USER_PERMALINK, SIGNUP
            });
        }

        private AccountInfoKeys(String s, int i, String s1)
        {
            super(s, i);
            key = s1;
        }
    }


    public static final Urn ANONYMOUS_USER_URN = Urn.forUser(-1L);
    private static final String TOKEN_TYPE = "access_token";
    private final Lazy accountCleanupAction;
    private final AccountManager accountManager;
    private final Lazy clearTrackDownloadsCommand;
    private final Context context;
    private final EventBus eventBus;
    private volatile PublicApiUser loggedInUser;
    private volatile Urn loggedInUserUrn;
    private final ScModelManager modelManager;
    private final R scheduler;
    private final SoundCloudTokenOperations tokenOperations;
    private final LegacyUserStorage userStorage;

    AccountOperations(Context context1, AccountManager accountmanager, SoundCloudTokenOperations soundcloudtokenoperations, ScModelManager scmodelmanager, LegacyUserStorage legacyuserstorage, EventBus eventbus, Lazy lazy, 
            Lazy lazy1, R r)
    {
        context = context1;
        accountManager = accountmanager;
        tokenOperations = soundcloudtokenoperations;
        modelManager = scmodelmanager;
        userStorage = legacyuserstorage;
        eventBus = eventbus;
        accountCleanupAction = lazy;
        clearTrackDownloadsCommand = lazy1;
        scheduler = r;
    }

    private long getAccountDataLong(String s)
    {
        s = getAccountDataString(s);
        if (s == null)
        {
            return -1L;
        } else
        {
            return Long.parseLong(s);
        }
    }

    private String getAccountDataString(String s)
    {
        Account account = getSoundCloudAccount();
        if (account != null)
        {
            return accountManager.getUserData(account, s);
        } else
        {
            return null;
        }
    }

    private boolean isAnonymousUser()
    {
        return getLoggedInUserUrn().equals(ANONYMOUS_USER_URN);
    }

    private void resetPlaybackService()
    {
        Intent intent = new Intent(context, com/soundcloud/android/playback/PlaybackService);
        intent.setAction("com.soundcloud.android.playback.reset");
        context.startService(intent);
    }

    private void updateLoggedInUser(PublicApiUser publicapiuser)
    {
        if (publicapiuser != null)
        {
            loggedInUser = modelManager.cache(publicapiuser, com.soundcloud.android.api.legacy.model.PublicApiResource.CacheUpdateMode.FULL);
            loggedInUserUrn = publicapiuser.getUrn();
        }
    }

    public Account addOrReplaceSoundCloudAccount(PublicApiUser publicapiuser, Token token, SignupVia signupvia)
    {
        boolean flag1 = false;
        Account account = getSoundCloudAccount();
        boolean flag = flag1;
        if (account != null)
        {
            if (account.name.equals(publicapiuser.getPermalink()))
            {
                flag = true;
            } else
            {
                accountManager.removeAccount(account, null, null);
                flag = flag1;
            }
        }
        flag1 = flag;
        if (!flag)
        {
            account = new Account(publicapiuser.getPermalink(), context.getString(0x7f070239));
            flag1 = accountManager.addAccountExplicitly(account, null, null);
        }
        if (flag1)
        {
            tokenOperations.storeSoundCloudTokenData(account, token);
            accountManager.setUserData(account, AccountInfoKeys.USER_ID.getKey(), Long.toString(publicapiuser.getId()));
            accountManager.setUserData(account, AccountInfoKeys.USERNAME.getKey(), publicapiuser.getUsername());
            accountManager.setUserData(account, AccountInfoKeys.USER_PERMALINK.getKey(), publicapiuser.getPermalink());
            accountManager.setUserData(account, AccountInfoKeys.SIGNUP.getKey(), signupvia.getSignupIdentifier());
            updateLoggedInUser(publicapiuser);
            eventBus.publish(EventQueue.CURRENT_USER_CHANGED, CurrentUserChangedEvent.forUserUpdated(publicapiuser));
            return account;
        } else
        {
            return null;
        }
    }

    public void clearCrawler()
    {
        if (isCrawler())
        {
            clearLoggedInUser();
        }
    }

    public void clearLoggedInUser()
    {
        loggedInUser = null;
        loggedInUserUrn = null;
    }

    public boolean getAccountDataBoolean(String s)
    {
        s = getAccountDataString(s);
        return s != null && Boolean.parseBoolean(s);
    }

    public String getGoogleAccountToken(String s, String s1, Bundle bundle)
        throws a, IOException
    {
        return b.a(context, s, s1, bundle);
    }

    public PublicApiUser getLoggedInUser()
    {
        if (loggedInUser == null)
        {
            PublicApiUser publicapiuser = new PublicApiUser();
            publicapiuser.setId(getAccountDataLong(AccountInfoKeys.USER_ID.getKey()));
            publicapiuser.username = getAccountDataString(AccountInfoKeys.USERNAME.getKey());
            publicapiuser.permalink = getAccountDataString(AccountInfoKeys.USER_PERMALINK.getKey());
            return publicapiuser;
        } else
        {
            return loggedInUser;
        }
    }

    public long getLoggedInUserId()
    {
        if (loggedInUser == null)
        {
            return getAccountDataLong(AccountInfoKeys.USER_ID.getKey());
        } else
        {
            return loggedInUser.getId();
        }
    }

    public Urn getLoggedInUserUrn()
    {
        if (loggedInUserUrn == null)
        {
            loggedInUserUrn = Urn.forUser(getLoggedInUserId());
        }
        return loggedInUserUrn;
    }

    public Account getSoundCloudAccount()
    {
        Account aaccount[] = accountManager.getAccountsByType(context.getString(0x7f070239));
        if (aaccount != null && aaccount.length == 1)
        {
            return aaccount[0];
        } else
        {
            return null;
        }
    }

    public Token getSoundCloudToken()
    {
        return tokenOperations.getTokenFromAccount(getSoundCloudAccount());
    }

    public boolean hasValidToken()
    {
        return getSoundCloudToken().valid();
    }

    public void invalidateGoogleAccountToken(String s)
    {
        b.a(context, s);
    }

    public void invalidateSoundCloudToken(Token token)
    {
        tokenOperations.invalidateToken(token, getSoundCloudAccount());
    }

    public boolean isCrawler()
    {
        return loggedInUser != null && loggedInUser.isCrawler();
    }

    public boolean isLoggedInUser(Urn urn)
    {
        return urn.equals(getLoggedInUserUrn());
    }

    public boolean isUserLoggedIn()
    {
        return !isAnonymousUser() || isCrawler();
    }

    public void loadLoggedInUser()
    {
        long l = getAccountDataLong(AccountInfoKeys.USER_ID.getKey());
        if (l != -1L)
        {
            DefaultSubscriber.fireAndForget(userStorage.getUserAsync(l).doOnNext(new _cls1()));
        }
    }

    public void loginCrawlerUser()
    {
        Account account = new Account(PublicApiUser.CRAWLER_USER.getPermalink(), context.getString(0x7f070239));
        updateLoggedInUser(PublicApiUser.CRAWLER_USER);
        tokenOperations.storeSoundCloudTokenData(account, Token.EMPTY);
        eventBus.publish(EventQueue.CURRENT_USER_CHANGED, CurrentUserChangedEvent.forUserUpdated(PublicApiUser.CRAWLER_USER));
    }

    public rx.b logout()
    {
        Account account = getSoundCloudAccount();
        Preconditions.checkNotNull(account, "One does not simply remove something that does not exist");
        return rx.b.create(new AccountRemovalFunction(account, accountManager)).observeOn(rx.a.b.a.a()).subscribeOn(scheduler);
    }

    public rx.b purgeUserData()
    {
        return rx.b.create(new _cls2()).subscribeOn(scheduler);
    }

    public boolean setAccountData(String s, String s1)
    {
        Account account = getSoundCloudAccount();
        if (account != null)
        {
            accountManager.setUserData(account, s, s1);
            return true;
        } else
        {
            return false;
        }
    }

    public void storeSoundCloudTokenData(Token token)
    {
        tokenOperations.storeSoundCloudTokenData(getSoundCloudAccount(), token);
    }

    public void triggerLoginFlow(Activity activity)
    {
        accountManager.addAccount(context.getString(0x7f070239), "access_token", null, null, activity, null, null);
    }

    public void updateToken(Token token)
    {
        tokenOperations.setToken(token);
    }








    private class _cls1
        implements rx.b.b
    {

        final AccountOperations this$0;

        public void call(PublicApiUser publicapiuser)
        {
            updateLoggedInUser(publicapiuser);
        }

        public volatile void call(Object obj)
        {
            call((PublicApiUser)obj);
        }

        _cls1()
        {
            this$0 = AccountOperations.this;
            super();
        }
    }


    private class _cls2
        implements rx.b.f
    {

        final AccountOperations this$0;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            ((ClearTrackDownloadsCommand)clearTrackDownloadsCommand.a()).call(null);
            ((AccountCleanupAction)accountCleanupAction.a()).call();
            tokenOperations.resetToken();
            clearLoggedInUser();
            eventBus.publish(EventQueue.CURRENT_USER_CHANGED, CurrentUserChangedEvent.forLogout());
            resetPlaybackService();
            x.onCompleted();
        }

        _cls2()
        {
            this$0 = AccountOperations.this;
            super();
        }
    }

}
