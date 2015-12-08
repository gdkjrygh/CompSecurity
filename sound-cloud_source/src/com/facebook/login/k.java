// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.AccessToken;
import com.facebook.p;
import java.util.ArrayList;

// Referenced classes of package com.facebook.login:
//            LoginClient, LoginMethodHandler, l, m, 
//            g, GetTokenLoginMethodHandler, KatanaProxyLoginMethodHandler, WebViewLoginMethodHandler

public final class k extends Fragment
{

    private String a;
    private LoginClient b;
    private LoginClient.Request c;

    public k()
    {
    }

    static Bundle a(LoginClient.Request request)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        return bundle;
    }

    static void a(k k1, LoginClient.Result result)
    {
        k1.c = null;
        Bundle bundle;
        int i;
        if (result.a == LoginClient.Result.a.b)
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
        if (k1.isAdded())
        {
            k1.getActivity().setResult(i, result);
            k1.getActivity().finish();
        }
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        LoginClient loginclient = b;
        if (loginclient.g != null)
        {
            loginclient.b().a(j, intent);
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            b = (LoginClient)bundle.getParcelable("loginClient");
            bundle = b;
            if (((LoginClient) (bundle)).c != null)
            {
                throw new p("Can't set fragment once it is already set.");
            }
            bundle.c = this;
        } else
        {
            b = new LoginClient(this);
        }
        b.d = new l(this);
        bundle = getActivity();
        if (bundle != null)
        {
            ComponentName componentname = bundle.getCallingActivity();
            if (componentname != null)
            {
                a = componentname.getPackageName();
            }
            if (bundle.getIntent() != null)
            {
                c = (LoginClient.Request)bundle.getIntent().getParcelableExtra("request");
                return;
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.facebook.O.e.com_facebook_login_fragment, viewgroup, false);
        b.e = new m(this, layoutinflater);
        return layoutinflater;
    }

    public final void onDestroy()
    {
        LoginClient loginclient = b;
        if (loginclient.b >= 0)
        {
            loginclient.b().b();
        }
        super.onDestroy();
    }

    public final void onPause()
    {
        super.onPause();
        getActivity().findViewById(com.facebook.O.d.com_facebook_login_activity_progress_bar).setVisibility(8);
    }

    public final void onResume()
    {
        super.onResume();
        if (a == null)
        {
            getActivity().finish();
        } else
        {
            LoginClient loginclient = b;
            Object obj = c;
            boolean flag;
            if (loginclient.g != null && loginclient.b >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag && obj != null)
            {
                if (loginclient.g != null)
                {
                    throw new p("Attempted to authorize while a request is pending.");
                }
                if (AccessToken.a() == null || loginclient.c())
                {
                    loginclient.g = ((LoginClient.Request) (obj));
                    ArrayList arraylist = new ArrayList();
                    obj = ((LoginClient.Request) (obj)).a;
                    if (((g) (obj)).d)
                    {
                        arraylist.add(new GetTokenLoginMethodHandler(loginclient));
                        arraylist.add(new KatanaProxyLoginMethodHandler(loginclient));
                    }
                    if (((g) (obj)).e)
                    {
                        arraylist.add(new WebViewLoginMethodHandler(loginclient));
                    }
                    LoginMethodHandler aloginmethodhandler[] = new LoginMethodHandler[arraylist.size()];
                    arraylist.toArray(aloginmethodhandler);
                    loginclient.a = aloginmethodhandler;
                    loginclient.d();
                    return;
                }
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", b);
    }
}
