// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.Request;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.UiLifecycleHelper;
import com.facebook.model.GraphUser;
import com.facebook.widget.WebDialog;
import com.kohls.mcommerce.opal.wallet.asynctask.RegisterEventAsyncTask;
import org.json.JSONObject;

public class FacebookShareActivity extends Activity
{

    private static boolean goBack;
    private static Context mContext;
    private Bundle mParams;
    private com.facebook.Session.StatusCallback mSessionCallback;
    private UiLifecycleHelper uiHelper;

    public FacebookShareActivity()
    {
        mSessionCallback = new com.facebook.Session.StatusCallback() {

            final FacebookShareActivity this$0;

            public void call(Session session, SessionState sessionstate, Exception exception)
            {
                connectFacebook(mParams);
            }

            
            {
                this$0 = FacebookShareActivity.this;
                super();
            }
        };
    }

    private boolean isLoggedIn()
    {
        Session session = Session.getActiveSession();
        return session != null && session.isOpened();
    }

    public static void publishFeedDialog(Context context, Bundle bundle)
    {
        ((com.facebook.widget.WebDialog.FeedDialogBuilder)(new com.facebook.widget.WebDialog.FeedDialogBuilder(context, Session.getActiveSession(), bundle)).setOnCompleteListener(new com.facebook.widget.WebDialog.OnCompleteListener(bundle, context) {

            final Context val$context;
            final Bundle val$params;

            private void dispayMsg()
            {
                Object obj = new android.app.AlertDialog.Builder(FacebookShareActivity.mContext);
            /* block-local class not found */
            class _cls1 {}

                ((android.app.AlertDialog.Builder) (obj)).setTitle("Kohl's").setMessage("Yay!\nWe just love it when our customers share with each other. It's so heartwarming!").setPositiveButton("OK", new _cls1());
                obj = ((android.app.AlertDialog.Builder) (obj)).create();
                ((AlertDialog) (obj)).requestWindowFeature(1);
                ((AlertDialog) (obj)).show();
            }

            public void onComplete(Bundle bundle1, FacebookException facebookexception)
            {
                if (facebookexception == null)
                {
                    if (bundle1.getString("post_id") != null && params.getBoolean("register"))
                    {
                        (new RegisterEventAsyncTask(context)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
                            "Facebook_Share"
                        });
                        dispayMsg();
                    }
                } else
                if (!(facebookexception instanceof FacebookOperationCanceledException));
                FacebookShareActivity.goBack = true;
            }

            
            {
                params = bundle;
                context = context1;
                super();
            }
        })).build().show();
    }

    public void connectFacebook(Bundle bundle)
    {
        initiateFacebookLogin(true, bundle);
    }

    public void didFinishFBUserDetailsRequest(String s)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("setFacebookUsername(");
        if (s != null)
        {
            s = (new StringBuilder()).append("'").append(s).append("'").toString();
        } else
        {
            s = "";
        }
        stringbuilder.append(s).append(")").toString();
    }

    public void disconnectFacebook(JSONObject jsonobject)
    {
        (new AsyncTask() {

            final FacebookShareActivity this$0;

            protected transient Boolean doInBackground(Void avoid[])
            {
                if (Session.getActiveSession() != null)
                {
                    Session.getActiveSession().closeAndClearTokenInformation();
                }
                return Boolean.valueOf(true);
            }

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Void[])aobj);
            }

            protected void onPostExecute(Boolean boolean1)
            {
                if (!isFinishing());
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((Boolean)obj);
            }

            
            {
                this$0 = FacebookShareActivity.this;
                super();
            }
        }).execute(new Void[0]);
    }

    public void getFacebookUsername()
    {
        Request.newMeRequest(Session.getActiveSession(), new com.facebook.Request.GraphUserCallback() {

            final FacebookShareActivity this$0;

            public void onCompleted(GraphUser graphuser, Response response)
            {
                response = null;
                if (graphuser != null)
                {
                    response = graphuser.getName();
                }
                didFinishFBUserDetailsRequest(response);
            }

            
            {
                this$0 = FacebookShareActivity.this;
                super();
            }
        }).executeAsync();
    }

    public void getShareCredential(JSONObject jsonobject)
    {
        if (Session.getActiveSession().isOpened())
        {
            getFacebookUsername();
        }
    }

    public void initiateFacebookLogin(final boolean bShare, final Bundle params)
    {
        Session.openActiveSession(this, true, new com.facebook.Session.StatusCallback() {

            final FacebookShareActivity this$0;
            final boolean val$bShare;
            final Bundle val$params;

            public void call(Session session, SessionState sessionstate, Exception exception)
            {
                if (bShare)
                {
                    if (session.isOpened())
                    {
                        FacebookShareActivity.publishFeedDialog(FacebookShareActivity.this, params);
                    }
                    return;
                } else
                {
                    getFacebookUsername();
                    return;
                }
            }

            
            {
                this$0 = FacebookShareActivity.this;
                bShare = flag;
                params = bundle;
                super();
            }
        });
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        uiHelper.onActivityResult(i, j, intent);
        if (!isLoggedIn())
        {
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mContext = this;
        mParams = getIntent().getBundleExtra("facebook");
        uiHelper = new UiLifecycleHelper(this, mSessionCallback);
        uiHelper.onCreate(bundle);
        connectFacebook(mParams);
    }

    public void onDestroy()
    {
        super.onDestroy();
        uiHelper.onDestroy();
    }

    public void onPause()
    {
        super.onPause();
        uiHelper.onPause();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        if (flag && goBack)
        {
            goBack = false;
            finish();
        }
        super.onWindowFocusChanged(flag);
    }



/*
    static boolean access$102(boolean flag)
    {
        goBack = flag;
        return flag;
    }

*/

}
