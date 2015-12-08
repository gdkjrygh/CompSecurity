// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.m;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.c;
import com.taplytics.ci;
import com.taplytics.gs;
import com.taplytics.hi;
import com.taplytics.j;
import com.taplytics.shelduck;
import com.tinder.a.a;
import com.tinder.a.f;
import com.tinder.a.g;
import com.tinder.adapters.ActivityMainPagerAdapter;
import com.tinder.adapters.l;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.c.n;
import com.tinder.e.ab;
import com.tinder.e.aq;
import com.tinder.e.q;
import com.tinder.e.v;
import com.tinder.e.w;
import com.tinder.enums.PaywallPerk;
import com.tinder.events.EventLoggedOut;
import com.tinder.events.EventPurchaseFlowComplete;
import com.tinder.events.EventPurchaseFlowError;
import com.tinder.events.EventPurchaseRestoreConfirmed;
import com.tinder.f.ak;
import com.tinder.fragments.FragmentAnchoredPopup;
import com.tinder.fragments.FragmentSideMenu;
import com.tinder.fragments.ac;
import com.tinder.fragments.af;
import com.tinder.fragments.bd;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ad;
import com.tinder.managers.ae;
import com.tinder.managers.ai;
import com.tinder.managers.d;
import com.tinder.managers.e;
import com.tinder.managers.i;
import com.tinder.managers.y;
import com.tinder.managers.z;
import com.tinder.model.FacebookAnalyticsUtils;
import com.tinder.model.Match;
import com.tinder.model.SparksEvent;
import com.tinder.model.TinderLocation;
import com.tinder.model.TinderPurchase;
import com.tinder.model.User;
import com.tinder.views.CustomDrawerLayout;
import com.tinder.views.SinkPageTransformer;
import com.tinder.views.SkippableViewPager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.activities:
//            ActivityUsername, ActivityLogin

