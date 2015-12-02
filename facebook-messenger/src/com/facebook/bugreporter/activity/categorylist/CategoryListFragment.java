// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.categorylist;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.facebook.auth.annotations.IsMeUserAnEmployee;
import com.facebook.base.fragment.FbFragment;
import com.facebook.base.fragment.b;
import com.facebook.base.fragment.c;
import com.facebook.bugreporter.ConstBugReporterConfig;
import com.facebook.common.w.q;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.widget.titlebar.a;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Iterator;

// Referenced classes of package com.facebook.bugreporter.activity.categorylist:
//            b, CategoryInfo, c

public class CategoryListFragment extends FbFragment
    implements b
{

    private static final Class a = com/facebook/bugreporter/activity/categorylist/CategoryListFragment;
    private com.facebook.bugreporter.activity.categorylist.b b;
    private c c;
    private a d;
    private ListView e;

    public CategoryListFragment()
    {
    }

    static void a(CategoryListFragment categorylistfragment, int j)
    {
        categorylistfragment.e(j);
    }

    private void e(int j)
    {
        if (c != null)
        {
            Intent intent = new Intent();
            CategoryInfo categoryinfo = b.a(j);
            if (categoryinfo != null)
            {
                intent.putExtra("category_id", String.valueOf(categoryinfo.b));
            }
            c.a(this, intent);
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(k.category_list_view, viewgroup, false);
    }

    public void a(c c1)
    {
        c = c1;
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        bundle = S();
        b = (com.facebook.bugreporter.activity.categorylist.b)bundle.a(com/facebook/bugreporter/activity/categorylist/b);
        bundle = (q)bundle.a(com/facebook/common/w/q, com/facebook/auth/annotations/IsMeUserAnEmployee);
        Object obj = (ConstBugReporterConfig)k().getParcelable("reporter_config");
        et et1 = es.e();
        obj = ((ConstBugReporterConfig) (obj)).a().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            CategoryInfo categoryinfo = (CategoryInfo)((Iterator) (obj)).next();
            if (q.NO != bundle || categoryinfo.c)
            {
                et1.b(categoryinfo);
            }
        } while (true);
        b.a(et1.b());
        e = (ListView)d(0x102000a);
        e.setAdapter(b);
        com.facebook.widget.titlebar.c.a(z());
        d = (a)d(i.titlebar);
        d.setTitle(o.bug_report_category_list_title);
        e.setOnItemClickListener(new com.facebook.bugreporter.activity.categorylist.c(this));
        if (k().getBoolean("retry", false))
        {
            bundle = new Intent();
            bundle.putExtra("retry", true);
            c.a(this, bundle);
        }
    }

}
