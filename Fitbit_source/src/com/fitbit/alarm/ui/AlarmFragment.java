// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Pair;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.fitbit.bluetooth.g;
import com.fitbit.data.domain.Alarm;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.galileo.service.GalileoServicesStateListener;
import com.fitbit.galileo.ui.sync.SyncUICase;
import com.fitbit.galileo.ui.sync.a;
import com.fitbit.galileo.ui.sync.b;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.synclair.ui.SynclairActivity;
import com.fitbit.ui.s;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.az;
import com.fitbit.util.bh;
import com.fitbit.util.bp;
import com.fitbit.util.f;
import com.fitbit.util.format.e;
import com.fitbit.util.p;
import com.fitbit.util.threading.c;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.fitbit.alarm.ui:
//            AlarmFragment_, LogAlarmActivity, AlarmHelpFirstActivity, AlarmItem, 
//            AlarmItem_

public class AlarmFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.widget.AdapterView.OnItemClickListener
{
    class a extends BaseAdapter
    {

        final AlarmFragment a;
        private List b;

        public List a()
        {
            return b;
        }

        public void a(List list)
        {
            b = list;
            notifyDataSetChanged();
        }

        public boolean a(long l1)
        {
            if (getCount() == 0)
            {
                return false;
            }
            for (Iterator iterator = b.iterator(); iterator.hasNext();)
            {
                if (((Alarm)iterator.next()).getEntityId().longValue() == l1)
                {
                    return true;
                }
            }

            return false;
        }

        public int getCount()
        {
            if (b == null)
            {
                return 0;
            } else
            {
                return b.size();
            }
        }

        public Object getItem(int i1)
        {
            return b.get(i1);
        }

        public long getItemId(int i1)
        {
            return ((Alarm)b.get(i1)).getEntityId().longValue();
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            Context context = viewgroup.getContext();
            viewgroup = (AlarmItem)view;
            view = viewgroup;
            if (viewgroup == null)
            {
                view = com.fitbit.alarm.ui.AlarmItem_.a(context);
            }
            view.a((Alarm)b.get(i1));
            return view;
        }

        a()
        {
            a = AlarmFragment.this;
            super();
        }
    }

    class b extends az
    {

        final AlarmFragment b;

        protected boolean a(String s1)
        {
            return com.fitbit.data.bl.b.a().a(s1);
        }

        protected void b()
        {
            com.fitbit.data.bl.b.a().b(this);
        }

        protected void d()
        {
            com.fitbit.data.bl.b.a().a(this);
        }

        public Pair e()
        {
            Device device = com.fitbit.util.p.c(b.f);
            List list = com.fitbit.data.bl.b.a().a(device);
            if (device == null)
            {
                list.clear();
            } else
            {
                Iterator iterator = list.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Alarm alarm = (Alarm)iterator.next();
                    if (alarm.m() != device.getEntityId().longValue() || alarm.getEntityStatus() == com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE && !alarm.b())
                    {
                        iterator.remove();
                    }
                } while (true);
                Collections.sort(list, new Comparator(this) {

                    Calendar a;
                    Calendar b;
                    final b c;

                    public int a(Alarm alarm, Alarm alarm1)
                    {
                        a.setTime(alarm.h());
                        b.setTime(alarm1.h());
                        int j1 = Integer.valueOf(a.get(11)).compareTo(Integer.valueOf(b.get(11)));
                        int i1 = j1;
                        if (j1 == 0)
                        {
                            i1 = Integer.valueOf(a.get(12)).compareTo(Integer.valueOf(b.get(12)));
                        }
                        j1 = i1;
                        if (i1 == 0)
                        {
                            j1 = Integer.valueOf(a.get(13)).compareTo(Integer.valueOf(b.get(13)));
                        }
                        return j1;
                    }

                    public int compare(Object obj, Object obj1)
                    {
                        return a((Alarm)obj, (Alarm)obj1);
                    }

            
            {
                c = b1;
                super();
                a = Calendar.getInstance();
                b = Calendar.getInstance();
            }
                });
            }
            return new Pair(device, list);
        }

        protected Intent f()
        {
            return com.fitbit.data.bl.bh.a(getContext());
        }

        public Object f_()
        {
            return e();
        }

        public void onContentChanged()
        {
            super.onContentChanged();
        }

