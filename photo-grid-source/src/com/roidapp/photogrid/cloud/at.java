// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.roidapp.baselib.c.b;
import com.roidapp.photogrid.common.af;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            PGShareActivity

final class at
    implements android.view.View.OnClickListener
{

    final PGShareActivity a;

    at(PGShareActivity pgshareactivity)
    {
        a = pgshareactivity;
        super();
    }

    public final void onClick(View view)
    {
        b.a("SNS", "click", "share/openhashtags");
        af.b(a, "SNS", "click", "share/openhashtags", Long.valueOf(1L));
        view = (InputMethodManager)a.getSystemService("input_method");
        if (view != null)
        {
            view.hideSoftInputFromWindow(PGShareActivity.f(a).getWindowToken(), 0);
        }
        if (a.d())
        {
            view = new int[2];
            PGShareActivity.g(a).getLocationOnScreen(view);
            com.roidapp.photogrid.cloud.PGShareActivity.b(a, a.getResources().getDisplayMetrics().heightPixels - view[1]);
        } else
        {
            view = new int[2];
            PGShareActivity.a(a).getLocationOnScreen(view);
            int i = com.roidapp.photogrid.cloud.PGShareActivity.b(a).getHeight();
            com.roidapp.photogrid.cloud.PGShareActivity.b(a, (a.getResources().getDisplayMetrics().heightPixels - view[1]) + i);
        }
        PGShareActivity.h(a).setVisibility(0);
        a.p_();
        a.a(PGShareActivity.i(a));
    }
}
