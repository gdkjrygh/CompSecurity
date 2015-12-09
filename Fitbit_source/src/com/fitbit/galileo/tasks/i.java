// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks;

import com.fitbit.galileo.tasks.subtasks.b.b;
import com.fitbit.galileo.tasks.subtasks.c;
import com.fitbit.galileo.tasks.subtasks.e;
import com.fitbit.galileo.tasks.subtasks.g;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.galileo.tasks:
//            GalileoCompoundTask

public class i extends GalileoCompoundTask
{

    private static final String a = "DisconnectTrackerTask";

    public i()
    {
    }

    protected GalileoCompoundTask.SubTaskQueueAction a(GalileoCompoundTask.SubTaskGroup subtaskgroup, int j)
    {
        return GalileoCompoundTask.SubTaskQueueAction.a;
    }

    protected List a()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new c());
        arraylist.add(new e());
        arraylist.add(new b());
        arraylist.add(new g());
        return arraylist;
    }

    protected void b()
    {
    }

    protected String c()
    {
        return "DisconnectTrackerTask";
    }

    protected List f()
    {
        return null;
    }

    protected List g()
    {
        return null;
    }
}
