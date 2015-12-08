// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.social;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.android.DialogError;
import com.facebook.android.Facebook;
import com.facebook.android.FacebookError;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.event.service.AuthorizationCanceled;
import com.netflix.mediaclient.event.service.AuthorizationFailed;
import com.netflix.mediaclient.event.service.FacebookAuthorized;
import com.netflix.mediaclient.event.service.Service;
import com.netflix.mediaclient.repository.SecurityRepository;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.ThreadUtils;

public class FacebookAgent
{

    private static final String FACEBOOK_APP_ID = "com.facebook.katana";
    private static final String TAG = "FacebookAgent";
    private boolean authorized;
    private final Facebook facebook = new Facebook(SecurityRepository.getFacebookId());
    private boolean resultReported;

    public FacebookAgent()
    {
        Log.d("FacebookAgent", "Creating Facebook proxy...");
        Log.d("FacebookAgent", "Created Facebook proxy.");
        resultReported = false;
    }

    public boolean isNativeServiceAppAvailable(NetflixActivity netflixactivity)
    {
        return AndroidUtils.getPackageInfo(netflixactivity, "com.facebook.katana") != null;
    }

    public void login(final NetflixActivity activity, String as[])
    {
        ThreadUtils.assertNotOnMain();
        Log.d("FacebookAgent", "Facebook::authorize: started, always go to Facebook, do not store anything");
        if (facebook == null)
        {
            Log.e("FacebookAgent", "Facebook::authorize: destroyed");
            return;
        }
        resultReported = false;
        final String perm[] = as;
        if (as == null)
        {
            perm = new String[0];
        }
        activity.runOnUiThread(new Runnable() {

            final FacebookAgent this$0;
            final NetflixActivity val$activity;
            final String val$perm[];

            public void run()
            {
                facebook.authorize(activity, perm, new com.facebook.android.Facebook.DialogListener() {

                    final _cls1 this$1;

                    public void onCancel()
                    {
                        Log.e("FacebookAgent", "onCancel:: user canceled facebook SSO.");
                        if (!resultReported)
                        {
                            activity.getNetflixApplication().publishEvent(new AuthorizationCanceled(Service.facebook));
                            resultReported = true;
                            return;
                        } else
                        {
                            Log.w("FacebookAgent", "Result already reported!");
                            return;
                        }
                    }

                    public void onComplete(Bundle bundle)
                    {
                        if (Log.isLoggable("FacebookAgent", 3))
                        {
                            Log.d("FacebookAgent", "onComplete:: we are authorized to access Facebook. Save credentials and send event to UI");
                            Log.d("FacebookAgent", (new StringBuilder()).append("Access token from Facebook ").append(facebook.getAccessToken()).toString());
                            Log.d("FacebookAgent", (new StringBuilder()).append("Expires from Facebook ").append(facebook.getAccessExpires()).toString());
                        }
                        if (!resultReported)
                        {
                            activity.getNetflixApplication().publishEvent(new FacebookAuthorized(facebook.getAccessToken()));
                            resultReported = true;
                            return;
                        } else
                        {
                            Log.w("FacebookAgent", "Result already reported!");
                            return;
                        }
                    }

                    public void onError(DialogError dialogerror)
                    {
                        Log.e("FacebookAgent", "onError:: facebook client is not installed, webview is used for SSO.", dialogerror);
                        if (!resultReported)
                        {
                            activity.getNetflixApplication().publishEvent(new AuthorizationFailed(Service.facebook));
                            resultReported = true;
                            return;
                        } else
                        {
                            Log.w("FacebookAgent", "Result already reported!");
                            return;
                        }
                    }

                    public void onFacebookError(FacebookError facebookerror)
                    {
                        Log.e("FacebookAgent", "onFacebookError:: Facebook client was used for SSO", facebookerror);
                        if (!resultReported)
                        {
                            activity.getNetflixApplication().publishEvent(new AuthorizationFailed(Service.facebook));
                            resultReported = true;
                            return;
                        } else
                        {
                            Log.w("FacebookAgent", "Result already reported!");
                            return;
                        }
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }

            
            {
                this$0 = FacebookAgent.this;
                activity = netflixactivity;
                perm = as;
                super();
            }
        });
        Log.d("FacebookAgent", "Facebook::authorize: started done.");
    }

    public void loginCallback(int i, int j, Intent intent)
    {
        if (facebook != null)
        {
            try
            {
                facebook.authorizeCallback(i, j, intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                Log.e("FacebookAgent", "Login failed. Ignore exception, it was already reported", intent);
            }
            return;
        } else
        {
            Log.e("FacebookAgent", "Facebook::authorizeCallback: destroyed");
            return;
        }
    }

    public void logout(NetflixActivity netflixactivity)
    {
        Log.d("FacebookAgent", "Facebook::deauthorize: started");
        if (facebook == null)
        {
            Log.e("FacebookAgent", "Facebook::deauthorize: destroyed");
            return;
        }
        if (!authorized)
        {
            Log.e("FacebookAgent", "Facebook::deauthorize: Not authorized!");
            return;
        }
        try
        {
            facebook.logout(netflixactivity);
        }
        // Misplaced declaration of an exception variable
        catch (NetflixActivity netflixactivity)
        {
            Log.e("FacebookAgent", "Failed to logout", netflixactivity);
        }
        authorized = false;
        Log.d("FacebookAgent", "Facebook::deauthorize: started done.");
    }



/*
    static boolean access$002(FacebookAgent facebookagent, boolean flag)
    {
        facebookagent.resultReported = flag;
        return flag;
    }

*/

}
