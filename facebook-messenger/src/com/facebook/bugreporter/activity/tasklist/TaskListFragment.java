// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.tasklist;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.facebook.base.fragment.FbFragment;
import com.facebook.base.fragment.b;
import com.facebook.base.fragment.c;
import com.facebook.bugreporter.ConstBugReporterConfig;
import com.facebook.common.executors.ForUiThread;
import com.facebook.common.w.q;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.ui.i.a;
import com.facebook.ui.i.g;
import com.facebook.widget.listview.EmptyListViewItem;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.bugreporter.activity.tasklist:
//            Task, b, ViewTaskActivity, c, 
//            g, h

public class TaskListFragment extends FbFragment
    implements b
{

    private static final Class a = com/facebook/bugreporter/activity/tasklist/TaskListFragment;
    private List Z;
    private Intent aa;
    private com.facebook.bugreporter.activity.tasklist.c b;
    private com.facebook.bugreporter.activity.tasklist.b c;
    private Executor d;
    private g e;
    private c f;
    private com.facebook.widget.titlebar.a g;
    private ListView h;
    private EmptyListViewItem i;

    public TaskListFragment()
    {
        Z = null;
    }

    static void a(TaskListFragment tasklistfragment, int j)
    {
        tasklistfragment.e(j);
    }

    static void a(TaskListFragment tasklistfragment, es es1, q q1)
    {
        tasklistfragment.a(es1, q1);
    }

    static void a(TaskListFragment tasklistfragment, List list, q q1)
    {
        tasklistfragment.a(list, q1);
    }

    private void a(es es1, q q1)
    {
        et et1 = es.e();
        if (es1 != null && es1.size() > 0)
        {
            et1.b(es1);
            et1.b(new Task("-1", "-1", "No Match", "None of the tasks above match my issue."));
        }
        a(((List) (et1.b())), q1);
    }

    private void a(List list, q q1)
    {
        Z = list;
        if (q1 == q.YES || q1 == q.UNSET && Z.isEmpty())
        {
            if (q1 != q.YES)
            {
                e.a(new a(o.bug_report_tasks_not_found));
            }
            aa.putExtra("task_number", -1);
            aa.putExtra("remove_fragment", Z.isEmpty());
            if (f != null)
            {
                f.a(this, aa);
            }
            return;
        } else
        {
            i.a(false);
            i.setVisibility(8);
            c.a(Z);
            g.setTitle(o.bug_report_task_list_title);
            return;
        }
    }

    private void e(int j)
    {
        Task task = c.a(j);
        j = Integer.parseInt(task.b);
        aa.putExtra("task_number", j);
        aa.putExtra("task_desc", task.d);
        aa.putExtra("task_id", Long.parseLong(task.a));
        if (j == -1)
        {
            if (f != null)
            {
                f.a(this, aa);
            }
            return;
        } else
        {
            Intent intent = new Intent(n(), com/facebook/bugreporter/activity/tasklist/ViewTaskActivity);
            intent.putExtra("task", task);
            a(intent, 1005);
            return;
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(k.task_list_view, viewgroup, false);
    }

    public void a(int j, int l, Intent intent)
    {
        j;
        JVM INSTR tableswitch 1005 1005: default 20
    //                   1005 46;
           goto _L1 _L2
_L1:
        com.facebook.debug.log.b.d(a, (new StringBuilder()).append("unexpected request code").append(j).toString());
_L4:
        return;
_L2:
        switch (l)
        {
        default:
            com.facebook.common.e.b.a("Task List Activity", (new StringBuilder()).append("unexpected result code from View Task: ").append(l).toString());
            return;

        case 0: // '\0'
            continue; /* Loop/switch isn't completed */

        case -1: 
            break;
        }
        if (f == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        f.a(this, aa);
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(c c1)
    {
        f = c1;
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        Object obj = S();
        b = (com.facebook.bugreporter.activity.tasklist.c)((t) (obj)).a(com/facebook/bugreporter/activity/tasklist/c);
        c = (com.facebook.bugreporter.activity.tasklist.b)((t) (obj)).a(com/facebook/bugreporter/activity/tasklist/b);
        d = (Executor)((t) (obj)).a(java/util/concurrent/Executor, com/facebook/common/executors/ForUiThread);
        e = (g)((t) (obj)).a(com/facebook/ui/i/g);
        aa = new Intent();
        h = (ListView)d(0x102000a);
        i = (EmptyListViewItem)d(i.empty_item);
        h.setAdapter(c);
        com.facebook.widget.titlebar.c.a(z());
        g = (com.facebook.widget.titlebar.a)d(i.titlebar);
        g.setTitle("Loading...");
        i.setVisibility(0);
        i.a(true);
        i.setMessage("Loading...");
        h.setOnItemClickListener(new com.facebook.bugreporter.activity.tasklist.g(this));
        if (bundle != null)
        {
            Z = bundle.getParcelableArrayList("saved_tasks");
            if (Z != null)
            {
                a(Z, q.NO);
                return;
            }
        }
        obj = k();
        String s;
        if (((Bundle) (obj)).getBoolean("retry", false))
        {
            bundle = q.YES;
        } else
        {
            bundle = q.UNSET;
        }
        s = ((Bundle) (obj)).getString("category_id");
        obj = (ConstBugReporterConfig)((Bundle) (obj)).getParcelable("reporter_config");
        com.google.common.d.a.i.a(b.a(s, ((com.facebook.bugreporter.l) (obj))), new h(this, bundle), d);
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        if (Z != null)
        {
            bundle.putParcelableArrayList("saved_tasks", new ArrayList(Z));
        }
    }

}
