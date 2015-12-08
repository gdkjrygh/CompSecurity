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
//            br, BaseShareActivity

final class bx
    implements android.view.View.OnClickListener
{

    final br a;

    bx(br br1)
    {
        a = br1;
        super();
    }

    public final void onClick(View view)
    {
        br.c(a);
        b.a("SNS", "click", "share/openhashtags");
        af.b(br.c(a), "SNS", "click", "share/openhashtags", Long.valueOf(1L));
        view = (InputMethodManager)br.c(a).getSystemService("input_method");
        if (view != null)
        {
            view.hideSoftInputFromWindow(br.f(a).getWindowToken(), 0);
        }
        int i = a.a.getHeight();
        if (br.g(a) == -1)
        {
            i -= br.c(a).i();
            view = new int[2];
            a.b.getLocationOnScreen(view);
            com.roidapp.photogrid.cloud.br.b(a, (br.c(a).getResources().getDisplayMetrics().heightPixels - view[1]) + i);
        } else
        {
            i = 0;
        }
        br.h(a).setVisibility(0);
        br.c(a).a(i);
        br.c(a).b(br.g(a));
    }
}
