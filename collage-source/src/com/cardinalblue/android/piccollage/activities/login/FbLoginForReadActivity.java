// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.login;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.c;
import com.cardinalblue.android.piccollage.a.i;
import com.cardinalblue.android.piccollage.activities.BaseFragmentActivity;
import com.cardinalblue.android.piccollage.view.fragments.ae;
import com.cardinalblue.android.piccollage.view.fragments.e;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import java.util.Set;
import org.json.JSONObject;

public class FbLoginForReadActivity extends BaseFragmentActivity
{

    private CallbackManager a;

    public FbLoginForReadActivity()
    {
    }

    private void a()
    {
        AccessToken accesstoken = AccessToken.getCurrentAccessToken();
        if (accesstoken == null)
        {
            LoginManager.getInstance().logInWithReadPermissions(this, c.a);
            return;
        }
        if (!accesstoken.getPermissions().containsAll(c.a))
        {
            LoginManager.getInstance().logInWithReadPermissions(this, c.a);
            return;
        } else
        {
            setResult(-1);
            finish();
            return;
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        a.onActivityResult(i, j, intent);
        if (j != -1)
        {
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = com.facebook.CallbackManager.Factory.create();
        LoginManager.getInstance().registerCallback(a, new FacebookCallback() {

            final FbLoginForReadActivity a;

            public void a(LoginResult loginresult)
            {
                ae ae1 = ae.a(0x7f0701fa, false, 0);
                k.a(a, ae1, a.getString(0x7f0701fa));
                GraphRequest.newMeRequest(loginresult.getAccessToken(), new com.facebook.GraphRequest.GraphJSONObjectCallback(this) {

                    final _cls1 a;

                    public void onCompleted(JSONObject jsonobject, GraphResponse graphresponse)
                    {
                        if (graphresponse.getError() != null)
                        {
                            k.a(a.a, 0x7f0700f8, 1);
                            a.a.setResult(0);
                            a.a.finish();
                        }
                        c.a(a.a.getApplicationContext(), jsonobject);
                        i.a(a.a);
                        a.a.setResult(-1);
                        a.a.finish();
                    }

            
            {
                a = _pcls1;
                super();
            }
                }).executeAsync();
            }

            public void onCancel()
            {
                a.setResult(0);
                a.finish();
            }

            public void onError(FacebookException facebookexception)
            {
                k.a(a, 0x7f0700f8, 1);
                a.setResult(0);
                a.finish();
            }

            public void onSuccess(Object obj)
            {
                a((LoginResult)obj);
            }

            
            {
                a = FbLoginForReadActivity.this;
                super();
            }
        });
        if (k.b(this))
        {
            a();
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (!k.b(this))
        {
            e e1 = e.a(getString(0x7f0700f9), getString(0x7f07021d), getString(0x104000a), new android.content.DialogInterface.OnClickListener() {

                final FbLoginForReadActivity a;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    a.finish();
                }

            
            {
                a = FbLoginForReadActivity.this;
                super();
            }
            });
            e1.setCancelable(false);
            k.a(this, e1, "error_no_network");
            setResult(0);
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }
}
