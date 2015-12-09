// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.activitylog;

import android.content.Context;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.util.bf;

// Referenced classes of package com.fitbit.activity.ui.activitylog:
//            LogNewExerciseFragment

private static class a extends bf
{

    private final ActivityLogEntry a;

    protected ActivityLogEntry a()
    {
        ActivityBusinessLogic.a().a(a, getContext());
        return a;
    }

    protected Object f_()
    {
        return a();
    }

    public A(Context context, ActivityLogEntry activitylogentry)
    {
        super(context);
        a = activitylogentry;
    }
}
