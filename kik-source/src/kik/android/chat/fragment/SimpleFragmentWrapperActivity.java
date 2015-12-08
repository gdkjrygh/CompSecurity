// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.p;
import com.kik.h.a;
import com.kik.h.d;
import com.kik.ui.fragment.FragmentBase;
import kik.a.ab;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.chat.fragment:
//            rh, rj, KikScopedDialogFragment

public class SimpleFragmentWrapperActivity extends FragmentActivity
{

    protected ab a;
    private boolean b;
    private f c;
    private i d;

    public SimpleFragmentWrapperActivity()
    {
        b = false;
        c = new f();
        d = new rh(this);
    }

    private Fragment a()
    {
        return getSupportFragmentManager().findFragmentById(0x7f0e0062);
    }

    static f a(SimpleFragmentWrapperActivity simplefragmentwrapperactivity)
    {
        return simplefragmentwrapperactivity.c;
    }

    public void onBackPressed()
    {
        Fragment fragment = a();
        if (!(fragment instanceof a) || !((a)fragment).v())
        {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        Object obj;
        super.onCreate(bundle);
        ((kik.android.chat.a)getApplication()).a().a(this);
        requestWindowFeature(1);
        setContentView(0x7f03000d);
        c.a(a.a(), d);
        c.a(a.c(), d);
        obj = getIntent().getStringExtra("SimpleFragmentWrapperActivity.fragmentlaunchclass");
        bundle = null;
        obj = (Fragment)Class.forName(((String) (obj))).newInstance();
        bundle = ((Bundle) (obj));
_L2:
        if (bundle == null)
        {
            throw new IllegalArgumentException();
        }
        break; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        ((InstantiationException) (obj1)).printStackTrace();
        continue; /* Loop/switch isn't completed */
        obj1;
        ((IllegalAccessException) (obj1)).printStackTrace();
        continue; /* Loop/switch isn't completed */
        obj1;
        ((ClassNotFoundException) (obj1)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        bundle.setArguments(getIntent().getExtras());
        if (bundle instanceof FragmentBase)
        {
            ((FragmentBase)bundle).E().a(new rj(this));
        }
        getSupportFragmentManager().beginTransaction().replace(0x7f0e0062, bundle).commit();
        return;
    }

    protected void onDestroy()
    {
        Fragment fragment = a();
        c.a();
        if (fragment instanceof KikScopedDialogFragment)
        {
            ((KikScopedDialogFragment)fragment).ab();
        }
        super.onDestroy();
    }

    protected void onPause()
    {
        super.onPause();
        ((KikApplication)getApplication()).c(this);
    }

    protected void onResume()
    {
        super.onResume();
        ((KikApplication)getApplication()).d(this);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        b = flag;
        Fragment fragment = a();
        if (fragment != null && (fragment instanceof d))
        {
            ((d)fragment).a(b);
        }
    }
}
