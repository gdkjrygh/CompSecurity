// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import aod;
import aoe;

// Referenced classes of package com.facebook:
//            AuthorizationClient

public class LoginActivity extends Activity
{

    private static final String a = com/facebook/LoginActivity.getName();
    private String b;
    private AuthorizationClient c;
    private AuthorizationClient.AuthorizationRequest d;

    public LoginActivity()
    {
    }

    static Bundle a(AuthorizationClient.AuthorizationRequest authorizationrequest)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("request", authorizationrequest);
        return bundle;
    }

    static void a(LoginActivity loginactivity, AuthorizationClient.Result result)
    {
        loginactivity.d = null;
        Bundle bundle;
        int i;
        if (result.code == AuthorizationClient.Result.Code.b)
        {
            i = 0;
        } else
        {
            i = -1;
        }
        bundle = new Bundle();
        bundle.putSerializable("com.facebook.LoginActivity:Result", result);
        result = new Intent();
        result.putExtras(bundle);
        loginactivity.setResult(i, result);
        loginactivity.finish();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        c.a(i, j, intent);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030052);
        if (bundle != null)
        {
            b = bundle.getString("callingPackage");
            c = (AuthorizationClient)bundle.getSerializable("authorizationClient");
        } else
        {
            b = getCallingPackage();
            c = new AuthorizationClient();
            d = (AuthorizationClient.AuthorizationRequest)getIntent().getSerializableExtra("request");
        }
        bundle = c;
        bundle.a = this;
        bundle.b = new AuthorizationClient._cls1(this);
        c.c = new aoe() {

            private LoginActivity a;

            public final void a(AuthorizationClient.Result result)
            {
                LoginActivity.a(a, result);
            }

            
            {
                a = LoginActivity.this;
                super();
            }
        };
        c.d = new aod() {

            private LoginActivity a;

            public final void a()
            {
                a.findViewById(0x7f1102fc).setVisibility(0);
            }

            public final void b()
            {
                a.findViewById(0x7f1102fc).setVisibility(8);
            }

            
            {
                a = LoginActivity.this;
                super();
            }
        };
    }

    public void onPause()
    {
        super.onPause();
        AuthorizationClient authorizationclient = c;
        if (authorizationclient.currentHandler != null)
        {
            authorizationclient.currentHandler.d();
        }
        findViewById(0x7f1102fc).setVisibility(8);
    }

    public void onResume()
    {
        super.onResume();
        if (b == null)
        {
            Log.e(a, "Cannot call LoginActivity with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            finish();
            return;
        } else
        {
            c.a(d);
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("callingPackage", b);
        bundle.putSerializable("authorizationClient", c);
    }

}
