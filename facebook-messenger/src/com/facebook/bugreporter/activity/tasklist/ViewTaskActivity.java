// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.tasklist;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.facebook.base.activity.i;
import com.facebook.h;
import com.facebook.k;

// Referenced classes of package com.facebook.bugreporter.activity.tasklist:
//            Task, p, q

public class ViewTaskActivity extends i
{

    private static final Class p = com/facebook/bugreporter/activity/tasklist/ViewTaskActivity;

    public ViewTaskActivity()
    {
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        requestWindowFeature(3);
        setFeatureDrawableResource(3, h.view_task_icon);
        setContentView(k.task_view);
        setTitleColor(getResources().getColor(0x106000c));
        bundle = (TextView)b(com.facebook.i.taskview);
        Task task = (Task)getIntent().getParcelableExtra("task");
        String s = (new StringBuilder()).append(task.c).append("\n\n").toString();
        s = (new StringBuilder()).append(s).append("Task Number: ").append(task.b).append("\n\n").toString();
        bundle.setText((new StringBuilder()).append(s).append("Description \n").append(task.d).toString());
        findViewById(com.facebook.i.btn_back).setOnClickListener(new p(this));
        findViewById(com.facebook.i.btn_yes).setOnClickListener(new q(this));
    }

}
