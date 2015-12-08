// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.Request;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.UiLifecycleHelper;
import com.facebook.model.GraphUser;
import com.facebook.widget.WebDialog;

public class FacebookWebShareActivity extends Activity
{

    public static final String TYPE_KEY = "Type";
    public static final int TYPE_VALUE_FACEBOOK_LIKE = 1001;
    private static boolean goBack;
    private static Context mContext;
    private Bundle mParams;
    private com.facebook.Session.StatusCallback mSessionCallback;
    private int mType;
    private UiLifecycleHelper uiHelper;

    public FacebookWebShareActivity()
    {
        mType = -1;
        mSessionCallback = new com.facebook.Session.StatusCallback() {

            final FacebookWebShareActivity this$0;

            public void call(Session session, SessionState sessionstate, Exception exception)
            {
                if (mParams != null)
                {
                    connectFacebook(mParams);
                }
                Log.i("SUKESH", (new StringBuilder()).append("SUKESH: session state : ").append(sessionstate).toString());
            }

            
            {
                this$0 = FacebookWebShareActivity.this;
                super();
            }
        };
    }

    public static void dispayMsg()
    {
        Object obj = new android.app.AlertDialog.Builder(mContext);
        ((android.app.AlertDialog.Builder) (obj)).setTitle("Kohl's").setMessage("Yay!\nWe just love it when our customers share with each other. It's so heartwarming!").setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
                ((Activity)FacebookWebShareActivity.mContext).finish();
            }

        });
        obj = ((android.app.AlertDialog.Builder) (obj)).create();
        ((AlertDialog) (obj)).requestWindowFeature(1);
        ((AlertDialog) (obj)).show();
    }

    private boolean isLoggedIn()
    {
        Session session = Session.getActiveSession();
        return session != null && session.isOpened();
    }

    public static void publishFeedDialog(Context context, Bundle bundle)
    {
        ((com.facebook.widget.WebDialog.FeedDialogBuilder)(new com.facebook.widget.WebDialog.FeedDialogBuilder(context, Session.getActiveSession(), bundle)).setOnCompleteListener(new com.facebook.widget.WebDialog.OnCompleteListener() {

            public void onComplete(Bundle bundle1, FacebookException facebookexception)
            {
                if (facebookexception != null)
                {
                    break MISSING_BLOCK_LABEL_16;
                }
                if (bundle1.getString("post_id") != null)
                {
                    FacebookWebShareActivity.dispayMsg();
                }
                FacebookWebShareActivity.goBack = true;
                return;
                bundle1;
                bundle1.printStackTrace();
                return;
            }

        })).build().show();
    }

    public void connectFacebook(Bundle bundle)
    {
        initiateFacebookLogin(true, bundle);
    }

    public void getFacebookUsername()
    {
        Request.newMeRequest(Session.getActiveSession(), new com.facebook.Request.GraphUserCallback() {

            final FacebookWebShareActivity this$0;

            public void onCompleted(GraphUser graphuser, Response response)
            {
                if (graphuser != null)
                {
                    graphuser.getName();
                }
            }

            
            {
                this$0 = FacebookWebShareActivity.this;
                super();
            }
        }).executeAsync();
    }

    public void initiateFacebookLogin(final boolean bShare, final Bundle params)
    {
        if (Session.getActiveSession() == null || !Session.getActiveSession().isOpened())
        {
            Session.openActiveSession(this, true, new com.facebook.Session.StatusCallback() {

                final FacebookWebShareActivity this$0;
                final boolean val$bShare;
                final Bundle val$params;

                public void call(Session session, SessionState sessionstate, Exception exception)
                {
                    if (bShare)
                    {
                        if (session.isOpened() && sessionstate.isOpened())
                        {
                            FacebookWebShareActivity.publishFeedDialog(FacebookWebShareActivity.this, params);
                        }
                        return;
                    } else
                    {
                        getFacebookUsername();
                        return;
                    }
                }

            
            {
                this$0 = FacebookWebShareActivity.this;
                bShare = flag;
                params = bundle;
                super();
            }
            });
            return;
        } else
        {
            publishFeedDialog(this, params);
            return;
        }
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

    public void onBackPressed()
    {
        super.onBackPressed();
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mContext = this;
        mParams = getIntent().getBundleExtra("facebook");
        mType = mParams.getInt("Type");
        uiHelper = new UiLifecycleHelper(this, mSessionCallback);
        uiHelper.onCreate(bundle);
        if (mParams != null)
        {
            connectFacebook(mParams);
        }
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

    protected void onResume()
    {
        super.onResume();
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
