// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.View;
import com.fitbit.activity.ui.activitylog.LogNewExerciseFragment;
import com.fitbit.e.a;
import com.fitbit.maps.g;
import com.fitbit.savedstate.ActivityLoggingState;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.bq;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            PreRunScreen

public class RecordExerciseActivity extends FitbitActivity
    implements android.support.v4.view.ViewPager.OnPageChangeListener, android.support.v7.app.ActionBar.TabListener, com.fitbit.maps.g.a, com.fitbit.maps.g.b
{
    private static class OptionsPager extends FragmentPagerAdapter
    {

        private PreRunScreen a;
        private LogNewExerciseFragment b;
        private final List c;

        private PreRunScreen a()
        {
            if (a == null)
            {
                PreRunScreen prerunscreen = new PreRunScreen();
                a = prerunscreen;
                return prerunscreen;
            } else
            {
                return a;
            }
        }

        static PreRunScreen a(OptionsPager optionspager)
        {
            return optionspager.a();
        }

        private LogNewExerciseFragment b()
        {
            if (b == null)
            {
                LogNewExerciseFragment lognewexercisefragment = new LogNewExerciseFragment();
                b = lognewexercisefragment;
                return lognewexercisefragment;
            } else
            {
                return b;
            }
        }

        public int getCount()
        {
            return c.size();
        }

        public Fragment getItem(int l)
        {
            static class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[OptionsPager.Type.values().length];
                    try
                    {
                        a[com.fitbit.runtrack.ui.OptionsPager.Type.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[OptionsPager.Type.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (com.fitbit.runtrack.ui._cls1.a[((Type)c.get(l)).ordinal()])
            {
            default:
                return null;

            case 1: // '\001'
                return a();

            case 2: // '\002'
                return b();
            }
        }

        public OptionsPager(FragmentManager fragmentmanager, boolean flag)
        {
            super(fragmentmanager);
            fragmentmanager = EnumSet.allOf(com/fitbit/runtrack/ui/RecordExerciseActivity$OptionsPager$Type);
            if (!flag)
            {
                fragmentmanager.remove(com.fitbit.runtrack.ui.Type.a);
            }
            c = new LinkedList(fragmentmanager);
        }
    }

    static final class OptionsPager.Type extends Enum
    {

        public static final OptionsPager.Type a;
        public static final OptionsPager.Type b;
        private static final OptionsPager.Type c[];

        public static OptionsPager.Type valueOf(String s)
        {
            return (OptionsPager.Type)Enum.valueOf(com/fitbit/runtrack/ui/RecordExerciseActivity$OptionsPager$Type, s);
        }

        public static OptionsPager.Type[] values()
        {
            return (OptionsPager.Type[])c.clone();
        }

        static 
        {
            a = new OptionsPager.Type("Tracking", 0);
            b = new OptionsPager.Type("ManualLog", 1);
            c = (new OptionsPager.Type[] {
                a, b
            });
        }

        private OptionsPager.Type(String s, int l)
        {
            super(s, l);
        }
    }


    private static final String f = com/fitbit/runtrack/ui/RecordExerciseActivity.getSimpleName();
    private static final String g = "TRACK";
    private static final String h = "ACTIVITY_LOG";
    private static final String i = "tab";
    g c;
    ViewPager d;
    OptionsPager e;
    private boolean j;
    private int k;

    public RecordExerciseActivity()
    {
        j = true;
    }

    private void f()
    {
        ActionBar actionbar;
        boolean flag;
        flag = false;
        actionbar = getSupportActionBar();
        actionbar.setNavigationMode(2);
        if (j)
        {
            actionbar.addTab(actionbar.newTab().setText(0x7f08055c).setTag("TRACK").setTabListener(this));
        }
        actionbar.addTab(actionbar.newTab().setText(0x7f08039b).setTag("ACTIVITY_LOG").setTabListener(this));
        if (k != -1) goto _L2; else goto _L1
_L1:
        String s;
        int l;
        com.fitbit.savedstate.ActivityLoggingState.LoggingType loggingtype = ActivityLoggingState.g();
        s = "ACTIVITY_LOG";
        if (loggingtype == com.fitbit.savedstate.ActivityLoggingState.LoggingType.b)
        {
            s = "TRACK";
        }
        l = 0;
_L7:
        if (l >= actionbar.getTabCount()) goto _L2; else goto _L3
_L3:
        if (!s.equals(actionbar.getTabAt(l).getTag())) goto _L5; else goto _L4
_L4:
        k = actionbar.getTabAt(l).getPosition();
_L2:
        if (k < 0)
        {
            k = 0;
            l = ((flag) ? 1 : 0);
        } else
        {
            l = k;
        }
        k = l;
        k = Math.min(k, actionbar.getTabCount());
        actionbar.selectTab(actionbar.getTabAt(k));
        setContentView(0x7f040040);
        return;
_L5:
        l++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void g()
    {
        if (c == null || !c.b() && !c.c())
        {
            c = new g(this, this, this);
            c.a();
        }
    }

    private boolean h()
    {
        return TextUtils.equals("TRACK", String.valueOf(getSupportActionBar().getSelectedTab().getTag()));
    }

    private boolean i()
    {
        return TextUtils.equals("ACTIVITY_LOG", String.valueOf(getSupportActionBar().getSelectedTab().getTag()));
    }

    protected void a(int l)
    {
        j = "normal".equals("china");
        if (j)
        {
            g();
        }
        f();
    }

    public void a(Bundle bundle)
    {
        if (e != null && c != null)
        {
            c.a(com.fitbit.runtrack.ui.OptionsPager.a(e), 1000L);
        }
    }

    public void a(String s)
    {
        c = null;
        com.fitbit.e.a.a(f, String.format("Connection Failed %s", new Object[] {
            s
        }), new Object[0]);
    }

    public void h_(int l)
    {
        c = null;
        com.fitbit.e.a.a(f, String.format("Connection suspended %s", new Object[] {
            Integer.valueOf(l)
        }), new Object[0]);
    }

    protected void o_()
    {
        f();
        g();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        k = -1;
        if (bundle != null)
        {
            k = bundle.getInt("tab", k);
        }
        W();
    }

    public void onPageScrollStateChanged(int l)
    {
    }

    public void onPageScrolled(int l, float f1, int i1)
    {
    }

    public void onPageSelected(int l)
    {
        Object obj = getSupportActionBar();
        android.support.v7.app.ActionBar.Tab tab = ((ActionBar) (obj)).getTabAt(l);
        obj = ((ActionBar) (obj)).getSelectedTab();
        if (!TextUtils.equals(String.valueOf(tab.getTag()), String.valueOf(((android.support.v7.app.ActionBar.Tab) (obj)).getTag())))
        {
            tab.select();
        }
        if (TextUtils.equals(String.valueOf(tab.getTag()), "TRACK"))
        {
            bq.a(this);
            View view = getCurrentFocus();
            if (view != null)
            {
                view.clearFocus();
            }
        }
        supportInvalidateOptionsMenu();
    }

    protected void onPause()
    {
        super.onPause();
        if (c != null)
        {
            c.d();
            c = null;
        }
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        if (d != null)
        {
            g();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("tab", k);
    }

    public void onSupportContentChanged()
    {
        super.onSupportContentChanged();
        d = (ViewPager)findViewById(0x7f11009e);
        e = new OptionsPager(getSupportFragmentManager(), j);
        d.setAdapter(e);
        d.setOnPageChangeListener(this);
        getSupportActionBar().selectTab(getSupportActionBar().getSelectedTab());
    }

    public void onTabReselected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
    {
        onTabSelected(tab, fragmenttransaction);
    }

    public void onTabSelected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
    {
        if (d == null)
        {
            return;
        } else
        {
            k = tab.getPosition();
            d.setCurrentItem(tab.getPosition(), true);
            return;
        }
    }

    public void onTabUnselected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
    {
    }

}
