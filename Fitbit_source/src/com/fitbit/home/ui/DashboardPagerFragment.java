// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.fitbit.bluetooth.g;
import com.fitbit.data.bl.LogoutTaskState;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.device.Device;
import com.fitbit.galileo.ui.sync.SyncUICase;
import com.fitbit.galileo.ui.sync.b;
import com.fitbit.galileo.ui.sync.c;
import com.fitbit.multipledevice.a;
import com.fitbit.onboarding.whatsnew.NewFeatureDialogFragment;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.savedstate.q;
import com.fitbit.synclair.ui.SynclairActivity;
import com.fitbit.ui.DayFragment;
import com.fitbit.ui.DayPagerFragment;
import com.fitbit.ui.s;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.al;
import com.fitbit.util.ap;
import com.fitbit.util.bh;
import com.fitbit.util.p;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardFragment_, DashboardFragment, c

public class DashboardPagerFragment extends DayPagerFragment
    implements com.fitbit.ui.k.c
{

    public static final String a = "dashboard-layout";
    public static final String b = "whats_new_dialog";
    private static final String f = com/fitbit/home/ui/DashboardPagerFragment.getSimpleName();
    private static final String g = "HomeFragment.NFC_INITIATED_SYNC_BT_REQUEST";
    private static final String h = "com.fitbit.home.ui.TAG_RESUME_MANDATORY_FIRMWARE_UPDATE";
    private static final int i = 1000;
    private static final String o = "INTRODUCTION_OF_SLEEP_GOALS";
    private ArrayList j;
    private com.fitbit.ui.k.a k;
    private ImageView l;
    private com.fitbit.home.ui.c m;
    private final com.fitbit.util.threading.c n = new com.fitbit.util.threading.c() {

        final DashboardPagerFragment a;

        protected void a(Intent intent)
        {
            Object obj = intent.getExtras().getString("EXTRA_FW_UPDATE_STATUS");
            intent = intent.getExtras().getString("EXTRA_FW_UPDATE_DEVICE");
            obj = com.fitbit.serverinteraction.SynclairApi.FirmwareUpdateStatus.a(((String) (obj)));
            if (com.fitbit.serverinteraction.SynclairApi.FirmwareUpdateStatus.a == obj)
            {
                com.fitbit.home.ui.DashboardPagerFragment.a(a, intent);
            } else
            if (com.fitbit.serverinteraction.SynclairApi.FirmwareUpdateStatus.c == obj)
            {
                a.a(intent);
                return;
            }
        }

            
            {
                a = DashboardPagerFragment.this;
                super();
            }
    };
    private android.view.View.OnDragListener p;
    private int q;

    public DashboardPagerFragment()
    {
        p = new android.view.View.OnDragListener() {

            final DashboardPagerFragment a;

            public boolean onDrag(View view, DragEvent dragevent)
            {
                switch (dragevent.getAction())
                {
                case 4: // '\004'
                default:
                    return true;

                case 5: // '\005'
                    com.fitbit.home.ui.DashboardPagerFragment.b(a).setImageLevel(1);
                    return true;

                case 3: // '\003'
                    view = (DashboardFragment)com.fitbit.home.ui.DashboardPagerFragment.a(a, com.fitbit.home.ui.DashboardPagerFragment.c(a));
                    if (view != null)
                    {
                        view.m();
                    }
                    // fall through

                case 6: // '\006'
                    com.fitbit.home.ui.DashboardPagerFragment.b(a).setImageLevel(0);
                    return true;
                }
            }

            
            {
                a = DashboardPagerFragment.this;
                super();
            }
        };
        q = -1;
    }

    static DayFragment a(DashboardPagerFragment dashboardpagerfragment, int i1)
    {
        return dashboardpagerfragment.b(i1);
    }

    static ArrayList a(DashboardPagerFragment dashboardpagerfragment)
    {
        return dashboardpagerfragment.j;
    }

    private void a(View view)
    {
        view = (ViewGroup)view.findViewById(0x7f11027c);
        view.setOnClickListener(new android.view.View.OnClickListener(view) {

            final ViewGroup a;
            final DashboardPagerFragment b;

            public void onClick(View view1)
            {
                if (com.fitbit.home.ui.DashboardPagerFragment.a(b).isEmpty())
                {
                    a.setVisibility(8);
                    com.fitbit.e.a.f(DashboardPagerFragment.f(), "There were no PanelContent items to display", new Object[0]);
                    return;
                }
                view1 = b.getChildFragmentManager().beginTransaction();
                Fragment fragment = b.getChildFragmentManager().findFragmentByTag("whats_new_dialog");
                if (fragment != null)
                {
                    view1.remove(fragment);
                }
                view1.addToBackStack(null);
                NewFeatureDialogFragment.a(com.fitbit.home.ui.DashboardPagerFragment.a(b)).show(view1, "whats_new_dialog");
                a.setVisibility(8);
                com.fitbit.savedstate.q.b("INTRODUCTION_OF_SLEEP_GOALS");
            }

            
            {
                b = DashboardPagerFragment.this;
                a = viewgroup;
                super();
            }
        });
    }

    private void a(Device device)
    {
        if (com.fitbit.bluetooth.g.c(getActivity(), new com.fitbit.util.EnableBluetoothDialog.a(device) {

        final Device a;
        final DashboardPagerFragment b;

        public void a()
        {
            s.a(b.getActivity(), 0x7f08008e, 1).i();
        }

        public void b()
        {
            com.fitbit.home.ui.DashboardPagerFragment.a(b, a);
        }

        public void c()
        {
            s.a(b.getActivity(), 0x7f08008e, 1).i();
        }

            
            {
                b = DashboardPagerFragment.this;
                a = device;
                super();
            }
    }, "HomeFragment.NFC_INITIATED_SYNC_BT_REQUEST"))
        {
            com.fitbit.multipledevice.a.a().a(device.c(), com.fitbit.serverinteraction.SynclairApi.SyncTrigger.a, false);
        }
    }

    static void a(DashboardPagerFragment dashboardpagerfragment, Device device)
    {
        dashboardpagerfragment.a(device);
    }

    static void a(DashboardPagerFragment dashboardpagerfragment, String s1)
    {
        dashboardpagerfragment.c(s1);
    }

    static ImageView b(DashboardPagerFragment dashboardpagerfragment)
    {
        return dashboardpagerfragment.l;
    }

    private void b(Device device)
    {
        if (device != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        c c1 = com.fitbit.galileo.ui.sync.c.b(getActivity());
        SyncUICase syncuicase = c1.a(device.c());
        com.fitbit.galileo.ui.sync.a a1 = c1.b(device.c());
        c1.c(device.c());
        static class _cls9
        {

            static final int a[];

            static 
            {
                a = new int[SyncUICase.values().length];
                try
                {
                    a[SyncUICase.g.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[SyncUICase.j.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[SyncUICase.l.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[SyncUICase.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.fitbit.home.ui._cls9.a[syncuicase.ordinal()])
        {
        default:
            if (!com.fitbit.bluetooth.g.a(getActivity(), c1) && com.fitbit.bluetooth.g.c(getActivity(), new com.fitbit.util.EnableBluetoothDialog.a(device) {

        final Device a;
        final DashboardPagerFragment b;

        public void a()
        {
            s.a(b.getActivity(), 0x7f08008d, 1).i();
        }

        public void b()
        {
            com.fitbit.home.ui.DashboardPagerFragment.b(b, a);
        }

        public void c()
        {
            s.a(b.getActivity(), 0x7f08008d, 1).i();
        }

            
            {
                b = DashboardPagerFragment.this;
                a = device;
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
            s.a(getActivity(), a1.c, 1).i();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static void b(DashboardPagerFragment dashboardpagerfragment, Device device)
    {
        dashboardpagerfragment.b(device);
    }

    private void b(String s1)
    {
        if (!com.fitbit.bluetooth.g.f())
        {
            com.fitbit.e.a.a(f, "BTLE is not supported for this device. Do nothing", new Object[0]);
        } else
        {
            com.fitbit.e.a.a(f, "handling nfc launch...", new Object[0]);
            s1 = com.fitbit.util.p.f();
            if (s1 != null)
            {
                com.fitbit.e.a.a(f, "tracker with wireless sync feature exists in profile. Do force sync", new Object[0]);
                a(s1);
                return;
            }
        }
    }

    static int c(DashboardPagerFragment dashboardpagerfragment)
    {
        return dashboardpagerfragment.q;
    }

    private void c(String s1)
    {
        if (LogoutTaskState.a() != com.fitbit.data.bl.LogoutTaskState.State.b)
        {
            s1 = com.fitbit.util.p.c(s1);
            if (s1 != null)
            {
                String s2 = s1.j();
                s2 = bh.a(getActivity(), 0x7f08015e, new String[] {
                    s2
                });
                s1 = SimpleConfirmDialogFragment.a(new com.fitbit.util.SimpleConfirmDialogFragment.a(s1) {

                    final Device a;
                    final DashboardPagerFragment b;

                    public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                    {
                        com.fitbit.home.ui.DashboardPagerFragment.b(b, a);
                    }

                    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                    {
                    }

                    public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                    {
                    }

            
            {
                b = DashboardPagerFragment.this;
                a = device;
                super();
            }
                }, 0x7f08015c, 0x7f08015d, 0x7f0801c0, s2);
                ad.a(getActivity().getSupportFragmentManager(), "com.fitbit.home.ui.TAG_RESUME_MANDATORY_FIRMWARE_UPDATE", s1);
            }
        }
    }

    static String f()
    {
        return f;
    }

    private void g()
    {
        j.add((new com.fitbit.onboarding.whatsnew.PanelContent.a(0x7f020231, getResources().getString(0x7f08059b), getResources().getString(0x7f080599))).c("").a(false).b(false).a(com.fitbit.onboarding.whatsnew.PanelContent.PanelTheme.b).b(getResources().getColor(0x7f0f0171)).c(getResources().getColor(0x7f0f0170)).a());
    }

    public Fragment a(Calendar calendar)
    {
        return DashboardFragment_.n().a(calendar).a();
    }

    public android.view.View.OnClickListener a()
    {
        return new android.view.View.OnClickListener() {

            final DashboardPagerFragment a;

            public void onClick(View view)
            {
            }

            
            {
                a = DashboardPagerFragment.this;
                super();
            }
        };
    }

    public void a(com.fitbit.home.ui.c c1)
    {
        m = c1;
    }

    public void a(com.fitbit.ui.k.a a1)
    {
        boolean flag;
        if (!a1.d().isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.a(flag, new DashboardFragment.Tile[] {
            com.fitbit.home.ui.DashboardFragment.Tile.p
        });
    }

    public void a(com.fitbit.ui.k.a a1, Set set, Set set1)
    {
    }

    protected void a(String s1)
    {
        if (LogoutTaskState.a() != com.fitbit.data.bl.LogoutTaskState.State.b && UISavedState.x())
        {
            s1 = com.fitbit.util.p.c(s1);
            if (s1 != null)
            {
                UISavedState.f(false);
                String s2 = bh.a(getActivity(), 0x7f080385, new String[] {
                    al.d(an.a().b().d())
                });
                s1 = SimpleConfirmDialogFragment.a(new com.fitbit.util.SimpleConfirmDialogFragment.a(s1) {

                    final Device a;
                    final DashboardPagerFragment b;

                    public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                    {
                        com.fitbit.home.ui.DashboardPagerFragment.b(b, a);
                    }

                    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                    {
                    }

                    public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                    {
                    }

            
            {
                b = DashboardPagerFragment.this;
                a = device;
                super();
            }
                }, 0x7f08042e, 0x7f08015d, 0x7f080386, s2);
                ad.a(getActivity().getSupportFragmentManager(), "com.fitbit.home.ui.TAG_RESUME_MANDATORY_FIRMWARE_UPDATE", s1);
            }
        }
    }

    public void b(com.fitbit.ui.k.a a1)
    {
        if (!a1.d().isEmpty())
        {
            HashSet hashset = new HashSet(a1.d());
            hashset.removeAll(a1.e());
            a1.a(hashset);
            return;
        } else
        {
            a1.a(false, new DashboardFragment.Tile[] {
                com.fitbit.home.ui.DashboardFragment.Tile.p
            });
            return;
        }
    }

    public void c()
    {
        l.animate().setDuration(1000L).translationX(-l.getWidth()).setInterpolator(new com.fitbit.runtrack.ui.RecordExerciseSessionActivity.e(0.1F, 10F, 20F));
        l.setOnDragListener(p);
    }

    public void d()
    {
        l.animate().setDuration(1000L).translationX(0.0F).setInterpolator(new com.fitbit.runtrack.ui.RecordExerciseSessionActivity.e(0.1F, 10F, 20F));
        l.setOnDragListener(null);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(-14, 0);
        k = com.fitbit.ui.k.a.a(getActivity(), "dashboard-layout", com/fitbit/home/ui/DashboardFragment$Tile);
        b(k);
        a(k);
        k.a(this);
        j = new ArrayList();
        g();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        View view = layoutinflater.inflate(0x7f040094, viewgroup, false);
        d = (ViewPager)view.findViewById(0x7f11009e);
        d.setSaveEnabled(false);
        d.setOnPageChangeListener(this);
        d.setPageMargin(ap.a(d.getContext(), 24F));
        d.setAdapter(e);
        if (bundle != null)
        {
            viewgroup = bundle.getBundle(c);
        } else
        {
            viewgroup = null;
        }
        if (viewgroup != null)
        {
            e.restoreState(viewgroup, layoutinflater.getContext().getClassLoader());
        }
        d.setCurrentItem(e.a(com.fitbit.savedstate.c.i()));
        l = (ImageView)view.findViewById(0x7f11027b);
        a(view);
        return view;
    }

    public void onDestroy()
    {
        super.onDestroy();
        k.b(this);
    }

    public void onPageSelected(int i1)
    {
        super.onPageSelected(i1);
        if (q != i1)
        {
            if (q >= 0)
            {
                DashboardFragment dashboardfragment = (DashboardFragment)b(q);
                DashboardFragment dashboardfragment1 = (DashboardFragment)b(i1);
                if (dashboardfragment != null && dashboardfragment1 != null)
                {
                    dashboardfragment1.a(dashboardfragment.l());
                }
            }
            q = i1;
        }
    }

    public void onPause()
    {
        super.onPause();
        n.d();
    }

    public void onResume()
    {
        super.onResume();
        if (getView() != null)
        {
            ((ViewGroup)getView().findViewById(0x7f11027c)).setVisibility(8);
        }
        com.fitbit.profile.a a1 = com.fitbit.profile.a.a();
        String s1 = a1.b();
        a1.a(null);
        if (s1 != null)
        {
            b(s1);
        }
    }

    public void setUserVisibleHint(boolean flag)
    {
        super.setUserVisibleHint(flag);
        if (flag)
        {
            n.a(new IntentFilter("ACTION_FW_UPDATE_STATUS_RECEIVED"));
            return;
        } else
        {
            n.d();
            return;
        }
    }

}
