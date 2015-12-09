// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.aw;
import com.facebook.ax;
import com.facebook.l;

// Referenced classes of package com.facebook.login:
//            m, LoginClient, o, p

public final class n extends Fragment
{

    private String a;
    private LoginClient b;
    private LoginClient.Request c;

    public n()
    {
    }

    static void a(n n1, LoginClient.Result result)
    {
        n1.c = null;
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
        n1.getActivity().setResult(i, result);
        n1.getActivity().finish();
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        b.a(j, intent);
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
                throw new l("Can't set fragment once it is already set.");
            }
            bundle.c = this;
        } else
        {
            b = new LoginClient(this);
        }
        a = getActivity().getCallingActivity().getPackageName();
        c = (LoginClient.Request)getActivity().getIntent().getParcelableExtra("request");
        b.d = new o(this);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(ax.b, viewgroup, false);
        b.e = new p(this, layoutinflater);
        return layoutinflater;
    }

    public final void onDestroy()
    {
        b.b();
        super.onDestroy();
    }

    public final void onPause()
    {
        super.onPause();
        getActivity().findViewById(aw.b).setVisibility(8);
    }

    public final void onResume()
    {
        super.onResume();
        if (a == null)
        {
            Log.e("LoginActivityFragment", "Cannot call LoginActivity with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            getActivity().finish();
            return;
        } else
        {
            b.a(c);
            return;
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", b);
    }
}
