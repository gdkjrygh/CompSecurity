// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ba;
import com.facebook.bb;

// Referenced classes of package com.facebook.login:
//            m, p, LoginClient, o

public class n extends Fragment
{

    private String a;
    private LoginClient b;
    private LoginClient.Request c;

    public n()
    {
    }

    private void a(LoginClient.Result result)
    {
        c = null;
        Bundle bundle;
        int i;
        if (result.a == m.b)
        {
            i = 0;
        } else
        {
            i = -1;
        }
        bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        result = new Intent();
        result.putExtras(bundle);
        if (n())
        {
            i().setResult(i, result);
            i().finish();
        }
    }

    static void a(n n1, LoginClient.Result result)
    {
        n1.a(result);
    }

    private void b(Activity activity)
    {
        activity = activity.getCallingActivity();
        if (activity == null)
        {
            return;
        } else
        {
            a = activity.getPackageName();
            return;
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(bb.com_facebook_login_fragment, viewgroup, false);
        b.a(new p(this, layoutinflater));
        return layoutinflater;
    }

    public void a(int i, int j, Intent intent)
    {
        super.a(i, j, intent);
        b.a(i, j, intent);
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            b = (LoginClient)bundle.getParcelable("loginClient");
            b.a(this);
        } else
        {
            b = new LoginClient(this);
        }
        b.a(new o(this));
        bundle = i();
        if (bundle != null)
        {
            b(bundle);
            if (bundle.getIntent() != null)
            {
                c = (LoginClient.Request)bundle.getIntent().getParcelableExtra("request");
                return;
            }
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putParcelable("loginClient", b);
    }

    public void e_()
    {
        super.e_();
        if (b.e())
        {
            Object obj = LoginClient.Result.a(c, "Operation canceled");
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", ((android.os.Parcelable) (obj)));
            obj = new Intent();
            ((Intent) (obj)).putExtras(bundle);
            i().setResult(0, ((Intent) (obj)));
            i().finish();
        }
    }

    public void f_()
    {
        super.f_();
        if (a == null)
        {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            i().finish();
            return;
        } else
        {
            b.a(c);
            return;
        }
    }

    public void g_()
    {
        super.g_();
        i().findViewById(ba.com_facebook_login_activity_progress_bar).setVisibility(8);
    }

    public void u()
    {
        b.f();
        super.u();
    }
}
