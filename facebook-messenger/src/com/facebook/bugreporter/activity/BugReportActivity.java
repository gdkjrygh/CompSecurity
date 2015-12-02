// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ad;
import com.facebook.auth.annotations.IsMeUserAnEmployee;
import com.facebook.base.activity.i;
import com.facebook.base.fragment.c;
import com.facebook.bugreporter.BugReport;
import com.facebook.bugreporter.ConstBugReporterConfig;
import com.facebook.bugreporter.activity.bugreport.BugReportFragment;
import com.facebook.bugreporter.activity.categorylist.CategoryInfo;
import com.facebook.bugreporter.activity.categorylist.CategoryListFragment;
import com.facebook.bugreporter.activity.tasklist.TaskListFragment;
import com.facebook.bugreporter.annotations.IsOldVersionOfTheApp;
import com.facebook.bugreporter.b;
import com.facebook.bugreporter.m;
import com.facebook.bugreporter.x;
import com.facebook.common.w.q;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.ui.i.a;
import com.facebook.ui.i.g;
import com.google.common.a.es;
import com.google.common.base.Strings;

// Referenced classes of package com.facebook.bugreporter.activity:
//            c, d

public class BugReportActivity extends i
    implements x
{

    private static final Class p = com/facebook/bugreporter/activity/BugReportActivity;
    private ConstBugReporterConfig q;
    private javax.inject.a r;
    private m s;
    private q t;
    private c u;
    private b v;
    private g w;

    public BugReportActivity()
    {
    }

    private void a(com.facebook.base.fragment.b b1, Intent intent)
    {
        boolean flag = false;
        if (intent != null) goto _L2; else goto _L1
_L1:
        finish();
_L9:
        return;
_L2:
        boolean flag1;
        if (b1 instanceof CategoryListFragment)
        {
            flag = intent.getBooleanExtra("retry", false);
            if (!flag)
            {
                intent = intent.getStringExtra("category_id");
                b1 = intent;
                if (intent == null)
                {
                    b1 = "100977986739334";
                }
                v.c(b1);
            }
            if (t == q.YES)
            {
                a(true, v.h(), flag);
                return;
            } else
            {
                a(true, v.o());
                return;
            }
        }
        if (!(b1 instanceof TaskListFragment))
        {
            continue; /* Loop/switch isn't completed */
        }
        int l = intent.getIntExtra("task_number", -1);
        flag1 = intent.getBooleanExtra("remove_fragment", false);
        if (l != -1)
        {
            s.a(v.a());
            w.a(new a(o.bug_report_thank_you_toast));
            finish();
            return;
        }
        if (!flag1) goto _L4; else goto _L3
_L3:
        b1 = f();
        if (b1.f() != 0) goto _L6; else goto _L5
_L5:
        a(flag, v.o());
        return;
_L6:
        b1.a("task_list_bs", 1);
_L4:
        flag = true;
        if (true) goto _L5; else goto _L7
_L7:
        if (!(b1 instanceof BugReportFragment)) goto _L9; else goto _L8
_L8:
        b1 = intent.getStringExtra("bug_desc");
        if (!Strings.isNullOrEmpty(b1))
        {
            v.a(b1);
            return;
        }
        if (true) goto _L9; else goto _L10
_L10:
    }

    static void a(BugReportActivity bugreportactivity, com.facebook.base.fragment.b b1, Intent intent)
    {
        bugreportactivity.a(b1, intent);
    }

    static void a(BugReportActivity bugreportactivity, boolean flag)
    {
        bugreportactivity.b(flag);
    }

    private void a(boolean flag, BugReport bugreport)
    {
        Object obj = j();
        ((Bundle) (obj)).putParcelable("report", bugreport);
        bugreport = new BugReportFragment();
        bugreport.g(((Bundle) (obj)));
        bugreport.a(u);
        obj = f().a();
        ((ad) (obj)).a(com.facebook.i.container, bugreport, "bugReport");
        if (flag)
        {
            ((ad) (obj)).a("bugReport_bs");
        }
        ((ad) (obj)).a();
    }

    private void a(boolean flag, String s1, boolean flag1)
    {
        Object obj = j();
        ((Bundle) (obj)).putString("category_id", s1);
        ((Bundle) (obj)).putBoolean("retry", flag1);
        s1 = new TaskListFragment();
        s1.g(((Bundle) (obj)));
        s1.a(u);
        obj = f().a();
        ((ad) (obj)).a(com.facebook.i.container, s1, "tagList");
        if (flag)
        {
            ((ad) (obj)).a("task_list_bs");
        }
        ((ad) (obj)).a();
    }

    private void a(boolean flag, boolean flag1)
    {
        Object obj = j();
        ((Bundle) (obj)).putBoolean("retry", flag1);
        CategoryListFragment categorylistfragment = new CategoryListFragment();
        categorylistfragment.a(u);
        categorylistfragment.g(((Bundle) (obj)));
        obj = f().a();
        ((ad) (obj)).a(com.facebook.i.container, categorylistfragment, "categoryList");
        if (flag)
        {
            ((ad) (obj)).a(null);
        }
        ((ad) (obj)).a();
    }

    private void b(boolean flag)
    {
        int l = q.a().size();
        if (l > 1)
        {
            a(false, flag);
            return;
        }
        if (l == 1)
        {
            long l1 = ((CategoryInfo)q.a().get(0)).b;
            v.c(String.valueOf(l1));
            if (q.YES.equals(t))
            {
                a(false, v.h(), flag);
                return;
            } else
            {
                a(false, v.o());
                return;
            }
        } else
        {
            finish();
            return;
        }
    }

    private Bundle j()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("reporter_config", q);
        return bundle;
    }

    protected void b(Bundle bundle)
    {
        super.b(bundle);
        Object obj = i();
        s = (m)((t) (obj)).a(com/facebook/bugreporter/m);
        t = (q)((t) (obj)).a(com/facebook/common/w/q, com/facebook/auth/annotations/IsMeUserAnEmployee);
        r = ((t) (obj)).b(java/lang/Boolean, com/facebook/bugreporter/annotations/IsOldVersionOfTheApp);
        w = (g)((t) (obj)).a(com/facebook/ui/i/g);
        setContentView(k.bug_reporter);
        u = new com.facebook.bugreporter.activity.c(this);
        obj = f();
        Object obj1 = (CategoryListFragment)((android.support.v4.app.q) (obj)).a("categoryList");
        if (obj1 != null)
        {
            ((CategoryListFragment) (obj1)).a(u);
        }
        obj1 = (TaskListFragment)((android.support.v4.app.q) (obj)).a("tagList");
        if (obj1 != null)
        {
            ((TaskListFragment) (obj1)).a(u);
        }
        obj1 = (BugReportFragment)((android.support.v4.app.q) (obj)).a("bugReport");
        if (obj1 != null)
        {
            ((BugReportFragment) (obj1)).a(u);
        }
        if (bundle != null)
        {
            obj = (BugReport)bundle.getParcelable("report");
            v = BugReport.newBuilder().a(((BugReport) (obj)));
            q = (ConstBugReporterConfig)bundle.getParcelable("reporter_config");
            return;
        }
        bundle = getIntent();
        boolean flag = bundle.getBooleanExtra("retry", false);
        obj1 = (BugReport)bundle.getParcelableExtra("report");
        if (obj1 == null)
        {
            com.facebook.debug.log.b.d(p, "Missing bug report in intent");
            finish();
            return;
        }
        v = BugReport.newBuilder().a(((BugReport) (obj1)));
        q = (ConstBugReporterConfig)bundle.getParcelableExtra("reporter_config");
        if (!flag && ((Boolean)r.b()).booleanValue())
        {
            (new d(this, null)).a(((android.support.v4.app.q) (obj)), "oldVersionDialog");
            return;
        } else
        {
            b(flag);
            return;
        }
    }

    public void onBackPressed()
    {
        if (!f().e())
        {
            s.a(v.a());
            finish();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("reporter_config", q);
        bundle.putParcelable("report", v.o());
    }

}
