// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.sdkutils;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.kik.g.i;

// Referenced classes of package com.kik.sdkutils:
//            c

final class b extends i
{

    final Fragment a;
    final i b;

    b(Fragment fragment, i j)
    {
        a = fragment;
        b = j;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = a.getActivity();
        if (fragmentactivity == null)
        {
            return;
        } else
        {
            fragmentactivity.runOnUiThread(new c(this, obj, obj1));
            return;
        }
    }
}
