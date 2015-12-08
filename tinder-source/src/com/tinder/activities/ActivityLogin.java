// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.animation.Animator;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnticipateInterpolator;
import android.widget.Toast;
import com.appboy.models.outgoing.FacebookUser;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.e;
import com.facebook.s;
import com.tinder.base.a;
import com.tinder.c.j;
import com.tinder.c.u;
import com.tinder.e.av;
import com.tinder.e.m;
import com.tinder.events.EventLocationSet;
import com.tinder.events.EventLoggedOut;
import com.tinder.f.ak;
import com.tinder.fragments.FragmentIntro;
import com.tinder.fragments.ba;
import com.tinder.fragments.bt;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ae;
import com.tinder.managers.d;
import com.tinder.managers.f;
import com.tinder.managers.g;
import com.tinder.managers.z;
import com.tinder.model.FacebookAnalyticsUtils;
import com.tinder.model.SparksEvent;
import com.tinder.model.TinderPurchase;
import com.tinder.model.UserMeta;
import com.tinder.utils.ad;
import com.tinder.utils.b;
import com.tinder.utils.k;
import com.tinder.utils.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.activities:
//            ActivityVerification, ActivityMain

public class ActivityLogin extends a
    implements m, com.tinder.fragments.FragmentIntro.a, com.tinder.fragments.FragmentIntro.b, com.tinder.managers.g.a
{

    private static boolean g;
    private static boolean h;
    protected u a;
    d b;
    f c;
    ae d;
    z e;
    com.tinder.d.a f;
    private boolean i;
    private com.facebook.d j;
    private com.tinder.c.f k;
    private FragmentIntro q;
    private ba r;
    private bt s;
    private com.tinder.c.f t;
    private j u;
    private boolean v;
    private boolean w;

    public ActivityLogin()
    {
        i = false;
        u = null;
        v = false;
    }

    static com.tinder.c.f a(ActivityLogin activitylogin)
    {
        return activitylogin.k;
    }

    private void a(String s1)
    {
        b.a(this, s1, false);
    }

    private void h()
    {
        if (AccessToken.a() == null)
        {
            AccessToken.b();
        } else
        {
            Object obj = AccessToken.a().b;
            String s1;
            for (Iterator iterator = AccessToken.a().c.iterator(); iterator.hasNext(); com.tinder.utils.v.b((new StringBuilder("Facebook Permission declined: ")).append(s1).toString()))
            {
                s1 = (String)iterator.next();
            }

            c.c = ((Set) (obj));
            obj = c;
            ArrayList arraylist = new ArrayList(((f) (obj)).a.size());
            ArrayList arraylist1;
            int i1;
            if (((f) (obj)).c == null)
            {
                i1 = 0;
            } else
            {
                i1 = ((f) (obj)).c.size();
            }
            arraylist1 = new ArrayList(i1);
            arraylist.addAll(((f) (obj)).a);
            if (((f) (obj)).c != null)
            {
                arraylist1.addAll(((f) (obj)).c);
                arraylist.removeAll(arraylist1);
            }
            arraylist.removeAll(((f) (obj)).b);
            if (!arraylist.isEmpty())
            {
                com.tinder.utils.v.b("Missing some required(!) facebook permissions!");
                u = new j(this);
                u.setOnDismissListener(new android.content.DialogInterface.OnDismissListener(arraylist) {

                    final List a;
                    final ActivityLogin b;

                    public final void onDismiss(DialogInterface dialoginterface)
                    {
                        b.c.a(b, (String[])a.toArray(new String[a.size()]));
                    }

            
            {
                b = ActivityLogin.this;
                a = list;
                super();
            }
                });
                u.show();
                return;
            }
        }
    }

    private void i()
    {
        if (u != null && u.isShowing())
        {
            com.tinder.utils.v.b("Not launching main activity, missing permissions.");
            h();
            return;
        } else
        {
            findViewById(0x7f0e00a5).animate().scaleX(0.0F).scaleY(0.0F).setInterpolator(new AnticipateInterpolator()).setDuration(300L).setListener(new av() {

                final ActivityLogin a;

                public final void onAnimationEnd(Animator animator)
                {
                    a.startActivity(new Intent(a, com/tinder/activities/ActivityMain));
                    a.overridePendingTransition(0, 0x7f04000d);
                    a.finish();
                }

            
            {
                a = ActivityLogin.this;
                super();
            }
            });
            return;
        }
    }

    private boolean j()
    {
        Object obj = (ConnectivityManager)getSystemService("connectivity");
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = ((ConnectivityManager) (obj)).isDefaultNetworkActive();
        } else
        {
            obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
            if (obj != null && ((NetworkInfo) (obj)).isConnected())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (flag)
        {
            com.facebook.login.d.a();
            com.facebook.login.d.b();
            obj = new Intent(this, com/tinder/activities/ActivityLogin);
            ((Intent) (obj)).addFlags(0x808000);
            startActivity(((Intent) (obj)));
            return true;
        }
        obj = new com.tinder.c.f(this, 0x7f060101, 0x7f0600b2);
        ((com.tinder.c.f) (obj)).a(false);
        ((com.tinder.c.f) (obj)).setCancelable(false);
        ((com.tinder.c.f) (obj)).setCanceledOnTouchOutside(false);
        ((com.tinder.c.f) (obj)).c(0x7f060150, new android.view.View.OnClickListener(((com.tinder.c.f) (obj))) {

            final com.tinder.c.f a;
            final ActivityLogin b;

            public final void onClick(View view)
            {
                ad.c(a);
                b.moveTaskToBack(true);
                b.finish();
            }

            
            {
                b = ActivityLogin.this;
                a = f1;
                super();
            }
        });
        if (!isFinishing())
        {
            ((com.tinder.c.f) (obj)).show();
        }
        return false;
    }

    private void k()
    {
        ad.c(a);
    }

    private void l()
    {
        if (k == null || !k.isShowing())
        {
            k = new com.tinder.c.f(this, 0x7f060101, 0x7f0600c4);
            k.a(true);
            k.c(0x7f060150, new android.view.View.OnClickListener() {

                final ActivityLogin a;

                public final void onClick(View view)
                {
                    ad.c(com.tinder.activities.ActivityLogin.a(a));
                }

            
            {
                a = ActivityLogin.this;
                super();
            }
            });
            k.show();
        }
    }

    public final void a()
    {
        if (g)
        {
            l();
            g = false;
            SparksEvent sparksevent = new SparksEvent("Account.FbLogin");
            sparksevent.put("success", Boolean.valueOf(false));
            com.tinder.managers.a.a(sparksevent);
        }
        b.a(false);
    }

    public final void a(FacebookException facebookexception)
    {
        facebookexception = new SparksEvent("Account.FbLogin");
        facebookexception.put("success", Boolean.valueOf(false));
        com.tinder.managers.a.a(facebookexception);
        l();
    }

    public final void a(Object obj)
    {
        obj = (e)obj;
        if (!h)
        {
            h = true;
            obj = ((e) (obj)).a.d;
            if (!b.f())
            {
                if (a == null)
                {
                    a = new u(this);
                }
                a.show();
                a(((String) (obj)));
            }
            if (i)
            {
                FacebookAnalyticsUtils.trackEvent("EVENT_NAME_COMPLETED_REGISTRATION");
            }
            c.a(new com.tinder.utils.d.a() {

                final ActivityLogin a;

                public final void a(FacebookUser facebookuser)
                {
                    a.f.a(facebookuser);
                }

            
            {
                a = ActivityLogin.this;
                super();
            }
            });
            a(true);
        }
    }

    public final boolean a(boolean flag)
    {
        boolean flag1 = b.f();
        if (flag1)
        {
            w = true;
            String s1 = com.tinder.managers.f.a();
            h();
            if (flag)
            {
                (new StringBuilder("Logging in, using facebook token ")).append(s1).append(" to get a tinder token");
                a(s1);
            }
            return flag1;
        } else
        {
            b(q);
            return flag1;
        }
    }

    public final void d()
    {
        g = true;
    }

    public final void e()
    {
        s = bt.a(getString(0x7f06021f));
        a(s, bt.a);
    }

    public final void f()
    {
        a(r, "FRAGMENT_PRIVACY");
    }

    public final void g()
    {
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        j.a(i1, j1, intent);
        if (u != null && j1 == -1)
        {
            u.dismiss();
            a(true);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001e);
        AccessToken.b();
        ManagerApp.h().a(this);
        Intent intent;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (com.tinder.managers.d.b() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (AccessToken.a() != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (e.b() != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!flag && !flag1 && !flag2)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        i = flag3;
        j = new CallbackManagerImpl();
        q = new FragmentIntro();
        r = new ba();
        s = new bt();
        intent = getIntent();
        if (bundle == null)
        {
            if (intent.hasExtra("show delete account dialog"))
            {
                t = new com.tinder.c.e(this);
                t.show();
            }
            v = intent.hasExtra("extra_show_intro");
        }
        F();
        if (v)
        {
            b(q);
            return;
        }
        if (!b.f())
        {
            (new AsyncTask() {

                final ActivityLogin a;

                protected final Object doInBackground(Object aobj[])
                {
                    aobj = ((AccessToken[])aobj)[0];
                    (new StringBuilder("Currently the access token is: ")).append(((Object) (aobj)));
                    if (aobj != null)
                    {
                        return ((Object) (aobj));
                    }
                    new s();
                    if (com.facebook.s.a())
                    {
                        aobj = AccessToken.a();
                    }
                    (new StringBuilder("Token loaded is: ")).append(((Object) (aobj)));
                    return ((Object) (aobj));
                }

                protected final void onPostExecute(Object obj)
                {
                    obj = (AccessToken)obj;
                    if (obj != null && !a.b.f())
                    {
                        a.b.a(new m(this) {

                            final _cls2 a;

                            public final void onTinderLoginFailure()
                            {
                                a.a.onTinderLoginFailure();
                                a.a.a(false);
                            }

                            public final void onTinderLoginFailureAccessDenied()
                            {
                                a.a.onTinderLoginFailureAccessDenied();
                                a.a.a(false);
                            }

                            public final void onTinderLoginSuccess()
                            {
                                a.a.onTinderLoginSuccess();
                                a.a.a(false);
                            }

                            public final void onVerificationNeeded(boolean flag, boolean flag1, boolean flag2)
                            {
                                a.a.onVerificationNeeded(flag, flag1, flag2);
                                a.a.a(false);
                            }

            
            {
                a = _pcls2;
                super();
            }
                        }, ((AccessToken) (obj)).d, false);
                        return;
                    } else
                    {
                        a.a(true);
                        return;
                    }
                }

            
            {
                a = ActivityLogin.this;
                super();
            }
            }).execute(new AccessToken[] {
                AccessToken.a()
            });
            return;
        } else
        {
            a(true);
            c.a(new com.tinder.utils.d.a() {

                final ActivityLogin a;

                public final void a(FacebookUser facebookuser)
                {
                    a.f.a(facebookuser);
                }

            
            {
                a = ActivityLogin.this;
                super();
            }
            });
            return;
        }
    }

    public void onDestroy()
    {
        k();
        ad.c(t);
        u = null;
        super.onDestroy();
    }

    public void onEvent(EventLocationSet eventlocationset)
    {
        ManagerApp.d();
        ManagerApp.k().a();
    }

    public void onEvent(EventLoggedOut eventloggedout)
    {
        ManagerApp.h().a(this);
    }

    public void onPause()
    {
        super.onPause();
        ad.c(k);
        ManagerApp.h().l().a(this);
    }

    protected void onResume()
    {
        super.onResume();
        h();
        ManagerApp.h().l().a(this, this);
        g = false;
        h = false;
    }

    public void onTinderLoginFailure()
    {
        k();
        if (j())
        {
            Toast.makeText(this, 0x7f0600af, 1).show();
        }
    }

    public void onTinderLoginFailureAccessDenied()
    {
        k();
        if (!j())
        {
            Toast.makeText(this, 0x7f0600af, 1).show();
        }
    }

    public void onTinderLoginSuccess()
    {
        k();
        if (!w)
        {
            b.e();
            com.tinder.managers.a.a("Account.Intro");
            SparksEvent sparksevent = new SparksEvent("Account.FbLogin");
            sparksevent.put("success", Boolean.valueOf(true));
            com.tinder.managers.a.a(sparksevent);
        }
        Object obj = new SparksEvent("Device");
        ((SparksEvent) (obj)).put("manu", Build.MANUFACTURER);
        ((SparksEvent) (obj)).put("model", Build.MODEL);
        ((SparksEvent) (obj)).put("osVersion", com.tinder.utils.k.d());
        ((SparksEvent) (obj)).put("dataProvider", com.tinder.utils.k.c());
        com.tinder.managers.a.a(((SparksEvent) (obj)));
        obj = new JSONObject(com.tinder.managers.a.a(new HashMap(19), false));
        try
        {
            if (com.tinder.managers.d.c() != null && com.tinder.managers.d.c().listPurchases != null && !com.tinder.managers.d.c().listPurchases.isEmpty())
            {
                ((JSONObject) (obj)).put("tinderPlusSku", ((TinderPurchase)com.tinder.managers.d.c().listPurchases.get(0)).productId);
            }
            com.taplytics.a.b.a(((JSONObject) (obj)));
        }
        catch (JSONException jsonexception)
        {
            com.tinder.utils.v.a("Failed to build json user data blob for AB Testing.", jsonexception);
        }
        if (!isFinishing())
        {
            i();
        }
    }

    public void onVerificationNeeded(boolean flag, boolean flag1, boolean flag2)
    {
        (new StringBuilder("isBanned=")).append(flag).append(", isAgeVerificationNeeded=").append(flag1).append(", isGenderVerificationNeeded=").append(flag2);
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_banned", flag);
        bundle.putBoolean("is_age_verification_needed", flag1);
        bundle.putBoolean("is_gender_verification_needed", flag2);
        ae.m();
        Intent intent = new Intent(getApplicationContext(), com/tinder/activities/ActivityVerification);
        intent.putExtras(bundle);
        startActivity(intent);
        finish();
    }

    public final com.facebook.d z_()
    {
        return j;
    }
}
