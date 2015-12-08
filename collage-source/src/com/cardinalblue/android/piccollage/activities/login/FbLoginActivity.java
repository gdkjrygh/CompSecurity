// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.login;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.c;
import com.cardinalblue.android.piccollage.activities.BaseFragmentActivity;
import com.cardinalblue.android.piccollage.view.fragments.e;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import java.util.Set;

// Referenced classes of package com.cardinalblue.android.piccollage.activities.login:
//            FbLoginForReadActivity

public class FbLoginActivity extends BaseFragmentActivity
{

    private String a;
    private CallbackManager b;

    public FbLoginActivity()
    {
    }

    private void a()
    {
        Bundle bundle = new Bundle();
        bundle.putString("target", "facebook");
        bundle.putString("auth[facebook][token]", AccessToken.getCurrentAccessToken().getToken());
        bundle.putString("caption", a);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(-1, intent);
    }

    static void a(FbLoginActivity fbloginactivity)
    {
        fbloginactivity.a();
    }

    private void b()
    {
        startActivityForResult(new Intent(this, com/cardinalblue/android/piccollage/activities/login/FbLoginForReadActivity), 0);
    }

    private void c()
    {
        Object obj = AccessToken.getCurrentAccessToken();
        if (obj == null)
        {
            b();
            return;
        }
        obj = ((AccessToken) (obj)).getPermissions();
        if (!((Set) (obj)).containsAll(c.a))
        {
            b();
            return;
        }
        if (!((Set) (obj)).containsAll(c.b))
        {
            LoginManager.getInstance().logInWithPublishPermissions(this, c.b);
            return;
        } else
        {
            a();
            finish();
            return;
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        b.onActivityResult(i, j, intent);
        if (i != 0) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch -1 0: default 48
    //                   -1 58
    //                   0 65;
           goto _L2 _L3 _L4
_L2:
        if (j != -1)
        {
            finish();
        }
        return;
_L3:
        c();
        continue; /* Loop/switch isn't completed */
_L4:
        finish();
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = com.facebook.CallbackManager.Factory.create();
        LoginManager.getInstance().registerCallback(b, new FacebookCallback() {

            final FbLoginActivity a;

            public void a(LoginResult loginresult)
            {
                FbLoginActivity.a(a);
                a.finish();
            }

            public void onCancel()
            {
                a.setResult(0);
                a.finish();
            }

            public void onError(FacebookException facebookexception)
            {
                k.a(a, 0x7f070209, 1);
                a.setResult(0);
                a.finish();
            }

            public void onSuccess(Object obj)
            {
                a((LoginResult)obj);
            }

            
            {
                a = FbLoginActivity.this;
                super();
            }
        });
        a = getIntent().getStringExtra("caption");
        if (k.b(this))
        {
            c();
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    protected void onResume()
    {
        super.onResume();
        if (!k.b(this))
        {
            e e1 = e.a(getString(0x7f0700f9), getString(0x7f07021d), getString(0x104000a), new android.content.DialogInterface.OnClickListener() {

                final FbLoginActivity a;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    a.finish();
                }

            
            {
                a = FbLoginActivity.this;
                super();
            }
            });
            e1.setCancelable(false);
            k.a(this, e1, "error_no_network");
            setResult(0);
        }
    }
}
