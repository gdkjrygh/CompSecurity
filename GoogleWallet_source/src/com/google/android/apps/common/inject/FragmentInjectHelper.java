// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.inject;

import android.support.v4.app.Fragment;

// Referenced classes of package com.google.android.apps.common.inject:
//            DaggerActivity

public class FragmentInjectHelper
{

    public FragmentInjectHelper()
    {
    }

    public static void inject(Fragment fragment)
    {
        try
        {
            ((DaggerActivity)fragment.getActivity()).inject(fragment);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            throw new RuntimeException("Fragment's activity must implement DaggerActivity!", fragment);
        }
    }
}
