// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid.release:
//            dc

final class dd
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final dc a;

    dd(dc dc1)
    {
        a = dc1;
        super();
    }

    public final void onGlobalLayout()
    {
        if (!a.isAdded())
        {
            return;
        }
        dc.a(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (az.q == 0)
        {
            SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(a.getActivity());
            if (sharedpreferences.getBoolean("SHOW_NEW_GRID", false))
            {
                sharedpreferences.edit().putBoolean("SHOW_NEW_GRID", false).apply();
                dc.b(a);
                return;
            }
        }
        dc.a(dc.c(a));
    }
}
