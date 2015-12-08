// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks.subtasks;


// Referenced classes of package com.fitbit.galileo.tasks.subtasks:
//            GalileoSubTask

class a
    implements Runnable
{

    final boolean a;
    final GalileoSubTask b;

    public void run()
    {
        GalileoSubTask.a(b, a);
    }

    (GalileoSubTask galileosubtask, boolean flag)
    {
        b = galileosubtask;
        a = flag;
        super();
    }
}
