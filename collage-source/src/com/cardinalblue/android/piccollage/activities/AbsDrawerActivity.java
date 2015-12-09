// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.view.menu.MenuItemImpl;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.motiongestures.Gesture;
import com.amazon.motiongestures.GestureEvent;
import com.amazon.motiongestures.GestureListener;
import com.amazon.motiongestures.GestureManager;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.a.i;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.lib.a;
import com.cardinalblue.android.piccollage.model.gson.IGsonable;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.view.a.e;
import com.cardinalblue.android.piccollage.view.fragments.ak;
import com.cardinalblue.android.piccollage.view.fragments.q;
import com.squareup.a.b;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseFragmentActivity, FindFriendsActivity, AccountSettingsActivity, HomeActivity

public abstract class AbsDrawerActivity extends BaseFragmentActivity
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{
    public static class OnBadgeNumberChangeEvent
        implements IGsonable
    {

        public final boolean a;

        public OnBadgeNumberChangeEvent(boolean flag)
        {
            a = flag;
        }
    }

    public static interface a
    {

        public abstract void a(View view);

        public abstract void b(View view);
    }

    private static class b extends Handler
    {

        private final WeakReference a;

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 10000 10000: default 24
        //                       10000 30;
               goto _L1 _L2
_L1:
            super.handleMessage(message);
_L4:
            return;
_L2:
            message = (AbsDrawerActivity)a.get();
            if (message != null)
            {
                ((AbsDrawerActivity) (message)).b.startAnimation(((AbsDrawerActivity) (message)).d);
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public b(AbsDrawerActivity absdraweractivity)
        {
            a = new WeakReference(absdraweractivity);
        }
    }


    private static boolean e = false;
    private static boolean f = false;
    protected DrawerLayout a;
    protected NavigationView b;
    protected Handler c;
    protected Animation d;
    private ActionBarDrawerToggle g;
    private GestureManager h;
    private Gesture i;
    private GestureListener j;
    private Callable k;
    private AtomicInteger l;
    private View m;
    private final android.support.v4.app.FragmentManager.OnBackStackChangedListener n = new android.support.v4.app.FragmentManager.OnBackStackChangedListener() {

        final AbsDrawerActivity a;

        public void onBackStackChanged()
        {
            Object obj = a.getSupportFragmentManager().findFragmentById(0x7f1000cd);
            if (obj != null)
            {
                obj = ((Fragment) (obj)).getArguments();
                if (obj != null && ((Bundle) (obj)).containsKey("key_fragment_position"))
                {
                    int i1 = ((Bundle) (obj)).getInt("key_fragment_position");
                    com.cardinalblue.android.piccollage.activities.AbsDrawerActivity.a(a).set(i1);
                    ViewCompat.setElevation(a.findViewById(0x7f1000c5), com.cardinalblue.android.piccollage.view.a.e.a(i1));
                    obj = a.b.getMenu().findItem(i1);
                    if (obj != null)
                    {
                        ((MenuItem) (obj)).setChecked(true);
                    }
                }
            }
        }

            
            {
                a = AbsDrawerActivity.this;
                super();
            }
    };

    public AbsDrawerActivity()
    {
        l = new AtomicInteger(-1);
    }

    static AtomicInteger a(AbsDrawerActivity absdraweractivity)
    {
        return absdraweractivity.l;
    }

    public static void a(boolean flag)
    {
        e = flag;
    }

    public static boolean a()
    {
        return e;
    }

    public static void b(boolean flag)
    {
        f = flag;
    }

    public static boolean b()
    {
        return f;
    }

    public static void c()
    {
        b(false);
        a(false);
    }

    private void c(boolean flag)
    {
        Object obj = b.getMenu().findItem(0x7f1002e0);
        com.cardinalblue.android.piccollage.controller.d.a().c(new OnBadgeNumberChangeEvent(flag));
        obj = ((MenuItem) (obj)).getActionView();
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        ((View) (obj)).setVisibility(i1);
    }

    protected void a(Fragment fragment)
    {
        fragment = getSupportFragmentManager().beginTransaction().replace(0x7f1000cd, fragment, "tag_drawer_fragment");
        if (getSupportFragmentManager().findFragmentByTag("tag_drawer_fragment") != null)
        {
            fragment.addToBackStack(null);
        }
        fragment.commit();
    }

    protected void a(a a1)
    {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        a = (DrawerLayout)findViewById(0x7f1000d3);
        b = (NavigationView)findViewById(0x7f100167);
        m = b.inflateHeaderView(0x7f0300a2);
        m.setOnClickListener(new android.view.View.OnClickListener() {

            final AbsDrawerActivity a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.a.b.ay("Profile");
                com.cardinalblue.android.piccollage.a.b.br();
                a.a(10000, null);
            }

            
            {
                a = AbsDrawerActivity.this;
                super();
            }
        });
        g();
        b.setNavigationItemSelectedListener(new android.support.design.widget.NavigationView.OnNavigationItemSelectedListener() {

            final AbsDrawerActivity a;

            public boolean onNavigationItemSelected(MenuItem menuitem)
            {
                menuitem.getItemId();
                JVM INSTR tableswitch 2131755742 2131755749: default 52
            //                           2131755742 67
            //                           2131755743 78
            //                           2131755744 91
            //                           2131755745 107
            //                           2131755746 52
            //                           2131755747 115
            //                           2131755748 126
            //                           2131755749 137;
                   goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7 _L8
_L1:
                return a.a(menuitem.getItemId(), null);
_L2:
                com.cardinalblue.android.piccollage.a.b.ay("My Collage");
                com.cardinalblue.android.piccollage.a.b.bq();
                continue; /* Loop/switch isn't completed */
_L3:
                com.cardinalblue.android.piccollage.a.b.ay("Explorer");
                com.cardinalblue.android.piccollage.a.b.aA("drawer");
                continue; /* Loop/switch isn't completed */
_L4:
                com.cardinalblue.android.piccollage.a.b.ay("Activity Feed");
                com.cardinalblue.android.piccollage.a.b.az("drawer");
                com.cardinalblue.android.piccollage.a.b.a();
                continue; /* Loop/switch isn't completed */
_L5:
                com.cardinalblue.android.piccollage.a.b.aB("drawer");
                continue; /* Loop/switch isn't completed */
_L6:
                com.cardinalblue.android.piccollage.a.b.ay("Find Friends");
                com.cardinalblue.android.piccollage.a.b.bs();
                continue; /* Loop/switch isn't completed */
_L7:
                com.cardinalblue.android.piccollage.a.b.ay("Setting");
                com.cardinalblue.android.piccollage.a.b.bt();
                continue; /* Loop/switch isn't completed */
_L8:
                com.cardinalblue.android.piccollage.a.b.ay("FAQ");
                com.cardinalblue.android.piccollage.a.b.bu();
                if (true) goto _L1; else goto _L9
_L9:
            }

            
            {
                a = AbsDrawerActivity.this;
                super();
            }
        });
        g = new ActionBarDrawerToggle(this, a, 0x7f070327, 0x7f070325, a1) {

            final a a;
            final AbsDrawerActivity b;

            public void onDrawerClosed(View view)
            {
                b.invalidateOptionsMenu();
                if (a != null)
                {
                    a.a(view);
                }
            }

            public void onDrawerOpened(View view)
            {
                b.invalidateOptionsMenu();
                if (a != null)
                {
                    a.b(view);
                }
            }

            
            {
                b = AbsDrawerActivity.this;
                a = a1;
                super(activity, drawerlayout, i1, j1);
            }
        };
        g.setDrawerIndicatorEnabled(f());
        a.setDrawerListener(g);
    }

    public boolean a(int i1, Bundle bundle)
    {
        boolean flag;
        int j1;
        flag = false;
        j();
        j1 = l.get();
        if (j1 == i1)
        {
            return false;
        }
        i1;
        JVM INSTR lookupswitch 8: default 100
    //                   10000: 188
    //                   2131755742: 102
    //                   2131755743: 102
    //                   2131755744: 102
    //                   2131755745: 102
    //                   2131755747: 144
    //                   2131755748: 161
    //                   2131755749: 181;
           goto _L1 _L2 _L3 _L3 _L3 _L3 _L4 _L5 _L6
_L1:
        return false;
_L3:
        b(i1, bundle);
        b.getMenu().findItem(i1).setChecked(true);
        flag = true;
_L8:
        if (flag)
        {
            l.set(i1);
        }
        return true;
_L4:
        startActivity(new Intent(this, com/cardinalblue/android/piccollage/activities/FindFriendsActivity));
        continue; /* Loop/switch isn't completed */
_L5:
        com.cardinalblue.android.piccollage.a.b.v();
        startActivity(new Intent(this, com/cardinalblue/android/piccollage/activities/AccountSettingsActivity));
        continue; /* Loop/switch isn't completed */
_L6:
        com.cardinalblue.android.piccollage.a.i.c(this);
        continue; /* Loop/switch isn't completed */
_L2:
        b(i1, bundle);
        bundle = b.getMenu().findItem(j1);
        if (bundle != null)
        {
            if (bundle instanceof MenuItemImpl)
            {
                ((MenuItemImpl)bundle).setExclusiveCheckable(false);
            }
            bundle.setChecked(false);
            if (bundle instanceof MenuItemImpl)
            {
                ((MenuItemImpl)bundle).setExclusiveCheckable(true);
                flag = true;
                continue; /* Loop/switch isn't completed */
            }
        }
        flag = true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected void b(int i1, Bundle bundle)
    {
        bundle = new Intent(this, com/cardinalblue/android/piccollage/activities/HomeActivity);
        bundle.setAction("piccollage.intent.action.VIEW_PAGE");
        bundle.putExtra("key_position", i1);
        startActivity(bundle);
    }

    protected void d()
    {
        c.sendEmptyMessageDelayed(10000, 50L);
    }

    protected void e()
    {
        boolean flag = a();
        boolean flag1 = b();
        if (flag && flag1)
        {
            d();
            c();
        }
    }

    protected abstract boolean f();

    protected void g()
    {
        String s;
        Object obj;
        PicUser picuser;
        if (m == null)
        {
            return;
        }
        s = getString(0x7f07023a);
        obj = PicAuth.h();
        if (!((PicAuth) (obj)).b())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        picuser = ((PicAuth) (obj)).i();
        if (picuser == null) goto _L2; else goto _L1
_L1:
        obj = picuser.getProfileImageUrl();
        s = picuser.getDisplayName();
_L3:
        ImageView imageview = (ImageView)m.findViewById(0x7f1001a7);
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            imageview.setImageResource(0x7f020224);
        } else
        {
            try
            {
                com.cardinalblue.android.piccollage.lib.a.e.a(((String) (obj))).a(imageview);
            }
            catch (Exception exception)
            {
                com.cardinalblue.android.piccollage.a.f.a(exception);
            }
        }
        ((TextView)m.findViewById(0x7f1001a8)).setText(s);
        return;
_L2:
        ((PicAuth) (obj)).a();
        obj = null;
          goto _L3
    }

    public boolean h()
    {
        return a.isDrawerOpen(0x800003);
    }

    protected void i()
    {
        a.openDrawer(0x800003);
    }

    protected void j()
    {
        a.closeDrawers();
    }

    protected void k()
    {
        j();
    }

    protected void l()
    {
        i();
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        i1;
        JVM INSTR lookupswitch 9: default 84
    //                   3: 145
    //                   4: 145
    //                   5: 145
    //                   103: 145
    //                   104: 145
    //                   105: 145
    //                   106: 145
    //                   666: 128
    //                   999: 92;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L3 _L4
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        super.onActivityResult(i1, j1, intent);
_L6:
        return;
_L4:
        if (j1 != -1 || intent == null || !intent.getExtras().containsKey("key_position")) goto _L6; else goto _L5
_L5:
        k = new Callable(intent) {

            final Intent a;
            final AbsDrawerActivity b;

            public Void a()
                throws Exception
            {
                int k1 = a.getIntExtra("key_position", -1);
                Fragment fragment = b.getSupportFragmentManager().findFragmentById(0x7f1000cd);
                if (k1 == -1 && fragment != null && (fragment instanceof q))
                {
                    ((q)fragment).b(true);
                }
                b.a(k1, a.getExtras());
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = AbsDrawerActivity.this;
                a = intent;
                super();
            }
        };
        return;
_L3:
        if (j1 == -1)
        {
            k = new Callable() {

                final AbsDrawerActivity a;

                public Void a()
                    throws Exception
                {
                    a.getSupportFragmentManager().popBackStack();
                    ak ak1 = new ak();
                    Bundle bundle = new Bundle();
                    bundle.putInt("key_fragment_position", 0x7f1002e0);
                    ak1.setArguments(bundle);
                    a.getSupportFragmentManager().beginTransaction().replace(0x7f1000cd, ak1, "tag_drawer_fragment").addToBackStack(null).commit();
                    return null;
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                a = AbsDrawerActivity.this;
                super();
            }
            };
        }
        com.squareup.a.b b1 = com.cardinalblue.android.piccollage.controller.d.a();
        if (j1 == -1)
        {
            intent = com.cardinalblue.android.piccollage.auth.PicAuth.PicLoginResultEvent.a.a;
        } else
        {
            intent = com.cardinalblue.android.piccollage.auth.PicAuth.PicLoginResultEvent.a.b;
        }
        b1.c(new com.cardinalblue.android.piccollage.auth.PicAuth.PicLoginResultEvent(intent));
        g();
        return;
    }

    public void onBackPressed()
    {
        if (h())
        {
            j();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        g.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getSupportFragmentManager().addOnBackStackChangedListener(n);
        d = AnimationUtils.loadAnimation(this, 0x7f040016);
        c = new b(this);
        if (!com.cardinalblue.android.b.k.j(this))
        {
            break MISSING_BLOCK_LABEL_66;
        }
        j = new GestureListener() {

            final AbsDrawerActivity a;

            public void onGestureEvent(GestureEvent gestureevent)
            {
                switch (gestureevent.direction)
                {
                default:
                    return;

                case 2: // '\002'
                    a.l();
                    return;

                case 1: // '\001'
                    a.k();
                    return;
                }
            }

            
            {
                a = AbsDrawerActivity.this;
                super();
            }
        };
        h = GestureManager.createInstance(this);
        return;
        bundle;
        com.cardinalblue.android.piccollage.a.f.a(bundle);
        return;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        getSupportFragmentManager().removeOnBackStackChangedListener(n);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131755761: 
            com.cardinalblue.android.piccollage.a.b.aB("action bar");
            menuitem = new Bundle();
            menuitem.putInt("extra_init_fragment_pos", 1);
            a(0x7f1002e1, menuitem);
            return true;

        case 2131755756: 
            com.cardinalblue.android.piccollage.a.b.bv();
            com.cardinalblue.android.piccollage.a.b.aB("action bar");
            menuitem = new Bundle();
            menuitem.putInt("extra_init_fragment_pos", 0);
            a(0x7f1002e1, menuitem);
            return true;

        case 2131755757: 
            com.cardinalblue.android.piccollage.a.b.bw();
            com.cardinalblue.android.piccollage.a.b.az("action bar");
            a(0x7f1002e0, null);
            return true;

        case 2131755752: 
            com.cardinalblue.android.piccollage.a.b.bx();
            com.cardinalblue.android.piccollage.a.b.aA("action bar");
            a(0x7f1002df, null);
            return true;

        case 16908332: 
            break;
        }
        if (f())
        {
            i();
            return true;
        } else
        {
            onBackPressed();
            return true;
        }
    }

    protected void onPause()
    {
        if (h != null)
        {
            h.unregisterListener(j);
        }
        com.cardinalblue.android.b.k.j().unregisterOnSharedPreferenceChangeListener(this);
        super.onPause();
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        g.syncState();
    }

    protected void onPostResume()
    {
        super.onPostResume();
        e();
        if (k != null)
        {
            try
            {
                k.call();
            }
            catch (Exception exception)
            {
                com.cardinalblue.android.piccollage.a.f.a(exception);
            }
            k = null;
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (h != null)
        {
            i = Gesture.getGestureFromId(0);
            if (i != null)
            {
                h.registerListener(j, i, 3);
            }
        }
        com.cardinalblue.android.b.k.j().registerOnSharedPreferenceChangeListener(this);
        c(com.cardinalblue.android.b.k.g());
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        if ("pref_has_badge".equals(s))
        {
            c(sharedpreferences.getBoolean(s, false));
        }
    }

}
