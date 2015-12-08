// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.text.TextUtils;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.CompletedAsyncResult;
import com.skype.android.util.HttpUtil;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveIdWebClient
{
    public static final class AvatarSize extends Enum
    {

        private static final AvatarSize $VALUES[];
        public static final AvatarSize UserTileMedium;
        public static final AvatarSize UserTileSmall;
        public static final AvatarSize UserTileStatic;
        public static final AvatarSize Win8Dynamic;
        public static final AvatarSize Win8Ready;
        public static final AvatarSize Win8Static;

        public static AvatarSize valueOf(String s)
        {
            return (AvatarSize)Enum.valueOf(com/skype/android/app/signin/LiveIdWebClient$AvatarSize, s);
        }

        public static AvatarSize[] values()
        {
            return (AvatarSize[])$VALUES.clone();
        }

        static 
        {
            UserTileSmall = new AvatarSize("UserTileSmall", 0);
            UserTileStatic = new AvatarSize("UserTileStatic", 1);
            UserTileMedium = new AvatarSize("UserTileMedium", 2);
            Win8Static = new AvatarSize("Win8Static", 3);
            Win8Ready = new AvatarSize("Win8Ready", 4);
            Win8Dynamic = new AvatarSize("Win8Dynamic", 5);
            $VALUES = (new AvatarSize[] {
                UserTileSmall, UserTileStatic, UserTileMedium, Win8Static, Win8Ready, Win8Dynamic
            });
        }

        private AvatarSize(String s, int i)
        {
            super(s, i);
        }
    }

    public static class ProfileInfo
    {

        private String cid;
        private String email;
        private String firstName;
        private String lastName;
        private String signinName;

        public String getCid()
        {
            return cid;
        }

        public String getEmail()
        {
            return email;
        }

        public String getFirstName()
        {
            return firstName;
        }

        public String getLastName()
        {
            return lastName;
        }

        public String getSigninName()
        {
            return signinName;
        }

        public String getVisibleContactInfo()
        {
            if (!TextUtils.isEmpty(getSigninName()))
            {
                return getSigninName();
            } else
            {
                return getEmail();
            }
        }

        ProfileInfo(JSONObject jsonobject)
        {
            try
            {
                cid = jsonobject.getString("cid");
                email = jsonobject.optString("email");
                signinName = jsonobject.optString("signinName");
                firstName = jsonobject.optString("firstName");
                lastName = jsonobject.optString("lastName");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new RuntimeException(jsonobject);
            }
        }
    }


    private static final String AVATAR_FILE = "avatar.jpg";
    private static final int BROWSER_CACHE_TIMEOUT_HOURS = 1;
    private static final String LIVE_STORAGE_AUTHORITY = "users.storage.live.com";
    private static final String SCHEME = "https";
    private static final String SKYPE_AUTHORITY = "api.skype.com";
    private static final String TEST_ENV_SKYPE_AUTHORITY = "qaapi.skype.net";
    private String accessToken;
    private final String authority;
    private ExecutorService executor;
    private HttpUtil httpUtil;
    private boolean shutdownExecutor;
    private String siteName;

    public LiveIdWebClient(String s, String s1, HttpUtil httputil)
    {
        this(s, s1, Executors.newSingleThreadExecutor(), httputil);
        shutdownExecutor = true;
    }

    public LiveIdWebClient(String s, String s1, ExecutorService executorservice, HttpUtil httputil)
    {
        this(s, s1, executorservice, httputil, "api.skype.com");
    }

    public LiveIdWebClient(String s, String s1, ExecutorService executorservice, HttpUtil httputil, String s2)
    {
        if (!TextUtils.isEmpty(s1))
        {
            s1 = s1.split("::");
            if (s1.length == 3)
            {
                siteName = s1[1];
            }
        }
        executor = executorservice;
        accessToken = s;
        httpUtil = httputil;
        authority = s2;
    }

    private byte[] getAvatar(String s, AvatarSize avatarsize)
        throws IOException
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("https");
        builder.authority(String.format("cid-%s.%s", new Object[] {
            s, "users.storage.live.com"
        }));
        builder.path(String.format("users/0x%s/myprofile/expressionprofile/profilephoto:Win8Static,%s/%s?ck=%s&ex=%s", new Object[] {
            s, avatarsize.toString(), "avatar.jpg", "1", Integer.valueOf(1)
        }));
        s = httpUtil.a(builder.toString());
        avatarsize = httpUtil.b(s);
        s.disconnect();
        return avatarsize;
    }

    private ProfileInfo getLiveIdInfo()
        throws IOException
    {
        Object obj = new android.net.Uri.Builder();
        ((android.net.Uri.Builder) (obj)).scheme("https");
        ((android.net.Uri.Builder) (obj)).authority(authority);
        ((android.net.Uri.Builder) (obj)).path("/rps/me");
        ((android.net.Uri.Builder) (obj)).appendQueryParameter("access_token", accessToken);
        if (!TextUtils.isEmpty(siteName))
        {
            ((android.net.Uri.Builder) (obj)).appendQueryParameter("site_name", siteName);
        }
        obj = httpUtil.a(((android.net.Uri.Builder) (obj)).toString());
        obj = httpUtil.c(((HttpURLConnection) (obj)));
        try
        {
            obj = new ProfileInfo(new JSONObject(((String) (obj))));
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            throw new RuntimeException(jsonexception);
        }
        return ((ProfileInfo) (obj));
    }

    private static FutureTask taskWithCallback(Callable callable, AsyncCallback asynccallback)
    {
        return new FutureTask(callable, asynccallback) {

            final AsyncCallback val$callback;

            protected final void done()
            {
                super.done();
                if (callback == null)
                {
                    break MISSING_BLOCK_LABEL_32;
                }
                callback.done(new CompletedAsyncResult(get(), null));
                return;
                Throwable throwable;
                throwable;
                callback.done(new CompletedAsyncResult(throwable));
                return;
            }

            
            {
                callback = asynccallback;
                super(callable);
            }
        };
    }

    public Future getAvatarAsync(final String cid, final AvatarSize size, AsyncCallback asynccallback)
    {
        cid = taskWithCallback(new Callable() {

            final LiveIdWebClient this$0;
            final String val$cid;
            final AvatarSize val$size;

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            public final byte[] call()
                throws Exception
            {
                return getAvatar(cid, size);
            }

            
            {
                this$0 = LiveIdWebClient.this;
                cid = s;
                size = avatarsize;
                super();
            }
        }, asynccallback);
        executor.submit(cid);
        return cid;
    }

    public Future getLiveIdInfoAsync(AsyncCallback asynccallback)
    {
        asynccallback = taskWithCallback(new Callable() {

            final LiveIdWebClient this$0;

            public final ProfileInfo call()
                throws Exception
            {
                return getLiveIdInfo();
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = LiveIdWebClient.this;
                super();
            }
        }, asynccallback);
        executor.submit(asynccallback);
        return asynccallback;
    }

    public void shutdown()
    {
        if (shutdownExecutor)
        {
            executor.shutdown();
        }
    }


}
