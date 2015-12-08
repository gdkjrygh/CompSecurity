// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks.subtasks;

import com.fitbit.bluetooth.connection.b;

// Referenced classes of package com.fitbit.galileo.tasks.subtasks:
//            GalileoSubTask

class a extends b
{

    final GalileoSubTask a;

    protected void a(boolean flag)
    {
        if (!flag)
        {
            a.a(false);
        }
    }

    (GalileoSubTask galileosubtask)
    {
        a = galileosubtask;
        super();
    }
}