public class ActivityMain extends ActivitySignedInBase
    implements android.support.v4.view.ViewPager.f, android.support.v4.widget.DrawerLayout.f, android.support.v7.widget.SearchView.OnQueryTextListener, aq, q, v, w, com.tinder.fragments.ac.a, com.tinder.managers.g.a
{

    private FragmentAnchoredPopup C;
    private FragmentAnchoredPopup D;
    private SinkPageTransformer E;
    private boolean F;
    private boolean G;
    private Match H;
    private af I;
    private boolean J;
    private Handler K;
    y a;
    d b;
    i c;
    ae d;
    z e;
    ad f;
    e g;
    ai h;
    public ActivityMainPagerAdapter i;
    public CustomDrawerLayout j;
    public SkippableViewPager k;

    public ActivityMain()
    {
        super(true);
        K = new Handler();
    }

    private void K()
    {
        f.e(true);
        f.d(false);
        ac ac1 = i.b;
        if (ac1 != null)
        {
            ac1.b();
        }
    }

    private void a(Intent intent)
    {
        byte byte1;
        byte1 = -1;
        e e1 = g;
        e1.a = null;
        e1.b = null;
        e1.d = null;
        e1.c = null;
        e1.e = null;
        if (intent == null || intent.getAction() == null) goto _L2; else goto _L1
_L1:
        Object obj = intent.getAction();
        ((String) (obj)).hashCode();
        JVM INSTR tableswitch -1173171990 -1173171990: default 72
    //                   -1173171990 97;
           goto _L3 _L4
_L3:
        byte byte0 = -1;
_L7:
        byte0;
        JVM INSTR tableswitch 0 0: default 96
    //                   0 112;
           goto _L2 _L5
_L2:
        return;
_L4:
        if (!((String) (obj)).equals("android.intent.action.VIEW")) goto _L3; else goto _L6
_L6:
        byte0 = 0;
          goto _L7
_L5:
        if (!b.f()) goto _L9; else goto _L8
_L8:
        Object obj1;
        obj = g;
        intent = intent.getData();
        obj1 = new ab() {

            final ActivityMain a;

            public final void onProfileLoadFailed()
            {
                Toast.makeText(a.getApplicationContext(), 0x7f060210, 0).show();
            }

            public final void onProfileLoaded(User user)
            {
label0:
                {
                    int i1;
                    int j1;
label1:
                    {
                        if (user == null || a.e.b() == null)
                        {
                            break label0;
                        }
                        String s3 = a.e.b().getAge();
                        String s4 = user.getAge();
                        if (s4 != null && s3 != null)
                        {
                            i1 = Integer.parseInt(s3);
                            j1 = Integer.parseInt(s4);
                            if (i1 >= 18 || j1 < 18)
                            {
                                break label1;
                            }
                            Toast.makeText(a.getApplicationContext(), 0x7f060258, 0).show();
                        }
                        return;
                    }
                    if (i1 >= 18 && j1 < 18)
                    {
                        Toast.makeText(a.getApplicationContext(), 0x7f06026d, 0).show();
                        return;
                    }
                    Object obj2 = a.c;
                    Object obj3 = user.getId();
                    obj2 = com.b.a.d.a(((i) (obj2)).a).a(new com.tinder.managers.n(((String) (obj3)))).b();
                    if (obj2 == null || !((com.b.a.c) (obj2)).c())
                    {
                        obj2 = null;
                    } else
                    {
                        obj2 = (Match)((com.b.a.c) (obj2)).b();
                    }
                    if (obj2 != null)
                    {
                        com.tinder.activities.ActivityMain.a(a);
                        a.i();
                        a.a(((Match) (obj2)), false);
                        return;
                    }
                    if (user.getId().equals(a.e.b().getId()))
                    {
                        com.tinder.activities.ActivityMain.a(a);
                        a.q();
                        return;
                    }
                    obj2 = ActivityMain.b(a);
                    obj3 = ((com.tinder.managers.ab) (obj2)).a.iterator();
                    do
                    {
                        if (!((Iterator) (obj3)).hasNext())
                        {
                            break;
                        }
                        User user1 = (User)((Iterator) (obj3)).next();
                        if (user1.getId().equals(user.getId()))
                        {
                            ((com.tinder.managers.ab) (obj2)).a.remove(user1);
                        }
                    } while (true);
                    ((com.tinder.managers.ab) (obj2)).a.add(0, user);
                    user = com.tinder.activities.ActivityMain.c(a).b;
                    if (user != null)
                    {
                        user = user.h();
                        if (user != null)
                        {
                            user.a();
                            user.a(true);
                        }
                    }
                    com.tinder.activities.ActivityMain.d(a).closeDrawer();
                    a.o();
                    a.f();
                    return;
                }
                Toast.makeText(a.getApplicationContext(), 0x7f060210, 0).show();
            }

            
            {
                a = ActivityMain.this;
                super();
            }
        };
        obj.a = intent;
        obj.c = intent.toString();
        intent = ((e) (obj)).c.replace((new StringBuilder()).append(intent.getScheme()).append("://").toString(), "").split("/");
        obj.e = ((e) (obj)).a.getQueryParameter("source");
        if (((e) (obj)).e == null)
        {
            obj.e = "";
        }
        if (intent.length <= 0) goto _L2; else goto _L10
_L10:
        String s1 = intent[0];
        s1.hashCode();
        JVM INSTR lookupswitch 2: default 260
    //                   117: 341
    //                   1812186700: 361;
           goto _L11 _L12 _L13
_L11:
        byte0 = byte1;
_L17:
        byte0;
        JVM INSTR tableswitch 0 1: default 288
    //                   0 381
    //                   1 508;
           goto _L14 _L15 _L16
_L14:
        (new StringBuilder("Processed deep link: ")).append(((e) (obj)).c).append(", ").append(intent[0]).append(", ").append(((e) (obj)).d).append(", ").append(((e) (obj)).e);
        return;
_L12:
        byte0 = byte1;
        if (s1.equals("u"))
        {
            byte0 = 0;
        }
          goto _L17
_L13:
        byte0 = byte1;
        if (s1.equals("getUsername"))
        {
            byte0 = 1;
        }
          goto _L17
_L15:
        obj.d = intent[1];
        e.f = true;
        if (!((e) (obj)).d.isEmpty())
        {
            z z1 = ((e) (obj)).h;
            String s2 = ((e) (obj)).d;
            com.tinder.managers.e._cls1 _lcls1 = new com.tinder.managers.e._cls1(((e) (obj)), ((ab) (obj1)));
            obj1 = new com.tinder.managers.e._cls2(((e) (obj)), ((ab) (obj1)));
            obj1 = new a((new StringBuilder()).append(z1.a.S).append(s2).toString(), com.tinder.a.a.k(), com.tinder.managers.z.b(s2), new com.tinder.managers.z._cls14(z1, _lcls1), new com.tinder.managers.z._cls15(z1, ((com.android.volley.i.a) (obj1))));
            ManagerApp.b().a(((Request) (obj1)));
        }
          goto _L14
_L16:
        ((ab) (obj1)).onProfileLoadFailed();
        obj1 = new Intent(ManagerApp.c(), com/tinder/activities/ActivityUsername);
        ((Intent) (obj1)).addFlags(0x10000000);
        ManagerApp.c().startActivity(((Intent) (obj1)));
          goto _L14
_L9:
        startActivity(new Intent(this, com/tinder/activities/ActivityLogin));
        finish();
        return;
          goto _L7
    }

    static void a(ActivityMain activitymain)
    {
        Object obj = activitymain.i;
        if (((ActivityMainPagerAdapter) (obj)).d.size() > 0)
        {
            obj = (com.tinder.adapters.ActivityMainPagerAdapter.ModalType)((ActivityMainPagerAdapter) (obj)).d.get(((ActivityMainPagerAdapter) (obj)).d.size() - 1);
        } else
        {
            obj = com.tinder.adapters.ActivityMainPagerAdapter.ModalType.a;
        }
        if (obj == com.tinder.adapters.ActivityMainPagerAdapter.ModalType.b)
        {
            activitymain.H = null;
            activitymain.F = false;
            activitymain.r();
            activitymain.i.a();
        } else
        if (obj == com.tinder.adapters.ActivityMainPagerAdapter.ModalType.c || obj == com.tinder.adapters.ActivityMainPagerAdapter.ModalType.e || obj == com.tinder.adapters.ActivityMainPagerAdapter.ModalType.f || obj == com.tinder.adapters.ActivityMainPagerAdapter.ModalType.d)
        {
            activitymain.r();
            activitymain.i.a();
            return;
        }
    }

    static boolean a(ActivityMain activitymain, Activity activity)
    {
        return activitymain.a(activity);
    }

    static com.tinder.managers.ab b(ActivityMain activitymain)
    {
        return activitymain.s;
    }

    static ActivityMainPagerAdapter c(ActivityMain activitymain)
    {
        return activitymain.i;
    }

    static CustomDrawerLayout d(ActivityMain activitymain)
    {
        return activitymain.j;
    }

    static SkippableViewPager e(ActivityMain activitymain)
    {
        return activitymain.k;
    }

    public final void A()
    {
        Object obj;
label0:
        {
            K();
            obj = i.b;
            if (obj != null)
            {
                if (!f.k)
                {
                    break label0;
                }
                obj = (bd)((ac) (obj)).C.c;
                if (obj != null)
                {
                    ((bd) (obj)).c(true);
                }
            }
            return;
        }
        ((ac) (obj)).a("discover off");
    }

    public final void B()
    {
        Toast.makeText(this, 0x7f0600a7, 1).show();
    }

    public final void B_()
    {
        if (ManagerApp.f())
        {
            K.postDelayed(new Runnable() {

                final ActivityMain a;

                public final void run()
                {
                    if (!com.tinder.activities.ActivityMain.a(a, a))
                    {
                        a.B_();
                    }
                }

            
            {
                a = ActivityMain.this;
                super();
            }
            }, 10000L);
            return;
        } else
        {
            com.tinder.utils.v.b("Not refreshing location, we're not in the foreground.");
            return;
        }
    }

    public final void C()
    {
        ac ac1;
label0:
        {
            ac1 = i.b;
            if (ac1 != null)
            {
                if (!f.k)
                {
                    break label0;
                }
                ac1.b(false);
            }
            return;
        }
        ac1.a("discover off");
    }

    public final void D()
    {
        if (k != null)
        {
            k.addOnPageChangeListener(this);
        }
    }

    public final void E()
    {
        if (k != null)
        {
            k.removeOnPageChangeListener(this);
        }
    }

    public final void a(int i1)
    {
        if (i1 == 0)
        {
            if (k.getCurrentItem() > 0)
            {
                E.setShouldBounce(false);
                for (i1 = i.getCount(); i1 - 1 > k.getCurrentItem(); i1--)
                {
                    i.a();
                }

            } else
            {
                Object obj = i;
                ((ActivityMainPagerAdapter) (obj)).d.clear();
                ((ActivityMainPagerAdapter) (obj)).notifyDataSetChanged();
                E.setShouldBounce(true);
                obj = i.b;
                if (obj != null && ((ac) (obj)).b.getCurrentItem() == 0)
                {
                    com.tinder.managers.a.a("Recs.Start");
                }
            }
        }
    }

    public final void a(int i1, float f1, int j1)
    {
    }

    public final void a(af af1)
    {
        I = af1;
        if (af1 == null)
        {
            H = null;
        }
    }

    public final void a(Match match)
    {
        H = match;
        if (match != null)
        {
            J = match.hasNewMessage();
        }
        (new StringBuilder("Match has new message? ")).append(J);
    }

    public final void a(Match match, boolean flag)
    {
        if (match == null)
        {
            com.tinder.utils.v.b("Attempted to enter match view with a null match, preventing");
            return;
        }
        if (match.equals(H))
        {
            com.tinder.utils.v.b("Attempted to enter match view which we're already in, preventing");
            return;
        } else
        {
            (new StringBuilder("showing ")).append(match);
            H = match;
            F = flag;
            ActivityMainPagerAdapter activitymainpageradapter = i;
            (new StringBuilder("match=")).append(match);
            activitymainpageradapter.d.add(com.tinder.adapters.ActivityMainPagerAdapter.ModalType.b);
            activitymainpageradapter.c = match;
            activitymainpageradapter.notifyDataSetChanged();
            t();
            return;
        }
    }

    public final void a(TinderLocation tinderlocation)
    {
        if (ae.a())
        {
            TinderLocation tinderlocation1 = a.b;
            boolean flag;
            if (tinderlocation1 != null && tinderlocation1.equals(tinderlocation))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                ManagerApp.b().a(new Object[] {
                    "travel_request", "get_recs"
                });
                ManagerApp.b().a("travel_request");
                Object obj = a;
                (new StringBuilder("ENTER ")).append(tinderlocation.getLatitude()).append(" , ").append(tinderlocation.getLongitude());
                ((y) (obj)).b(tinderlocation);
                JSONObject jsonobject = new JSONObject();
                com.android.volley.Request.Priority priority;
                String s1;
                try
                {
                    jsonobject.put("lat", tinderlocation.getLatitude());
                    jsonobject.put("lon", tinderlocation.getLongitude());
                }
                catch (JSONException jsonexception)
                {
                    com.tinder.utils.v.b(jsonexception.toString());
                }
                priority = com.android.volley.Request.Priority.d;
                s1 = ((y) (obj)).d.w;
                tinderlocation = new com.tinder.managers.y._cls6(((y) (obj)), this, tinderlocation);
                obj = new com.tinder.managers.y._cls7(((y) (obj)), this);
                ManagerApp.h().g();
                tinderlocation = new g(priority, 1, s1, jsonobject, tinderlocation, ((com.android.volley.i.a) (obj)), com.tinder.managers.d.b());
                tinderlocation.l = "travel_request";
                tinderlocation.j = new c(20000, 0, 1.0F);
                ManagerApp.b().a(tinderlocation);
            }
            return;
        } else
        {
            launchPlusSubscriptionPaywall(2, PaywallPerk.PASSPORT);
            return;
        }
    }

    public final void b(int i1)
    {
        if (i1 <= 0) goto _L2; else goto _L1
_L1:
        j.setDrawerLockMode(1);
        Object obj = i.b;
        if (obj != null)
        {
            obj = ((ac) (obj)).h();
            if (obj != null)
            {
                ((bd) (obj)).o();
            }
        }
_L4:
        return;
_L2:
        Object obj1;
        obj1 = i.b;
        if (obj1 != null)
        {
            switch (((ac) (obj1)).b.getCurrentItem())
            {
            default:
                break;

            case 0: // '\0'
                break; /* Loop/switch isn't completed */

            case 1: // '\001'
                break;
            }
            break MISSING_BLOCK_LABEL_140;
        }
_L5:
        j.setDrawerLockMode(0);
        if (J)
        {
            com.tinder.utils.ac.a().b = true;
            a("newMessage");
            J = false;
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj1 = ((ac) (obj1)).C.c;
        if (obj1 instanceof bd)
        {
            ((bd)obj1).h();
        }
          goto _L5
        z.i();
        (new SparksEvent("Match.List")).put("numMatches", Integer.valueOf(c.j())).put("numMessages", Long.valueOf(c.d())).put("numUnreadMessages", Long.valueOf(c.e())).put("numUnreadMatches", Long.valueOf(c.h())).fire();
          goto _L5
    }

    protected final int c()
    {
        return 0x7f03008a;
    }

    public final FragmentAnchoredPopup e()
    {
        C = (FragmentAnchoredPopup)b("passport");
        return C;
    }

    public final void f()
    {
        ac ac1 = i.b;
        if (ac1 != null)
        {
            ac1.b.setCurrentItem(0, true);
        }
    }

    public final void g()
    {
        G();
    }

    public final void h()
    {
        if (j.isDrawerOpen())
        {
            j.closeDrawer();
            return;
        } else
        {
            j.openDrawer();
            return;
        }
    }

    public final void i()
    {
        ac ac1 = i.b;
        if (ac1 != null)
        {
            ac1.b.setCurrentItem(1);
        }
    }

    public final void j()
    {
        ac ac1 = i.b;
        if (ac1 != null)
        {
            ac1.b();
        }
    }

    public final Match k()
    {
        return H;
    }

    public final boolean l()
    {
        return F;
    }

    public final boolean m()
    {
        return G;
    }

    public final void n()
    {
        G = false;
    }

    public final void o()
    {
        H = null;
        k.setCurrentItem(0, true);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        String.format("onActivityResult: requestCode[%s] responseCode[%s]", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1)
        });
        switch (i1)
        {
        default:
            super.onActivityResult(i1, j1, intent);
            return;

        case 9455: 
            switch (j1)
            {
            default:
                return;

            case -1: 
                intent = (TinderLocation)intent.getParcelableExtra("tinderlocation");
                break;
            }
            break;
        }
        if (intent != null)
        {
            a(intent);
            return;
        } else
        {
            com.tinder.utils.v.b("No location in data passed back by ActivityPassport");
            return;
        }
    }

    public void onBackPressed()
    {
        if (j.isDrawerOpen())
        {
            j.closeDrawer();
        } else
        {
            if (k.getCurrentItem() > 0)
            {
                k.setCurrentItem(0, true);
                return;
            }
            if (i.b != null && i.b.B)
            {
                i.b.a(true);
                return;
            }
            if (i.b != null && i.b.b.getCurrentItem() != 0)
            {
                f();
                return;
            }
            boolean flag;
            boolean flag1;
            if (C != null && C.c())
            {
                C.b();
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (D != null)
            {
                flag1 = flag;
                if (D.c())
                {
                    D.b();
                    flag1 = true;
                }
            }
            if (I())
            {
                flag1 = true;
            }
            com.tinder.utils.ad.a(new Dialog[] {
                B
            });
            if (!flag1)
            {
                super.onBackPressed();
                return;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        (new StringBuilder("instance bundle=")).append(bundle);
        (new StringBuilder("density=")).append(com.tinder.utils.ad.d(this));
        ManagerApp.h().a(this);
        super.onCreate(bundle);
        j = (CustomDrawerLayout)findViewById(0x7f0e020e);
        k = (SkippableViewPager)findViewById(0x7f0e020f);
        com.tinder.utils.ad.a(k, 650);
        j.setDrawerListener(this);
        j.setGravity(0x800003);
        i = new ActivityMainPagerAdapter(getSupportFragmentManager());
        k.setAdapter(i);
        E = new SinkPageTransformer(this);
        E.setShouldBounce(true);
        k.setPageTransformer(false, E);
        Object obj = a;
        if (this == null)
        {
            obj.c = null;
        } else
        {
            obj.c = new WeakReference(this);
        }
        obj = getIntent().getExtras();
        if (obj == null || bundle != null)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        if (!((Bundle) (obj)).getBoolean("from_push", false) || !((Bundle) (obj)).getBoolean("is_message") && !((Bundle) (obj)).getBoolean("is_match"))
        {
            break MISSING_BLOCK_LABEL_248;
        }
        bundle = (Match)((Bundle) (obj)).getParcelable("match");
        G = true;
        if (bundle != null)
        {
            try
            {
                a(bundle, false);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                com.tinder.utils.v.a("Failed to read intent extras", bundle);
            }
        }
        a(getIntent());
        if (!ae.A() && ae.B())
        {
            com.tinder.sunset.d.a().a(null);
        }
        (new com.tinder.c.z()).show(getSupportFragmentManager(), "");
        h.a();
        bundle = ManagerApp.n;
        ae.b.putString("APP VERSION NUM", bundle);
        ae.b.commit();
        return;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return true;
    }

    public void onDestroy()
    {
        k.removeOnPageChangeListener(this);
        com.tinder.utils.ad.c(B);
        FacebookAnalyticsUtils.flush();
        super.onDestroy();
    }

    public void onDrawerClosed(View view)
    {
        view = i.b;
        if (view != null)
        {
            Object obj = ((ac) (view)).C.c;
            if (((ac) (view)).b == null || view.getActivity() == null)
            {
                com.tinder.utils.v.b("Couldn't get page or activity on drawer closed");
            } else
            if (((ac) (view)).b.getCurrentItem() == 0 && (obj instanceof bd))
            {
                view = (ActivityMain)view.getActivity();
                int i1;
                if (((ActivityMain) (view)).k == null)
                {
                    i1 = -1;
                } else
                {
                    i1 = ((ActivityMain) (view)).k.getCurrentItem();
                }
                if (i1 == 0)
                {
                    com.tinder.managers.a.a("Recs.Start");
                }
            }
        }
        view = (FragmentSideMenu)getSupportFragmentManager().a(0x7f0e0210);
        if (view != null)
        {
            boolean flag;
            if (((FragmentSideMenu) (view)).o.getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = (new SparksEvent("Menu.Close")).put("plusMenuOffer", Boolean.valueOf(flag));
            ((SparksEvent) (obj)).put("isPlusOffered", Boolean.valueOf(flag));
            if (flag)
            {
                ((SparksEvent) (obj)).put("plusMenuOffer", FragmentSideMenu.c);
            }
            com.tinder.managers.a.a(((SparksEvent) (obj)));
            view.a();
        }
    }

    public void onDrawerOpened(View view)
    {
        view = i.b;
        if (view != null)
        {
            view.a(true);
            android.support.v4.app.Fragment fragment = ((ac) (view)).C.c;
            if (((ac) (view)).b.getCurrentItem() == 0 && (fragment instanceof bd))
            {
                com.tinder.managers.a.a("Recs.End");
            }
        }
        view = (FragmentSideMenu)getSupportFragmentManager().a(0x7f0e0210);
        if (view != null)
        {
            boolean flag;
            if (((FragmentSideMenu) (view)).o.getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view = (new SparksEvent("Menu.Open")).put("plusMenuOffer", Boolean.valueOf(flag));
            view.put("isPlusOffered", Boolean.valueOf(flag));
            if (flag)
            {
                view.put("plusMenuOffer", FragmentSideMenu.c);
            }
            com.tinder.managers.a.a(view);
        }
    }

    public void onDrawerSlide(View view, float f1)
    {
    }

    public void onDrawerStateChanged(int i1)
    {
        if (2 == i1 && (FragmentSideMenu)getSupportFragmentManager().a(0x7f0e0210) != null && j.isDrawerOpen())
        {
            FragmentSideMenu.b();
        }
    }

    public void onEvent(EventLoggedOut eventloggedout)
    {
        ManagerApp.h().a(this);
    }

    public void onEventMainThread(EventPurchaseFlowComplete eventpurchaseflowcomplete)
    {
        String s1;
        int i1 = -1;
        if (q != null)
        {
            i1 = q.b;
        }
        if (i1 == 0)
        {
            Object obj = i.b;
            if (obj != null)
            {
                obj = ((ac) (obj)).h();
                if (obj != null)
                {
                    ((bd) (obj)).b();
                    ((bd) (obj)).h();
                }
            }
        }
        Object obj1 = null;
        s1 = eventpurchaseflowcomplete.getPurchase().productId;
        Iterator iterator = super.A.iterator();
        do
        {
            eventpurchaseflowcomplete = obj1;
            if (!iterator.hasNext())
            {
                break;
            }
            eventpurchaseflowcomplete = (com.a.a.a.a.f)iterator.next();
        } while (!((com.a.a.a.a.f) (eventpurchaseflowcomplete)).a.equals(s1));
        if (eventpurchaseflowcomplete == null) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = new JSONObject();
        Object obj2;
        try
        {
            jsonobject.put("currency", ((com.a.a.a.a.f) (eventpurchaseflowcomplete)).e);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            com.tinder.utils.v.a("Failed to add currencyCode to revenue", ((Throwable) (obj2)));
        }
        obj2 = ((com.a.a.a.a.f) (eventpurchaseflowcomplete)).f;
        if (ci.b().d != null)
        {
            eventpurchaseflowcomplete = ci.b().d;
            break MISSING_BLOCK_LABEL_154;
        }
        Log.w("Taplytics", "Taplytics not yet instantiated. Call Taplytics.startTaplytics before any other Taplytics call.");
          goto _L3
_L2:
        eventpurchaseflowcomplete = i.b;
        if (eventpurchaseflowcomplete != null)
        {
            eventpurchaseflowcomplete.b();
        }
        Toast.makeText(ManagerApp.c(), 0x7f060181, 0).show();
        return;
        if (ci.b().j && !hi.a(shelduck.b) && s1 != null)
        {
            if (gs.b())
            {
                gs.a((new StringBuilder("Log Revenue: ")).append(s1).append(", revenue: ").append(obj2).toString());
            }
            try
            {
                jsonobject = eventpurchaseflowcomplete.b("revenue", obj2, jsonobject);
                jsonobject.put("gn", s1);
                eventpurchaseflowcomplete.a(jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (EventPurchaseFlowComplete eventpurchaseflowcomplete)
            {
                gs.b("Track Revenue", eventpurchaseflowcomplete);
            }
        }
          goto _L2
_L3:
        if (true) goto _L2; else goto _L4
_L4:
    }

    public void onEventMainThread(EventPurchaseFlowError eventpurchaseflowerror)
    {
        com.tinder.utils.v.b((new StringBuilder("Failed to verify purchase for sku ")).append(eventpurchaseflowerror.getSku()).append(" on tinder api: ").append(eventpurchaseflowerror.getError()).toString());
        Toast.makeText(this, 0x7f06017f, 1).show();
    }

    public void onEventMainThread(EventPurchaseRestoreConfirmed eventpurchaserestoreconfirmed)
    {
        super.onEventMainThread(eventpurchaserestoreconfirmed);
        eventpurchaserestoreconfirmed = i.b;
        if (eventpurchaserestoreconfirmed != null)
        {
            eventpurchaserestoreconfirmed.b();
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 82)
        {
            if (k.getCurrentItem() == 0)
            {
                h();
            }
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        a(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        (new StringBuilder("item=")).append(menuitem);
        menuitem.getItemId();
        JVM INSTR tableswitch 16908332 16908332: default 40
    //                   16908332 42;
           goto _L1 _L2
_L1:
        return true;
_L2:
        h();
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onPause()
    {
        super.onPause();
        super.o.a(this);
        FacebookAnalyticsUtils.deactivate(this);
    }

    public boolean onQueryTextChange(String s1)
    {
        return false;
    }

    public boolean onQueryTextSubmit(String s1)
    {
        return false;
    }

    public void onResume()
    {
        super.onResume();
        if (super.n.f())
        {
            super.o.a(this, this);
            G();
            if (!super.o.c())
            {
                B_();
            }
        }
        try
        {
            FacebookAnalyticsUtils.activate(this);
        }
        catch (RuntimeException runtimeexception)
        {
            com.tinder.utils.v.a("Failed to activate facebook analytics due to runtime exception.", runtimeexception);
        }
        com.tinder.utils.ac.a();
        if (com.tinder.utils.ac.c())
        {
            a("crash");
        }
    }

    public final void p()
    {
        if (I != null)
        {
            I.j.setCurrentItem(1);
        }
    }

    public final void q()
    {
        H = null;
        j.closeDrawer();
        ActivityMainPagerAdapter activitymainpageradapter = i;
        activitymainpageradapter.d.add(com.tinder.adapters.ActivityMainPagerAdapter.ModalType.d);
        activitymainpageradapter.notifyDataSetChanged();
        t();
    }

    public final void r()
    {
        int j1 = k.getCurrentItem() - 1;
        int i1 = j1;
        if (j1 < 0)
        {
            i1 = 0;
        }
        k.setCurrentItem(i1, true);
    }

    public final void s()
    {
        ac ac1 = i.b;
        if (ac1 != null)
        {
            ac1.a(false);
        }
    }

    public final void t()
    {
        E.setShouldBounce(true);
        k.post(new Runnable() {

            final ActivityMain a;

            public final void run()
            {
                com.tinder.activities.ActivityMain.e(a).setCurrentItem(com.tinder.activities.ActivityMain.c(a).getCount() - 1);
            }

            
            {
                a = ActivityMain.this;
                super();
            }
        });
    }

    public final void u()
    {
        Toast.makeText(ManagerApp.c(), ManagerApp.c().getString(0x7f06020f), 1).show();
        ac ac1 = i.b;
        if (ac1 == null)
        {
            return;
        }
        if (ae.i())
        {
            ac1.a("fragment recommendations");
            ac1.b();
            return;
        } else
        {
            ac1.a("discover off");
            return;
        }
    }

    public final void v()
    {
        Toast.makeText(ManagerApp.c(), ManagerApp.c().getString(0x7f0600c2), 1).show();
    }

    public final void w()
    {
        Object obj = i;
        if (((ActivityMainPagerAdapter) (obj)).b != null)
        {
            obj = ((ActivityMainPagerAdapter) (obj)).b;
            if (((ac) (obj)).m.getVisibility() != 0 && ((ac) (obj)).D == 1)
            {
                ((ac) (obj)).animateIconOn(((ac) (obj)).m);
            }
        }
    }

    public final void x()
    {
        if (ae.a())
        {
            ManagerApp.b().a(new Object[] {
                "travel_request", "get_recs"
            });
            if (a.b())
            {
                Object obj1 = a;
                Object obj = com.android.volley.Request.Priority.d;
                String s1 = ((y) (obj1)).d.x;
                JSONObject jsonobject = new JSONObject();
                com.tinder.managers.y._cls8 _lcls8 = new com.tinder.managers.y._cls8(((y) (obj1)), this);
                obj1 = new com.tinder.managers.y._cls9(((y) (obj1)), this);
                ManagerApp.h().g();
                obj = new g(((com.android.volley.Request.Priority) (obj)), 1, s1, jsonobject, _lcls8, ((com.android.volley.i.a) (obj1)), com.tinder.managers.d.b());
                obj.l = "travel_request";
                obj.j = new c(20000, 0, 1.0F);
                ManagerApp.b().a(((Request) (obj)));
            }
        }
    }

    public final void y()
    {
        ac ac1;
label0:
        {
            K();
            ac1 = i.b;
            if (ac1 != null)
            {
                if (!f.k)
                {
                    break label0;
                }
                ac1.b(true);
            }
            return;
        }
        ac1.a("discover off");
    }

    public final void z()
    {
        Toast.makeText(this, 0x7f0600a7, 1).show();
    }
}
