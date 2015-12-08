// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.base;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.appboy.Appboy;
import com.crashlytics.android.Crashlytics;
import com.tinder.activities.ActivityBanned;
import com.tinder.activities.ActivityEditProfile;
import com.tinder.c.ad;
import com.tinder.c.ai;
import com.tinder.e.j;
import com.tinder.e.k;
import com.tinder.events.EventGlobalsLoaded;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ae;
import com.tinder.managers.d;
import com.tinder.managers.g;
import com.tinder.model.InstagramDataSet;
import com.tinder.model.ReportNotification;
import com.tinder.model.UserMeta;
import com.tinder.utils.v;
import de.greenrobot.event.c;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.tinder.base:
//            e

public abstract class com.tinder.base.a extends AppCompatActivity
{
    private final class a
        implements Runnable
    {

        final com.tinder.base.a a;
        private ReportNotification b;

        public final void run()
        {
            if (b != null && !TextUtils.isEmpty(b.type))
            {
                Object obj = b.type.toLowerCase();
                if (TextUtils.equals("banned", ((CharSequence) (obj))))
                {
                    obj = a;
                    Intent intent = new Intent(((android.content.Context) (obj)), com/tinder/activities/ActivityBanned);
                    intent.setFlags(0x40000000);
                    ((Activity) (obj)).startActivity(intent);
                    ((Activity) (obj)).finish();
                } else
                if (TextUtils.equals("warning", ((CharSequence) (obj))) && com.tinder.base.a.a(a) == null)
                {
                    com.tinder.base.a.a(a, new ai(a, b));
                    com.tinder.base.a.a(a).setOnDismissListener(new android.content.DialogInterface.OnDismissListener(this) {

                        final a a;

                        public final void onDismiss(DialogInterface dialoginterface)
                        {
                            com.tinder.base.a.a(a.a, null);
                        }

            
            {
                a = a1;
                super();
            }
                    });
                    com.tinder.base.a.a(a).show();
                    return;
                }
            }
        }

        a(ReportNotification reportnotification)
        {
            a = com.tinder.base.a.this;
            super();
            b = reportnotification;
        }
    }


    private boolean a;
    private ai b;
    private FrameLayout c;
    private final boolean d;
    protected e l;
    ae m;
    public d n;
    public g o;
    c p;

    public com.tinder.base.a()
    {
        l = null;
        d = false;
    }

    public com.tinder.base.a(boolean flag)
    {
        l = null;
        d = flag;
    }

    static ai a(com.tinder.base.a a1)
    {
        return a1.b;
    }

    static ai a(com.tinder.base.a a1, ai ai)
    {
        a1.b = ai;
        return ai;
    }

    public void A_()
    {
    }

    public void B_()
    {
        if (!a(this))
        {
            (new Handler()).postDelayed(new Runnable() {

                final com.tinder.base.a a;

                public final void run()
                {
                    a.B_();
                }

            
            {
                a = com.tinder.base.a.this;
                super();
            }
            }, 10000L);
        }
    }

    public final void F()
    {
        try
        {
            getSupportActionBar().hide();
            return;
        }
        catch (Exception exception)
        {
            v.a("Failed to hide action bar", exception);
        }
    }

    public final void G()
    {
        if (!o.c())
        {
            v.a("Unknown location state");
            B_();
        }
    }

    public final void a(Fragment fragment)
    {
        try
        {
            l.b(fragment);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            Crashlytics.a(fragment.toString());
        }
    }

