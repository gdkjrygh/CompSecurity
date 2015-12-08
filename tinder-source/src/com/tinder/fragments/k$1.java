// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.res.Resources;
import android.view.View;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.fragments:
//            k

final class a
    implements Runnable
{

    final View a;
    final k b;

    public final void run()
    {
        if (!b.isAdded() || b.getActivity() == null)
        {
            v.b("Not changing logout button since we are not attached to an activity.");
            return;
        } else
        {
            android.widget.arLayout.LayoutParams layoutparams = (android.widget.arLayout.LayoutParams)a.getLayoutParams();
            layoutparams.topMargin = b.getResources().getDimensionPixelSize(0x7f090110);
            a.setLayoutParams(layoutparams);
            return;
        }
    }

    rces(k k1, View view)
    {
        b = k1;
        a = view;
        super();
    }
}
