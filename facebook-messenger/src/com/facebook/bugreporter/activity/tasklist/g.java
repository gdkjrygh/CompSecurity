// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.tasklist;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.facebook.bugreporter.activity.tasklist:
//            TaskListFragment

class g
    implements android.widget.AdapterView.OnItemClickListener
{

    final TaskListFragment a;

    g(TaskListFragment tasklistfragment)
    {
        a = tasklistfragment;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        TaskListFragment.a(a, i);
    }
}
