// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import Bt;
import Cl;
import Jo;
import S;
import UT;
import V;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.snapchat.android.analytics.RegistrationAnalytics;
import com.snapchat.android.fragments.addfriends.NewUserContactBookFragment;
import com.snapchat.android.fragments.signup.LoginAndSignupFragment;
import com.snapchat.android.fragments.signup.LoginFragment;
import com.snapchat.android.fragments.signup.TwoFactorCodeVerificationFragment;
import com.snapchat.android.receiver.ConnectivityReceiver;
import com.snapchat.android.util.fragment.SnapchatFragment;
import ko;
import qi;
import qk;

// Referenced classes of package com.snapchat.android:
//            SnapchatCameraBackgroundActivity

public class LoginAndSignupActivity extends SnapchatCameraBackgroundActivity
{

    private final Rect a;
    private final ko b;
    private final ConnectivityReceiver c;
    private final Cl d;
    private final qk e;
    private qi f;
    private View g;
    private int h;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener i = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

        private LoginAndSignupActivity a;

        public final void onGlobalLayout()
        {
            Object obj = a.getWindow().getDecorView();
            ((View) (obj)).getWindowVisibleDisplayFrame(LoginAndSignupActivity.a(a));
            int j = LoginAndSignupActivity.a(a).bottom;
            ((View) (obj)).getGlobalVisibleRect(LoginAndSignupActivity.a(a));
            j = LoginAndSignupActivity.a(a).bottom - j;
            obj = LoginAndSignupActivity.b(a).getLayoutParams();
            if (((android.view.ViewGroup.LayoutParams) (obj)).height != j)
            {
                obj.height = j;
                LoginAndSignupActivity.b(a).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            }
        }

            
            {
                a = LoginAndSignupActivity.this;
                super();
            }
    };

    public LoginAndSignupActivity()
    {
        this(Bt.a(), ko.a(), new ConnectivityReceiver(), Cl.a(), qk.a());
    }

    public LoginAndSignupActivity(Bt bt, ko ko1, ConnectivityReceiver connectivityreceiver, Cl cl, qk qk1)
    {
        a = new Rect();
        b = ko1;
        c = connectivityreceiver;
        d = cl;
        e = qk1;
    }

    static Rect a(LoginAndSignupActivity loginandsignupactivity)
    {
        return loginandsignupactivity.a;
    }

    public static void a(UT ut)
    {
        boolean flag1 = true;
        boolean flag;
        if (ut != null && ut.a() == UT.a.NEEDS_PHONE_VERIFIED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Bt.c(flag);
        if (ut != null && ut.a() == UT.a.NEEDS_CAPTCHA)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Bt.d(flag);
    }

    static View b(LoginAndSignupActivity loginandsignupactivity)
    {
        return loginandsignupactivity.g;
    }

    public void onBackPressed()
    {
        T t = super.mFragments;
        int j = t.e();
        SnapchatFragment snapchatfragment;
        if (j != 0)
        {
            snapchatfragment = a(t, j - 1);
        } else
        {
            snapchatfragment = null;
        }
        if (snapchatfragment == null)
        {
            super.onBackPressed();
        } else
        if (!snapchatfragment.f())
        {
            snapchatfragment.j(false);
            if (snapchatfragment instanceof LoginAndSignupFragment)
            {
                finish();
                return;
            }
            if (snapchatfragment instanceof NewUserContactBookFragment)
            {
                Bt.e(false);
                RegistrationAnalytics.a(false);
                finish();
                return;
            }
            if (snapchatfragment instanceof TwoFactorCodeVerificationFragment)
            {
                super.mFragments.a().b(0x7f0d032c, new LoginFragment(), com/snapchat/android/fragments/signup/LoginAndSignupFragment.getSimpleName()).a();
                return;
            } else
            {
                a(t, null);
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        c();
        if (bundle == null)
        {
            super.mFragments.a().a(0x7f0d032c, new LoginAndSignupFragment(), com/snapchat/android/fragments/signup/LoginAndSignupFragment.getSimpleName()).a(com/snapchat/android/fragments/signup/LoginAndSignupFragment.getSimpleName()).a();
        }
        c.a(this);
        f = new qi(e);
        d.a(f);
        g = findViewById(0x7f0d032d);
        h = getResources().getColor(0x7f0c007c);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        d.b(f);
        unregisterReceiver(c);
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    protected void onPause()
    {
        super.onPause();
        b.b();
        ViewTreeObserver viewtreeobserver = getWindow().getDecorView().getViewTreeObserver();
        if (viewtreeobserver.isAlive())
        {
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                viewtreeobserver.removeGlobalOnLayoutListener(i);
            } else
            {
                viewtreeobserver.removeOnGlobalLayoutListener(i);
            }
        }
        Jo.a(this, getWindow().getDecorView().getRootView());
    }

    public void onResume()
    {
        super.onResume();
        getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(i);
        a(h);
        if (e.b())
        {
            e.d();
            return;
        } else
        {
            e.c();
            return;
        }
    }

    protected void onStop()
    {
        super.onStop();
        e.e();
    }
}