    public final void a(Fragment fragment, String s)
    {
        try
        {
            if (l != null && !fragment.isAdded())
            {
                l.b(fragment, s);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            Crashlytics.a(fragment.toString());
        }
    }

    public final boolean a(Activity activity)
    {
        return o.a(activity);
    }

    public final Fragment b(String s)
    {
        Fragment fragment;
        Object obj;
        obj = null;
        fragment = obj;
        AppCompatActivity appcompatactivity;
        if (l == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        appcompatactivity = l.b();
        fragment = obj;
        if (appcompatactivity != null)
        {
            try
            {
                fragment = appcompatactivity.getSupportFragmentManager().a(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                v.a("Failed to find fragment by tag", s);
                return null;
            }
        }
        return fragment;
    }

    public final void b(Fragment fragment)
    {
        try
        {
            if (l != null && !fragment.isAdded())
            {
                l.a(fragment);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            Crashlytics.a(fragment.toString());
        }
    }

    public final void b(Fragment fragment, String s)
    {
        try
        {
            if (l != null && !fragment.isAdded())
            {
                l.a(fragment, s);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            v.a("Failed to add fragment", fragment);
        }
    }

    public final void b(List list)
    {
        if (!list.isEmpty())
        {
            runOnUiThread(new a((ReportNotification)list.get(0)));
        }
    }

    public int c()
    {
        return 0x7f030089;
    }

    public final void c(Fragment fragment)
    {
        try
        {
            if (l != null)
            {
                l.c(fragment);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            v.a("Failed to replace fragment", fragment);
        }
    }

    public void finish()
    {
        super.finish();
        y_();
    }

    public void onActivityResult(int j, int k, Intent intent)
    {
        j;
        JVM INSTR lookupswitch 2: default 28
    //                   9000: 84
    //                   10000: 36;
           goto _L1 _L2 _L3
_L1:
        super.onActivityResult(j, k, intent);
        return;
_L3:
        switch (k)
        {
        case -1: 
            G();
            break;

        case 0: // '\0'
            if (!a)
            {
                G();
            }
            break;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        o.f = false;
        if (k == -1)
        {
            o.b();
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onCreate(Bundle bundle)
    {
        ManagerApp.h().a(this);
        super.onCreate(bundle);
        A_();
        setContentView(c());
        c = (FrameLayout)findViewById(0x7f0e020d);
        l = new e(this);
        if (findViewById(0x7f0e020d) != null)
        {
            l.a();
        }
        p.a(this, true);
    }

    public void onDestroy()
    {
        p.b(this);
        super.onDestroy();
    }

    public void onEventMainThread(EventGlobalsLoaded eventglobalsloaded)
    {
label0:
        {
            eventglobalsloaded = eventglobalsloaded.getUserMeta();
            if (eventglobalsloaded != null)
            {
                b(((UserMeta) (eventglobalsloaded)).reportNotifications);
                if (((UserMeta) (eventglobalsloaded)).instagramDataSet != null)
                {
                    if (!((UserMeta) (eventglobalsloaded)).instagramDataSet.isTokenRevoked || ae.a.getBoolean("INSTAGRAM_EXPIRED_SEEN", true))
                    {
                        break label0;
                    }
                    eventglobalsloaded.instagramDataSet = new InstagramDataSet();
                    (new ad(this, new j() {

                        final com.tinder.base.a a;

                        public final void a()
                        {
                            ae.w();
                            Intent intent = new Intent(a, com/tinder/activities/ActivityEditProfile);
                            intent.addFlags(0x10000);
                            intent.putExtra("instagramConnectValue", 4);
                            a.startActivity(intent);
                            com.tinder.managers.a.a("Profile.Edit");
                        }

                        public final void b()
                        {
                            a.n.a(4, new k(this) {

                                final _cls2 a;

                                public final void a()
                                {
                                    ae.w();
                                }

                                public final void b()
                                {
                                }

            
            {
                a = _pcls2;
                super();
            }
                            });
                        }

            
            {
                a = com.tinder.base.a.this;
                super();
            }
                    })).show();
                }
            }
            return;
        }
        if (com.tinder.managers.d.c() != null)
        {
            com.tinder.managers.d.c().instagramDataSet = ((UserMeta) (eventglobalsloaded)).instagramDataSet;
        }
        ae.a(((UserMeta) (eventglobalsloaded)).instagramDataSet.username);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 16908332 16908332: default 24
    //                   16908332 26;
           goto _L1 _L2
_L1:
        return true;
_L2:
        onBackPressed();
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onPause()
    {
        super.onPause();
        if (d)
        {
            g g1 = o;
            g1.e = g1.e - 1;
            (new StringBuilder("Got activity stop for location, remaining activities: ")).append(g1.e);
            if (g1.a != null && g1.e == 0)
            {
                g1.a.c();
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        if (d)
        {
            g g1 = o;
            g1.e = g1.e + 1;
            g1.c = false;
            if (g1.b == null || g1.b.get() == null)
            {
                (new StringBuilder("Location activity reference dead, settting to ")).append(getClass());
                g1.b = new WeakReference(this);
            }
            (new StringBuilder("location googleApiClient connect, active activities: ")).append(g1.e);
            g1.a();
        }
    }

    protected void onStart()
    {
        super.onStart();
        Appboy.getInstance(this).openSession(this);
    }

    protected void onStop()
    {
        super.onStop();
        Appboy.getInstance(this).closeSession(this);
    }

    public void setContentView(int j)
    {
        if (c == null)
        {
            super.setContentView(j);
            return;
        } else
        {
            ((LayoutInflater)getSystemService("layout_inflater")).inflate(j, c, true);
            return;
        }
    }

    public void y_()
    {
    }
}
