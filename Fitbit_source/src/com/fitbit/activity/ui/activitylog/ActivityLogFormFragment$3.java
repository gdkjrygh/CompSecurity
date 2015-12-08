// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.activitylog;

import android.content.Context;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.util.bf;
import java.util.UUID;

// Referenced classes of package com.fitbit.activity.ui.activitylog:
//            ActivityLogFormFragment

class a extends bf
{

    final UUID a;
    final ActivityLogFormFragment b;

    protected ActivityLogEntry a()
    {
        return ActivityBusinessLogic.a().a(a);
    }

    protected Object f_()
    {
        return a();
    }

    (ActivityLogFormFragment activitylogformfragment, Context context, UUID uuid)
    {
        b = activitylogformfragment;
        a = uuid;
        super(context);
    }
}
