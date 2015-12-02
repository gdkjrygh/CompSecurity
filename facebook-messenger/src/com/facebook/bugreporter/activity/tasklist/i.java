// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.tasklist;

import android.content.Context;
import android.widget.TextView;
import com.facebook.common.w.n;
import com.facebook.k;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.bugreporter.activity.tasklist:
//            Task

public class i extends f
{

    private final TextView a;
    private final TextView b;
    private Task c;

    public i(Context context)
    {
        super(context);
        setContentView(k.task_list_row_view);
        a = (TextView)getView(com.facebook.i.task_name);
        b = (TextView)getView(com.facebook.i.task_description);
    }

    public void setTask(Task task)
    {
        c = task;
        a.setText(task.c);
        if (n.c(task.d))
        {
            b.setVisibility(8);
            return;
        }
        b.setVisibility(0);
        if (task.b == "-1")
        {
            b.setText(task.d);
            return;
        } else
        {
            task = (new StringBuilder()).append("#").append(task.b).append(": ").append(task.d).toString();
            b.setText(task);
            return;
        }
    }
}