        public b(Context context)
        {
            b = AlarmFragment.this;
            super(context);
        }
    }


    public static final int a = 200;
    private static final String p = "AlarmFragment";
    private static final String q = "AlarmFragment.TAG_UNABLE_TO_CONECT_DIALOG";
    private static final int r = -1;
    private static final int s = 0;
    private static final int t = 1;
    private boolean A;
    private Handler B;
    protected Button b;
    protected Button c;
    protected GalileoServicesStateListener d;
    protected com.fitbit.galileo.ui.sync.b e;
    protected String f;
    protected ListView g;
    protected View h;
    protected View i;
    protected View j;
    protected View k;
    protected TextView l;
    protected bp m;
    protected View n;
    protected View o;
    private Runnable u;
    private c v;
    private a w;
    private int x;
    private AtomicBoolean y;
    private boolean z;

    public AlarmFragment()
    {
        u = new Runnable() {

            final AlarmFragment a;

            public void run()
            {
                com.fitbit.alarm.ui.AlarmFragment.a(a);
            }

            
            {
                a = AlarmFragment.this;
                super();
            }
        };
        v = new c() {

            final AlarmFragment a;

            public void a(Intent intent)
            {
                boolean flag1;
                boolean flag2;
                flag1 = true;
                intent = intent.getAction();
                flag2 = com.fitbit.alarm.ui.AlarmFragment.b(a);
                if (!"com.fitbit.galileo.GALILEO_SYNC_SERVICE_STATE_CHANGED".equals(intent) || !flag2) goto _L2; else goto _L1
_L1:
                if (a.d.c() != com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState.a) goto _L4; else goto _L3
_L3:
                Set set;
                intent = com.fitbit.util.p.c(a.f);
                set = a.d.i();
                if (intent == null || !set.contains(intent.c())) goto _L6; else goto _L5
_L5:
                boolean flag = flag1;
                if (TrackerSyncPreferencesSavedState.D())
                {
                    if (!TrackerSyncPreferencesSavedState.x())
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                }
                intent = a.d.a(intent.c());
                if (!flag && intent != com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.e) goto _L8; else goto _L7
_L7:
                com.fitbit.alarm.ui.AlarmFragment.c(a);
_L6:
                if (a.getActivity() != null)
                {
                    a.getLoaderManager().restartLoader(190, null, a);
                }
                com.fitbit.alarm.ui.AlarmFragment.a(a, false);
_L2:
                return;
_L8:
                if (intent != null && intent != com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.b && intent != com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.e)
                {
                    AlarmFragment.d(a);
                }
                if (true) goto _L6; else goto _L4
_L4:
                com.fitbit.alarm.ui.AlarmFragment.a(a, true);
                return;
            }

            
            {
                a = AlarmFragment.this;
                super();
            }
        };
        x = -1;
        y = new AtomicBoolean(false);
        z = false;
        A = false;
    }

    public static AlarmFragment a(Context context, String s1)
    {
        return AlarmFragment_.h().a(s1).a();
    }

    static void a(AlarmFragment alarmfragment)
    {
        alarmfragment.o();
    }

    static void a(AlarmFragment alarmfragment, boolean flag)
    {
        alarmfragment.b(flag);
    }

    private void a(Alarm alarm)
    {
        boolean flag1 = true;
        boolean flag;
        if (!alarm.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        alarm.b(flag);
        if (alarm.isNew() && !alarm.a())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        alarm.d(flag);
        com.fitbit.util.f.a(new com.fitbit.util.f.a(getActivity(), alarm) {

            final Alarm a;
            final AlarmFragment b;

            public void a(Activity activity)
            {
                com.fitbit.data.bl.b.a().a(activity, a);
            }

            public void a(Object obj)
            {
                b((Activity)obj);
            }

            public void b(Activity activity)
            {
                super.a(activity);
            }

            public void b(Object obj)
            {
                a((Activity)obj);
            }

            
            {
                b = AlarmFragment.this;
                a = alarm;
                super(activity);
            }
        });
    }

    private void a(List list, boolean flag)
    {
        Animation animation = null;
        Object obj = null;
        Object obj1 = null;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (!com.fitbit.bluetooth.g.h())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = a(list);
        flag3 = n();
        if (flag2 && !flag3 && flag1)
        {
            if (j.getVisibility() != 0)
            {
                obj1 = AnimationUtils.loadAnimation(getActivity(), 0x7f050010);
                obj = j;
            } else
            {
                obj = null;
            }
            if (x != -1 && x != list.size())
            {
                m.d();
            }
            j.setVisibility(0);
            k.setVisibility(8);
            animation = ((Animation) (obj1));
            obj1 = obj;
            obj = animation;
        } else
        if (flag2 && flag3 && flag1)
        {
            if (k.getVisibility() != 0)
            {
                obj = AnimationUtils.loadAnimation(getActivity(), 0x7f050010);
                obj1 = k;
            } else
            {
                obj = null;
                obj1 = animation;
            }
            j.setVisibility(8);
            k.setVisibility(0);
        } else
        {
            if (j.getVisibility() != 8)
            {
                obj1 = AnimationUtils.loadAnimation(getActivity(), 0x7f050011);
                obj = j;
            } else
            {
                obj1 = null;
            }
            animation = ((Animation) (obj1));
            obj1 = obj;
            if (k.getVisibility() != 8)
            {
                animation = AnimationUtils.loadAnimation(getActivity(), 0x7f050011);
                obj1 = k;
            }
            j.setVisibility(8);
            k.setVisibility(8);
            obj = animation;
        }
        x = list.size();
        if (flag && obj != null)
        {
            ((Animation) (obj)).setInterpolator(new AccelerateDecelerateInterpolator());
            ((View) (obj1)).setAnimation(((Animation) (obj)));
        }
    }

    private static boolean a(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (!((Alarm)list.next()).g())
            {
                return true;
            }
        }

        return false;
    }

    private void b(Alarm alarm)
    {
        if (!alarm.l())
        {
            com.fitbit.alarm.ui.LogAlarmActivity.a(getActivity(), com.fitbit.util.p.c(f), alarm);
        }
    }

    private void b(boolean flag)
    {
        Button button = b;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        button.setEnabled(flag1);
        if (flag)
        {
            b.setCompoundDrawablesWithIntrinsicBounds(new com.fitbit.util.g(getResources().getDrawable(0x7f020296), 360F), null, null, null);
            return;
        } else
        {
            b.setCompoundDrawablesWithIntrinsicBounds(0x7f020052, 0, 0, 0);
            return;
        }
    }

    static boolean b(AlarmFragment alarmfragment)
    {
        return alarmfragment.l();
    }

    static void c(AlarmFragment alarmfragment)
    {
        alarmfragment.h();
    }

    private void c(Alarm alarm)
    {
        if (alarm.l())
        {
            return;
        } else
        {
            com.fitbit.util.f.a(new com.fitbit.util.f.a(getActivity(), alarm) {

                final Alarm a;
                final AlarmFragment b;

                public void a(Activity activity)
                {
                    com.fitbit.data.bl.b.a().b(activity, a);
                }

                public void a(Object obj)
                {
                    b((Activity)obj);
                }

                public void b(Activity activity)
                {
                    super.a(activity);
                }

                public void b(Object obj)
                {
                    a((Activity)obj);
                }

            
            {
                b = AlarmFragment.this;
                a = alarm;
                super(activity);
            }
            });
            return;
        }
    }

    static void d(AlarmFragment alarmfragment)
    {
        alarmfragment.p();
    }

    static AtomicBoolean e(AlarmFragment alarmfragment)
    {
        return alarmfragment.y;
    }

    private void h()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity == null)
        {
            return;
        }
        if (ServerGateway.a().d())
        {
            com.fitbit.ui.s.a(fragmentactivity, 0x7f08018e, 1).i();
            return;
        } else
        {
            com.fitbit.ui.s.a(fragmentactivity, 0x7f08053d, 1).i();
            return;
        }
    }

    private void i()
    {
        int i1 = 0;
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(getText(0x7f08036c));
        StyleSpan astylespan[] = (StyleSpan[])spannablestringbuilder.getSpans(0, spannablestringbuilder.length(), android/text/style/StyleSpan);
        for (int j1 = astylespan.length; i1 < j1; i1++)
        {
            StyleSpan stylespan = astylespan[i1];
            spannablestringbuilder.setSpan(new ForegroundColorSpan(getResources().getColor(0x7f0f0169)), spannablestringbuilder.getSpanStart(stylespan), spannablestringbuilder.getSpanEnd(stylespan), spannablestringbuilder.getSpanFlags(stylespan));
        }

        l.setText(spannablestringbuilder);
    }

    private void j()
    {
        v.d();
    }

    private void k()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.galileo.GALILEO_SYNC_SERVICE_STATE_CHANGED");
        v.a(intentfilter);
    }

    private boolean l()
    {
        return A && isResumed();
    }

    private void m()
    {
        if (l())
        {
            k();
            return;
        } else
        {
            j();
            return;
        }
    }

    private boolean n()
    {
        return com.fitbit.bluetooth.g.f();
    }

    private void o()
    {
        if (w.getCount() == 0 && UISavedState.p())
        {
            com.fitbit.alarm.ui.AlarmHelpFirstActivity.a(this, 200, com.fitbit.util.p.c(f));
            return;
        }
        if (w.getCount() < 8)
        {
            UISavedState.b(false);
            com.fitbit.alarm.ui.LogAlarmActivity.a(getActivity(), com.fitbit.util.p.c(f));
            return;
        } else
        {
            SimpleConfirmDialogFragment simpleconfirmdialogfragment = new SimpleConfirmDialogFragment(0x7f08042e, 0);
            SimpleConfirmDialogFragment.a(simpleconfirmdialogfragment, 0x7f08052f, 0x7f08031c, null);
            ad.a(getFragmentManager(), "alarms_dialog", simpleconfirmdialogfragment);
            return;
        }
    }

    private void p()
    {
        if (getActivity() != null)
        {
            SimpleConfirmDialogFragment simpleconfirmdialogfragment1 = (SimpleConfirmDialogFragment)getFragmentManager().findFragmentByTag("AlarmFragment.TAG_UNABLE_TO_CONECT_DIALOG");
            SimpleConfirmDialogFragment simpleconfirmdialogfragment = simpleconfirmdialogfragment1;
            if (simpleconfirmdialogfragment1 == null)
            {
                simpleconfirmdialogfragment = new SimpleConfirmDialogFragment(0x7f08042e, 0);
                simpleconfirmdialogfragment.setCancelable(true);
                simpleconfirmdialogfragment.setRetainInstance(true);
                SimpleConfirmDialogFragment.a(simpleconfirmdialogfragment, getString(0x7f080566), getString(0x7f08055e), null);
            }
            if (!simpleconfirmdialogfragment.isAdded())
            {
                simpleconfirmdialogfragment.show(getFragmentManager(), "AlarmFragment.TAG_UNABLE_TO_CONECT_DIALOG");
            }
        }
    }

    private void q()
    {
label0:
        {
            if (isResumed())
            {
                if (d.c() != com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState.a)
                {
                    break label0;
                }
                b(false);
            }
            return;
        }
        b(true);
    }

    protected void a()
    {
        w = new a();
        g.setOverscrollFooter(null);
        g.setAdapter(w);
        g.setOnCreateContextMenuListener(this);
        g.setEmptyView(h);
        g.setOnItemClickListener(this);
        i.setVisibility(4);
        i();
        j.setVisibility(8);
        m = new bp((TransitionDrawable)j.getBackground());
        getLoaderManager().initLoader(190, null, this);
    }

    public void a(Loader loader, Pair pair)
    {
        w.a((List)pair.second);
        y.set(false);
        if (pair.first != null && !((Device)pair.first).a(DeviceFeature.ALARMS))
        {
            i.setVisibility(4);
            if (n())
            {
                o.setVisibility(0);
                n.setVisibility(4);
            } else
            {
                n.setVisibility(0);
                o.setVisibility(4);
            }
            q();
        } else
        {
            o.setVisibility(4);
            n.setVisibility(4);
            boolean flag;
            if (i.getVisibility() != 0)
            {
                i.setVisibility(0);
                loader = AnimationUtils.loadAnimation(getActivity(), 0x10a0000);
                loader.setDuration(150L);
                i.setAnimation(loader);
                flag = false;
            } else
            {
                flag = true;
            }
            a((List)pair.second, flag);
        }
        if (z)
        {
            z = false;
            B.post(u);
        }
        ActivityCompat.invalidateOptionsMenu(getActivity());
    }

    public void a(String s1)
    {
        f = s1;
    }

    public void a(boolean flag)
    {
        if (A != flag)
        {
            A = flag;
            m();
            q();
        }
    }

    public boolean b()
    {
        return i.getVisibility() == 0;
    }

    public String c()
    {
        return f;
    }

    protected void d()
    {
        e();
    }

    protected void e()
    {
        if (!b())
        {
            return;
        }
        if (!y.get())
        {
            o();
            return;
        } else
        {
            z = true;
            return;
        }
    }

    protected void f()
    {
        Device device = com.fitbit.util.p.c(f);
        if (device != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        SyncUICase syncuicase = e.a(device.c());
        com.fitbit.galileo.ui.sync.a a1 = e.b(device.c());
        e.c(device.c());
        static class _cls8
        {

            static final int a[];

            static 
            {
                a = new int[SyncUICase.values().length];
                try
                {
                    a[SyncUICase.g.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[SyncUICase.j.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[SyncUICase.l.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[SyncUICase.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[SyncUICase.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[SyncUICase.i.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[SyncUICase.k.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[SyncUICase.m.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[SyncUICase.n.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[SyncUICase.o.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.fitbit.alarm.ui._cls8.a[syncuicase.ordinal()])
        {
        default:
            if (!com.fitbit.bluetooth.g.a(getActivity(), e) && com.fitbit.bluetooth.g.c(getActivity(), new com.fitbit.util.EnableBluetoothDialog.a() {

        final AlarmFragment a;

        public void a()
        {
            com.fitbit.ui.s.a(a.getActivity(), 0x7f08008d, 1).i();
        }

        public void b()
        {
            a.f();
        }

        public void c()
        {
            com.fitbit.ui.s.a(a.getActivity(), 0x7f08008d, 1).i();
        }

            
            {
                a = AlarmFragment.this;
                super();
            }
    }, "BluetoothUtils.REQUEST_ENABLE_BLUETOOTH_FOR_UPDATE"))
            {
                SynclairActivity.a(getActivity(), device.j(), device.d());
                return;
            }
            break;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            com.fitbit.ui.s.a(getActivity(), a1.c, 1).i();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void g()
    {
        Device device = com.fitbit.util.p.c(f);
        if (device == null)
        {
            return;
        }
        e.f();
        SyncUICase syncuicase = e.a(device.c());
        com.fitbit.galileo.ui.sync.a a1 = e.b(device.c());
        switch (com.fitbit.alarm.ui._cls8.a[syncuicase.ordinal()])
        {
        default:
            if (!BluetoothAdapter.getDefaultAdapter().isEnabled())
            {
                com.fitbit.bluetooth.g.a(this, new com.fitbit.util.EnableBluetoothDialog.a() {

                    final AlarmFragment a;

                    public void a()
                    {
                        com.fitbit.ui.s.a(a.getActivity(), 0x7f08008e, 1).i();
                    }

                    public void b()
                    {
                        a.g();
                    }

                    public void c()
                    {
                        com.fitbit.ui.s.a(a.getActivity(), 0x7f08008e, 1).i();
                    }

            
            {
                a = AlarmFragment.this;
                super();
            }
                }, "BluetoothUtils.REQUEST_ENABLE_BLUETOOTH_FOR_SYNC", true);
                return;
            } else
            {
                com.fitbit.e.a.a("AlarmFragment", "Starting galileo sync service from AlarmFragment", new Object[0]);
                com.fitbit.multipledevice.a.a().a(device.c(), com.fitbit.serverinteraction.SynclairApi.SyncTrigger.b, true);
                return;
            }

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
            com.fitbit.ui.s.a(getActivity(), a1.c, 0).i();
            e.c(device.c());
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setHasOptionsMenu(true);
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        Object obj = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
        if (((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position < 0 || ((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position >= w.getCount() || !w.a(((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).id))
        {
            return false;
        }
        obj = (Alarm)w.getItem(((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position);
        switch (menuitem.getItemId())
        {
        default:
            return super.onContextItemSelected(menuitem);

        case -1: 
            a(((Alarm) (obj)));
            return true;

        case 0: // '\0'
            b(((Alarm) (obj)));
            return true;

        case 1: // '\001'
            c(((Alarm) (obj)));
            break;
        }
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        B = new Handler();
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        view = (android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo;
        view = (Alarm)w.getItem(((android.widget.AdapterView.AdapterContextMenuInfo) (view)).position);
        contextmenu.setHeaderTitle(com.fitbit.util.format.e.n(getActivity(), view.h()));
        if (!view.l())
        {
            int i1;
            if (view.a())
            {
                i1 = 0x7f080365;
            } else
            {
                i1 = 0x7f080366;
            }
            contextmenu.add(0, -1, 0, i1);
            contextmenu.add(0, 0, 0, 0x7f0802e4);
            contextmenu.add(0, 1, 0, bh.b(getActivity(), 0x7f0802d9));
        }
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new b(getActivity()) {

            final AlarmFragment a;

            public void forceLoad()
            {
                com.fitbit.alarm.ui.AlarmFragment.e(a).set(true);
                super.forceLoad();
            }

            
            {
                a = AlarmFragment.this;
                super(context);
            }
        };
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        b((Alarm)adapterview.getItemAtPosition(i1));
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Pair)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onPause()
    {
        super.onPause();
        m();
        m.c();
        m.e();
    }

    public void onResume()
    {
        super.onResume();
        getLoaderManager().restartLoader(190, null, this);
        m();
        q();
    }
}
