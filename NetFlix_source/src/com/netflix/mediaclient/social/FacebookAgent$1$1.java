// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.social;

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

// Referenced classes of package com.netflix.mediaclient.social:
//            FacebookAgent

class this._cls1
    implements com.facebook.android.tener
{

    final is._cls0 this$1;

    public void onCancel()
    {
        Log.e("FacebookAgent", "onCancel:: user canceled facebook SSO.");
        if (!FacebookAgent.access$000(_fld0))
        {
            activity.getNetflixApplication().publishEvent(new AuthorizationCanceled(Service.facebook));
            FacebookAgent.access$002(_fld0, true);
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
            Log.d("FacebookAgent", (new StringBuilder()).append("Access token from Facebook ").append(FacebookAgent.access$100(_fld0).getAccessToken()).toString());
            Log.d("FacebookAgent", (new StringBuilder()).append("Expires from Facebook ").append(FacebookAgent.access$100(_fld0).getAccessExpires()).toString());
        }
        if (!FacebookAgent.access$000(_fld0))
        {
            activity.getNetflixApplication().publishEvent(new FacebookAuthorized(FacebookAgent.access$100(_fld0).getAccessToken()));
            FacebookAgent.access$002(_fld0, true);
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
        if (!FacebookAgent.access$000(_fld0))
        {
            activity.getNetflixApplication().publishEvent(new AuthorizationFailed(Service.facebook));
            FacebookAgent.access$002(_fld0, true);
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
        if (!FacebookAgent.access$000(_fld0))
        {
            activity.getNetflixApplication().publishEvent(new AuthorizationFailed(Service.facebook));
            FacebookAgent.access$002(_fld0, true);
            return;
        } else
        {
            Log.w("FacebookAgent", "Result already reported!");
            return;
        }
    }

    l.perm()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/social/FacebookAgent$1

/* anonymous class */
    class FacebookAgent._cls1
        implements Runnable
    {

        final FacebookAgent this$0;
        final NetflixActivity val$activity;
        final String val$perm[];

        public void run()
        {
            FacebookAgent.access$100(FacebookAgent.this).authorize(activity, perm, new FacebookAgent._cls1._cls1());
        }

            
            {
                this$0 = final_facebookagent;
                activity = netflixactivity;
                perm = _5B_Ljava.lang.String_3B_.this;
                super();
            }
    }

}
