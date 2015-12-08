// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelUuid;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.NavUtils;
import android.support.v4.content.Loader;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.fitbit.activity.ui.activitylog.UpdateRecordedExerciseActivity;
import com.fitbit.data.bl.dg;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.runtrack.SupportedActivity;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.bf;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.runtrack.ui:
//            c, ShareExerciseCameraActivity, MapSummaryFragment, SplitsSummary, 
//            SpeedSummary, HeartRateSummary, CalorieSummary, ImpactSummary, 
//            RecentSummary

public class ExerciseDetailsActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.support.v4.view.ViewPager.OnPageChangeListener, android.support.v7.app.ActionBar.TabListener, com.fitbit.util.SimpleConfirmDialogFragment.a
{
    static final class SummaryAdapter extends FragmentStatePagerAdapter
    {

        private final ActivityLogEntry a;
        private final ExerciseSession b;
        private final ExerciseStat c;
        private final List d;
        private final List e;
        private Fragment f;
        private Fragment g;
        private Fragment h;
        private Fragment i;
        private Fragment j;
        private Fragment k;
        private Fragment l;
        private final List m;

        private Fragment a()
        {
            if (f == null)
            {
                MapSummaryFragment mapsummaryfragment = MapSummaryFragment.a(a, b, e, d, c);
                f = mapsummaryfragment;
                return mapsummaryfragment;
            } else
            {
                return f;
            }
        }

        private Fragment b()
        {
            if (g == null)
            {
                Fragment fragment = SplitsSummary.a(b, c, d);
                g = fragment;
                return fragment;
            } else
            {
                return g;
            }
        }

        private Fragment c()
        {
            if (h == null)
            {
                Fragment fragment = SpeedSummary.a(e, c);
                h = fragment;
                return fragment;
            } else
            {
                return h;
            }
        }

        private Fragment d()
        {
            if (i == null)
            {
                Fragment fragment = HeartRateSummary.a(a, b, c);
                i = fragment;
                return fragment;
            } else
            {
                return i;
            }
        }

        private Fragment e()
        {
            if (j == null)
            {
                Fragment fragment = CalorieSummary.a(a, b, c);
                j = fragment;
                return fragment;
            } else
            {
                return j;
            }
        }

        private Fragment f()
        {
            if (k == null)
            {
                Fragment fragment;
                if (b == null)
                {
                    fragment = ImpactSummary.a(a);
                } else
                {
                    fragment = ImpactSummary.a(b, c, a);
                }
                k = fragment;
            }
            return k;
        }

        private Fragment g()
        {
            if (l == null)
            {
                Fragment fragment = RecentSummary.a(b, c);
                l = fragment;
                return fragment;
            } else
            {
                return l;
            }
        }

        public int getCount()
        {
            return m.size();
        }

