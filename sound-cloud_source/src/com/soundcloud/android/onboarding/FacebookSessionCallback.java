// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import com.facebook.AccessToken;
import com.facebook.login.s;
import com.facebook.n;
import com.facebook.p;
import com.soundcloud.android.utils.ErrorUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class FacebookSessionCallback
    implements n
{
    static interface FacebookLoginCallbacks
    {

        public abstract void confirmRequestForFacebookEmail();

        public abstract void loginWithFacebook(String s1);

        public abstract void onFacebookAuthenticationFailedMessage();
    }


    static final List DEFAULT_FACEBOOK_READ_PERMISSIONS = Arrays.asList(new String[] {
        "public_profile", "email", "user_birthday", "user_friends", "user_likes"
    });
    static List EMAIL_ONLY_PERMISSION = Arrays.asList(new String[] {
        "email"
    });
    private final WeakReference activityRef;

    public FacebookSessionCallback(FacebookLoginCallbacks facebooklogincallbacks)
    {
        activityRef = new WeakReference(facebooklogincallbacks);
    }

    private void handleSuccessWithActivity(s s1, FacebookLoginCallbacks facebooklogincallbacks)
    {
        if (s1.c.contains("email"))
        {
            facebooklogincallbacks.confirmRequestForFacebookEmail();
            return;
        } else
        {
            facebooklogincallbacks.loginWithFacebook(s1.a.d);
            return;
        }
    }

    public void onCancel()
    {
    }

    public void onError(p p1)
    {
        ErrorUtils.log(6, "ScOnboarding", (new StringBuilder("Facebook authorization returned an exception ")).append(p1.getMessage()).toString());
        ErrorUtils.handleSilentException(p1);
        p1 = (FacebookLoginCallbacks)activityRef.get();
        if (p1 != null)
        {
            p1.onFacebookAuthenticationFailedMessage();
            return;
        } else
        {
            ErrorUtils.log(5, "ScOnboarding", "Facebook callback called but activity was garbage collected.");
            return;
        }
    }

    public void onSuccess(s s1)
    {
        ErrorUtils.log(4, "ScOnboarding", "Facebook authorization succeeded");
        FacebookLoginCallbacks facebooklogincallbacks = (FacebookLoginCallbacks)activityRef.get();
        if (facebooklogincallbacks != null)
        {
            handleSuccessWithActivity(s1, facebooklogincallbacks);
            return;
        } else
        {
            ErrorUtils.log(5, "ScOnboarding", "Facebook callback called but activity was garbage collected.");
            return;
        }
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((s)obj);
    }

}
