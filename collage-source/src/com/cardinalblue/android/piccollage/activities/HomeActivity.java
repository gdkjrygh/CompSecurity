// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import bolts.j;
import com.amplitude.api.c;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.a.i;
import com.cardinalblue.android.piccollage.auth.PicLoginActivity;
import com.cardinalblue.android.piccollage.controller.RatingNotifierManager;
import com.cardinalblue.android.piccollage.lib.d;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.gson.IGsonable;
import com.cardinalblue.android.piccollage.model.gson.PICDeviceConfig;
import com.cardinalblue.android.piccollage.view.fragments.a;
import com.cardinalblue.android.piccollage.view.fragments.ad;
import com.cardinalblue.android.piccollage.view.fragments.e;
import com.cardinalblue.android.piccollage.view.fragments.m;
import com.cardinalblue.android.piccollage.view.fragments.n;
import com.cardinalblue.android.piccollage.view.fragments.p;
import com.cardinalblue.android.piccollage.view.fragments.q;
import com.cardinalblue.android.piccollage.view.fragments.v;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import ly.kite.address.Address;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            AbsDrawerActivity, b

public class HomeActivity extends AbsDrawerActivity
    implements com.cardinalblue.android.piccollage.view.fragments.i.b
{
    public static class OnPopupMenuEvent
        implements IGsonable
    {

        public final boolean a;

        public OnPopupMenuEvent(boolean flag)
        {
            a = flag;
        }
    }

    private class a extends AsyncTask
    {

        final HomeActivity a;

        protected transient Void a(String as[])
        {
            as = as[0];
            if (!TextUtils.isEmpty(as))
            {
                try
                {
                    com.cardinalblue.android.piccollage.controller.network.f.a(a, as);
                }
                // Misplaced declaration of an exception variable
                catch (String as[])
                {
                    com.cardinalblue.android.piccollage.a.f.a(as);
                }
            }
            return null;
        }

        protected void a(Void void1)
        {
            com.cardinalblue.android.piccollage.activities.HomeActivity.a(a, null);
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((String[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((Void)obj);
        }

        private a()
        {
            a = HomeActivity.this;
            super();
        }

    }

    public static class b
    {

        public final int a;
        public final Bundle b;

        public b(int i)
        {
            this(i, null);
        }

        public b(int i, Bundle bundle)
        {
            a = i;
            b = bundle;
        }
    }


    private a e;

    public HomeActivity()
    {
    }

    static a a(HomeActivity homeactivity, a a1)
    {
        homeactivity.e = a1;
        return a1;
    }

    static String a(HomeActivity homeactivity, Fragment fragment)
    {
        return homeactivity.b(fragment);
    }

    private Set a(SharedPreferences sharedpreferences)
    {
        Object obj1 = new HashSet();
        Object obj = obj1;
        try
        {
            sharedpreferences = sharedpreferences.getStringSet("version_code_history", ((Set) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (SharedPreferences sharedpreferences)
        {
            return ((Set) (obj));
        }
        obj = sharedpreferences;
        obj1 = new TreeSet(sharedpreferences);
        obj = sharedpreferences;
        if (((TreeSet) (obj1)).size() < 5)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        obj = sharedpreferences;
        ((TreeSet) (obj1)).remove(((TreeSet) (obj1)).first());
        return sharedpreferences;
    }

    public static void a(Context context)
    {
        boolean flag1 = false;
        context = PreferenceManager.getDefaultSharedPreferences(context);
        int i = context.getInt("version_code", 0);
        int l = context.getInt("version_last_code", 0);
        boolean flag = flag1;
        if (l != 0)
        {
            flag = flag1;
            if (l != i)
            {
                flag = true;
            }
        }
        if (flag)
        {
            k.j().edit().putBoolean("key_is_first_update", true).apply();
        }
    }

    private String b(Fragment fragment)
    {
        if (fragment instanceof com.cardinalblue.android.piccollage.activities.b)
        {
            return fragment.toString();
        }
        if (fragment instanceof q)
        {
            return "Home";
        }
        if (fragment instanceof n)
        {
            return "Featured";
        }
        if (fragment instanceof com.cardinalblue.android.piccollage.view.fragments.a)
        {
            return "Settings";
        }
        if (fragment instanceof v)
        {
            return "My Collages";
        }
        if (fragment instanceof ad)
        {
            return fragment.toString();
        }
        if (fragment instanceof m)
        {
            return "Response List";
        }
        if (fragment instanceof p)
        {
            return "Find Friends";
        } else
        {
            return fragment.getClass().toString();
        }
    }

    private void o()
    {
        a(0x7f1002de, ((Bundle) (null)));
    }

    private void p()
    {
        com.cardinalblue.android.piccollage.a.b.cc();
        AtomicBoolean atomicboolean = new AtomicBoolean(false);
        k.a(this, com.cardinalblue.android.piccollage.view.fragments.e.a(null, getString(0x7f070127), getString(0x7f070126), new android.content.DialogInterface.OnClickListener(atomicboolean) {

            final AtomicBoolean a;
            final HomeActivity b;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                a.set(true);
                com.cardinalblue.android.piccollage.a.b.aN("rate");
                dialoginterface = b.getApplicationInfo().packageName;
                String s1 = String.format("market://details?id=%s", new Object[] {
                    dialoginterface
                });
                try
                {
                    Intent intent1 = new Intent("android.intent.action.VIEW");
                    intent1.setData(Uri.parse(s1));
                    b.startActivity(intent1);
                    return;
                }
                catch (Exception exception)
                {
                    com.cardinalblue.android.piccollage.a.f.a(exception);
                }
                try
                {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(String.format("http://play.google.com/store/apps/details?id=%s", new Object[] {
                        dialoginterface
                    })));
                    b.startActivity(intent);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (DialogInterface dialoginterface)
                {
                    com.cardinalblue.android.piccollage.a.f.a(dialoginterface);
                }
            }

            
            {
                b = HomeActivity.this;
                a = atomicboolean;
                super();
            }
        }, getString(0x7f070125), new android.content.DialogInterface.OnClickListener(atomicboolean) {

            final AtomicBoolean a;
            final HomeActivity b;

            public void onClick(DialogInterface dialoginterface, int l)
            {
                a.set(true);
                com.cardinalblue.android.piccollage.a.b.aN("uservoice");
                i.c(b);
            }

            
            {
                b = HomeActivity.this;
                a = atomicboolean;
                super();
            }
        }, new android.content.DialogInterface.OnDismissListener(atomicboolean) {

            final AtomicBoolean a;
            final HomeActivity b;

            public void onDismiss(DialogInterface dialoginterface)
            {
                if (!a.get())
                {
                    com.cardinalblue.android.piccollage.a.b.aN("skip");
                }
            }

            
            {
                b = HomeActivity.this;
                a = atomicboolean;
                super();
            }
        }), "tag_rating_dialog");
    }

    private void q()
    {
        boolean flag1 = true;
        SharedPreferences sharedpreferences;
        int i;
        int l;
        sharedpreferences = PreferenceManager.getDefaultSharedPreferences(this);
        i = getPackageManager().getPackageInfo(getPackageName(), 128).versionCode;
        l = sharedpreferences.getInt("version_code", 0);
        break MISSING_BLOCK_LABEL_38;
_L3:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        r().a(new bolts.i() {

            final HomeActivity a;

            public Void a(j j1)
                throws Exception
            {
                if (j1.d())
                {
                    com.cardinalblue.android.piccollage.a.f.a(j1.f());
                    return null;
                } else
                {
                    com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.events.b((Collage)j1.e()));
                    return null;
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = HomeActivity.this;
                super();
            }
        }, j.b);
        HashSet hashset = new HashSet();
        hashset.add(String.valueOf(l));
        sharedpreferences.edit().putInt("version_code", i).putStringSet("version_code_history", hashset).apply();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        k.j().edit().putBoolean("key_is_first_update", true).apply();
        Set set = a(sharedpreferences);
        set.add(String.valueOf(l));
        sharedpreferences.edit().putInt("version_last_code", l).putInt("version_code", i).putStringSet("version_code_history", set).apply();
        Address.getAddressBook(this);
_L1:
        if (flag || flag1)
        {
            RuntimeException runtimeexception;
            try
            {
                com.cardinalblue.android.piccollage.a.f.g(this);
                RatingNotifierManager.a().b();
                k.a(true);
                s();
                return;
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                com.cardinalblue.android.piccollage.a.f.a(namenotfoundexception);
            }
            break MISSING_BLOCK_LABEL_258;
        } else
        {
            return;
        }
        runtimeexception;
        com.cardinalblue.android.piccollage.a.f.a(runtimeexception);
        j.a(new Callable() {

            final HomeActivity a;

            public Void a()
                throws Exception
            {
                File file = new File(a.getFilesDir(), "address_book");
                if (file.exists() && file.delete())
                {
                    com.cardinalblue.android.piccollage.a.f.a(new Exception("deleted the address data because the proguard issue"));
                }
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = HomeActivity.this;
                super();
            }
        });
          goto _L1
        return;
        boolean flag;
        if (l == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || l >= i)
        {
            flag1 = false;
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L2
_L2:
    }

    private j r()
    {
        return j.a(new Callable() {

            final HomeActivity a;

            public Collage a()
                throws Exception
            {
                if (ContextCompat.checkSelfPermission(a, "android.permission.WRITE_EXTERNAL_STORAGE") == -1)
                {
                    throw new IllegalStateException("user denied the storage permission");
                }
                long l = com.cardinalblue.android.piccollage.model.a.a.a(a).b();
                if (l >= 1L)
                {
                    throw new IllegalStateException((new StringBuilder()).append("it's already include the sample collage, collage num : ").append(l).toString());
                }
                String s1;
                Object obj;
                String s2;
                if (com.cardinalblue.android.b.e.b())
                {
                    s2 = "amazon/assets/builtin/builtin.json";
                    s1 = "amazon/assets/builtin/builtin.jpg";
                    obj = com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.A3;
                } else
                {
                    s2 = "builtin/sample_collage.json";
                    s1 = "builtin/sample_collage.jpg";
                    obj = com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.V5;
                }
                obj = Collage.a(new String(com.androidquery.util.a.a(a.getAssets().open(s2))), ((com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum) (obj)));
                if (TextUtils.isEmpty(((Collage) (obj)).r()))
                {
                    ((Collage) (obj)).b("hello world! piccollage");
                }
                ((Collage) (obj)).a(BitmapFactory.decodeStream(a.getAssets().open(s1)));
                ((Collage) (obj)).c(a);
                return ((Collage) (obj));
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = HomeActivity.this;
                super();
            }
        });
    }

    private void s()
    {
        Object obj = k.j();
        if (((SharedPreferences) (obj)).contains("pref_is_report_amplitude"))
        {
            return;
        }
        float f1 = ((d)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/d)).a().getAmplitudeSubsamplingProb();
        obj = ((SharedPreferences) (obj)).edit();
        boolean flag;
        if (Math.random() < (double)f1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((android.content.SharedPreferences.Editor) (obj)).putBoolean("pref_is_report_amplitude", flag).apply();
    }

    public void a(int i, String s1)
    {
        Intent intent = new Intent(this, com/cardinalblue/android/piccollage/auth/PicLoginActivity);
        intent.putExtra("from", s1);
        startActivityForResult(intent, i);
    }

    protected void b(int i, Bundle bundle)
    {
        a(com.cardinalblue.android.piccollage.view.a.e.a(i, bundle));
        ViewCompat.setElevation(findViewById(0x7f1000c5), com.cardinalblue.android.piccollage.view.a.e.a(i));
    }

    protected void e()
    {
        a();
        b();
        a(false);
    }

    protected boolean f()
    {
        return true;
    }

    protected boolean m()
    {
        return true;
    }

    protected void n()
    {
        if (PreferenceManager.getDefaultSharedPreferences(this).getInt("version_last_code", 0) == 0)
        {
            r().a(new bolts.i() {

                final HomeActivity a;

                public Void a(j j1)
                    throws Exception
                {
                    if (j1.d())
                    {
                        com.cardinalblue.android.piccollage.a.f.a(j1.f());
                        return null;
                    } else
                    {
                        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.events.b((Collage)j1.e()));
                        return null;
                    }
                }

                public Object then(j j1)
                    throws Exception
                {
                    return a(j1);
                }

            
            {
                a = HomeActivity.this;
                super();
            }
            }, j.b);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!isFinishing())
        {
            setContentView(0x7f03002e);
            setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
            Object obj = getIntent().getAction();
            a(new AbsDrawerActivity.a() {

                final HomeActivity a;

                public void a(View view)
                {
                }

                public void b(View view)
                {
                    view = a.getSupportFragmentManager().findFragmentById(0x7f1000cd);
                    if (view != null)
                    {
                        com.cardinalblue.android.piccollage.a.b.ax(com.cardinalblue.android.piccollage.activities.HomeActivity.a(a, view));
                    }
                }

            
            {
                a = HomeActivity.this;
                super();
            }
            });
            if (bundle == null)
            {
                bundle = getIntent();
                if (bundle == null)
                {
                    o();
                } else
                if ("piccollage.intent.action.VIEW_PROFILE".equals(obj) && bundle.hasExtra("user"))
                {
                    obj = new com.cardinalblue.android.piccollage.activities.b();
                    ((com.cardinalblue.android.piccollage.activities.b) (obj)).setArguments(bundle.getExtras());
                    getSupportFragmentManager().beginTransaction().replace(0x7f1000cd, ((Fragment) (obj)), "tag_drawer_fragment").commit();
                } else
                if ("piccollage.intent.action.VIEW_PAGE".equals(obj) && bundle.hasExtra("key_position"))
                {
                    int i = bundle.getIntExtra("key_position", -1);
                    if (i != -1)
                    {
                        a(i, bundle.getExtras());
                    } else
                    {
                        o();
                    }
                } else
                {
                    o();
                }
            }
            try
            {
                bundle = k.h(this);
                if (!TextUtils.isEmpty(bundle))
                {
                    e = new a();
                    e.execute(new String[] {
                        bundle
                    });
                }
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle) { }
            q();
            ((com.cardinalblue.android.piccollage.a)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/a)).a(this);
            if (k.h())
            {
                com.amplitude.api.a.a().a(this, getString(0x7f070309)).a(getApplication()).a(true).c(k.c(this));
                return;
            }
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (e != null)
        {
            e.cancel(true);
        }
        com.google.android.gcm.a.c(this);
        com.androidquery.util.a.b(getApplicationContext());
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            break;
        }
        if (h())
        {
            j();
        } else
        {
            i();
            com.cardinalblue.android.piccollage.a.b.bp();
        }
        return true;
    }

    protected void onPause()
    {
        super.onPause();
        com.cardinalblue.android.piccollage.controller.d.a(this);
    }

    public void onPicUserDataChanged(com.cardinalblue.android.piccollage.model.gson.PicUser.PicUserDataChangedEvent picuserdatachangedevent)
    {
        g();
    }

    public void onPopupMenuEvent(OnPopupMenuEvent onpopupmenuevent)
    {
        View view = findViewById(0x7f1000d4);
        int i;
        if (onpopupmenuevent.a)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void onRatingDialogNeeded(com.cardinalblue.android.piccollage.controller.RatingNotifierManager.RequirementMetEvent requirementmetevent)
    {
        p();
        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.controller.RatingNotifierManager.b(com.cardinalblue.android.piccollage.controller.RatingNotifierManager.a.a));
    }

    protected void onResume()
    {
        super.onResume();
        com.cardinalblue.android.piccollage.controller.d.b(this);
        System.gc();
    }

    protected void onStart()
    {
        super.onStart();
        supportInvalidateOptionsMenu();
    }

    public void onSwipeFragment(b b1)
    {
        a(b1.a, b1.b);
    }
}
