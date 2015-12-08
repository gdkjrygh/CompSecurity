// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.device.ui.setup.choose.ConfirmDeviceActivity;
import com.fitbit.savedstate.k;
import com.fitbit.util.SimpleConfirmDialogFragment;

// Referenced classes of package com.fitbit.home.ui:
//            HomeActivity

class a
    implements com.fitbit.util.alogFragment.a
{

    final TrackerType a;
    final HomeActivity b;

    public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        ConfirmDeviceActivity.a(b, 2011, a);
    }

    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        k.l();
    }

    public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        k.m();
    }

    kerType(HomeActivity homeactivity, TrackerType trackertype)
    {
        b = homeactivity;
        a = trackertype;
        super();
    }
}
