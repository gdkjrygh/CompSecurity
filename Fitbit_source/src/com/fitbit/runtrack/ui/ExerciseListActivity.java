// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelUuid;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.util.LongSparseArray;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import com.fitbit.FitBitApplication;
import com.fitbit.LoadableListView;
import com.fitbit.LoadableListViewFragment;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.e.a;
import com.fitbit.maps.FitbitMapFragment;
import com.fitbit.runtrack.Duration;
import com.fitbit.runtrack.data.b;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.a.c;
import com.fitbit.ui.charts.OnboardingCellView;
import com.fitbit.ui.d;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.bf;
import com.fitbit.util.f;
import com.fitbit.util.o;
import com.fitbit.util.p;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.runtrack.ui:
//            CalendarFragment, ExerciseGraphFragment, HeartRateGraphFragment, b, 
//            ExerciseDetailsActivity, RecordExerciseActivity, m, d, 
//            CalendarFragment_, ExerciseListHeaderSwitchEvent

public class ExerciseListActivity extends FitbitActivity
    implements android.os.Handler.Callback, android.support.v4.app.LoaderManager.LoaderCallbacks, android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemLongClickListener, com.fitbit.util.SimpleConfirmDialogFragment.a, Comparator
{
    private static class ExercisePagerAdapter extends FragmentPagerAdapter
    {

        private CalendarFragment a;
        private HeartRateGraphFragment b;
        private ExerciseGraphFragment c;
        private ExerciseGraphFragment d;
        private ExerciseGraphFragment e;
        private final List f;

        static List a(ExercisePagerAdapter exercisepageradapter)
        {
            return exercisepageradapter.f;
        }

        public boolean a()
        {
            return p.a(DeviceFeature.HEART_RATE);
        }

        public CalendarFragment b()
        {
            if (a == null)
            {
                CalendarFragment_ calendarfragment_ = new CalendarFragment_();
                a = calendarfragment_;
                return calendarfragment_;
            } else
            {
                return a;
            }
        }

        public ExerciseGraphFragment c()
        {
            if (c == null)
            {
                ExerciseGraphFragment exercisegraphfragment = com.fitbit.runtrack.ui.ExerciseGraphFragment.a(com.fitbit.runtrack.ui.ExerciseGraphFragment.Type.a);
                c = exercisegraphfragment;
                return exercisegraphfragment;
            } else
            {
                return c;
            }
        }

        public ExerciseGraphFragment d()
        {
            if (e == null)
            {
                ExerciseGraphFragment exercisegraphfragment = com.fitbit.runtrack.ui.ExerciseGraphFragment.a(com.fitbit.runtrack.ui.ExerciseGraphFragment.Type.b);
                e = exercisegraphfragment;
                return exercisegraphfragment;
            } else
            {
                return e;
            }
        }

        public HeartRateGraphFragment e()
        {
            if (b == null)
            {
                HeartRateGraphFragment heartrategraphfragment = new HeartRateGraphFragment();
                b = heartrategraphfragment;
                return heartrategraphfragment;
            } else
            {
                return b;
            }
        }

        public ExerciseGraphFragment f()
        {
            if (d == null)
            {
                ExerciseGraphFragment exercisegraphfragment = com.fitbit.runtrack.ui.ExerciseGraphFragment.a(com.fitbit.runtrack.ui.ExerciseGraphFragment.Type.c);
                d = exercisegraphfragment;
                return exercisegraphfragment;
            } else
            {
                return d;
            }
        }

        public int getCount()
        {
            return f.size();
        }

        public Fragment getItem(int i1)
        {
            static class _cls8
            {

                static final int a[];

                static 
                {
                    a = new int[ExercisePagerAdapter.Type.values().length];
                    try
                    {
                        a[com.fitbit.runtrack.ui.ExercisePagerAdapter.Type.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[com.fitbit.runtrack.ui.ExercisePagerAdapter.Type.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[com.fitbit.runtrack.ui.ExercisePagerAdapter.Type.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[com.fitbit.runtrack.ui.ExercisePagerAdapter.Type.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[ExercisePagerAdapter.Type.e.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

        /* block-local class not found */
        class Type {}

            switch (com.fitbit.runtrack.ui._cls8.a[((Type)f.get(i1)).ordinal()])
            {
            default:
                return null;

            case 1: // '\001'
                return b();

            case 2: // '\002'
                return c();

            case 3: // '\003'
                return d();

            case 4: // '\004'
                return e();

            case 5: // '\005'
                return f();
            }
        }

        public ExercisePagerAdapter(FragmentManager fragmentmanager)
        {
            super(fragmentmanager);
            fragmentmanager = EnumSet.allOf(com/fitbit/runtrack/ui/ExerciseListActivity$ExercisePagerAdapter$Type);
            if (!a())
            {
                fragmentmanager.remove(com.fitbit.runtrack.ui.Type.d);
            }
            f = new LinkedList(fragmentmanager);
        }
    }

    private static interface a
    {

        public abstract long a(ActivityLogEntry activitylogentry);
    }

    private static class b extends bf
    {

        private final com.fitbit.data.bl.ActivityBusinessLogic.Request a;

        protected List a()
        {
            List list = Collections.emptyList();
            List list1;
            try
            {
                com.fitbit.e.a.a(ExerciseListActivity.e(), "Looking up activity Log Request %s", new Object[] {
                    a
                });
                if (a.a)
                {
                    return ActivityBusinessLogic.a().b(a);
                }
                list1 = ActivityBusinessLogic.a().c(a);
            }
            catch (ServerCommunicationException servercommunicationexception)
            {
                com.fitbit.e.a.e(ExerciseListActivity.e(), "Communication error loading activity list", servercommunicationexception, new Object[0]);
                return list;
            }
            return list1;
        }

        protected Object f_()
        {
            return a();
        }

        b(Context context, com.fitbit.data.bl.ActivityBusinessLogic.Request request)
        {
            super(context);
            a = request;
        }
    }

    private static class c extends bf
    {

        private final int a = 1;
        private final a b;
        private final Handler c = new Handler();
        private final long d[];

        static a a(c c1)
        {
            return c1.b;
        }

        private void a(List list)
        {
            c.post(new Runnable(this, list) {

                final List a;
                final c b;

                public void run()
                {
                    if (com.fitbit.runtrack.ui.c.a(b) != null)
                    {
                        com.fitbit.runtrack.ui.c.a(b).a(a);
                    }
                }

            
            {
                b = c1;
                a = list;
                super();
            }
            });
        }

        protected List a()
        {
            ArrayList arraylist = new ArrayList();
            long al[] = d;
            int j1 = al.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                long l1 = al[i1];
                ActivityLogEntry activitylogentry = ActivityBusinessLogic.a().c(l1);
                if (activitylogentry != null)
                {
                    arraylist.add(activitylogentry);
                }
            }

            ArrayList arraylist1 = new ArrayList();
            Iterator iterator = arraylist.iterator();
            do
            {
                ActivityLogEntry activitylogentry1;
label0:
                {
                    if (iterator.hasNext())
                    {
                        activitylogentry1 = (ActivityLogEntry)iterator.next();
                        if (!isAbandoned())
                        {
                            break label0;
                        }
                    }
                    return arraylist;
                }
                try
                {
                    ActivityBusinessLogic.a().a(activitylogentry1);
                    ActivityBusinessLogic.a().a(Collections.singletonList(activitylogentry1));
                    arraylist1.add(activitylogentry1);
                }
                catch (Exception exception)
                {
                    com.fitbit.runtrack.ui.ExerciseListActivity.f().append(activitylogentry1.getServerId(), Boolean.valueOf(true));
                    com.fitbit.e.a.f(ExerciseListActivity.e(), "Error refreshing details.", exception, new Object[0]);
                }
                if (arraylist1.size() >= 1)
                {
                    a(((List) (new ArrayList(arraylist1))));
                    arraylist1.clear();
                }
            } while (true);
        }

        protected Object f_()
        {
            return a();
        }

        public c(Context context, long al[], a a1)
        {
            super(context);
            d = al;
            b = a1;
        }
    }

    public static interface c.a
    {

        public abstract void a(List list);
    }

    private static class d extends bf
    {

        private final long a;

        protected List a()
        {
            ActivityLogEntry activitylogentry = ActivityBusinessLogic.a().c(a);
            if (activitylogentry == null || activitylogentry.getEntityStatus() == com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE)
            {
                return Collections.emptyList();
            } else
            {
                return Collections.singletonList(activitylogentry);
            }
        }

        protected Object f_()
        {
            return a();
        }

        public d(Context context, long l1)
        {
            super(context);
            a = l1;
        }
    }


    private static final String b = com/fitbit/runtrack/ui/ExerciseListActivity.getSimpleName();
    private static final String c = "delete_activity_dialog";
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;
    private static final int h = 100;
    private static final String i = "entry_idx";
    private static final String j = "Exercise";
    private static LongSparseArray k;
    private com.fitbit.util.threading.c a;
    private Handler l;
    private ExercisePagerAdapter m;
    private boolean n;

    public ExerciseListActivity()
    {
        a = new com.fitbit.util.threading.c() {

            final ExerciseListActivity a;

            protected void a(Intent intent)
            {
                long al[] = intent.getLongArrayExtra(dg.c);
                if (al != null)
                {
                    com.fitbit.runtrack.ui.ExerciseListActivity.a(a).sendMessage(com.fitbit.runtrack.ui.ExerciseListActivity.a(a).obtainMessage(3, al));
                } else
                {
                    long l1 = intent.getLongExtra(dg.b, -1L);
                    if (l1 != -1L)
                    {
                        intent = new Bundle();
                        intent.putLong(dg.b, l1);
                        a.getSupportLoaderManager().restartLoader(0x7f110016, intent, a);
                        return;
                    }
                }
            }

            
            {
                a = ExerciseListActivity.this;
                super();
            }
        };
        n = true;
    }

    static Handler a(ExerciseListActivity exerciselistactivity)
    {
        return exerciselistactivity.l;
    }

    private d.b a(Calendar calendar, List list)
    {
        list = list.iterator();
        int i1;
        for (i1 = 0; list.hasNext(); i1 = ((ActivityLogEntry)list.next()).a(TimeUnit.MILLISECONDS) + i1) { }
        return new d.b(calendar.getTime(), new Duration(i1));
    }

    private void a(ActivityLogEntry activitylogentry)
    {
        if (m != null)
        {
            m.b().b(activitylogentry.getLogDate());
        }
        g().remove(activitylogentry);
        a(((List) (new ArrayList())), -1, g());
        com.fitbit.util.f.a(new com.fitbit.util.f.a(FitBitApplication.a(), activitylogentry) {

            final ActivityLogEntry a;
            final ExerciseListActivity b;

            public void a(Context context)
            {
                ActivityBusinessLogic.a().a(Collections.singletonList(a), context);
            }

            public void b(Object obj)
            {
                a((Context)obj);
            }

            
            {
                b = ExerciseListActivity.this;
                a = activitylogentry;
                super(context);
            }
        });
    }

    static void a(ExerciseListActivity exerciselistactivity, ActivityLogEntry activitylogentry)
    {
        exerciselistactivity.a(activitylogentry);
    }

    static void a(ExerciseListActivity exerciselistactivity, List list, com.fitbit.ui.a.c c1, a a1)
    {
        exerciselistactivity.a(list, c1, a1);
    }

    private void a(List list, int i1, com.fitbit.ui.a.c c1)
    {
        int j1 = 0;
        com.fitbit.e.a.a(b, String.format("Finished Loading %s activities", new Object[] {
            Integer.valueOf(list.size())
        }), new Object[0]);
        if (i1 == 0x7f110010 && list.isEmpty())
        {
            ((LoadableListViewFragment)getSupportFragmentManager().findFragmentById(0x7f110086)).d().e_();
        }
        c1.removeAll(list);
        list.addAll(c1);
        c1.clear();
        LinkedList linkedlist = new LinkedList();
        Collections.sort(list, this);
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            ActivityLogEntry activitylogentry1 = (ActivityLogEntry)iterator.next();
            if (linkedlist.isEmpty())
            {
                linkedlist.add(activitylogentry1);
            } else
            {
                Object obj1 = (ActivityLogEntry)linkedlist.getLast();
                Object obj = o.c(((ActivityLogEntry) (obj1)).getLogDate().getTime());
                obj1 = o.b(((ActivityLogEntry) (obj1)).getLogDate().getTime());
                Date date = activitylogentry1.getLogDate();
                Date date1 = ((Calendar) (obj1)).getTime();
                obj = ((Calendar) (obj)).getTime();
                if (date.after(date1) && date.before(((Date) (obj))) || date.equals(date1) || date.equals(obj))
                {
                    linkedlist.add(activitylogentry1);
                } else
                {
                    c1.a(a(((Calendar) (obj1)), ((List) (linkedlist))), linkedlist);
                    linkedlist.clear();
                    linkedlist.add(activitylogentry1);
                }
            }
        }

        if (!linkedlist.isEmpty() && !c1.containsAll(linkedlist))
        {
            c1.a(a(o.b(((ActivityLogEntry)linkedlist.getLast()).getLogDate().getTime()), ((List) (linkedlist))), linkedlist);
        }
        c1.notifyDataSetChanged();
        long al[] = new long[c1.getCount()];
        int k1 = al.length;
        boolean flag = false;
        for (; j1 < k1; j1++)
        {
            ActivityLogEntry activitylogentry = (ActivityLogEntry)c1.get(j1);
            if (m != null)
            {
                m.b().a(activitylogentry.getLogDate());
            }
            if (activitylogentry.p() == null && activitylogentry.f() && k.get(activitylogentry.getServerId()) == null)
            {
                al[j1] = c1.getItemId(j1);
                flag = true;
            }
        }

        if (m != null)
        {
            m.c().a(list);
            m.d().a(list);
            m.f().a(list);
            if (m.a())
            {
                m.e().a(list);
            }
        }
        if (flag)
        {
            list = new Bundle();
            list.putLongArray("ids", al);
            getSupportLoaderManager().restartLoader(0x7f110015, list, this);
        }
        if (i1 == 0x7f110010 && c1.isEmpty())
        {
            ((LoadableListViewFragment)getSupportFragmentManager().findFragmentById(0x7f110086)).d().a();
            h();
        }
        if (!c1.isEmpty())
        {
            i();
        }
    }

    private void a(List list, com.fitbit.ui.a.c c1, a a1)
    {
        LongSparseArray longsparsearray = new LongSparseArray();
        ActivityLogEntry activitylogentry;
        for (list = list.iterator(); list.hasNext(); longsparsearray.append(a1.a(activitylogentry), activitylogentry))
        {
            activitylogentry = (ActivityLogEntry)list.next();
        }

        com.fitbit.e.a.a(b, String.format("Replacing %s activities with annotated activities", new Object[] {
            Integer.valueOf(longsparsearray.size())
        }), new Object[0]);
        list = new ArrayList();
        int j1 = c1.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            ActivityLogEntry activitylogentry1 = (ActivityLogEntry)c1.get(i1);
            ActivityLogEntry activitylogentry2 = (ActivityLogEntry)longsparsearray.get(a1.a(activitylogentry1));
            if (activitylogentry2 != null)
            {
                if (a1.a(activitylogentry1) == -1L)
                {
                    list.add(activitylogentry1);
                } else
                {
                    c1.set(i1, activitylogentry2);
                }
            }
            i1++;
        }
        c1.removeAll(list);
        c1.notifyDataSetChanged();
    }

    private void a(long al[], com.fitbit.ui.a.c c1)
    {
        Iterator iterator = c1.iterator();
label0:
        do
        {
            if (iterator.hasNext())
            {
                ActivityLogEntry activitylogentry = (ActivityLogEntry)iterator.next();
                int j1 = al.length;
                int i1 = 0;
                do
                {
                    if (i1 >= j1)
                    {
                        continue label0;
                    }
                    long l1 = al[i1];
                    if (activitylogentry.getServerId() == l1)
                    {
                        iterator.remove();
                        if (m != null)
                        {
                            m.b().b(activitylogentry.getLogDate());
                        }
                        continue label0;
                    }
                    i1++;
                } while (true);
            }
            a(((List) (new ArrayList())), -1, c1);
            return;
        } while (true);
    }

    static ExercisePagerAdapter b(ExerciseListActivity exerciselistactivity)
    {
        return exerciselistactivity.m;
    }

    static com.fitbit.ui.a.c c(ExerciseListActivity exerciselistactivity)
    {
        return exerciselistactivity.g();
    }

    static String e()
    {
        return b;
    }

    static LongSparseArray f()
    {
        return k;
    }

    private com.fitbit.ui.a.c g()
    {
        Object obj = getSupportFragmentManager().findFragmentById(0x7f110086);
        if (obj != null && (obj instanceof LoadableListViewFragment))
        {
            obj = ((LoadableListViewFragment)obj).e();
            boolean flag;
            if (obj != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag & (obj instanceof com.fitbit.ui.a.c))
            {
                return (com.fitbit.ui.a.c)obj;
            }
        }
        return null;
    }

    private void h()
    {
        View view1 = getWindow().getDecorView();
        if (view1 != null && (view1 instanceof ViewGroup))
        {
            Object obj = view1.findViewById(0x7f110228);
            View view = ((View) (obj));
            if (obj == null)
            {
                view = LayoutInflater.from(this).inflate(0x7f04007c, (ViewGroup)view1);
            }
            obj = (AnimatorSet)AnimatorInflater.loadAnimator(this, 0x7f05000d);
            ((AnimatorSet) (obj)).setTarget(view.findViewById(0x7f110228));
            ((AnimatorSet) (obj)).start();
        }
    }

    private void i()
    {
        View view = getWindow().getDecorView();
        if (view != null && (view instanceof ViewGroup))
        {
            View view1 = view.findViewById(0x7f110228);
            if (view1 != null)
            {
                ((ViewGroup)view).removeView(view1);
            }
        }
    }

    public int a(ActivityLogEntry activitylogentry, ActivityLogEntry activitylogentry1)
    {
        int j1 = activitylogentry.e().compareTo(activitylogentry1.e());
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = (int)(activitylogentry.getServerId() - activitylogentry1.getServerId());
        }
        j1 = i1;
        if (i1 == 0)
        {
            j1 = (int)(activitylogentry.getEntityId().longValue() - activitylogentry1.getEntityId().longValue());
        }
        return j1 * -1;
    }

    protected void a(int i1)
    {
        n = "normal".equals("china");
    }

    public void a(Loader loader, List list)
    {
        loader.getId();
        JVM INSTR tableswitch 2131820559 2131820566: default 52
    //                   2131820559 53
    //                   2131820560 53
    //                   2131820561 52
    //                   2131820562 52
    //                   2131820563 52
    //                   2131820564 52
    //                   2131820565 76
    //                   2131820566 103;
           goto _L1 _L2 _L2 _L1 _L1 _L1 _L1 _L3 _L4
_L1:
        return;
_L2:
        l.sendMessage(l.obtainMessage(0, loader.getId(), 0, list));
        return;
_L3:
        if (!list.isEmpty())
        {
            l.sendMessage(l.obtainMessage(2, list));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!list.isEmpty())
        {
            l.sendMessage(l.obtainMessage(1, list));
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        int i1 = simpleconfirmdialogfragment.getArguments().getInt("entry_idx");
        a((ActivityLogEntry)g().getItem(i1));
    }

    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ActivityLogEntry)obj, (ActivityLogEntry)obj1);
    }

    public boolean handleMessage(Message message)
    {
        com.fitbit.ui.a.c c1 = g();
        if (c1 == null)
        {
            return false;
        }
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            a(new LinkedList((List)message.obj), message.arg1, c1);
            return true;

        case 1: // '\001'
            a((List)message.obj, c1, new a() {

                final ExerciseListActivity a;

                public long a(ActivityLogEntry activitylogentry)
                {
                    if (activitylogentry == null)
                    {
                        return -1L;
                    } else
                    {
                        return activitylogentry.getServerId();
                    }
                }

            
            {
                a = ExerciseListActivity.this;
                super();
            }
            });
            return true;

        case 2: // '\002'
            a((List)message.obj, c1, new a() {

                final ExerciseListActivity a;

                public long a(ActivityLogEntry activitylogentry)
                {
                    activitylogentry = activitylogentry.getEntityId();
                    if (activitylogentry == null)
                    {
                        return -1L;
                    } else
                    {
                        return activitylogentry.longValue();
                    }
                }

            
            {
                a = ExerciseListActivity.this;
                super();
            }
            });
            return true;

        case 3: // '\003'
            a((long[])(long[])message.obj, c1);
            break;
        }
        return true;
    }

    protected void o_()
    {
        super.o_();
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (j1 != -1) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR tableswitch 100 100: default 32
    //                   100 33;
           goto _L2 _L3
_L2:
        return;
_L3:
        com.fitbit.util.f.a(new com.fitbit.util.f.a(this, (ParcelUuid)intent.getParcelableExtra(dg.b)) {

            final ParcelUuid a;
            final ExerciseListActivity b;

            public void b(Object obj)
            {
                obj = ActivityBusinessLogic.a().a(a.getUuid());
            /* block-local class not found */
            class _cls1 {}

                if (obj != null)
                {
                    com.fitbit.runtrack.ui.ExerciseListActivity.a(b).post(new _cls1(((ActivityLogEntry) (obj))));
                }
            }

            
            {
                b = ExerciseListActivity.this;
                a = parceluuid;
                super(obj);
            }
        });
        return;
    }

    public void onCreate(Bundle bundle)
    {
        int i1 = 0;
        super.onCreate(bundle);
        W();
        k = new LongSparseArray();
        l = new Handler(this);
        a.a(new IntentFilter("com.fitbit.data.bl.SyncPendingActivityLogsOperation.ACTIVITY_LOGS_SYNCED"));
        setContentView(0x7f04002e);
        LoadableListViewFragment loadablelistviewfragment = (LoadableListViewFragment)getSupportFragmentManager().findFragmentById(0x7f110086);
        loadablelistviewfragment.d().a(this);
        loadablelistviewfragment.d().a(this);
        loadablelistviewfragment.d().a(getResources().getDrawable(0x7f0202b9));
        loadablelistviewfragment.d().f(1);
        loadablelistviewfragment.a(getText(0x7f08041f));
        bundle = LayoutInflater.from(this).inflate(0x7f0401d4, loadablelistviewfragment.d().j(), false);
        Object obj = new com.fitbit.ui.d(getResources().getColor(0x7f0f0090), getResources().getColor(0x7f0f0168));
        Object obj1 = (ViewGroup)bundle.findViewById(0x7f1102dd);
        View aview[] = new View[((ViewGroup) (obj1)).getChildCount()];
        for (int k1 = ((ViewGroup) (obj1)).getChildCount(); i1 < k1; i1++)
        {
            aview[i1] = ((ViewGroup) (obj1)).getChildAt(i1);
            ((com.fitbit.ui.d) (obj)).a().add(aview[i1]);
        }

        obj1 = (ViewPager)bundle.findViewById(0x7f1104aa);
        m = new ExercisePagerAdapter(getSupportFragmentManager());
        ((ViewPager) (obj1)).setAdapter(m);
        for (int j1 = aview.length - 1; j1 >= m.getCount(); j1--)
        {
            aview[j1].setVisibility(8);
        }

        ((ViewPager) (obj1)).setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener(((com.fitbit.ui.d) (obj))) {

            final com.fitbit.ui.d a;
            final ExerciseListActivity b;

            public void onPageScrollStateChanged(int l1)
            {
                a.onPageScrollStateChanged(l1);
            }

            public void onPageScrolled(int l1, float f1, int i2)
            {
                a.onPageScrolled(l1, f1, i2);
            }

            public void onPageSelected(int l1)
            {
                a.onPageSelected(l1);
                ExercisePagerAdapter.Type type = (ExercisePagerAdapter.Type)com.fitbit.runtrack.ui.ExercisePagerAdapter.a(com.fitbit.runtrack.ui.ExerciseListActivity.b(b)).get(l1);
                switch (com.fitbit.runtrack.ui._cls8.a[type.ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                    (new ExerciseListHeaderSwitchEvent()).a().f();
                    return;

                case 2: // '\002'
                    (new ExerciseListHeaderSwitchEvent()).b().f();
                    return;

                case 3: // '\003'
                    (new ExerciseListHeaderSwitchEvent()).c().f();
                    return;

                case 4: // '\004'
                    (new ExerciseListHeaderSwitchEvent()).d().f();
                    return;

                case 5: // '\005'
                    (new ExerciseListHeaderSwitchEvent()).e().f();
                    break;
                }
            }

            
            {
                b = ExerciseListActivity.this;
                a = d1;
                super();
            }
        });
        obj = new LinearLayout(this);
        ((LinearLayout) (obj)).setOrientation(1);
        ((LinearLayout) (obj)).addView(bundle);
        boolean flag = UISavedState.a(com.fitbit.ui.charts.OnboardingCellView.TileType.f);
        boolean flag1 = UISavedState.a(com.fitbit.ui.charts.OnboardingCellView.TileType.c);
        if (flag || flag1)
        {
            OnboardingCellView onboardingcellview = OnboardingCellView.a(this);
            if (flag)
            {
                bundle = com.fitbit.ui.charts.OnboardingCellView.TileType.f;
            } else
            {
                bundle = com.fitbit.ui.charts.OnboardingCellView.TileType.c;
            }
            onboardingcellview.a(bundle);
            ((LinearLayout) (obj)).addView(onboardingcellview);
        }
        loadablelistviewfragment.d().b(((View) (obj)));
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        switch (i1)
        {
        case 2131820561: 
        case 2131820562: 
        case 2131820563: 
        case 2131820564: 
        default:
            return null;

        case 2131820559: 
        case 2131820560: 
            return new b(this, (com.fitbit.data.bl.ActivityBusinessLogic.Request)bundle.getParcelable("request"));

        case 2131820565: 
            return new c(this, bundle.getLongArray("ids"), new c.a() {

                final ExerciseListActivity a;

                public void a(List list)
                {
                    com.fitbit.ui.a.c c1 = com.fitbit.runtrack.ui.ExerciseListActivity.c(a);
                    if (c1 == null)
                    {
                        return;
                    } else
                    {
                        com.fitbit.runtrack.ui.ExerciseListActivity.a(a, list, c1, new a(this) {

                            final _cls7 a;

                            public long a(ActivityLogEntry activitylogentry)
                            {
                                activitylogentry = activitylogentry.getEntityId();
                                if (activitylogentry == null)
                                {
                                    return -1L;
                                } else
                                {
                                    return activitylogentry.longValue();
                                }
                            }

            
            {
                a = _pcls7;
                super();
            }
                        });
                        return;
                    }
                }

            
            {
                a = ExerciseListActivity.this;
                super();
            }
            });

        case 2131820566: 
            return new d(this, bundle.getLong(dg.b));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f120011, menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        a.d();
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = (ActivityLogEntry)adapterview.getItemAtPosition(i1);
        (new com.fitbit.runtrack.ui.b()).a(adapterview).f();
        startActivityForResult(com.fitbit.runtrack.ui.ExerciseDetailsActivity.a(view.getContext(), adapterview, false), 100);
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = SimpleConfirmDialogFragment.a(this, 0x7f08013c, 0x7f0802c2, 0x7f08013d, 0x7f08005a);
        view = adapterview.getArguments();
        view.putInt("entry_idx", i1 - 1);
        adapterview.setArguments(view);
        ad.a(getSupportFragmentManager(), "delete_activity_dialog", adapterview);
        return true;
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (List)obj);
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

        case 2131821796: 
            startActivity(new Intent(this, com/fitbit/runtrack/ui/RecordExerciseActivity));
            break;
        }
        return true;
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        LoadableListViewFragment loadablelistviewfragment = (LoadableListViewFragment)getSupportFragmentManager().findFragmentById(0x7f110086);
        Object obj = (FitbitMapFragment)getSupportFragmentManager().findFragmentById(0x7f110136);
        if (loadablelistviewfragment.e() == null)
        {
            if (n)
            {
                obj = new m(((FitbitMapFragment) (obj)), new com.fitbit.runtrack.data.b(), getResources().getColor(0x7f0f010c));
            } else
            {
                obj = null;
            }
            obj = new com.fitbit.runtrack.ui.d(((m) (obj)), getSupportLoaderManager(), this);
            loadablelistviewfragment.a(((se.emilsjolander.stickylistheaders.h) (obj)));
            ((com.fitbit.runtrack.ui.d) (obj)).a();
        }
        com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.q);
        FitBitApplication.a().c().a(0x7f11000a).a("Exercise");
    }

}
