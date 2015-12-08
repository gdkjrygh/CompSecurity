// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks.subtasks.b;

import com.fitbit.bluetooth.connection.c;
import com.fitbit.galileo.tasks.subtasks.GalileoSubTask;

public class a extends GalileoSubTask
{

    private static final String a = "DisableLiveDataListenerSubTask";

    public a()
    {
    }

    protected void b()
    {
        com.fitbit.bluetooth.connection.c.n();
        a(true);
    }

    protected void c()
    {
    }

    protected void d()
    {
        com.fitbit.bluetooth.connection.c.p();
    }

    public String e()
    {
        return "DisableLiveDataListenerSubTask";
    }
}
