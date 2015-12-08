// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.login.LoginManager;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            ae, al, ad, aa, 
//            ab, ac

public class FbLoginActivity extends Activity
{

    public static final String a[] = {
        "user_photos", "user_friends", "email"
    };
    public static final String b[] = {
        "publish_actions"
    };
    public static final String c[] = {
        "publish_actions"
    };
    public static final String d[] = {
        "publish_actions", "manage_pages"
    };
    public static final String e[] = {
        "read_stream"
    };
    private CallbackManager f;
    private ProgressDialog g;
    private GraphRequestAsyncTask h;
    private boolean i;

    public FbLoginActivity()
    {
    }

    private void a()
    {
        if (h != null)
        {
            h.cancel(true);
            h = null;
        }
    }

    static void a(FbLoginActivity fbloginactivity, Exception exception)
    {
        if (exception != null && fbloginactivity.i && !(exception instanceof FacebookOperationCanceledException))
        {
            Toast.makeText(fbloginactivity, (new StringBuilder()).append(fbloginactivity.getString(at.h)).append("\n").append(exception.getLocalizedMessage()).toString(), 1).show();
        }
        exception = new Intent();
        exception.putExtra("is_error", true);
        fbloginactivity.setResult(0, exception);
        fbloginactivity.finish();
    }

    static boolean a(FbLoginActivity fbloginactivity)
    {
        return fbloginactivity.i;
    }

    static void b(FbLoginActivity fbloginactivity)
    {
        fbloginactivity.g = com.roidapp.cloudlib.common.d.a(fbloginactivity, fbloginactivity.getString(at.Y));
        fbloginactivity.g.setCanceledOnTouchOutside(false);
        fbloginactivity.g.show();
        fbloginactivity.a();
        fbloginactivity.h = GraphRequest.newMeRequest(AccessToken.getCurrentAccessToken(), new ae(fbloginactivity, (byte)0)).executeAsync();
    }

    static ProgressDialog c(FbLoginActivity fbloginactivity)
    {
        return fbloginactivity.g;
    }

    public void onActivityResult(int j, int k, Intent intent)
    {
        if (j == 1)
        {
            setResult(0);
            finish();
            return;
        }
        if (f != null)
        {
            f.onActivityResult(j, k, intent);
        }
        super.onActivityResult(j, k, intent);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(2);
        String s = getIntent().getStringExtra("permission");
        i = getIntent().getBooleanExtra("need_load_user_info", true);
        setContentView(as.an);
        if (l.b(this))
        {
            bundle = al.b();
            if (bundle != null && !bundle.isExpired())
            {
                setResult(-1, getIntent());
                finish();
                return;
            }
            if (s != null)
            {
                bundle = new ArrayList(a.length + 1);
                bundle.addAll(Arrays.asList(a));
                bundle.add(s);
            } else
            {
                bundle = Arrays.asList(a);
            }
            f = com.facebook.CallbackManager.Factory.create();
            LoginManager.getInstance().registerCallback(f, new ad(this));
            LoginManager.getInstance().logInWithReadPermissions(this, bundle);
            return;
        } else
        {
            l.a(this, new aa(this), new ab(this), new ac(this));
            return;
        }
    }

    public void onDestroy()
    {
        a();
        if (g != null)
        {
            g.dismiss();
            g = null;
        }
        f = null;
        super.onDestroy();
    }

}
