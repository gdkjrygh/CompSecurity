// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.support.v4.app.Fragment;
import com.fitbit.device.ui.DevicesFragment_;

// Referenced classes of package com.fitbit.home.ui:
//            HomeNavigationItem

static final class s extends HomeNavigationItem
{

    Fragment f()
    {
        return DevicesFragment_.e().t>();
    }

    s(String s, int i, com.fitbit.ui.drawer. , com.fitbit.ui.drawer. 1, int j)
    {
        super(s, i, , 1, j, null);
    }
}
