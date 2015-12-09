// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import com.fitbit.data.bl.dg;
import com.fitbit.home.ui.g;

// Referenced classes of package com.fitbit.device.ui.setup:
//            AbstractChooseTrackerActivity

public class a extends g
{

    private static final int b = 1214;
    final AbstractChooseTrackerActivity a;

    public void a()
    {
        super.a();
        a.getSupportLoaderManager().restartLoader(0, null, a);
        dg.d().c(AbstractChooseTrackerActivity.b(a));
    }

    public void a(Exception exception)
    {
        super.a(exception);
        AbstractChooseTrackerActivity.a(a, exception);
        dg.d().c(AbstractChooseTrackerActivity.b(a));
    }

    public (AbstractChooseTrackerActivity abstractchoosetrackeractivity, FragmentActivity fragmentactivity)
    {
        a = abstractchoosetrackeractivity;
        super(fragmentactivity, 1214);
    }
}
