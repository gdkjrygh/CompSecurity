// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.support.v4.app.Fragment;
import com.fitbit.challenges.ui.ChallengesFragment_;

// Referenced classes of package com.fitbit.home.ui:
//            HomeNavigationItem

static final class s extends HomeNavigationItem
{

    Fragment f()
    {
        return ChallengesFragment_.e().a();
    }

    s(String s, int i, com.fitbit.ui.drawer.t_.a a, com.fitbit.ui.drawer.t_.a a1, int j)
    {
        super(s, i, a, a1, j, null);
    }
}