        public Fragment getItem(int i1)
        {
            static class _cls2
            {

                static final int a[];
                static final int b[];

                static 
                {
                    b = new int[com.fitbit.data.domain.Type.values().length];
                    try
                    {
                        b[com.fitbit.data.domain.Type.MOBILE_RUN.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    a = new int[SummaryAdapter.Type.values().length];
                    try
                    {
                        a[SummaryAdapter.Type.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        a[SummaryAdapter.Type.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[SummaryAdapter.Type.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[SummaryAdapter.Type.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[SummaryAdapter.Type.e.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[SummaryAdapter.Type.f.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls2.a[((Type)m.get(i1)).ordinal()])
            {
            default:
                return g();

            case 1: // '\001'
                return a();

            case 2: // '\002'
                return b();

            case 3: // '\003'
                return c();

            case 4: // '\004'
                return d();

            case 5: // '\005'
                return e();

            case 6: // '\006'
                return f();
            }
        }

        public SummaryAdapter(FragmentManager fragmentmanager, ActivityLogEntry activitylogentry, ExerciseSession exercisesession, b b1, List list, boolean flag)
        {
            Object obj = null;
            super(fragmentmanager);
            b = exercisesession;
            e = list;
            if (b1 != null)
            {
                fragmentmanager = b1.a;
            } else
            {
                fragmentmanager = null;
            }
            c = fragmentmanager;
            fragmentmanager = obj;
            if (b1 != null)
            {
                fragmentmanager = b1.b;
            }
            d = fragmentmanager;
            a = activitylogentry;
            fragmentmanager = EnumSet.allOf(com/fitbit/runtrack/ui/ExerciseDetailsActivity$SummaryAdapter$Type);
            if (!flag)
            {
                fragmentmanager.remove(Type.a);
            }
            if (exercisesession == null)
            {
                fragmentmanager.remove(Type.b);
                fragmentmanager.remove(Type.c);
                fragmentmanager.remove(Type.a);
                fragmentmanager.remove(Type.g);
            } else
            if (SupportedActivity.a(exercisesession) == SupportedActivity.d)
            {
                fragmentmanager.remove(Type.b);
            } else
            {
                fragmentmanager.remove(Type.c);
            }
            if (activitylogentry.q() == null)
            {
                fragmentmanager.remove(Type.d);
            }
            if (activitylogentry.r() == null)
            {
                fragmentmanager.remove(Type.e);
            }
            m = new LinkedList(fragmentmanager);
        }
    }

    static final class SummaryAdapter.Type extends Enum
    {

        public static final SummaryAdapter.Type a;
        public static final SummaryAdapter.Type b;
        public static final SummaryAdapter.Type c;
        public static final SummaryAdapter.Type d;
        public static final SummaryAdapter.Type e;
        public static final SummaryAdapter.Type f;
        public static final SummaryAdapter.Type g;
        private static final SummaryAdapter.Type h[];

        public static SummaryAdapter.Type valueOf(String s)
        {
            return (SummaryAdapter.Type)Enum.valueOf(com/fitbit/runtrack/ui/ExerciseDetailsActivity$SummaryAdapter$Type, s);
        }

        public static SummaryAdapter.Type[] values()
        {
            return (SummaryAdapter.Type[])h.clone();
        }

        static 
        {
            a = new SummaryAdapter.Type("Map", 0);
            b = new SummaryAdapter.Type("Splits", 1);
            c = new SummaryAdapter.Type("Speed", 2);
            d = new SummaryAdapter.Type("HeartRate", 3);
            e = new SummaryAdapter.Type("Calories", 4);
            f = new SummaryAdapter.Type("Impact", 5);
            g = new SummaryAdapter.Type("Recent", 6);
            h = (new SummaryAdapter.Type[] {
                a, b, c, d, e, f, g
            });
        }

        private SummaryAdapter.Type(String s, int l)
        {
            super(s, l);
        }
    }

    private static class a
        implements android.os.Handler.Callback, android.support.v4.app.LoaderManager.LoaderCallbacks
    {

        private static final int a = 0;
        private final ExerciseDetailsActivity b;
        private final com.fitbit.runtrack.data.b c = new com.fitbit.runtrack.data.b();
        private final Handler d = new Handler(this);

        public static Bundle a(UUID uuid)
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable("uuid", new ParcelUuid(uuid));
            return bundle;
        }

        static com.fitbit.runtrack.data.b a(a a1)
        {
            return a1.c;
        }

        public void a(Loader loader, Pair pair)
        {
            d.sendMessage(d.obtainMessage(0, pair));
        }

        public boolean handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 0: // '\0'
                message = (Pair)message.obj;
                break;
            }
            b.a((ActivityLogEntry)((Pair) (message)).first, (ExerciseSession)((Pair) (message)).second);
            return true;
        }

        public Loader onCreateLoader(int l, Bundle bundle)
        {
            bundle = ((ParcelUuid)bundle.getParcelable("uuid")).getUuid();
        /* block-local class not found */
        class _cls1 {}

            return new _cls1(b, bundle);
        }

        public void onLoadFinished(Loader loader, Object obj)
        {
            a(loader, (Pair)obj);
        }

        public void onLoaderReset(Loader loader)
        {
        }

        public a(ExerciseDetailsActivity exercisedetailsactivity)
        {
            b = exercisedetailsactivity;
        }
    }

    public static class b
    {

        final ExerciseStat a;
        final List b;

        public b(ExerciseStat exercisestat, List list)
        {
            a = exercisestat;
            b = list;
        }
    }


    private static final String a = (new StringBuilder()).append(com/fitbit/runtrack/ui/ExerciseDetailsActivity.getName()).append(".xtra.activitylog.uuid").toString();
    private static final String b = (new StringBuilder()).append(com/fitbit/runtrack/ui/ExerciseDetailsActivity.getName()).append(".xtra.aftertracking").toString();
    private static final String c = "DELETE_THE_ACTIVITY_LOG";
    private static final short d = 915;
    private ExerciseSession e;
    private ActivityLogEntry f;
    private b g;
    private List h;
    private boolean i;
    private ViewPager j;
    private boolean k;

    public ExerciseDetailsActivity()
    {
        k = true;
    }

    public static final Intent a(Context context, ActivityLogEntry activitylogentry, boolean flag)
    {
        context = new Intent(context, com/fitbit/runtrack/ui/ExerciseDetailsActivity);
        context.putExtra(a, new ParcelUuid(activitylogentry.getUuid()));
        context.putExtra(b, flag);
        return context;
    }

    static ExerciseSession a(ExerciseDetailsActivity exercisedetailsactivity)
    {
        return exercisedetailsactivity.e;
    }

    private void f()
    {
        SimpleConfirmDialogFragment simpleconfirmdialogfragment = SimpleConfirmDialogFragment.a(this, 0x7f08013c, 0x7f0802c2, 0x7f08013d, 0x7f08005a);
        ad.a(getSupportFragmentManager(), "DELETE_THE_ACTIVITY_LOG", simpleconfirmdialogfragment);
    }

    protected void a(int l)
    {
        k = "normal".equals("china");
        getSupportLoaderManager().initLoader(0x7f1102d1, null, this);
    }

    public void a(Loader loader, Pair pair)
    {
        g = (b)pair.first;
        h = (List)pair.second;
        e();
    }

    void a(ActivityLogEntry activitylogentry, ExerciseSession exercisesession)
    {
        f = activitylogentry;
        e = exercisesession;
        if (activitylogentry == null && exercisesession == null)
        {
            finish();
            return;
        }
        if (exercisesession != null)
        {
            W();
            return;
        } else
        {
            e();
            return;
        }
    }

    public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        simpleconfirmdialogfragment = new Intent();
        simpleconfirmdialogfragment.putExtra(dg.b, new ParcelUuid(f.getUuid()));
        setResult(-1, simpleconfirmdialogfragment);
        finish();
    }

    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    public void e()
    {
        ActivityCompat.invalidateOptionsMenu(this);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setNavigationMode(2);
        if (e != null)
        {
            if (k)
            {
                actionbar.addTab(actionbar.newTab().setText(0x7f0803bc).setTabListener(this));
            }
            if (SupportedActivity.a(e) == SupportedActivity.d)
            {
                actionbar.addTab(actionbar.newTab().setText(0x7f0804e4).setTabListener(this));
            } else
            {
                actionbar.addTab(actionbar.newTab().setText(0x7f0804e6).setTabListener(this));
            }
        }
        if (f.q() != null)
        {
            actionbar.addTab(actionbar.newTab().setText(0x7f080242).setTabListener(this));
        }
        if (f.r() != null)
        {
            actionbar.addTab(actionbar.newTab().setText(0x7f0800ac).setTabListener(this));
        }
        actionbar.addTab(actionbar.newTab().setText(0x7f08027f).setTabListener(this));
        if (e != null)
        {
            actionbar.addTab(actionbar.newTab().setText(0x7f080478).setTabListener(this));
        }
        setTitle(f.z());
        setContentView(0x7f040042);
        j.setAdapter(new SummaryAdapter(getSupportFragmentManager(), f, e, g, h, k));
    }

    protected void o_()
    {
        super.o_();
        getSupportLoaderManager().initLoader(0x7f1102d1, null, this);
    }

    protected void onActivityResult(int l, int i1, Intent intent)
    {
        l;
        JVM INSTR tableswitch 915 915: default 20
    //                   915 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (i1 == -1)
        {
            intent = getIntent();
            intent.putExtra(b, true);
            finish();
            startActivity(intent);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onBackPressed()
    {
label0:
        {
            Object obj = getSupportFragmentManager().getFragments();
            if (obj == null)
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            Object obj1;
            do
            {
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label0;
                    }
                    obj1 = (Fragment)((Iterator) (obj)).next();
                } while (obj1 == null);
                obj1 = ((Fragment) (obj1)).getChildFragmentManager();
            } while (((FragmentManager) (obj1)).getBackStackEntryCount() <= 0);
            ((FragmentManager) (obj1)).popBackStack();
            return;
        }
        if (i)
        {
            NavUtils.navigateUpFromSameTask(this);
            return;
        } else
        {
            Intent intent = NavUtils.getParentActivityIntent(this);
            intent.addFlags(0x4000000);
            NavUtils.navigateUpTo(this, intent);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        i = getIntent().getBooleanExtra(b, false);
        bundle = (ParcelUuid)getIntent().getParcelableExtra(a);
        getSupportLoaderManager().initLoader(0x7f110006, a.a(bundle.getUuid()), new a(this));
    }

    public Loader onCreateLoader(int l, Bundle bundle)
    {
        return new bf(this) {

            final ExerciseDetailsActivity a;

            protected Pair a()
            {
                com.fitbit.runtrack.data.b b1 = new com.fitbit.runtrack.data.b();
                Pair pair = b1.g(ExerciseDetailsActivity.a(a));
                return Pair.create(new b((ExerciseStat)pair.first, (List)pair.second), b1.e(ExerciseDetailsActivity.a(a)));
            }

            protected Object f_()
            {
                return a();
            }

            
            {
                a = ExerciseDetailsActivity.this;
                super(context);
            }
        };
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f120010, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Pair)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            if (i)
            {
                NavUtils.navigateUpFromSameTask(this);
                return true;
            } else
            {
                menuitem = NavUtils.getParentActivityIntent(this);
                menuitem.addFlags(0x4000000);
                NavUtils.navigateUpTo(this, menuitem);
                return true;
            }

        case 2131821795: 
            f();
            return true;

        case 2131821794: 
            startActivityForResult(UpdateRecordedExerciseActivity.a(this, f), 915);
            return true;

        case 2131820974: 
            (new c()).a(f).f();
            startActivity(ShareExerciseCameraActivity.a(this, f));
            return true;
        }
    }

    public void onPageScrollStateChanged(int l)
    {
    }

    public void onPageScrolled(int l, float f1, int i1)
    {
    }

    public void onPageSelected(int l)
    {
        getSupportActionBar().getTabAt(l).select();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        boolean flag1 = true;
        MenuItem menuitem = menu.findItem(0x7f1104e2);
        boolean flag;
        if (f != null && f.h() && e == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
        menuitem = menu.findItem(0x7f1104e3);
        if (f != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
        menuitem = menu.findItem(0x7f1101ae);
        if (f != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
        return super.onPrepareOptionsMenu(menu);
    }

    public void onSupportContentChanged()
    {
        super.onSupportContentChanged();
        j = (ViewPager)findViewById(0x7f11009e);
        j.setOffscreenPageLimit(4);
        j.setOnPageChangeListener(this);
    }

    public void onTabReselected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
    {
    }

    public void onTabSelected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
    {
        if (j != null)
        {
            j.setCurrentItem(tab.getPosition(), true);
        }
    }

    public void onTabUnselected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
    {
    }

}
