// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.facebook;

import android.app.Activity;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import java.util.Arrays;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.activity.ActivityResult;
import me.lyft.android.infrastructure.activity.ActivityService;
import rx.Observable;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.infrastructure.facebook:
//            IFacebookService

public class FacebookService extends ActivityService
    implements IFacebookService
{

    private static final String FACEBOOK_EMAIL_PERMISSION = "email";
    private static final String FACEBOOK_USER_FRIENDS_PERMISSION = "user_friends";
    private CallbackManager callbackManager;

    public FacebookService()
    {
        callbackManager = com.facebook.CallbackManager.Factory.create();
    }

    public String getFacebookToken()
    {
        if (isFacebookSessionOpened())
        {
            return AccessToken.getCurrentAccessToken().getToken();
        } else
        {
            return null;
        }
    }

    public boolean isFacebookSessionOpened()
    {
        return AccessToken.getCurrentAccessToken() != null;
    }

    public void logout()
    {
        LoginManager.getInstance().logOut();
    }

    public void onActivityResult(Activity activity, ActivityResult activityresult)
    {
        super.onActivityResult(activity, activityresult);
        callbackManager.onActivityResult(activityresult.getRequestCode(), activityresult.getResultCode(), activityresult.getIntent());
    }

    public Observable openFacebookSession()
    {
        if (isFacebookSessionOpened())
        {
            return Unit.just();
        } else
        {
            final PublishSubject result = PublishSubject.create();
            LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback() {

                final FacebookService this$0;
                final PublishSubject val$result;

                public void onCancel()
                {
                    result.onCompleted();
                }

                public void onError(FacebookException facebookexception)
                {
                    result.onError(facebookexception);
                }

                public void onSuccess(LoginResult loginresult)
                {
                    result.onNext(Unit.create());
                    result.onCompleted();
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((LoginResult)obj);
                }

            
            {
                this$0 = FacebookService.this;
                result = publishsubject;
                super();
            }
            });
            LoginManager.getInstance().logInWithReadPermissions(getCurrentActivity(), Arrays.asList(new String[] {
                "email", "user_friends"
            }));
            return result.asObservable();
        }
    }
}
